package com.qf.pojo;

import lombok.*;


@Data
@Getter//生成get方法
@Setter//生成set方法
@NoArgsConstructor//生成无参构造
@AllArgsConstructor//生成有参构造
public class Account {
    private Integer id;
    private String name;
    private Float money;
}
