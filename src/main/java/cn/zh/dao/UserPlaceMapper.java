package cn.zh.dao;

import cn.zh.pojo.UserPlace;
import cn.zh.pojo.UserPlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPlaceMapper {
    long countByExample(UserPlaceExample example);

    int deleteByExample(UserPlaceExample example);

    int insert(UserPlace record);

    int insertSelective(UserPlace record);

    List<UserPlace> selectByExample(UserPlaceExample example);

    int updateByExampleSelective(@Param("record") UserPlace record, @Param("example") UserPlaceExample example);

    int updateByExample(@Param("record") UserPlace record, @Param("example") UserPlaceExample example);
}