package X;

import android.os.Bundle;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.instagram.service.session.UserSession;

/* renamed from: X.7gP  reason: invalid class name and case insensitive filesystem */
public final class C127027gP implements C146148lj, AnonymousClass0i1 {
    public final C126017eR A00;
    public final C07810cE A01;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public final PapayaRestrictions AgO() {
        AnonymousClass77P r3 = new AnonymousClass77P();
        r3.A01(C972968u.MAX_EXECUTION_TIME_PER_DAY_SEC, 1200);
        r3.A01(C972968u.MAX_EXECUTION_TIME_SEC, 600);
        r3.A01(C972968u.MAX_NETWORK_CONSUMPTION_PER_DAY_BYTES, 209715200);
        r3.A01(C972968u.DEVICE_IDLE_REQUIRED, 1);
        r3.A01(C972968u.WIFI_REQUIRED, 1);
        return AnonymousClass77P.A00(C972968u.EXTERNAL_POWER_REQUIRED, r3, 1);
    }

    public final boolean BTd() {
        return this.A00.BI3();
    }

    public final String getName() {
        String str;
        C07810cE r2 = this.A00.A00;
        if (r2 == null || (str = r2.BEN(36884522008248707L)) == null) {
            str = "invalid";
        }
        if (str.length() == 0 || str.equals("invalid")) {
            return "invalid_notification_ranking_executor";
        }
        return str;
    }

    public C127027gP(UserSession userSession) {
        C67603zp r1;
        AnonymousClass3Ie A04;
        C61823Vx r0 = C61823Vx.A01;
        if (r0 == null || (A04 = r0.A04(userSession)) == null) {
            r1 = null;
        } else {
            r1 = A04.A01.A00;
        }
        this.A01 = r1;
        this.A00 = new C126017eR(r1);
    }

    public final Bundle AgN() {
        Bundle A06 = C18180wK.A06();
        A06.putString("data_namespace", "dcp");
        A06.putLong("feature_group_id", 4405062069591982L);
        String string = A06.getString("data_namespace");
        if (string == null) {
            throw C18190wL.A0a("Miss \"data_namespace\" key-value pair in the executor parameter!");
        } else if (!AnonymousClass8bP.A0j(string, ".db", true)) {
            return A06;
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0V("The value of \"data_namespace\" (=", string, ") should not have suffix"));
        }
    }
}
