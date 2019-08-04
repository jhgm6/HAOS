package com.scsj.haos.service;

import com.scsj.haos.common.domain.Emp;

public interface EmpService {
    public Emp findEmpById(String id);
    public void updateEmpById(String id);
    public void deleteEmpById(String id);
}
