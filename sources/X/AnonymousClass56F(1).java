package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxObjectShape133S0200000_2_I2;
import com.facebook.redex.IDxObjectShape283S0100000_2_I2;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.barcelona.R;
import java.util.Locale;

/* renamed from: X.56F  reason: invalid class name */
public final class AnonymousClass56F extends Fragment implements C143648h5 {
    public C111196mw A00;
    public AnonymousClass584 A01;
    public AnonymousClass5jF A02;

    private void A00() {
        this.A00.A00.setVisibility(8);
        if (!requireArguments().getBoolean("AUTH_FLOW_UTIL_SHOULD_OPEN_PAYPAL_LOGIN_DIRECTLY", false)) {
            this.A00.A01.setVisibility(0);
        }
        Fragment A0O = getChildFragmentManager().A0O("FBPAY_AUTH_PAYPAL_FRAGMENT_TAG");
        if (A0O != null) {
            AnonymousClass01J A0R = C86124wJ.A0R(this);
            A0R.A04(A0O);
            A0R.A01();
        }
    }

    public static void A01(AnonymousClass56F r9) {
        r9.A00.A00.setVisibility(0);
        r9.A00.A01.setVisibility(4);
        Bundle A06 = C18180wK.A06();
        A06.putString("WEB_FRAGMENT_LOAD_URL", C18190wL.A0j(r9.A01.A00, "PAYPAL_LOGIN_URL"));
        A06.putStringArray("WEB_FRAGMENT_INTERCEPT_URLS", new String[]{"fb://paypal_connect_success/", "fb://paypal_connect_fail/", "fb-messenger://paypal_connect_success/", "fb-messenger://paypal_connect_fail/", "https://www.instagram.com/payments/paypal_connect_success", "https://www.instagram.com/payments/paypal_connect_fail"});
        Fragment A012 = AnonymousClass7Kz.A07().A06.A01(A06, "AUTH_WEB_VIEW");
        A012.setTargetFragment((Fragment) null, 1111);
        AnonymousClass01J A0R = C86124wJ.A0R(r9);
        A0R.A0F(A012, "FBPAY_AUTH_PAYPAL_FRAGMENT_TAG", R.id.paypal_login_webview_container);
        A0R.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Bzy(android.os.Bundle r6, int r7, boolean r8) {
        /*
            r5 = this;
            r0 = 1111(0x457, float:1.557E-42)
            if (r7 != r0) goto L_0x0036
            java.lang.String r4 = "WEB_FRAGMENT_INTERCEPTED_URL"
            java.lang.String r1 = r6.getString(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0067
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r0 = "access_token"
            java.lang.String r1 = r1.getQueryParameter(r0)
        L_0x001a:
            r5.A00()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0038
            X.584 r2 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0036
            r2.A02 = r1
            r1 = 0
            X.56q r0 = r2.A06
            r0.A0G(r1)
            X.AnonymousClass584.A00(r2)
        L_0x0036:
            r0 = 0
            return r0
        L_0x0038:
            X.584 r3 = r5.A01
            java.lang.String r2 = ""
            java.lang.String r1 = r6.getString(r4, r2)
            boolean r0 = android.webkit.URLUtil.isValidUrl(r1)
            if (r0 == 0) goto L_0x0060
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r0 = "error_message"
            java.lang.String r1 = r1.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0060
        L_0x0056:
            java.lang.RuntimeException r1 = X.C18250wR.A0V(r1)
            X.56q r0 = r3.A06
            r0.A0G(r1)
            goto L_0x0036
        L_0x0060:
            java.lang.String r0 = "ERROR_MESSAGE"
            java.lang.String r1 = r6.getString(r0, r2)
            goto L_0x0056
        L_0x0067:
            r1 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56F.Bzy(android.os.Bundle, int, boolean):boolean");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        this.A00 = new C111196mw(view);
        AnonymousClass7IU A002 = AnonymousClass7IU.A00(C1203379t.A00(), this);
        AnonymousClass584 r1 = (AnonymousClass584) A002.A01(AnonymousClass584.class);
        this.A01 = r1;
        r1.A02(requireArguments());
        this.A00.A02.setVisibility(8);
        this.A00.A0A.setNavigationOnClickListener(C86134wK.A0P(this, 48));
        Drawable navigationIcon = this.A00.A0A.getNavigationIcon();
        if (navigationIcon != null) {
            Toolbar toolbar = this.A00.A0A;
            AnonymousClass7Kz.A0G();
            C63403hQ.A02(requireActivity(), navigationIcon, R.attr.glyphColorPrimary);
            toolbar.setNavigationIcon(navigationIcon);
        }
        int i = 3;
        if (this.A01.A00.getString("CARD_INFO", "").toLowerCase(Locale.US).contains("american express")) {
            i = 4;
        }
        int i2 = 0;
        this.A00.A04.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        this.A00.A04.setInputType(18);
        this.A00.A04.addTextChangedListener(new IDxObjectShape283S0100000_2_I2(this, 1));
        C86104wH.A1C(this.A00.A03, 47, this);
        C86104wH.A1F(this, this.A01.A06, 187);
        C86104wH.A1F(this, this.A01.A04, 188);
        C86114wI.A1A(this, this.A01.A05, C86114wI.A0Q(this, 189), 275);
        this.A00.A02.setVisibility(0);
        AnonymousClass572 r2 = (AnonymousClass572) A002.A01(AnonymousClass572.class);
        r2.A00 = (FBPayLoggerData) C18240wQ.A0D(requireArguments(), "logger_data");
        C880756q A012 = C880756q.A01();
        M5J A022 = C30821GXg.A02(this.A01.A07, new IDxObjectShape133S0200000_2_I2(1, r2, this));
        A012.A0K(this.A01.A06, new IDxObserverShape55S0300000_2_I2(20, (Object) A012, (Object) A022, (Object) this));
        A012.A0K(A022, C86164wN.A0O(A012, this, 17));
        C86104wH.A1F(this, A012, 190);
        A00();
        boolean A03 = this.A01.A03();
        TextView textView = this.A00.A08;
        if (A03) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        this.A00.A04.setVisibility(i2);
        if (this.A01.A03()) {
            str = "fbpay_verify_paypal_display";
        } else {
            str = "fbpay_verify_cvv_display";
        }
        A02(this, str);
        if (requireArguments().getBoolean("AUTH_FLOW_UTIL_SHOULD_OPEN_PAYPAL_LOGIN_DIRECTLY", false)) {
            A01(this);
        }
    }

    public static void A02(AnonymousClass56F r1, String str) {
        AnonymousClass7Kz.A07().A07.Bb8(str, C121257Ff.A00(r1.requireArguments()));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(910701201);
        super.onCreate(bundle);
        this.A02 = (AnonymousClass5jF) AnonymousClass7Kz.A07().A02(getActivity(), AnonymousClass5jF.class);
        C14030oh.A09(-1720865477, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1976886797);
        AnonymousClass5jF r1 = this.A02;
        C143608h1 r0 = r1.A01;
        View A0D = C18180wK.A0D(((C128707k8) r0).A00, viewGroup, r1.A00, false);
        C14030oh.A09(698431714, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(686483195);
        super.onDestroyView();
        C116976xv.A00(this.A00.A04);
        this.A00 = null;
        C14030oh.A09(-548785408, A022);
    }
}
