package com.summer.siren.entity.auth;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/7/1 22:13
  * @desc
  */
@Getter
@Setter
@TableName("t_position_role_relation")
public class PositionRoleRelation extends Model<PositionRoleRelation> {

    @TableId(value = "position_role_relation_id", type = IdType.AUTO)
    private Long positionRoleId;

    @TableField("position_id")
    private Long positionId;

    @TableField("role_id")
    private Long roleId;
}
