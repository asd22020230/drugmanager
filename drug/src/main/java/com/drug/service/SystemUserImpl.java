package com.drug.service;

import com.drug.dao.SystemUserMapper;
import com.drug.pojo.SysUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("systemUser")
public class SystemUserImpl implements SystemUser {

    @Autowired
    private SystemUserMapper systemUserMapper;
    public SysUser findByCount(String account) {
        return systemUserMapper.findByCount(account);
    }


}
