package com.oatiny.hrm.controller;

import com.oatiny.hrm.entity.HrmUser;
import com.oatiny.hrm.mapper.HrmUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hrm")
public class HrmController {
    @Autowired
    private HrmUserMapper hrmUserMapper;

    @RequestMapping("/getHrmUserList")
    public List<HrmUser> getHrmUserList(){
        List<HrmUser> hrmUserList = hrmUserMapper.selectList(null);
        return hrmUserList;
    }
}
