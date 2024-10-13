package com.scnu.datamanage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scnu.datamanage.mapper.UserMapper;
import com.scnu.datamanage.service.UserService;
import com.scnu.datamanage.entity.User;
import org.springframework.stereotype.Service;

/**
* @author Agenda
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-10-13 20:38:30
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




