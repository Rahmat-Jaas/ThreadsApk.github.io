package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3kM  reason: invalid class name and case insensitive filesystem */
public final class C64373kM implements ServiceConnection {
    public AtomicBoolean A00 = C18230wP.A0w();
    public final BlockingQueue A01 = new LinkedBlockingDeque();

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.A01.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }
}
