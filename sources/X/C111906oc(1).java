package X;

import android.content.Context;

/* renamed from: X.6oc  reason: invalid class name and case insensitive filesystem */
public final class C111906oc {
    public final Context A00;

    public final boolean A00(String str) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            return false;
        }
        if (!C15430rJ.A01(str).isOpaque() || str.startsWith(C28174Ezk.A00(517))) {
            return true;
        }
        return false;
    }

    public C111906oc(Context context) {
        this.A00 = context;
    }
}
