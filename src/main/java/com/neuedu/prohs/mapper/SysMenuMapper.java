package com.neuedu.prohs.mapper;

import com.neuedu.prohs.pojo.SysMenu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SysMenuMapper {
    @Results({
            @Result(id = true, column = "menu_id", property = "menuId"),
            @Result(column = "menu_id", property = "childMenu", many = @Many(select = "getChildSysMenuList"))

    })
    @Select("select * from sys_menu where menu_id in (" +
            "select menu_id from sys_role_menu where role_id=#{roleId}" +
            ")")
    List<SysMenu> getSysMenuList(int roleId);

    @Select("select * from sys_menu where parent_id=#{pid}")
    List<SysMenu> getChildSysMenuList(int pid);
}
