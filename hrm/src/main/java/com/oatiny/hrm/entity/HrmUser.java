package com.oatiny.hrm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@ToString
@AllArgsConstructor
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
