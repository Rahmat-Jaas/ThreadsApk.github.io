package X;

import android.util.SparseArray;

/* renamed from: X.49P  reason: invalid class name */
public final class AnonymousClass49P implements AnonymousClass0i4 {
    public int A00 = 0;
    public final SparseArray A01 = new SparseArray();
    public final Object A02 = new Object();

    public static AnonymousClass49P A00(C10300i6 r2) {
        return (AnonymousClass49P) r2.A01(AnonymousClass49P.class, AnonymousClass4UW.A00);
    }

    public final int A01(Object obj) {
        int i;
        synchronized (this.A02) {
            SparseArray sparseArray = this.A01;
            i = this.A00;
            sparseArray.put(i, obj);
            this.A00 = i + 1;
        }
        return i;
    }

    public final Object A02(int i) {
        Object obj;
        synchronized (this.A02) {
            obj = this.A01.get(i);
        }
        return obj;
    }

    public final void A03(int i) {
        synchronized (this.A02) {
            this.A01.remove(i);
        }
    }

    public final void onSessionWillEnd() {
        synchronized (this.A02) {
            this.A01.clear();
        }
    }
}
