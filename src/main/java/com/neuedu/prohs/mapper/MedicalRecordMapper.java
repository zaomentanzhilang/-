package com.neuedu.prohs.mapper;

import com.neuedu.prohs.pojo.MedicalRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

@Mapper
public interface MedicalRecordMapper {
    @Insert("insert into medical_record(register_id, readme, present, present_treat," +
            "history, allergy, physique, proposal, careful, diagnosis, cure)" +
            " values(#{registerId},#{readme},#{present},#{presentTreat},#{history},#{allergy},#{physique},#{proposal},#{careful},#{diagnosis},#{cure})")
    @SelectKey(statement = "select last_insert_id()", before = false, resultType = Integer.class, keyProperty = "id")
    int insertMedicalRecord(MedicalRecord medicalRecord);

    @Insert("<script>insert into medical_record_disease values" +
            "<foreach collection=\"array\" item=\"did\" separator=\",\"> " +
            "(#{mid},#{did})" +
            "</foreach></script>")
    int insertMedicalRecordDisease(@Param("mid") int mid, @Param("array") int[] dids);
}
