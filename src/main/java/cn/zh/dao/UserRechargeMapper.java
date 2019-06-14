package cn.zh.dao;

import cn.zh.pojo.UserRecharge;
import cn.zh.pojo.UserRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRechargeMapper {
    long countByExample(UserRechargeExample example);

    int deleteByExample(UserRechargeExample example);

    int insert(UserRecharge record);

    int insertSelective(UserRecharge record);

    List<UserRecharge> selectByExample(UserRechargeExample example);

    int updateByExampleSelective(@Param("record") UserRecharge record, @Param("example") UserRechargeExample example);

    int updateByExample(@Param("record") UserRecharge record, @Param("example") UserRechargeExample example);
}