package X;

import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape345S0100000_1_I2;
import com.facebook.redex.IDxEListenerShape711S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;

/* renamed from: X.1ck  reason: invalid class name */
public final class AnonymousClass1ck extends C34640IcN implements C82424pb, AnonymousClass4tS, C82824qK, C10390iG, C84364t1, C82804qI {
    public static final String __redex_internal_original_name = "UsernameChangeFragment";
    public AnonymousClass3GA A00;
    public C58583Gi A01;
    public C61643Ur A02;
    public RegFlowExtras A03;
    public NotificationBar A04;
    public C07530bf A05;
    public InlineErrorMessageView A06;
    public ProgressButton A07;
    public SearchEditText A08;
    public String A09;
    public String A0A;
    public ImageView A0B;
    public C691146u A0C;
    public AnonymousClass3Ft A0D;
    public C24721jv A0E;
    public final Handler A0F = C18250wR.A08();
    public final Runnable A0G = new AnonymousClass4PY(this);
    public final TextWatcher A0H = new IDxWAdapterShape193S0100000_1_I2(this, 12);
    public final View.OnFocusChangeListener A0I = new IDxCListenerShape345S0100000_1_I2(this, 13);
    public final C82394pY A0J = C18220wO.A0P(this, 56);

    public final void CDH(boolean z) {
    }

