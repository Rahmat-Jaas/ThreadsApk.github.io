package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass7GP;
import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

public class IDxExecutorShape577S0100000_2_I2 implements Executor {
    public Object A00;
    public final int A01;

    public IDxExecutorShape577S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void execute(Runnable runnable) {
        Handler A002;
        switch (this.A01) {
            case 0:
                ((Choreographer) this.A00).postFrameCallback(new IDxFCallbackShape472S0100000_2_I2(runnable, 0));
                return;
            case 4:
                A002 = AnonymousClass7GP.A00();
                break;
            default:
                A002 = AnonymousClass0wJ.A0F();
                break;
        }
        A002.post(runnable);
    }
}
