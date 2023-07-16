package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;
import com.facebook.redex.IDxObjectShape796S0100000_1_I2;
import com.instagram.common.api.base.IDxACallbackShape0S1300000_1_I2;
import com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import java.util.List;

/* renamed from: X.1cj  reason: invalid class name */
public final class AnonymousClass1cj extends C34640IcN implements C82424pb, AnonymousClass4tS, C82824qK, C10390iG, C82814qJ, C39486KuW, C82854qN {
    public static final String __redex_internal_original_name = "ContactPointTriageFragment";
    public AutoCompleteTextView A00;
    public AutoCompleteTextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public IgFrameLayout A05;
    public FxSsoViewModel A06;
    public C57453Bc A07;
    public C24661jn A08;
    public C57823Cp A09;
    public C24751jz A0A;
    public AnonymousClass3CP A0B;
    public AnonymousClass3CP A0C;
    public AnonymousClass3GG A0D;
    public AnonymousClass3Ft A0E;
    public AnonymousClass3Ft A0F;
    public C24701jr A0G;
    public CountryCodeData A0H;
    public RegFlowExtras A0I;
    public RegFlowExtras A0J;
    public C24721jv A0K;
    public C24721jv A0L;
    public C07530bf A0M;
    public InlineErrorMessageView A0N;
    public InlineErrorMessageView A0O;
    public Integer A0P = AnonymousClass006.A00;
    public String A0Q;
    public String A0R;
    public List A0S;
    public boolean A0T;
    public boolean A0U = false;
    public boolean A0V;
    public boolean A0W = false;
    public C39815L1l A0X;
    public C19577Ayd A0Y;
    public NotificationBar A0Z;
    public final C64493mQ A0a = new IDxWAdapterShape193S0100000_1_I2(this, 9);
    public final C64493mQ A0b = new IDxWAdapterShape193S0100000_1_I2(this, 8);
    public final C82394pY A0c = C18220wO.A0P(this, 46);
    public final C82394pY A0d = C18220wO.A0P(this, 47);

    private void A01(View view, AutoCompleteTextView autoCompleteTextView, AnonymousClass265 r11) {
        if (!this.A0T) {
            View view2 = view;
            C57453Bc r1 = new C57453Bc(view2, autoCompleteTextView, this, new AnonymousClass4EU(autoCompleteTextView, new C70224Dh(getActivity()), this, r11), this.A0M, r11);
            this.A07 = r1;
            r1.A02.A00(getContext(), this, this.A0M, C18240wQ.A0O(getContext(), this), new IDxObjectShape796S0100000_1_I2(r1, 1));
        }
    }

    public static void A04(AnonymousClass1cj r12) {
        AnonymousClass1cj r5 = r12;
        AnonymousClass3GG r0 = r12.A0D;
        if (r0 != null) {
            C63103bV.A03.A03(r12.getActivity(), r12.A0M, r5, r12.BDt(), r0.A00());
            C32165H8c A002 = AnonymousClass3WR.A00(r12.getRootActivity().getApplicationContext(), r12.A0M, r12.A0D.A00(), r12.A0Q, r12.A0R);
            C07530bf r6 = r12.A0M;
            String A0f = C18180wK.A0f(r12.A01);
            C24721jv r10 = r5.A0L;
            AnonymousClass1cj r7 = r5;
            C63873iU.A0F(A002, new C24451ip(r5, r6, r7, r5.A0D.A00.A04, r5.A0I, r10, r5.BDt(), A0f), r5, 28);
            r5.schedule(A002);
        }
    }

    public static void A06(AnonymousClass1cj r8, String str) {
        String str2;
        AnonymousClass1cj r5 = r8;
        RegFlowExtras regFlowExtras = r8.A0I;
        Parcel obtain = Parcel.obtain();
        regFlowExtras.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        RegFlowExtras regFlowExtras2 = (RegFlowExtras) RegFlowExtras.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        RegFlowExtras regFlowExtras3 = r5.A0I;
        AnonymousClass3WW.A01(regFlowExtras3, regFlowExtras2);
        if (r5.A0T) {
            str2 = regFlowExtras3.A0J;
        } else {
            str2 = null;
        }
        FragmentActivity activity = r5.getActivity();
        H1T A0O2 = C18180wK.A0O(r5.A0M);
        A0O2.A0J("consent/get_signup_config/");
        A0O2.A0O("guid", C18230wP.A0i(activity));
        A0O2.A0R("main_account_selected", false);
        A0O2.A0P("logged_in_user_id", str2);
        C32165H8c A0T2 = AnonymousClass0wJ.A0T(A0O2, AnonymousClass1TX.class, AnonymousClass3NZ.class);
        A0T2.A00 = new IDxACallbackShape0S1300000_1_I2(regFlowExtras2, r5, regFlowExtras2, str, 0);
        r5.schedule(A0T2);
    }

