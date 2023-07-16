package X;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.77f  reason: invalid class name */
public final class AnonymousClass77f {
    public C121217Ev A00;
    public final SparseIntArray A01;

    public AnonymousClass77f(C121217Ev r2) {
        this.A01 = new SparseIntArray();
        C13320nQ.A01(r2);
        this.A00 = r2;
    }

    public final int A00(Context context, C148598rX r6) {
        C13320nQ.A01(context);
        C13320nQ.A01(r6);
        int Ave = r6.Ave();
        SparseIntArray sparseIntArray = this.A01;
        int i = sparseIntArray.get(Ave, -1);
        if (i == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= sparseIntArray.size()) {
                    i = this.A00.A02(context, Ave);
                    break;
                }
                int keyAt = sparseIntArray.keyAt(i2);
                if (keyAt > Ave && sparseIntArray.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i2++;
            }
            sparseIntArray.put(Ave, i);
        }
        return i;
    }

    public AnonymousClass77f() {
        this(GoogleApiAvailability.A00);
    }
}
