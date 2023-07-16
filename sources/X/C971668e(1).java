package X;

import android.util.SparseArray;

/* renamed from: X.68e  reason: invalid class name and case insensitive filesystem */
public enum C971668e {
    NORTH(0),
    SOUTH(1);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = C86154wM.A0D();
        for (C971668e r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C971668e(int i) {
        this.A00 = i;
    }
}
