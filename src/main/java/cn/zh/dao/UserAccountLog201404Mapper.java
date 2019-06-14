package cn.zh.dao;

import cn.zh.pojo.UserAccountLog201404;
import cn.zh.pojo.UserAccountLog201404Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountLog201404Mapper {
    long countByExample(UserAccountLog201404Example example);

    int deleteByExample(UserAccountLog201404Example example);

    int insert(UserAccountLog201404 record);

    int insertSelective(UserAccountLog201404 record);

    List<UserAccountLog201404> selectByExample(UserAccountLog201404Example example);

    int updateByExampleSelective(@Param("record") UserAccountLog201404 record, @Param("example") UserAccountLog201404Example example);

    int updateByExample(@Param("record") UserAccountLog201404 record, @Param("example") UserAccountLog201404Example example);
}