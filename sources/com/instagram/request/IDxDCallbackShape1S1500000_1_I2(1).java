package com.instagram.request;

import X.AnonymousClass0wJ;
import X.AnonymousClass1SX;
import X.AnonymousClass3XX;
import X.AnonymousClass3iG;
import X.AnonymousClass9UH;
import X.BKH;
import X.C04220Ms;
import X.C09830gl;
import X.C10300i6;
import X.C11630kW;
import X.C12560m7;
import X.C14030oh;
import X.C18180wK;
import X.C21771Sc;
import X.C21781Sd;
import X.C21839C2o;
import X.C63673i6;
import X.C63813iO;
import X.McB;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Locale;

public class IDxDCallbackShape1S1500000_1_I2 extends AnonymousClass9UH {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxDCallbackShape1S1500000_1_I2(C12560m7 r1, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        super(r1);
        this.A06 = i;
        this.A03 = obj2;
        this.A04 = obj4;
        this.A02 = obj5;
        this.A01 = obj3;
        this.A05 = str;
        this.A00 = obj;
    }

    public final void onFail(AnonymousClass3XX r13) {
        int A032;
        int i;
        switch (this.A06) {
            case 0:
                A032 = C14030oh.A03(-841908169);
                C63813iO.A0E((Context) this.A00, "fetch_hashtag_permalink_failed");
                String str = ((Hashtag) this.A04).A0B;
                if (str != null) {
                    C63673i6.A09((C11630kW) this.A01, (C10300i6) this.A02, str, "hashtag_page_overflow_menu", this.A05, r13.A01);
                }
                i = 2060969712;
                break;
            case 1:
                A032 = C14030oh.A03(1541770362);
                UserSession userSession = (UserSession) this.A01;
                C21839C2o c2o = (C21839C2o) this.A02;
                String str2 = ((BKH) this.A03).A0U;
                String str3 = this.A05;
                C63673i6.A09(c2o, userSession, str2, str3, "system_share_sheet", r13.A01);
                AnonymousClass3iG.A0B(c2o, userSession, str2, str3, "system_share_sheet", ((User) this.A04).getId(), (String) null);
                i = 888203191;
                break;
            default:
                A032 = C14030oh.A03(541405292);
                User user = (User) this.A04;
                Activity activity = (Activity) this.A00;
                C11630kW r6 = (C11630kW) this.A01;
                Throwable th = r13.A01;
                String str4 = this.A05;
                C09830gl.A01(activity, String.format((Locale) null, "https://www.instagram.com/%s/", new Object[]{user.BK7()}), (String) null);
                C63813iO.A00(activity, 2131829646);
                C63673i6.A09(r6, (UserSession) this.A02, user.getId(), "profile_action_sheet", str4, th);
                i = 856788476;
                break;
        }
        C14030oh.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        Object obj2 = obj;
        switch (this.A06) {
            case 0:
                A032 = C14030oh.A03(-136780191);
                AnonymousClass1SX r4 = (AnonymousClass1SX) obj2;
                int A033 = C14030oh.A03(1065166411);
                McB mcB = (McB) this.A03;
                String str = r4.A00;
                if (str != null) {
                    mcB.apply(str);
                    String str2 = ((Hashtag) this.A04).A0B;
                    if (str2 != null) {
                        UserSession userSession = (UserSession) this.A02;
                        C11630kW r6 = (C11630kW) this.A01;
                        String str3 = this.A05;
                        String str4 = r4.A00;
                        if (str4 != null) {
                            C63673i6.A0A(r6, userSession, str2, "hashtag_page_overflow_menu", str3, str4);
                        }
                    }
                    C14030oh.A0A(-1106835426, A033);
                    i = 314642188;
                    break;
                }
                C04220Ms.A0E("hashtagUrl");
                throw null;
            case 1:
                A032 = C14030oh.A03(-1682503264);
                int A034 = C14030oh.A03(1080484916);
                String str5 = ((C21781Sd) obj2).A00;
                BKH bkh = (BKH) this.A03;
                String str6 = bkh.A0U;
                String str7 = this.A05;
                User user = (User) this.A04;
                String id = user.getId();
                C21839C2o c2o = (C21839C2o) this.A02;
                UserSession userSession2 = (UserSession) this.A01;
                AnonymousClass3iG.A0B(c2o, userSession2, str6, str7, "system_share_sheet", id, str5);
                Bundle A062 = C18180wK.A06();
                A062.putString("android.intent.extra.TEXT", str5);
                String str8 = bkh.A0V;
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("url", str5);
                A0y.put("reel_id", str8);
                AnonymousClass3iG.A0C(user, "item_id", str6, A0y);
                AnonymousClass3iG.A03((Activity) this.A00, A062, c2o, userSession2, "share_to_system_sheet", A0y);
                C63673i6.A0A(c2o, userSession2, str6, str7, "system_share_sheet", str5);
                C14030oh.A0A(1779079972, A034);
                i = -851974800;
                break;
            default:
                A032 = C14030oh.A03(-2013835951);
                C21771Sc r42 = (C21771Sc) obj2;
                int A035 = C14030oh.A03(1094024609);
                ((McB) this.A03).apply(r42.A00);
                C63673i6.A0A((C11630kW) this.A01, (UserSession) this.A02, ((User) this.A04).getId(), "profile_action_sheet", this.A05, r42.A00);
                C14030oh.A0A(-1931437318, A035);
                i = -248580840;
                break;
        }
        C14030oh.A0A(i, A032);
    }
}
