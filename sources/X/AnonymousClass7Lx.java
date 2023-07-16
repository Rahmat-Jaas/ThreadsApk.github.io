package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.facebook.browser.lite.callback.IDxSRunnableShape80S0100000_2_I2;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7Lx  reason: invalid class name */
public final class AnonymousClass7Lx implements ServiceConnection {
    public final /* synthetic */ AnonymousClass7Ep A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass7Lx(AnonymousClass7Ep r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BrowserLiteCallback proxy;
        AnonymousClass7Ep r3 = this.A00;
        if (iBinder == null) {
            proxy = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BrowserLiteCallback)) {
                proxy = new BrowserLiteCallback.Stub.Proxy(iBinder);
            } else {
                proxy = (BrowserLiteCallback) queryLocalInterface;
            }
        }
        r3.A06 = proxy;
        C36385JSu jSu = r3.A05;
        if (jSu != null) {
            HashSet hashSet = null;
            if (proxy != null) {
                try {
                    List B2o = proxy.B2o();
                    if (B2o != null) {
                        hashSet = new HashSet(B2o);
                    }
                } catch (RemoteException unused) {
                }
            }
            jSu.A00(hashSet);
        }
        if (this.A01) {
            AnonymousClass7Ep.A01(new IDxSRunnableShape80S0100000_2_I2(r3, 1), r3);
        }
        synchronized (r3) {
            if (r3.A04 != null) {
                AnonymousClass0MI.A06(AnonymousClass0MU.A6N, "alive");
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        AnonymousClass7Ep r3 = this.A00;
        synchronized (r3) {
            C104346bd r2 = r3.A04;
            if (r2 != null) {
                AnonymousClass0MI.A06(AnonymousClass0MU.A6N, "dead");
                int i = r2.A00 + 1;
                r2.A00 = i;
                AnonymousClass0MI.A06(AnonymousClass0MU.A6M, String.valueOf(i));
            }
        }
        r3.A06 = null;
    }
}
