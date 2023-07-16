package X;

import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.5lj  reason: invalid class name and case insensitive filesystem */
public final class C93515lj extends C93375lV {
    public final SparseArray A00 = C86154wM.A0D();

    public C93515lj(C146168ll r3) {
        super(GoogleApiAvailability.A00, r3);
        this.A00.A5i(this, "AutoManageHelper");
    }

    public static final C129157lQ A00(C93515lj r1, int i) {
        SparseArray sparseArray = r1.A00;
        if (sparseArray.size() <= i) {
            return null;
        }
        return (C129157lQ) sparseArray.get(sparseArray.keyAt(i));
    }
}
