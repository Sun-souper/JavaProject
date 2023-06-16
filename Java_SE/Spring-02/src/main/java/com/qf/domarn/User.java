package com.qf.domarn;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Component
public class User {
    @Value("1")
    private Integer id;
    @Value("小黑")
    private String name;

    public String toString() {
        return "id:" + id + "," + "name:" + name;
    }
}
