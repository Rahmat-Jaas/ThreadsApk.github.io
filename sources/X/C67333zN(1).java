package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.user.model.User;

/* renamed from: X.3zN  reason: invalid class name and case insensitive filesystem */
public final class C67333zN implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67333zN.class);
    public static final String __redex_internal_original_name = "BusinessConversionGatingUtil";

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0.booleanValue() != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r0.booleanValue() != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C10300i6 r7) {
        /*
            r4 = 0
            X.C04220Ms.A0B(r7, r4)
            r6 = 0
            boolean r0 = A08(r7, r4)
            r5 = 1
            if (r0 == 0) goto L_0x000d
            return r5
        L_0x000d:
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r7)
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r0)
            java.lang.Boolean r0 = r1.A0i()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            java.lang.Boolean r0 = r1.A0j()
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            java.lang.Integer r0 = r1.A0n()
            if (r0 == 0) goto L_0x0062
            int r1 = r0.intValue()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r0) goto L_0x0062
            if (r3 != 0) goto L_0x0043
            if (r2 == 0) goto L_0x0062
        L_0x0043:
            r0 = 36316692971785503(0x8105d700000d1f, double:3.030161098717509E-306)
            boolean r0 = A06(r7, r0, r5)
            if (r0 == 0) goto L_0x0062
            r0 = 36320936399477158(0x8109b3000019a6, double:3.032844659476624E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            java.lang.Object r0 = A00(r7, r0, r4)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 != 0) goto L_0x0062
            r6 = 1
        L_0x0062:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67333zN.A01(X.0i6):boolean");
    }

    public static final boolean A02(C10300i6 r3) {
        C04220Ms.A0B(r3, 0);
        return A06(r3, 36318836160467723L, false);
    }

    public static final boolean A03(C10300i6 r3) {
        C04220Ms.A0B(r3, 0);
        return A06(r3, 36318836160533260L, false);
    }

    public static final boolean A04(C10300i6 r3) {
        if (r3.isLoggedIn()) {
            User A0Y = AnonymousClass0wJ.A0Y(C05030Qo.A02(r3));
            if (!A0Y.A3a() || !A0Y.A2s() || !A06(r3, 36313214048273764L, true)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A05(C10300i6 r3) {
        C04220Ms.A0B(r3, 0);
        Object A002 = A00(r3, AnonymousClass0e5.A00(36312668587426969L), true);
        C04220Ms.A06(A002);
        if (!AnonymousClass0wJ.A1X(A002) || !A06(r3, 36312672882394266L, true)) {
            return false;
        }
        return true;
    }

    public static final boolean A07(C10300i6 r3, AnonymousClass266 r4, AnonymousClass266 r5, String str, boolean z) {
        C04220Ms.A0B(r3, 0);
        if (!z || str == null || str.length() == 0) {
            return false;
        }
        AnonymousClass266 r0 = AnonymousClass266.A04;
        if ((r4 == r0 || r5 == r0) && A06(r3, 36316851885575522L, true)) {
            return true;
        }
        return false;
    }

    public static final boolean A08(C10300i6 r2, boolean z) {
        C04220Ms.A0B(r2, 0);
        C145478kZ BAd = AnonymousClass0wJ.A0Y(C05030Qo.A02(r2)).A05.BAd();
        if (BAd == null || !BAd.BT7() || !A06(r2, 36320936399608232L, z)) {
            return false;
        }
        return true;
    }

    public static final Object A00(C10300i6 r4, AnonymousClass0e5 r5, boolean z) {
        AnonymousClass0TJ r0;
        long j = r5.mMobileConfigSpecifier;
        Object defaultValue = r5.getDefaultValue();
        if (z) {
            r0 = AnonymousClass0TJ.A05;
        } else {
            r0 = AnonymousClass0TJ.A06;
        }
        return C63803iN.A08(r0, r4, defaultValue, j);
    }

    public static boolean A06(C10300i6 r1, long j, boolean z) {
        Object A002 = A00(r1, AnonymousClass0e5.A00(j), z);
        C04220Ms.A06(A002);
        return ((Boolean) A002).booleanValue();
    }
}
