package X;

import android.content.Context;

/* renamed from: X.40n  reason: invalid class name and case insensitive filesystem */
public final class C677840n implements Mcm {
    public final /* synthetic */ C81844oU A00;
    public final /* synthetic */ AnonymousClass3HX A01;

    public C677840n(C81844oU r1, AnonymousClass3HX r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        C81844oU r1;
        C127397h3 A0K = ((C127397h3) obj2).A0K(36);
        C127387h2 r7 = (C127387h2) obj3;
        if (A0K == null || (r1 = this.A00) == null) {
            return null;
        }
        r1.C8d(r7, this.A01, A0K);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        C127397h3 A0K = ((C127397h3) obj).A0K(36);
        C127397h3 A0K2 = ((C127397h3) obj2).A0K(36);
        if (A0K == A0K2) {
            return false;
        }
        if (A0K != null) {
            return !A0K.equals(A0K2);
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
