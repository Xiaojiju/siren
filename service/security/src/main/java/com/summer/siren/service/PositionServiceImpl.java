package com.summer.siren.service;

import com.summer.siren.api.IPositionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summer.siren.bo.PositionGroup;
import com.summer.siren.entity.auth.Position;
import com.summer.siren.enums.Structure;
import com.summer.siren.mapper.auth.PositionMapper;
import com.summer.siren.mapper.dto.PositionDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

    @Override
    public List<PositionGroup> getAll(Structure structure) {
        List<PositionDto> positions = this.baseMapper.findPositionList();
        if (Objects.isNull(positions) || positions.isEmpty()) {
            return null;
        }
        return buildHelper(structure, positions);
    }

    @Override
    public int savePosition(Position position) {
        return 0;
    }

    /**
     * 根据不同条件构建
     * @param structure 结构
     * @param positions 职位集合
     * @return 职位树
     */
    private List<PositionGroup> buildHelper(Structure structure, List<PositionDto> positions) {
        List<PositionGroup> list = new ArrayList<>();
        if (structure != Structure.DEFAULT && structure != null) {
            PositionGroup positionGroup = PositionGroup.init();
            for (PositionDto positionDto : positions) {
                if (positionDto.getParentPositionId() == null) {
                    BeanUtils.copyProperties(positionDto, positionGroup);
                    break;
                }
            }
            if (structure == Structure.TREE) {
                buildTree(positionGroup, positions, positionGroup.getPositionId(), positions.size());
                list.add(positionGroup);
                return list;
            } else if (structure == Structure.NORMAL) {
                List<PositionGroup> positionGroups = new ArrayList<>();
                buildNormal(positionGroups, positions);
                return positionGroups;
            }
        } else {
            for (PositionDto positionDto : positions) {
                PositionGroup positionGroup = PositionGroup.init();
                BeanUtils.copyProperties(positionDto, positionGroup);
                list.add(positionGroup);
            }
            return list;
        }
        return new ArrayList<>();
    }

    /**
     * 递归构建职位树， 可以使用hashmap实现
     * @param root 根节点
     * @param positions 职位集
     * @param target 上级职位节点
     * @param count 总数
     */
    private void buildTree(PositionGroup root, List<PositionDto> positions, Long target, int count) {
        if (count <= 1) {
            return ;
        }
        List<PositionGroup> positionGroups = root.getPositionGroups();
        for (int i = 0; i < positions.size(); i++) {
            PositionDto positionDto = positions.get(i);
            if (positionDto.getParentPositionId() != null && positionDto.getParentPositionId().equals(target)) {
                PositionGroup cur = new PositionGroup();
                BeanUtils.copyProperties(positionDto, cur);
                positionGroups.add(cur);
                buildTree(cur, positions, cur.getPositionId(), count - 1);
            }
        }
        root.setPositionGroups(positionGroups);
    }

    private void buildNormal(List<PositionGroup> positionGroups, List<PositionDto> positions) {
        Map<String, Integer> map = new HashMap<>();
        int index = 0;
        for (PositionDto positionDto : positions) {
            if (!map.containsKey(positionDto.getDepartmentName())) {
                PositionGroup newDepartment = PositionGroup.init();
                map.put(positionDto.getDepartmentName(), index);
                newDepartment.setDepartmentId(positionDto.getDepartmentId());
                newDepartment.setDepartmentName(positionDto.getDepartmentName());
                positionGroups.add(newDepartment);
                index++;
            }
            PositionGroup currentPosition = PositionGroup.init();
            int current = map.get(positionDto.getDepartmentName());
            PositionGroup child = positionGroups.get(current);
            List<PositionGroup> positionGroupList = child.getPositionGroups();
            BeanUtils.copyProperties(positionDto, currentPosition);
            positionGroupList.add(currentPosition);
            child.setPositionGroups(positionGroupList);
            positionGroups.set(current, child);
        }
    }
}
