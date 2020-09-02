package com.summer.siren.entity.auth;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.summer.siren.BaseModel;
import com.summer.siren.enums.IdentifyType;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@TableName("login_log")
public class LoginLog extends BaseModel<LoginLog> {

    @TableId(value = "log_id", type = IdType.AUTO)
    private Long logId;
    private String ipAddr;
    private String loginAddr;
    private IdentifyType identifyType;
    private Long realmUserId;
}
