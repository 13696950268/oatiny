package com.oatiny.hrm.controller;

import cn.hutool.core.date.DateUtil;
import com.oatiny.hrm.entity.HrmUser;
import com.oatiny.hrm.mapper.HrmUserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @description: 人员
 * @author: zm
 * @createDate: 2020/8/5 18:00
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/hrm")
@Slf4j
public class HrmController {
    @Autowired
    private HrmUserMapper hrmUserMapper;

    /**
     * 获取所有人员
     * @author zm
     * @param:
     * @return
     * @exception
     * @createDate 2020/8/5 18:01
     */
    @ApiOperation("用户列表")
    @RequestMapping(value = "/getHrmUserList",method = RequestMethod.GET)
    public List<HrmUser> getHrmUserList(){
        String dateStr = "2017-03-01 22:33:23";
        Date date = DateUtil.parse(dateStr);
        //一天的开始，结果：2017-03-01 00:00:00
        Date beginOfDay = DateUtil.beginOfDay(date);
        //一天的结束，结果：2017-03-01 23:59:59
        Date endOfDay = DateUtil.endOfDay(date);
        log.info("beginOfDay=="+beginOfDay);
        log.info("endOfDay=="+endOfDay);
        return hrmUserMapper.selectList(null);
    }

    @RequestMapping(value = "/addHrmUser",method = RequestMethod.POST)
    public void addHrmUser(@RequestBody HrmUser hrmUser){
        try {
            hrmUserMapper.insert(hrmUser);
        } catch (Exception e) {
            log.error("addHrmUser保存失败==="+e.getMessage());
        }
    }
}
