package cn.zh.dao;

import cn.zh.pojo.AuRole;
import cn.zh.pojo.AuRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuRoleMapper {
    long countByExample(AuRoleExample example);

    int deleteByExample(AuRoleExample example);

    int insert(AuRole record);

    int insertSelective(AuRole record);

    List<AuRole> selectByExample(AuRoleExample example);

    int updateByExampleSelective(@Param("record") AuRole record, @Param("example") AuRoleExample example);

    int updateByExample(@Param("record") AuRole record, @Param("example") AuRoleExample example);
}