    public final void Csx(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C07530bf r7 = this.A05;
            C36482Rm.A00(activity, this.A0F, this, this, this.A03, this.A0E, r7, AnonymousClass2AT.A04.A00, str, str2, this.A0A);
        }
    }

    public static void A00(AnonymousClass1ck r2) {
        if (r2.A03.A01() == C313625r.A03) {
            AnonymousClass3RH.A00 = null;
            return;
        }
        AnonymousClass3RH.A00();
        r2.A08.getText().toString();
    }

    public final void AHz() {
        this.A08.setEnabled(false);
    }

    public final void AJV() {
        this.A08.setEnabled(true);
    }

    public final C313625r Aiy() {
        return this.A03.A01();
    }

    public final AnonymousClass265 BDt() {
        return AnonymousClass2AT.A04.A00;
    }

    public final boolean BXY() {
        return C18210wN.A1U(C18180wK.A0f(this.A08));
    }

    public final void C9G() {
        String str;
        String A0f = C18180wK.A0f(this.A08);
        if (!TextUtils.isEmpty(this.A09)) {
            if (A0f.equals(this.A0A)) {
                C07530bf r4 = this.A05;
                AnonymousClass265 r3 = AnonymousClass2AT.A04.A00;
                String str2 = this.A09;
                RegFlowExtras regFlowExtras = this.A03;
                if (regFlowExtras.A01() != null) {
                    str = regFlowExtras.A01().A00;
                } else {
                    str = "";
                }
                C54322zG.A00(r4, r3, str2, str);
            } else {
                C61763Vg A032 = C63313hF.A03(this.A05, this.A03.A01(), AnonymousClass2AT.A04.A00, "username_suggestion_prototype_rejected");
                A032.A03("prototype", this.A09);
                A032.A01();
            }
        }
        Handler handler = this.A0F;
        handler.removeCallbacks(this.A0G);
        FragmentActivity activity = getActivity();
        if (activity instanceof C84654td) {
            C67133yv A0R = AnonymousClass0wJ.A0R((C84654td) activity);
            C07530bf r5 = this.A05;
            RegFlowExtras regFlowExtras2 = this.A03;
            C313625r A012 = regFlowExtras2.A01();
            String str3 = A0R.A0B;
            BusinessInfo businessInfo = A0R.A06;
            String A033 = C67353zP.A03(getActivity());
            if (A012 != C313625r.A03) {
                handler.post(new AnonymousClass4TG(handler, this, r5, businessInfo, this, regFlowExtras2, A012, A0f, str3, A033));
                return;
            }
            return;
        }
        C07530bf r13 = this.A05;
        C67283zI.A02(handler, this, this, this, this, this.A03, this.A0E, r13, AnonymousClass2AT.A04.A00, A0f, this.A0A, false);
    }

    public final void CSe() {
        this.A07.setShowProgressBar(false);
        this.A01.A01();
    }

    public final void CSf(String str, Integer num) {
        this.A01.A00();
        this.A07.setShowProgressBar(false);
        Cth(str, num);
    }

    public final void CSg() {
        this.A07.setShowProgressBar(true);
        this.A01.A00();
    }

    public final void CSh(String str, List list) {
        this.A07.setEnabled(false);
        this.A07.setShowProgressBar(false);
        this.A01.A00();
        Cth(str, AnonymousClass006.A01);
        this.A00.A00(getRootActivity(), list);
    }

    public final String getModuleName() {
        return "username_sign_up";
    }

    public final C10300i6 getSession() {
        return this.A05;
    }

    public final void Cth(String str, Integer num) {
        if (!isVisible()) {
            return;
        }
        if (num == AnonymousClass006.A01) {
            this.A06.A05(str);
            this.A04.A02();
            return;
        }
        C63553hn.A08(this.A04, str);
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(-319100878);
        RegFlowExtras regFlowExtras = this.A03;
        if (regFlowExtras.A01() != C313625r.A03) {
            AnonymousClass2AT.A00(this, AnonymousClass2AT.A04, regFlowExtras).A02(this.A05, this.A03);
        }
        C14030oh.A0A(-1968384778, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(-106624485, C14030oh.A03(-731589380));
    }

    public final boolean onBackPressed() {
        if (!C18190wL.A1X(C18200wM.A0C(), "has_user_confirmed_dialog")) {
            C07530bf r3 = this.A05;
            AnonymousClass265 r5 = AnonymousClass2AT.A04.A00;
            AnonymousClass2S0.A00(this, new IDxEListenerShape711S0100000_1_I2(this, 2), r3, this.A03.A01(), r5, (Integer) null);
            return true;
        }
        A00(this);
        C07530bf r32 = this.A05;
        String str = AnonymousClass2AT.A04.A00.A01;
        C313625r A012 = this.A03.A01();
        AnonymousClass0wJ.A1N(r32, str);
        C62223Xv.A00(r32, A012, (Boolean) null, (Integer) null, str);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 1428651264(0x55277d00, float:1.1509707E13)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r6)
            X.0bf r0 = X.C18210wN.A0N(r5)
            r5.A05 = r0
            com.instagram.registration.model.RegFlowExtras r1 = X.C18210wN.A0M(r5)
            r5.A03 = r1
            r1.getClass()
            X.25r r0 = X.C313625r.A03
            r1.A03(r0)
            java.lang.String r0 = r1.A08
            boolean r0 = X.C18210wN.A1U(r0)
            com.instagram.registration.model.RegFlowExtras r1 = r5.A03
            if (r0 == 0) goto L_0x0083
            X.25r r0 = X.C313625r.EMAIL
        L_0x002a:
            r1.A03(r0)
        L_0x002d:
            android.content.Context r1 = r5.getContext()
            X.0bf r0 = r5.A05
            X.C59733Mc.A01(r1, r0)
            com.instagram.registration.model.RegFlowExtras r0 = r5.A03
            java.util.List r1 = r0.A0f
            if (r1 != 0) goto L_0x0042
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            r0.A0f = r1
        L_0x0042:
            r4 = 0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x006d
            java.lang.Object r0 = r1.get(r4)
            X.38z r0 = (X.C569038z) r0
            java.lang.String r0 = r0.A01
            r5.A0A = r0
            java.lang.Object r0 = r1.get(r4)
            X.38z r0 = (X.C569038z) r0
            java.lang.String r0 = r0.A00
            r5.A09 = r0
        L_0x005d:
            X.KHr r2 = X.C38040KHr.A01
            java.lang.Class<X.45N> r1 = X.AnonymousClass45N.class
            X.4pY r0 = r5.A0J
            r2.A03(r0, r1)
            r0 = -2054734336(0xffffffff85873e00, float:-1.2718114E-35)
            X.C14030oh.A09(r0, r3)
            return
        L_0x006d:
            r2 = 0
            r5.A09 = r2
            com.instagram.registration.model.RegFlowExtras r0 = r5.A03
            java.util.List r1 = r0.A0e
            if (r1 == 0) goto L_0x0080
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0080
            java.lang.String r2 = X.C18190wL.A0p(r1, r4)
        L_0x0080:
            r5.A0A = r2
            goto L_0x005d
        L_0x0083:
            java.lang.String r0 = r1.A0Q
            boolean r0 = X.C18210wN.A1U(r0)
            if (r0 == 0) goto L_0x002d
            com.instagram.registration.model.RegFlowExtras r1 = r5.A03
            X.25r r0 = X.C313625r.PHONE
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ck.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1986699127);
        LayoutInflater layoutInflater2 = layoutInflater;
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater2, viewGroup, R.layout.reg_container);
        layoutInflater2.inflate(R.layout.reg_username_change, C18190wL.A0E(A0H2), true);
        AnonymousClass0wJ.A0L(A0H2, R.id.field_title).setText(2131823236);
        AnonymousClass0wJ.A0L(A0H2, R.id.field_detail).setText(2131823235);
        C691146u r1 = new C691146u(this);
        this.A0C = r1;
        C38040KHr.A01.A03(r1, AnonymousClass45Q.class);
        this.A04 = C18240wQ.A0U(A0H2);
        SearchEditText searchEditText = (SearchEditText) A0H2.requireViewById(R.id.username);
        this.A08 = searchEditText;
        searchEditText.setOnFocusChangeListener(this.A0I);
        this.A08.setAllowTextSelection(true);
        this.A0B = C18220wO.A0K(A0H2, R.id.username_valid_icon);
        this.A06 = (InlineErrorMessageView) A0H2.findViewById(R.id.username_inline_error);
        InlineErrorMessageView.A03(C18240wQ.A0G(A0H2, R.id.username_input_container));
        this.A08.addTextChangedListener(this.A0H);
        this.A08.setFilters(new InputFilter[]{new AnonymousClass1w4(getContext(), this), new InputFilter.LengthFilter(30)});
        SearchEditText searchEditText2 = this.A08;
        ImageView imageView = this.A0B;
        C07530bf r10 = this.A05;
        RegFlowExtras regFlowExtras = this.A03;
        C313625r A012 = regFlowExtras.A01();
        AnonymousClass265 r13 = AnonymousClass2AT.A04.A00;
        this.A00 = new AnonymousClass3GA(A0H2, imageView, regFlowExtras, r10, searchEditText2, A012, r13);
        ProgressButton A0c = C18230wP.A0c(A0H2);
        this.A07 = A0c;
        C24721jv r12 = new C24721jv(this.A08, this.A05, this, A0c);
        this.A0E = r12;
        registerLifecycleListener(r12);
        SearchEditText searchEditText3 = this.A08;
        this.A02 = new C61643Ur(getContext(), AnonymousClass06E.A00(this), (C10300i6) this.A05, (C84364t1) this, searchEditText3);
        this.A01 = new C58583Gi(this.A0B);
        this.A0D = new AnonymousClass3Ft(this.A08, this, this.A05, AnonymousClass006.A0Y);
        if (C09860go.A0p(this.A08) && !TextUtils.isEmpty(this.A0A)) {
            C54292zD.A00(this.A05, this.A03.A01(), r13, this.A0A);
            C07530bf r5 = this.A05;
            String str = r13.A01;
            C313625r A013 = this.A03.A01();
            C18210wN.A0n(1, r5, str);
            C54242z8.A00(r5, A013, str).Bb4();
            this.A08.setText(this.A0A);
            this.A08.setSelection(this.A0A.length());
            this.A01.A01();
            this.A0F.removeCallbacks(this.A0G);
        }
        this.A0D.A04 = true;
        AnonymousClass3YT.A00.A01(this.A05, this.A03.A01(), r13.A01);
        C14030oh.A09(381217659, A022);
        return A0H2;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-564902981);
        super.onDestroy();
        C38040KHr.A01.A04(this.A0J, AnonymousClass45N.class);
        C14030oh.A09(1742374169, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1953684067);
        super.onDestroyView();
        unregisterLifecycleListener(this.A0E);
        C691847d.A03(this);
        this.A08.removeTextChangedListener(this.A0H);
        this.A08.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        this.A08.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        this.A04 = null;
        this.A08 = null;
        this.A00 = null;
        this.A0E = null;
        this.A06 = null;
        this.A0B = null;
        this.A07 = null;
        C691146u r2 = this.A0C;
        if (r2 != null) {
            C38040KHr.A01.A04(r2, AnonymousClass45Q.class);
            this.A0C = null;
        }
        C14030oh.A09(187746683, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1603478791);
        super.onPause();
        C09860go.A0I(this.A08);
        this.A04.A03();
        this.A0F.removeCallbacksAndMessages((Object) null);
        C18180wK.A0F(this).setSoftInputMode(0);
        C14030oh.A09(187606949, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-182810235);
        super.onResume();
        C63553hn.A06(this.A08);
        C18180wK.A15(this);
        C14030oh.A09(-875892200, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(267637886);
        super.onStart();
        C14030oh.A09(-255878730, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(1205676214);
        super.onStop();
        C14030oh.A09(661873799, A022);
    }
}
