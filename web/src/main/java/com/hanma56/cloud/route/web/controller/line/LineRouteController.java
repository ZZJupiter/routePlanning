package com.hanma56.cloud.route.web.controller.line;

import com.google.zxing.WriterException;
import com.hanma56.cloud.route.convert.PointConvert;
import com.hanma56.cloud.route.integration.baidu.ShortUrlService;
import com.hanma56.cloud.route.model.LineRoute;
import com.hanma56.cloud.route.service.LineRouteService;
import com.hanma56.cloud.route.util.MatrixToImageWriter;
import com.hanma56.cloud.route.web.controller.line.request.DeleteLinRouteForm;
import com.hanma56.cloud.route.web.controller.line.request.IdForm;
import com.hanma56.cloud.route.web.controller.line.request.QueryLineRouteForm;
import com.hanma56.cloud.route.web.controller.line.request.SaveLinRouteForm;
import com.hanma56.cloud.route.web.result.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * <p>
 * 运输线路途经地点 前端控制器
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-29
 */
@Controller
@RequestMapping("/lineRoute")
public class LineRouteController {

    @Value("${app.host}")
    private String           host;

    @Autowired
    private LineRouteService lineRouteService;

    @ResponseBody
    @RequestMapping(value = "/save")
    public ResultVO save(@RequestBody SaveLinRouteForm form) {

        List<LineRoute> lineRoutes = PointConvert.convert(form.getPoints(), form.getLineId(), 1l);

        lineRouteService.batchSaveLinePoint(lineRoutes);

        return ResultVO.success();
    }

    @ResponseBody
    @RequestMapping(value = "/get")
    public ResultVO<List<LineRoute>> getLineRouteByLineId(@RequestBody QueryLineRouteForm form) {
        List<LineRoute> lineRouteList = lineRouteService.queryByLineId(form.getLineId());
        return ResultVO.success(lineRouteList);
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public ResultVO deleteById(@RequestBody DeleteLinRouteForm form) {
        lineRouteService.deleteById(form.getId());
        return ResultVO.success();
    }

    @RequestMapping(value = "/route")
    public ModelAndView showRouteMap(Long lineId, Model model) {
        List<LineRoute> lineRouteList = lineRouteService.queryByLineId(lineId);
        model.addAttribute("lineRouteList", lineRouteList);
        return new ModelAndView("line/route");
    }

    @RequestMapping(value = { "/qrcode" })
    public void getQRCodeBase64(Long lineId, HttpServletResponse response) throws IOException,
                                                                           WriterException {

        String sourceUrl = host + "/lineRoute/route?lineId=" + lineId;
        //        String shortUrl = ShortUrlService.generateShortUrl(sourceUrl);
        MatrixToImageWriter.createRqCode(sourceUrl, Integer.valueOf(100), Integer.valueOf(100),
            response.getOutputStream());
    }

}
