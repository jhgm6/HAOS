package com.scsj.haos;

import com.scsj.haos.common.domain.Admin;
import com.scsj.haos.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HaosApplicationTests {

    @Autowired
    AdminMapper adminMapper;
    @Test
    public void contextLoads() {
        Admin admin = adminMapper.selectByPrimaryKey("admin");
        System.out.println(admin.getId());

    }

}
