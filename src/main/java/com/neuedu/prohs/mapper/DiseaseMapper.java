package com.neuedu.prohs.mapper;

import com.neuedu.prohs.pojo.Disease;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
@CacheNamespace
public interface DiseaseMapper {
    @Select("<script>" +
            "select * from disease <where>" +
            "<if test=\"dname!=null and dname!=''\"> and disease_name like concat('%',#{dname},'%')</if>" +
            "<if test=\"dc!=null and dc!=''\"> and disease_code like concat('%',#{dc},'%')</if>" +
            "<if test=\"icd!=null and icd!=''\"> and diseaseICD like concat('%',#{icd},'%')</if>" +
            "</where>" +
            "</script>")
    List<Disease> getDiseaseList(@Param("dname") String dname, @Param("dc") String dc, @Param("icd") String icd);
}
