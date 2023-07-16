package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0NP  reason: invalid class name */
public final class AnonymousClass0NP implements C04050Mb {
    public final int A00;
    public final Context A01;

    public final void CWp(C04170Mn r5, AnonymousClass0ND r6) {
        int i;
        C04010Lx A002;
        if (Build.VERSION.SDK_INT >= 30 && (i = this.A00) != 0 && (A002 = C04010Lx.A00(this.A01, i)) != null) {
            r5.A01(AnonymousClass0MU.A1N, A002.A02());
            r5.A01(AnonymousClass0MU.A1M, A002.A01());
            r5.A03(AnonymousClass0MU.A58, A002.A08());
            r5.A01(AnonymousClass0MU.A1P, A002.A03());
            r5.A01(AnonymousClass0MU.A1R, A002.A04());
            r5.A02(AnonymousClass0MU.A1S, Long.valueOf(A002.A07()));
            r5.A03(AnonymousClass0MU.A5A, A002.A0A());
            r5.A00(AnonymousClass0MU.A0P, A002.A0B());
            r5.A03(AnonymousClass0MU.A59, A002.A09());
            r5.A02(AnonymousClass0MU.A1O, Long.valueOf(A002.A05()));
            r5.A02(AnonymousClass0MU.A1Q, Long.valueOf(A002.A06()));
        }
    }

    public AnonymousClass0NP(Context context) {
        this.A01 = context;
        C04370Ni r0 = C04370Ni.A01;
        if (r0 != null) {
            this.A00 = r0.A01();
            return;
        }
        throw new IllegalStateException("Did you call PreviousSessionHelper.init?");
    }

    public final Integer Awy() {
        return AnonymousClass006.A15;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
