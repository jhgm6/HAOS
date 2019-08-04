package com.scsj.haos.mapper;

import com.scsj.haos.common.domain.RoomType;
import com.scsj.haos.common.domain.RoomTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeMapper {
    long countByExample(RoomTypeExample example);

    int deleteByExample(RoomTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoomType record);

    int insertSelective(RoomType record);

    List<RoomType> selectByExample(RoomTypeExample example);

    RoomType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoomType record, @Param("example") RoomTypeExample example);

    int updateByExample(@Param("record") RoomType record, @Param("example") RoomTypeExample example);

    int updateByPrimaryKeySelective(RoomType record);

    int updateByPrimaryKey(RoomType record);
}