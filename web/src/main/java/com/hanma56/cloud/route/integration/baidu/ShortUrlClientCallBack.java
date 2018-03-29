package com.hanma56.cloud.route.integration.baidu;

import com.alibaba.fastjson.JSONObject;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jianyi
 * \* Date: 2018/3/29
 * \* Time: 下午5:13
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Component
public class ShortUrlClientCallBack implements FallbackFactory<ShortUrlClient> {
    private org.apache.log4j.Logger logger = org.apache.log4j.Logger
            .getLogger(ShortUrlClientCallBack.class);

    @Override
    public ShortUrlClient create(Throwable cause) {
        return new ShortUrlClient() {
            @Override
            public String getShortUrl(String url, String alias, String accessType) {
                logger.error("调用百度生成短链接口异常,url:" + url, cause);
                return null;
            }
        };
    }
}
