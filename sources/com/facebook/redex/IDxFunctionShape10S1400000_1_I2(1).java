package com.facebook.redex;

import X.AnonymousClass0TJ;
import X.C11630kW;
import X.C18180wK;
import X.C19540Ay1;
import X.C309923u;
import X.C61693Ux;
import X.C63803iN;
import X.C63863iT;
import X.McB;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.venue.Venue;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxFunctionShape10S1400000_1_I2 implements McB {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public IDxFunctionShape10S1400000_1_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj4;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = str;
    }

    public final Object apply(Object obj) {
        Object obj2 = obj;
        if (this.A05 != 0) {
            Context context = (Context) this.A00;
            new C61693Ux(context, (C11630kW) this.A02, (UserSession) this.A01, (String) obj2, ((Venue) this.A03).getId(), context.getResources().getString(2131833857), this.A04, (String) null).A01();
            return null;
        }
        UserSession userSession = (UserSession) this.A00;
        User user = (User) this.A01;
        Activity activity = (Activity) this.A02;
        C11630kW r12 = (C11630kW) this.A03;
        String str = this.A04;
        String str2 = (String) obj2;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36318179033223383L)) {
            C309923u r8 = C309923u.PROFILE_NAV_ICON;
            String BK7 = user.BK7();
            String Ak1 = user.Ak1();
            String A012 = C19540Ay1.A01(user.getId());
            Bundle A06 = C18180wK.A06();
            A06.putSerializable("NametagFragment.ARGUMENT_ENTRY_POINT", r8);
            A06.putBoolean("NametagFragment.ARGUMENT_SCAN_MODE", false);
            A06.putString("NametagFragment.ARGUMENT_USERNAME", BK7);
            A06.putString("NametagFragment.ARGUMENT_FULLNAME", Ak1);
            A06.putString("NametagFragment.ARGUMENT_USER_ID", A012);
            A06.putBoolean("NametagFragment.ARGUMENT_ENABLE_DOWNLOAD_QR", true);
            C63863iT.A09(activity, A06, userSession, TransparentModalActivity.class, "nametag");
            return null;
        }
        new C61693Ux(activity, r12, userSession, str2, C19540Ay1.A01(user.getId()), activity.getResources().getString(2131833859), str, (String) null).A01();
        return null;
    }
}
