package com.hanma56.cloud.route.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.hanma56.cloud.route.model.Line;
import com.hanma56.cloud.route.dao.LineMapper;
import com.hanma56.cloud.route.service.LineService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 运营线路 服务实现类
 * </p>
 *
 * @author 简一带你飞
 * @since 2018-03-20
 */
@Service
public class LineServiceImpl extends ServiceImpl<LineMapper, Line> implements LineService {

    @Autowired
    private LineMapper lineMapper;

    @Override
    public void saveLine(Line line) {
        Date currentDate = new Date();
        if(line.getId() == null){
            line.setCreated(currentDate);
            line.setUpdated(currentDate);
        }else{
            line.setUpdated(currentDate);
        }
        insertOrUpdate(line);
    }


    @Override
    public Page<Line> queryOnePageByUserId(Long userId,int currentPage,int pageSize){
        Page<Line> page = new Page<>(currentPage, pageSize);
        page.setRecords(lineMapper.selectByCreator(page,userId));
        return page;
    }


}
