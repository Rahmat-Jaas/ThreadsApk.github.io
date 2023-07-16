package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3XX;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C102446Vf;
import X.C109326jp;
import X.C11630kW;
import X.C18230wP;
import X.C24269DFl;
import X.C35794J4e;
import X.C63893iY;
import X.C83884s9;
import X.L1Q;
import X.M6q;
import android.app.Activity;
import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

public class IDxFListenerShape1S1600000_2_I2 implements C83884s9 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public IDxFListenerShape1S1600000_2_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A05 = obj6;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A06 = str;
        this.A03 = obj4;
        this.A04 = obj5;
    }

    public final void Bxr(AnonymousClass3XX r3) {
        AnonymousClass601 r1;
        Object obj;
        if (this.A07 != 0) {
            r1 = (AnonymousClass601) this.A02;
            obj = this.A03;
        } else {
            r1 = (AnonymousClass601) this.A03;
            obj = this.A04;
        }
        C63893iY.A0G(r1, (C109326jp) obj);
    }

    public final void CNG(User user) {
        User user2 = user;
        if (this.A07 != 0) {
            Activity activity = (Activity) this.A00;
            UserSession userSession = (UserSession) this.A05;
            AnonymousClass0wJ.A1O(activity, userSession);
            C04220Ms.A0B(user2, 4);
            AnonymousClass601 r3 = (AnonymousClass601) this.A02;
            C102446Vf.A00(activity, (C11630kW) this.A01, r3, (C109326jp) this.A03, (C109326jp) this.A04, M6q.A06(r3), userSession, user2, (String) null, this.A06, (JSONObject) null);
            return;
        }
        C04220Ms.A0B(user2, 0);
        Context context = (Context) this.A00;
        UserSession userSession2 = (UserSession) this.A05;
        String str = this.A06;
        String A002 = C24269DFl.A00(str);
        String BK7 = user2.BK7();
        C04220Ms.A0B(context, 0);
        AnonymousClass0wJ.A1O(userSession2, str);
        C18230wP.A1R(A002, 3, BK7);
        C35794J4e.A00(context, userSession2, user2, (L1Q) this.A01, str, A002, (JSONObject) null, 0, false);
    }
}
