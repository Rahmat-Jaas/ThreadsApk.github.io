package X;

/* renamed from: X.6Pn  reason: invalid class name and case insensitive filesystem */
public final class C101006Pn {
    public static C127397h3 A00(C127397h3 r4, Integer num, String str) {
        C127397h3 A00;
        if (str == null) {
            return null;
        }
        if (num != null) {
            C130787ql r0 = new C130787ql(new AnonymousClass7r4((long) num.intValue()));
            r4.A0U(r0);
            C127397h3 r02 = r0.A00;
            if (!(r02 == null || (A00 = AnonymousClass7r5.A00(r02, str)) == null)) {
                return A00;
            }
        }
        return AnonymousClass7r5.A00(r4, str);
    }
}
