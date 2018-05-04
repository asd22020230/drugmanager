package com.drug.dao;

import com.drug.pojo.SysUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemUserMapper {
    @Select("select * from sysuser where account=#{account}")
    SysUser findByCount(String userid);
}
