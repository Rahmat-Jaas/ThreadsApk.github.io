package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1QE  reason: invalid class name */
public final class AnonymousClass1QE extends AnonymousClass1QK implements C11630kW {
    public static final String __redex_internal_original_name = "IgSelfiePermissionsFragment";
    public UserSession A00 = null;
    public String A01;
    public String A02;
    public String A03;
    public C10300i6 A04;
    public String A05;
    public String A06;
    public boolean A07;

    public final String getModuleName() {
        return "selfie_permissions";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View A002 = AnonymousClass2CW.A00(view, R.id.divider);
        Context context = view.getContext();
        A002.setBackground(new ColorDrawable(C31090GfY.A01(context, R.attr.sc_divider)));
        C18180wK.A0s(requireContext(), (TextView) AnonymousClass2CW.A00(view, R.id.tv_permissions_title), R.color.ig_selfie_help_text_color);
        C31090GfY.A05((Button) AnonymousClass2CW.A00(view, R.id.btn_camera_access_allow));
        if (this.A00 != null) {
            ((ImageView) AnonymousClass2CW.A00(view, R.id.iv_image)).setImageDrawable(this.A00.B1D(context));
        }
        C37359JqC.A04(C40322Lcc.SCREEN_LOADED, C18190wL.A0S(requireArguments()), "selfie_captcha", "selfie_captcha_permission", "");
        if (this.A07) {
            UserSession userSession = this.A00;
            userSession.getClass();
            C63133bc.A05(this, userSession, this.A01, "av_fbap", "camera_permission_granting", this.A02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0059, code lost:
        if (r4.A00 == null) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -1405372627(0xffffffffac3bb72d, float:-2.6675981E-12)
            int r2 = X.C14030oh.A02(r0)
            super.onCreate(r5)
            android.os.Bundle r3 = r4.requireArguments()
            X.0i6 r1 = X.C18190wL.A0S(r3)
            r4.A04 = r1
            boolean r0 = r1.isLoggedIn()
            if (r0 == 0) goto L_0x0020
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r1)
            r4.A00 = r0
        L_0x0020:
            java.lang.String r0 = "challenge_id"
            java.lang.String r0 = r3.getString(r0)
            r4.A05 = r0
            java.lang.String r0 = "challenge_use_case"
            java.lang.String r0 = r3.getString(r0)
            r4.A06 = r0
            java.lang.String r0 = "av_session_id"
            java.lang.String r0 = r3.getString(r0)
            r4.A01 = r0
            java.lang.String r0 = "flow_id"
            java.lang.String r0 = r3.getString(r0)
            r4.A02 = r0
            java.lang.String r0 = "product_surface"
            java.lang.String r0 = r3.getString(r0)
            r4.A03 = r0
            java.lang.String r1 = r4.A06
            java.lang.String r0 = "ig_age_verification"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r4.A05
            if (r0 == 0) goto L_0x005b
            com.instagram.service.session.UserSession r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            r4.A07 = r0
            if (r0 == 0) goto L_0x006e
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.00F r1 = r0.mOnBackPressedDispatcher
            X.0z8 r0 = new X.0z8
            r0.<init>(r4)
            r1.A01(r0)
        L_0x006e:
            r0 = -279001294(0xffffffffef5ec732, float:-6.8946485E28)
            X.C14030oh.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QE.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-112205976);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.sc_ig_permission_fragment);
        C14030oh.A09(-492767129, A022);
        return A0H;
    }
}
