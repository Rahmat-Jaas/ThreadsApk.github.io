package X;

/* renamed from: X.3ZV  reason: invalid class name */
public final class AnonymousClass3ZV {
    public static boolean A03(AnonymousClass0TJ r3, Object obj, Object obj2, String str) {
        AnonymousClass0TN r1;
        if (obj.equals(obj2) || (r1 = r3.A00.A00) == AnonymousClass0TN.OVERRIDE) {
            return true;
        }
        AnonymousClass0LU.A0P("MobileConfigTranslationTableVerifier", "Failed to verify mobileconfig_verify_tt.%s, expected:%s, actual:%s. actual_src:%s, using new resource file:%s", str, obj, obj2, r1, true);
        return false;
    }

    public static boolean A00(C07810cE r3, C84594tV r4, String str, long j) {
        boolean ATq = r4.ATq(j);
        AnonymousClass0TJ A0Q = C18200wM.A0Q();
        A0Q.A02 = true;
        return A03(A0Q, Boolean.valueOf(ATq), Boolean.valueOf(r3.ATv(A0Q, j)), str);
    }

    public static boolean A01(C07810cE r7, C84594tV r8, String str, long j) {
        double Adq = r8.Adq(j);
        AnonymousClass0TJ A0Q = C18200wM.A0Q();
        A0Q.A02 = true;
        return A03(A0Q, Double.valueOf(Adq), Double.valueOf(r7.Adv(A0Q, j)), str);
    }

    public static boolean A02(C07810cE r7, C84594tV r8, String str, long j) {
        long At4 = r8.At4(j);
        AnonymousClass0TJ A0Q = C18200wM.A0Q();
        A0Q.A02 = true;
        return A03(A0Q, Long.valueOf(At4), Long.valueOf(r7.AtA(A0Q, j)), str);
    }
}
