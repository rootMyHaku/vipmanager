package cn.zh.dao;

import cn.zh.pojo.UserPointGoods;
import cn.zh.pojo.UserPointGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPointGoodsMapper {
    long countByExample(UserPointGoodsExample example);

    int deleteByExample(UserPointGoodsExample example);

    int insert(UserPointGoods record);

    int insertSelective(UserPointGoods record);

    List<UserPointGoods> selectByExample(UserPointGoodsExample example);

    int updateByExampleSelective(@Param("record") UserPointGoods record, @Param("example") UserPointGoodsExample example);

    int updateByExample(@Param("record") UserPointGoods record, @Param("example") UserPointGoodsExample example);
}