package com.scsj.haos.service;


import com.scsj.haos.common.domain.Admin;

import java.util.Date;

public interface AdminService {

    public Admin findAdminById(String id);

    public void updateAdminById(String id,Admin admin);

}
