package com.hanma56.cloud.route.integration.baidu;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jianyi
 * \* Date: 2018/3/29
 * \* Time: 下午5:32
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ShortUrlService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 生成端连接信息
     *
     * @author: lyh
     * @date: 2015年10月27日下午23:58:54
     */
    public static String generateShortUrl(String url) {
        try {
            HttpPost httpost = new HttpPost("http://dwz.cn/create.php");
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("url", url));
            httpost.setEntity(new UrlEncodedFormEntity(params, "utf-8"));
            HttpResponse response = new DefaultHttpClient().execute(httpost);
            String jsonStr = EntityUtils
                    .toString(response.getEntity(), "utf-8");
            JSONObject jsonObj = JSONObject.parseObject(jsonStr.replace("\\",""));
            return jsonObj.get("tinyurl").toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
