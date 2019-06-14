package cn.zh.dao;

import cn.zh.pojo.OrderList;
import cn.zh.pojo.OrderListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderListMapper {
    long countByExample(OrderListExample example);

    int deleteByExample(OrderListExample example);

    int insert(OrderList record);

    int insertSelective(OrderList record);

    List<OrderList> selectByExample(OrderListExample example);

    int updateByExampleSelective(@Param("record") OrderList record, @Param("example") OrderListExample example);

    int updateByExample(@Param("record") OrderList record, @Param("example") OrderListExample example);
}