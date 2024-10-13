package com.scnu.datamanage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scnu.datamanage.service.PredictResService;
import com.scnu.datamanage.entity.PredictRes;
import com.scnu.datamanage.mapper.PredictResMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author Agenda
* @description 针对表【predict_res(模型预测信息表)】的数据库操作Service实现
* @createDate 2024-10-13 20:38:30
*/
@Service
public class PredictResServiceImpl extends ServiceImpl<PredictResMapper, PredictRes>
    implements PredictResService {
    @Resource
    private PredictResMapper predictResMapper;
    @Override
    List<PredictRes> getList(){
        return predictResMapper.selectList(null);
    }
}




