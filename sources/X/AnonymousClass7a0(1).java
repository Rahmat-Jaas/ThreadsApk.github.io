package X;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.7a0  reason: invalid class name */
public final class AnonymousClass7a0 implements C143158gC {
    public final M5J A00;
    public final AnonymousClass0YY A01;

    public final void onChanged(Object obj) {
        try {
            this.A01.invoke(obj);
        } catch (RemoteException e) {
            Log.wtf("com.facebook.fbpay.w3c.FBPayObservable", "Callback invocation failed", e);
            this.A00.A0F(this);
        }
    }

    public AnonymousClass7a0(M5J m5j, AnonymousClass0YY r2) {
        this.A00 = m5j;
        this.A01 = r2;
    }
}
