package X;

import android.util.SparseArray;

/* renamed from: X.6jh  reason: invalid class name and case insensitive filesystem */
public final class C109246jh {
    public final SparseArray A00;
    public final SparseArray A01;
    public final SparseArray A02;

    public C109246jh(C109246jh r4) {
        int i;
        int i2;
        int i3 = 0;
        if (r4 != null) {
            i = r4.A02.size();
        } else {
            i = 0;
        }
        this.A02 = new SparseArray(i);
        if (r4 != null) {
            i2 = r4.A00.size();
        } else {
            i2 = 0;
        }
        this.A00 = new SparseArray(i2);
        this.A01 = new SparseArray(r4 != null ? r4.A01.size() : i3);
    }
}
