package X;

import android.os.Looper;
import com.instagram.common.tracer.IDxIHandlerShape135S0100000_2_I2;

/* renamed from: X.80J  reason: invalid class name */
public final class AnonymousClass80J implements Runnable {
    public final /* synthetic */ KK8 A00;

    public AnonymousClass80J(KK8 kk8) {
        this.A00 = kk8;
    }

    public final void run() {
        Looper.myQueue().addIdleHandler(new IDxIHandlerShape135S0100000_2_I2(this));
    }
}
