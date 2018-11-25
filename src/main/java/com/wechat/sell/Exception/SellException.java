package com.wechat.sell.Exception;

import com.wechat.sell.enums.ResultEnum;

/**
 * @Author: chenchen
 * @Descriptor:
 * @Date: 2018/11/23 21:46
 * @Version 1.0
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
