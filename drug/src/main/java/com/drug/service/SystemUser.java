package com.drug.service;

import com.drug.pojo.SysUser;


public interface SystemUser {

    SysUser findByCount(String account);
}
