package X;

import android.util.SparseArray;

/* renamed from: X.244  reason: invalid class name */
public enum AnonymousClass244 {
    NOT_SHARED(0),
    SHARING(1),
    UNSHARING(2);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new SparseArray();
        for (AnonymousClass244 r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass244(int i) {
        this.A00 = i;
    }
}
