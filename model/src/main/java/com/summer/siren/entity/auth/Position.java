package com.summer.siren.entity.auth;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.summer.siren.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/4/29 17:24
  * @desc 职位
  */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@TableName("t_position")
public class Position extends BaseModel<Position> {

    private static final long serialVersionUID = -325737469009530920L;
    /**
     * 职位Id
     */
    @TableId(value = "position_id",type = IdType.AUTO)
    private Long positionId;
    /**
     * 职位名称
     */
    @TableField("position_name")
    private String positionName;
    /**
     * 上级职位
     */
    @TableField("parent_position_id")
    private Long parentPositionId;
    /**
     * 描述
     */
    @TableField("description")
    private String description;
    /**
     * 部门Id
     */
    @TableField("department_id")
    private Long departmentId;

    @TableField("current_status")
    private Integer currentStatus;

    private Integer subjectTotal;
}
