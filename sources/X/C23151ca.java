package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.facebook.redex.IDxCListenerShape20S0400000_1_I2;
import com.facebook.redex.IDxObjectShape282S0100000_1_I2;
import com.facebook.redex.IDxObjectShape796S0100000_1_I2;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.barcelona.R;
import com.instagram.common.task.IDxLTaskShape133S0100000_1_I2;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import com.instagram.nux.ui.NetzDgTermsTextView;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ca  reason: invalid class name and case insensitive filesystem */
public final class C23151ca extends C34640IcN implements C82424pb, C84634tZ {
    public static final String A0X = AnonymousClass00U.A0L("com.instagram.android", "login.fragment.ARGUMENT_OMNISTRING");
    public static final String __redex_internal_original_name = "LoginLandingFragment";
    public View A00;
    public View A01;
    public View A02;
    public EditText A03;
    public TextView A04;
    public TextView A05;
    public FxSsoViewModel A06;
    public C566638b A07;
    public AnonymousClass3HN A08;
    public C24751jz A09;
    public AnonymousClass3F0 A0A;
    public C07530bf A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public Handler A0M;
    public TextView A0N;
    public TextInputLayout A0O;
    public AnonymousClass3CP A0P;
    public ProgressButton A0Q;
    public String A0R;
    public final C82394pY A0S = C18220wO.A0P(this, 54);
    public final TextWatcher A0T = new IDxObjectShape282S0100000_1_I2(this, 19);
    public final C82394pY A0U = C18220wO.A0P(this, 51);
    public final C82394pY A0V = C18220wO.A0P(this, 52);
    public final C82394pY A0W = C18220wO.A0P(this, 53);

