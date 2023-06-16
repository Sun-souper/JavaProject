package com.qf.pojo;

import lombok.*;

import java.math.BigDecimal;
@Data
@Getter//生成get方法
@Setter//生成set方法
@NoArgsConstructor//生成无参构造
@AllArgsConstructor//生成有参构造
public class Order {
    private int id;
    private String productName;
    private BigDecimal price;
    private int userId;

    // getter and setter methods
}

