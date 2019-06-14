package cn.zh.dao;

import cn.zh.pojo.UserRefer;
import cn.zh.pojo.UserReferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserReferMapper {
    long countByExample(UserReferExample example);

    int deleteByExample(UserReferExample example);

    int insert(UserRefer record);

    int insertSelective(UserRefer record);

    List<UserRefer> selectByExample(UserReferExample example);

    int updateByExampleSelective(@Param("record") UserRefer record, @Param("example") UserReferExample example);

    int updateByExample(@Param("record") UserRefer record, @Param("example") UserReferExample example);
}