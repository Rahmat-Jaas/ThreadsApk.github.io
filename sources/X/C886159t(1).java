package X;

import java.util.List;

/* renamed from: X.59t  reason: invalid class name and case insensitive filesystem */
public final class C886159t extends C41014LuD {
    public final C886259u A00;
    public final List A01;
    public final List A02;
    public final /* synthetic */ AnonymousClass5AC A03;

    public C886159t(C886259u r1, AnonymousClass5AC r2, List list, List list2) {
        this.A03 = r2;
        this.A00 = r1;
        this.A02 = list;
        this.A01 = list2;
    }

    public final int A02() {
        return this.A01.size();
    }

    public final int A03() {
        return this.A02.size();
    }

    public final boolean A04(int i, int i2) {
        return this.A00.areContentsTheSame((AnonymousClass7Kx) this.A02.get(i), (AnonymousClass7Kx) this.A01.get(i2));
    }

    public final boolean A05(int i, int i2) {
        return this.A00.areItemsTheSame((AnonymousClass7Kx) this.A02.get(i), (AnonymousClass7Kx) this.A01.get(i2));
    }
}
