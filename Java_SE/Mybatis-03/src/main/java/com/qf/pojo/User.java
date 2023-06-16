package com.qf.pojo;

import lombok.*;

import java.util.List;

@Data
@Getter//生成get方法
@Setter//生成set方法
@NoArgsConstructor//生成无参构造
@AllArgsConstructor//生成有参构造
public class User {
    private int id;
    private String name;
    private List<Order> orders;
}
