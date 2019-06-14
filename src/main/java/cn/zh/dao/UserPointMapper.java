package cn.zh.dao;

import cn.zh.pojo.UserPoint;
import cn.zh.pojo.UserPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPointMapper {
    long countByExample(UserPointExample example);

    int deleteByExample(UserPointExample example);

    int insert(UserPoint record);

    int insertSelective(UserPoint record);

    List<UserPoint> selectByExample(UserPointExample example);

    int updateByExampleSelective(@Param("record") UserPoint record, @Param("example") UserPointExample example);

    int updateByExample(@Param("record") UserPoint record, @Param("example") UserPointExample example);
}