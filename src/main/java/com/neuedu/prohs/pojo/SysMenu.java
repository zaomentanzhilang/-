package com.neuedu.prohs.pojo;


import java.util.List;

public class SysMenu {

    private int menuId;
    private String menuName;
    private int parentId;
    private String url;
    private String visible;
    private String remark;


    public void setChildSMenu(List<SysMenu> childSMenu) {
        ChildSMenu = childSMenu;
    }

    private List<SysMenu> ChildSMenu;

    public List<SysMenu> getChildMenu() {
        return ChildSMenu;
    }

    public void setChildMenu(List<SysMenu> childMenu) {
        ChildSMenu = childMenu;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }


    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }


    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
