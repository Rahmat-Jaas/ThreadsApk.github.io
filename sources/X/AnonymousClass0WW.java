package X;

/* renamed from: X.0WW  reason: invalid class name */
public final class AnonymousClass0WW {
    public static final AnonymousClass0WW A08 = new AnonymousClass0WW();
    public final C03720Kl A00;
    public final AnonymousClass0e1 A01;
    public final C08910eV A02;
    public final C09420fP A03;
    public final C12020lB A04;
    public final C12440lu A05;
    public final AnonymousClass0Wg[] A06;
    public final C08710e8 A07;

    public final int A00(AnonymousClass0WO r16, int i, int i2) {
        long A022;
        AnonymousClass0Wg[] r9;
        C08710e8 r4 = this.A07;
        if (r4 != null) {
            int i3 = i;
            AnonymousClass0WO r5 = r16;
            if (r16 == null) {
                A022 = r4.A02(i3, 0);
            } else {
                A022 = r4.A02(r5.A00, 0) | r4.A02(r5.A01, 0);
            }
            int i4 = 0;
            if (!(A022 == 0 || (r9 = r4.A02) == null)) {
                long j = 1;
                int i5 = 0;
                while (i4 < r9.length) {
                    if ((A022 & j) != 0 && r9[i4].onQuickMarkerStart(i3, i2)) {
                        i5 = (int) (((long) i5) | j);
                    }
                    i4++;
                    j <<= 1;
                }
                return i5;
            }
        }
        return 0;
    }

    public final void A01(AnonymousClass0WA r29, AnonymousClass0WQ r30, C05800Wc r31, String str, int i, long j, long j2, boolean z) {
        AnonymousClass0Wg[] r6;
        long nowNanos;
        C09420fP r7 = this.A03;
        if (r7 != null) {
            C05800Wc r8 = r31;
            long A022 = r7.A02(r8.getMarkerId(), r8.Ait());
            if (A022 != 0 && (r6 = r7.A02) != null) {
                long j3 = 1;
                AnonymousClass0WA r9 = r29;
                if (r29 == null) {
                    nowNanos = 0;
                } else {
                    nowNanos = r7.A01.nowNanos();
                }
                int i2 = 0;
                while (i2 < r6.length) {
                    if ((A022 & j3) != 0) {
                        r8.Cok(i2);
                        C05800Wc r19 = r8;
                        r6[i2].onMarkerPoint(r19, str, r30, j, j2, z, i);
                        if (r29 != null) {
                            long nowNanos2 = r7.A01.nowNanos();
                            r9.A00(r6[i2].getName(), nowNanos2 - nowNanos);
                            nowNanos = nowNanos2;
                        }
                    }
                    i2++;
                    j3 <<= 1;
                }
            }
        }
    }

    public final void A02(AnonymousClass0WA r19, C05800Wc r20) {
        long A022;
        AnonymousClass0Wg[] r6;
        long nowNanos;
        C09420fP r7 = this.A03;
        if (r7 != null) {
            C05800Wc r8 = r20;
            AnonymousClass0WO B1h = r8.B1h();
            if (B1h == null) {
                A022 = r7.A02(r8.getMarkerId(), r8.Ait());
            } else {
                A022 = r7.A02(B1h.A00, r8.Ait()) | r7.A02(B1h.A01, r8.Ait());
            }
            if (A022 != 0 && (r6 = r7.A02) != null) {
                long j = 1;
                AnonymousClass0WA r9 = r19;
                if (r19 == null) {
                    nowNanos = 0;
                } else {
                    nowNanos = r7.A01.nowNanos();
                }
                int i = 0;
                while (i < r6.length) {
                    if ((A022 & j) != 0) {
                        r8.Cok(i);
                        r6[i].onMarkerAnnotate(r8);
                        if (r19 != null) {
                            long nowNanos2 = r7.A01.nowNanos();
                            r9.A00(r6[i].getName(), nowNanos2 - nowNanos);
                            nowNanos = nowNanos2;
                        }
                    }
                    i++;
                    j <<= 1;
                }
            }
        }
    }

    public final void A03(AnonymousClass0WA r19, C09350fH r20) {
        long A012;
        AnonymousClass0Wg[] r6;
        long nowNanos;
        C09420fP r7 = this.A03;
        if (r7 != null) {
            C09350fH r8 = r20;
            AnonymousClass0WO r1 = r8.A0H;
            if (r1 == null) {
                A012 = r7.A01(r8.getMarkerId());
            } else {
                A012 = r7.A01(r1.A00) | r7.A01(r1.A01);
            }
            if (A012 != 0 && (r6 = r7.A02) != null) {
                long j = 1;
                AnonymousClass0WA r9 = r19;
                if (r19 == null) {
                    nowNanos = 0;
                } else {
                    nowNanos = r7.A01.nowNanos();
                }
                int i = 0;
                while (i < r6.length) {
                    if ((A012 & j) != 0) {
                        r6[i].onMarkEvent(r8);
                        if (r19 != null) {
                            long nowNanos2 = r7.A01.nowNanos();
                            r9.A00(r6[i].getName(), nowNanos2 - nowNanos);
                            nowNanos = nowNanos2;
                        }
                    }
                    i++;
                    j <<= 1;
                }
            }
        }
    }

    public final void A04(AnonymousClass0WO r9, int i) {
        long A022;
        AnonymousClass0Wg[] r1;
        C08710e8 r7 = this.A07;
        if (r7 != null) {
            if (r9 == null) {
                A022 = r7.A02(i, 0);
            } else {
                A022 = r7.A02(r9.A00, 0) | r7.A02(r9.A01, 0);
            }
            if (A022 != 0 && (r1 = r7.A02) != null) {
                for (int i2 = 0; i2 < r1.length; i2++) {
                }
            }
        }
    }

    public final boolean A05(AnonymousClass0WO r8, int i) {
        C08910eV r6 = this.A02;
        if (r6 == null) {
            return false;
        }
        if (r6.A02(i, 0) == 0 && (r8 == null || r6.A02(r8.A00, 0) == 0)) {
            return false;
        }
        return true;
    }

    public final boolean A06(AnonymousClass0WO r10, int i, int i2) {
        C09420fP r5;
        C08910eV r4;
        C08710e8 r8 = this.A07;
        if (r8 == null || (r5 = this.A03) == null || (r4 = this.A02) == null) {
            return false;
        }
        if (r8.A02(i, 0) == 0 && ((r10 == null || r8.A02(r10.A00, 0) == 0) && r5.A02(i, i2) == 0 && ((r10 == null || r5.A02(r10.A00, i2) == 0) && r4.A02(i, 0) == 0 && (r10 == null || r4.A02(r10.A00, 0) == 0)))) {
            return false;
        }
        return true;
    }

    public AnonymousClass0WW(C03720Kl r7, AnonymousClass0e1 r8, C12020lB r9, C12440lu r10, AnonymousClass0Wg[] r11) {
        this.A00 = r7;
        this.A06 = r11;
        this.A04 = r9;
        this.A05 = r10;
        AnonymousClass0e1 r2 = r8;
        this.A01 = r8;
        this.A07 = new C08710e8(r9, r10, r11);
        this.A03 = new C09420fP(r7, r2, r9, r10, r11);
        this.A02 = new C08910eV(r9, r10, r11);
    }

    public AnonymousClass0WW() {
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A05 = null;
        this.A03 = null;
        this.A07 = null;
        this.A02 = null;
        this.A01 = null;
    }
}