    public final void C5y(C58453Fr r16) {
        C84604tW r11;
        boolean z;
        String trim = C18180wK.A0f(this.A05).trim();
        Iterator it = this.A07.A01.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                r11 = null;
                break;
            }
            r11 = (C84604tW) it.next();
            if (trim.equals(r11.BK7())) {
                break;
            }
        }
        C07530bf r5 = this.A0B;
        if (r11 == null || C63593hs.A00() < 1) {
            z = false;
        } else {
            int i = 2131821840;
            int i2 = 2131821837;
            if (r11 instanceof C27141s2) {
                i = 2131821835;
                i2 = 2131821838;
            } else if (r11 instanceof C27131s1) {
                i = 2131821836;
                i2 = 2131821839;
            }
            AnonymousClass3YT.A00(r5, (AnonymousClass3V1) null, (C313625r) null, (Integer) null, "access_dialog", r11.AOZ());
            C25828Dsm A0W2 = C18190wL.A0W(getContext());
            A0W2.A02 = AnonymousClass0wJ.A0o(this, r11.BK7(), 2131821841);
            C18230wP.A1B(this, A0W2, i);
            C18230wP.A1M(A0W2, r11, r5, 40, 2131821842);
            A0W2.A0c(new IDxCListenerShape20S0400000_1_I2(12, (Object) r11, (Object) r5, (Object) this, (Object) this), getString(i2));
            AnonymousClass0wJ.A1K(A0W2);
            z = true;
        }
        r16.A00(z);
    }

    public final String getModuleName() {
        return "login_landing";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        super.onViewCreated(view, bundle);
        if (!this.A0K && this.A0H && this.A0I) {
            this.A0L = false;
            int i = 0;
            this.A01.setVisibility(4);
            View view2 = this.A00;
            if (!this.A0L) {
                i = 4;
            }
            view2.setVisibility(i);
        }
        C38040KHr kHr = C38040KHr.A01;
        kHr.A03(this.A0V, AnonymousClass45A.class);
        kHr.A03(this.A0U, AnonymousClass45Q.class);
        kHr.A03(this.A0W, AnonymousClass45B.class);
        Bundle bundle3 = this.mArguments;
        if ((bundle3 == null || !bundle3.getBoolean("IS_ONE_CLICK_LOGIN", false)) && ((bundle2 = this.mArguments) == null || !bundle2.getBoolean("IS_DISABLE_SMART_LOCK", false))) {
            C07530bf r5 = this.A0B;
            AnonymousClass265 r6 = AnonymousClass265.A0t;
            C70284Ds r4 = new C70284Ds();
            H8a instanceAsync = C62783aj.getInstanceAsync();
            instanceAsync.A00 = new AnonymousClass1lS(this, r4, r5, r6, false);
            C31155GhB.A03(instanceAsync);
        }
        C07530bf r0 = this.A0B;
        C04220Ms.A0B(r0, 0);
        H1T A0P2 = AnonymousClass0wJ.A0P(r0);
        A0P2.A0J("trusted_friend/get_non_expired_requests_info/");
        C63873iU.A0C(this, AnonymousClass0wJ.A0T(A0P2, C21951Su.class, AnonymousClass3Q0.class), 112);
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && C18190wL.A0i(bundle4) != null && this.mArguments.getBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG", false)) {
            C25828Dsm A002 = C62973bE.A00(getRootActivity());
            A002.A0L(2131830181);
            C18180wK.A1M(A002);
            AnonymousClass0wJ.A1K(A002);
            this.mArguments.remove("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG");
        }
    }

    public static void A00(C23151ca r4) {
        boolean z = r4.A0J;
        TextView textView = r4.A05;
        if (z) {
            textView.setEnabled(false);
            r4.A03.setEnabled(false);
            r4.A0Q.setShowProgressBar(true);
        } else {
            textView.setEnabled(true);
            r4.A03.setEnabled(true);
            r4.A0Q.setShowProgressBar(false);
            if (!TextUtils.isEmpty(C18180wK.A0f(r4.A05)) && !TextUtils.isEmpty(C18210wN.A0c(r4.A03)) && !r4.A0G) {
                r4.A0Q.setEnabled(true);
                return;
            }
        }
        r4.A0Q.setEnabled(false);
    }

    public static void A01(C23151ca r3, String str) {
        if (r3.A04 != null && r3.A01 != null && r3.getContext() != null) {
            r3.A04.setText(str);
            C18180wK.A0s(r3.getContext(), r3.A04, R.color.design_dark_default_color_on_background);
            r3.A01.setBackgroundResource(R.drawable.blue_button_background);
            r3.A01.jumpDrawablesToCurrentState();
            C63163fI.A03(r3.A04, R.color.design_dark_default_color_on_background);
        }
    }

    public final void BjS(String str, String str2) {
        String str3;
        String A0f = C18180wK.A0f(this.A05);
        String A0d = C18240wQ.A0d(this);
        String A0k = C18230wP.A0k(this);
        String A0c = C18210wN.A0c(this.A03);
        try {
            str3 = C63573hp.A01(getActivity(), this.A0B, AnonymousClass265.A0t, AnonymousClass006.A01);
        } catch (IOException unused) {
            str3 = null;
        }
        C07530bf r2 = this.A0B;
        int A002 = C63593hs.A00();
        List list = this.A0F;
        C32165H8c A0D2 = C63883iV.A0D(r2, str3, A0d, this.A0D, this.A0E, A0k, A0c, str2, A0f, list, A002);
        A0D2.A00 = new C26791rD(this, this, this, this, this.A0B, A0f, A0c);
        schedule(A0D2);
    }

    public final void C8f() {
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        regFlowExtras.A04 = this.A0R;
        C63463hW.A01();
        Bundle A062 = C18180wK.A06();
        A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        C18190wL.A13(A062, "IgSessionManager.LOGGED_OUT_TOKEN");
        AnonymousClass1cj r3 = new AnonymousClass1cj();
        r3.setArguments(A062);
        C63553hn.A07(r3, this.mFragmentManager, (String) null, "android.nux.ContactPointTriageFragment");
    }

    public final void CJv() {
        C07530bf r2 = this.A0B;
        String A0f = C18180wK.A0f(this.A05);
        String A0d = C18240wQ.A0d(this);
        String A0k = C18230wP.A0k(this);
        H1T A0N2 = AnonymousClass0wJ.A0N(r2);
        A0N2.A0J("accounts/send_password_reset/");
        A0N2.A0O(C63383hO.A00(), A0f);
        C63383hO.A03(A0N2, A0d);
        A0N2.A0O("guid", A0k);
        C32165H8c A0T2 = C18180wK.A0T(A0N2, C22131Tm.class, AnonymousClass3N1.class);
        A0T2.A00 = new AnonymousClass1iV(getContext());
        schedule(A0T2);
    }

    public final void CLz(AnonymousClass3GF r3) {
        this.A0A.A00(r3, C18180wK.A0f(this.A05));
    }

    public final void CM6(AnonymousClass1TP r3, C07530bf r4) {
        this.A0M.post(new C73354Sb(r3, this, r4));
    }

    public final void CM7() {
        C32165H8c A022 = C63883iV.A02(requireContext(), this.A0B, AnonymousClass006.A0Y, C18180wK.A0f(this.A05));
        A022.A00 = new C28491uR(this, this.A0B);
        schedule(A022);
    }

    public final C10300i6 getSession() {
        return this.A0B;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A09.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        C62223Xv.A00.A01(this.A0B, "login");
        C18210wN.A13(this);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.H8c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: X.4A9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.H8c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: X.H8c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C23151ca r20, boolean r21) {
        /*
            long r3 = X.C18230wP.A06()
            r1 = 1347336060000(0x139b37cbc60, double:6.65672460649E-312)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            r0 = 2131838117(0x7f1144a5, float:1.9309448E38)
            X.C63813iO.A04(r0)
            return
        L_0x0014:
            X.01V r3 = X.AnonymousClass01V.A0p
            r2 = 2293785(0x230019, float:3.214277E-39)
            r3.markerStart(r2)
            java.lang.String r1 = "login_flow"
            java.lang.String r0 = "prod"
            r3.markerAnnotate((int) r2, (java.lang.String) r1, (java.lang.String) r0)
            r15 = r20
            android.widget.TextView r0 = r15.A05
            java.lang.String r12 = X.C18180wK.A0f(r0)
            X.0bf r0 = r15.A0B
            X.0nS r1 = X.C13330nS.A02(r0)
            java.lang.String r0 = "log_in_attempt"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2377(0x949, float:3.331E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r1, r0)
            double r1 = X.C18200wM.A00()
            double r3 = X.AnonymousClass269.A00()
            X.AnonymousClass269.A07(r5, r1, r3)
            X.C18200wM.A1K(r5, r3)
            X.265 r3 = X.AnonymousClass265.A0t
            java.lang.String r0 = "login"
            X.C18190wL.A1I(r5, r0)
            X.C18180wK.A1B(r5, r1)
            X.0ev r2 = X.C09140ev.A02
            android.content.Context r0 = X.C10600ic.A00
            java.lang.String r1 = r2.A04(r0)
            java.lang.String r0 = "guid"
            r5.A0T(r0, r1)
            java.lang.String r0 = "log_in_token"
            r1 = r21
            java.lang.Boolean r1 = X.C18190wL.A0Z(r5, r0, r12, r1)
            java.lang.String r0 = "keyboard"
            r5.A0Q(r0, r1)
            r5.Bb4()
            java.lang.String r6 = X.C18240wQ.A0d(r15)
            android.content.Context r0 = r15.getContext()
            java.lang.String r9 = r2.A05(r0)
            android.widget.EditText r0 = r15.A03
            java.lang.String r10 = X.C18210wN.A0c(r0)
            java.lang.Integer r2 = X.AnonymousClass006.A01     // Catch:{ IOException -> 0x0091 }
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()     // Catch:{ IOException -> 0x0091 }
            X.0bf r0 = r15.A0B     // Catch:{ IOException -> 0x0091 }
            java.lang.String r5 = X.C63573hp.A01(r1, r0, r3, r2)     // Catch:{ IOException -> 0x0091 }
            goto L_0x0092
        L_0x0091:
            r5 = 0
        L_0x0092:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18302964477201981(0x41067300000e3d, double:1.894115511773269E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x0125
            X.0bf r0 = r15.A0B
            X.1rD r14 = new X.1rD
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r0
            r20 = r12
            r21 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r14.onStart()
            X.0bf r1 = r15.A0B
            X.3aU r0 = new X.3aU
            r0.<init>(r1)
            java.lang.String r5 = r0.A02(r10)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            X.K9R r0 = X.K9R.A00
            X.IVw r4 = new X.IVw
            r4.<init>(r0)
            X.IVw r3 = new X.IVw
            r3.<init>(r0)
            r1 = 1
            java.lang.String r0 = "is_source_client"
            r3.A05(r0, r1)
            java.lang.String r0 = "contact_point"
            r3.A04(r0, r12)
            java.lang.String r1 = "credential_type"
            java.lang.String r0 = "password"
            r3.A04(r1, r0)
            r3.A04(r0, r5)
            r5 = 33
            r1 = 9
            r0 = 84
            java.lang.String r0 = X.C63213h0.A01(r5, r1, r0)
            r3.A04(r0, r6)
            int r1 = X.C63593hs.A00()
            java.lang.String r0 = "login_attempt_count"
            r3.A03(r0, r1)
            X.0bf r0 = r15.A0B
            X.3Vp r0 = X.C61793Vp.A00(r0)
            X.39M r0 = r0.A01
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "machine_id"
            r3.A04(r0, r1)
            java.lang.String r1 = "server_params"
            java.util.Map r0 = r4.A00
            r0.put(r1, r3)
            X.C18200wM.A1T(r4, r2)
            X.0bf r1 = r15.A0B
            java.lang.String r0 = "com.bloks.www.bloks.caa.login.async.send_login_request"
            X.4A9 r1 = X.C63263h8.A00(r1, r0, r2)
            r0 = 12
            X.AnonymousClass4A9.A01(r1, r14, r15, r0)
        L_0x0121:
            r15.schedule(r1)
            return
        L_0x0125:
            X.0bf r4 = r15.A0B
            int r14 = X.C63593hs.A00()
            r11 = 0
            java.util.List r13 = r15.A0F
            java.lang.String r8 = r15.A0E
            java.lang.String r7 = r15.A0D
            X.H8c r1 = X.C63883iV.A0D(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.0bf r0 = r15.A0B
            X.1rD r14 = new X.1rD
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r0
            r20 = r12
            r21 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r1.A00 = r14
            goto L_0x0121
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23151ca.A02(X.1ca, boolean):void");
    }

    public final void C5R() {
        String str;
        String str2;
        if (AnonymousClass44X.A01(this.A0B, AnonymousClass44X.A00(), "ig_android_growth_FX_access_fbig_create_cp_claiming")) {
            this.A09.A0C(this.A0B, AnonymousClass44X.A00().A02(this.A0B, "ig_android_growth_FX_access_fbig_create_cp_claiming"), AnonymousClass44X.A00().A03(this.A0B, "ig_android_growth_FX_access_fbig_create_cp_claiming"), true);
        } else if (AnonymousClass47l.A03.A00(this.A0B)) {
            if (C63693i8.A08(this.A0B)) {
                str = null;
            } else {
                str = AnonymousClass47l.A00;
            }
            if (C63693i8.A08(this.A0B)) {
                str2 = null;
            } else {
                str2 = AnonymousClass47l.A02;
            }
            if (str != null && str2 != null) {
                this.A09.A0C(this.A0B, str, str2, true);
            }
        } else {
            this.A09.A0D(AnonymousClass264.A0H);
        }
    }

    public final void CJu() {
        C32165H8c A032 = C63883iV.A03(getContext(), this.A0B, C18180wK.A0f(this.A05));
        A032.A00 = new AnonymousClass1iV(getContext());
        schedule(A032);
    }

    public final void CJw() {
        schedule(C63883iV.A01(getContext(), this.A0B, (Boolean) null, (Boolean) null, C18180wK.A0f(this.A05), (String) null, false, false));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1983981610);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        this.A0M = AnonymousClass0wJ.A0F();
        this.A0B = AnonymousClass0RA.A0C.A04(this.mArguments);
        this.A06 = C18200wM.A0X(this);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            String A002 = C28174Ezk.A00(568);
            if (bundle3.getString(A002, "").equalsIgnoreCase("force_logout_login_help")) {
                C07530bf r9 = this.A0B;
                Bundle bundle4 = this.mArguments;
                FragmentActivity activity = getActivity();
                AnonymousClass06E A003 = AnonymousClass06E.A00(this);
                if (bundle4 != null && bundle4.getString(A002, "").equalsIgnoreCase("force_logout_login_help")) {
                    String string = bundle4.getString("user_id");
                    String string2 = bundle4.getString("token");
                    H1T A0N2 = AnonymousClass0wJ.A0N(r9);
                    A0N2.A0J("accounts/post_force_logout_login/");
                    A0N2.A0O(FXPFAccessLibraryDebugFragment.UID, string);
                    C63213h0.A02(activity, A0N2, "source", "post_force_logout_login_push");
                    A0N2.A0O("token", string2);
                    C32165H8c A0S2 = C18180wK.A0S(A0N2);
                    A0S2.A00 = new C26801rE(activity, this, r9);
                    C31155GhB.A01(activity, A003, A0S2);
                }
                Bundle bundle5 = this.mArguments;
                if (bundle5 != null) {
                    bundle5.remove("original_url");
                }
            }
        }
        this.A0G = false;
        if (bundle != null && bundle2.containsKey("LoginLandingFragment.LOGIN_FAILED")) {
            this.A0G = bundle2.getBoolean("LoginLandingFragment.LOGIN_FAILED");
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 instanceof SignedOutFragmentActivity) {
            this.A0R = ((SignedOutFragmentActivity) activity2).A06;
        }
        C07530bf r13 = this.A0B;
        AnonymousClass265 r14 = AnonymousClass265.A0t;
        this.A09 = new C24751jz(this, this, this.A06, r13, r14, this.A0R);
        C37063Jjq jjq = new C37063Jjq();
        jjq.A0D(new C24691jq(getActivity(), this, this.A0B, r14));
        jjq.A0D(this.A09);
        registerLifecycleListenerSet(jjq);
        AnonymousClass3HN r0 = new AnonymousClass3HN(this, this.A0B);
        this.A08 = r0;
        r0.A00();
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            this.A0H = bundle6.getBoolean("IS_ADD_ACCOUNT_FLOW", false);
            this.A0I = bundle6.getBoolean("is_current_user_fb_connected", false);
            this.A0C = bundle6.getString("current_username");
            this.A0K = bundle6.getBoolean("multiple_accounts_logged_in", false);
        }
        AnonymousClass3YT.A00.A02(this.A0B, "login");
        schedule(new IDxLTaskShape133S0100000_1_I2(this, 1));
        C14030oh.A09(-1450087778, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1301732880);
        LayoutInflater layoutInflater2 = layoutInflater;
        View inflate = layoutInflater2.inflate(R.layout.reg_container, viewGroup, false);
        View inflate2 = layoutInflater2.inflate(R.layout.login_landing, C18190wL.A0E(inflate), true);
        ImageView A0K2 = C18220wO.A0K(inflate, R.id.login_landing_logo);
        C63553hn.A01(requireContext(), (View) null, A0K2);
        C63163fI.A00(requireContext(), A0K2);
        this.A00 = inflate2.findViewById(R.id.login_or_divider);
        this.A05 = AnonymousClass0wJ.A0L(inflate, R.id.login_username);
        C566638b r0 = new C566638b(requireContext());
        this.A07 = r0;
        TextView textView = this.A05;
        C07530bf r12 = this.A0B;
        if (textView instanceof AutoCompleteTextView) {
            Context A0A2 = C18230wP.A0A(this);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textView;
            r0.A00 = new AnonymousClass3CM(A0A2, autoCompleteTextView, this, r12, new AnonymousClass35S(new AnonymousClass4EN(r0)), new AnonymousClass4ET(this, r0, r12), AnonymousClass265.A1X, AnonymousClass0wJ.A0B(this).getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material), false);
            autoCompleteTextView.addOnLayoutChangeListener(new C65573tf(AnonymousClass0wJ.A0B(this), textView, autoCompleteTextView));
            r0.A01.A00(A0A2, this, r12, C18240wQ.A0O(A0A2, this), new IDxObjectShape796S0100000_1_I2(r0, 2));
        }
        EditText editText = (EditText) inflate.requireViewById(R.id.password);
        this.A03 = editText;
        editText.setTypeface(Typeface.DEFAULT);
        C18240wQ.A0z(this.A03);
        this.A03.setImeOptions(6);
        this.A03.setInputType(524416);
        C18210wN.A12(this.A03, this, 11);
        this.A0O = (TextInputLayout) inflate.requireViewById(R.id.password_input_layout);
        AccessibilityManager accessibilityManager = (AccessibilityManager) requireContext().getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            this.A0O.setPasswordVisibilityToggleEnabled(true);
        } else {
            this.A0O.setPasswordVisibilityToggleEnabled(false);
        }
        ProgressButton A0O2 = C18210wN.A0O(inflate);
        this.A0Q = A0O2;
        A0O2.setOnClickListener(new IDxCListenerShape202S0100000_1_I2_1(this, 10));
        this.A0P = new AnonymousClass3CP(this.A0Q, (ScrollView) inflate.findViewById(R.id.scroll_view), 0);
        this.A0A = new AnonymousClass3F0(this, this.A0B);
        this.A01 = inflate.requireViewById(R.id.login_facebook_container);
        TextView A0G2 = C18180wK.A0G(inflate, R.id.login_facebook);
        this.A04 = A0G2;
        if (A0G2 != null) {
            C18210wN.A0y(A0G2);
            C63163fI.A03(this.A04, R.color.blue_5);
        }
        this.A01.setOnClickListener(new IDxCListenerShape202S0100000_1_I2_1(this, 9));
        TextView A0G3 = C18180wK.A0G(inflate, R.id.login_forgot_button);
        this.A0N = A0G3;
        A0G3.getClass();
        Integer num = AnonymousClass006.A01;
        AnonymousClass7FY.A02(A0G3, num);
        C18200wM.A18(AnonymousClass0wJ.A0B(this), this.A0N, 2131837568);
        AnonymousClass3X6.A00(this.A0N);
        this.A0N.setOnClickListener(new IDxCListenerShape202S0100000_1_I2_1(this, 11));
        if (this.A04 == null || TextUtils.isEmpty((CharSequence) C18180wK.A0d(this.A06.A00))) {
            this.A09.A09(this.A04, this, AnonymousClass265.A0t);
        } else {
            this.A04.setText((CharSequence) C18180wK.A0d(this.A06.A00));
        }
        C18210wN.A16(this, C18230wP.A0J(this.A06.A00), 40);
        C18210wN.A16(this, C18230wP.A0J(this.A06.A02), 39);
        boolean A052 = C121907Is.A05(getContext(), R.attr.nuxAllowSignUpFlow, true);
        View requireViewById = inflate.requireViewById(R.id.log_in_button);
        if (A052) {
            TextView textView2 = (TextView) requireViewById;
            textView2.getClass();
            AnonymousClass7FY.A02(textView2, num);
            C18200wM.A18(AnonymousClass0wJ.A0B(this), textView2, 2131837670);
            AnonymousClass3X6.A00(textView2);
            textView2.setOnClickListener(new IDxCListenerShape202S0100000_1_I2_1(this, 8));
        } else {
            requireViewById.setVisibility(8);
            AnonymousClass3X6.A00(this.A0N);
        }
        this.A05.addTextChangedListener(C64543mW.A00(this.A0B));
        this.A03.addTextChangedListener(C64543mW.A00(this.A0B));
        C18210wN.A10(this.A05, 9, this);
        C18210wN.A10(this.A03, 10, this);
        A00(this);
        ((NetzDgTermsTextView) inflate2.requireViewById(R.id.netz_dg_terms_text_view)).A00(this.A0B);
        if (this.A04 != null) {
            C61763Vg.A00(C63313hF.A02(this.A0B, C313625r.A03, AnonymousClass265.A0t, "continue_with_fb_button_shown"), this.A0I);
        }
        View requireViewById2 = inflate2.requireViewById(R.id.trusted_friends_footer_view);
        this.A02 = requireViewById2;
        requireViewById2.setVisibility(8);
        this.A02.setOnClickListener(new IDxCListenerShape202S0100000_1_I2_1(this, 7));
        C14030oh.A09(1895926441, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-221206744);
        super.onDestroyView();
        this.A05.removeTextChangedListener(C64543mW.A00(this.A0B));
        this.A03.removeTextChangedListener(C64543mW.A00(this.A0B));
        C38040KHr kHr = C38040KHr.A01;
        kHr.A04(this.A0V, AnonymousClass45A.class);
        kHr.A04(this.A0S, AnonymousClass45H.class);
        kHr.A04(this.A0U, AnonymousClass45Q.class);
        kHr.A04(this.A0W, AnonymousClass45B.class);
        this.A05 = null;
        this.A03 = null;
        this.A0O = null;
        this.A0Q = null;
        this.A01 = null;
        this.A04 = null;
        this.A00 = null;
        this.A0N = null;
        this.A0P = null;
        this.A02 = null;
        C14030oh.A09(-1326857595, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-767177829);
        super.onPause();
        TextView textView = this.A05;
        TextWatcher textWatcher = this.A0T;
        textView.removeTextChangedListener(textWatcher);
        this.A03.removeTextChangedListener(textWatcher);
        C18240wQ.A10(this);
        C18180wK.A0F(this).setSoftInputMode(3);
        C14030oh.A09(1451566328, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-293242861);
        super.onResume();
        TextView textView = this.A05;
        TextWatcher textWatcher = this.A0T;
        textView.addTextChangedListener(textWatcher);
        this.A03.addTextChangedListener(textWatcher);
        C18180wK.A15(this);
        boolean A023 = AnonymousClass0hB.A02(getContext());
        TextView textView2 = this.A05;
        int i = 16;
        if (A023) {
            i = 21;
        }
        textView2.setGravity(i);
        this.A03.setGravity(i);
        A00(this);
        C18180wK.A0F(this).setFlags(8192, 8192);
        C14030oh.A09(1351198721, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("LoginLandingFragment.LOGIN_FAILED", this.A0G);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-1789594530);
        super.onStart();
        AnonymousClass3CP r0 = this.A0P;
        if (r0 != null) {
            r0.A00.CLs(getActivity());
        }
        C14030oh.A09(4174404, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(1684686041);
        super.onStop();
        AnonymousClass3CP r0 = this.A0P;
        if (r0 != null) {
            r0.A00.onStop();
        }
        C14030oh.A09(-1292305259, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewStateRestored(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 1904453107(0x7183a5f3, float:1.303781E30)
            int r6 = X.C14030oh.A02(r0)
            super.onViewStateRestored(r9)
            android.os.Bundle r2 = r8.mArguments
            if (r2 == 0) goto L_0x0034
            r7 = 0
            java.lang.String r0 = X.C18190wL.A0i(r2)
            if (r0 == 0) goto L_0x0021
            android.net.Uri r1 = X.C15430rJ.A01(r0)
            java.lang.String r0 = X.C63213h0.A00()
            java.lang.String r7 = r1.getQueryParameter(r0)
        L_0x0021:
            java.lang.String r0 = A0X
            java.lang.String r1 = r2.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0035
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r7 = r1
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x005d
            boolean r0 = r8.A0H
            if (r0 != 0) goto L_0x005d
            java.lang.String r2 = X.C63593hs.A01()
            if (r2 == 0) goto L_0x005d
            X.0bf r0 = r8.A0B
            java.util.Iterator r1 = X.C63533hk.A04(r0)
        L_0x004b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a7
            X.3ac r0 = X.C18250wR.A0Q(r1)
            java.lang.String r0 = r0.A06
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004b
        L_0x005d:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00a0
            android.widget.TextView r0 = r8.A05
            r0.setText(r7)
            double r4 = X.C18200wM.A00()
            double r2 = X.AnonymousClass269.A00()
            X.0bf r0 = r8.A0B
            X.0nS r1 = X.C13330nS.A02(r0)
            java.lang.String r0 = "login_username_prefilled"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2385(0x951, float:3.342E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            X.AnonymousClass0wJ.A1B(r1, r4, r2)
            java.lang.String r0 = "prefill"
            r1.A0T(r0, r7)
            X.C18180wK.A1A(r1, r2)
            java.lang.String r0 = "login"
            X.AnonymousClass269.A08(r1, r0)
            X.C63683i7.A08(r1)
            X.C18180wK.A19(r1)
            X.0bf r0 = r8.A0B
            X.C63683i7.A09(r1, r0)
            r1.Bb4()
        L_0x00a0:
            r0 = -1023968216(0xffffffffc2f77c28, float:-123.74249)
            X.C14030oh.A09(r0, r6)
            return
        L_0x00a7:
            r7 = r2
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23151ca.onViewStateRestored(android.os.Bundle):void");
    }
}
