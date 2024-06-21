package com.ks.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ks.common.R;
import com.ks.entity.UsedCar;
import com.ks.mapper.UsedCarMapper;
import com.ks.service.UsedCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usedCar")
public class UsedCarController {

    @Autowired
    private UsedCarService usedCarService;

    @Autowired
    private UsedCarMapper usedCarMapper;



    @GetMapping("/page")
    public R<Page<UsedCar>> page(int page, int pageSize, Integer saleid){

        Page<UsedCar> pageInfo = new Page<>(page,pageSize);

        LambdaQueryWrapper<UsedCar> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.eq(saleid != null,UsedCar::getSaleid,saleid);

        queryWrapper.orderByDesc(UsedCar::getSaleid);

        usedCarService.page(pageInfo,queryWrapper);

        return R.success(pageInfo);

    }

    @DeleteMapping
    public R<String> delete(@RequestParam List<Long> ids){
        //todo
        usedCarMapper.deleteBatchIds(ids);


        return R.success("删除成功");
    }

    @PostMapping("/add")
    public R<String> add(@RequestBody UsedCar usedCar){

        usedCarService.save(usedCar);

        return R.success("添加成功");

    }

    @PutMapping("/update")
    public R<String> update(@RequestBody UsedCar usedCar){

        usedCarService.updateById(usedCar);

        return R.success("修改成功");

    }









}
