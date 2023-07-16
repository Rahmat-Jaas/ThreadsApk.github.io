package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub$Proxy;

/* renamed from: X.7Lw  reason: invalid class name */
public final class AnonymousClass7Lw implements ServiceConnection {
    public final C112276pI A00;
    public final /* synthetic */ AnonymousClass76I A01;

    public AnonymousClass7Lw(AnonymousClass76I r1, C112276pI r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGetInstallReferrerService iGetInstallReferrerService$Stub$Proxy;
        Log.isLoggable("InstallReferrerClient", 2);
        AnonymousClass76I r2 = this.A01;
        if (iBinder == null) {
            iGetInstallReferrerService$Stub$Proxy = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IGetInstallReferrerService)) {
                iGetInstallReferrerService$Stub$Proxy = new IGetInstallReferrerService$Stub$Proxy(iBinder);
            } else {
                iGetInstallReferrerService$Stub$Proxy = (IGetInstallReferrerService) queryLocalInterface;
            }
        }
        r2.A02 = iGetInstallReferrerService$Stub$Proxy;
        r2.A00 = 2;
        this.A00.A00(0);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C86144wL.A1R("Install Referrer service disconnected.");
        AnonymousClass76I r1 = this.A01;
        r1.A02 = null;
        r1.A00 = 0;
    }
}
