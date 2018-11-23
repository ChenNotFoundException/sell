package com.wechat.sell.VO;

import lombok.Data;

/**
 * @Author: chenchen
 * @Descriptor: http请求返回的最外层对象
 * @Date: 2018/11/21 22:11
 * @Version 1.0
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 信息
     */
    private String msg;
    /**
     * 返回具体内容
     */
    private T data;


}
