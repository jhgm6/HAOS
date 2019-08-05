package com.scsj.haos.service;

import com.scsj.haos.common.domain.Cus;
import com.scsj.haos.mapper.CusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CusServiceImpl implements CusService{
    @Autowired
    CusMapper cusMapper;

    @Override
    public Cus findCusById(String id) {
        return cusMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateCusById(String id, Cus cus) {
        cusMapper.updateByPrimaryKey(cus);
    }

    @Override
    public void deleteCusById(String id) {
        cusMapper.deleteByPrimaryKey(id);
    }
}
