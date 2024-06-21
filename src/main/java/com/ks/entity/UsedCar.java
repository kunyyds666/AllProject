package com.ks.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.databind.node.DecimalNode;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Data
public class UsedCar implements Serializable {
    @TableId
    private Long saleid;

    private String name;
    private String regdate;
    private String model;
    private String brand;
    private String bodytype;
    private String fueltype;
    private String gearbox;
    private Integer power;
    private Integer kilometer;
    private String notrepaireddamage;
    private String regioncode;
    private String createdate;
    private BigDecimal price;


}
