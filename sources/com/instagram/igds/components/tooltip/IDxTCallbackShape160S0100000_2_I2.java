package com.instagram.igds.components.tooltip;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.AnonymousClass4DQ;
import X.C112206pB;
import X.C13330nS;
import X.C18180wK;
import X.C25918DvM;
import X.C28161tl;
import X.C28174Ezk;
import X.I17;
import android.content.SharedPreferences;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

public class IDxTCallbackShape160S0100000_2_I2 extends AnonymousClass4DQ {
    public Object A00;
    public final int A01;

    public IDxTCallbackShape160S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void CPS(C25918DvM dvM) {
        SharedPreferences.Editor putLong;
        switch (this.A01) {
            case 0:
                UserSession userSession = ((C112206pB) this.A00).A00;
                AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(userSession)), C28174Ezk.A00(579), true);
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), I17.A00(98)), 538);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    A0I.A0T("type", "ig-rbs-folder-nux");
                    A0I.Bb4();
                    return;
                }
                return;
            case 1:
                SharedPreferences sharedPreferences = ((C28161tl) this.A00).A00;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                String A002 = AnonymousClass000.A00(1136);
                putLong = edit.putInt(A002, sharedPreferences.getInt(A002, 0) + 1).putLong(AnonymousClass000.A00(1135), System.currentTimeMillis());
                break;
            default:
                putLong = C28161tl.A02(AnonymousClass3WS.A01((UserSession) this.A00)).putBoolean(AnonymousClass000.A00(367), true);
                break;
        }
        putLong.apply();
    }
}
