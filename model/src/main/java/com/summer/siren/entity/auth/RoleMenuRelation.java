package com.summer.siren.entity.auth;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/7/1 22:16
  * @desc
  */
@TableName("t_role_menu_relation")
public class RoleMenuRelation extends Model<RoleMenuRelation> {

    @TableId(value = "t_role_menu_relation_id", type = IdType.AUTO)
    private Long roleMenuId;

    @TableField("role_id")
    private Long roleId;

    @TableField("menu_id")
    private Long menuId;
}
