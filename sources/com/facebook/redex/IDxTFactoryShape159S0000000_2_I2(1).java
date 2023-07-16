package com.facebook.redex;

import java.util.concurrent.ThreadFactory;

public class IDxTFactoryShape159S0000000_2_I2 implements ThreadFactory {
    public final int A00;

    public IDxTFactoryShape159S0000000_2_I2(int i) {
        this.A00 = i;
    }

    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.A00 != 0) {
            str = "com.facebook.papaya.random_thread";
        } else {
            str = "com.facebook.papaya.scheduling_thread";
        }
        return new Thread(runnable, str);
    }
}
