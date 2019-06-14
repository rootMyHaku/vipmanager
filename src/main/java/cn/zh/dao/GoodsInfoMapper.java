package cn.zh.dao;

import cn.zh.pojo.GoodsInfo;
import cn.zh.pojo.GoodsInfoExample;
import cn.zh.pojo.GoodsInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsInfoMapper {
    long countByExample(GoodsInfoExample example);

    int deleteByExample(GoodsInfoExample example);

    int insert(GoodsInfoWithBLOBs record);

    int insertSelective(GoodsInfoWithBLOBs record);

    List<GoodsInfoWithBLOBs> selectByExampleWithBLOBs(GoodsInfoExample example);

    List<GoodsInfo> selectByExample(GoodsInfoExample example);

    int updateByExampleSelective(@Param("record") GoodsInfoWithBLOBs record, @Param("example") GoodsInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsInfoWithBLOBs record, @Param("example") GoodsInfoExample example);

    int updateByExample(@Param("record") GoodsInfo record, @Param("example") GoodsInfoExample example);
}