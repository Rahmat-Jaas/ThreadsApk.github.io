package X;

/* renamed from: X.3fJ  reason: invalid class name and case insensitive filesystem */
public final class C63173fJ {
    public static C07810cE A00(long j) {
        C61823Vx r0 = C61823Vx.A01;
        if (r0 == null) {
            AnonymousClass3X7.A01(j);
            return null;
        }
        AnonymousClass3Ie A03 = r0.A03();
        if (A03 != null) {
            return A03.A01.A00;
        }
        return null;
    }

    public static Object A03(AnonymousClass0TJ r3, Object obj, long j) {
        AnonymousClass3Ie A03;
        boolean z;
        C61823Vx r0 = C61823Vx.A01;
        if (r0 == null) {
            AnonymousClass3X7.A01(j);
            A03 = null;
        } else {
            A03 = r0.A03();
        }
        if (A03 != null) {
            try {
                obj = A03.A02(j, obj);
                if (!z) {
                    return obj;
                }
            } finally {
                if (!r3.A03) {
                    A03.A01.A00.Bc7(j);
                }
            }
        }
        return obj;
    }

    public static Boolean A01(AnonymousClass0TJ r2, long j) {
        boolean ATv;
        C07810cE A00 = A00(j);
        if (A00 == null) {
            ATv = C18180wK.A1W((((j >>> 61) & 1) > 1 ? 1 : (((j >>> 61) & 1) == 1 ? 0 : -1)));
        } else {
            ATv = A00.ATv(r2, j);
        }
        return Boolean.valueOf(ATv);
    }

    public static Long A02(AnonymousClass0TJ r1, long j) {
        long AtA;
        C07810cE A00 = A00(j);
        if (A00 == null) {
            AtA = AnonymousClass0U4.A01(j);
        } else {
            AtA = A00.AtA(r1, j);
        }
        return Long.valueOf(AtA);
    }

    public static String A04(AnonymousClass0TJ r1, long j) {
        C07810cE A00 = A00(j);
        if (A00 == null) {
            return AnonymousClass0U4.A02(j);
        }
        return A00.BET(r1, j);
    }

    public static boolean A05(AnonymousClass0TJ r0, long j) {
        return A01(r0, j).booleanValue();
    }
}
