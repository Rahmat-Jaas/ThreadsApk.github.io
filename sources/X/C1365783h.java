package X;

import java.util.Comparator;

/* renamed from: X.83h  reason: invalid class name and case insensitive filesystem */
public final class C1365783h implements Comparator {
    public final /* synthetic */ Comparator A00;
    public final /* synthetic */ Comparator A01;

    public C1365783h(Comparator comparator, Comparator comparator2) {
        this.A01 = comparator;
        this.A00 = comparator2;
    }

    public final int compare(Object obj, Object obj2) {
        int compare = this.A01.compare(obj, obj2);
        if (compare == 0) {
            return this.A00.compare(((AnonymousClass7HT) obj).A03, ((AnonymousClass7HT) obj2).A03);
        }
        return compare;
    }
}
