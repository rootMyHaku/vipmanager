package cn.zh.dao;

import cn.zh.pojo.UserBuyBonus;
import cn.zh.pojo.UserBuyBonusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBuyBonusMapper {
    long countByExample(UserBuyBonusExample example);

    int deleteByExample(UserBuyBonusExample example);

    int insert(UserBuyBonus record);

    int insertSelective(UserBuyBonus record);

    List<UserBuyBonus> selectByExample(UserBuyBonusExample example);

    int updateByExampleSelective(@Param("record") UserBuyBonus record, @Param("example") UserBuyBonusExample example);

    int updateByExample(@Param("record") UserBuyBonus record, @Param("example") UserBuyBonusExample example);
}