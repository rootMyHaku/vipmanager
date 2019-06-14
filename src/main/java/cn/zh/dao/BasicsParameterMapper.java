package cn.zh.dao;

import cn.zh.pojo.BasicsParameter;
import cn.zh.pojo.BasicsParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicsParameterMapper {
    long countByExample(BasicsParameterExample example);

    int deleteByExample(BasicsParameterExample example);

    int insert(BasicsParameter record);

    int insertSelective(BasicsParameter record);

    List<BasicsParameter> selectByExample(BasicsParameterExample example);

    int updateByExampleSelective(@Param("record") BasicsParameter record, @Param("example") BasicsParameterExample example);

    int updateByExample(@Param("record") BasicsParameter record, @Param("example") BasicsParameterExample example);
}