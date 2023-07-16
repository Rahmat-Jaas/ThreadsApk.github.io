package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7GL  reason: invalid class name */
public final class AnonymousClass7GL {
    public static final AnonymousClass7GL A00 = new AnonymousClass7GL();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.service.session.UserSession r4, java.lang.Integer r5) {
        /*
            r0 = 1
            X.C04220Ms.A0B(r5, r0)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36317745239953374(0x8106cc00120fde, double:3.030826557344015E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            r2 = 1
            if (r0 == 0) goto L_0x001c
            java.lang.Integer r0 = X.AnonymousClass006.A0u
            if (r5 == r0) goto L_0x001a
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r5 != r0) goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            return r2
        L_0x001c:
            boolean r0 = X.C18756Aks.A01(r5)
            if (r0 == 0) goto L_0x001a
            r0 = 36317745239035861(0x8106cc00040fd5, double:3.030826556763776E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            if (r0 == 0) goto L_0x001a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7GL.A01(com.instagram.service.session.UserSession, java.lang.Integer):boolean");
    }

    public static final int A00(UserSession userSession) {
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        int min = Math.min(C63803iN.A01(r3, userSession, 36593108477608768L), C63803iN.A01(r3, userSession, 36605301889175960L));
        if (min <= 0) {
            return 4;
        }
        return min;
    }
}
