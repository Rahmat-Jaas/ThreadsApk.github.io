package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass678;
import X.AnonymousClass6FM;
import X.AnonymousClass746;
import X.AnonymousClass74R;
import X.AnonymousClass7AW;
import X.AnonymousClass7HD;
import X.AnonymousClass7KC;
import X.AnonymousClass7YX;
import X.C04220Ms;
import X.C113196qu;
import X.C121457Gf;
import X.C121767Ia;
import X.C121827Ii;
import X.C134747yH;
import X.C142938fq;
import X.C143048g1;
import X.C146388mA;
import X.C146978nB;
import X.C147368pE;
import X.C86124wJ;
import X.C86154wM;

public class IDxDObserverShape844S0100000_2_I2 implements C146388mA {
    public Object A00;
    public final int A01;

    public IDxDObserverShape844S0100000_2_I2(C121827Ii r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void Buh(long j) {
        if (this.A01 == 0) {
            C121827Ii r2 = (C121827Ii) this.A00;
            r2.A0F.CrC(AnonymousClass678.Cursor);
            r2.A0E.CrC(C86124wJ.A0O(AnonymousClass746.A00(r2.A03(true))));
        }
    }

    public final void Buw(long j) {
        C121457Gf A002;
        C121457Gf A003;
        int A004;
        int i = this.A01;
        C121827Ii r7 = (C121827Ii) this.A00;
        if (i != 0) {
            C147368pE r3 = r7.A0H;
            if (C134747yH.A01(r3) != 0) {
                r7.A01 = AnonymousClass7KC.A05(r7.A01, j);
                C113196qu r0 = r7.A02;
                if (!(r0 == null || (A003 = C147368pE.A00(r0)) == null)) {
                    AnonymousClass7KC A0O = C86124wJ.A0O(AnonymousClass7KC.A05(r7.A00, r7.A01));
                    C147368pE r2 = r7.A0E;
                    r2.CrC(A0O);
                    Integer num = r7.A0A;
                    if (num != null) {
                        A004 = num.intValue();
                    } else {
                        A004 = C121457Gf.A00(A003, r7.A00);
                    }
                    AnonymousClass7KC r02 = (AnonymousClass7KC) r2.getValue();
                    C04220Ms.A0A(r02);
                    int A005 = C121457Gf.A00(A003, r02.A00);
                    C121827Ii.A01(AnonymousClass74R.A04, r7, C86154wM.A0I(r3), A004, A005, false);
                }
                C113196qu r1 = r7.A02;
                if (r1 != null) {
                    r1.A06 = false;
                    return;
                }
                return;
            }
            return;
        }
        r7.A01 = AnonymousClass7KC.A05(r7.A01, j);
        C113196qu r03 = r7.A02;
        if (r03 != null && (A002 = C147368pE.A00(r03)) != null) {
            AnonymousClass7AW r4 = A002.A02;
            AnonymousClass7KC A0O2 = C86124wJ.A0O(AnonymousClass7KC.A05(r7.A00, r7.A01));
            C147368pE r04 = r7.A0E;
            r04.CrC(A0O2);
            C146978nB r22 = r7.A07;
            AnonymousClass7KC r05 = (AnonymousClass7KC) r04.getValue();
            C04220Ms.A0A(r05);
            int D7e = r22.D7e(r4.A07(r05.A00));
            long A006 = AnonymousClass6FM.A00(D7e, D7e);
            C147368pE r6 = r7.A0H;
            if (A006 != AnonymousClass7HD.A00(r6)) {
                C142938fq r12 = r7.A04;
                if (r12 != null) {
                    r12.CWa(9);
                }
                r7.A0B.invoke(new AnonymousClass7HD(C86154wM.A0I(r6).A01, (C121767Ia) null, A006));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
        if (r5 <= (r3 + r2)) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CLu(long r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A01
            java.lang.Object r11 = r1.A00
            X.7Ii r11 = (X.C121827Ii) r11
            if (r0 == 0) goto L_0x0117
            X.8pE r1 = r11.A0F
            java.lang.Object r0 = r1.getValue()
            if (r0 != 0) goto L_0x00be
            X.678 r0 = X.AnonymousClass678.SelectionEnd
            r1.CrC(r0)
            r11.A06()
            X.6qu r2 = r11.A02
            r0 = r17
            if (r2 == 0) goto L_0x00c3
            X.7Gf r4 = X.C147368pE.A00(r2)
            if (r4 == 0) goto L_0x00c3
            long r2 = X.C121457Gf.A01(r4, r0)
            long r9 = X.C121457Gf.A02(r4, r2)
            X.7AW r7 = r4.A02
            float r2 = X.AnonymousClass7KC.A02(r9)
            int r6 = r7.A03(r2)
            float r8 = X.AnonymousClass7KC.A01(r9)
            X.6uu r2 = X.AnonymousClass7AW.A00(r7, r6)
            X.8g2 r3 = r2.A06
            int r2 = r2.A03
            int r5 = r6 - r2
            X.7Ye r3 = (X.C123707Ye) r3
            X.6vM r4 = r3.A01
            android.text.Layout r2 = r4.A08
            float r3 = r2.getLineLeft(r5)
            int r2 = r4.A04
            int r2 = r2 + -1
            if (r5 != r2) goto L_0x00c1
            float r2 = r4.A00
        L_0x0058:
            float r3 = r3 + r2
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x00c3
            float r5 = X.AnonymousClass7KC.A01(r9)
            X.6uu r2 = X.AnonymousClass7AW.A00(r7, r6)
            X.8g2 r3 = r2.A06
            int r2 = r2.A03
            int r6 = r6 - r2
            X.7Ye r3 = (X.C123707Ye) r3
            X.6vM r4 = r3.A01
            android.text.Layout r2 = r4.A08
            float r3 = r2.getLineRight(r6)
            int r2 = r4.A04
            int r2 = r2 + -1
            if (r6 != r2) goto L_0x00bf
            float r2 = r4.A01
        L_0x007c:
            float r3 = r3 + r2
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x00c3
        L_0x0081:
            X.8pE r5 = r11.A0H
            int r2 = X.C134747yH.A01(r5)
            if (r2 == 0) goto L_0x00be
            r11.A05()
            X.6qu r2 = r11.A02
            if (r2 == 0) goto L_0x00af
            X.7Gf r4 = X.C147368pE.A00(r2)
            if (r4 == 0) goto L_0x00af
            long r2 = X.C121457Gf.A01(r4, r0)
            int r13 = X.C121457Gf.A00(r4, r2)
            X.7HD r12 = X.C86154wM.A0I(r5)
            X.8mx r10 = X.AnonymousClass74R.A04
            r15 = 0
            r14 = r13
            X.C121827Ii.A01(r10, r11, r12, r13, r14, r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r11.A0A = r2
        L_0x00af:
            r11.A00 = r0
            X.7KC r1 = X.C86124wJ.A0O(r0)
            X.8pE r0 = r11.A0E
            r0.CrC(r1)
            long r0 = X.AnonymousClass7KC.A03
            r11.A01 = r0
        L_0x00be:
            return
        L_0x00bf:
            r2 = 0
            goto L_0x007c
        L_0x00c1:
            r2 = 0
            goto L_0x0058
        L_0x00c3:
            X.6qu r2 = r11.A02
            if (r2 == 0) goto L_0x0081
            X.7Gf r2 = X.C147368pE.A00(r2)
            if (r2 == 0) goto L_0x0081
            X.8nB r3 = r11.A07
            float r1 = X.AnonymousClass7KC.A02(r0)
            r0 = 0
            long r0 = X.C86104wH.A0C(r0, r1)
            long r0 = X.C121457Gf.A01(r2, r0)
            long r0 = X.C121457Gf.A02(r2, r0)
            float r0 = X.AnonymousClass7KC.A02(r0)
            X.7AW r2 = r2.A02
            int r1 = r2.A03(r0)
            r4 = 0
            r0 = 0
            int r0 = r2.A06(r1, r0)
            int r2 = r3.D7e(r0)
            X.8fq r1 = r11.A04
            if (r1 == 0) goto L_0x00fd
            r0 = 9
            r1.CWa(r0)
        L_0x00fd:
            X.8pE r0 = r11.A0H
            X.7HD r0 = X.C86154wM.A0I(r0)
            X.7yH r0 = r0.A01
            long r2 = X.AnonymousClass6FM.A00(r2, r2)
            X.7HD r1 = new X.7HD
            r1.<init>((X.C134747yH) r0, (X.C121767Ia) r4, (long) r2)
            r11.A05()
            X.0YY r0 = r11.A0B
            r0.invoke(r1)
            return
        L_0x0117:
            r0 = 1
            long r0 = r11.A03(r0)
            long r0 = X.AnonymousClass746.A00(r0)
            r11.A00 = r0
            X.7KC r1 = X.C86124wJ.A0O(r0)
            X.8pE r0 = r11.A0E
            r0.CrC(r1)
            long r0 = X.AnonymousClass7KC.A03
            r11.A01 = r0
            X.678 r1 = X.AnonymousClass678.Cursor
            X.8pE r0 = r11.A0F
            r0.CrC(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxDObserverShape844S0100000_2_I2.CLu(long):void");
    }

    public final void CRQ() {
        if (this.A01 == 0) {
            C121827Ii r2 = (C121827Ii) this.A00;
            r2.A0F.CrC((Object) null);
            r2.A0E.CrC((Object) null);
        }
    }

    public final void onCancel() {
    }

    public final void onStop() {
        Integer num;
        int i = this.A01;
        C121827Ii r3 = (C121827Ii) this.A00;
        if (i != 0) {
            r3.A0F.CrC((Object) null);
            r3.A0E.CrC((Object) null);
            C113196qu r1 = r3.A02;
            if (r1 != null) {
                r1.A06 = true;
            }
            C143048g1 r0 = r3.A06;
            if (r0 != null) {
                num = ((AnonymousClass7YX) r0).A01;
            } else {
                num = null;
            }
            if (num == AnonymousClass006.A01) {
                r3.A08();
            }
            r3.A0A = null;
            return;
        }
        r3.A0F.CrC((Object) null);
        r3.A0E.CrC((Object) null);
    }
}
