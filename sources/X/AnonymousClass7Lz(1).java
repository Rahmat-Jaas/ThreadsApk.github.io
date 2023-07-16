package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.fbpay.w3c.FBPaymentService;

/* renamed from: X.7Lz  reason: invalid class name */
public final class AnonymousClass7Lz implements ServiceConnection {
    public final /* synthetic */ C002301a A00;
    public final /* synthetic */ AnonymousClass7IX A01;

    public AnonymousClass7Lz(C002301a r1, AnonymousClass7IX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            AnonymousClass7IX r2 = this.A01;
            synchronized (r2) {
                r2.A01 = iBinder;
            }
            this.A00.accept(iBinder);
            FBPaymentService.Stub.A00(iBinder).A5l(r2.A07);
            FBPaymentService.Stub.A00(iBinder).A5Z(r2.A06);
            FBPaymentService.Stub.A00(iBinder).A5q(r2.A08);
        } catch (RemoteException unused) {
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        AnonymousClass7IX r1 = this.A01;
        synchronized (r1) {
            r1.A00 = null;
            r1.A01 = null;
        }
    }
}
