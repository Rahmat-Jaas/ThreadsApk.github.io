package X;

import android.os.Bundle;
import com.facebook.papaya.client.type.PapayaRestrictions;

/* renamed from: X.7gQ  reason: invalid class name and case insensitive filesystem */
public final class C127037gQ implements C146148lj, AnonymousClass0i1 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public final PapayaRestrictions AgO() {
        AnonymousClass77P r3 = new AnonymousClass77P();
        r3.A01(C972968u.MAX_EXECUTION_TIME_PER_DAY_SEC, 1200);
        r3.A01(C972968u.MAX_EXECUTION_TIME_SEC, 600);
        r3.A01(C972968u.MAX_NETWORK_CONSUMPTION_PER_DAY_BYTES, 2024);
        r3.A01(C972968u.DEVICE_IDLE_REQUIRED, C86114wI.A09(this.A05 ? 1 : 0));
        r3.A01(C972968u.WIFI_REQUIRED, C86114wI.A09(this.A06 ? 1 : 0));
        return AnonymousClass77P.A00(C972968u.EXTERNAL_POWER_REQUIRED, r3, C86114wI.A09(this.A04 ? 1 : 0));
    }

    public final boolean BTd() {
        if (!this.A03 || !AnonymousClass8bQ.A0m(this.A02) || !AnonymousClass8bQ.A0m(this.A00)) {
            return false;
        }
        return true;
    }

    public final String getName() {
        return this.A02;
    }

    public C127037gQ(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = str;
        this.A03 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A06 = z4;
        this.A00 = str2;
        this.A01 = str3;
        this.A07 = z5;
    }

    public final Bundle AgN() {
        Bundle A062 = C18180wK.A06();
        A062.putString("data_namespace", this.A00);
        A062.putLong("feature_group_id", 9001);
        String str = this.A01;
        if (AnonymousClass8bQ.A0m(str)) {
            A062.putString("required_features", str);
        }
        A062.putBoolean("reuse_data", this.A07);
        String string = A062.getString("data_namespace");
        if (string == null) {
            throw C18190wL.A0a("Miss \"data_namespace\" key-value pair in the executor parameter!");
        } else if (!AnonymousClass8bP.A0j(string, ".db", true)) {
            return A062;
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0V("The value of \"data_namespace\" (=", string, ") should not have suffix"));
        }
    }
}
