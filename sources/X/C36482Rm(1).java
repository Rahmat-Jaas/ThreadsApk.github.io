package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.redex.IDxCListenerShape0S2700000_1_I2;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.2Rm  reason: invalid class name and case insensitive filesystem */
public final class C36482Rm {
    public static void A00(Context context, Handler handler, C34640IcN icN, C82824qK r18, RegFlowExtras regFlowExtras, C24721jv r20, C07530bf r21, AnonymousClass265 r22, String str, String str2, String str3) {
        RegFlowExtras regFlowExtras2 = regFlowExtras;
        regFlowExtras2.A0j = true;
        C07530bf r10 = r21;
        AnonymousClass265 r11 = r22;
        C61763Vg A03 = C63313hF.A03(r10, regFlowExtras2.A01(), r11, "phone_autologin_dialog_loaded");
        String str4 = str;
        A03.A03("existing_user_username", str4);
        A03.A01();
        C25828Dsm A0W = C18190wL.A0W(context);
        C34640IcN icN2 = icN;
        A0W.A0l(C18250wR.A0K(str2), icN2);
        A0W.A02 = AnonymousClass0wJ.A0l(context, str4, 2131832463);
        A0W.A0K(2131832460);
        Handler handler2 = handler;
        C82824qK r7 = r18;
        C24721jv r9 = r20;
        String str5 = str3;
        A0W.A0Y(new IDxCListenerShape0S2700000_1_I2(handler2, icN2, r7, regFlowExtras2, r9, r10, r11, str5, str4, 1), AnonymousClass25l.BLUE_BOLD, C18190wL.A0h(context.getResources(), str4, 2131832462), true);
        A0W.A0S(new IDxCListenerShape0S2700000_1_I2(handler2, icN2, r7, regFlowExtras2, r9, r10, r11, str5, str4, 0), AnonymousClass25l.DEFAULT, 2131832461);
        A0W.A0q(false);
        A0W.A0r(false);
        AnonymousClass0wJ.A1K(A0W);
    }
}
