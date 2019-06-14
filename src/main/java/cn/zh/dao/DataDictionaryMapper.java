package cn.zh.dao;

import cn.zh.pojo.DataDictionary;
import cn.zh.pojo.DataDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataDictionaryMapper {
    long countByExample(DataDictionaryExample example);

    int deleteByExample(DataDictionaryExample example);

    int insert(DataDictionary record);

    int insertSelective(DataDictionary record);

    List<DataDictionary> selectByExample(DataDictionaryExample example);

    int updateByExampleSelective(@Param("record") DataDictionary record, @Param("example") DataDictionaryExample example);

    int updateByExample(@Param("record") DataDictionary record, @Param("example") DataDictionaryExample example);
}