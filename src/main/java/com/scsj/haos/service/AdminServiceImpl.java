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
        Admin adminDB = adminMapper.selectByPrimaryKey(id);
        return adminDB;

//        AdminExample example = new AdminExample();
//        example.createCriteria().andIdEqualTo(id);
//        List<Admin> admins = adminMapper.selectByExample(example);
//        return admins.size()>0?admins.get(0):null;
    }

    public void updateAdminById(String id,Admin admin){
//        Admin adminDB = adminMapper.selectByPrimaryKey(id);
//        adminDB.setPassword(admin.getPassword());
//        adminDB.setAddress(admin.getAddress());
//        adminDB.setBirth(admin.getBirth());
//        adminDB.setGender(admin.getGender());
//        adminDB.setImg(admin.getImg());
//        adminDB.setName(admin.getName());
//        adminDB.setPhone(admin.getPhone());
        adminMapper.updateByPrimaryKey(admin);
    }

}
