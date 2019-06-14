package cn.zh.dao;

import cn.zh.pojo.MultiLan;
import cn.zh.pojo.MultiLanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MultiLanMapper {
    long countByExample(MultiLanExample example);

    int deleteByExample(MultiLanExample example);

    int insert(MultiLan record);

    int insertSelective(MultiLan record);

    List<MultiLan> selectByExample(MultiLanExample example);

    int updateByExampleSelective(@Param("record") MultiLan record, @Param("example") MultiLanExample example);

    int updateByExample(@Param("record") MultiLan record, @Param("example") MultiLanExample example);
}