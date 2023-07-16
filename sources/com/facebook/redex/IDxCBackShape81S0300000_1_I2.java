package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass3UZ;
import X.AnonymousClass3W9;
import X.AnonymousClass4A9;
import X.AnonymousClass4WJ;
import X.C04220Ms;
import X.C10300i6;
import X.C115436v4;
import X.C121107Ed;
import X.C18180wK;
import X.C31155GhB;
import X.C39777Kzl;
import X.C63263h8;
import X.C63583hq;
import X.C697349v;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4;

public class IDxCBackShape81S0300000_1_I2 implements C39777Kzl {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCBackShape81S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj3;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onButtonClick(View view) {
        String str;
        switch (this.A03) {
            case 0:
                str = "ig_acv_consent_debut_reconsider";
                break;
            case 1:
                str = "ig_acv_consent_debut_reconsider_2";
                break;
            case 2:
                AnonymousClass3UZ r1 = AnonymousClass3UZ.A02;
                if (r1 != null) {
                    UserSession userSession = (UserSession) this.A02;
                    C04220Ms.A0B(userSession, 0);
                    C63583hq.A01(userSession, AnonymousClass006.A0R);
                    AnonymousClass0wJ.A19(r1.A00().A02(userSession, AnonymousClass006.A0j), (FragmentActivity) this.A00, (C10300i6) this.A01);
                    return;
                }
                return;
            default:
                Map A0G = AnonymousClass4WJ.A0G(C18180wK.A0p("media_id", "0"), C18180wK.A0p(IgFragmentActivity.MODULE_KEY, ""));
                C10300i6 r4 = (C10300i6) this.A02;
                AnonymousClass4A9 A002 = C63263h8.A00(r4, "com.instagram.sensitivity.see_why_sheets.publisher_news_sheet_action", A0G);
                AnonymousClass4A9.A02(A002, this.A00, this.A01, r4, 14);
                C31155GhB.A03(A002);
                return;
        }
        C10300i6 r3 = (C10300i6) this.A01;
        C04220Ms.A0B(str, 0);
        C04220Ms.A0B(r3, 0);
        Bundle A06 = C18180wK.A06();
        AnonymousClass3W9.A01(A06, ((C697349v) r3.A01(C697349v.class, new KtLambdaShape24S0100000_I2_4(r3, 32))).A00);
        C121107Ed.A00((Context) this.A00, A06, (C115436v4) null, str, "acv_deeplink_handler", (String) null, (String) null, (String) null, (String) null);
    }

    public final void onDismiss() {
    }

    public final void onShow() {
    }
}
