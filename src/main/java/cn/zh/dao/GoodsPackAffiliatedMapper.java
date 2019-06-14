package cn.zh.dao;

import cn.zh.pojo.GoodsPackAffiliated;
import cn.zh.pojo.GoodsPackAffiliatedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPackAffiliatedMapper {
    long countByExample(GoodsPackAffiliatedExample example);

    int deleteByExample(GoodsPackAffiliatedExample example);

    int insert(GoodsPackAffiliated record);

    int insertSelective(GoodsPackAffiliated record);

    List<GoodsPackAffiliated> selectByExample(GoodsPackAffiliatedExample example);

    int updateByExampleSelective(@Param("record") GoodsPackAffiliated record, @Param("example") GoodsPackAffiliatedExample example);

    int updateByExample(@Param("record") GoodsPackAffiliated record, @Param("example") GoodsPackAffiliatedExample example);
}