package com.facebook.redex;

import X.AnonymousClass06E;
import X.AnonymousClass0wJ;
import X.AnonymousClass3XX;
import X.AnonymousClass601;
import X.BKU;
import X.C04220Ms;
import X.C109326jp;
import X.C15680ri;
import X.C20066BMj;
import X.C25791Ds4;
import X.C27950Ew0;
import X.C36480JXd;
import X.C39800L0r;
import X.C63893iY;
import X.C83884s9;
import android.app.Activity;
import androidx.core.app.ComponentActivity;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

public class IDxFListenerShape0S1600000_1_I2 implements C83884s9 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public IDxFListenerShape0S1600000_1_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A05 = obj5;
        this.A01 = obj6;
        this.A06 = str;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A02 = obj2;
    }

    public final void Bxr(AnonymousClass3XX r3) {
        Object obj;
        int i = this.A07;
        AnonymousClass601 r1 = (AnonymousClass601) this.A02;
        if (i != 0) {
            obj = this.A03;
        } else {
            obj = this.A04;
        }
        C63893iY.A0G(r1, (C109326jp) obj);
    }

    public final void CNG(User user) {
        int i = this.A07;
        User user2 = user;
        C04220Ms.A0B(user2, 0);
        if (i != 0) {
            Activity activity = (Activity) this.A00;
            UserSession userSession = (UserSession) this.A05;
            String str = this.A06;
            IDxACallbackShape15S0300000_1_I2 iDxACallbackShape15S0300000_1_I2 = new IDxACallbackShape15S0300000_1_I2(19, this.A03, this.A04, this.A02);
            AnonymousClass0wJ.A1N(activity, userSession);
            C25791Ds4.A04(activity, (C15680ri) null, iDxACallbackShape15S0300000_1_I2, (BKU) null, (C20066BMj) null, (SearchContext) null, userSession, (C27950Ew0) this.A01, user2, (Integer) null, str, str, (String) null, (JSONObject) null);
            return;
        }
        ComponentActivity componentActivity = (ComponentActivity) this.A00;
        String str2 = this.A06;
        C36480JXd jXd = C36480JXd.A02;
        C04220Ms.A0C(componentActivity, "null cannot be cast to non-null type android.app.Activity");
        jXd.A04(componentActivity, AnonymousClass06E.A00(componentActivity), (UserSession) this.A05, (C39800L0r) this.A03, user2.getId(), str2, (String) null);
    }
}
