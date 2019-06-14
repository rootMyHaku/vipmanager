package cn.zh.dao;

import cn.zh.pojo.InfoAnnexes;
import cn.zh.pojo.InfoAnnexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoAnnexesMapper {
    long countByExample(InfoAnnexesExample example);

    int deleteByExample(InfoAnnexesExample example);

    int insert(InfoAnnexes record);

    int insertSelective(InfoAnnexes record);

    List<InfoAnnexes> selectByExample(InfoAnnexesExample example);

    int updateByExampleSelective(@Param("record") InfoAnnexes record, @Param("example") InfoAnnexesExample example);

    int updateByExample(@Param("record") InfoAnnexes record, @Param("example") InfoAnnexesExample example);
}