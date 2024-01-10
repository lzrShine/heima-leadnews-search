package com.heima.model.wemedia.dtos;


import lombok.Data;

/**
 * @author 梁峥嵘
 */
@Data
public class WmLoginDto {

    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
}
