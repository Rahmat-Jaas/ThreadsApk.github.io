package X;

import android.util.SparseArray;

/* renamed from: X.5hL  reason: invalid class name and case insensitive filesystem */
public final class C91945hL extends AnonymousClass7Ih {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public C91945hL(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(i, true, z);
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = z3;
        SparseArray sparseArray = this.A04;
        Boolean valueOf = Boolean.valueOf(z2);
        sparseArray.put(i, valueOf);
        this.A05.A0H(valueOf);
    }
}
