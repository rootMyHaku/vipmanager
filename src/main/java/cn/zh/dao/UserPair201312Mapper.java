package cn.zh.dao;

import cn.zh.pojo.UserPair201312;
import cn.zh.pojo.UserPair201312Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPair201312Mapper {
    long countByExample(UserPair201312Example example);

    int deleteByExample(UserPair201312Example example);

    int insert(UserPair201312 record);

    int insertSelective(UserPair201312 record);

    List<UserPair201312> selectByExample(UserPair201312Example example);

    int updateByExampleSelective(@Param("record") UserPair201312 record, @Param("example") UserPair201312Example example);

    int updateByExample(@Param("record") UserPair201312 record, @Param("example") UserPair201312Example example);
}