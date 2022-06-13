package com.misaka.performance_management_system;

import com.misaka.performance_management_system.dao.GxbjMapper;
import com.misaka.performance_management_system.entity.Gxbj;
import com.misaka.performance_management_system.entity.Gxzy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class PerformanceManagementSystemApplicationTests {
@Autowired
    GxbjMapper gxbjMapper;
    @Test
    void contextLoads() {
        Map<String,Object> map=new HashMap<>();
        Gxbj gxbj=new Gxbj();
        map.put("page",0);
        map.put("pageSize",10);
        map.put("gxbj",gxbj);

        gxbjMapper.findByPage(map);
    }
    @Test
    void contextLoads1() {
        Gxbj gxbj=new Gxbj();
        Gxbj gxbj1=new Gxbj();
        Gxzy gxzy=new Gxzy();
        gxzy.setId("2022001");
        gxbj.setGxzy(gxzy);
        gxbj.setBjmc("sadsa");
        gxbj.setBh("213231");
        gxbj.setId("21dsadasfa3231");
        gxbj1.setGxzy(gxzy);
        gxbj1.setBjmc("sadsa");
        gxbj1.setBh("213231");
        gxbj1.setId("213dsa231");
        List list=new ArrayList();
        list.add(gxbj);
        list.add(gxbj1);
        gxbjMapper.batchSave(list);
    }
    @Test
    void contextLoads2() {
        Gxbj gxbj=new Gxbj();
        Gxbj gxbj1=new Gxbj();
        Gxzy gxzy=new Gxzy();
        gxzy.setId("2022001");
        gxbj.setGxzy(gxzy);
        gxbj.setBjmc("aaa");
        gxbj.setBh("213231");
        gxbj.setId("21dsadasfa3231");
        gxbj1.setGxzy(gxzy);
        gxbj1.setBjmc("bbbb");
        gxbj1.setBh("213231");
        gxbj1.setId("213dsa231");
        List list=new ArrayList();
        list.add(gxbj);
        list.add(gxbj1);
        gxbjMapper.batchUpdate(list);
    }

    @Test
    void contextLoads3() {
        Gxbj gxbj=new Gxbj();
        Gxbj gxbj1=new Gxbj();
        Gxzy gxzy=new Gxzy();
        gxzy.setId("2022001");
        gxbj.setGxzy(gxzy);
        gxbj.setBjmc("aaa");
        gxbj.setBh("213231");
        gxbj.setId("21dsadasfa3231");
        gxbj1.setGxzy(gxzy);
        gxbj1.setBjmc("bbbb");
        gxbj1.setBh("213231");
        gxbj1.setId("213dsa231");
        List list=new ArrayList();
        list.add(gxbj);
        list.add(gxbj1);
        gxbjMapper.batchDelete(list);
    }
}
