package com.neuedu.prohs.mapper;

import com.neuedu.prohs.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where realname=#{ename} and password=#{pwd}")
    Employee getEmpInfo(@Param("ename") String ename, @Param("pwd") String pwd);

    @Select("select * from employee")
    List<Employee> getEmpInfoList();

    @Select("select * from employee where deptment_id=#{deptmentId} and regist_level_id=#{registLevelId}")
    List<Employee> getEmployeeList(@Param("deptmentId") int deptmentId, @Param("registLevelId") int registLevelId);

}
