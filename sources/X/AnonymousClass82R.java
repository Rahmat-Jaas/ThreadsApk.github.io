package X;

import android.content.Intent;

/* renamed from: X.82R  reason: invalid class name */
public final class AnonymousClass82R implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ C86254wp A02;

    public AnonymousClass82R(Intent intent, Intent intent2, C86254wp r3) {
        this.A02 = r3;
        this.A00 = intent;
        this.A01 = intent2;
    }

    public final void run() {
        C86254wp r1 = this.A02;
        r1.A01(this.A00);
        C86254wp.A00(this.A01, r1);
    }
}
