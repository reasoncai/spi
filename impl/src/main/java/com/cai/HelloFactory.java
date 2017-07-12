package com.cai;

import com.cai.spi.HelloInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by cai on 2017/7/12.
 */
public class HelloFactory {
    private HelloFactory(){

    }

    public static HelloInterface newHello(){
        HelloInterface hi = null;
        ServiceLoader<HelloInterface> loader = ServiceLoader.load(HelloInterface.class);
        Iterator<HelloInterface> helloIn = loader.iterator();
        if (helloIn.hasNext()) {
            hi = helloIn.next();
        }
        return hi;
    }
}
