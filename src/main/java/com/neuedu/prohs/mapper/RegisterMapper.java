package com.neuedu.prohs.mapper;

import com.neuedu.prohs.pojo.Register;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RegisterMapper {

    @Insert("insert into register(case_number, real_name, gender, card_number, birthday, age, age_type, home_address, visit_date, noon, deptment_id, employee_id, regist_level_id, settle_category_id, is_book, regist_method, visit_state, regist_money)" +
            " VALUES(#{caseNumber},#{realName},#{gender},#{cardNumber},#{birthday},#{age},#{ageType},#{homeAddress},#{visitDate},#{noon},#{deptmentId},#{employeeId},#{registLevelId},#{settleCategoryId},#{isBook},#{registMethod},#{visitState},#{registMoney})")
    Boolean addRegister(Register onsite);

    @Select("<script> select * from register <where>" +
            "employee_id=#{employyId} and visit_state=1 and visit_date like concat(left(now(),10),'%')" +
            "<if test=\"caseNumber!=null and caseNumber!=''\"> and case_number like concat('%',#{caseNumber},'%')</if>" +
            "<if test=\"realName!=null and realName!=''\"> and real_name like concat('%',#{realName},'%')</if>" +
            "</where>" +
            "order by visit_date</script>")
    List<Register> getRegisterList(@Param("employyId") int employyId, @Param("caseNumber") String caseNumber, @Param("realName") String realName);
}
