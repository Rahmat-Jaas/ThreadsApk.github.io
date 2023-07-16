package X;

/* renamed from: X.7FK  reason: invalid class name */
public final class AnonymousClass7FK {
    public static final C114886u3 A01(C114886u3 r3, C114886u3 r4) {
        if (r3 == null) {
            return r4;
        }
        if (r4 == null) {
            return r3;
        }
        boolean z = r3.A02;
        if (z) {
            return new C114886u3(r4.A01, r3.A00, z);
        }
        return new C114886u3(r3.A01, r4.A00, z);
    }

    public static final boolean A03(AnonymousClass7F6 r4, long j) {
        float f = r4.A01;
        float f2 = r4.A02;
        float A01 = AnonymousClass7KC.A01(j);
        if (f > A01 || A01 > f2) {
            return false;
        }
        float f3 = r4.A03;
        float f4 = r4.A00;
        float A02 = AnonymousClass7KC.A02(j);
        if (f3 > A02 || A02 > f4) {
            return false;
        }
        return true;
    }

    public static final long A00(C114876u2 r10, AnonymousClass7F8 r11, long j, boolean z) {
        C146508mM r3;
        C146508mM Ard;
        int A00;
        long j2;
        int A002;
        C145708kx A02 = r11.A02(r10);
        if (!(A02 == null || (r3 = r11.A03) == null || (Ard = A02.Ard()) == null)) {
            int i = r10.A00;
            if (!z) {
                i--;
            }
            C123197Vu r4 = (C123197Vu) A02;
            AnonymousClass0ZU r8 = r4.A03;
            AnonymousClass7AW r0 = (AnonymousClass7AW) r8.invoke();
            if (r0 == null) {
                A00 = 0;
            } else {
                A00 = C123197Vu.A00(r4, r0);
            }
            if (i <= A00) {
                AnonymousClass7KC r02 = (AnonymousClass7KC) r11.A09.getValue();
                C04220Ms.A0A(r02);
                float A01 = AnonymousClass7KC.A01(Ard.Bay(r3, r02.A00));
                AnonymousClass7AW r82 = (AnonymousClass7AW) r8.invoke();
                if (r82 == null || (A002 = C123197Vu.A00(r4, r82)) < 1) {
                    j2 = C121767Ia.A01;
                } else {
                    int A04 = r82.A04(AnonymousClass8bI.A02(i, 0, A002 - 1));
                    j2 = AnonymousClass6FM.A00(r82.A05(A04), r82.A06(A04, true));
                }
                int A012 = C121767Ia.A01(j2);
                AnonymousClass7F6 AU5 = A02.AU5(A012);
                int A003 = C121767Ia.A00(j2) - 1;
                if (A003 < A012) {
                    A003 = A012;
                }
                AnonymousClass7F6 AU52 = A02.AU5(A003);
                float A013 = AnonymousClass8bI.A01(A01, Math.min(AU5.A01, AU52.A01), Math.max(AU5.A02, AU52.A02));
                if (C86124wJ.A01(A01, A013) <= ((float) (C86104wH.A07(j) >> 1))) {
                    return r3.Bay(Ard, C86104wH.A0C(A013, AnonymousClass7KC.A02(A02.AU5(i).A01())));
                }
            }
        }
        return AnonymousClass7KC.A02;
    }

    public static final AnonymousClass7F6 A02(C146508mM r5) {
        AnonymousClass7F6 A00 = C115896w5.A00(r5);
        long DBA = r5.DBA(C86104wH.A0C(A00.A01, A00.A03));
        long DBA2 = r5.DBA(C86104wH.A0C(A00.A02, A00.A00));
        return new AnonymousClass7F6(AnonymousClass7KC.A01(DBA), AnonymousClass7KC.A02(DBA), AnonymousClass7KC.A01(DBA2), AnonymousClass7KC.A02(DBA2));
    }
}
