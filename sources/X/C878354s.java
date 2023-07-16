package X;

/* renamed from: X.54s  reason: invalid class name and case insensitive filesystem */
public final class C878354s extends AnonymousClass7YO {
    public static C878354s A01;
    public static final C967466n A02 = C967466n.Ltr;
    public static final C967466n A03 = C967466n.Rtl;
    public AnonymousClass7AW A00;

    private final int A00(C967466n r5, int i) {
        AnonymousClass7AW r0 = this.A00;
        if (r0 != null) {
            int A05 = r0.A05(i);
            AnonymousClass7AW r02 = this.A00;
            if (r02 != null) {
                C967466n A0C = r02.A0C(A05);
                AnonymousClass7AW r1 = this.A00;
                if (r5 != A0C) {
                    if (r1 != null) {
                        return r1.A05(i);
                    }
                } else if (r1 != null) {
                    return r1.A06(i, false) - 1;
                }
            }
        }
        C04220Ms.A0E("layoutResult");
        throw null;
    }

    public final int[] ANN(int i) {
        int i2;
        if (AnonymousClass7YO.A01(this) > 0 && i < AnonymousClass7YO.A01(this)) {
            if (i < 0) {
                AnonymousClass7AW r1 = this.A00;
                if (r1 != null) {
                    i2 = r1.A04(0);
                }
                C04220Ms.A0E("layoutResult");
                throw null;
            }
            AnonymousClass7AW r0 = this.A00;
            if (r0 != null) {
                int A04 = r0.A04(i);
                i2 = A04 + 1;
                if (A00(A03, A04) == i) {
                    i2 = A04;
                }
            }
            C04220Ms.A0E("layoutResult");
            throw null;
            AnonymousClass7AW r02 = this.A00;
            if (r02 != null) {
                if (i2 < r02.A03.A02) {
                    return A03(A00(A03, i2), A00(A02, i2) + 1);
                }
            }
            C04220Ms.A0E("layoutResult");
            throw null;
        }
        return null;
    }

    public final int[] CX4(int i) {
        int i2;
        if (AnonymousClass7YO.A01(this) > 0 && i > 0) {
            if (i > AnonymousClass7YO.A01(this)) {
                AnonymousClass7AW r1 = this.A00;
                if (r1 != null) {
                    i2 = r1.A04(AnonymousClass7YO.A01(this));
                }
                C04220Ms.A0E("layoutResult");
                throw null;
            }
            AnonymousClass7AW r0 = this.A00;
            if (r0 != null) {
                int A04 = r0.A04(i);
                i2 = A04 - 1;
                if (A00(A02, A04) + 1 == i) {
                    i2 = A04;
                }
            }
            C04220Ms.A0E("layoutResult");
            throw null;
            if (i2 >= 0) {
                return A03(A00(A03, i2), A00(A02, i2) + 1);
            }
        }
        return null;
    }
}
