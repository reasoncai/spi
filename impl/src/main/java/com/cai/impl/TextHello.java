package com.cai.impl;

import com.cai.spi.HelloInterface;

/**
 * Created by cai on 2017/7/10.
 */
public class TextHello implements HelloInterface{
    @Override
    public void sayHello() {
        System.out.println("text hello");
    }
}
