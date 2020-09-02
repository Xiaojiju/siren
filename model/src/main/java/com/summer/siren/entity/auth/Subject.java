package com.summer.siren.entity.auth;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.summer.siren.BaseModel;
import com.summer.siren.enums.AccessAlive;
import com.summer.siren.enums.Sex;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Subject extends BaseModel<Subject> {

    @TableId(type = IdType.AUTO, value = "realm_user_id")
    private Long realmUserId;

    @TableField("sub_nickname")
    private String nickname;

    @TableField("sub_avatar")
    private String avatar;

    @TableField("sub_sex")
    private Sex sex;

    @TableField("sub_birth")
    private LocalDate birth;

    @TableField("sub_self_desc")
    private String selfDesc;

    @TableField("user_position_id")
    private Position position;

    @TableField("user_department_id")
    private Department department;

    @TableField("keep_alive")
    private AccessAlive accessAlive;

    @TableField("create_by")
    private Long createBy;
}
