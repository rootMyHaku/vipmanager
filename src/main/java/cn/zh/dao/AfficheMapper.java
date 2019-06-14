package cn.zh.dao;

import cn.zh.pojo.Affiche;
import cn.zh.pojo.AfficheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AfficheMapper {
    long countByExample(AfficheExample example);

    int deleteByExample(AfficheExample example);

    int insert(Affiche record);

    int insertSelective(Affiche record);

    List<Affiche> selectByExampleWithBLOBs(AfficheExample example);

    List<Affiche> selectByExample(AfficheExample example);

    int updateByExampleSelective(@Param("record") Affiche record, @Param("example") AfficheExample example);

    int updateByExampleWithBLOBs(@Param("record") Affiche record, @Param("example") AfficheExample example);

    int updateByExample(@Param("record") Affiche record, @Param("example") AfficheExample example);
}