package com.hanma56.cloud.route.service;

import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hanma56.cloud.route.model.Line;

/**
 * @author 张钟
 * @date 2018/3/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LineServiceTest {

    @Autowired
    private LineService lineService;

    @Test
    public void test_save() {
        for(int i = 0;i<50;i++){
            Line line = new Line();
            line.setLineName("第一条线路");
            line.setStartCityName("诸城");
            line.setEndCityName("潍坊");
            line.setCreator(1l);
            line.setModifier(1l);
            lineService.saveLine(line);
            System.out.println(11);
        }
    }

    @Test
    public void queryOnePage() {
        Page<Line> page = lineService.queryOnePageByUserId(1l, 1, 10);
        System.out.println(page);
    }
}
