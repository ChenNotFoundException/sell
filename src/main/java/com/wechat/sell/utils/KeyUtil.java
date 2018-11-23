package com.wechat.sell.utils;

import java.util.Random;

/**
 * @Author: chenchen
 * @Descriptor:
 * @Date: 2018/11/23 22:00
 * @Version 1.0
 */
public class KeyUtil {
    /**
     * 生成唯一组件
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(90000) + 10000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
