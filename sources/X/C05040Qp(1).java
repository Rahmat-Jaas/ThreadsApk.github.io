package X;

/* renamed from: X.0Qp  reason: invalid class name and case insensitive filesystem */
public final class C05040Qp {
    public static final boolean A00(String str, String str2) {
        C04220Ms.A0B(str2, 1);
        if (str == null) {
            return false;
        }
        if (C04220Ms.A0B(str, 0)) {
            return str.equals(str2);
        }
        Object A0F = AnonymousClass00J.A0F(AnonymousClass8bP.A0e(str, new char[]{':'}, 0));
        if (A0F == null) {
            return false;
        }
        Object A0F2 = AnonymousClass00J.A0F(AnonymousClass8bP.A0e(str2, new char[]{':'}, 0));
        if (A0F2 == null) {
            return false;
        }
        C10450iM.A03("incorrect_usersession_token_format_error", AnonymousClass00U.A0L(str, " passed in follows old format."));
        return A0F.equals(A0F2);
    }
}
