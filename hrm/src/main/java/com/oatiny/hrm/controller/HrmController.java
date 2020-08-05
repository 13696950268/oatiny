package com.oatiny.hrm.controller;

import com.oatiny.hrm.entity.HrmUser;
import com.oatiny.hrm.mapper.HrmUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 人员
 * @author: zm
 * @createDate: 2020/8/5 18:00
 */
@RestController
@RequestMapping("/hrm")
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
    @RequestMapping("/getHrmUserList")
    public List<HrmUser> getHrmUserList(){
        List<HrmUser> hrmUserList = hrmUserMapper.selectList(null);
        return hrmUserList;
    }

}
