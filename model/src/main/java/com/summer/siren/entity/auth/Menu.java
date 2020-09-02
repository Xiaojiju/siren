package com.summer.siren.entity.auth;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.summer.siren.BaseModel;
import com.summer.siren.enums.ComponentType;
import lombok.Getter;
import lombok.Setter;

/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/4/29 16:13
  * @desc 菜单
  */
@Getter
@Setter
@TableName("t_menu")
public class Menu extends BaseModel<Menu> {

    private static final long serialVersionUID = 8087099776176698770L;
    /**
     * 菜单Id
     */
    @TableId(value = "menu_id",type = IdType.AUTO)
    private Long menuId;
    /**
     * 上级菜单
     */
    @TableField("parent_menu_id")
    private Long parentMenuId;
    /**
     * 菜单名
     */
    @TableField("menu_name")
    private String menuName;
    /**
     * 对应vue路由
     */
    @TableField("path")
    private String path;
    /**
     * vue组件名
     */
    @TableField("component")
    private String component;
    /**
     * 需要权限，每个职位有不同的权限对于同一组件
     */
    @TableField("permission")
    private String permission;
    /**
     * 图标
     */
    @TableField("icon")
    private String icon;
    /**
     * 组件级别
     */
    @TableField("component_type")
    private ComponentType componentType;
    /**
     * 同级组件的优先排序等级
     */
    @TableField("order_num")
    private Integer orderNum;

    private Integer keepAlive;
}
