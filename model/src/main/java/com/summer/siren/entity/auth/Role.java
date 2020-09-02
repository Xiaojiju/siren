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
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/4/29 16:13
  * @desc 角色
  */
@Getter
@Setter
@TableName("t_role")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Role extends BaseModel<Role> {

    private static final long serialVersionUID = 1335528682325167L;

    @JsonProperty("role_id")
    @TableId(value = "role_id",type = IdType.AUTO)
    private Long roleId;

    @TableField("role_name")
    @JsonProperty("role_name")
    private String roleName;

    @TableField("description")
    private String description;

    private Integer status;

    @TableField(exist = false)
    private Integer customSet;
}
