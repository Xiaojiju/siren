package com.summer.siren.entity.auth;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.summer.siren.enums.IdentifyType;
import com.summer.siren.enums.Verifiable;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@TableName("t_realm_authentication")
public class RealmAuthentication extends Model<RealmAuthentication> {
    /**
     * 主键
     */
    @TableId(value = "auth_id", type = IdType.AUTO)
    private Long authId;
    /**
     * 验证方式
     */
    @TableField("realm_identify_type")
    private IdentifyType identifyType;
    /**
     * 唯一标识
     */
    @TableField("realm_unique")
    private String realmUnique;
    /**
     * 秘钥
     */
    @TableField("realm_open_id")
    private String realmOpenId;
    /**
     * 当前验证方式可用
     */
    @TableField("realm_verifiable")
    private Verifiable verifiable;
    /**
     * 用户id
     */
    @TableField("realm_user_id")
    private Long realmUserId;
}
