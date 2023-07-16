package X;

import android.os.Bundle;

/* renamed from: X.0Mu  reason: invalid class name and case insensitive filesystem */
public final class C04240Mu implements C02560Bx, C02550Bw {
    public final Bundle A00;

    public final String getString(String str, String str2) {
        return this.A00.getString(str, (String) null);
    }

    public final int getInt(String str, int i) {
        return this.A00.getInt(str, i);
    }

    public final void putInt(String str, int i) {
        this.A00.putInt(str, i);
    }

    public final void putString(String str, String str2) {
        if (str2 != null) {
            this.A00.putString(str, str2);
        }
    }

    public C04240Mu(Bundle bundle) {
        this.A00 = bundle;
    }

    public final /* bridge */ /* synthetic */ Object CwG() {
        return this.A00;
    }
}
