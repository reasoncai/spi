package com.cai.impl2;

import com.cai.spi.HelloInterface;

/**
 * Created by cai on 2017/7/10.
 */
public class AvHello implements HelloInterface{
    @Override
    public void sayHello() {
        System.out.println("av hello");
    }
}
