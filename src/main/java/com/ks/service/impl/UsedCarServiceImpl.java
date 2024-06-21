package com.ks.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ks.entity.UsedCar;
import com.ks.mapper.UsedCarMapper;
import com.ks.service.UsedCarService;
import org.springframework.stereotype.Service;

@Service
public class UsedCarServiceImpl extends ServiceImpl<UsedCarMapper, UsedCar> implements UsedCarService {

}
