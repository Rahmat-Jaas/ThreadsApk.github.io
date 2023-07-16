package com.facebook.redex;

import X.C1374888t;
import java.util.concurrent.ThreadFactory;

public class IDxTFactoryShape1S1000000_2_I2 implements ThreadFactory {
    public String A00;
    public final int A01;

    public IDxTFactoryShape1S1000000_2_I2(String str, int i) {
        this.A01 = i;
        switch (i) {
            case 0:
            case 3:
                this.A00 = str;
                return;
            default:
                this.A00 = str;
                return;
        }
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread;
        int i;
        switch (this.A01) {
            case 0:
                thread = new Thread(runnable, this.A00);
                i = 10;
                break;
            case 3:
                return new Thread(runnable, this.A00);
            case 4:
                return new C1374888t(runnable, this.A00);
            default:
                thread = new Thread(runnable, this.A00);
                i = 3;
                break;
        }
        thread.setPriority(i);
        return thread;
    }
}
