package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxEListenerShape711S0100000_1_I2;
import com.facebook.redex.IDxPCallbackShape480S0100000_1_I2;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1cg  reason: invalid class name and case insensitive filesystem */
public final class C23201cg extends C34640IcN implements C82424pb, AnonymousClass4tS, C82824qK, C10390iG {
    public static final String __redex_internal_original_name = "OnePageRegistrationFragment";
    public TextView A00;
    public C690446n A01;
    public C690546o A02;
    public C690646p A03;
    public AnonymousClass3Ft A04;
    public AnonymousClass3Ft A05;
    public C61273So A06;
    public RegFlowExtras A07;
    public C24721jv A08;
    public C07530bf A09;
    public InlineErrorMessageView A0A;
    public InlineErrorMessageView A0B;
    public ProgressButton A0C;
    public SearchEditText A0D;
    public SearchEditText A0E;
    public C313625r A0F;
    public boolean A0G = true;
    public boolean A0H;
    public boolean A0I = false;
    public NotificationBar A0J;
    public String A0K = "";
    public final Handler A0L = new C18580xQ(Looper.getMainLooper(), this);
    public final List A0M = AnonymousClass0wJ.A0v();
    public final List A0N = AnonymousClass0wJ.A0v();
    public final C64493mQ A0O = new IDxWAdapterShape193S0100000_1_I2(this, 11);

