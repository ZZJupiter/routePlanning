package com.hanma56.cloud.route.web.controller.task;


import com.hanma56.cloud.route.service.DeliverTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 配送任务 前端控制器
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-30
 */
@Controller
@RequestMapping("/deliverTask")
public class DeliverTaskController {


    @Autowired
    private DeliverTaskService deliverTaskService;


}

