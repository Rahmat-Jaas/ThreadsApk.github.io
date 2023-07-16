package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.task.IDxLTaskShape28S0300000_1_I2;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.nux.ui.NetzDgTermsTextView;

/* renamed from: X.1bJ  reason: invalid class name */
public final class AnonymousClass1bJ extends C34640IcN implements C82424pb, C39486KuW {
    public static final String __redex_internal_original_name = "FacebookLandingFragment";
    public long A00;
    public ViewGroup A01;
    public TextSwitcher A02;
    public TextView A03;
    public C15500rQ A04;
    public FxSsoViewModel A05;
    public AnonymousClass3HN A06;
    public C24751jz A07;
    public C07530bf A08;
    public boolean A09 = false;
    public boolean A0A;
    public TextView A0B;
    public C39815L1l A0C;
    public final C82394pY A0D = C18220wO.A0P(this, 49);
    public final C82394pY A0E = C18220wO.A0P(this, 48);
    public final C82394pY A0F = C18220wO.A0P(this, 50);

    public final String getModuleName() {
        return "landing_facebook";
    }

    public static void A01(AnonymousClass1bJ r4) {
        JUZ BHE = r4.A0C.BHE();
        if (BHE.A0B.contains("ig_landing_screen_text")) {
            String str = BHE.A06;
            if (str == null) {
                str = r4.getString(2131838182);
            }
            r4.A0B.setText(C18190wL.A0h(AnonymousClass0wJ.A0B(r4), str, 2131838184));
            AlphaAnimation alphaAnimation = new AlphaAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
            alphaAnimation.setDuration(250);
            r4.A0B.startAnimation(alphaAnimation);
            return;
        }
        C18250wR.A0t(r4.A0B);
    }

    public static void A02(AnonymousClass1bJ r1, String str) {
        if (r1.A02 != null && !TextUtils.isEmpty(str)) {
            r1.A02.setCurrentText(str);
            r1.A0A = true;
        }
    }

    public final C10300i6 getSession() {
        return this.A08;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.A07.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        C62223Xv.A00.A01(this.A08, "landing");
        return false;
    }

