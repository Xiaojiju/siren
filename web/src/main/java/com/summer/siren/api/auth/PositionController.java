package com.summer.siren.api.auth;

import com.summer.siren.api.IPositionService;
import com.summer.siren.anotations.VersionMaker;
import com.summer.siren.api.BaseController;
import com.summer.siren.bo.PositionGroup;
import com.summer.siren.enums.Structure;
import com.summer.siren.response.WebResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PositionController extends BaseController {

    private final IPositionService iPositionService;

    public PositionController(IPositionService iPositionService) {
        this.iPositionService = iPositionService;
    }

    /**
     * 获取所有职位
     */
    @GetMapping("{version}/positions")
    @VersionMaker
    public WebResponse<List<PositionGroup>> getPositions(Structure structure) {
        return new WebResponse<>(iPositionService.getAll(structure));
    }

    /**
     * 添加
     * 1. 不能有多个最高级别的职位
     * 2. 必须拥有部门
     * 3. 初始职位只有最基础的权限，需要后续进行设定
     * 4. 仅有权限添加的人才能添加
     */
    @PostMapping("{version}/positions")
    @VersionMaker
    public WebResponse<Integer> insertPosition() {
        return null;
    }

    /**
     * 修改
     * 1. 不能有多个最高级别的职位
     * 2. 必须拥有部门
     * 3. 仅有权限修改的人的才能修改，或职位部门下leader进行修改，发送流程给有权限修改的人进行确定；
     */
    @PutMapping("{version}/positions")
    @VersionMaker
    public WebResponse<Integer> updatePosition() {
        return null;
    }

    /**
     * 1. 职位下还有人，不能进行删除
     * 2. 仅限最高权限才能进行删除，或发送流程给最高权限的人
     * 3. 假删除
     * 4. 
     */
    @DeleteMapping("{version}/positions")
    @VersionMaker
    public WebResponse<Integer> deletePosition() {
        return null;
    }
}
