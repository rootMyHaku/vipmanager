package cn.zh.dao;

import cn.zh.pojo.LeaveMessage;
import cn.zh.pojo.LeaveMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveMessageMapper {
    long countByExample(LeaveMessageExample example);

    int deleteByExample(LeaveMessageExample example);

    int insert(LeaveMessage record);

    int insertSelective(LeaveMessage record);

    List<LeaveMessage> selectByExampleWithBLOBs(LeaveMessageExample example);

    List<LeaveMessage> selectByExample(LeaveMessageExample example);

    int updateByExampleSelective(@Param("record") LeaveMessage record, @Param("example") LeaveMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") LeaveMessage record, @Param("example") LeaveMessageExample example);

    int updateByExample(@Param("record") LeaveMessage record, @Param("example") LeaveMessageExample example);
}