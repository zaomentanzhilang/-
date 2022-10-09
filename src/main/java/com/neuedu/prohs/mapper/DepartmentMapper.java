package com.neuedu.prohs.mapper;

import com.neuedu.prohs.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department")
    List<Department> getDepartment();


}
