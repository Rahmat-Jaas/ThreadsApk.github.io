package X;

/* renamed from: X.6Pv  reason: invalid class name and case insensitive filesystem */
public final class C101086Pv {
    public static int A00(AnonymousClass3HX r0, C127397h3 r1, int i) {
        try {
            if (r0.A03) {
                String A0o = C18220wO.A0o(r1);
                if (A0o != null) {
                    return AnonymousClass7Kk.A04(A0o);
                }
                return i;
            }
            String A0o2 = C18230wP.A0o(r1);
            if (A0o2 != null) {
                return AnonymousClass7Kk.A04(A0o2);
            }
            return i;
        } catch (C29721zB unused) {
            C30967GcS.A02("ThemedColorUtils", "Error parsing themed color");
            return i;
        }
    }
}
