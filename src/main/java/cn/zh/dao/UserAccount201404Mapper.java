package cn.zh.dao;

import cn.zh.pojo.UserAccount201404;
import cn.zh.pojo.UserAccount201404Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccount201404Mapper {
    long countByExample(UserAccount201404Example example);

    int deleteByExample(UserAccount201404Example example);

    int insert(UserAccount201404 record);

    int insertSelective(UserAccount201404 record);

    List<UserAccount201404> selectByExample(UserAccount201404Example example);

    int updateByExampleSelective(@Param("record") UserAccount201404 record, @Param("example") UserAccount201404Example example);

    int updateByExample(@Param("record") UserAccount201404 record, @Param("example") UserAccount201404Example example);
}