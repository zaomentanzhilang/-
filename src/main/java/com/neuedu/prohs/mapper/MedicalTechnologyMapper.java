package com.neuedu.prohs.mapper;

import com.neuedu.prohs.pojo.MedicalTechnology;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
@CacheNamespace
public interface MedicalTechnologyMapper {
    @Select("<script>" +
            "select * from medical_technology <where>" +
            "<if test=\"techName!=null and techName!=''\"> and tech_name like concat('%',#{techName},'%')</if>" +
            "<if test=\"techCode!=null and techCode!=''\"> and tech_code like concat('%',#{techCode},'%')</if>" +
            "</where>" +
            "</script>")
    List<MedicalTechnology> getMedTech(@Param("techName") String techName, @Param("techCode") String techCode);
}
