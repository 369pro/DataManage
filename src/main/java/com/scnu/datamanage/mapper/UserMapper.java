package com.scnu.datamanage.mapper;

import com.scnu.datamanage.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Agenda
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-10-13 20:38:30
* @Entity generator.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




