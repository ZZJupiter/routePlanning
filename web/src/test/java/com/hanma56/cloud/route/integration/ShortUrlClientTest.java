package com.hanma56.cloud.route.integration;

import com.alibaba.fastjson.JSONObject;
import com.hanma56.cloud.route.integration.baidu.ShortUrlClient;
import com.hanma56.cloud.route.integration.baidu.ShortUrlService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jianyi
 * \* Date: 2018/3/29
 * \* Time: 下午5:16
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShortUrlClientTest {

    @Autowired
    private ShortUrlClient shortUrlClient;

    @Test
    public void test(){
        String jsonObject = shortUrlClient.getShortUrl("http://www.baidu.com","","web");
        System.out.println(jsonObject);
    }

    @Test
    public void test_generate(){
        String shortUrl = ShortUrlService.generateShortUrl("http://www.baidu.com");
        System.out.println(shortUrl);
    }
}
