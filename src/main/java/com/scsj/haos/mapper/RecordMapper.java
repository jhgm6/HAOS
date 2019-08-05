package com.scsj.haos.mapper;

import com.scsj.haos.common.domain.Record;
import com.scsj.haos.common.domain.RecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordMapper {
    long countByExample(RecordExample example);

    int deleteByExample(RecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(Record record);

    int insertSelective(Record record);

    List<Record> selectByExample(RecordExample example);

    Record selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Record record, @Param("example") RecordExample example);

    int updateByExample(@Param("record") Record record, @Param("example") RecordExample example);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}