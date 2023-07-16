package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;

/* renamed from: X.0u5  reason: invalid class name and case insensitive filesystem */
public final class C16970u5 implements ServiceConnection {
    public final /* synthetic */ C16950u2 A00;

    public C16970u5(C16950u2 r1) {
        this.A00 = r1;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IFbnsAIDLService proxy;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            AnonymousClass0LU.A0B("FbnsAIDLClientManager", "This operation should be run on UI thread");
        }
        C16950u2 r2 = this.A00;
        if (iBinder == null) {
            proxy = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.push.fbns.ipc.IFbnsAIDLService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFbnsAIDLService)) {
                proxy = new IFbnsAIDLService.Stub.Proxy(iBinder);
            } else {
                proxy = (IFbnsAIDLService) queryLocalInterface;
            }
        }
        synchronized (r2) {
            r2.A01 = proxy;
            r2.A02 = AnonymousClass006.A0C;
            r2.notifyAll();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            AnonymousClass0LU.A0B("FbnsAIDLClientManager", "This operation should be run on UI thread");
        }
        C16950u2 r1 = this.A00;
        synchronized (r1) {
            r1.A01 = null;
            r1.A02 = AnonymousClass006.A00;
        }
    }
}
