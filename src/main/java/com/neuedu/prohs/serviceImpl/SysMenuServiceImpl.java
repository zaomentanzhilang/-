package com.neuedu.prohs.serviceImpl;

import com.neuedu.prohs.mapper.SysMenuMapper;
import com.neuedu.prohs.pojo.SysMenu;
import com.neuedu.prohs.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> getSysMenuList(int roleId) {
        return sysMenuMapper.getSysMenuList(roleId);
    }

}
