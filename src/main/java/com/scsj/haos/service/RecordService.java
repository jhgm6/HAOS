package com.scsj.haos.service;

import com.scsj.haos.common.domain.Record;

public interface RecordService {
    public Record findRecordById(String id);
    public void updateRecordById(String id,Record record);
    public void deleteRecordById(String id);

}
