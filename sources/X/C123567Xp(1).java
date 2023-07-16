package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Xp  reason: invalid class name and case insensitive filesystem */
public final class C123567Xp implements C146288ly {
    public static final C123567Xp A00 = new C123567Xp();

    public final /* synthetic */ int Bf9(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A00(r2, this, list, i);
    }

    public final /* synthetic */ int BfC(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A01(r2, this, list, i);
    }

    public final C146098ld Bg2(C147618pd r12, List list, long j) {
        Object obj;
        int A04;
        int A03;
        int A1Z = AnonymousClass0wJ.A1Z(r12, list);
        ArrayList A0t = C18200wM.A0t(list);
        int size = list.size();
        int i = 0;
        while (i < size) {
            i = C147578pZ.A00(A0t, list, i, j);
        }
        Object obj2 = null;
        int i2 = 1;
        if (A0t.isEmpty()) {
            obj = null;
        } else {
            obj = A0t.get(0);
            int i3 = ((C123657Xy) obj).A01;
            int A0B = C86104wH.A0B(A0t);
            if (A1Z <= A0B) {
                int i4 = 1;
                while (true) {
                    Object obj3 = A0t.get(i4);
                    int i5 = ((C123657Xy) obj3).A01;
                    if (i3 < i5) {
                        obj = obj3;
                        i3 = i5;
                    }
                    if (i4 == A0B) {
                        break;
                    }
                    i4++;
                }
            }
        }
        C123657Xy r10 = (C123657Xy) obj;
        if (r10 != null) {
            A04 = r10.A01;
        } else {
            A04 = Constraints.A04(j);
        }
        if (!A0t.isEmpty()) {
            obj2 = A0t.get(0);
            int i6 = ((C123657Xy) obj2).A00;
            int A0B2 = C86104wH.A0B(A0t);
            if (A1Z <= A0B2) {
                while (true) {
                    Object obj4 = A0t.get(i2);
                    int i7 = ((C123657Xy) obj4).A00;
                    if (i6 < i7) {
                        obj2 = obj4;
                        i6 = i7;
                    }
                    if (i2 == A0B2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        C123657Xy r5 = (C123657Xy) obj2;
        if (r5 != null) {
            A03 = r5.A00;
        } else {
            A03 = Constraints.A03(j);
        }
        return C147618pd.A00(r12, C86164wN.A0q(A0t, 2), A04, A03);
    }

    public final /* synthetic */ int BgK(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A02(r2, this, list, i);
    }

    public final /* synthetic */ int BgN(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A03(r2, this, list, i);
    }
}
