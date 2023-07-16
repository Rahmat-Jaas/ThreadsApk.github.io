package X;

import java.util.List;

/* renamed from: X.0hV  reason: invalid class name */
public final class AnonymousClass0hV extends C41014LuD {
    public final /* synthetic */ List A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ AnonymousClass0YP A02;
    public final /* synthetic */ AnonymousClass0YP A03;

    public AnonymousClass0hV(List list, List list2, AnonymousClass0YP r3, AnonymousClass0YP r4) {
        this.A01 = list;
        this.A00 = list2;
        this.A03 = r3;
        this.A02 = r4;
    }

    public final int A02() {
        return this.A00.size();
    }

    public final int A03() {
        return this.A01.size();
    }

    public final boolean A04(int i, int i2) {
        return ((Boolean) this.A02.invoke(this.A01.get(i), this.A00.get(i2))).booleanValue();
    }

    public final boolean A05(int i, int i2) {
        return ((Boolean) this.A03.invoke(this.A01.get(i), this.A00.get(i2))).booleanValue();
    }
}
