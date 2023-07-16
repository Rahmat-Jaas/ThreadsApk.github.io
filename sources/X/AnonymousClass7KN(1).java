package X;

/* renamed from: X.7KN  reason: invalid class name */
public final class AnonymousClass7KN {
    public static final AnonymousClass7JE A00 = new AnonymousClass7JE();

    public static float A00(C127397h3 r2, float f, int i, boolean z) {
        String A0m = C86114wI.A0m(r2.A04, i);
        if (A0m == null || (z && A0m.equals("auto"))) {
            return Float.NaN;
        }
        try {
            if (C86144wL.A1Y(A0m)) {
                return AnonymousClass7Kk.A00(A0m) * 0.01f * f;
            }
            return AnonymousClass7Kk.A01(A0m);
        } catch (C29721zB e) {
            A07("Error parsing size dimension value", e);
            return Float.NaN;
        }
    }

    public static float A01(C127397h3 r1, int i) {
        String A0m = C86114wI.A0m(r1.A04, i);
        if (A0m == null) {
            return Float.NaN;
        }
        try {
            return AnonymousClass7Kk.A01(A0m);
        } catch (C29721zB e) {
            A07("Error parsing padding value", e);
            return Float.NaN;
        }
    }

    public static C127397h3 A02(C143468gn r3) {
        if (!(r3 instanceof C127397h3)) {
            return null;
        }
        C127397h3 r32 = (C127397h3) r3;
        if (r32.A0K(132) == null || r32.A0K(132).A03 != 13368) {
            return null;
        }
        return r32.A0K(132);
    }

    public static void A06(AnonymousClass7JE r2, Integer num, float[] fArr, float f, int i) {
        int i2 = i + 1;
        r2.A00 = i2;
        fArr[i] = (float) AnonymousClass7B6.A00(num);
        r2.A00 = i2 + 1;
        fArr[i2] = f;
    }

    public static void A07(String str, Throwable th) {
        C30967GcS.A01((AnonymousClass3HX) null, "BloksFlexLayoutProvider", str, th, 0);
    }

    public static void A03(M1O m1o, Integer num, String str) {
        float A01;
        float[] fArr;
        int i;
        try {
            if (C86144wL.A1Y(str)) {
                A01 = AnonymousClass7Kk.A00(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    M1O.A00(m1o, 3);
                    fArr = m1o.A01;
                    int i2 = m1o.A00;
                    int i3 = i2 + 1;
                    m1o.A00 = i3;
                    fArr[i2] = (float) 8;
                    i = i3 + 1;
                    m1o.A00 = i;
                    fArr[i3] = (float) AnonymousClass7B6.A00(num);
                } else {
                    return;
                }
            } else {
                A01 = AnonymousClass7Kk.A01(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    M1O.A00(m1o, 3);
                    fArr = m1o.A01;
                    int i4 = m1o.A00;
                    int i5 = i4 + 1;
                    m1o.A00 = i5;
                    fArr[i4] = (float) 7;
                    i = i5 + 1;
                    m1o.A00 = i;
                    fArr[i5] = (float) AnonymousClass7B6.A00(num);
                } else {
                    return;
                }
            }
            m1o.A00 = i + 1;
            fArr[i] = A01;
        } catch (C29721zB e) {
            A07("Error parsing padding value", e);
        }
    }

    public static void A04(AnonymousClass7JE r5, Integer num, String str) {
        try {
            if (C86144wL.A1Y(str)) {
                float A002 = AnonymousClass7Kk.A00(str);
                if (!AnonymousClass7JE.A02(A002)) {
                    AnonymousClass7JE.A00(r5, 3);
                    float[] fArr = r5.A01;
                    int i = r5.A00;
                    int i2 = i + 1;
                    r5.A00 = i2;
                    fArr[i] = (float) 25;
                    A06(r5, num, fArr, A002, i2);
                }
            } else if (str.equals("auto")) {
                float[] A03 = AnonymousClass7JE.A03(r5);
                int i3 = r5.A00;
                int i4 = i3 + 1;
                r5.A00 = i4;
                A03[i3] = (float) 26;
                r5.A00 = i4 + 1;
                A03[i4] = (float) AnonymousClass7B6.A00(num);
            } else {
                float A01 = AnonymousClass7Kk.A01(str);
                if (!AnonymousClass7JE.A02(A01)) {
                    AnonymousClass7JE.A00(r5, 3);
                    float[] fArr2 = r5.A01;
                    int i5 = r5.A00;
                    int i6 = i5 + 1;
                    r5.A00 = i6;
                    fArr2[i5] = (float) 24;
                    A06(r5, num, fArr2, A01, i6);
                }
            }
        } catch (C29721zB e) {
            A07("Error parsing margin value", e);
        }
    }

    public static void A05(AnonymousClass7JE r5, Integer num, String str) {
        try {
            if (C86144wL.A1Y(str)) {
                float A002 = AnonymousClass7Kk.A00(str);
                if (!AnonymousClass7JE.A02(A002)) {
                    AnonymousClass7JE.A00(r5, 3);
                    float[] fArr = r5.A01;
                    int i = r5.A00;
                    int i2 = i + 1;
                    r5.A00 = i2;
                    fArr[i] = (float) 28;
                    A06(r5, num, fArr, A002, i2);
                    return;
                }
                return;
            }
            float A01 = AnonymousClass7Kk.A01(str);
            if (!AnonymousClass7JE.A02(A01)) {
                AnonymousClass7JE.A00(r5, 3);
                float[] fArr2 = r5.A01;
                int i3 = r5.A00;
                int i4 = i3 + 1;
                r5.A00 = i4;
                fArr2[i3] = (float) 27;
                A06(r5, num, fArr2, A01, i4);
            }
        } catch (C29721zB e) {
            A07("Error parsing position value", e);
        }
    }
}
