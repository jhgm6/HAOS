package com.scsj.haos.service;

import com.scsj.haos.common.domain.Emp;
import com.scsj.haos.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper empMapper;
    @Override
    public Emp findEmpById(String id) {
        Emp empDB = empMapper.selectByPrimaryKey(id);
        return empDB;
    }

    @Override
    public void updateEmpById(String id, Emp emp) {
        empMapper.updateByPrimaryKey(emp);
    }

    @Override
    public void deleteEmpById(String id) {
        empMapper.deleteByPrimaryKey(id);
    }
}
