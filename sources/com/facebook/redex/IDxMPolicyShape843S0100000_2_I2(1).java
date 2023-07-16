package com.facebook.redex;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass6ZP;
import X.AnonymousClass7AW;
import X.AnonymousClass7F6;
import X.AnonymousClass7FP;
import X.AnonymousClass7Hh;
import X.AnonymousClass7JT;
import X.AnonymousClass7WM;
import X.AnonymousClass8JD;
import X.AnonymousClass8bA;
import X.C04220Ms;
import X.C111156ms;
import X.C123207Vw;
import X.C123657Xy;
import X.C123717Yf;
import X.C146098ld;
import X.C146288ly;
import X.C146858my;
import X.C147578pZ;
import X.C147618pd;
import X.C147838q0;
import X.C18170wI;
import X.C18180wK;
import X.C18200wM;
import X.C81784oM;
import X.C86104wH;
import X.C86154wM;
import X.C98226Er;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;

public class IDxMPolicyShape843S0100000_2_I2 implements C146288ly {
    public Object A00;
    public final int A01;

    public IDxMPolicyShape843S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final int Bf9(C147838q0 r6, List list, int i) {
        if (this.A01 != 0) {
            return AnonymousClass7FP.A00(r6, this, list, i);
        }
        C04220Ms.A0B(r6, 0);
        return C86104wH.A08(((AnonymousClass7WM) this.A00).A04.A02.A00((AnonymousClass7AW) null, r6.getLayoutDirection(), AnonymousClass7JT.A02(0, i, 0, Integer.MAX_VALUE)).A02);
    }

    public final int BfC(C147838q0 r4, List list, int i) {
        if (this.A01 != 0) {
            return AnonymousClass7FP.A01(r4, this, list, i);
        }
        C04220Ms.A0B(r4, 0);
        C111156ms r2 = ((AnonymousClass7WM) this.A00).A04;
        r2.A02.A01(r4.getLayoutDirection());
        C123717Yf r0 = r2.A02.A00;
        if (r0 != null) {
            return AnonymousClass8bA.A01(r0.Atb());
        }
        throw C18180wK.A0a("layoutIntrinsics must be called first");
    }

