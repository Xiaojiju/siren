package com.summer.siren.mapper.auth;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.summer.siren.entity.auth.Position;
import com.summer.siren.mapper.dto.PositionDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PositionMapper extends BaseMapper<Position> {

    /**
     * 查询所有职位，包含职位下人数，所属部门
     * @return 职位
     */
    List<PositionDto> findPositionList();
}
