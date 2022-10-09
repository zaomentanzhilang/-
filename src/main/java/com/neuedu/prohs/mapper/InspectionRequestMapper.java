package com.neuedu.prohs.mapper;

import com.neuedu.prohs.pojo.InspectionRequest;
import org.apache.ibatis.annotations.*;

@Mapper
public interface InspectionRequestMapper {
    @Insert("insert into inspection_request(register_id, inspection_info, inspection_position,creation_time,inspection_employee_id," +
            "inputinspection_employee_id,inspection_time,inspection_result,inspection_state,inspection_remark)" +
            " values(#{registerId},#{inspectionInfo},#{inspectionPosition},#{creationTime},#{inspectionEmployeeId}" +
            ",#{inputinspectionEmployeeId},#{inspectionTime},#{inspectionResult},#{inspectionState},#{inspectionRemark})")
    @SelectKey(statement = "select last_insert_id()", before = false, resultType = Integer.class, keyProperty = "id")
    int inspectionRequest(InspectionRequest inspectionRequest);

    @Insert("<script>insert into Inspection_account values" +
            "<foreach collection=\"array\" item=\"tid\" separator=\",\"> " +
            "(#{mid},#{tid})" +
            "</foreach></script>")
    int insertInspectionAccount(@Param("mid") int mid, @Param("array") int[] tids);

    @Update("update register set visit_state=2 where id =#{id}")
    int updateVisitStat(@Param("id") int id);
}
