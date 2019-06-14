package cn.zh.dao;

import cn.zh.pojo.Inventory;
import cn.zh.pojo.InventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InventoryMapper {
    long countByExample(InventoryExample example);

    int deleteByExample(InventoryExample example);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    List<Inventory> selectByExample(InventoryExample example);

    int updateByExampleSelective(@Param("record") Inventory record, @Param("example") InventoryExample example);

    int updateByExample(@Param("record") Inventory record, @Param("example") InventoryExample example);
}