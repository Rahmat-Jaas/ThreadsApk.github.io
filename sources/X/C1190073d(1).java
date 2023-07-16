package X;

/* renamed from: X.73d  reason: invalid class name and case insensitive filesystem */
public final class C1190073d {
    public static final AnonymousClass534 A00 = AnonymousClass533.A00(C75374c7.A00);

    public static final void A00(C147188nY r13, String str, AnonymousClass0YP r15, int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3 = z2;
        boolean z4 = z;
        r13.Cvd(-1801065903);
        int i4 = i2;
        String str2 = str;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r13, str) | i;
        } else {
            i3 = i5;
        }
        AnonymousClass0YP r8 = r15;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r13, r15);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0N(r13, z4);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0O(r13, z3);
        }
        if ((i3 & 5851) != 1170 || !r13.BCM()) {
            if (i6 != 0) {
                z4 = false;
            }
            if (i7 != 0) {
                z3 = false;
            }
            AnonymousClass534 r5 = C1189973c.A00;
            boolean A0y = C147188nY.A0y(r13, str);
            AnonymousClass7W3 r6 = (AnonymousClass7W3) r13;
            Object A13 = r6.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0Q(r6, str, 9);
            }
            AnonymousClass7Ai.A01(r13, r15, new AnonymousClass7DS[]{AnonymousClass7DS.A00(r5, new AnonymousClass7q2(AnonymousClass7W3.A09(r6, A13, false)), true), AnonymousClass7DS.A00(A00, new C133157vD(str, z4, z3), true)}, i3);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8Re(str2, r8, i5, i4, z4, z3));
        }
    }
}
