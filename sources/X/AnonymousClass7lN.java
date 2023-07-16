package X;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.7lN  reason: invalid class name */
public final class AnonymousClass7lN implements C148648rc, C148658rd {
    public AnonymousClass7AL A00;
    public final int A01;
    public final C82664q4 A02;

    public final void Brq(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0.DBq() == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C82664q4 r3) {
        /*
            r2 = this;
            X.7AL r0 = r2.A00
            X.5lJ r0 = (X.C93285lJ) r0
            X.8mQ r0 = r0.A01
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.DBq()
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            X.7AL r0 = r2.A00
            if (r1 == 0) goto L_0x0018
            r3.BrJ(r0)
            return
        L_0x0018:
            X.7lJ r1 = new X.7lJ
            r1.<init>(r2, r3)
            X.5lJ r0 = (X.C93285lJ) r0
            X.7MH r0 = r0.A0C
            r0.A00(r1)
            X.7AL r0 = r2.A00
            X.7lP r1 = new X.7lP
            r1.<init>(r2, r3)
            X.5lJ r0 = (X.C93285lJ) r0
            X.7MH r0 = r0.A0C
            r0.A01(r1)
            X.7AL r0 = r2.A00
            r0.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7lN.A00(X.4q4):void");
    }

    public final void Brh(Bundle bundle) {
        if (this.A01 == 11) {
            AnonymousClass7AL r1 = this.A00;
            C13320nQ.A02(r1, C18170wI.A00(324));
            r1.A04(new AnonymousClass5pO(r1));
        }
        this.A02.BrJ(this.A00);
        AnonymousClass7MH r12 = ((C93285lJ) this.A00).A0C;
        synchronized (r12.A03) {
            if (!r12.A05.remove(this)) {
                String valueOf = String.valueOf(this);
                StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 52);
                A0s.append("unregisterConnectionCallbacks(): listener ");
                A0s.append(valueOf);
                Log.w("GmsClientEvents", C18180wK.A0i(" not found", A0s));
            } else if (r12.A00) {
                r12.A04.add(this);
            }
        }
    }

    public final void Bro(ConnectionResult connectionResult) {
        this.A02.BrJ((Object) null);
    }

    public AnonymousClass7lN(C82664q4 r2, boolean z) {
        this.A01 = z ? 10 : 11;
        this.A02 = r2;
    }
}
