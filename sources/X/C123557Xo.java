package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Xo  reason: invalid class name and case insensitive filesystem */
public final class C123557Xo implements C146288ly {
    public static final C123557Xo A00 = new C123557Xo();

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

    public final C146098ld Bg2(C147618pd r8, List list, long j) {
        boolean A1Y = AnonymousClass0wJ.A1Y(r8, list);
        ArrayList A0t = C18200wM.A0t(list);
        int size = list.size();
        Integer valueOf = Integer.valueOf(A1Y ? 1 : 0);
        int i = 0;
        while (i < size) {
            i = C147578pZ.A00(A0t, list, i, j);
        }
        int size2 = A0t.size();
        Integer num = valueOf;
        for (int i2 = 0; i2 < size2; i2++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((C123657Xy) A0t.get(i2)).A01));
        }
        int intValue = num.intValue();
        int size3 = A0t.size();
        for (int i3 = 0; i3 < size3; i3++) {
            valueOf = Integer.valueOf(Math.max(valueOf.intValue(), ((C123657Xy) A0t.get(i3)).A00));
        }
        return C147618pd.A00(r8, C86154wM.A0z(A0t, 39), intValue, valueOf.intValue());
    }
}
