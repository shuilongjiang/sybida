package com.sy.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Setter
@Getter
@Component
public class UserInfo implements Serializable {

    private Integer userId;
    private String studentName;
    private Byte userAuthority;
    private String studentPhoto;
    private Integer messageNum;



    }
