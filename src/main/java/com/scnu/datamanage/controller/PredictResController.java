package com.scnu.datamanage.controller;

import com.scnu.datamanage.entity.PredictRes;
import com.scnu.datamanage.mapper.PredictResMapper;
import com.scnu.datamanage.model.ReturnT;
import com.scnu.datamanage.service.PredictResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController("/predict")
public class PredictResController {
    @Resource
    private PredictResService predictResService;

    @RequestMapping("/list")
    ReturnT<List<PredictRes>> getList(){
        return ReturnT.success(predictResService.getList());
    }
}