    public final C146098ld Bg2(C147618pd r20, List list, long j) {
        C146858my r0;
        String A002;
        C147578pZ r11;
        long j2 = j;
        List<C147578pZ> list2 = list;
        C147618pd r7 = r20;
        if (this.A01 != 0) {
            boolean A1Y = AnonymousClass0wJ.A1Y(r7, list2);
            long A05 = Constraints.A05(A1Y ? 1 : 0, Constraints.A02(j2), A1Y, Constraints.A01(j2));
            float f = (float) 8;
            int CfL = r7.CfL(f);
            int CfL2 = r7.CfL((float) 6);
            int CfL3 = r7.CfL(f);
            int i = -CfL3;
            long A03 = AnonymousClass7JT.A03(A05, A1Y, i - CfL);
            Iterator it = list2.iterator();
            do {
                boolean hasNext = it.hasNext();
                A002 = C18170wI.A00(6);
                if (hasNext) {
                    r11 = (C147578pZ) it.next();
                } else {
                    throw new NoSuchElementException(A002);
                }
            } while (!C04220Ms.A0I(C98226Er.A00(r11), "Label"));
            C123657Xy Bg4 = r11.Bg4(A03);
            int ANp = Bg4.ANp(AnonymousClass6ZP.A01);
            if (ANp == Integer.MIN_VALUE) {
                ANp = Bg4.A00;
            }
            int A032 = AnonymousClass8bA.A03((float) ANp, 0.75f);
            long A033 = AnonymousClass7JT.A03(Constraints.A05(Constraints.A04(j2), Constraints.A02(j2), A1Y, Constraints.A01(j2)), A1Y, ((i - CfL2) - A032) - CfL);
            for (C147578pZ r10 : list2) {
                if (C04220Ms.A0I(C98226Er.A00(r10), "TextField")) {
                    C123657Xy Bg42 = r10.Bg4(A033);
                    int max = Math.max(Bg42.A01, Math.max(Bg4.A01, Constraints.A04(j2)));
                    int max2 = Math.max(A032 + CfL + CfL2 + Bg42.A00 + CfL3, Constraints.A03(j2));
                    return C147618pd.A00(r7, new AnonymousClass8JD((C81784oM) this.A00, Bg42, Bg4, max2, CfL3, CfL), max, max2);
                }
            }
            throw new NoSuchElementException(A002);
        }
        boolean A1Y2 = AnonymousClass0wJ.A1Y(r7, list2);
        AnonymousClass7WM r2 = (AnonymousClass7WM) this.A00;
        C111156ms r5 = r2.A04;
        r5.A09.getValue();
        Unit unit = Unit.A00;
        AnonymousClass7AW r3 = r5.A05;
        AnonymousClass7AW A003 = r5.A02.A00(r3, r7.getLayoutDirection(), j2);
        if (!C04220Ms.A0I(r3, A003)) {
            r5.A06.invoke(A003);
            if (!(r3 == null || C04220Ms.A0I(r3.A04.A03, A003.A04.A03) || (r0 = r2.A01) == null)) {
                long j3 = r5.A07;
                AnonymousClass0YY r1 = ((C123207Vw) r0).A04;
                if (r1 != null) {
                    r1.invoke(Long.valueOf(j3));
                }
            }
        }
        r5.A08.CrC(unit);
        r5.A05 = A003;
        int size = list2.size();
        List list3 = A003.A05;
        if (size >= list3.size()) {
            ArrayList A0t = C18200wM.A0t(list3);
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnonymousClass7F6 r12 = (AnonymousClass7F6) list3.get(i2);
                if (r12 != null) {
                    float f2 = r12.A02;
                    float f3 = r12.A01;
                    float f4 = r12.A00;
                    float f5 = r12.A03;
                    A0t.add(C18180wK.A0p(((C147578pZ) list2.get(i2)).Bg4(AnonymousClass7JT.A02(A1Y2 ? 1 : 0, (int) ((float) Math.floor((double) (f2 - f3))), A1Y2, (int) ((float) Math.floor((double) (f4 - f5))))), AnonymousClass7Hh.A04(AnonymousClass8bA.A02(f3), AnonymousClass8bA.A02(f5))));
                }
            }
            long j4 = A003.A02;
            return r7.BaT(AnonymousClass4WJ.A0G(C18180wK.A0p(AnonymousClass6ZP.A00, Integer.valueOf(AnonymousClass8bA.A02(A003.A00))), C18180wK.A0p(AnonymousClass6ZP.A01, Integer.valueOf(AnonymousClass8bA.A02(A003.A01)))), C86154wM.A0z(A0t, 22), C86104wH.A07(j4), C86104wH.A08(j4));
        }
        throw C18180wK.A0a("Check failed.");
    }

    public final int BgK(C147838q0 r6, List list, int i) {
        if (this.A01 != 0) {
            return AnonymousClass7FP.A02(r6, this, list, i);
        }
        C04220Ms.A0B(r6, 0);
        return C86104wH.A08(((AnonymousClass7WM) this.A00).A04.A02.A00((AnonymousClass7AW) null, r6.getLayoutDirection(), AnonymousClass7JT.A02(0, i, 0, Integer.MAX_VALUE)).A02);
    }

    public final int BgN(C147838q0 r4, List list, int i) {
        if (this.A01 != 0) {
            return AnonymousClass7FP.A03(r4, this, list, i);
        }
        C04220Ms.A0B(r4, 0);
        C111156ms r2 = ((AnonymousClass7WM) this.A00).A04;
        r2.A02.A01(r4.getLayoutDirection());
        C123717Yf r0 = r2.A02.A00;
        if (r0 != null) {
            return AnonymousClass8bA.A01(r0.Avj());
        }
        throw C18180wK.A0a("layoutIntrinsics must be called first");
    }
}
