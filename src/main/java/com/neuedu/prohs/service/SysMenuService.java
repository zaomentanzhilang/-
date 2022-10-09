package com.neuedu.prohs.service;

import com.neuedu.prohs.pojo.SysMenu;

import java.util.List;


public interface SysMenuService {


    List<SysMenu> getSysMenuList(int roleId);


}
