package com.summer.siren.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.summer.siren.bo.PositionGroup;
import com.summer.siren.entity.auth.Position;
import com.summer.siren.enums.Structure;

import java.util.List;

public interface IPositionService extends IService<Position> {
    /**
     * 查询所有
     * @return 职位集合
     */
    List<PositionGroup> getAll(Structure structure);

    int savePosition(Position position);
}
