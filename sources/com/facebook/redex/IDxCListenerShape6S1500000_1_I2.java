package com.facebook.redex;

import X.AnonymousClass067;
import X.AnonymousClass0wJ;
import X.AnonymousClass14U;
import X.AnonymousClass29W;
import X.AnonymousClass2AC;
import X.AnonymousClass2AD;
import X.AnonymousClass3DJ;
import X.AnonymousClass3Ui;
import X.C04220Ms;
import X.C11630kW;
import X.C146958n9;
import X.C25237DiI;
import X.C27952Ew2;
import X.C34640IcN;
import X.C35762Os;
import X.C49322rC;
import X.C58173Ej;
import X.C60583Pr;
import X.C63813iO;
import X.C63823iP;
import X.C67233zC;
import X.C72204Na;
import android.content.Context;
import android.content.DialogInterface;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.instagram.service.session.UserSession;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape24S0201000_I2_10;

public class IDxCListenerShape6S1500000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public IDxCListenerShape6S1500000_1_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A06 = i;
        this.A02 = obj2;
        this.A04 = obj4;
        this.A00 = obj3;
        this.A05 = str;
        this.A01 = obj;
        this.A03 = obj5;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A06 != 0) {
            LifecycleCoroutineScopeImpl A002 = AnonymousClass067.A00((ComponentActivity) this.A02);
            UserSession userSession = (UserSession) this.A04;
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape24S0201000_I2_10(this.A03, (Object) userSession, (C146958n9) null, 5), A002, 3);
            C11630kW r0 = (C11630kW) this.A00;
            AnonymousClass0wJ.A1N(userSession, r0);
            AnonymousClass3Ui r8 = new AnonymousClass3Ui(r0, userSession);
            AnonymousClass3DJ A062 = C63823iP.A06(userSession, 0);
            String str = this.A05;
            AnonymousClass3Ui.A00(r8, A062, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_upsell_enable_flow_dialog_turn_on", str, (Map) null, 4088);
            AnonymousClass0wJ.A0Y(userSession).A2X(true);
            C63813iO.A03((Context) this.A01, (String) null, 2131833978, 0);
            AnonymousClass3Ui.A00(C60583Pr.A01(userSession), C63823iP.A06(userSession, 0), (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_enable_flow_toast_shown", str, (Map) null, 4088);
            return;
        }
        UserSession userSession2 = (UserSession) this.A04;
        C34640IcN icN = (C34640IcN) this.A02;
        AnonymousClass2AC r5 = (AnonymousClass2AC) this.A01;
        String str2 = this.A05;
        C72204Na r3 = new C72204Na((FragmentActivity) this.A00, r5, icN, userSession2, (C67233zC) this.A03);
        C58173Ej A003 = C35762Os.A00();
        C04220Ms.A0C(icN, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        A003.A00(icN, userSession2, r3).A06(str2);
        C49322rC.A00(r5, AnonymousClass29W.ACCEPT, AnonymousClass2AD.A0R, AnonymousClass14U.A00(), userSession2);
    }
}
