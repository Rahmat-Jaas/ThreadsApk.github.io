package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.59s  reason: invalid class name and case insensitive filesystem */
public final class C886059s extends C41014LuD {
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final /* synthetic */ AnonymousClass5AA A02;

    public C886059s(AnonymousClass5AA r2, ImmutableList immutableList, ImmutableList immutableList2) {
        C04220Ms.A0B(immutableList, 2);
        this.A02 = r2;
        this.A01 = immutableList;
        this.A00 = immutableList2;
    }

    public final int A02() {
        return this.A00.size();
    }

    public final int A03() {
        return this.A01.size();
    }

    public final boolean A04(int i, int i2) {
        return ((C128377jT) this.A01.get(i)).A03((C128377jT) this.A00.get(i2));
    }

    public final boolean A05(int i, int i2) {
        return AnonymousClass0wJ.A1T(((C128377jT) this.A01.get(i)).A00.A05, ((C128377jT) this.A00.get(i2)).A00.A05);
    }
}
