package com.hanma56.cloud.route.convert;

import com.hanma56.cloud.route.model.Line;
import com.hanma56.cloud.route.web.controller.line.request.SaveLineForm;
import org.springframework.beans.BeanUtils;

public class LineConvert {

    public static Line convert(SaveLineForm form){
        if(form==null){
            return null;
        }
        Line line = new Line();
        BeanUtils.copyProperties(form,line);
        return  line;
    }

}
