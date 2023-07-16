package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Binder;

/* renamed from: X.7zC  reason: invalid class name and case insensitive filesystem */
public final class C135297zC implements Runnable {
    public final /* synthetic */ ServiceConnection A00;

    public C135297zC(ServiceConnection serviceConnection) {
        this.A00 = serviceConnection;
    }

    public final void run() {
        this.A00.onServiceConnected(new ComponentName("", ""), new Binder());
    }
}
