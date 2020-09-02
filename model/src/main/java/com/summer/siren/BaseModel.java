package com.summer.siren;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseModel<T> extends Model<BaseModel<T>> {

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @TableField("current_version")
    private LocalDateTime version;
}
