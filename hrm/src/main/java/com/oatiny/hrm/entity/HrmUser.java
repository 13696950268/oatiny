package com.oatiny.hrm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@ToString
@AllArgsConstructor
@ApiModel("用户基本信息")
public class HrmUser {
    private String id;
    private String loginId;
    private String userName;
    private String password;
    private String deptName;
    private String orgName;
    private String sex;
    private String mobile;
    private String email;
    private String job;
    private String leaderId;
    private String leaderIds;
    private LocalDate createDate;
    private LocalTime createTime;
    private LocalDate updateDate;
    private LocalTime updateTime;
}
