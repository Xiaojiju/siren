package com.summer.siren.entity.auth;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.summer.siren.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
  *@date 2020/7/14 23:46
  *@author moyang
  *
  **/
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@TableName("t_department")
public class Department extends BaseModel<Department> {

    private static final long serialVersionUID = 67855967722134811L;

    /**
     * id
     */
    @TableId(value = "department_id",type = IdType.AUTO)
    @JsonProperty("department_id")
    private Long departmentId;
    /**
     * 部门
     */
    @TableField("department_name")
    @JsonProperty("department_name")
    private String departmentName;
    /**
     * 部门职能描述
     */
    @TableField("description")
    private String description;
    /**
     * 上级部门
     */
    @TableField("parent_department_id")
    private Long parentDepartmentId;
    /**
     * 同级部门优先排序等级
     */
    @TableField("order_num")
    private Integer orderNum;

    /**
     * 部门状态
     */
    private Integer status;

    @TableField(exist = false)
    private Integer positionCount;

    @TableField(exist = false)
    private Integer playerCount;
}
