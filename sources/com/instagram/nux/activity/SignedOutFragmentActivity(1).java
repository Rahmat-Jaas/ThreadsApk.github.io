package com.instagram.nux.activity;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0RJ;
import X.AnonymousClass0gN;
import X.AnonymousClass0gW;
import X.AnonymousClass0wJ;
import X.AnonymousClass1iQ;
import X.AnonymousClass1iR;
import X.AnonymousClass1mJ;
import X.AnonymousClass1mK;
import X.AnonymousClass265;
import X.AnonymousClass269;
import X.AnonymousClass2AT;
import X.AnonymousClass2B9;
import X.AnonymousClass34B;
import X.AnonymousClass36Y;
import X.AnonymousClass38W;
import X.AnonymousClass38Y;
import X.AnonymousClass39K;
import X.AnonymousClass3FR;
import X.AnonymousClass3GT;
import X.AnonymousClass3HU;
import X.AnonymousClass3J5;
import X.AnonymousClass3R8;
import X.AnonymousClass3ZJ;
import X.AnonymousClass44X;
import X.AnonymousClass45A;
import X.AnonymousClass45O;
import X.AnonymousClass49X;
import X.AnonymousClass4EZ;
import X.AnonymousClass7IU;
import X.AnonymousClass7Ko;
import X.C04220Ms;
import X.C07530bf;
import X.C09140ev;
import X.C09650fs;
import X.C10300i6;
import X.C11630kW;
import X.C126197ek;
import X.C14030oh;
import X.C146958n9;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C18330wh;
import X.C24431ij;
import X.C25237DiI;
import X.C26601qu;
import X.C27471sZ;
import X.C27952Ew2;
import X.C29581ys;
import X.C29601yu;
import X.C31103Gfm;
import X.C313725t;
import X.C32165H8c;
import X.C38040KHr;
import X.C50612tH;
import X.C59933Mz;
import X.C60833Qr;
import X.C62313Yf;
import X.C62983bG;
import X.C63103bV;
import X.C63593hs;
import X.C63753iH;
import X.C63873iU;
import X.C63883iV;
import X.C67323zM;
import X.C691847d;
import X.C692347m;
import X.C72174Mv;
import X.C72184My;
import X.C81244nR;
import X.C81594o3;
import X.C82394pY;
import X.C83644rk;
import X.C84634tZ;
import X.C84774tq;
import X.C84784tr;
import X.C84794ts;
import X.C84804tt;
import X.E5N;
import X.H1T;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.facebook.endtoend.EndToEnd;
import com.facebook.redex.IDxNActionShape212S0200000_1_I2;
import com.facebook.redex.IDxObserverShape210S0100000_1_I2;
import com.facebook.redex.IDxObserverShape98S0200000_1_I2;
import com.facebook.redex.IDxRStepShape144S0000000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0701000_I2;
import kotlin.jvm.internal.KtLambdaShape60S0100000_I2_40;

public class SignedOutFragmentActivity extends BaseFragmentActivity implements C83644rk, C81244nR, C81594o3, AnonymousClass0RJ {
    public C11630kW A00;
    public AnonymousClass3FR A01;
    public FxSsoViewModel A02;
    public AnonymousClass38Y A03;
    public C07530bf A04;
    public C18330wh A05;
    public String A06;
    public boolean A07 = true;
    public boolean A08 = false;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public AymhViewModel A0D;
    public boolean A0E = false;
    public boolean A0F = false;
    public final C82394pY A0G = C18220wO.A0P(this, 45);
    public final C82394pY A0H = C18220wO.A0P(this, 44);

