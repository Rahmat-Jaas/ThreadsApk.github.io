package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3iN  reason: invalid class name and case insensitive filesystem */
public final class C63803iN {
    public static final Object A08(AnonymousClass0TJ r3, C10300i6 r4, Object obj, long j) {
        boolean z;
        C04220Ms.A0B(r3, 3);
        C61823Vx r1 = C61823Vx.A01;
        AnonymousClass3Ie r2 = null;
        if (r1 == null) {
            AnonymousClass3X7.A01(j);
        } else if (r4 instanceof UserSession) {
            r2 = r1.A04((UserSession) r4);
        }
        if (r2 != null) {
            try {
                obj = r2.A02(j, obj);
                C04220Ms.A0A(obj);
                if (!z) {
                    return obj;
                }
            } finally {
                if (!r3.A03) {
                    r2.A01.A00.Bc7(j);
                }
            }
        }
        return obj;
    }

    public static final C07810cE A04(C10300i6 r2, long j) {
        AnonymousClass3Ie A04;
        C61823Vx r1 = C61823Vx.A01;
        if (r1 == null) {
            AnonymousClass3X7.A01(j);
            return null;
        } else if (!(r2 instanceof UserSession) || (A04 = r1.A04((UserSession) r2)) == null) {
            return null;
        } else {
            return A04.A01.A00;
        }
    }

    public static final void A0D(UserSession userSession, long j) {
        AnonymousClass3Ie A04;
        C61823Vx r0 = C61823Vx.A01;
        if (r0 == null) {
            AnonymousClass3X7.A01(j);
        } else if (userSession != null && (A04 = r0.A04(userSession)) != null) {
            A04.A01.A00.Bc7(j);
        }
    }

    public static boolean A0F(C10300i6 r3) {
        return A0E(AnonymousClass0TJ.A05, r3, 36325317266121774L);
    }

    public static final double A00(AnonymousClass0TJ r1, C10300i6 r2, long j) {
        C07810cE A04 = A04(r2, j);
        if (A04 == null) {
            return AnonymousClass0U4.A00(j);
        }
        return A04.Adv(r1, j);
    }

    public static int A01(AnonymousClass0TJ r0, C10300i6 r1, long j) {
        return (int) A03(r0, r1, j);
    }

    public static final long A03(AnonymousClass0TJ r1, C10300i6 r2, long j) {
        C07810cE A04 = A04(r2, j);
        if (A04 == null) {
            return AnonymousClass0U4.A01(j);
        }
        return A04.AtA(r1, j);
    }

    public static Boolean A05(AnonymousClass0TJ r0, C10300i6 r1, long j) {
        return Boolean.valueOf(A0E(r0, r1, j));
    }

    public static Double A06(AnonymousClass0TJ r0, C10300i6 r1, long j) {
        return Double.valueOf(A00(r0, r1, j));
    }

    public static Long A07(AnonymousClass0TJ r0, C10300i6 r1, long j) {
        return Long.valueOf(A03(r0, r1, j));
    }

    public static final String A0C(AnonymousClass0TJ r1, C10300i6 r2, long j) {
        String BET;
        C07810cE A04 = A04(r2, j);
        if (A04 == null) {
            BET = AnonymousClass0U4.A02(j);
        } else {
            BET = A04.BET(r1, j);
        }
        C04220Ms.A06(BET);
        return BET;
    }

    public static final boolean A0E(AnonymousClass0TJ r1, C10300i6 r2, long j) {
        C07810cE A04 = A04(r2, j);
        if (A04 == null) {
            return C18180wK.A1W((((j >>> 61) & 1) > 1 ? 1 : (((j >>> 61) & 1) == 1 ? 0 : -1)));
        }
        return A04.ATv(r1, j);
    }

    public static int A02(AnonymousClass0TJ r2, UserSession userSession) {
        if (A0E(r2, userSession, 36325317266121774L)) {
            return C49222r2.A00(userSession).A00();
        }
        return C63073bQ.A00(userSession).A00;
    }

    public static String A09(AnonymousClass0TJ r2, C10300i6 r3) {
        return A0C(r2, r3, 36875485397188688L);
    }

    public static String A0A(AnonymousClass0TJ r2, C10300i6 r3) {
        return A0C(r2, r3, 36875485397319761L);
    }

    public static String A0B(AnonymousClass0TJ r2, C10300i6 r3) {
        return A0C(r2, r3, 36875485397450834L);
    }
}
