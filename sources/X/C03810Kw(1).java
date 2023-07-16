package X;

import android.os.PersistableBundle;

/* renamed from: X.0Kw  reason: invalid class name and case insensitive filesystem */
public final class C03810Kw implements C02560Bx, C02550Bw {
    public final PersistableBundle A00;

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
        this.A00.putString(str, str2);
    }

    public C03810Kw(PersistableBundle persistableBundle) {
        this.A00 = persistableBundle;
    }

    public final /* bridge */ /* synthetic */ Object CwG() {
        return this.A00;
    }
}
