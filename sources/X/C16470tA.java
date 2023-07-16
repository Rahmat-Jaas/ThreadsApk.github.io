package X;

import android.content.SharedPreferences;

/* renamed from: X.0tA  reason: invalid class name and case insensitive filesystem */
public final class C16470tA implements C12330li {
    public C12350lk A00;
    public final C12800mV A01;

    public final String AXb() {
        return "device_auth";
    }

    public final synchronized C12350lk Aqs() {
        return this.A00;
    }

    public final synchronized boolean D8c(C12350lk r4) {
        boolean z;
        if (!this.A00.equals(r4)) {
            SharedPreferences.Editor edit = this.A01.A00(AnonymousClass006.A0j).A00.edit();
            edit.putString("/settings/mqtt/id/connection_key", (String) r4.first);
            edit.putString("/settings/mqtt/id/connection_secret", (String) r4.second);
            edit.apply();
            this.A00 = r4;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void clear() {
        D8c(C12350lk.A00);
    }

    public C16470tA(C12800mV r5) {
        this.A01 = r5;
        SharedPreferences sharedPreferences = r5.A00(AnonymousClass006.A0j).A00;
        this.A00 = C12350lk.A00(sharedPreferences.getString("/settings/mqtt/id/connection_key", ""), sharedPreferences.getString("/settings/mqtt/id/connection_secret", ""));
    }
}
