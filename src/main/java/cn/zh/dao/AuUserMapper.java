package cn.zh.dao;

import cn.zh.pojo.AuUser;
import cn.zh.pojo.AuUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuUserMapper {
    long countByExample(AuUserExample example);

    int deleteByExample(AuUserExample example);

    int insert(AuUser record);

    int insertSelective(AuUser record);

    List<AuUser> selectByExample(AuUserExample example);

    int updateByExampleSelective(@Param("record") AuUser record, @Param("example") AuUserExample example);

    int updateByExample(@Param("record") AuUser record, @Param("example") AuUserExample example);
}