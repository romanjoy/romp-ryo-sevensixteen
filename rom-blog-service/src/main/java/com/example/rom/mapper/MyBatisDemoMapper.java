package com.example.rom.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import mybatisplus.demo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyBatisDemoMapper extends BaseMapper<User> {

}