    public final void onTokenChange() {
        C63643hy.A04(new AnonymousClass4PX(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass1bJ r2) {
        /*
            X.44X r0 = X.AnonymousClass44X.A00()
            X.3AB r0 = r0.A01
            if (r0 == 0) goto L_0x0062
            X.37v r0 = r0.A00
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = r0.A00
        L_0x000e:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x002d
            X.47l r1 = X.AnonymousClass47l.A03
            X.0bf r0 = r2.A08
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0037
            X.0bf r0 = r2.A08
            boolean r0 = X.C63693i8.A08(r0)
            if (r0 == 0) goto L_0x005f
            r1 = 0
        L_0x0027:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0037
        L_0x002d:
            r0 = 2131824394(0x7f110f0a, float:1.9281615E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r2, r1, r0)
            A02(r2, r0)
        L_0x0037:
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r2.A05
            X.0Oa r0 = r0.A00
            java.lang.Object r0 = X.C18180wK.A0d(r0)
            java.lang.String r0 = (java.lang.String) r0
            A02(r2, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r2.A05
            X.0Oa r0 = r0.A00
            X.M5J r1 = X.C18230wP.A0J(r0)
            r0 = 37
            X.C18210wN.A16(r2, r1, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r2.A05
            X.0Oa r0 = r0.A02
            X.M5J r1 = X.C18230wP.A0J(r0)
            r0 = 38
            X.C18210wN.A16(r2, r1, r0)
            return
        L_0x005f:
            java.lang.String r1 = X.AnonymousClass47l.A01
            goto L_0x0027
        L_0x0062:
            r1 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1bJ.A00(X.1bJ):void");
    }

    public static boolean A03(AnonymousClass1bJ r3) {
        if (C60053Nl.A00(r3.getRootActivity()).A00.equals("RU") || (!AnonymousClass47l.A03.A00(r3.A08) && !C63443hU.A05(r3.getContext()))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00cf, code lost:
        if (r2 != null) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = -1787563163(0xffffffff9573f365, float:-4.9265464E-26)
            int r1 = X.C14030oh.A02(r0)
            r7 = r13
            super.onCreate(r14)
            android.os.Bundle r2 = r13.mArguments
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            android.app.Application r0 = r0.getApplication()
            X.AnonymousClass3R8.A00(r0)
            X.0RG r0 = X.AnonymousClass0RA.A0C
            X.0bf r0 = r0.A04(r2)
            r13.A08 = r0
            X.0rQ r0 = X.C15500rQ.A01(r0)
            r13.A04 = r0
            com.instagram.fx.access.sso.FxSsoViewModel r0 = X.C18200wM.A0X(r13)
            r13.A05 = r0
            X.Jjq r5 = new X.Jjq
            r5.<init>()
            androidx.fragment.app.FragmentActivity r4 = r13.requireActivity()
            boolean r0 = r4 instanceof com.instagram.nux.activity.SignedOutFragmentActivity
            if (r0 == 0) goto L_0x00d2
            r0 = r4
            com.instagram.nux.activity.SignedOutFragmentActivity r0 = (com.instagram.nux.activity.SignedOutFragmentActivity) r0
            java.lang.String r12 = r0.A06
        L_0x003e:
            X.0bf r10 = r13.A08
            X.265 r11 = X.AnonymousClass265.A0r
            com.instagram.fx.access.sso.FxSsoViewModel r9 = r13.A05
            X.1jz r6 = new X.1jz
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A07 = r6
            X.0bf r3 = r13.A08
            X.1jq r0 = new X.1jq
            r0.<init>(r4, r13, r3, r11)
            r5.A0D(r0)
            X.1jz r0 = r13.A07
            r5.A0D(r0)
            r13.registerLifecycleListenerSet(r5)
            X.0bf r3 = r13.A08
            X.3HN r0 = new X.3HN
            r0.<init>(r13, r3)
            r13.A06 = r0
            r0.A00()
            android.view.Window r3 = r4.getWindow()
            r0 = 32
            r3.setSoftInputMode(r0)
            X.0bf r0 = r13.A08
            X.L1l r0 = X.C34463IUv.A00(r0)
            r13.A0C = r0
            X.0bf r5 = r13.A08
            r4 = 0
            X.C04220Ms.A0B(r5, r4)
            X.4fr r3 = X.C77484fr.A00
            java.lang.Class<X.KJp> r0 = X.C38071KJp.class
            java.lang.Object r0 = r5.A01(r0, r3)
            X.KJp r0 = (X.C38071KJp) r0
            r0.A00()
            X.3YT r5 = X.AnonymousClass3YT.A00
            X.0bf r3 = r13.A08
            java.lang.String r0 = "landing"
            r5.A02(r3, r0)
            if (r2 == 0) goto L_0x00b8
            java.lang.String r0 = "IS_ONE_CLICK_LOGIN"
            boolean r0 = r2.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "IS_DISABLE_SMART_LOCK"
            boolean r0 = r2.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x00b8
        L_0x00a9:
            java.lang.String r0 = "is_current_user_fb_connected"
            boolean r0 = r2.getBoolean(r0, r4)
            r13.A09 = r0
        L_0x00b1:
            r0 = 324816886(0x135c4ff6, float:2.7807328E-27)
            X.C14030oh.A09(r0, r1)
            return
        L_0x00b8:
            X.0bf r9 = r13.A08
            X.4Ds r8 = new X.4Ds
            r8.<init>()
            X.H8a r0 = X.C62783aj.getInstanceAsync()
            X.1lS r6 = new X.1lS
            r10 = r11
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A00 = r6
            X.C31155GhB.A03(r0)
            if (r2 == 0) goto L_0x00b1
            goto L_0x00a9
        L_0x00d2:
            r12 = 0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1bJ.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        CharSequence fromHtml;
        int A022 = C14030oh.A02(-671537386);
        if (A03(this)) {
            inflate = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.landing_prominent_login);
            ((NetzDgTermsTextView) inflate.requireViewById(R.id.netz_dg_terms_text_view)).A00(this.A08);
            this.A01 = C18240wQ.A0G(inflate, R.id.button_group);
            boolean A032 = A03(this);
            int i = R.layout.email_or_phone_button_group;
            if (A032) {
                i = R.layout.email_or_phone_plus_login_button_group;
            }
            layoutInflater.inflate(i, this.A01);
        } else {
            inflate = layoutInflater.inflate(R.layout.landing_prominent_facebook, viewGroup, false);
            ViewGroup A0G = C18240wQ.A0G(inflate, R.id.button_group);
            this.A01 = A0G;
            layoutInflater.inflate(R.layout.facebook_button_group, A0G);
            Resources A0B2 = AnonymousClass0wJ.A0B(this);
            TextSwitcher textSwitcher = (TextSwitcher) inflate.requireViewById(R.id.facebook_text_switcher);
            this.A02 = textSwitcher;
            textSwitcher.setFactory(new C65833w3(A0B2, this));
            this.A02.setCurrentText(getString(2131830111));
            AnonymousClass0wJ.A17(this.A02, 0, this);
            this.A02.setBackgroundResource(R.drawable.blue_button_background);
            this.A00 = SystemClock.elapsedRealtime();
            this.A0A = false;
            boolean z = this.A04.A00.A01.getBoolean("analytics_device_id_external", false);
            if (z || C63443hU.A05(getContext())) {
                TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.social_context);
                this.A03 = A0L;
                A0L.setVisibility(0);
                View requireViewById = inflate.requireViewById(R.id.divider);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) requireViewById.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                requireViewById.setLayoutParams(marginLayoutParams);
                if (z) {
                    C32165H8c A023 = AnonymousClass3WR.A02(this.A08, C18230wP.A0k(this), this.A04.BJN(), (String) null, false);
                    A023.A00 = new AnonymousClass1iB(this);
                    schedule(A023);
                }
            }
            C61763Vg.A00(C63313hF.A02(this.A08, C313625r.A03, AnonymousClass265.A0r, "continue_with_fb_button_shown"), this.A09);
            ((NetzDgTermsTextView) inflate.requireViewById(R.id.netz_dg_terms_text_view)).A00(this.A08);
        }
        ImageView A0K = C18220wO.A0K(inflate, R.id.logo);
        C63553hn.A01(getContext(), inflate.findViewById(R.id.subtitle), A0K);
        C63163fI.A00(getContext(), A0K);
        this.A0B = C18180wK.A0G(inflate, R.id.zero_rating_landing_page_text_view);
        A01(this);
        TextView A0G2 = C18180wK.A0G(inflate, R.id.sign_up_with_email_or_phone);
        A0G2.getClass();
        Integer num = AnonymousClass006.A01;
        AnonymousClass7FY.A02(A0G2, num);
        AnonymousClass0wJ.A16(A0G2, 608, this);
        int i2 = 2131835971;
        if (A03(this)) {
            i2 = 2131824550;
        }
        A0G2.setText(i2);
        TextView A0G3 = C18180wK.A0G(inflate, R.id.log_in_button);
        A0G3.getClass();
        AnonymousClass7FY.A02(A0G3, num);
        if (A03(this)) {
            fromHtml = getString(2131830109);
        } else {
            fromHtml = Html.fromHtml(AnonymousClass0wJ.A0B(this).getString(2131821308));
        }
        A0G3.setText(fromHtml);
        if (!A03(this)) {
            AnonymousClass3X6.A00(A0G3);
        }
        AnonymousClass0wJ.A16(A0G3, 609, this);
        FragmentActivity activity = getActivity();
        C31155GhB.A01(activity, AnonymousClass06E.A00(activity), new IDxLTaskShape28S0300000_1_I2(1, activity, this, this.A08));
        C14030oh.A09(913868003, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-503136344);
        super.onDestroyView();
        C38040KHr kHr = C38040KHr.A01;
        kHr.A04(this.A0D, AnonymousClass45A.class);
        kHr.A04(this.A0F, AnonymousClass45B.class);
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A0B = null;
        C14030oh.A09(-359712677, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-4092273);
        super.onPause();
        C38040KHr.A01.A04(this.A0E, AnonymousClass0jT.class);
        C14030oh.A09(-1528468534, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(862200392);
        super.onResume();
        C38040KHr.A01.A03(this.A0E, AnonymousClass0jT.class);
        C14030oh.A09(528775597, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-1821100845);
        super.onStart();
        this.A0C.A7q(this);
        C14030oh.A09(-9230632, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-1479876037);
        super.onStop();
        this.A0C.CcW(this);
        C14030oh.A09(-1080507106, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C38040KHr kHr = C38040KHr.A01;
        kHr.A03(this.A0D, AnonymousClass45A.class);
        kHr.A03(this.A0F, AnonymousClass45B.class);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && C18190wL.A0i(bundle2) != null && this.mArguments.getBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG", false)) {
            C25828Dsm A002 = C62973bE.A00(getRootActivity());
            A002.A0L(2131830181);
            C18180wK.A1M(A002);
            AnonymousClass0wJ.A1K(A002);
            this.mArguments.remove("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG");
        }
    }
}
