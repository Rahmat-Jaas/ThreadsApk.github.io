package X;

import android.util.SparseArray;

/* renamed from: X.24M  reason: invalid class name */
public enum AnonymousClass24M {
    NOT_SHARED(0),
    SHARING(1),
    UNSHARING(2),
    SHARED(3);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new SparseArray();
        for (AnonymousClass24M r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass24M(int i) {
        this.A00 = i;
    }
}
