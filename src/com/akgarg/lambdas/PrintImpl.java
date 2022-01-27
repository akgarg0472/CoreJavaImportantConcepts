package com.akgarg.lambdas;

public class PrintImpl implements IPrint {

    @Override
    public void print(String name) {
        System.out.println("Name entered is: " + name);
    }

}
