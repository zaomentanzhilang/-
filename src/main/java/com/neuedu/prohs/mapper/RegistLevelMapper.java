package com.neuedu.prohs.mapper;

import com.neuedu.prohs.pojo.RegistLevel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RegistLevelMapper {
    @Select("select * from Regist_Level")
    List<RegistLevel> getRegistLevelList();
}
