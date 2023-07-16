package X;

import android.content.SharedPreferences;

/* renamed from: X.0e9  reason: invalid class name and case insensitive filesystem */
public final class C08720e9 implements AnonymousClass0i1 {
    public boolean A00 = false;

    public final void onUserSessionWillEnd(boolean z) {
        SharedPreferences.Editor edit = C07960cV.A00.edit();
        for (C07950cU r1 : C07960cV.A02) {
            if (r1 instanceof AnonymousClass0e5) {
                String A02 = C07960cV.A02(r1);
                edit.remove(A02);
                C07960cV.A01.remove(A02);
            }
        }
        edit.apply();
        this.A00 = false;
    }
}
