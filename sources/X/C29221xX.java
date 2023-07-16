package X;

import android.os.Bundle;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1xX  reason: invalid class name and case insensitive filesystem */
public final class C29221xX extends C23411dm implements C11630kW, C82034oy {
    public static final String __redex_internal_original_name = "ManageSavedLoginFragment";
    public UserSession A00;
    public String A01;
    public boolean A02;

    public final String getModuleName() {
        return "manage_saved_login";
    }

    public static void A0B(C29221xX r4) {
        IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(r4, 64);
        C32165H8c A07 = C63883iV.A07(r4.requireContext(), r4.A00, C18180wK.A0Y());
        A07.A00 = A06;
        r4.schedule(A07);
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0052, code lost:
        if (r1.equals("consented") == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.C29221xX r7) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            com.instagram.service.session.UserSession r0 = r7.A00
            java.lang.String r6 = r0.getUserId()
            r5 = 2131835178(0x7f11392a, float:1.9303487E38)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.3hk r0 = X.C63533hk.A02(r0)
            boolean r3 = r0.A0I(r6)
            r0 = 25
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r2 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r2.<init>((java.lang.Object) r7, (int) r0)
            X.4DG r1 = new X.4DG
            r1.<init>(r7, r6)
            X.4MC r0 = new X.4MC
            r0.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r2, (X.C33516HpC) r1, (int) r5, (boolean) r3)
            r4.add(r0)
            r0 = 2131835177(0x7f113929, float:1.9303485E38)
            X.C63293hC.A00(r7, r4, r0)
            com.instagram.service.session.UserSession r3 = r7.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36318599937266319(0x8107930000128f, double:3.031367071366311E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0072
            r3 = 2131835185(0x7f113931, float:1.9303501E38)
            java.lang.String r1 = r7.A01
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = "consented"
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            r0 = 26
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r1.<init>((java.lang.Object) r7, (int) r0)
            r0 = 16
            X.4MC r0 = X.AnonymousClass4MC.A04(r1, r7, r0, r3, r2)
            r4.add(r0)
            boolean r1 = r7.A02
            r0 = 2131835183(0x7f11392f, float:1.9303497E38)
            if (r1 == 0) goto L_0x006f
            r0 = 2131835184(0x7f113930, float:1.93035E38)
        L_0x006f:
            X.C63293hC.A00(r7, r4, r0)
        L_0x0072:
            r7.setItems(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29221xX.A0C(X.1xX):void");
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.Crs(AnonymousClass0wJ.A0B(this).getString(2131830269));
        r3.CtT(true);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-7482423);
        super.onCreate(bundle);
        UserSession A0W = AnonymousClass0wJ.A0W(this);
        this.A00 = A0W;
        if (C63803iN.A0E(AnonymousClass0TJ.A06, A0W, 36318599937266319L)) {
            C62323Yh.A00.A01(this.A00, "manage_saved_login", "client_del_setting_opt_out_shown");
            A0B(this);
        } else {
            A0C(this);
        }
        C14030oh.A09(541545386, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1210327061);
        super.onResume();
        if (C63803iN.A05(AnonymousClass0TJ.A06, this.A00, 36318599937266319L).booleanValue()) {
            A0B(this);
        } else {
            A0C(this);
        }
        C14030oh.A09(691635260, A022);
    }
}
