package X;

import android.widget.TextView;
import com.instagram.fx.access.sso.FxSsoViewModel;

/* renamed from: X.1io  reason: invalid class name and case insensitive filesystem */
public final class C24441io extends C63873iU {
    public final /* synthetic */ C26743EUq A00;
    public final /* synthetic */ C18330wh A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ C24751jz A04;
    public final /* synthetic */ C07530bf A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public C24441io(C26743EUq eUq, C24751jz r2, C07530bf r3, C18330wh r4, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A04 = r2;
        this.A09 = z;
        this.A08 = z2;
        this.A07 = str;
        this.A06 = str2;
        this.A03 = z3;
        this.A05 = r3;
        this.A02 = str3;
        this.A00 = eUq;
        this.A01 = r4;
    }

    private void A00() {
        FxSsoViewModel fxSsoViewModel = this.A04.A00;
        if (fxSsoViewModel != null) {
            C18230wP.A0J(fxSsoViewModel.A04).A0H(true);
        }
    }

    private void A01(String str, boolean z) {
        C24751jz r0 = this.A04;
        C07530bf r3 = r0.A08;
        AnonymousClass265 r2 = r0.A0A;
        C54112yv.A00(r3, C18180wK.A0Y(), r2.A01, this.A07, str, z, this.A08);
        C61763Vg A032 = C63313hF.A03(r3, C313625r.A03, r2, "submit_fb_sso_login_started_failed");
        if (str != null) {
            A032.A03("error", str);
        }
        A032.A01();
        if (str != null && !str.equals("fb_email_taken")) {
            A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016b, code lost:
        if ((!r0) != false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r5.A09 != false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x026a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r24) {
        /*
            r23 = this;
            r4 = r24
            r0 = -1331261082(0xffffffffb0a69166, float:-1.2119414E-9)
            int r16 = X.C14030oh.A03(r0)
            X.1qz r4 = (X.C26651qz) r4
            r0 = -1246729154(0xffffffffb5b06c3e, float:-1.3144524E-6)
            int r2 = X.C14030oh.A03(r0)
            com.instagram.user.model.User r13 = r4.A05
            r5 = r23
            if (r13 == 0) goto L_0x0177
            int r0 = r4.A00
            r7 = 4
            r1 = 1
            if (r0 == r7) goto L_0x0023
            r1 = 0
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x006f
        L_0x0023:
            java.lang.String r6 = r4.A0C
            if (r6 == 0) goto L_0x006f
            X.1jz r8 = r5.A04
            if (r1 == 0) goto L_0x006b
            X.0bf r4 = r8.A08
            java.lang.String r3 = "can_recover_password"
            r1 = 0
            X.265 r0 = r8.A0A
            X.C63313hF.A04(r4, r1, r0, r3)
            android.app.Activity r0 = r8.A04
            X.Dsm r3 = X.C18190wL.A0W(r0)
            r0 = 2131834858(0x7f1137ea, float:1.9302838E38)
            r3.A0K(r0)
            r1 = 2131834856(0x7f1137e8, float:1.9302834E38)
            com.facebook.redex.IDxCListenerShape14S1200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape14S1200000_1_I2
            r0.<init>((java.lang.Object) r8, (java.lang.Object) r13, (java.lang.String) r6, (int) r7)
            r3.A0P(r0, r1)
            X.AnonymousClass0wJ.A1K(r3)
        L_0x004f:
            X.269 r0 = X.AnonymousClass269.A0i
        L_0x0051:
            X.0bf r4 = r8.A08
            java.lang.String r3 = r0.A01
            X.265 r1 = r8.A0A
            X.25r r0 = X.C313625r.A03
            X.C63313hF.A04(r4, r0, r1, r3)
        L_0x005c:
            r0 = -469480100(0xffffffffe4044d5c, float:-9.762178E21)
            X.C14030oh.A0A(r0, r2)
            r1 = -2053883581(0xffffffff85943943, float:-1.3938888E-35)
            r0 = r16
            X.C14030oh.A0A(r1, r0)
            return
        L_0x006b:
            X.C24751jz.A05(r8, r13, r6)
            goto L_0x004f
        L_0x006f:
            X.1jz r7 = r5.A04
            X.0bf r1 = r7.A08
            X.IcN r10 = r7.A06
            android.content.Context r17 = r10.getContext()
            r6 = 0
            java.lang.String r0 = r4.A0A
            X.0kW r9 = r7.A07
            r22 = r6
            r18 = r9
            r19 = r1
            r20 = r13
            r21 = r0
            com.instagram.service.session.UserSession r3 = X.C67323zM.A03(r17, r18, r19, r20, r21, r22)
            java.lang.String r8 = r13.BK7()
            com.instagram.common.typedurl.ImageUrl r0 = r13.B4M()
            X.C63593hs.A04(r0, r8)
            X.3XU r0 = X.AnonymousClass3XU.A00(r1)
            X.4nK r0 = r0.A00
            monitor-enter(r0)
            monitor-exit(r0)
            X.3V1 r12 = new X.3V1
            r12.<init>()
            android.os.Bundle r0 = r12.A00
            X.AnonymousClass267.A00(r0)
            X.265 r11 = r7.A0A
            java.lang.String r8 = r11.A01
            java.lang.String r21 = r13.getId()
            boolean r0 = r5.A08
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r0)
            X.C04220Ms.A0B(r1, r6)
            r22 = 64
            r17 = r1
            r18 = r12
            r20 = r8
            X.AnonymousClass3X9.A00(r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = "submit_fb_sso_login_request_success"
            X.25r r8 = X.C313625r.A03
            X.C63313hF.A04(r1, r8, r11, r0)
            X.0TJ r15 = X.AnonymousClass0TJ.A05
            r0 = 18310802792522733(0x410d94000023ed, double:1.8972136256302725E-307)
            boolean r11 = X.C63173fJ.A05(r15, r0)
            if (r11 != 0) goto L_0x0104
            X.3S9 r14 = r7.A09
            com.facebook.AccessToken r11 = r14.A00
            if (r11 != 0) goto L_0x00ea
            java.lang.String r13 = r4.A07
            java.lang.String r12 = r5.A07
            com.facebook.AccessToken r11 = new com.facebook.AccessToken
            r11.<init>(r13, r12)
            r14.A00 = r11
        L_0x00ea:
            boolean r0 = X.C63173fJ.A05(r15, r0)
            if (r0 != 0) goto L_0x00f7
            com.facebook.AccessToken r0 = r14.A00
            if (r0 == 0) goto L_0x00f7
            X.C67363zQ.A0B(r0, r3)
        L_0x00f7:
            java.lang.String r12 = r4.A07
            java.lang.String r11 = r5.A07
            java.lang.Integer r1 = X.AnonymousClass006.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            X.C67363zQ.A0D(r3, r0, r1, r12, r11)
        L_0x0104:
            android.os.Bundle r11 = r10.mArguments
            if (r11 == 0) goto L_0x016e
            java.lang.String r1 = "original_url"
            java.lang.String r0 = r11.getString(r1)
            if (r0 == 0) goto L_0x016e
            java.lang.String r0 = r11.getString(r1)
            android.net.Uri r11 = X.C15430rJ.A01(r0)
        L_0x0118:
            if (r11 == 0) goto L_0x0126
            android.net.Uri$Builder r11 = r11.buildUpon()
            java.lang.String r1 = "fresh_sign_in"
            java.lang.String r0 = "1"
            android.net.Uri r11 = X.C18220wO.A0F(r11, r1, r0)
        L_0x0126:
            X.352 r0 = r4.A02
            if (r0 == 0) goto L_0x0170
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0170
            android.content.SharedPreferences r1 = X.C28161tl.A04(r3)
            java.lang.String r4 = "account_nux_ran"
            boolean r0 = r1.getBoolean(r4, r6)
            if (r0 != 0) goto L_0x0169
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r0 = 1
            X.AnonymousClass0wJ.A13(r1, r4, r0)
        L_0x0142:
            android.content.Context r1 = r10.getContext()
            X.255 r0 = X.C63443hU.A00()
            boolean r0 = X.AnonymousClass0wJ.A1W(r0)
            X.H8c r0 = X.C36452Rj.A00(r1, r3, r0)
            X.C31155GhB.A03(r0)
            X.3hW r4 = X.C63463hW.A02()
            android.app.Activity r1 = r7.A04
            com.facebook.redex.IDxFListenerShape336S0200000_1_I2 r0 = new com.facebook.redex.IDxFListenerShape336S0200000_1_I2
            r0.<init>(r6, r5, r3)
            r9 = r6
            r5 = r1
            r6 = r0
            r7 = r3
            r4.A09(r5, r6, r7, r8, r9)
            goto L_0x005c
        L_0x0169:
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0170
            goto L_0x0142
        L_0x016e:
            r11 = 0
            goto L_0x0118
        L_0x0170:
            android.app.Activity r0 = r7.A04
            X.C67323zM.A04(r0, r11, r9, r3)
            goto L_0x005c
        L_0x0177:
            boolean r0 = r4.A0G
            r10 = 1
            if (r0 == 0) goto L_0x02f8
            X.1jz r8 = r5.A04
            X.IcN r0 = r8.A06
            android.content.Context r1 = r0.getContext()
            r0 = 2130970427(0x7f04073b, float:1.7549564E38)
            boolean r0 = X.C121907Is.A05(r1, r0, r10)
            if (r0 == 0) goto L_0x02dd
            com.instagram.nux.cal.model.SignupContent r11 = r4.A03
            X.3FW r13 = r4.A04
            if (r13 == 0) goto L_0x01dd
            java.util.List r6 = r13.A00()
            java.util.List r7 = r13.A02
            X.0bf r9 = r8.A08
            java.lang.String r3 = "username_suggestion_prototypes_received"
            r1 = 0
            X.265 r0 = r8.A0A
            X.3Vg r3 = X.C63313hF.A03(r9, r1, r0, r3)
            java.lang.String r0 = ", "
            X.GdW r12 = new X.GdW
            r12.<init>(r0)
            java.util.List r0 = r13.A01
            if (r0 != 0) goto L_0x01d1
            java.util.List r0 = r13.A02
            java.util.ArrayList r0 = X.C18200wM.A0t(r0)
            r13.A01 = r0
            java.util.List r0 = r13.A02
            java.util.Iterator r9 = r0.iterator()
        L_0x01bd:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r0 = r9.next()
            X.38z r0 = (X.C569038z) r0
            java.util.List r1 = r13.A01
            java.lang.String r0 = r0.A00
            r1.add(r0)
            goto L_0x01bd
        L_0x01d1:
            java.util.List r0 = r13.A01
            java.lang.String r1 = r12.A04(r0)
            java.lang.String r0 = "prototypes"
            r3.A03(r0, r1)
            goto L_0x01f0
        L_0x01dd:
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.ArrayList r6 = r4.A0E
            if (r6 == 0) goto L_0x0265
            X.0bf r9 = r8.A08
            java.lang.String r3 = "no_prototype_sent"
            r1 = 0
            X.265 r0 = r8.A0A
            X.3Vg r3 = X.C63313hF.A03(r9, r1, r0, r3)
        L_0x01f0:
            r3.A01()
        L_0x01f3:
            if (r11 == 0) goto L_0x026a
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 2324140656521380674(0x2041019d00000342, double:2.5367758799567745E-153)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            java.lang.String r10 = r5.A06
            if (r0 == 0) goto L_0x0209
            java.lang.String r0 = r4.A07
            if (r0 == 0) goto L_0x0209
            r10 = r0
        L_0x0209:
            X.4Et r9 = new X.4Et
            r9.<init>(r4, r5, r6, r7)
            android.app.Activity r4 = r8.A04
            X.0bf r6 = r5.A05
            r5 = 3233(0xca1, float:4.53E-42)
            java.lang.Class<com.instagram.nux.cal.activity.CalActivity> r0 = com.instagram.nux.cal.activity.CalActivity.class
            android.content.Intent r3 = X.C18250wR.A04(r4, r0)
            java.lang.String r0 = "REG_FLOW"
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r0 = "argument_flow"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "argument_requested_code"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "argument_access_token"
            r3.putExtra(r0, r10)
            java.lang.String r0 = "argument_content"
            r3.putExtra(r0, r11)
            X.22g r1 = X.C306222g.IG_FB_SIGN_UP
            java.lang.String r0 = "argument_entry_point"
            r3.putExtra(r0, r1)
            java.lang.String r1 = r6.getToken()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r3.putExtra(r0, r1)
            android.os.Bundle r1 = X.C18180wK.A06()
            r9.CwK(r1)
            java.lang.String r0 = "argument_client_extras_bundle"
            r3.putExtra(r0, r1)
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r3.setFlags(r0)
            X.C10650ih.A08(r4, r3, r5)
            r1 = 2130772068(0x7f010064, float:1.7147244E38)
            r0 = 2130772067(0x7f010063, float:1.7147242E38)
            r4.overridePendingTransition(r1, r0)
            X.269 r0 = X.AnonymousClass269.A0g
            goto L_0x0051
        L_0x0265:
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x01f3
        L_0x026a:
            r5.A00()
            java.lang.String r12 = "missing_content"
            X.0bf r11 = r8.A08
            java.lang.String r1 = "submit_fb_login_signup_request_failed"
            r9 = 0
            X.265 r3 = r8.A0A
            X.25r r0 = X.C313625r.A03
            X.3Vg r1 = X.C63313hF.A03(r11, r0, r3, r1)
            java.lang.String r0 = "error"
            r1.A03(r0, r12)
            r1.A01()
            java.lang.String r0 = "facebook_cal_disabled"
            X.3Vg r3 = X.C63313hF.A03(r11, r9, r3, r0)
            java.lang.String r9 = r5.A07
            java.lang.String r0 = "fbid"
            r3.A03(r0, r9)
            java.lang.String r0 = "reason"
            r3.A03(r0, r12)
            java.lang.String r0 = "cal_enabled"
            r3.A04(r0, r10)
            X.255 r0 = X.C63443hU.A00()
            boolean r1 = X.AnonymousClass0wJ.A1W(r0)
            java.lang.String r0 = "fb4a_installed"
            r3.A04(r0, r1)
            boolean r1 = r5.A08
            java.lang.String r0 = "found_unlinked_account"
            r3.A04(r0, r1)
            r3.A01()
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 18310802792522733(0x410d94000023ed, double:1.8972136256302725E-307)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            if (r0 != 0) goto L_0x02c9
            java.lang.String r1 = r4.A07
            com.facebook.AccessToken r0 = new com.facebook.AccessToken
            r0.<init>(r1, r9)
            X.C67363zQ.A0A(r0, r11, r10)
        L_0x02c9:
            java.lang.String r3 = r4.A0B
            java.lang.String r1 = r5.A06
            java.lang.String r0 = r4.A07
            if (r0 == 0) goto L_0x02d2
            r1 = r0
        L_0x02d2:
            r13 = 0
            r14 = r13
            r9 = r3
            r10 = r1
            r11 = r6
            r12 = r7
            X.C24751jz.A07(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x005c
        L_0x02dd:
            r5.A00()
            X.Dsm r1 = X.C18190wL.A0W(r1)
            r0 = 2131822355(0x7f110713, float:1.927748E38)
            r1.A0L(r0)
            r0 = 2131822354(0x7f110712, float:1.9277477E38)
            r1.A0K(r0)
            X.C18180wK.A1M(r1)
            X.AnonymousClass0wJ.A1K(r1)
            goto L_0x005c
        L_0x02f8:
            java.lang.String r0 = r4.mErrorType
            if (r0 != 0) goto L_0x02fe
            java.lang.String r0 = "bad_response"
        L_0x02fe:
            r5.A01(r0, r10)
            X.1jz r0 = r5.A04
            X.C24751jz.A04(r0)
            java.lang.String r1 = "bad response with code: "
            int r0 = r4.A00
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r0)
            java.lang.String r0 = "FacebookSignUpRequest"
            X.C10450iM.A03(r0, r1)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24441io.onSuccess(java.lang.Object):void");
    }

    public final void onFail(AnonymousClass3XX r7) {
        String str;
        int i;
        int A032 = C14030oh.A03(199448296);
        Object obj = r7.A00;
        if (obj != null) {
            AnonymousClass1TP r1 = (AnonymousClass1TP) obj;
            if (r1.A02) {
                C24751jz r5 = this.A04;
                AnonymousClass3DR r3 = r1.A01;
                r5.A05.post(new C73364Sc(r1.A00, r3, r5));
                i = 520709268;
                C14030oh.A0A(i, A032);
            }
        }
        boolean A1W = AnonymousClass0wJ.A1W(obj);
        if (!A1W || (str = ((AnonymousClass1j3) obj).mErrorType) == null) {
            str = "request_failed";
        }
        A01(str, A1W);
        Throwable th = r7.A01;
        if (th != null) {
            C10450iM.A07("facebook_sso_error", th);
        }
        if (A1W) {
            C26651qz r52 = (C26651qz) obj;
            if (!r52.isCheckpointRequired()) {
                this.A04.A0B(r52, this.A06, this.A07, this.A02);
            }
            String str2 = r52.A0D;
            if (str2 != null) {
                C26743EUq eUq = this.A00;
                if (eUq.A06()) {
                    ((TextView) eUq.A03()).setText(str2);
                }
            }
        } else {
            C62973bE.A01(this.A04.A04);
        }
        i = 135474822;
        C14030oh.A0A(i, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(1480635586);
        this.A01.dismiss();
        C14030oh.A0A(-1042541519, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(-751398654);
        C13950oZ.A00(this.A01);
        C14030oh.A0A(-1197428518, A032);
    }
}
