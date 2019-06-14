package cn.zh.dao;

import cn.zh.pojo.AuAuthority;
import cn.zh.pojo.AuAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuAuthorityMapper {
    long countByExample(AuAuthorityExample example);

    int deleteByExample(AuAuthorityExample example);

    int insert(AuAuthority record);

    int insertSelective(AuAuthority record);

    List<AuAuthority> selectByExample(AuAuthorityExample example);

    int updateByExampleSelective(@Param("record") AuAuthority record, @Param("example") AuAuthorityExample example);

    int updateByExample(@Param("record") AuAuthority record, @Param("example") AuAuthorityExample example);
}