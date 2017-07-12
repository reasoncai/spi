package com.cai;

import com.cai.spi.HelloInterface;

import java.util.ServiceLoader;

/**
 * Created by cai on 2017/7/10.
 */
public class Main {
    public static void main(String[] args) {

        ServiceLoader<HelloInterface> loaders =
                ServiceLoader.load(HelloInterface.class);

        for (HelloInterface in : loaders) {
            in.sayHello();
        }

        HelloInterface helloInterface = HelloFactory.newHello();
        helloInterface.sayHello();
    }
}
