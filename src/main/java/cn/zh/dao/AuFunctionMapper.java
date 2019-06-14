package cn.zh.dao;

import cn.zh.pojo.AuFunction;
import cn.zh.pojo.AuFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuFunctionMapper {
    long countByExample(AuFunctionExample example);

    int deleteByExample(AuFunctionExample example);

    int insert(AuFunction record);

    int insertSelective(AuFunction record);

    List<AuFunction> selectByExample(AuFunctionExample example);

    int updateByExampleSelective(@Param("record") AuFunction record, @Param("example") AuFunctionExample example);

    int updateByExample(@Param("record") AuFunction record, @Param("example") AuFunctionExample example);
}