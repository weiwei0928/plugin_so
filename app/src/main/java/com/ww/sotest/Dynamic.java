package com.ww.sotest;

public class Dynamic {

    static {
        System.loadLibrary("dynamic");
    }

    public native static int add(int num1,int num2);

}
