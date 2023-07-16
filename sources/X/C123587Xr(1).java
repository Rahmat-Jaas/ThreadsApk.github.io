package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape23S0101000_I2;

/* renamed from: X.7Xr  reason: invalid class name and case insensitive filesystem */
public final class C123587Xr implements C146288ly {
    public static final C123587Xr A00 = new C123587Xr();

    public final /* synthetic */ int Bf9(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A00(r2, this, list, i);
    }

    public final /* synthetic */ int BfC(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A01(r2, this, list, i);
    }

    public final /* synthetic */ int BgK(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A02(r2, this, list, i);
    }

    public final /* synthetic */ int BgN(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A03(r2, this, list, i);
    }

    public final C146098ld Bg2(C147618pd r14, List list, long j) {
        ArrayList<C123657Xy> arrayList;
        boolean A1Y = AnonymousClass0wJ.A1Y(r14, list);
        int A04 = Constraints.A04(j);
        ArrayList A0x = AnonymousClass0wJ.A0x(list, 10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18200wM.A1U(A0x, ((C147148nT) it.next()).BfB(Integer.MAX_VALUE));
        }
        int i = 0;
        int A03 = C18210wN.A03((Number) AnonymousClass00J.A02(A0x));
        int size = list.size();
        int CfL = r14.CfL((float) 6);
        int i2 = (size - 1) * CfL;
        int i3 = (A04 - i2) / size;
        int CfL2 = r14.CfL((float) 18) + i3;
        if (A03 <= i3) {
            long A05 = Constraints.A05(i3, i3, Constraints.A03(j), Constraints.A01(j));
            arrayList = AnonymousClass0wJ.A0x(list, 10);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C147578pZ.A01(arrayList, it2, A05);
            }
        } else if (A03 <= CfL2) {
            long A052 = Constraints.A05(CfL2, CfL2, Constraints.A03(j), Constraints.A01(j));
            arrayList = AnonymousClass0wJ.A0x(list, 10);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C147578pZ.A01(arrayList, it3, A052);
            }
        } else {
            int A002 = AnonymousClass00J.A00(A0x) + i2;
            if (A002 >= A04) {
                long A053 = Constraints.A05(A1Y ? 1 : 0, Constraints.A02(j), Constraints.A03(j), Constraints.A01(j));
                arrayList = AnonymousClass0wJ.A0x(list, 10);
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    C147578pZ.A01(arrayList, it4, A053);
                }
            } else {
                int i4 = (A04 - A002) / size;
                arrayList = AnonymousClass0wJ.A0x(list, 10);
                int i5 = 0;
                for (Object next : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        C06750aI.A1A();
                        throw null;
                    }
                    int A042 = AnonymousClass0wJ.A04(A0x.get(i5)) + i4;
                    arrayList.add(((C147578pZ) next).Bg4(Constraints.A05(A042, A042, Constraints.A03(j), Constraints.A01(j))));
                    i5 = i6;
                }
            }
        }
        for (C123657Xy A0B : arrayList) {
            i += A0B.A0B();
        }
        int max = Math.max(i + i2, A04);
        Iterator it5 = arrayList.iterator();
        if (it5.hasNext()) {
            int A0A = ((C123657Xy) it5.next()).A0A();
            while (it5.hasNext()) {
                int A0A2 = ((C123657Xy) it5.next()).A0A();
                if (A0A < A0A2) {
                    A0A = A0A2;
                }
            }
            return C147618pd.A00(r14, new KtLambdaShape23S0101000_I2(CfL, 4, arrayList), max, A0A);
        }
        throw C86154wM.A0u();
    }
}
