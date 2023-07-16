package X;

/* renamed from: X.7JO  reason: invalid class name */
public final class AnonymousClass7JO {
    public long A00;
    public C134747yH A01;
    public final long A02;
    public final C121457Gf A03;
    public final C104016b6 A04;
    public final C134747yH A05;
    public final AnonymousClass7AW A06;
    public final C146978nB A07;
    public final AnonymousClass7HD A08;

    public AnonymousClass7JO(C121457Gf r5, C104016b6 r6, C146978nB r7, AnonymousClass7HD r8) {
        AnonymousClass7AW r2;
        C134747yH r3 = r8.A01;
        long j = r8.A00;
        if (r5 != null) {
            r2 = r5.A02;
        } else {
            r2 = null;
        }
        this.A05 = r3;
        this.A02 = j;
        this.A06 = r2;
        this.A07 = r7;
        this.A04 = r6;
        this.A00 = j;
        this.A01 = r3;
        this.A08 = r8;
        this.A03 = r5;
    }

    public static final int A00(C121457Gf r8, AnonymousClass7JO r9, int i) {
        AnonymousClass7F6 r7;
        C146508mM r1;
        C146508mM r2 = r8.A01;
        if (r2 == null || (r1 = r8.A00) == null || (r7 = r1.Bax(r2, true)) == null) {
            r7 = AnonymousClass7F6.A04;
        }
        C146978nB r4 = r9.A07;
        int CVm = r4.CVm(C86104wH.A08(r9.A08.A00));
        AnonymousClass7AW r6 = r8.A02;
        AnonymousClass7F6 A0A = r6.A0A(CVm);
        return r4.D7e(r6.A07(C86104wH.A0C(A0A.A01, A0A.A03 + (AnonymousClass7JK.A00(C86104wH.A0C(r7.A02 - r7.A01, r7.A00 - r7.A03)) * ((float) i)))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r5 < (r1 + r0)) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (r5 <= (r1 + r0)) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        return r10.A06(r7, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A01(X.AnonymousClass7JO r9, X.AnonymousClass7AW r10, int r11) {
        /*
            X.8nB r4 = r9.A07
            long r0 = r9.A00
            int r0 = X.C86104wH.A08(r0)
            int r2 = r4.CVm(r0)
            X.6b6 r1 = r9.A04
            java.lang.Float r0 = r1.A00
            if (r0 != 0) goto L_0x001e
            X.7F6 r0 = r10.A0A(r2)
            float r0 = r0.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A00 = r0
        L_0x001e:
            int r7 = r10.A04(r2)
            int r7 = r7 + r11
            if (r7 >= 0) goto L_0x0027
            r0 = 0
            return r0
        L_0x0027:
            X.7EK r0 = r10.A03
            int r0 = r0.A02
            if (r7 < r0) goto L_0x0034
            X.7yH r0 = r9.A01
            int r0 = X.C134747yH.A02(r0)
            return r0
        L_0x0034:
            float r8 = r10.A01(r7)
            r6 = 1
            float r0 = (float) r6
            float r8 = r8 - r0
            java.lang.Float r0 = r1.A00
            float r5 = X.C86164wN.A02(r0)
            boolean r0 = A04(r9)
            if (r0 == 0) goto L_0x0068
            X.6uu r0 = X.AnonymousClass7AW.A00(r10, r7)
            X.8g2 r1 = r0.A06
            int r0 = r0.A03
            int r3 = r7 - r0
            X.7Ye r1 = (X.C123707Ye) r1
            X.6vM r2 = r1.A01
            android.text.Layout r0 = r2.A08
            float r1 = r0.getLineRight(r3)
            int r0 = r2.A04
            int r0 = r0 + -1
            if (r3 != r0) goto L_0x0096
            float r0 = r2.A01
        L_0x0063:
            float r1 = r1 + r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x008f
        L_0x0068:
            boolean r0 = A04(r9)
            if (r0 != 0) goto L_0x0098
            X.6uu r0 = X.AnonymousClass7AW.A00(r10, r7)
            X.8g2 r1 = r0.A06
            int r0 = r0.A03
            int r3 = r7 - r0
            X.7Ye r1 = (X.C123707Ye) r1
            X.6vM r2 = r1.A01
            android.text.Layout r0 = r2.A08
            float r1 = r0.getLineLeft(r3)
            int r0 = r2.A04
            int r0 = r0 + -1
            if (r3 != r0) goto L_0x0094
            float r0 = r2.A00
        L_0x008a:
            float r1 = r1 + r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0098
        L_0x008f:
            int r0 = r10.A06(r7, r6)
            return r0
        L_0x0094:
            r0 = 0
            goto L_0x008a
        L_0x0096:
            r0 = 0
            goto L_0x0063
        L_0x0098:
            long r0 = X.C86104wH.A0C(r5, r8)
            int r0 = r10.A07(r0)
            int r0 = r4.D7e(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JO.A01(X.7JO, X.7AW, int):int");
    }

    public static final void A02(AnonymousClass7JO r3) {
        int A002;
        r3.A04.A00 = null;
        String str = r3.A01.A00;
        if (str.length() > 0 && (A002 = JYE.A00(str, C86104wH.A08(r3.A00))) != -1) {
            r3.A00 = AnonymousClass6FM.A00(A002, A002);
        }
    }

    public static final void A03(AnonymousClass7JO r3) {
        int A012;
        r3.A04.A00 = null;
        String str = r3.A01.A00;
        if (str.length() > 0 && (A012 = JYE.A01(str, C86104wH.A08(r3.A00))) != -1) {
            r3.A00 = AnonymousClass6FM.A00(A012, A012);
        }
    }

    public static final boolean A04(AnonymousClass7JO r4) {
        C967466n r1;
        AnonymousClass7AW r3 = r4.A06;
        if (r3 != null) {
            r1 = r3.A0C(r4.A07.CVm(C86104wH.A08(r4.A00)));
        } else {
            r1 = null;
        }
        return C18240wQ.A1Y(r1, C967466n.Rtl);
    }

    public final Integer A05() {
        int length;
        AnonymousClass7AW r7 = this.A06;
        if (r7 == null) {
            return null;
        }
        C146978nB r6 = this.A07;
        int CVm = r6.CVm((int) (this.A00 & 4294967295L));
        while (true) {
            length = this.A05.length();
            if (CVm >= length) {
                break;
            }
            int A022 = C134747yH.A02(this.A01) - 1;
            int i = CVm;
            if (CVm > A022) {
                i = A022;
            }
            int A082 = (int) (r7.A08(i) & 4294967295L);
            if (A082 > CVm) {
                length = r6.D7e(A082);
                break;
            }
            CVm++;
        }
        return Integer.valueOf(length);
    }

    public final Integer A06() {
        int i;
        AnonymousClass7AW r4 = this.A06;
        if (r4 == null) {
            return null;
        }
        C146978nB r3 = this.A07;
        int CVm = r3.CVm(C86104wH.A08(this.A00));
        while (true) {
            if (CVm > 0) {
                int A022 = C134747yH.A02(this.A01) - 1;
                int i2 = CVm;
                if (CVm > A022) {
                    i2 = A022;
                }
                int A072 = C86104wH.A07(r4.A08(i2));
                if (A072 < CVm) {
                    i = r3.D7e(A072);
                    break;
                }
                CVm--;
            } else {
                i = 0;
                break;
            }
        }
        return Integer.valueOf(i);
    }

    public final void A08() {
        this.A04.A00 = null;
        String str = this.A01.A00;
        if (str.length() > 0) {
            int A002 = C121767Ia.A00(this.A00) + 1;
            int length = str.length();
            while (true) {
                if (A002 < length) {
                    if (str.charAt(A002) == 10) {
                        break;
                    }
                    A002++;
                } else {
                    A002 = str.length();
                    break;
                }
            }
            this.A00 = AnonymousClass6FM.A00(A002, A002);
        }
    }

    public final void A09() {
        this.A04.A00 = null;
        String str = this.A01.A00;
        if (str.length() > 0) {
            int A012 = C121767Ia.A01(this.A00);
            while (true) {
                A012--;
                if (A012 > 0) {
                    if (str.charAt(A012 - 1) == 10) {
                        break;
                    }
                } else {
                    A012 = 0;
                    break;
                }
            }
            this.A00 = AnonymousClass6FM.A00(A012, A012);
        }
    }

    public final void A07() {
        Integer A052;
        if (C134747yH.A00(this) > 0) {
            boolean A042 = A04(this);
            int A002 = C134747yH.A00(this);
            if (A042) {
                if (A002 > 0) {
                    A052 = A06();
                } else {
                    return;
                }
            } else if (A002 > 0) {
                A052 = A05();
            } else {
                return;
            }
            if (A052 != null) {
                int intValue = A052.intValue();
                this.A00 = AnonymousClass6FM.A00(intValue, intValue);
            }
        }
    }

    public final void A0A() {
        Integer A062;
        if (C134747yH.A00(this) > 0) {
            boolean A042 = A04(this);
            int A002 = C134747yH.A00(this);
            if (A042) {
                if (A002 > 0) {
                    A062 = A05();
                } else {
                    return;
                }
            } else if (A002 > 0) {
                A062 = A06();
            } else {
                return;
            }
            if (A062 != null) {
                int intValue = A062.intValue();
                this.A00 = AnonymousClass6FM.A00(intValue, intValue);
            }
        }
    }

    public final void A0B() {
        AnonymousClass7AW r3;
        if (C134747yH.A00(this) > 0 && (r3 = this.A06) != null) {
            C146978nB r2 = this.A07;
            int D7e = r2.D7e(r3.A06(r3.A04(r2.CVm(C121767Ia.A00(this.A00))), true));
            if (Integer.valueOf(D7e) != null) {
                this.A00 = AnonymousClass6FM.A00(D7e, D7e);
            }
        }
    }

    public final void A0C() {
        AnonymousClass7AW r3;
        if (C134747yH.A00(this) > 0 && (r3 = this.A06) != null) {
            C146978nB r2 = this.A07;
            int D7e = r2.D7e(r3.A05(r3.A04(r2.CVm(C121767Ia.A01(this.A00)))));
            if (Integer.valueOf(D7e) != null) {
                this.A00 = AnonymousClass6FM.A00(D7e, D7e);
            }
        }
    }
}
