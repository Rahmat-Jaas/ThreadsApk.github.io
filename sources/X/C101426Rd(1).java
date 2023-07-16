package X;

/* renamed from: X.6Rd  reason: invalid class name and case insensitive filesystem */
public final class C101426Rd {
    public static final String A00(String str) {
        C04220Ms.A0B(str, 0);
        if (C18180wK.A1W(str.length()) || !AnonymousClass8bP.A0j(str, ";", false) || !AnonymousClass8bP.A0j(str, "thread_id:", false)) {
            return "";
        }
        for (String str2 : C18190wL.A1b(str, ";", 0)) {
            if (AnonymousClass8bP.A0j(str2, "thread_id:", false)) {
                return C18190wL.A1b(str2, "thread_id:", 0)[1];
            }
        }
        return "";
    }
}
