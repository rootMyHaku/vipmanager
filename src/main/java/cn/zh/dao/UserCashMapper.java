package cn.zh.dao;

import cn.zh.pojo.UserCash;
import cn.zh.pojo.UserCashExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCashMapper {
    long countByExample(UserCashExample example);

    int deleteByExample(UserCashExample example);

    int insert(UserCash record);

    int insertSelective(UserCash record);

    List<UserCash> selectByExample(UserCashExample example);

    int updateByExampleSelective(@Param("record") UserCash record, @Param("example") UserCashExample example);

    int updateByExample(@Param("record") UserCash record, @Param("example") UserCashExample example);
}