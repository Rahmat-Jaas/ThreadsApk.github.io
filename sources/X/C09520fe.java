package X;

import android.content.BroadcastReceiver;

/* renamed from: X.0fe  reason: invalid class name and case insensitive filesystem */
public final class C09520fe implements Runnable {
    public final /* synthetic */ BroadcastReceiver A00;
    public final /* synthetic */ C11310jt A01;

    public C09520fe(BroadcastReceiver broadcastReceiver, C11310jt r2) {
        this.A01 = r2;
        this.A00 = broadcastReceiver;
    }

    public final void run() {
        this.A01.A05.unregisterReceiver(this.A00);
    }
}
