package X;

import android.content.Context;

/* renamed from: X.7m3  reason: invalid class name and case insensitive filesystem */
public final class C129527m3 implements C143838hO {
    public final C108976jG Cgl(Context context, C145408kS r7, String str) {
        C108976jG r4 = new C108976jG();
        r4.A00 = r7.DBt(context, str);
        int i = 1;
        int DBy = r7.DBy(context, str, true);
        r4.A01 = DBy;
        int i2 = r4.A00;
        if (i2 == 0) {
            if (DBy == 0) {
                r4.A02 = 0;
                return r4;
            }
            i2 = 0;
        }
        if (DBy < i2) {
            i = -1;
        }
        r4.A02 = i;
        return r4;
    }
}
