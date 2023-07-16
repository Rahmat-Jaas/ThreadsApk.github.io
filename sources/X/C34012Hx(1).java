package X;

import java.util.List;

/* renamed from: X.2Hx  reason: invalid class name and case insensitive filesystem */
public final class C34012Hx {
    /* JADX WARNING: type inference failed for: r4v0, types: [boolean, int] */
    public static final Object A00(AnonymousClass601 r7, C63893iY r8) {
        boolean z;
        ? A1Z = AnonymousClass0wJ.A1Z(r8, r7);
        List list = r8.A00;
        if (list.size() > A1Z) {
            Object obj = list.get(A1Z);
            C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
            z = AnonymousClass0wJ.A1X(obj);
        } else {
            z = false;
        }
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(C63913ic.A05(r7), C63913ic.A0F(r7));
        AnonymousClass3WJ.A02();
        A0Q.A03 = AnonymousClass2OG.A00(8, A1Z, false, !z, false, z);
        A0Q.A05();
        return null;
    }
}
