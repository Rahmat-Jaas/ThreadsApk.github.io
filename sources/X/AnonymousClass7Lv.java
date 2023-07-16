package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.ar.core.dependencies.g;

/* renamed from: X.7Lv  reason: invalid class name */
public final class AnonymousClass7Lv implements ServiceConnection {
    public final /* synthetic */ C1196476g A00;

    public AnonymousClass7Lv(C1196476g r1) {
        this.A00 = r1;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        g gVar;
        C1196476g r2 = this.A00;
        synchronized (r2) {
            if (iBinder == null) {
                gVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
                if (queryLocalInterface instanceof g) {
                    gVar = (g) queryLocalInterface;
                } else {
                    gVar = new g(iBinder);
                }
            }
            r2.A01 = gVar;
            r2.A04 = 3;
            for (Runnable run : r2.A03) {
                run.run();
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C1196476g r1 = this.A00;
        synchronized (r1) {
            r1.A04 = 1;
            r1.A01 = null;
        }
    }
}
