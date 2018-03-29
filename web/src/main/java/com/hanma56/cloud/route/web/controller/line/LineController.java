package com.hanma56.cloud.route.web.controller.line;

import com.baomidou.mybatisplus.plugins.Page;
import com.hanma56.cloud.route.convert.LineConvert;
import com.hanma56.cloud.route.model.Line;
import com.hanma56.cloud.route.service.LineService;
import com.hanma56.cloud.route.web.controller.line.request.DeleteLineForm;
import com.hanma56.cloud.route.web.controller.line.request.IdForm;
import com.hanma56.cloud.route.web.controller.line.request.QueryLineForm;
import com.hanma56.cloud.route.web.controller.line.request.SaveLineForm;
import com.hanma56.cloud.route.web.result.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 运营线路 前端控制器
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-20
 */
@Controller
@RequestMapping("/line")
public class LineController {

    @Autowired
    private LineService lineService;


    @ResponseBody
    @RequestMapping(value = "/list")
    public ResultVO<Page<Line>> getLInes(@RequestBody QueryLineForm form) {

        Page<Line> page = lineService.queryOnePageByUserId(form, form.getCurrentPage(),
                form.getPageSize());
        return ResultVO.success(page);
    }


    @ResponseBody
    @RequestMapping(value = "/save")
    public ResultVO saveLine(@RequestBody SaveLineForm form) {

        Line line = LineConvert.convert(form);

        lineService.saveLine(line);

        return ResultVO.success();
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public ResultVO deleteLine(@RequestBody DeleteLineForm form) {

        lineService.deleteById(form.getId());

        return ResultVO.success();

    }

    @RequestMapping(value = "/qrcode")
    public void getQRCode(@RequestBody IdForm form){

    }


}
