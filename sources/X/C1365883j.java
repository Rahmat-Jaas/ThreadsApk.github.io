package X;

import java.util.Comparator;

/* renamed from: X.83j  reason: invalid class name and case insensitive filesystem */
public final class C1365883j implements Comparator {
    public final /* synthetic */ C131647sY A00;
    public final /* synthetic */ AnonymousClass601 A01;
    public final /* synthetic */ C109326jp A02;

    public C1365883j(C131647sY r1, AnonymousClass601 r2, C109326jp r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final int compare(Object obj, Object obj2) {
        C109326jp r3 = this.A02;
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        A002.A03(obj, 0);
        Object A003 = C61043Rr.A00(this.A01, C86154wM.A0S(A002, obj2, 1), r3);
        if (A003 instanceof Integer) {
            return AnonymousClass0wJ.A04(A003);
        }
        C30967GcS.A02("bk.action.array.SortedArray", "Got non-integer result while evaluating comparator predicate");
        return 0;
    }
}
