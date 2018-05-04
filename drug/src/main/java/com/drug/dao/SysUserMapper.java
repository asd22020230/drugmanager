package com.drug.dao;


import com.drug.pojo.SysUser;
import org.apache.ibatis.annotations.Insert;

public interface SysUserMapper {
    @Insert({
        "insert into sysuser (sysuser_id, account, ",
        "password, userstate, ",
        "userpicture)",
        "values (#{sysuserId,jdbcType=INTEGER}, #{account,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{userstate,jdbcType=CHAR}, ",
        "#{userpicture,jdbcType=INTEGER})"
    })
    int insert(SysUser record);

    int insertSelective(SysUser record);
}