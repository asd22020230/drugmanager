package com.drug.dao;

import com.drug.pojo.Menu;
import org.apache.ibatis.annotations.Insert;

public interface MenuMapper {
    @Insert({
        "insert into menuinfo (ordernum, column_2, ",
        "f_ordernum, menuname, ",
        "information, explain, ",
        "picturesrc, linksrc, ",
        "column_9, targetwindow, ",
        "statu)",
        "values (#{ordernum,jdbcType=INTEGER}, #{column2,jdbcType=INTEGER}, ",
        "#{fOrdernum,jdbcType=INTEGER}, #{menuname,jdbcType=VARCHAR}, ",
        "#{information,jdbcType=VARCHAR}, #{explain,jdbcType=VARCHAR}, ",
        "#{picturesrc,jdbcType=VARCHAR}, #{linksrc,jdbcType=VARCHAR}, ",
        "#{column9,jdbcType=INTEGER}, #{targetwindow,jdbcType=VARCHAR}, ",
        "#{statu,jdbcType=VARCHAR})"
    })
    int insert(Menu record);

    int insertSelective(Menu record);
}