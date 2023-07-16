package X;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.IDxAdapterShape3S0300000_1_I2;
import androidx.recyclerview.widget.IDxSListenerShape58S0100000_1_I2;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.facebook.redex.IDxFStoreShape873S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.FxAccountInfo;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* renamed from: X.1cm  reason: invalid class name and case insensitive filesystem */
public final class C23211cm extends C34640IcN implements C82424pb, AnonymousClass4tS, C82824qK, C84364t1 {
    public static final String __redex_internal_original_name = "CreateUsernameFragment";
    public Handler A00;
    public ImageView A01;
    public ConnectContent A02 = null;
    public C61643Ur A03;
    public RegFlowExtras A04;
    public NotificationBar A05;
    public C24721jv A06;
    public C57513Bi A07;
    public C07530bf A08;
    public InlineErrorMessageView A09;
    public ProgressButton A0A;
    public SearchEditText A0B;
    public Date A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public C58583Gi A0G;
    public C24601jg A0H;
    public final TextWatcher A0I = new IDxWAdapterShape193S0100000_1_I2(this, 17);
    public final Runnable A0J = new C72854Pz(this);

    public static synchronized void A03(C23211cm r9) {
        synchronized (r9) {
            if (r9.A0D && r9.A0F && r9.getActivity() != null) {
                ConnectContent connectContent = r9.A02;
                if (A05(connectContent)) {
                    if (connectContent != null) {
                        String obj = FxcalAccountType.INSTAGRAM.toString();
                        connectContent.A02 = new FxAccountInfo((ImageUrl) null, obj, r9.A04.A0Z, (String) null, obj);
                    }
                    UserSession A002 = A00(r9);
                    A002.getClass();
                    C306222g r5 = C306222g.IG_SAC_SIGN_UP;
                    String obj2 = r5.toString();
                    C04220Ms.A0B(obj2, 1);
                    C63003bJ.A00(AnonymousClass2AF.A0f, A002, obj2, (String) null);
                    r9.A04.A0s = true;
                    FragmentActivity requireActivity = r9.requireActivity();
                    ConnectContent connectContent2 = r9.A02;
                    connectContent2.getClass();
                    UserSession A003 = A00(r9);
                    A003.getClass();
                    AnonymousClass3Zp.A00(requireActivity, A003, new IDxFStoreShape873S0100000_1_I2(r9, 0), r5, connectContent2, "", 20180130);
                } else {
                    r9.A04.A0s = false;
                    A02(r9);
                }
            }
        }
    }

    public final void CDH(boolean z) {
    }

    public final String getModuleName() {
        return "sac_create_username";
    }

    public static void A01(C23211cm r4) {
        String A0f = C18180wK.A0f(r4.A0B);
        if (!TextUtils.isEmpty(A0f) && r4.A0B.isFocused()) {
            Set set = r4.A07.A02;
            if (set == null || !set.contains(A0f)) {
                Handler handler = r4.A00;
                Runnable runnable = r4.A0J;
                handler.removeCallbacks(runnable);
                r4.A00.postDelayed(runnable, 1000);
                r4.A0G.A00();
                r4.A07.A00.setVisibility(8);
                r4.A05.A02();
                r4.A09.A04();
                r4.A0A.setEnabled(true);
                return;
            }
            r4.A05.A02();
            r4.A09.A04();
            r4.A0G.A01();
        }
    }

