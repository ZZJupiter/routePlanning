package com.hanma56.cloud.route.convert;

import com.hanma56.cloud.route.model.DeliverTask;
import com.hanma56.cloud.route.web.controller.task.request.SaveTaskRequest;
import org.springframework.beans.BeanUtils;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: jianyi
 * \* Date: 2018/3/30
 * \* Time: 下午2:26
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class TaskConvert {


    public  static DeliverTask convert(SaveTaskRequest request){
        if(request==null){
            return null;
        }

        DeliverTask deliverTask = new DeliverTask();
        BeanUtils.copyProperties(request,deliverTask);

        return deliverTask;
    }

}
