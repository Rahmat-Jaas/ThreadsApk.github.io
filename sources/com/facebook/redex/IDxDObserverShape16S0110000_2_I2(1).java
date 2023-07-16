package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass678;
import X.AnonymousClass746;
import X.AnonymousClass74R;
import X.AnonymousClass7AW;
import X.AnonymousClass7F8;
import X.AnonymousClass7HD;
import X.AnonymousClass7KC;
import X.AnonymousClass7YX;
import X.C04220Ms;
import X.C113196qu;
import X.C114876u2;
import X.C114886u3;
import X.C121457Gf;
import X.C121827Ii;
import X.C143048g1;
import X.C145708kx;
import X.C146388mA;
import X.C146508mM;
import X.C146978nB;
import X.C147368pE;
import X.C86104wH;
import X.C86124wJ;
import X.C86154wM;
import X.C86164wN;
import java.util.Map;

public class IDxDObserverShape16S0110000_2_I2 implements C146388mA {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxDObserverShape16S0110000_2_I2(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void Buh(long j) {
        C114876u2 r0;
        C146508mM Ard;
        Object obj;
        C147368pE r02;
        AnonymousClass678 r1;
        if (this.A02 != 0) {
            C121827Ii r3 = (C121827Ii) this.A00;
            boolean z = this.A01;
            if (z) {
                r1 = AnonymousClass678.SelectionStart;
            } else {
                r1 = AnonymousClass678.SelectionEnd;
            }
            r3.A0F.CrC(r1);
            obj = C86124wJ.A0O(AnonymousClass746.A00(r3.A03(z)));
            r02 = r3.A0E;
        } else {
            AnonymousClass7F8 r5 = (AnonymousClass7F8) this.A00;
            C114886u3 r12 = (C114886u3) r5.A08.getValue();
            if (r12 != null) {
                boolean z2 = this.A01;
                if (z2) {
                    r0 = r12.A01;
                } else {
                    r0 = r12.A00;
                }
                C145708kx A022 = r5.A02(r0);
                if (A022 != null && (Ard = A022.Ard()) != null) {
                    r5.A09.CrC(C86124wJ.A0O(r5.A03().Bay(Ard, AnonymousClass746.A00(A022.AlH(r12, z2)))));
                    if (z2) {
                        obj = AnonymousClass678.SelectionStart;
                    } else {
                        obj = AnonymousClass678.SelectionEnd;
                    }
                    r02 = r5.A0C;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        r02.CrC(obj);
    }

    public final void Buw(long j) {
        C121457Gf A002;
        C147368pE r3;
        int CVm;
        int A07;
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            C121827Ii r6 = (C121827Ii) obj;
            r6.A01 = AnonymousClass7KC.A05(r6.A01, j);
            C113196qu r0 = r6.A02;
            if (!(r0 == null || (A002 = C147368pE.A00(r0)) == null)) {
                AnonymousClass7AW r4 = A002.A02;
                boolean z = this.A01;
                AnonymousClass7KC A0O = C86124wJ.A0O(AnonymousClass7KC.A05(r6.A00, r6.A01));
                C147368pE r5 = r6.A0E;
                r5.CrC(A0O);
                if (z) {
                    AnonymousClass7KC r02 = (AnonymousClass7KC) r5.getValue();
                    C04220Ms.A0A(r02);
                    CVm = r4.A07(r02.A00);
                    C146978nB r2 = r6.A07;
                    r3 = r6.A0H;
                    A07 = r2.CVm(C86104wH.A08(AnonymousClass7HD.A00(r3)));
                } else {
                    C146978nB r22 = r6.A07;
                    r3 = r6.A0H;
                    CVm = r22.CVm(C86104wH.A07(AnonymousClass7HD.A00(r3)));
                    AnonymousClass7KC r03 = (AnonymousClass7KC) r5.getValue();
                    C04220Ms.A0A(r03);
                    A07 = r4.A07(r03.A00);
                }
                C121827Ii.A01(AnonymousClass74R.A00, r6, C86154wM.A0I(r3), CVm, A07, z);
            }
            C113196qu r1 = r6.A02;
            if (r1 != null) {
                r1.A06 = false;
                return;
            }
            return;
        }
        AnonymousClass7F8 r62 = (AnonymousClass7F8) obj;
        C147368pE r42 = r62.A0B;
        r42.CrC(C86124wJ.A0O(AnonymousClass7KC.A05(C86164wN.A08(r42), j)));
        C147368pE r52 = r62.A0A;
        long A05 = AnonymousClass7KC.A05(C86164wN.A08(r52), C86164wN.A08(r42));
        if (r62.A09(AnonymousClass74R.A01, C86124wJ.A0O(A05), C86124wJ.A0O(C86164wN.A08(r52)), this.A01)) {
            r52.CrC(C86124wJ.A0O(A05));
            r42.CrC(C86124wJ.A0O(AnonymousClass7KC.A03));
        }
    }

    public final void CLu(long j) {
        long AlH;
        AnonymousClass678 r1;
        if (this.A02 != 0) {
            C121827Ii r3 = (C121827Ii) this.A00;
            boolean z = this.A01;
            long A002 = AnonymousClass746.A00(r3.A03(z));
            r3.A00 = A002;
            r3.A0E.CrC(C86124wJ.A0O(A002));
            r3.A01 = AnonymousClass7KC.A03;
            if (z) {
                r1 = AnonymousClass678.SelectionStart;
            } else {
                r1 = AnonymousClass678.SelectionEnd;
            }
            r3.A0F.CrC(r1);
            C113196qu r12 = r3.A02;
            if (r12 != null) {
                r12.A06 = false;
                return;
            }
            return;
        }
        AnonymousClass7F8 r4 = (AnonymousClass7F8) this.A00;
        r4.A05();
        C114886u3 r5 = (C114886u3) r4.A08.getValue();
        C04220Ms.A0A(r5);
        Map map = r4.A07.A0B;
        C145708kx r2 = (C145708kx) map.get(Long.valueOf(r5.A01.A01));
        C145708kx r13 = (C145708kx) map.get(Long.valueOf(r5.A00.A01));
        boolean z2 = this.A01;
        C146508mM r32 = null;
        if (z2) {
            if (r2 != null) {
                r32 = r2.Ard();
            }
        } else if (r13 != null) {
            r32 = r13.Ard();
        }
        C04220Ms.A0A(r32);
        if (z2) {
            C04220Ms.A0A(r2);
            AlH = r2.AlH(r5, true);
        } else {
            C04220Ms.A0A(r13);
            AlH = r13.AlH(r5, false);
        }
        r4.A0A.CrC(C86124wJ.A0O(r4.A03().Bay(r32, AnonymousClass746.A00(AlH))));
        r4.A0B.CrC(C86124wJ.A0O(AnonymousClass7KC.A03));
    }

    public final void CRQ() {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            C121827Ii r2 = (C121827Ii) obj;
            r2.A0F.CrC((Object) null);
            r2.A0E.CrC((Object) null);
            return;
        }
        AnonymousClass7F8 r22 = (AnonymousClass7F8) obj;
        r22.A0C.CrC((Object) null);
        r22.A09.CrC((Object) null);
    }

    public final void onCancel() {
        if (this.A02 == 0) {
            C147368pE.A06(this.A00);
        }
    }

    public final void onStop() {
        if (this.A02 != 0) {
            C121827Ii r3 = (C121827Ii) this.A00;
            Integer num = null;
            r3.A0F.CrC((Object) null);
            r3.A0E.CrC((Object) null);
            C113196qu r2 = r3.A02;
            if (r2 != null) {
                r2.A06 = true;
            }
            C143048g1 r0 = r3.A06;
            if (r0 != null) {
                num = ((AnonymousClass7YX) r0).A01;
            }
            if (num == AnonymousClass006.A01) {
                r3.A08();
                return;
            }
            return;
        }
        C147368pE.A06(this.A00);
    }
}
