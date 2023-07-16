package X;

import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: X.0PH  reason: invalid class name */
public final class AnonymousClass0PH implements IBinder.DeathRecipient {
    public IBinder A00;
    public IBinder A01;
    public String A02;
    public final /* synthetic */ AnonymousClass0PI A03;

    public AnonymousClass0PH(IBinder iBinder, IBinder iBinder2, AnonymousClass0PI r4, String str) {
        this.A03 = r4;
        this.A02 = str;
        this.A01 = iBinder;
        this.A00 = iBinder2;
        try {
            iBinder2.linkToDeath(this, 0);
        } catch (RemoteException unused) {
            C04790Pd.A00();
        }
    }

    public final void binderDied() {
        AnonymousClass0PI r5 = this.A03;
        C06040Xk r4 = r5.A01.A03;
        C002801h.A02(r4, "Did you call SessionManager.init()?");
        r4.A09(System.currentTimeMillis(), this.A02, true);
        r5.A02.remove(this.A01);
    }
}
