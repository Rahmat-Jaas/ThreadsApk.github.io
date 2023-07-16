package X;

/* renamed from: X.6vs  reason: invalid class name and case insensitive filesystem */
public final class C115766vs {
    public static final int A00(AnonymousClass7F6 r3, AnonymousClass7AW r4, long j) {
        int length = r4.A04.A03.length();
        if (r3.A05(j)) {
            return AnonymousClass8bI.A02(r4.A07(j), 0, length);
        }
        if (AnonymousClass69D.A01.A00(r3, j) < 0) {
            return 0;
        }
        return length;
    }

    public static final C114886u3 A01(AnonymousClass7AW r4, long j, long j2, boolean z) {
        int A07 = C86104wH.A07(j);
        C114876u2 r3 = new C114876u2(r4.A0B(A07), A07, j2);
        int A08 = C86104wH.A08(j);
        return new C114886u3(r3, new C114876u2(r4.A0B(Math.max(A08 - 1, 0)), A08, j2), z);
    }
}
