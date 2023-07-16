package com.facebook.redex;

import X.C04220Ms;
import X.C06440Zj;
import X.C07140ax;
import X.C07150ay;
import java.lang.Thread;

public class IDxEHandlerShape300S0200000_I2 implements Thread.UncaughtExceptionHandler {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxEHandlerShape300S0200000_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.A02 != 0) {
            C06440Zj r1 = ((C07150ay) this.A00).A04;
            C04220Ms.A0B(thread, 0);
            C04220Ms.A0B(th, 1);
            r1.A00.A4x(thread, th);
        } else {
            C07140ax r12 = (C07140ax) this.A00;
            r12.A01.A4x(thread, th);
            r12.A02(thread, th);
        }
        ((Thread.UncaughtExceptionHandler) this.A01).uncaughtException(thread, th);
    }
}
