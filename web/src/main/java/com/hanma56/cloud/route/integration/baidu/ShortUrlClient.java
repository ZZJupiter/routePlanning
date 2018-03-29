package com.hanma56.cloud.route.integration.baidu;

import com.alibaba.fastjson.JSONObject;
import com.hanma56.cloud.route.integration.gd.GDClientCallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jianyi
 * \* Date: 2018/3/29
 * \* Time: 下午5:11
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@FeignClient(name = "shortUrlClient", url = "http://dwz.cn", fallbackFactory = GDClientCallBack.class)
public interface ShortUrlClient {

    /**
     * 获取短连接
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/create.php")
    String getShortUrl(@RequestParam("url") String url,
                           @RequestParam("alias") String alias,
                           @RequestParam("access_type") String accessType);
}