    public static void A00(SignedOutFragmentActivity signedOutFragmentActivity) {
        C18330wh r3 = new C18330wh(signedOutFragmentActivity);
        IDxObserverShape210S0100000_1_I2 iDxObserverShape210S0100000_1_I2 = new IDxObserverShape210S0100000_1_I2(signedOutFragmentActivity, 32);
        IDxObserverShape98S0200000_1_I2 iDxObserverShape98S0200000_1_I2 = new IDxObserverShape98S0200000_1_I2(12, signedOutFragmentActivity, r3);
        AymhViewModel aymhViewModel = signedOutFragmentActivity.A0D;
        if (aymhViewModel != null) {
            C18230wP.A0J(aymhViewModel.A09).A0C(signedOutFragmentActivity, iDxObserverShape210S0100000_1_I2);
            C18230wP.A0J(signedOutFragmentActivity.A0D.A0A).A0C(signedOutFragmentActivity, iDxObserverShape98S0200000_1_I2);
        }
    }

    public final void A0D(Bundle bundle) {
        Uri A002;
        String string;
        C32165H8c A0S;
        String A0j;
        C63873iU r13;
        String str;
        Bundle A0C2 = C18190wL.A0C(this);
        if (A0C2 == null) {
            A0C2 = C18180wK.A06();
        }
        this.A0C = A0C2.getBoolean("SHOULD_START_AT_SAC_REG_FLOW", false);
        if (A0C2.containsKey("IS_ADD_ACCOUNT_FLOW")) {
            this.A0F = A0C2.getBoolean("IS_ADD_ACCOUNT_FLOW");
        }
        C126197ek A0C3 = C18250wR.A0C(this.A04);
        synchronized (A0C3) {
        }
        AnonymousClass269.A04();
        synchronized (A0C3) {
        }
        synchronized (A0C3) {
        }
        A0C2.putBoolean("IS_ADD_ACCOUNT_FLOW", this.A0F);
        C18190wL.A13(A0C2, "IgSessionManager.LOGGED_OUT_TOKEN");
        if (A0C2.containsKey("last_accessed_user_id")) {
            this.A06 = A0C2.getString("last_accessed_user_id");
        }
        if (AnonymousClass2B9.A00) {
            overridePendingTransition(R.anim.modal_slide_up_enter, R.anim.modal_empty_animation);
        }
        if (A0C2.containsKey(FXPFAccessLibraryDebugFragment.UID) && A0C2.containsKey("token") && A0C2.containsKey("source")) {
            A0C2.putBoolean("IS_ONE_CLICK_LOGIN", true);
            String A0j2 = C18190wL.A0j(A0C2, "source");
            if (A0j2.equals("stop_account_deletion_email") || A0j2.equals("stop_account_deletion_sms")) {
                A002 = C63753iH.A00(A0C2);
                string = A0C2.getString(FXPFAccessLibraryDebugFragment.UID);
                C07530bf r0 = this.A04;
                string.getClass();
                String A0j3 = C18190wL.A0j(A0C2, "token");
                String A0j4 = C18190wL.A0j(A0C2, "source");
                String string2 = A0C2.getString("reminder");
                H1T A0N = AnonymousClass0wJ.A0N(r0);
                A0N.A0J("accounts/stop_account_deletion_login/");
                A0N.A0O(FXPFAccessLibraryDebugFragment.UID, string);
                A0N.A0O("token", A0j3);
                C18180wK.A0t(this, A0N, C62983bG.A02(0), C18220wO.A0g(this, A0N, "source", A0j4));
                A0N.A0P("reminder", string2);
                A0S = C18180wK.A0S(A0N);
                A0j = C18190wL.A0j(A0C2, "source");
            } else if (A0j2.equals("account_deactivation_email")) {
                A002 = C63753iH.A00(A0C2);
                string = A0C2.getString(FXPFAccessLibraryDebugFragment.UID);
                String string3 = A0C2.getString("token");
                A0j = A0C2.getString("source");
                C18240wQ.A1L(string, string3, A0j);
                C07530bf r02 = this.A04;
                String string4 = A0C2.getString("reminder");
                H1T A0N2 = AnonymousClass0wJ.A0N(r02);
                A0N2.A0J("accounts/account_deactivation_login/");
                A0N2.A0O(FXPFAccessLibraryDebugFragment.UID, string);
                A0N2.A0O("token", string3);
                C18180wK.A0t(this, A0N2, C62983bG.A02(0), C18220wO.A0g(this, A0N2, "source", A0j));
                A0N2.A0P("reminder", string4);
                A0S = C18180wK.A0S(A0N2);
            } else {
                this.A0B = true;
                this.A09 = A0C2.getBoolean("bypass");
                Uri A003 = C63753iH.A00(A0C2);
                String string5 = A0C2.getString(FXPFAccessLibraryDebugFragment.UID);
                C07530bf r2 = this.A04;
                string5.getClass();
                String A0j5 = C18190wL.A0j(A0C2, "token");
                String A0j6 = C18190wL.A0j(A0C2, "source");
                String string6 = A0C2.getString("auto_send");
                if (this.A09) {
                    str = "accounts/one_click_login_bypass/";
                } else {
                    str = "accounts/one_click_login/";
                }
                H1T A0N3 = AnonymousClass0wJ.A0N(r2);
                A0N3.A0J(str);
                A0N3.A0O(FXPFAccessLibraryDebugFragment.UID, string5);
                A0N3.A0O("token", A0j5);
                C18180wK.A0t(this, A0N3, C62983bG.A02(0), C18220wO.A0g(this, A0N3, "source", A0j6));
                A0N3.A0O("adid", C63883iV.A0H());
                A0N3.A0P("auto_send", string6);
                C18240wQ.A1A(A0N3, C26601qu.class, C59933Mz.class);
                A0S = C18190wL.A0Q(A0N3);
                A003.getClass();
                C07530bf r22 = this.A04;
                C11630kW r1 = this.A00;
                C11630kW r16 = r1;
                r13 = new AnonymousClass1iQ(A003, this, r16, BCa(), r22, string5, this.A09);
                A0S.A00 = r13;
                schedule(A0S);
            }
            r13 = new AnonymousClass1iR(A002, this, this.A00, this.A04, string, A0j);
            A0S.A00 = r13;
            schedule(A0S);
        }
        if (A0C2.containsKey("smsrecovery") && A0C2.getBoolean("smsrecovery") && A0C2.containsKey("token")) {
            C18330wh r23 = new C18330wh(this);
            this.A05 = r23;
            r23.A04(getResources().getString(2131830080));
            C32165H8c A052 = C63883iV.A05(this, this.A04, C18190wL.A0j(A0C2, "token"), (String) null, C62983bG.A00(), "link");
            A052.A00 = new C27471sZ(this, this, this.A04);
            schedule(A052);
        }
        this.A0D = (AymhViewModel) new AnonymousClass7IU(this).A01(AymhViewModel.class);
        if (getSupportFragmentManager().A0O("android.nux.AymhLoginLandingFragment") != null) {
            A00(this);
        } else if (C18230wP.A0I(this) == null) {
            AymhViewModel aymhViewModel = this.A0D;
            C07530bf r11 = this.A04;
            AnonymousClass38W r4 = new AnonymousClass38W(A0C2, this);
            C04220Ms.A0B(r11, 1);
            E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
            aymhViewModel.A00 = null;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            AnonymousClass4EZ r15 = new AnonymousClass4EZ(C18250wR.A0c(C313725t.CACHEABLE));
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0701000_I2(r11, this, aymhViewModel, A0v, r15, r4, A0J, (C146958n9) null, 8), AnonymousClass3J5.A00(aymhViewModel), 3);
        }
    }

    public final String Ar0() {
        return this.A06;
    }

    public final boolean BRB() {
        return this.A0F;
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public final void onBackPressed() {
        if (this.A07) {
            super.onBackPressed();
        }
    }

    public final void finish() {
        super.finish();
        if (AnonymousClass2B9.A00) {
            overridePendingTransition(R.anim.modal_empty_animation, R.anim.modal_slide_down_exit);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            r10 = this;
            super.onActivityResult(r11, r12, r13)
            com.instagram.nux.aymh.viewmodel.AymhViewModel r5 = r10.A0D
            if (r5 == 0) goto L_0x0051
            X.0bf r6 = r10.A04
            r3 = 3
            X.C04220Ms.A0B(r6, r3)
            r0 = 64206(0xface, float:8.9972E-41)
            if (r11 != r0) goto L_0x0051
            r8 = 0
            if (r13 == 0) goto L_0x0052
            java.lang.String r0 = "com.google.android.gms.credentials.Credential"
            android.os.Parcelable r7 = r13.getParcelableExtra(r0)
            com.google.android.gms.auth.api.credentials.Credential r7 = (com.google.android.gms.auth.api.credentials.Credential) r7
            if (r7 == 0) goto L_0x0053
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "aymh"
            X.C63523hf.A02(r6, r0)
        L_0x0028:
            r0 = -1
            if (r12 != r0) goto L_0x0051
            if (r7 == 0) goto L_0x0051
            X.0Oa r0 = r5.A0A
            X.M5J r4 = X.C18230wP.A0J(r0)
            r2 = 1
            r0 = 2131835972(0x7f113c44, float:1.9305098E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.38Z r0 = new X.38Z
            r0.<init>(r1, r2)
            r4.A0H(r0)
            X.4qz r0 = X.AnonymousClass3J5.A00(r5)
            r9 = 38
            kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1
            r4.<init>(r5, r6, r7, r8, r9)
            X.C25237DiI.A00(r8, r8, r4, r0, r3)
        L_0x0051:
            return
        L_0x0052:
            r7 = r8
        L_0x0053:
            java.lang.String r0 = "aymh"
            if (r12 != 0) goto L_0x005b
            X.C63523hf.A01(r6, r0)
            return
        L_0x005b:
            X.C63523hf.A03(r6, r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.activity.SignedOutFragmentActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        C29581ys r8;
        Uri uri;
        String str;
        String A002;
        Uri uri2;
        Parcelable parcelable;
        int A003 = C14030oh.A00(-2128268932);
        AnonymousClass3R8.A00(getApplication());
        Bundle A0C2 = C18190wL.A0C(this);
        if (!(A0C2 == null || A0C2.getString("IgSessionManager.SESSION_TOKEN_KEY") == null || !A0C2.getBoolean("caa_registration_redirection_to_native"))) {
            C10300i6 A0S = C18190wL.A0S(A0C2);
            if (!(A0S instanceof UserSession)) {
                this.A04 = (C07530bf) A0S;
            }
        }
        C07530bf r3 = this.A04;
        if (r3 == null) {
            r3 = AnonymousClass0RA.A0C.A05(this);
            this.A04 = r3;
        }
        this.A03 = new AnonymousClass38Y(this);
        this.A01 = new AnonymousClass3FR(this, r3, true);
        this.A02 = (FxSsoViewModel) new AnonymousClass7IU(this).A01(FxSsoViewModel.class);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        synchronized (C29581ys.class) {
            r8 = C29581ys.A00;
        }
        C07530bf r0 = this.A04;
        if (!(bundle == null || (parcelable = bundle2.getParcelable("RegistrationPlugin_REGISTRATION_FLOW_EXTRAS")) == null || ((C29601yu) AnonymousClass3ZJ.A01()).A01.get("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f") != null)) {
            String string = bundle2.getString("RegistrationPlugin_CURRENT_SAVED_STEP_NAME");
            String[] stringArray = bundle2.getStringArray("RegistrationPlugin_CURRENT_VISITED_STEP_NAMES");
            AnonymousClass36Y r15 = new AnonymousClass36Y();
            C50612tH.A00(r15, (C84774tq) null, (C84784tr) null, new IDxNActionShape212S0200000_1_I2((FragmentActivity) this, (C10300i6) r0, 1), (C84794ts) null, AnonymousClass2AT.A05, (C84804tt) null, false);
            AnonymousClass36Y A004 = C50612tH.A00(C50612tH.A00(C50612tH.A00(C50612tH.A00(C50612tH.A00(r15, (C84774tq) null, new IDxRStepShape144S0000000_1_I2(2), new IDxNActionShape212S0200000_1_I2((FragmentActivity) this, (C10300i6) r0, 2), (C84794ts) null, AnonymousClass2AT.A0B, (C84804tt) null, false), (C84774tq) null, (C84784tr) null, new IDxNActionShape212S0200000_1_I2((FragmentActivity) this, (C10300i6) r0, 3), (C84794ts) null, AnonymousClass2AT.A09, (C84804tt) null, false), (C84774tq) null, new IDxRStepShape144S0000000_1_I2(3), new IDxNActionShape212S0200000_1_I2((FragmentActivity) this, (C10300i6) r0, 4), (C84794ts) null, AnonymousClass2AT.A0F, (C84804tt) null, false), (C84774tq) null, new IDxRStepShape144S0000000_1_I2(4), new IDxNActionShape212S0200000_1_I2((FragmentActivity) this, (C10300i6) r0, 5), (C84794ts) null, AnonymousClass2AT.A06, (C84804tt) null, false), (C84774tq) null, new IDxRStepShape144S0000000_1_I2(0), new IDxNActionShape212S0200000_1_I2((FragmentActivity) this, (C10300i6) r0, 6), (C84794ts) null, AnonymousClass2AT.A04, (C84804tt) null, false);
            AnonymousClass2AT r20 = AnonymousClass2AT.A03;
            AnonymousClass36Y A005 = C50612tH.A00(A004, (C84774tq) null, new IDxRStepShape144S0000000_1_I2(1), new IDxNActionShape212S0200000_1_I2((FragmentActivity) this, (C10300i6) r0, 0), new C72184My(this), r20, (C84804tt) null, false);
            AnonymousClass3HU r9 = new AnonymousClass3HU();
            r9.A03 = Collections.unmodifiableList(A005.A00);
            r9.A01(parcelable, string, stringArray, 1);
            r8.A07(r9, new C72174Mv(this, r0), parcelable, "RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f");
        }
        C31103Gfm.A04();
        AnonymousClass0gN.A00().AKp(new AnonymousClass1mJ(this));
        AnonymousClass0gN.A00().AKp(new AnonymousClass1mK(this));
        if (C09650fs.A04(getApplicationContext()) && !C63593hs.A05() && !C63593hs.A06()) {
            C691847d.A02(C692347m.A00(this));
        }
        C38040KHr kHr = C38040KHr.A01;
        kHr.A03(this.A0H, AnonymousClass45O.class);
        kHr.A03(this.A0G, AnonymousClass45A.class);
        AnonymousClass39K r02 = AnonymousClass39K.A02;
        if (r02 == null) {
            r02 = new AnonymousClass39K();
            AnonymousClass39K.A02 = r02;
        }
        synchronized (r02.A01) {
            uri = null;
            r02.A00 = null;
        }
        AnonymousClass49X.A00(this.A04).A04();
        C62313Yf.A00().A02();
        if (A0C2 != null) {
            str = C18190wL.A0i(A0C2);
        } else {
            str = null;
        }
        C07530bf r5 = this.A04;
        C11630kW r4 = this.A00;
        C04220Ms.A0B(r5, 0);
        if (EndToEnd.isRunningEndToEndTest() && (A002 = EndToEnd.A00("ig.e2e.e2e_method", true, false)) != null) {
            if (A002.equals("AUTH")) {
                UserSession A0Z = C18230wP.A0Z();
                if (str != null) {
                    uri = C15430rJ.A01(str);
                }
                C67323zM.A06(this, uri, r4, A0Z);
            } else if (A002.equals("LOGIN")) {
                String A006 = EndToEnd.A00("ig.e2e.e2e_username", true, false);
                String A007 = EndToEnd.A00("ig.e2e.e2e_password", true, false);
                if (!(A006 == null || A006.length() == 0 || A007 == null || A007.length() == 0)) {
                    String format = String.format("Using headless E2E login, user: %s, password: %s", Arrays.copyOf(new Object[]{A006, A007}, 2));
                    C04220Ms.A06(format);
                    Log.w(AnonymousClass000.A00(1191), format);
                    String A008 = C09140ev.A00(this);
                    C04220Ms.A06(A008);
                    C32165H8c A0D2 = C63883iV.A0D(r5, (String) null, A008, (String) null, (String) null, C18230wP.A0i(this), A007, (String) null, A006, (List) null, C63593hs.A00());
                    AnonymousClass265 r202 = AnonymousClass265.A0t;
                    Integer num = AnonymousClass006.A00;
                    if (str != null) {
                        uri2 = C15430rJ.A01(str);
                    } else {
                        uri2 = null;
                    }
                    A0D2.A00 = new C24431ij(this, uri2, r4, (C84634tZ) null, (AnonymousClass3GT) null, r5, r202, num, A006, (String) null, (String) null);
                    schedule(A0D2);
                }
            }
        }
        C14030oh.A07(1293936791, A003);
    }

    public final void onDestroy() {
        int A002 = C14030oh.A00(1429927205);
        super.onDestroy();
        AnonymousClass44X.A00().A01 = null;
        C62313Yf.A00().A03();
        C63103bV.A03.A05(this);
        C38040KHr kHr = C38040KHr.A01;
        kHr.A04(this.A0H, AnonymousClass45O.class);
        kHr.A04(this.A0G, AnonymousClass45A.class);
        C14030oh.A07(2075760122, A002);
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A07 = bundle.getBoolean("allow_back", true);
        this.A0A = bundle.getBoolean("is_nux_flow", false);
        this.A0E = bundle.getBoolean("has_followed", false);
        this.A0B = bundle.getBoolean("is_one_click_login", false);
    }

    public final void onResume() {
        int A002 = C14030oh.A00(164377301);
        super.onResume();
        C07530bf r3 = this.A04;
        C04220Ms.A0B(r3, 0);
        r3.A01(AnonymousClass34B.class, new KtLambdaShape60S0100000_I2_40(r3, 41));
        setRequestedOrientation(1);
        C60833Qr.A00(this).A00("logged_out_bloks_playground_toggle");
        C14030oh.A07(-923890750, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C29581ys r4;
        super.onSaveInstanceState(bundle);
        synchronized (C29581ys.class) {
            r4 = C29581ys.A00;
        }
        Iterator it = AnonymousClass3ZJ.A01().A05().iterator();
        while (true) {
            if (it.hasNext()) {
                if (C18180wK.A0k(it).equals("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f")) {
                    String A042 = r4.A04("RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f");
                    String[] A092 = r4.A09();
                    bundle.putString("RegistrationPlugin_CURRENT_SAVED_STEP_NAME", A042);
                    bundle.putStringArray("RegistrationPlugin_CURRENT_VISITED_STEP_NAMES", A092);
                    RegFlowExtras regFlowExtras = (RegFlowExtras) AnonymousClass3ZJ.A01().A03();
                    AnonymousClass7Ko.A07(regFlowExtras, "Could not find registration flow extras.");
                    regFlowExtras.A0A = "RegistrationPlugin_id_de529d86-8373-4d9a-99f3-c01c0ec63f6f";
                    bundle.putParcelable("RegistrationPlugin_REGISTRATION_FLOW_EXTRAS", regFlowExtras);
                    break;
                }
            } else {
                break;
            }
        }
        bundle.putBoolean("allow_back", this.A07);
        bundle.putBoolean("is_nux_flow", this.A0A);
        bundle.putBoolean("has_followed", this.A0E);
        bundle.putBoolean("is_one_click_login", this.A0B);
    }
}
