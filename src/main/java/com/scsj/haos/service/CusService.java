package com.scsj.haos.service;

import com.scsj.haos.common.domain.Cus;

public interface CusService {

    public Cus findCusById(String id);
    public void updateCusById(String id, Cus cus);
    public void deleteCusById(String id);
}
