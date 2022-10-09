package com.neuedu.prohs.mapper;

import com.neuedu.prohs.pojo.SettleCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SettleCategoryMapper {
    @Select("select * from settle_category")
    List<SettleCategory> getSettleCategoryList();
}
