package cn.zh.dao;

import cn.zh.pojo.GoodsPack;
import cn.zh.pojo.GoodsPackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPackMapper {
    long countByExample(GoodsPackExample example);

    int deleteByExample(GoodsPackExample example);

    int insert(GoodsPack record);

    int insertSelective(GoodsPack record);

    List<GoodsPack> selectByExampleWithBLOBs(GoodsPackExample example);

    List<GoodsPack> selectByExample(GoodsPackExample example);

    int updateByExampleSelective(@Param("record") GoodsPack record, @Param("example") GoodsPackExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsPack record, @Param("example") GoodsPackExample example);

    int updateByExample(@Param("record") GoodsPack record, @Param("example") GoodsPackExample example);
}