    public static void A00(C23201cg r11) {
        String str;
        C58603Gk r0;
        C07530bf r7 = r11.A09;
        String A0f = C18180wK.A0f(r11.A0E);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < A0f.length()) {
                if (A0f.charAt(i) > 127) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        C313625r r8 = r11.A0F;
        AnonymousClass265 r9 = AnonymousClass2AT.A09.A00;
        C18180wK.A1P(r7, 0, r9);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "valid_password"), 2894);
        A0I2.A0Q("contains_only_ascii", Boolean.valueOf(z));
        AnonymousClass0wJ.A1B(A0I2, A002, A003);
        C63683i7.A04(A0I2);
        C18180wK.A1A(A0I2, A003);
        AnonymousClass269.A08(A0I2, r9.A01);
        C18180wK.A19(A0I2);
        if (r8 == null || (str = r8.A00) == null) {
            str = "null";
        }
        C18210wN.A19(A0I2, str);
        C63683i7.A07(A0I2);
        C63683i7.A0A(A0I2, r7);
        RegFlowExtras regFlowExtras = r11.A07;
        regFlowExtras.A0e = r11.A0M;
        regFlowExtras.A0f = r11.A0N;
        regFlowExtras.A0O = C18210wN.A0c(r11.A0D);
        C61273So r1 = r11.A06;
        C25271mo r02 = r1.A00;
        if (r02 != null) {
            r02.A03.A01();
            C25271mo r12 = r1.A00;
            synchronized (r12) {
                r0 = r12.A02;
            }
        } else {
            r0 = new C58603Gk();
        }
        regFlowExtras.A02 = r0;
        regFlowExtras.A0h = r11.A0G;
        regFlowExtras.A03(r11.A0F);
        regFlowExtras.A0v = r11.A0H;
        regFlowExtras.A0P = AnonymousClass0wJ.A0n(r11.A0E);
        if (!r11.A0I && !C18240wQ.A1U(r11)) {
            C63463hW.A03();
            RegFlowExtras regFlowExtras2 = r11.A07;
            Bundle A062 = C18180wK.A06();
            A062.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
            C18190wL.A13(A062, "IgSessionManager.LOGGED_OUT_TOKEN");
            C27541sg r2 = new C27541sg();
            AnonymousClass0wJ.A19(r2, C18210wN.A0F(A062, r2, r11), r11.A09);
        }
        C18210wN.A13(r11);
    }

    public static void A01(C23201cg r7) {
        String str = r7.A0K;
        String A0n = AnonymousClass0wJ.A0n(r7.A0D);
        if (!str.isEmpty() || !A0n.isEmpty()) {
            C07530bf r2 = r7.A09;
            String A0d = C18240wQ.A0d(r7);
            String A0k = C18230wP.A0k(r7);
            String A0l = C18190wL.A0l(r7.A09);
            H1T A0N2 = AnonymousClass0wJ.A0N(r2);
            A0N2.A0J("accounts/username_suggestions/");
            A0N2.A0O("email", str);
            A0N2.A0O(FXPFAccessLibraryDebugFragment.NAME, A0n);
            C63213h0.A04(A0N2, A0d);
            A0N2.A0O("guid", A0k);
            A0N2.A0P("phone_id", A0l);
            AnonymousClass269.A09(A0N2);
            C63873iU.A0C(r7, C18180wK.A0T(A0N2, AnonymousClass1T7.class, C59963Nc.class), 113);
        }
    }

    public static boolean A03(C23201cg r5) {
        String str;
        String A0f = C18180wK.A0f(r5.A0E);
        if (A0f.length() < 6) {
            r5.Cth(r5.getString(2131832179), AnonymousClass006.A0C);
            str = "password_too_short";
        } else {
            int i = 0;
            while (true) {
                String[] strArr = C40566Lj1.A00;
                if (i >= strArr.length) {
                    InlineErrorMessageView inlineErrorMessageView = r5.A0B;
                    if (inlineErrorMessageView == null) {
                        return false;
                    }
                    inlineErrorMessageView.A04();
                    return false;
                } else if (strArr[i].equals(A0f)) {
                    r5.Cth(r5.getString(2131832183), AnonymousClass006.A0C);
                    str = "password_blacklisted";
                    break;
                } else {
                    i++;
                }
            }
        }
        C61763Vg A032 = C63313hF.A03(r5.A09, r5.A0F, AnonymousClass2AT.A09.A00, "next_blocked");
        A032.A03("reason", str);
        A032.A01();
        return true;
    }

    public final void AHz() {
        SearchEditText searchEditText = this.A0D;
        if (searchEditText != null) {
            searchEditText.setEnabled(false);
        }
        SearchEditText searchEditText2 = this.A0E;
        if (searchEditText2 != null) {
            searchEditText2.setEnabled(false);
        }
    }

    public final void AJV() {
        SearchEditText searchEditText = this.A0D;
        if (searchEditText != null) {
            searchEditText.setEnabled(true);
        }
        SearchEditText searchEditText2 = this.A0E;
        if (searchEditText2 != null) {
            searchEditText2.setEnabled(true);
        }
    }

    public final C313625r Aiy() {
        return this.A0F;
    }

    public final AnonymousClass265 BDt() {
        return AnonymousClass2AT.A09.A00;
    }

    public final boolean BXY() {
        String A0f = C18180wK.A0f(this.A0E);
        if (TextUtils.isEmpty(A0f) || A0f.length() < 6) {
            return false;
        }
        return true;
    }

    public final void C9G() {
        this.A0C.setShowProgressBar(true);
        if (!A03(this)) {
            C63313hF A0B2 = AnonymousClass269.CpntactsImportOptIn.A0B(this.A09);
            AnonymousClass265 r3 = AnonymousClass2AT.A09.A00;
            C15730rn A062 = A0B2.A06((C313625r) null, r3);
            A062.A09("is_ci_opt_in", Boolean.valueOf(this.A0G));
            A062.A0E("event_tag", Arrays.asList(new String[]{"REGISTRATION", "one_page_registration"}));
            C18180wK.A1K(A062, this.A09);
            if (!this.A0G) {
                A00(this);
                return;
            }
            C54212z5.A00(this.A09, r3.A01);
            AnonymousClass7K8.A02(getActivity(), new IDxPCallbackShape480S0100000_1_I2(this, 3), new String[]{"android.permission.READ_CONTACTS"});
        }
    }

    public final void CDH(boolean z) {
        TextView textView = this.A00;
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    public final String getModuleName() {
        return "one_page_registration";
    }

    public final C10300i6 getSession() {
        return this.A09;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (C09860go.A0p(this.A0D) && !TextUtils.isEmpty(this.A07.A0O)) {
            this.A0D.setText(this.A07.A0O);
        }
        this.A04.A04 = true;
        super.onViewCreated(view, bundle);
    }

    public static void A02(C23201cg r1) {
        AnonymousClass3RH.A00();
        r1.A0D.getText().toString();
        SearchEditText searchEditText = r1.A0E;
        if (searchEditText != null) {
            searchEditText.getText().toString();
        }
    }

    public final void Cth(String str, Integer num) {
        InlineErrorMessageView inlineErrorMessageView;
        int intValue = num.intValue();
        if (intValue != 5) {
            if (intValue == 2) {
                inlineErrorMessageView = this.A0B;
            }
            C63553hn.A08(this.A0J, str);
            this.A0C.setShowProgressBar(false);
        }
        inlineErrorMessageView = this.A0A;
        if (inlineErrorMessageView != null) {
            inlineErrorMessageView.A05(str);
            this.A0C.setShowProgressBar(false);
        }
        C63553hn.A08(this.A0J, str);
        this.A0C.setShowProgressBar(false);
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(3655845);
        RegFlowExtras regFlowExtras = this.A07;
        regFlowExtras.A03(this.A0F);
        regFlowExtras.A0N = AnonymousClass2AT.A09.A00.name();
        regFlowExtras.A0O = C18180wK.A0f(this.A0D);
        AnonymousClass3Y3.A00(getContext()).A02(this.A09, this.A07);
        C14030oh.A0A(-1892074952, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(-2030707857, C14030oh.A03(90308131));
    }

    public final boolean onBackPressed() {
        if (!C18190wL.A1X(C18200wM.A0C(), "has_user_confirmed_dialog")) {
            C07530bf r6 = this.A09;
            AnonymousClass265 r8 = AnonymousClass2AT.A09.A00;
            AnonymousClass2S0.A00(this, new IDxEListenerShape711S0100000_1_I2(this, 1), r6, this.A0F, r8, (Integer) null);
            return true;
        }
        A02(this);
        C07530bf r3 = this.A09;
        String str = AnonymousClass2AT.A09.A00.A01;
        C313625r r1 = this.A0F;
        AnonymousClass0wJ.A1N(r3, str);
        C62223Xv.A00(r3, r1, (Boolean) null, (Integer) null, str);
        C18210wN.A13(this);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(1371889512);
        super.onCreate(bundle);
        this.A09 = C18210wN.A0N(this);
        RegFlowExtras A0M2 = C18210wN.A0M(this);
        this.A07 = A0M2;
        A0M2.getClass();
        this.A0H = true;
        if (C18210wN.A1U(A0M2.A08)) {
            this.A0K = this.A07.A08;
            this.A0F = C313625r.EMAIL;
        } else {
            List A002 = C50662tM.A00(getContext());
            if (!A002.isEmpty()) {
                this.A0K = C18190wL.A0p(A002, 0);
            }
        }
        if (C18210wN.A1U(this.A07.A0Q)) {
            this.A0F = C313625r.PHONE;
        }
        this.A06 = new C61273So(this, this.A09);
        C313625r r2 = this.A0F;
        C313625r r1 = C313625r.PHONE;
        RegFlowExtras regFlowExtras = this.A07;
        if (r2 == r1) {
            str = regFlowExtras.A0Q;
        } else {
            str = regFlowExtras.A08;
        }
        C62213Xu instance = C62213Xu.getInstance();
        Context context = getContext();
        if (str == null) {
            str = "unknown";
        }
        instance.startDeviceValidation(context, str);
        C14030oh.A09(1834561928, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.46o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: X.46p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: X.46o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: X.46o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            r0 = -342513999(0xffffffffeb95a6b1, float:-3.6183425E26)
            int r2 = X.C14030oh.A02(r0)
            r0 = 2131496674(0x7f0c0ee2, float:1.861692E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0H(r10, r11, r0)
            android.view.ViewGroup r1 = X.C18190wL.A0E(r3)
            r0 = 2131496007(0x7f0c0c47, float:1.8615567E38)
            r4 = 1
            r10.inflate(r0, r1, r4)
            r0 = 2131300543(0x7f0910bf, float:1.8219119E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r3, r0)
            r0 = 2131827728(0x7f111c10, float:1.9288377E38)
            r1.setText(r0)
            r0 = 2131300539(0x7f0910bb, float:1.821911E38)
            int r7 = X.C18230wP.A03(r3, r0)
            r0 = 2131304049(0x7f091e71, float:1.822623E38)
            android.view.View r1 = r3.requireViewById(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            r9.A0E = r1
            r0 = 129(0x81, float:1.81E-43)
            r1.setInputType(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r9.A0E
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r1.setTypeface(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r9.A0E
            r6 = 12
            X.C18210wN.A10(r0, r6, r9)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r9.A0E
            r0.setAllowTextSelection(r4)
            X.0bf r8 = r9.A09
            java.lang.Integer r5 = X.AnonymousClass006.A0N
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r9.A0E
            X.3Ft r0 = new X.3Ft
            r0.<init>(r1, r9, r8, r5)
            r9.A05 = r0
            r0.A04 = r4
            r0 = 2131305761(0x7f092521, float:1.8229702E38)
            android.view.View r1 = r3.requireViewById(r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r9.A0H
            r1.setChecked(r0)
            r8 = 30
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r0.<init>((java.lang.Object) r9, (int) r8)
            r1.setOnCheckedChangeListener(r0)
            r0 = 2131834567(0x7f1136c7, float:1.9302248E38)
            r1.setText(r0)
            r0 = 2131300837(0x7f0911e5, float:1.8219715E38)
            android.view.View r1 = r3.requireViewById(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            r9.A0D = r1
            r0 = 11
            X.C18210wN.A10(r1, r0, r9)
            com.instagram.ui.widget.searchedittext.SearchEditText r5 = r9.A0D
            android.content.Context r0 = r9.getContext()
            X.1w3 r1 = new X.1w3
            r1.<init>(r0, r9)
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r8)
            android.text.InputFilter[] r0 = new android.text.InputFilter[]{r1, r0}
            r5.setFilters(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r9.A0D
            r0.setAllowTextSelection(r4)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r9.A0D
            X.C18210wN.A12(r0, r9, r6)
            X.0bf r6 = r9.A09
            java.lang.Integer r5 = X.AnonymousClass006.A0C
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r9.A0D
            X.3Ft r0 = new X.3Ft
            r0.<init>(r1, r9, r6, r5)
            r9.A04 = r0
            r0 = 2131300839(0x7f0911e7, float:1.8219719E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = (com.instagram.ui.widget.inlineerror.InlineErrorMessageView) r0
            r9.A0A = r0
            r0 = 2131304052(0x7f091e74, float:1.8226236E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = (com.instagram.ui.widget.inlineerror.InlineErrorMessageView) r0
            r9.A0B = r0
            r0 = 2131303901(0x7f091ddd, float:1.822593E38)
            android.view.ViewGroup r0 = X.C18240wQ.A0G(r3, r0)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView.A03(r0)
            X.KHr r5 = X.C38040KHr.A01
            X.25r r1 = r9.A0F
            X.25r r0 = X.C313625r.PHONE
            if (r1 != r0) goto L_0x0183
            java.lang.Class<X.45S> r1 = X.AnonymousClass45S.class
            X.46p r0 = new X.46p
            r0.<init>(r9)
            r9.A03 = r0
        L_0x00ec:
            r5.A03(r0, r1)
            java.lang.Class<X.45Q> r1 = X.AnonymousClass45Q.class
            X.46n r0 = new X.46n
            r0.<init>(r9)
            r9.A01 = r0
            r5.A03(r0, r1)
            r0 = 2131306658(0x7f0928a2, float:1.8231521E38)
            android.widget.TextView r6 = X.AnonymousClass0wJ.A0L(r3, r0)
            r0 = 2131827501(0x7f111b2d, float:1.9287916E38)
            java.lang.String r0 = r9.getString(r0)
            android.text.Spanned r0 = X.C16370sw.A03(r0)
            r6.setText(r0)
            r0 = 14
            X.AnonymousClass0wJ.A17(r6, r0, r9)
            X.25r r1 = r9.A0F
            X.25r r0 = X.C313625r.A03
            r5 = 0
            if (r1 != r0) goto L_0x0167
            r6.setVisibility(r7)
            r9.A0G = r5
        L_0x0121:
            com.instagram.ui.widget.progressbutton.ProgressButton r10 = X.C18210wN.A0O(r3)
            r9.A0C = r10
            X.0bf r8 = r9.A09
            com.instagram.ui.widget.searchedittext.SearchEditText r7 = r9.A0E
            r11 = 2131824393(0x7f110f09, float:1.9281613E38)
            X.1jv r6 = new X.1jv
            r6.<init>(r7, r8, r9, r10, r11)
            r9.A08 = r6
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r9.A0C
            r0.setTypeface(r4)
            X.1jv r4 = r9.A08
            r1 = 13
            com.facebook.redex.IDxAListenerShape388S0100000_1_I2 r0 = new com.facebook.redex.IDxAListenerShape388S0100000_1_I2
            r0.<init>(r9, r1)
            r4.A00 = r0
            r9.registerLifecycleListener(r4)
            com.instagram.registration.ui.NotificationBar r0 = X.C18240wQ.A0U(r3)
            r9.A0J = r0
            X.C691847d.A02(r9)
            X.3YT r5 = X.AnonymousClass3YT.A00
            X.0bf r4 = r9.A09
            X.2AT r0 = X.AnonymousClass2AT.A09
            X.265 r0 = r0.A00
            java.lang.String r1 = r0.A01
            X.25r r0 = r9.A0F
            r5.A01(r4, r0, r1)
            r0 = 669144924(0x27e2575c, float:6.2822316E-15)
            X.C14030oh.A09(r0, r2)
            return r3
        L_0x0167:
            r6.setVisibility(r5)
            r0 = 2131299086(0x7f090b0e, float:1.8216163E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r3, r0)
            r9.A00 = r1
            r0 = 15
            X.AnonymousClass0wJ.A17(r1, r0, r9)
            android.widget.TextView r0 = r9.A00
            r0.setVisibility(r5)
            android.widget.TextView r0 = r9.A00
            r0.setEnabled(r5)
            goto L_0x0121
        L_0x0183:
            java.lang.Class<X.45K> r1 = X.AnonymousClass45K.class
            X.46o r0 = new X.46o
            r0.<init>(r9)
            r9.A02 = r0
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23201cg.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1514386063);
        super.onDestroyView();
        C61273So r1 = this.A06;
        C25271mo r0 = r1.A00;
        if (r0 != null) {
            r0.A03.A01();
            r1.A00 = null;
        }
        unregisterLifecycleListener(this.A08);
        this.A0D.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        this.A0D.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        SearchEditText searchEditText = this.A0E;
        if (searchEditText != null) {
            searchEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            this.A0E.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        }
        this.A0C.setOnClickListener((View.OnClickListener) null);
        this.A0L.removeCallbacksAndMessages((Object) null);
        this.A08 = null;
        this.A0J = null;
        this.A0D = null;
        this.A0E = null;
        this.A0C = null;
        this.A0A = null;
        this.A0B = null;
        this.A00 = null;
        C690646p r2 = this.A03;
        if (r2 != null) {
            C38040KHr.A01.A04(r2, AnonymousClass45S.class);
            this.A03 = null;
        }
        C690546o r22 = this.A02;
        if (r22 != null) {
            C38040KHr.A01.A04(r22, AnonymousClass45K.class);
            this.A02 = null;
        }
        C690446n r23 = this.A01;
        if (r23 != null) {
            C38040KHr.A01.A04(r23, AnonymousClass45Q.class);
            this.A01 = null;
        }
        C691847d.A03(this);
        C14030oh.A09(-1197381634, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-1823486273);
        super.onPause();
        this.A0I = true;
        C25271mo r0 = this.A06.A00;
        if (r0 != null) {
            r0.A03.A01();
        }
        this.A0J.A03();
        C09860go.A0I(requireView());
        this.A0D.removeTextChangedListener(this.A0O);
        this.A0L.removeCallbacksAndMessages((Object) null);
        C18180wK.A0F(this).setSoftInputMode(0);
        C14030oh.A09(-1716600127, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-2010592335);
        super.onResume();
        this.A0I = false;
        C61273So r2 = this.A06;
        C25271mo r0 = r2.A00;
        if (r0 == null || r0.A00 == r0.A01) {
            C61273So.A00(r2);
        } else {
            AnonymousClass0gN.A00().AKp(r2.A00);
        }
        A01(this);
        this.A0D.addTextChangedListener(this.A0O);
        C18180wK.A15(this);
        C14030oh.A09(236842767, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-720690943);
        super.onStop();
        C14030oh.A09(-1119621760, A022);
    }
}
