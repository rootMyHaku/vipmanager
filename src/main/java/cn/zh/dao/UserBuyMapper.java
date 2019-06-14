package cn.zh.dao;

import cn.zh.pojo.UserBuy;
import cn.zh.pojo.UserBuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBuyMapper {
    long countByExample(UserBuyExample example);

    int deleteByExample(UserBuyExample example);

    int insert(UserBuy record);

    int insertSelective(UserBuy record);

    List<UserBuy> selectByExample(UserBuyExample example);

    int updateByExampleSelective(@Param("record") UserBuy record, @Param("example") UserBuyExample example);

    int updateByExample(@Param("record") UserBuy record, @Param("example") UserBuyExample example);
}