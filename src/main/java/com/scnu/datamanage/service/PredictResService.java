package com.scnu.datamanage.service;

import com.scnu.datamanage.entity.PredictRes;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Agenda
* @description 针对表【predict_res(模型预测信息表)】的数据库操作Service
* @createDate 2024-10-13 20:38:30
*/
public interface PredictResService extends IService<PredictRes> {
    List<PredictRes> getList();
}