    public final void CDH(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1.containsKey("caa_registration_redirection_to_native") == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r13 = this;
            r7 = r13
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            android.os.Bundle r1 = X.C18190wL.A0C(r0)
            if (r1 == 0) goto L_0x0014
            java.lang.String r0 = "caa_registration_redirection_to_native"
            boolean r1 = r1.containsKey(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r6 = 1
            if (r0 == 0) goto L_0x001c
            X.C18190wL.A1A(r13)
            return r6
        L_0x001c:
            androidx.fragment.app.FragmentActivity r1 = r13.getActivity()
            boolean r0 = r1 instanceof X.C84654td
            if (r0 == 0) goto L_0x002a
            X.4td r1 = (X.C84654td) r1
            X.C18230wP.A1Q(r1)
            return r6
        L_0x002a:
            boolean r0 = A08(r13)
            if (r0 == 0) goto L_0x0065
            android.widget.AutoCompleteTextView r0 = r13.A01
        L_0x0032:
            boolean r0 = X.C09860go.A0p(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0068
            android.content.SharedPreferences r2 = X.C18200wM.A0C()
            java.lang.String r0 = "has_user_confirmed_dialog"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L_0x0068
            X.0bf r9 = r13.A0M
            X.265 r11 = r13.BDt()
            X.25r r10 = r13.Aiy()
            com.facebook.redex.IDxEListenerShape711S0100000_1_I2 r8 = new com.facebook.redex.IDxEListenerShape711S0100000_1_I2
            r8.<init>(r13, r1)
            boolean r0 = A08(r13)
            if (r0 == 0) goto L_0x0062
            java.lang.Integer r12 = X.AnonymousClass006.A01
        L_0x005e:
            X.AnonymousClass2S0.A00(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0062:
            java.lang.Integer r12 = X.AnonymousClass006.A00
            goto L_0x005e
        L_0x0065:
            android.widget.AutoCompleteTextView r0 = r13.A00
            goto L_0x0032
        L_0x0068:
            r5 = 0
            X.AnonymousClass3RH.A00 = r5
            android.content.Context r0 = r13.getContext()
            X.AnonymousClass3Y3.A01(r0)
            X.0bf r4 = r13.A0M
            X.265 r0 = r13.BDt()
            java.lang.String r3 = r0.A01
            X.25r r1 = r13.Aiy()
            boolean r0 = A08(r13)
            if (r0 == 0) goto L_0x009a
            java.lang.Integer r0 = X.AnonymousClass006.A01
        L_0x0086:
            r2 = 0
            X.C04220Ms.A0B(r4, r2)
            X.C04220Ms.A0B(r3, r6)
            X.C62223Xv.A00(r4, r1, r5, r0, r3)
            X.3bV r1 = X.C63103bV.A03
            android.content.Context r0 = r13.getContext()
            r1.A05(r0)
            return r2
        L_0x009a:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cj.onBackPressed():boolean");
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(X.AnonymousClass259 r28) {
        /*
            r27 = this;
            X.259 r3 = X.AnonymousClass259.A01
            r0 = r27
            r6 = r28
            if (r6 != r3) goto L_0x0164
            android.widget.AutoCompleteTextView r1 = r0.A00
        L_0x000a:
            java.lang.String r11 = X.C18180wK.A0f(r1)
            boolean r1 = r0.A0T
            if (r1 != 0) goto L_0x00f6
            X.3Bc r1 = r0.A07
            if (r1 == 0) goto L_0x00f6
            X.3HV r1 = r1.A02
            java.util.List r1 = r1.A02
            java.util.Iterator r2 = r1.iterator()
        L_0x001e:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00f6
            java.lang.Object r13 = r2.next()
            X.4tW r13 = (X.C84604tW) r13
            boolean r1 = r6 instanceof X.C27171s5
            if (r1 == 0) goto L_0x00ec
            java.lang.String r1 = r13.AfO()
            boolean r1 = r11.equalsIgnoreCase(r1)
        L_0x0036:
            if (r1 == 0) goto L_0x001e
            if (r6 != r3) goto L_0x0168
            X.0bf r10 = r0.A0M
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            X.4Dh r9 = new X.4Dh
            r9.<init>(r1)
            X.4ES r8 = new X.4ES
            r8.<init>(r13, r0)
            r3 = 2131824336(0x7f110ed0, float:1.9281497E38)
            boolean r1 = r13 instanceof X.C27131s1
            if (r1 == 0) goto L_0x00e3
            r3 = 2131824335(0x7f110ecf, float:1.9281495E38)
        L_0x0054:
            X.265 r16 = X.AnonymousClass265.A0d
            r11 = 2131835709(0x7f113b3d, float:1.9304564E38)
            android.content.res.Resources r7 = X.AnonymousClass0wJ.A0B(r0)
            android.content.Context r1 = r0.getContext()
            X.Dsm r6 = X.C18190wL.A0W(r1)
            r5 = 1
            r6.A0q(r5)
            r6.A0r(r5)
            r2 = 2131824338(0x7f110ed2, float:1.9281501E38)
            java.lang.String r1 = r13.BK7()
            java.lang.String r4 = X.AnonymousClass0wJ.A0o(r0, r1, r2)
            java.lang.String r3 = r7.getString(r3)
            com.instagram.common.typedurl.ImageUrl r1 = r13.AoT()
            r6.A0l(r1, r0)
            r2 = 2131824337(0x7f110ed1, float:1.92815E38)
            java.lang.String r1 = r13.BK7()
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r0, r1, r2)
            com.facebook.redex.IDxCListenerShape3S0700000_1_I2 r12 = new com.facebook.redex.IDxCListenerShape3S0700000_1_I2
            r14 = r8
            r15 = r0
            r17 = r10
            r18 = r9
            r19 = r8
            r20 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r6.A0c(r12, r1)
            java.lang.String r2 = r7.getString(r11)
            r1 = 112(0x70, float:1.57E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r1 = X.C18220wO.A0O(r8, r1)
            r6.A0b(r1, r2)
            r6.A02 = r4
            r6.A0p(r3)
            X.AnonymousClass0wJ.A1K(r6)
            X.0bf r4 = r0.A0M
            java.lang.String r3 = "shared_email_autocomplete_account_dialog_shown"
            X.265 r1 = r0.BDt()
            X.25r r2 = r0.Aiy()
            X.0rn r3 = X.C63313hF.A00(r4, r3)
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = r1.A01
            X.C18250wR.A19(r3, r1)
        L_0x00cb:
            if (r2 == 0) goto L_0x00d4
            java.lang.String r2 = r2.A00
            java.lang.String r1 = "flow"
            r3.A0D(r1, r2)
        L_0x00d4:
            java.lang.String r2 = r13.AOZ()
            java.lang.String r1 = "autocomplete_account_type"
            r3.A0D(r1, r2)
            X.0bf r0 = r0.A0M
            X.C18180wK.A1K(r3, r0)
        L_0x00e2:
            return
        L_0x00e3:
            boolean r1 = r13 instanceof X.C27141s2
            if (r1 == 0) goto L_0x0054
            r3 = 2131824334(0x7f110ece, float:1.9281493E38)
            goto L_0x0054
        L_0x00ec:
            java.lang.String r1 = r13.B1L()
            boolean r1 = android.telephony.PhoneNumberUtils.compare(r11, r1)
            goto L_0x0036
        L_0x00f6:
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r15 = X.AnonymousClass0wJ.A0y()
            boolean r1 = r0.A0T
            if (r1 != 0) goto L_0x0143
            X.3Bc r1 = r0.A07
            if (r1 == 0) goto L_0x0145
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            X.3HV r1 = r1.A02
            java.util.List r1 = r1.A02
            java.util.Iterator r3 = r1.iterator()
        L_0x0112:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0124
            java.lang.Object r2 = r3.next()
            boolean r1 = r2 instanceof X.C27121s0
            if (r1 == 0) goto L_0x0112
            r4.add(r2)
            goto L_0x0112
        L_0x0124:
            java.util.Iterator r4 = r4.iterator()
        L_0x0128:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0145
            java.lang.Object r2 = r4.next()
            X.1s0 r2 = (X.C27121s0) r2
            X.3ac r3 = r2.A00
            java.lang.String r1 = r3.A03
            r5.put(r1, r2)
            java.lang.String r2 = r3.A05
            java.lang.String r1 = r3.A03
            r15.put(r2, r1)
            goto L_0x0128
        L_0x0143:
            r13 = 0
            goto L_0x0151
        L_0x0145:
            X.44X r3 = X.AnonymousClass44X.A00()
            X.0bf r2 = r0.A0M
            java.lang.String r1 = "ig_android_growth_FX_access_fbig_verify_email"
            java.lang.String r13 = r3.A03(r2, r1)
        L_0x0151:
            int[] r2 = X.AnonymousClass31C.A00
            int r1 = r6.ordinal()
            r4 = r2[r1]
            r3 = 1
            java.lang.String r2 = "Error creating the uid:nonce map"
            java.lang.String r1 = "ContactPointTriageFragment"
            if (r4 == r3) goto L_0x016c
            r3 = 2
            if (r4 != r3) goto L_0x00e2
            goto L_0x019c
        L_0x0164:
            android.widget.AutoCompleteTextView r1 = r0.A01
            goto L_0x000a
        L_0x0168:
            A04(r0)
            return
        L_0x016c:
            android.content.Context r7 = r0.getContext()     // Catch:{ JSONException -> 0x01ca }
            X.06E r8 = X.AnonymousClass06E.A00(r0)     // Catch:{ JSONException -> 0x01ca }
            java.util.Set r16 = r5.keySet()     // Catch:{ JSONException -> 0x01ca }
            java.lang.String r12 = r0.A0Q     // Catch:{ JSONException -> 0x01ca }
            X.0bf r10 = r0.A0M     // Catch:{ JSONException -> 0x01ca }
            r17 = 0
            java.util.List r14 = r0.A0S     // Catch:{ JSONException -> 0x01ca }
            X.1jv r4 = r0.A0K     // Catch:{ JSONException -> 0x01ca }
            com.instagram.registration.model.RegFlowExtras r3 = r0.A0I     // Catch:{ JSONException -> 0x01ca }
            X.1ih r9 = new X.1ih     // Catch:{ JSONException -> 0x01ca }
            r18 = r9
            r19 = r0
            r20 = r10
            r21 = r0
            r22 = r0
            r23 = r3
            r24 = r4
            r25 = r11
            r26 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ JSONException -> 0x01ca }
            goto L_0x01c0
        L_0x019c:
            android.content.Context r7 = r0.getContext()     // Catch:{ JSONException -> 0x01ca }
            X.06E r8 = X.AnonymousClass06E.A00(r0)     // Catch:{ JSONException -> 0x01ca }
            X.3GG r3 = r0.A0D     // Catch:{ JSONException -> 0x01ca }
            if (r3 != 0) goto L_0x01c4
            java.lang.String r11 = ""
        L_0x01aa:
            r16 = 0
            java.util.HashMap r15 = X.AnonymousClass0wJ.A0y()     // Catch:{ JSONException -> 0x01ca }
            java.lang.String r12 = r0.A0Q     // Catch:{ JSONException -> 0x01ca }
            X.0bf r10 = r0.A0M     // Catch:{ JSONException -> 0x01ca }
            boolean r4 = r0.A0V     // Catch:{ JSONException -> 0x01ca }
            java.util.List r14 = r0.A0S     // Catch:{ JSONException -> 0x01ca }
            r3 = 108(0x6c, float:1.51E-43)
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r9 = X.C63873iU.A06(r0, r3)     // Catch:{ JSONException -> 0x01ca }
            r17 = r4
        L_0x01c0:
            r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ JSONException -> 0x01ca }
            goto L_0x01c9
        L_0x01c4:
            java.lang.String r11 = r3.A00()     // Catch:{ JSONException -> 0x01ca }
            goto L_0x01aa
        L_0x01c9:
            return
        L_0x01ca:
            X.C10450iM.A03(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cj.A02(X.259):void");
    }

    public static void A03(AnonymousClass1cj r4) {
        JUZ BHE = r4.A0X.BHE();
        if (BHE.A0B.contains("ig_sign_up_screen_banner")) {
            String str = BHE.A06;
            if (str == null) {
                str = r4.getString(2131838182);
            }
            r4.A0Y.A09(0);
            ((TextView) r4.A0Y.A08()).setText(C18190wL.A0h(AnonymousClass0wJ.A0B(r4), str, 2131838190));
            return;
        }
        r4.A0Y.A09(8);
    }

    private boolean A07() {
        if (this.A0T || (C18180wK.A0d(this.A06.A04) != null && AnonymousClass0wJ.A1X(C18180wK.A0d(this.A06.A04)))) {
            return false;
        }
        if (C18180wK.A0d(this.A06.A02) != null && ((List) C18180wK.A0d(this.A06.A02)).size() > 0) {
            return false;
        }
        if (!AnonymousClass0hA.A08((CharSequence) C18180wK.A0d(this.A06.A01)) || !AnonymousClass0hA.A08((CharSequence) C18180wK.A0d(this.A06.A00))) {
            return true;
        }
        return false;
    }

    public static boolean A08(AnonymousClass1cj r2) {
        C24701jr r0 = r2.A0G;
        if (r0 == null || r0.A01 != AnonymousClass006.A00) {
            return false;
        }
        return true;
    }

    public final void AHz() {
        ImageView imageView;
        C24701jr r1 = this.A0G;
        r1.A03.setEnabled(false);
        r1.A04.setEnabled(false);
        if (A08(this)) {
            AnonymousClass3GG r12 = this.A0D;
            r12.A07.setEnabled(false);
            r12.A05.setEnabled(false);
            imageView = r12.A06;
        } else {
            C57823Cp r13 = this.A09;
            r13.A04.setEnabled(false);
            imageView = r13.A05;
            imageView.setEnabled(false);
        }
        imageView.setVisibility(4);
    }

    public final void AJV() {
        AutoCompleteTextView autoCompleteTextView;
        ImageView imageView;
        C24701jr r1 = this.A0G;
        r1.A03.setEnabled(true);
        r1.A04.setEnabled(true);
        if (A08(this)) {
            AnonymousClass3GG r2 = this.A0D;
            r2.A07.setEnabled(true);
            autoCompleteTextView = r2.A05;
            autoCompleteTextView.setEnabled(true);
            imageView = r2.A06;
        } else {
            C57823Cp r0 = this.A09;
            autoCompleteTextView = r0.A04;
            autoCompleteTextView.setEnabled(true);
            imageView = r0.A05;
            imageView.setEnabled(true);
        }
        int i = 0;
        if (C09860go.A0p(autoCompleteTextView)) {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    public final C313625r Aiy() {
        if (this.A0T) {
            return C313625r.SAC;
        }
        if (A08(this)) {
            return C313625r.PHONE;
        }
        return C313625r.EMAIL;
    }

    public final AnonymousClass265 BDt() {
        if (this.A0T) {
            return AnonymousClass265.A1F;
        }
        if (A08(this)) {
            return AnonymousClass265.A1A;
        }
        return AnonymousClass265.A0d;
    }

    public final void C9G() {
        C313625r r1;
        Integer num;
        String str;
        String str2;
        C63103bV r6 = C63103bV.A03;
        boolean A082 = A08(this);
        boolean z = !A082;
        if (A082) {
            r1 = C313625r.PHONE;
            num = AnonymousClass006.A01;
        } else if (z) {
            r1 = C313625r.EMAIL;
            num = AnonymousClass006.A00;
        } else {
            r1 = C313625r.NONE;
            num = AnonymousClass006.A0u;
        }
        if (this.A0T) {
            this.A0I.A0V = AnonymousClass2TT.A00(num);
        } else {
            this.A0I.A03(r1);
        }
        if (A082) {
            this.A0O.A04();
            AnonymousClass259 r7 = AnonymousClass259.A02;
            if (this.A0D.A03 && !C09860go.A0p(this.A01)) {
                C13330nS A022 = C13330nS.A02(this.A0M);
                double A002 = C18200wM.A00();
                double A003 = AnonymousClass269.A00();
                C313625r Aiy = Aiy();
                if (Aiy == null) {
                    str = "null";
                } else {
                    str = Aiy.A00;
                }
                USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(A022, "phone_prefill_accepted"), 2493);
                if (AnonymousClass0wJ.A1U(A0I2)) {
                    A0I2.A0Q("accepted", Boolean.valueOf(this.A0D.A02.equals(AnonymousClass0wJ.A0n(this.A01))));
                    AnonymousClass0wJ.A1A(A0I2, A002, A003);
                    C18210wN.A19(A0I2, str);
                    AnonymousClass269.A08(A0I2, BDt().A01);
                    C18210wN.A17(A0I2);
                    C18180wK.A1B(A0I2, A002);
                    C18200wM.A1K(A0I2, A003);
                    C18180wK.A1G(A0I2);
                    if (C18250wR.A01(this.A0M) > 1) {
                        str2 = "mas";
                    } else {
                        str2 = null;
                    }
                    A0I2.A0T("source", str2);
                    A0I2.Bb4();
                }
            }
            A02(r7);
            return;
        }
        this.A0N.A04();
        AnonymousClass259 r8 = AnonymousClass259.A01;
        if (this.A09.A02 && !C09860go.A0p(this.A00)) {
            C13330nS A023 = C13330nS.A02(this.A0M);
            long currentTimeMillis = System.currentTimeMillis();
            double A004 = AnonymousClass269.A00();
            USLEBaseShape0S0000000 A0I3 = C18180wK.A0I(AnonymousClass0wJ.A0M(A023, "email_prefill_accepted"), 579);
            A0I3.A0Q("accepted", Boolean.valueOf(this.A09.A01.equals(AnonymousClass0wJ.A0n(this.A00))));
            C18230wP.A1F(A0I3, currentTimeMillis);
            AnonymousClass0wJ.A1A(A0I3, (double) currentTimeMillis, A004);
            C18210wN.A19(A0I3, Aiy().A00);
            C18180wK.A1A(A0I3, A004);
            AnonymousClass269.A08(A0I3, BDt().A01);
            C18240wQ.A15(A0I3, "email_or_phone");
            C18180wK.A1G(A0I3);
            A0I3.Bb4();
        }
        A02(r8);
        r6.A05(getContext());
    }

    public final void CHy(Context context, String str, String str2) {
        C63103bV.A01(context, this.A0M, str2, str, false);
    }

    public final void CjW(CountryCodeData countryCodeData) {
        this.A0H = countryCodeData;
        AnonymousClass3GG r5 = this.A0D;
        CountryCodeData countryCodeData2 = r5.A00.A04;
        if (countryCodeData2 != null) {
            String str = countryCodeData2.A00;
            String str2 = countryCodeData2.A01;
            String str3 = countryCodeData.A00;
            String str4 = countryCodeData.A01;
            C10300i6 r7 = r5.A09;
            USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "country_code_change"), 471);
            if (AnonymousClass0wJ.A1U(A0I2)) {
                double A002 = C18200wM.A00();
                double A003 = AnonymousClass269.A00();
                AnonymousClass0wJ.A1A(A0I2, A002, A003);
                C18180wK.A19(A0I2);
                AnonymousClass269.A08(A0I2, r5.A0A.A01);
                C18180wK.A1A(A0I2, A003);
                A0I2.A0T("to_code", str4);
                C18210wN.A19(A0I2, "phone");
                A0I2.A0T("from_country", str);
                A0I2.A0T("from_code", str2);
                A0I2.A0T("to_country", str3);
                C18180wK.A1B(A0I2, A002);
                C63683i7.A0A(A0I2, r7);
            }
        }
        r5.A00.A04 = countryCodeData;
        TextView textView = r5.A07;
        textView.setText(countryCodeData.A02());
        textView.setContentDescription(countryCodeData.A02);
        r5.A00.A02();
    }

    public final void Cth(String str, Integer num) {
        InlineErrorMessageView inlineErrorMessageView;
        if (this.A0W) {
            this.A0W = false;
            AnonymousClass3WW.A00(this, this.A0J, this.A0M, str);
            return;
        }
        if (num == AnonymousClass006.A0N) {
            inlineErrorMessageView = this.A0N;
        } else if (num == AnonymousClass006.A0Y) {
            inlineErrorMessageView = this.A0O;
        } else {
            C63553hn.A08(this.A0Z, str);
            return;
        }
        inlineErrorMessageView.A05(str);
        this.A0Z.A02();
    }

    public final String getModuleName() {
        return "email_or_phone";
    }

    public final C10300i6 getSession() {
        return this.A0M;
    }

    public final void onTokenChange() {
        C63643hy.A04(new AnonymousClass4PV(this));
    }

    public static int A00(IDxEListenerShape223S0100000_1_I2 iDxEListenerShape223S0100000_1_I2, int i) {
        int A032 = C14030oh.A03(i);
        AnonymousClass1cj r3 = (AnonymousClass1cj) iDxEListenerShape223S0100000_1_I2.A00;
        if (!TextUtils.isEmpty((CharSequence) ((M5J) r3.A06.A00.getValue()).A08())) {
            String str = (String) ((M5J) r3.A06.A00.getValue()).A08();
            TextView textView = r3.A03;
            if (!(textView == null || str == null)) {
                textView.setText(str);
            }
        } else {
            TextView textView2 = r3.A03;
            if (!(textView2 == null || r3.A05 == null)) {
                r3.A0A.A09(textView2, r3, r3.BDt());
                return A032;
            }
        }
        return A032;
    }

    public static void A05(AnonymousClass1cj r9, RegFlowExtras regFlowExtras, String str) {
        C32165H8c A012 = AnonymousClass3WR.A01(r9.getContext(), r9.A0M, str, AnonymousClass44X.A00().A03(r9.A0M, "ig_android_growth_FX_access_fbig_verify_email"), C18190wL.A0l(r9.A0M), r9.A0S);
        A012.A00 = new IDxACallbackShape2S1200000_1_I2(regFlowExtras, r9, str, 4);
        r9.schedule(A012);
    }

    public final boolean BXY() {
        AutoCompleteTextView autoCompleteTextView;
        if (A08(this)) {
            autoCompleteTextView = this.A01;
        } else {
            autoCompleteTextView = this.A00;
        }
        return C18210wN.A1U(C18180wK.A0f(autoCompleteTextView));
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(2114860104);
        RegFlowExtras regFlowExtras = this.A0I;
        regFlowExtras.A08 = C18180wK.A0f(this.A00);
        regFlowExtras.A0R = C18210wN.A0c(this.A01);
        regFlowExtras.A01 = this.A0D.A00.A04;
        regFlowExtras.A03(Aiy());
        regFlowExtras.A0N = BDt().name();
        AnonymousClass3Y3.A00(getContext()).A02(this.A0M, this.A0I);
        C14030oh.A0A(2055517912, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(1465114895, C14030oh.A03(-1438490763));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = -1510966846(0xffffffffa5f079c2, float:-4.171587E-16)
            int r3 = X.C14030oh.A02(r0)
            r7 = r13
            super.onCreate(r14)
            android.os.Bundle r4 = r13.mArguments
            X.0RG r0 = X.AnonymousClass0RA.A0C
            X.0bf r0 = r0.A04(r4)
            r13.A0M = r0
            if (r4 == 0) goto L_0x00da
            java.lang.String r1 = "RegFlowExtras.EXTRA_KEY"
            android.os.Parcelable r0 = r4.getParcelable(r1)
            if (r0 == 0) goto L_0x00da
            android.os.Parcelable r1 = r4.getParcelable(r1)
            com.instagram.registration.model.RegFlowExtras r1 = (com.instagram.registration.model.RegFlowExtras) r1
        L_0x0025:
            r13.A0I = r1
            androidx.fragment.app.FragmentActivity r2 = r13.getActivity()
            r12 = 0
            boolean r0 = r2 instanceof com.instagram.nux.activity.SignedOutFragmentActivity
            if (r0 == 0) goto L_0x0037
            r0 = r2
            com.instagram.nux.activity.SignedOutFragmentActivity r0 = (com.instagram.nux.activity.SignedOutFragmentActivity) r0
            java.lang.String r12 = r0.A06
            r1.A04 = r12
        L_0x0037:
            X.7IU r1 = new X.7IU
            r1.<init>(r2)
            java.lang.Class<com.instagram.fx.access.sso.FxSsoViewModel> r0 = com.instagram.fx.access.sso.FxSsoViewModel.class
            X.3ak r0 = r1.A01(r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = (com.instagram.fx.access.sso.FxSsoViewModel) r0
            r13.A06 = r0
            X.0bf r10 = r13.A0M
            X.265 r11 = r13.BDt()
            r9 = 0
            X.1jz r6 = new X.1jz
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A0A = r6
            X.25r r2 = X.C313625r.SAC
            com.instagram.registration.model.RegFlowExtras r1 = r13.A0I
            X.25r r0 = r1.A01()
            r5 = 0
            boolean r0 = X.C18180wK.A1Z(r2, r0)
            r13.A0T = r0
            if (r14 != 0) goto L_0x00c0
            com.instagram.phonenumber.model.CountryCodeData r6 = r1.A01
            if (r6 != 0) goto L_0x0072
            android.content.Context r0 = r13.getContext()
            com.instagram.phonenumber.model.CountryCodeData r6 = X.C60053Nl.A00(r0)
        L_0x0072:
            r13.A0H = r6
        L_0x0074:
            com.instagram.registration.model.RegFlowExtras r0 = r13.A0I
            X.25r r1 = r0.A01()
            X.25r r0 = X.C313625r.EMAIL
            if (r1 != r0) goto L_0x0082
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r13.A0P = r0
        L_0x0082:
            android.content.SharedPreferences r0 = X.C18200wM.A0C()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "has_user_confirmed_dialog"
            X.AnonymousClass0wJ.A13(r1, r0, r5)
            X.0bf r0 = r13.A0M
            X.L1l r0 = X.C34463IUv.A00(r0)
            r13.A0X = r0
            java.lang.String r0 = X.C18240wQ.A0d(r13)
            r13.A0Q = r0
            java.lang.String r0 = X.C18230wP.A0k(r13)
            r13.A0R = r0
            boolean r0 = r13.A0T
            if (r0 != 0) goto L_0x00af
            com.instagram.common.task.IDxLTaskShape133S0100000_1_I2 r0 = new com.instagram.common.task.IDxLTaskShape133S0100000_1_I2
            r0.<init>(r13, r5)
            r13.schedule(r0)
        L_0x00af:
            if (r4 == 0) goto L_0x00b9
            java.lang.String r0 = "is_current_user_fb_connected"
            boolean r0 = r4.getBoolean(r0, r5)
            r13.A0U = r0
        L_0x00b9:
            r0 = -1876308194(0xffffffff9029cf1e, float:-3.348893E-29)
            X.C14030oh.A09(r0, r3)
            return
        L_0x00c0:
            java.lang.String r0 = "SAVED_STATE_COUNTRY_CODE"
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "SAVED_STATE_COUNTRY_DISPLAY_STRING"
            java.lang.String r1 = r14.getString(r0)
            java.lang.String r0 = "SAVED_STATE_COUNTRY"
            java.lang.String r0 = r14.getString(r0)
            if (r2 == 0) goto L_0x0074
            com.instagram.phonenumber.model.CountryCodeData r6 = new com.instagram.phonenumber.model.CountryCodeData
            r6.<init>(r2, r1, r0)
            goto L_0x0072
        L_0x00da:
            com.instagram.registration.model.RegFlowExtras r1 = new com.instagram.registration.model.RegFlowExtras
            r1.<init>()
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cj.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0405, code lost:
        if (r1.containsKey("caa_registration_redirection_to_native") == false) goto L_0x0407;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0437  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r41, android.view.ViewGroup r42, android.os.Bundle r43) {
        /*
            r40 = this;
            r0 = -1539541072(0xffffffffa43c77b0, float:-4.086738E-17)
            int r19 = X.C14030oh.A02(r0)
            r0 = 2131496674(0x7f0c0ee2, float:1.861692E38)
            r3 = r41
            r1 = r42
            android.view.View r5 = X.AnonymousClass0wJ.A0H(r3, r1, r0)
            com.instagram.registration.ui.NotificationBar r0 = X.C18240wQ.A0U(r5)
            r6 = r40
            r6.A0Z = r0
            r2 = 2131493452(0x7f0c024c, float:1.8610385E38)
            r0 = 2131299022(0x7f090ace, float:1.8216034E38)
            android.view.ViewGroup r1 = X.C18220wO.A0J(r5, r0)
            r0 = 1
            r3.inflate(r2, r1, r0)
            r0 = 2131298995(0x7f090ab3, float:1.8215979E38)
            android.view.View r8 = r5.requireViewById(r0)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            r0 = 2131493453(0x7f0c024d, float:1.8610387E38)
            r8.setLayoutResource(r0)
            android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            boolean r0 = r6.A07()
            if (r0 == 0) goto L_0x0471
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165215(0x7f07001f, float:1.794464E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x0052:
            int r3 = r7.leftMargin
            int r2 = r7.topMargin
            int r1 = r7.rightMargin
            r7.setMargins(r3, r2, r1, r0)
            r8.setLayoutParams(r7)
            r8.inflate()
            r0 = 2131302547(0x7f091893, float:1.8223183E38)
            android.view.View r9 = r5.requireViewById(r0)
            r0 = 2131305959(0x7f0925e7, float:1.8230104E38)
            android.view.View r8 = r5.requireViewById(r0)
            r0 = 2131305960(0x7f0925e8, float:1.8230106E38)
            android.view.View r15 = X.C18200wM.A0G(r5, r0)
            r0 = 2131300088(0x7f090ef8, float:1.8218196E38)
            android.view.View r0 = r15.findViewById(r0)
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            r6.A00 = r0
            r2 = 2131307864(0x7f092d58, float:1.8233967E38)
            android.widget.TextView r14 = X.AnonymousClass0wJ.A0L(r8, r2)
            r0 = 2131836520(0x7f113e68, float:1.930621E38)
            r14.setText(r0)
            r0 = 2131307862(0x7f092d56, float:1.8233963E38)
            r1 = 2131307862(0x7f092d56, float:1.8233963E38)
            android.view.View r28 = r8.findViewById(r0)
            r0 = 2131300086(0x7f090ef6, float:1.8218192E38)
            android.widget.ImageView r22 = X.C18220wO.A0K(r5, r0)
            r0 = 2131305961(0x7f0925e9, float:1.8230108E38)
            android.view.View r7 = r5.findViewById(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r7 = (com.instagram.ui.widget.progressbutton.ProgressButton) r7
            android.widget.AutoCompleteTextView r3 = r6.A00
            boolean r0 = X.C09860go.A0p(r3)
            if (r0 == 0) goto L_0x0455
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            java.lang.String r0 = r0.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0455
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            java.lang.String r0 = r0.A08
        L_0x00be:
            r3.setText(r0)
        L_0x00c1:
            X.0bf r10 = r6.A0M
            java.lang.Integer r4 = X.AnonymousClass006.A00
            X.1jv r0 = new X.1jv
            r0.<init>(r3, r10, r6, r7)
            r0.A03 = r4
            r6.A0K = r0
            X.0bf r10 = r6.A0M
            X.265 r18 = X.AnonymousClass265.A0d
            X.3Cp r0 = new X.3Cp
            r20 = r0
            r21 = r3
            r23 = r6
            r24 = r10
            r25 = r18
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A09 = r0
            X.1jv r0 = r6.A0K
            r6.registerLifecycleListener(r0)
            r0 = 2131302548(0x7f091894, float:1.8223185E38)
            android.view.View r17 = X.C18200wM.A0G(r5, r0)
            r3 = 2131304179(0x7f091ef3, float:1.8226493E38)
            r0 = r17
            android.view.View r0 = r0.requireViewById(r3)
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            r6.A01 = r0
            r10 = 2131304180(0x7f091ef4, float:1.8226495E38)
            r5.requireViewById(r10)
            android.widget.AutoCompleteTextView r0 = r6.A01
            r0.setDropDownAnchor(r10)
            r3 = 2131304178(0x7f091ef2, float:1.8226491E38)
            android.widget.ImageView r22 = X.C18220wO.A0K(r5, r3)
            android.widget.TextView r16 = X.AnonymousClass0wJ.A0L(r9, r2)
            r2 = 2131836521(0x7f113e69, float:1.9306211E38)
            r0 = r16
            r0.setText(r2)
            android.view.View r34 = r9.findViewById(r1)
            r0 = 2131302549(0x7f091895, float:1.8223187E38)
            android.view.View r2 = r5.findViewById(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r2 = (com.instagram.ui.widget.progressbutton.ProgressButton) r2
            r0 = 2131299157(0x7f090b55, float:1.8216307E38)
            android.widget.TextView r11 = X.AnonymousClass0wJ.A0L(r5, r0)
            r6.A02 = r11
            android.widget.AutoCompleteTextView r1 = r6.A01
            android.content.Context r0 = r6.getContext()
            boolean r0 = X.AnonymousClass0hB.A02(r0)
            if (r0 == 0) goto L_0x0142
            r0 = 8388629(0x800015, float:1.1754973E-38)
            r1.setGravity(r0)
        L_0x0142:
            boolean r0 = X.C09860go.A0p(r1)
            if (r0 == 0) goto L_0x0437
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            java.lang.String r0 = r0.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0437
            android.widget.AutoCompleteTextView r1 = r6.A01
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            java.lang.String r0 = r0.A0R
        L_0x0158:
            r1.setText(r0)
            com.instagram.phonenumber.model.CountryCodeData r0 = r6.A0H
            java.lang.String r0 = r0.A02()
            r11.setText(r0)
            com.instagram.phonenumber.model.CountryCodeData r0 = r6.A0H
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x016c
            java.lang.String r0 = ""
        L_0x016c:
            r11.setContentDescription(r0)
        L_0x016f:
            X.0bf r13 = r6.A0M
            android.widget.AutoCompleteTextView r12 = r6.A01
            java.lang.Integer r1 = X.AnonymousClass006.A01
            X.1jv r0 = new X.1jv
            r0.<init>(r12, r13, r6, r2)
            r0.A03 = r1
            r6.A0L = r0
            X.0bf r0 = r6.A0M
            r20 = r0
            X.265 r0 = X.AnonymousClass265.A1A
            android.widget.AutoCompleteTextView r12 = r6.A01
            r21 = r12
            com.instagram.phonenumber.model.CountryCodeData r13 = r6.A0H
            X.3GG r12 = new X.3GG
            r23 = r11
            r24 = r6
            r25 = r20
            r26 = r13
            r27 = r0
            r20 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r6.A0D = r12
            X.1jv r11 = r6.A0L
            r6.registerLifecycleListener(r11)
            r11 = 2131307842(0x7f092d42, float:1.8233923E38)
            android.view.View r11 = r5.findViewById(r11)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            X.0bf r12 = r6.A0M
            r24 = r12
            android.widget.AutoCompleteTextView r13 = r6.A00
            X.1jv r12 = r6.A0K
            X.3G6 r26 = new X.3G6
            r27 = r15
            r29 = r7
            r30 = r8
            r31 = r13
            r32 = r14
            r33 = r12
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            android.widget.AutoCompleteTextView r13 = r6.A01
            X.1jv r12 = r6.A0L
            X.3G6 r27 = new X.3G6
            r32 = r27
            r33 = r17
            r35 = r2
            r36 = r9
            r37 = r13
            r38 = r16
            r39 = r12
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            X.3Cp r14 = r6.A09
            X.3GG r13 = r6.A0D
            java.lang.Integer r12 = r6.A0P
            X.1jr r2 = new X.1jr
            r29 = r13
            r30 = r12
            r31 = r4
            r20 = r2
            r21 = r8
            r22 = r9
            r23 = r11
            r25 = r6
            r28 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r6.A0G = r2
            r6.registerLifecycleListener(r2)
            android.widget.AutoCompleteTextView r9 = r6.A00
            r2 = 2131300089(0x7f090ef9, float:1.8218198E38)
            android.view.View r8 = r5.findViewById(r2)
            r2 = r18
            r6.A01(r8, r9, r2)
            android.widget.AutoCompleteTextView r8 = r6.A01
            android.view.View r2 = r5.findViewById(r10)
            r6.A01(r2, r8, r0)
            r0 = 2131300091(0x7f090efb, float:1.8218202E38)
            android.view.View r0 = r5.findViewById(r0)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = (com.instagram.ui.widget.inlineerror.InlineErrorMessageView) r0
            r6.A0N = r0
            r0 = 2131304184(0x7f091ef8, float:1.8226503E38)
            android.view.View r0 = r5.findViewById(r0)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = (com.instagram.ui.widget.inlineerror.InlineErrorMessageView) r0
            r6.A0O = r0
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView.A03(r11)
            android.widget.AutoCompleteTextView r2 = r6.A01
            X.3mQ r0 = r6.A0b
            r2.addTextChangedListener(r0)
            android.widget.AutoCompleteTextView r2 = r6.A00
            X.3mQ r0 = r6.A0a
            r2.addTextChangedListener(r0)
            r0 = 2131307249(0x7f092af1, float:1.823272E38)
            android.widget.TextView r10 = X.C18180wK.A0G(r5, r0)
            r6.A04 = r10
            r9 = 2131306622(0x7f09287e, float:1.8231448E38)
            android.view.View r2 = r5.findViewById(r9)
            android.widget.ScrollView r2 = (android.widget.ScrollView) r2
            r8 = 0
            X.3CP r0 = new X.3CP
            r0.<init>(r10, r2, r8)
            r6.A0C = r0
            android.view.View r10 = r5.findViewById(r9)
            android.widget.ScrollView r10 = (android.widget.ScrollView) r10
            android.content.Context r11 = r6.getContext()
            android.content.res.Resources$Theme r2 = r11.getTheme()
            r0 = 2130970687(0x7f04083f, float:1.7550091E38)
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r0)
            android.content.res.Resources r2 = r11.getResources()
            r0 = 2131165211(0x7f07001b, float:1.7944633E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r0 = r9.getDimensionPixelSize(r8, r0)
            r9.recycle()
            int r2 = r0 << 1
            X.3CP r0 = new X.3CP
            r0.<init>(r7, r10, r2)
            r6.A0B = r0
            X.0bf r7 = r6.A0M
            android.widget.AutoCompleteTextView r2 = r6.A01
            X.3Ft r0 = new X.3Ft
            r0.<init>(r2, r6, r7, r4)
            r6.A0F = r0
            X.0bf r7 = r6.A0M
            android.widget.AutoCompleteTextView r2 = r6.A00
            X.3Ft r0 = new X.3Ft
            r0.<init>(r2, r6, r7, r1)
            r6.A0E = r0
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            boolean r0 = r0.A0s
            if (r0 == 0) goto L_0x02bc
            android.widget.AutoCompleteTextView r0 = r6.A01
            boolean r0 = X.C09860go.A0p(r0)
            if (r0 == 0) goto L_0x02bc
            android.widget.AutoCompleteTextView r0 = r6.A00
            boolean r0 = X.C09860go.A0p(r0)
            if (r0 != 0) goto L_0x02bc
            X.1jr r2 = r6.A0G
            X.0bf r0 = r6.A0M
            r2.A00(r0, r4, r1)
        L_0x02bc:
            boolean r0 = r6.A07()
            if (r0 == 0) goto L_0x0393
            r0 = 2131300358(0x7f091006, float:1.8218743E38)
            android.view.View r9 = X.C18200wM.A0G(r5, r0)
            r0 = 2131302804(0x7f091994, float:1.8223704E38)
            android.view.View r1 = r9.requireViewById(r0)
            com.instagram.common.ui.base.IgFrameLayout r1 = (com.instagram.common.ui.base.IgFrameLayout) r1
            r6.A05 = r1
            r0 = 604(0x25c, float:8.46E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r6)
            com.instagram.common.ui.base.IgFrameLayout r0 = r6.A05
            android.view.ViewGroup$LayoutParams r7 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7
            int r4 = r7.leftMargin
            android.content.Context r0 = r5.getContext()
            int r2 = X.C18210wN.A02(r0)
            int r1 = r7.rightMargin
            int r0 = r7.bottomMargin
            r7.setMargins(r4, r2, r1, r0)
            com.instagram.common.ui.base.IgFrameLayout r0 = r6.A05
            r0.setLayoutParams(r7)
            r0 = 2131302803(0x7f091993, float:1.8223702E38)
            android.widget.TextView r1 = X.C18180wK.A0G(r9, r0)
            r6.A03 = r1
            if (r1 == 0) goto L_0x0324
            r0 = 2131232602(0x7f08075a, float:1.8081318E38)
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r8, r8, r8)
            android.widget.TextView r1 = r6.A03
            r0 = 2131100091(0x7f0601bb, float:1.7812554E38)
            X.C63163fI.A03(r1, r0)
            android.widget.TextView r2 = r6.A03
            android.content.Context r1 = r6.getContext()
            r0 = 2131100092(0x7f0601bc, float:1.7812556E38)
            X.C18180wK.A0s(r1, r2, r0)
            android.widget.TextView r1 = r6.A03
            r0 = 2131099961(0x7f060139, float:1.781229E38)
            X.C63163fI.A03(r1, r0)
        L_0x0324:
            com.instagram.common.ui.base.IgFrameLayout r1 = r6.A05
            r0 = 2131231149(0x7f0801ad, float:1.807837E38)
            r1.setBackgroundResource(r0)
            android.widget.TextView r0 = r6.A03
            if (r0 == 0) goto L_0x0417
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r6.A06
            X.0Oa r0 = r0.A00
            java.lang.Object r0 = X.C18180wK.A0d(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0417
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r6.A06
            X.0Oa r0 = r0.A00
            java.lang.Object r1 = X.C18180wK.A0d(r0)
            java.lang.String r1 = (java.lang.String) r1
            android.widget.TextView r0 = r6.A03
            if (r0 == 0) goto L_0x0353
            if (r1 == 0) goto L_0x0353
            r0.setText(r1)
        L_0x0353:
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r6.A06
            X.0Oa r0 = r0.A00
            X.M5J r1 = X.C18230wP.A0J(r0)
            r0 = 35
            X.C18210wN.A16(r6, r1, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r6.A06
            X.0Oa r0 = r0.A02
            X.M5J r1 = X.C18230wP.A0J(r0)
            r0 = 36
            X.C18210wN.A16(r6, r1, r0)
            X.0bf r4 = r6.A0M
            X.265 r2 = r6.BDt()
            r1 = 0
            X.1jn r0 = new X.1jn
            r0.<init>(r4, r1, r2)
            r6.A08 = r0
            r6.registerLifecycleListener(r0)
            X.0bf r4 = r6.A0M
            java.lang.String r2 = "continue_with_fb_button_shown"
            X.265 r1 = r6.BDt()
            X.25r r0 = r6.Aiy()
            X.3Vg r1 = X.C63313hF.A03(r4, r0, r1, r2)
            boolean r0 = r6.A0U
            X.C61763Vg.A00(r1, r0)
        L_0x0393:
            android.widget.ImageView r0 = X.C18220wO.A0K(r5, r3)
            r1 = 2131100004(0x7f060164, float:1.7812377E38)
            X.C63163fI.A02(r0, r1)
            r0 = 2131300086(0x7f090ef6, float:1.8218192E38)
            android.widget.ImageView r0 = X.C18220wO.A0K(r5, r0)
            X.C63163fI.A02(r0, r1)
            boolean r0 = r6.A0T
            if (r0 == 0) goto L_0x03dc
            r0 = 2131308350(0x7f092f3e, float:1.8234953E38)
            int r1 = X.C18230wP.A03(r5, r0)
            r0 = 2131301919(0x7f09161f, float:1.822191E38)
            X.C18190wL.A18(r5, r0, r1)
            r0 = 2131305744(0x7f092510, float:1.8229667E38)
            X.C18190wL.A18(r5, r0, r1)
            r0 = 2131308214(0x7f092eb6, float:1.8234677E38)
            X.C18190wL.A18(r5, r0, r8)
        L_0x03c4:
            X.C691847d.A02(r6)
            r0 = 2131309174(0x7f093276, float:1.8236624E38)
            X.Ayd r0 = X.C18190wL.A0U(r5, r0)
            r6.A0Y = r0
            A03(r6)
            r1 = -741232825(0xffffffffd3d1af47, float:-1.80117766E12)
            r0 = r19
            X.C14030oh.A09(r1, r0)
            return r5
        L_0x03dc:
            r0 = 2131301919(0x7f09161f, float:1.822191E38)
            android.widget.ImageView r1 = X.C18220wO.A0K(r5, r0)
            android.content.Context r0 = r6.getContext()
            X.C63163fI.A00(r0, r1)
            X.0bf r2 = r6.A0M
            X.265 r9 = r6.BDt()
            X.25r r8 = r6.Aiy()
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            android.os.Bundle r1 = X.C18190wL.A0C(r0)
            if (r1 == 0) goto L_0x0407
            java.lang.String r0 = "caa_registration_redirection_to_native"
            boolean r0 = r1.containsKey(r0)
            r10 = 1
            if (r0 != 0) goto L_0x0408
        L_0x0407:
            r10 = 0
        L_0x0408:
            r7 = r2
            X.C63553hn.A05(r5, r6, r7, r8, r9, r10)
            r0 = 2131302795(0x7f09198b, float:1.8223686E38)
            android.widget.TextView r0 = X.C18180wK.A0G(r5, r0)
            X.AnonymousClass3X6.A00(r0)
            goto L_0x03c4
        L_0x0417:
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r6.A06
            X.0Oa r0 = r0.A01
            java.lang.Object r1 = X.C18180wK.A0d(r0)
            java.lang.String r1 = (java.lang.String) r1
            android.widget.TextView r0 = r6.A03
            if (r0 == 0) goto L_0x042a
            if (r1 == 0) goto L_0x042a
            r0.setText(r1)
        L_0x042a:
            X.1jz r2 = r6.A0A
            X.265 r1 = r6.BDt()
            android.widget.TextView r0 = r6.A03
            r2.A09(r0, r6, r1)
            goto L_0x0353
        L_0x0437:
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            boolean r0 = r0.A0s
            if (r0 == 0) goto L_0x016f
            boolean r0 = X.C09860go.A0p(r1)
            if (r0 == 0) goto L_0x016f
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            java.lang.String r0 = r0.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x016f
            android.widget.AutoCompleteTextView r1 = r6.A01
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            java.lang.String r0 = r0.A0L
            goto L_0x0158
        L_0x0455:
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            boolean r0 = r0.A0s
            if (r0 == 0) goto L_0x00c1
            boolean r0 = X.C09860go.A0p(r3)
            if (r0 == 0) goto L_0x00c1
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            java.lang.String r0 = r0.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c1
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0I
            java.lang.String r0 = r0.A0I
            goto L_0x00be
        L_0x0471:
            android.content.Context r4 = r6.getContext()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r0 = 2130970687(0x7f04083f, float:1.7550091E38)
            r3 = 0
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165211(0x7f07001b, float:1.7944633E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r0 = r2.getDimensionPixelSize(r3, r0)
            r2.recycle()
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cj.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(30449988);
        super.onDestroy();
        this.A0H = null;
        C14030oh.A09(1622570584, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1720614173);
        super.onDestroyView();
        this.A01.removeTextChangedListener(this.A0b);
        this.A00.removeTextChangedListener(this.A0a);
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A0Z = null;
        this.A0N = null;
        this.A0O = null;
        this.A0Y = null;
        this.A02 = null;
        this.A0P = this.A0G.A01;
        this.A0H = this.A0D.A00.A04;
        unregisterLifecycleListener(this.A0K);
        unregisterLifecycleListener(this.A0L);
        unregisterLifecycleListener(this.A0G);
        C691847d.A03(this);
        this.A07 = null;
        this.A0K = null;
        this.A0L = null;
        this.A09 = null;
        this.A0D = null;
        this.A0G = null;
        this.A0C = null;
        this.A0B = null;
        C24661jn r0 = this.A08;
        if (r0 != null) {
            unregisterLifecycleListener(r0);
            this.A08 = null;
        }
        if (A07()) {
            C38040KHr kHr = C38040KHr.A01;
            kHr.A04(this.A0c, AnonymousClass45A.class);
            kHr.A04(this.A0d, AnonymousClass45B.class);
        }
        C14030oh.A09(760239670, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(87679452);
        super.onPause();
        C18180wK.A0F(this).setSoftInputMode(0);
        C14030oh.A09(17256810, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1334507447);
        super.onResume();
        C67363zQ.A0E(this.A0M, false, false, true);
        C18180wK.A15(this);
        C14030oh.A09(-2007473635, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CountryCodeData countryCodeData = this.A0H;
        if (countryCodeData != null) {
            bundle.putString("SAVED_STATE_COUNTRY_CODE", countryCodeData.A01);
            bundle.putString("SAVED_STATE_COUNTRY_DISPLAY_STRING", this.A0H.A02);
            bundle.putString("SAVED_STATE_COUNTRY", this.A0H.A00);
        }
    }

    public final void onStart() {
        int A022 = C14030oh.A02(349025558);
        super.onStart();
        C63103bV.A03.A05(getActivity());
        AnonymousClass3CP r0 = this.A0C;
        if (r0 != null) {
            r0.A00.CLs(getActivity());
        }
        AnonymousClass3CP r02 = this.A0B;
        if (r02 != null) {
            r02.A00.CLs(getActivity());
        }
        this.A0X.A7q(this);
        C14030oh.A09(-1098225434, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-878396686);
        super.onStop();
        AnonymousClass3CP r0 = this.A0C;
        if (r0 != null) {
            r0.A00.onStop();
        }
        AnonymousClass3CP r02 = this.A0B;
        if (r02 != null) {
            r02.A00.onStop();
        }
        this.A0X.CcW(this);
        C14030oh.A09(1284081149, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        super.onViewCreated(view, bundle);
        C07530bf r1 = this.A0M;
        String str = BDt().A01;
        C313625r Aiy = Aiy();
        if (A08(this)) {
            num = AnonymousClass006.A01;
        } else {
            num = AnonymousClass006.A00;
        }
        AnonymousClass0wJ.A1N(r1, str);
        AnonymousClass3YT.A00(r1, (AnonymousClass3V1) null, Aiy, num, str, (String) null);
        if (A07()) {
            C38040KHr.A01.A03(this.A0c, AnonymousClass45A.class);
        }
        C38040KHr.A01.A03(this.A0d, AnonymousClass45B.class);
    }
}
