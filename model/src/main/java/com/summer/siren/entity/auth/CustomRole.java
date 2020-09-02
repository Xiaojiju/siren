package com.summer.siren.entity.auth;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/7/1 22:09
  * @desc 用户额外被添加的角色
  */
@TableName("t_custom_role")
public class CustomRole extends Model<CustomRole> {

    @TableId(value = "custom_role_id", type = IdType.AUTO)
    private Long customRoleId;

    @TableField("player_id")
    private Long playerId;

    @TableField("role_id")
    private Long roleId;

    @TableField("cur_status")
    private Integer curStatus;
}