    private void A04(boolean z) {
        long length = (long) this.A0B.length();
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(this.A08), "username_check_success"), 2892);
        AnonymousClass0wJ.A1B(A0I2, A002, A003);
        C18210wN.A19(A0I2, "account_linking");
        A0I2.A0Q("is_username_available", C18190wL.A0Z(A0I2, "guid", C63683i7.A00(), z));
        A0I2.A0T("release_channel", C63683i7.A01());
        C18180wK.A1A(A0I2, A003);
        C18190wL.A1I(A0I2, AnonymousClass2AT.A0D.A00.A01);
        A0I2.A0S("username_length", Long.valueOf(length));
        AnonymousClass269.A05(A0I2);
        C18180wK.A19(A0I2);
        C63683i7.A09(A0I2, this.A08);
        A0I2.Bb4();
    }

    public static boolean A05(ConnectContent connectContent) {
        if (connectContent == null || connectContent.A09 == null || connectContent.A05 == null || connectContent.A06 == null || connectContent.A03 == null) {
            return false;
        }
        return true;
    }

    public final void AHz() {
        this.A0B.setEnabled(false);
    }

    public final void AJV() {
        this.A0B.setEnabled(true);
    }

    public final C313625r Aiy() {
        return C313625r.SAC;
    }

    public final AnonymousClass265 BDt() {
        return AnonymousClass2AT.A0D.A00;
    }

    public final boolean BXY() {
        return C18210wN.A1U(C18180wK.A0f(this.A0B));
    }

    public final void C9G() {
        String A0f = C18180wK.A0f(this.A0B);
        C32165H8c A002 = C63503hc.A00(requireContext(), this.A08, A0f, false);
        C63873iU.A0E(A002, this, 135);
        if (!this.A0E) {
            if (A00(this) == null || A05(this.A02)) {
                this.A0D = true;
            } else {
                UserSession A003 = A00(this);
                A003.getClass();
                C32165H8c A0B2 = C63883iV.A0B(A003, "", C306222g.IG_SAC_SIGN_UP.toString());
                A0B2.A00 = new AnonymousClass1i4(this);
                C18220wO.A1C(this, A0B2);
            }
        }
        C18220wO.A1C(this, A002);
        C62713aZ r4 = C62713aZ.A00;
        C07530bf r5 = this.A08;
        String str = AnonymousClass2AT.A0D.A00.A01;
        C313625r r6 = C313625r.SAC;
        Integer A022 = this.A04.A02();
        C04220Ms.A0B(r5, 0);
        r4.A02(r5, r6, false, (Boolean) null, A022, str, (String) null);
    }

    public final void CSe() {
        this.A0A.setShowProgressBar(false);
        this.A0G.A01();
        A04(true);
    }

    public final void CSf(String str, Integer num) {
        this.A0A.setShowProgressBar(false);
        this.A0G.A00();
        Cth(str, num);
        int length = this.A0B.length();
        C61763Vg A032 = C63313hF.A03(this.A08, C313625r.SAC, AnonymousClass2AT.A0D.A00, "username_check_fail");
        AnonymousClass32J r0 = A032.A00;
        if (r0 == null) {
            r0 = new AnonymousClass32J();
        }
        synchronized (r0) {
        }
        A032.A02("username_length", length);
        A032.A01();
    }

    public final void CSg() {
        this.A0A.setShowProgressBar(true);
        this.A0G.A00();
    }

    public final void CSh(String str, List list) {
        this.A0A.setEnabled(false);
        this.A0A.setShowProgressBar(false);
        this.A0G.A00();
        Cth(str, AnonymousClass006.A01);
        if (list != null && !list.isEmpty()) {
            C57513Bi r5 = this.A07;
            C07530bf r4 = this.A08;
            r5.A00.setVisibility(0);
            r5.A02.addAll(list);
            r5.A01.A11(new IDxSListenerShape58S0100000_1_I2(r5, 5));
            r5.A01.setAdapter(new IDxAdapterShape3S0300000_1_I2(1, r4, r5, list));
        }
        C58583Gi r2 = this.A0G;
        IDxCListenerShape202S0100000_1_I2_1 A0H2 = C18210wN.A0H(this, 88);
        ImageView imageView = r2.A00;
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.instagram_x_outline_16);
        C63163fI.A02(imageView, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_normal_text_color);
        imageView.setOnClickListener(A0H2);
        imageView.setFocusable(true);
        imageView.setContentDescription(imageView.getResources().getString(2131837698));
        A04(false);
    }

    public final C10300i6 getSession() {
        return this.A08;
    }

    public static UserSession A00(C23211cm r2) {
        Bundle A062 = C18180wK.A06();
        C18190wL.A13(A062, r2.A04.A0G);
        return AnonymousClass0RA.A0C.A07(A062);
    }

    public static void A02(C23211cm r4) {
        FragmentActivity activity = r4.getActivity();
        if (activity != null) {
            RegFlowExtras regFlowExtras = r4.A04;
            regFlowExtras.A0g = C18220wO.A1U(r4.A0C);
            regFlowExtras.A0m = false;
            regFlowExtras.A11 = true;
            C25786Drz A0Q = C18180wK.A0Q(activity, r4.A08);
            RegFlowExtras regFlowExtras2 = r4.A04;
            Bundle A062 = C18180wK.A06();
            A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
            C18180wK.A0x(A062, new C21261Qa(), A0Q);
        }
    }

    public final void Cth(String str, Integer num) {
        if (!isVisible()) {
            return;
        }
        if (num == AnonymousClass006.A01) {
            this.A09.A05(str);
            this.A05.A02();
            return;
        }
        C63553hn.A08(this.A05, str);
    }

    public final boolean onBackPressed() {
        Bundle A0C2 = C18190wL.A0C(requireActivity());
        if (A0C2 != null && A0C2.containsKey("caa_registration_redirection_to_native")) {
            C18190wL.A1A(this);
        }
        C07530bf r3 = this.A08;
        String str = AnonymousClass2AT.A0D.A00.A01;
        C313625r r1 = C313625r.SAC;
        AnonymousClass0wJ.A1N(r3, str);
        C62223Xv.A00(r3, r1, (Boolean) null, (Integer) null, str);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1260901371);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0wJ.A0F();
        Bundle bundle2 = this.mArguments;
        AnonymousClass0KW.A00(bundle2, "Fragment arguments cannot be null in SAC flow!");
        this.A08 = AnonymousClass0RA.A0C.A04(bundle2);
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        regFlowExtras.A03(C313625r.SAC);
        regFlowExtras.A04 = bundle2.getString("last_accessed_user_id", (String) null);
        regFlowExtras.A0T = bundle2.getString("intent", (String) null);
        regFlowExtras.A0U = bundle2.getString("surface", (String) null);
        this.A04 = regFlowExtras;
        List A0F2 = this.A08.A00.A0F();
        if (!C09790gg.A00(A0F2)) {
            this.A04.A0J = ((C72144Mm) A0F2.get(0)).A01();
            this.A04.A0M = ((C72144Mm) A0F2.get(0)).A02();
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                this.A04.A0H = bundle3.getString("cached_ig_access_token", (String) null);
                this.A04.A0G = this.mArguments.getString("last_logged_in_ig_access_token", (String) null);
            }
        }
        this.A0H = new C24601jg(this);
        C14030oh.A09(-953058053, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1098876783);
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.reg_secondary_account_create_username, C18190wL.A0E(A0H2), true);
        this.A0B = (SearchEditText) A0H2.requireViewById(R.id.username);
        this.A01 = C18200wM.A0J(A0H2, R.id.username_valid_icon);
        this.A09 = (InlineErrorMessageView) A0H2.requireViewById(R.id.username_inline_error);
        this.A0B.addTextChangedListener(this.A0I);
        C18210wN.A10(this.A0B, 16, this);
        this.A0B.setAllowTextSelection(true);
        this.A05 = (NotificationBar) A0H2.requireViewById(R.id.notification_bar);
        ProgressButton A0O = C18210wN.A0O(A0H2);
        this.A0A = A0O;
        C24721jv r0 = new C24721jv(this.A0B, this.A08, this, A0O);
        this.A06 = r0;
        registerLifecycleListener(r0);
        InlineErrorMessageView.A03(C18220wO.A0J(A0H2, R.id.username_input_container));
        SearchEditText searchEditText = this.A0B;
        this.A03 = new C61643Ur(requireContext(), AnonymousClass06E.A00(this), (C10300i6) this.A08, (C84364t1) this, searchEditText);
        this.A0G = new C58583Gi(this.A01);
        this.A07 = new C57513Bi(A0H2, this.A0B);
        C14030oh.A09(-1704024731, A022);
        return A0H2;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-2010359433);
        super.onDestroyView();
        unregisterLifecycleListener(this.A06);
        this.A0B.removeTextChangedListener(this.A0I);
        this.A0B = null;
        this.A01 = null;
        this.A0A = null;
        this.A06 = null;
        this.A09 = null;
        this.A05 = null;
        C57513Bi r0 = this.A07;
        r0.A00 = null;
        r0.A01 = null;
        r0.A02 = null;
        if (!(getActivity() == null || this.A0H == null)) {
            ((BaseFragmentActivity) requireActivity()).A0F(this.A0H);
        }
        C14030oh.A09(-1769567139, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(874648580);
        super.onPause();
        C09860go.A0I(this.A0B);
        this.A05.A03();
        this.A00.removeCallbacksAndMessages((Object) null);
        Window A0F2 = C18180wK.A0F(this);
        if (A0F2 != null) {
            A0F2.setSoftInputMode(0);
        }
        C14030oh.A09(-1683002387, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-228974402);
        super.onResume();
        this.A0B.requestFocus();
        C09860go.A0K(this.A0B);
        A01(this);
        Window A0F2 = C18180wK.A0F(this);
        if (A0F2 != null) {
            A0F2.setSoftInputMode(16);
        }
        RegFlowExtras regFlowExtras = this.A04;
        regFlowExtras.A0x = false;
        regFlowExtras.A0s = false;
        this.A0D = false;
        this.A0F = false;
        C14030oh.A09(1413951269, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass3YT.A00.A01(this.A08, C313625r.SAC, AnonymousClass2AT.A0D.A00.A01);
        if (A00(this) != null) {
            C32165H8c A062 = C63503hc.A06(A00(this));
            C63873iU.A0F(A062, this, view, 35);
            schedule(A062);
        }
        if (getActivity() != null && this.A0H != null) {
            ((BaseFragmentActivity) requireActivity()).A0E(this.A0H);
        }
    }
}
