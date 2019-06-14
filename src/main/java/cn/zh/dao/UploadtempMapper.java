package cn.zh.dao;

import cn.zh.pojo.Uploadtemp;
import cn.zh.pojo.UploadtempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadtempMapper {
    long countByExample(UploadtempExample example);

    int deleteByExample(UploadtempExample example);

    int insert(Uploadtemp record);

    int insertSelective(Uploadtemp record);

    List<Uploadtemp> selectByExample(UploadtempExample example);

    int updateByExampleSelective(@Param("record") Uploadtemp record, @Param("example") UploadtempExample example);

    int updateByExample(@Param("record") Uploadtemp record, @Param("example") UploadtempExample example);
}