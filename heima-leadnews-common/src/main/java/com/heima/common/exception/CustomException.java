package com.heima.common.exception;

import com.heima.model.common.enums.AppHttpCodeEnum;

/**
 * @author 梁峥嵘
 */
public class CustomException extends RuntimeException {

    private AppHttpCodeEnum appHttpCodeEnum;

    public CustomException(AppHttpCodeEnum appHttpCodeEnum){
        this.appHttpCodeEnum = appHttpCodeEnum;
    }

    public AppHttpCodeEnum getAppHttpCodeEnum() {
        return appHttpCodeEnum;
    }
}
