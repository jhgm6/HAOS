package com.scsj.haos.service;

import com.scsj.haos.common.domain.Admin;
import com.scsj.haos.common.domain.AdminExample;
import com.scsj.haos.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;//服务层 注入  dao 层

    public Admin findAdminById(String id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    public void updateAdminById(String id,Admin admin){
        adminMapper.updateByPrimaryKey(admin);
    }

}
