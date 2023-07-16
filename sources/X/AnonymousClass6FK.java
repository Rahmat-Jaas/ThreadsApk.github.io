package X;

import java.util.List;

/* renamed from: X.6FK  reason: invalid class name */
public final class AnonymousClass6FK {
    public static /* synthetic */ C143058g2 A00(C121807If r10, C143078g4 r11, C147168nV r12, String str, List list, int i, int i2, long j) {
        int i3 = i;
        List list2 = list;
        AnonymousClass0ZV r6 = null;
        int i4 = i2;
        if ((i2 & 32) != 0) {
            list2 = AnonymousClass0ZV.A00;
        }
        if ((i2 & 64) != 0) {
            r6 = AnonymousClass0ZV.A00;
        }
        if ((i4 & 128) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        boolean A1Y = AnonymousClass0wJ.A1Y(str, r10);
        AnonymousClass0wJ.A1R(r12, r11);
        C18230wP.A1R(list2, 5, r6);
        return new C123707Ye(new C123727Yg(r10, r11, r12, str, list2, r6), i3, j, A1Y);
    }
}
