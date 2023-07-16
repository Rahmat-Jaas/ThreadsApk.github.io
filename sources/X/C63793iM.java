package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.3iM  reason: invalid class name and case insensitive filesystem */
public final class C63793iM {
    public static boolean A02() {
        return C63173fJ.A05(AnonymousClass0TJ.A05, 18308487805214224L);
    }

    public static boolean A03() {
        return C63173fJ.A05(AnonymousClass0TJ.A05, 18308487805279761L);
    }

    public static boolean A0A(UserSession userSession) {
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36322422458162517L) || C63173fJ.A05(r2, 18306671034964478L) || C63173fJ.A05(r2, 18308487805148687L)) {
            return true;
        }
        return false;
    }

    public static boolean A00() {
        if (A04()) {
            if (A03() || !A04()) {
                return false;
            }
            return C63173fJ.A05(AnonymousClass0TJ.A05, 18307285214305252L);
        } else if (A05()) {
            return A0F(2324149680248461819L);
        } else {
            return true;
        }
    }

    public static boolean A01() {
        AnonymousClass0TJ A0Q = C18200wM.A0Q();
        A0Q.A03 = true;
        AnonymousClass0TJ A00 = AnonymousClass0TJ.A00(A0Q);
        A00.A01 = true;
        AnonymousClass0TJ A002 = AnonymousClass0TJ.A00(A00);
        A002.A02 = true;
        C63173fJ.A01(A002, 18306671034178034L);
        return C18180wK.A1Z(A002.A00.A00, AnonymousClass0TN.SERVER);
    }

    public static boolean A04() {
        if (A02()) {
            return false;
        }
        if (A03()) {
            return true;
        }
        return C63173fJ.A05(AnonymousClass0TJ.A05, 18306671034505719L);
    }

    public static boolean A06() {
        if (A02() || A03() || !A04()) {
            return false;
        }
        return C63173fJ.A05(AnonymousClass0TJ.A05, 18307285214698474L);
    }

    public static boolean A07() {
        long j;
        boolean A04 = A04();
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (A04) {
            j = 18307285214632937L;
        } else {
            j = 18306671035816453L;
        }
        return C63173fJ.A05(r2, j);
    }

    public static boolean A08(UserSession userSession) {
        if (A02() || A03() || A0A(userSession) || A02() || A03() || A0A(userSession)) {
            return false;
        }
        return A0F(18306671034636793L);
    }

    public static boolean A09(UserSession userSession) {
        if (A02() || A03()) {
            return false;
        }
        if (A0A(userSession)) {
            return true;
        }
        return A0F(18306671034178034L);
    }

    public static boolean A0B(UserSession userSession) {
        if (A02() || A03()) {
            return false;
        }
        if (A0A(userSession)) {
            return true;
        }
        return A0F(18306671034440182L);
    }

    public static boolean A0C(UserSession userSession) {
        if (A02()) {
            return false;
        }
        if (A03() || A0A(userSession) || (!A02() && (A03() || (A04() && C63173fJ.A05(AnonymousClass0TJ.A05, 18307285214436326L))))) {
            return true;
        }
        return A0F(18306671034178034L);
    }

    public static boolean A0D(UserSession userSession) {
        if (A02() || A03()) {
            return false;
        }
        if (A0A(userSession)) {
            return true;
        }
        return A0F(18306671034243571L);
    }

    public static boolean A0E(UserSession userSession) {
        if (A02() || A03()) {
            return false;
        }
        if (A0A(userSession) || A04()) {
            return true;
        }
        return A05();
    }

    public static boolean A0F(Long l) {
        long longValue = l.longValue();
        C61823Vx r0 = C61823Vx.A01;
        if (r0 == null) {
            AnonymousClass3X7.A01(longValue);
        } else {
            AnonymousClass3Ie A03 = r0.A03();
            if (A03 != null) {
                A03.A01.A00.Bc7(longValue);
            }
        }
        return C63173fJ.A05(AnonymousClass0TJ.A04, longValue);
    }

    public static boolean A05() {
        AnonymousClass0TJ A0Q = C18200wM.A0Q();
        A0Q.A01 = true;
        AnonymousClass0TJ A00 = AnonymousClass0TJ.A00(A0Q);
        A00.A03 = true;
        return C63173fJ.A05(A00, 18306671034112497L);
    }
}
