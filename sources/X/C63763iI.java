package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Map;

/* renamed from: X.3iI  reason: invalid class name and case insensitive filesystem */
public final class C63763iI {
    public static int A00(C127397h3 r3) {
        int i;
        int i2 = r3.A03;
        if (AnonymousClass0wJ.A1T(i2, 13647)) {
            i = 44;
        } else if (AnonymousClass0wJ.A1T(i2, 13784)) {
            i = 49;
        } else {
            throw C18190wL.A0a("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return r3.A0H(i, 0);
    }

    public static C121997Jj A01(AnonymousClass601 r3, C127397h3 r4) {
        C109326jp A0L;
        Object obj;
        if (!AnonymousClass0wJ.A1T(r4.A03, 13784) || (A0L = r4.A0L(54)) == null) {
            return null;
        }
        try {
            obj = AnonymousClass70N.A00(C63893iY.A01, r3, A0L);
        } catch (AnonymousClass6C9 e) {
            C30967GcS.A01(r3.A00, "BloksScreenUtils", "Failed executing ACTION_LOADED_SCREEN_PARSE_RESULT, returning empty parse result", e, 0);
            obj = C121997Jj.A03(new C127397h3(13320));
        }
        return (C121997Jj) obj;
    }

    public static C127397h3 A02(C127397h3 r2) {
        int i;
        int i2 = r2.A03;
        if (i2 == 13647) {
            i = 43;
        } else if (AnonymousClass0wJ.A1T(i2, 13784)) {
            i = 38;
        } else {
            throw C18190wL.A0a("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return r2.A0K(i);
    }

    public static C127397h3 A03(C127397h3 r2) {
        int i;
        int i2 = r2.A03;
        if (i2 == 13647) {
            i = 38;
        } else if (AnonymousClass0wJ.A1T(i2, 13784)) {
            C127397h3 A0K = r2.A0K(51);
            if (A0K != null) {
                return A0K;
            }
            i = 41;
        } else {
            throw C18190wL.A0a("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return r2.A0K(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C127397h3 A04(X.C127397h3 r2, int r3) {
        /*
            int r1 = r2.A03
            r0 = 13784(0x35d8, float:1.9315E-41)
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r0)
            if (r0 == 0) goto L_0x002d
            r1 = 42
            android.util.SparseArray r0 = r2.A04
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x002d
            java.util.List r1 = (java.util.List) r1
        L_0x0018:
            java.util.Iterator r2 = r1.iterator()
        L_0x001c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r2.next()
            X.7h3 r1 = (X.C127397h3) r1
            int r0 = r1.A03
            if (r0 != r3) goto L_0x001c
            return r1
        L_0x002d:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0018
        L_0x0032:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63763iI.A04(X.7h3, int):X.7h3");
    }

    public static C109326jp A05(C127397h3 r2) {
        int i;
        int i2 = r2.A03;
        if (i2 == 13647) {
            i = 48;
        } else if (AnonymousClass0wJ.A1T(i2, 13784)) {
            i = 44;
        } else {
            throw C18190wL.A0a("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return r2.A0L(i);
    }

    public static String A06(C127397h3 r2) {
        int i = r2.A03;
        if (i == 13647) {
            String A0o = C18220wO.A0o(r2);
            A0o.getClass();
            return r2.A0O(50, A0o);
        } else if (AnonymousClass0wJ.A1T(i, 13784)) {
            return r2.A0N(43);
        } else {
            throw C18190wL.A0a("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
    }

    public static String A07(C127397h3 r3) {
        String A0N;
        int i = r3.A03;
        if (!AnonymousClass0wJ.A1T(i, 13647)) {
            if (AnonymousClass0wJ.A1T(i, 13784)) {
                C127397h3 A04 = A04(r3, 15855);
                if (A04 != null) {
                    A0N = A04.A0N(40);
                    A0N.getClass();
                    return A0N;
                }
            } else {
                throw C18190wL.A0a("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
        }
        A0N = r3.A0N(35);
        A0N.getClass();
        return A0N;
    }

    public static String A08(C127397h3 r2) {
        if (AnonymousClass0wJ.A1T(r2.A03, 13784)) {
            return r2.A0N(55);
        }
        return null;
    }

    public static String A09(C127397h3 r3) {
        int i;
        int i2 = r3.A03;
        if (AnonymousClass0wJ.A1T(i2, 13647)) {
            i = 40;
        } else if (AnonymousClass0wJ.A1T(i2, 13784)) {
            i = 45;
        } else {
            throw C18190wL.A0a("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        return r3.A0O(i, "0");
    }

    public static Map A0A(AnonymousClass601 r2, C127397h3 r3) {
        if (r3 == null || r2 == null || !AnonymousClass0wJ.A1T(r3.A03, 13784) || r3.A0L(56) == null) {
            return AnonymousClass0wJ.A0y();
        }
        return (Map) C61043Rr.A00(r2, C63893iY.A01, r3.A0L(56));
    }

    public static Map A0B(AnonymousClass601 r2, C127397h3 r3, int i) {
        if (r3 == null || r3.A0L(i) == null) {
            return AnonymousClass0wJ.A0y();
        }
        return (Map) C61043Rr.A00(r2, C63893iY.A01, r3.A0L(i));
    }

    public static boolean A0D(C127397h3 r1) {
        int i = r1.A03;
        if (i == 13647 || AnonymousClass0wJ.A1T(i, 13784)) {
            return true;
        }
        return false;
    }

    public static void A0C(IgBloksScreenConfig igBloksScreenConfig, C127397h3 r2) {
        if (A0D(r2)) {
            igBloksScreenConfig.A0B = A05(r2);
        }
    }
}
