package com.example.csa_spingboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class consumer extends BaseEntity{
    private Integer id;
    private String username;
    private String password;
    private Integer sex;
    private String phoneNum;
    private String email;
    private LocalDateTime birth;
    private String introduction;
    private String location;
    private String avatar;
}
