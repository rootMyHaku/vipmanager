package cn.zh.dao;

import cn.zh.pojo.UserAccount201312;
import cn.zh.pojo.UserAccount201312Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccount201312Mapper {
    long countByExample(UserAccount201312Example example);

    int deleteByExample(UserAccount201312Example example);

    int insert(UserAccount201312 record);

    int insertSelective(UserAccount201312 record);

    List<UserAccount201312> selectByExample(UserAccount201312Example example);

    int updateByExampleSelective(@Param("record") UserAccount201312 record, @Param("example") UserAccount201312Example example);

    int updateByExample(@Param("record") UserAccount201312 record, @Param("example") UserAccount201312Example example);
}