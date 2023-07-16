package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.0fd  reason: invalid class name and case insensitive filesystem */
public final class C09510fd implements Runnable {
    public final /* synthetic */ BroadcastReceiver A00;
    public final /* synthetic */ IntentFilter A01;
    public final /* synthetic */ C11310jt A02;

    public C09510fd(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, C11310jt r3) {
        this.A02 = r3;
        this.A00 = broadcastReceiver;
        this.A01 = intentFilter;
    }

    public final void run() {
        this.A02.A05.registerReceiver(this.A00, this.A01);
    }
}
