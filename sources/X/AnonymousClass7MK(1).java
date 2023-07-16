package X;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* renamed from: X.7MK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7MK implements IBinder.DeathRecipient {
    public final /* synthetic */ C121087Eb A00;

    public /* synthetic */ AnonymousClass7MK(C121087Eb r1) {
        this.A00 = r1;
    }

    public final void binderDied() {
        C121087Eb r5 = this.A00;
        AnonymousClass78d r2 = r5.A06;
        r2.A01("reportBinderDeath", C86164wN.A1T());
        r5.A0A.get();
        String str = r5.A09;
        r2.A01("%s : Binder has died.", str);
        List<AnonymousClass83L> list = r5.A0B;
        for (AnonymousClass83L r0 : list) {
            RemoteException A0H = C86144wL.A0H(str);
            C111836oV r02 = r0.A00;
            if (r02 != null) {
                r02.A00(A0H);
            }
        }
        list.clear();
        C121087Eb.A00(r5);
    }
}
