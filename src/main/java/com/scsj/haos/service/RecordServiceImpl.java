package com.scsj.haos.service;

import com.scsj.haos.common.domain.Record;
import com.scsj.haos.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    RecordMapper recordMapper;

    @Override
    public Record findRecordById(String id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateRecordById(String id, Record record) {
        recordMapper.updateByPrimaryKey(record);
    }

    @Override
    public void deleteRecordById(String id) {
        recordMapper.deleteByPrimaryKey(id);
    }
}
