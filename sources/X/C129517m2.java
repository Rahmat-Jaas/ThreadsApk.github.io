package X;

import android.content.Context;

/* renamed from: X.7m2  reason: invalid class name and case insensitive filesystem */
public final class C129517m2 implements C143838hO {
    public final C108976jG Cgl(Context context, C145408kS r5, String str) {
        C108976jG r2 = new C108976jG();
        int i = 1;
        int DBy = r5.DBy(context, str, true);
        r2.A01 = DBy;
        if (DBy == 0) {
            int DBt = r5.DBt(context, str);
            r2.A00 = DBt;
            if (DBt != 0) {
                i = -1;
            }
            return r2;
        }
        r2.A02 = i;
        return r2;
    }
}
