package X;

import android.os.Handler;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxCListenerShape345S0100000_1_I2;
import com.facebook.redex.IDxEListenerShape711S0100000_1_I2;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;

/* renamed from: X.1cl  reason: invalid class name */
public final class AnonymousClass1cl extends C34640IcN implements C82424pb, AnonymousClass4tS, C82824qK, C10390iG, C84364t1, C82804qI, CallerContextable {
    public static final String __redex_internal_original_name = "UsernameSignUpFragment";
    public AnonymousClass3GA A00;
    public C58583Gi A01;
    public C61643Ur A02;
    public RegFlowExtras A03;
    public NotificationBar A04;
    public C07530bf A05;
    public InlineErrorMessageView A06;
    public ProgressButton A07;
    public SearchEditText A08;
    public ImageView A09;
    public C691246v A0A;
    public C691346w A0B;
    public C691446x A0C;
    public AnonymousClass3Ft A0D;
    public C24721jv A0E;
    public final Handler A0F = C18250wR.A08();
    public final Runnable A0G = new AnonymousClass4PZ(this);
    public final TextWatcher A0H = new IDxWAdapterShape193S0100000_1_I2(this, 13);
    public final View.OnFocusChangeListener A0I = new IDxCListenerShape345S0100000_1_I2(this, 14);
    public final C82394pY A0J = C18220wO.A0P(this, 57);

    public final void CDH(boolean z) {
    }

    public final void Csx(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C07530bf r7 = this.A05;
            C36482Rm.A00(activity, this.A0F, this, this, this.A03, this.A0E, r7, AnonymousClass2AT.A0F.A00, str, str2, A00());
        }
    }

    private String A00() {
        RegFlowExtras regFlowExtras = this.A03;
        List list = regFlowExtras.A0f;
        if (list == null) {
            list = AnonymousClass0wJ.A0v();
            regFlowExtras.A0f = list;
        }
        if (!list.isEmpty()) {
            return ((C569038z) list.get(0)).A01;
        }
        List list2 = this.A03.A0e;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        return C18190wL.A0p(list2, 0);
    }

    public static void A01(AnonymousClass1cl r2) {
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
        return AnonymousClass2AT.A0F.A00;
    }

    public final boolean BXY() {
        return C18210wN.A1U(C18180wK.A0f(this.A08));
    }

    public final void C9G() {
        String A0f = C18180wK.A0f(this.A08);
        Handler handler = this.A0F;
        handler.removeCallbacks(this.A0G);
        FragmentActivity activity = getActivity();
        if (activity instanceof C84654td) {
            C67133yv A0R = AnonymousClass0wJ.A0R((C84654td) activity);
            C07530bf r5 = this.A05;
            RegFlowExtras regFlowExtras = this.A03;
            C313625r A012 = regFlowExtras.A01();
            String str = A0R.A0B;
            BusinessInfo businessInfo = A0R.A06;
            String A032 = C67353zP.A03(getActivity());
            if (A012 != C313625r.A03) {
                handler.post(new AnonymousClass4TG(handler, this, r5, businessInfo, this, regFlowExtras, A012, A0f, str, A032));
                return;
            }
            return;
        }
        C07530bf r13 = this.A05;
        C67283zI.A02(handler, this, this, this, this, this.A03, this.A0E, r13, AnonymousClass2AT.A0F.A00, A0f, A00(), false);
    }

    public final void CSe() {
        this.A07.setShowProgressBar(false);
        this.A01.A01();
    }

    public final void CSf(String str, Integer num) {
        this.A07.setShowProgressBar(false);
        this.A01.A00();
        Cth(str, num);
    }

    public final void CSg() {
        this.A07.setShowProgressBar(true);
    }

    public final void CSh(String str, List list) {
        this.A07.setEnabled(false);
        this.A07.setShowProgressBar(false);
        this.A01.A00();
        Cth(str, AnonymousClass006.A01);
        this.A00.A00(getRootActivity(), list);
    }

    public final void Cth(String str, Integer num) {
        if (num == AnonymousClass006.A01) {
            this.A06.A05(str);
            this.A04.A02();
            return;
        }
        C63553hn.A08(this.A04, str);
    }

    public final String getModuleName() {
        return "username_sign_up";
    }

    public final C10300i6 getSession() {
        return this.A05;
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(-894030057);
        RegFlowExtras regFlowExtras = this.A03;
        if (regFlowExtras.A01() != C313625r.A03) {
            AnonymousClass2AT.A00(this, AnonymousClass2AT.A0F, regFlowExtras).A02(this.A05, this.A03);
        }
        C14030oh.A0A(1564278586, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(189312541, C14030oh.A03(-1925054154));
    }

    public final boolean onBackPressed() {
        if (!C18190wL.A1X(C18200wM.A0C(), "has_user_confirmed_dialog")) {
            C07530bf r3 = this.A05;
            AnonymousClass265 r5 = AnonymousClass2AT.A0F.A00;
            AnonymousClass2S0.A00(this, new IDxEListenerShape711S0100000_1_I2(this, 3), r3, this.A03.A01(), r5, (Integer) null);
            return true;
        }
        A01(this);
        C07530bf r32 = this.A05;
        String str = AnonymousClass2AT.A0F.A00.A01;
        C313625r A012 = this.A03.A01();
        AnonymousClass0wJ.A1N(r32, str);
        C62223Xv.A00(r32, A012, (Boolean) null, (Integer) null, str);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005a, code lost:
        if (X.C62433Zv.A02(com.facebook.common.callercontext.CallerContext.A00(X.AnonymousClass1cl.class), r6, "ig_username_signup") == false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = -2144896352(0xffffffff80277aa0, float:-3.625574E-39)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r13)
            X.0bf r0 = X.C18210wN.A0N(r12)
            r12.A05 = r0
            com.instagram.registration.model.RegFlowExtras r0 = X.C18210wN.A0M(r12)
            r12.A03 = r0
            r0.getClass()
            X.25r r2 = X.C313625r.A03
            r0.A03(r2)
            java.lang.String r0 = r0.A08
            boolean r0 = X.C18210wN.A1U(r0)
            com.instagram.registration.model.RegFlowExtras r1 = r12.A03
            if (r0 == 0) goto L_0x0078
            X.25r r0 = X.C313625r.EMAIL
        L_0x002a:
            r1.A03(r0)
        L_0x002d:
            android.content.Context r1 = r12.getContext()
            X.0bf r0 = r12.A05
            X.C59733Mc.A01(r1, r0)
            com.instagram.registration.model.RegFlowExtras r0 = r12.A03
            X.25r r0 = r0.A01()
            boolean r0 = X.C18180wK.A1Z(r0, r2)
            X.3hW r4 = X.C63463hW.A02()
            android.content.Context r5 = r12.getContext()
            X.0bf r6 = r12.A05
            r8 = 0
            if (r0 == 0) goto L_0x005c
            java.lang.Class<X.1cl> r0 = X.AnonymousClass1cl.class
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r0)
            java.lang.String r0 = "ig_username_signup"
            boolean r0 = X.C62433Zv.A02(r1, r6, r0)
            r9 = 1
            if (r0 != 0) goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            com.instagram.registration.model.RegFlowExtras r0 = r12.A03
            X.25r r7 = r0.A01()
            r10 = r8
            r11 = r8
            r4.A07(r5, r6, r7, r8, r9, r10, r11)
            X.KHr r2 = X.C38040KHr.A01
            java.lang.Class<X.45N> r1 = X.AnonymousClass45N.class
            X.4pY r0 = r12.A0J
            r2.A03(r0, r1)
            r0 = 283832225(0x10eaefa1, float:9.266593E-29)
            X.C14030oh.A09(r0, r3)
            return
        L_0x0078:
            java.lang.String r0 = r1.A0Q
            boolean r0 = X.C18210wN.A1U(r0)
            if (r0 == 0) goto L_0x002d
            com.instagram.registration.model.RegFlowExtras r1 = r12.A03
            X.25r r0 = X.C313625r.PHONE
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cl.onCreate(android.os.Bundle):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: X.46w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: X.46x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: X.46w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: X.46w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
            r20 = this;
            r0 = -1392272738(0xffffffffad039a9e, float:-7.48082E-12)
            int r2 = X.C14030oh.A02(r0)
            r0 = 2131496674(0x7f0c0ee2, float:1.861692E38)
            r3 = r21
            r1 = r22
            android.view.View r13 = X.AnonymousClass0wJ.A0H(r3, r1, r0)
            android.view.ViewGroup r1 = X.C18190wL.A0E(r13)
            r0 = 2131496690(0x7f0c0ef2, float:1.8616952E38)
            r5 = 1
            r3.inflate(r0, r1, r5)
            r0 = 2131300543(0x7f0910bf, float:1.8219119E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r13, r0)
            r0 = 2131824575(0x7f110fbf, float:1.9281982E38)
            r1.setText(r0)
            r0 = 2131300539(0x7f0910bb, float:1.821911E38)
            android.widget.TextView r4 = X.AnonymousClass0wJ.A0L(r13, r0)
            r0 = r20
            java.lang.String r3 = r0.A00()
            r1 = 2131824576(0x7f110fc0, float:1.9281984E38)
            if (r3 != 0) goto L_0x003f
            r1 = 2131824577(0x7f110fc1, float:1.9281986E38)
        L_0x003f:
            r4.setText(r1)
            com.instagram.registration.ui.NotificationBar r1 = X.C18240wQ.A0U(r13)
            r0.A04 = r1
            r1 = 2131308781(0x7f0930ed, float:1.8235827E38)
            android.view.View r1 = r13.requireViewById(r1)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            r0.A08 = r1
            r1 = 2131308803(0x7f093103, float:1.8235872E38)
            android.view.View r14 = r13.findViewById(r1)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0.A09 = r14
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            X.0bf r3 = r0.A05
            com.instagram.registration.model.RegFlowExtras r15 = r0.A03
            X.25r r18 = r15.A01()
            X.2AT r1 = X.AnonymousClass2AT.A0F
            X.265 r1 = r1.A00
            X.3GA r12 = new X.3GA
            r17 = r4
            r19 = r1
            r16 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.A00 = r12
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            android.view.View$OnFocusChangeListener r3 = r0.A0I
            r4.setOnFocusChangeListener(r3)
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = r0.A08
            r3.setAllowTextSelection(r5)
            r3 = 2131308791(0x7f0930f7, float:1.8235848E38)
            android.view.View r3 = r13.findViewById(r3)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r3 = (com.instagram.ui.widget.inlineerror.InlineErrorMessageView) r3
            r0.A06 = r3
            r3 = 2131308792(0x7f0930f8, float:1.823585E38)
            android.view.ViewGroup r3 = X.C18240wQ.A0G(r13, r3)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView.A03(r3)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            android.text.TextWatcher r3 = r0.A0H
            r4.addTextChangedListener(r3)
            com.instagram.ui.widget.searchedittext.SearchEditText r7 = r0.A08
            r11 = 0
            android.content.Context r3 = r0.getContext()
            X.1w5 r6 = new X.1w5
            r6.<init>(r3, r0)
            r4 = 30
            android.text.InputFilter$LengthFilter r3 = new android.text.InputFilter$LengthFilter
            r3.<init>(r4)
            android.text.InputFilter[] r3 = new android.text.InputFilter[]{r6, r3}
            r7.setFilters(r3)
            com.instagram.ui.widget.progressbutton.ProgressButton r7 = X.C18230wP.A0c(r13)
            r0.A07 = r7
            X.0bf r6 = r0.A05
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            X.1jv r3 = new X.1jv
            r3.<init>(r4, r6, r0, r7)
            r0.A0E = r3
            r0.registerLifecycleListener(r3)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            X.0bf r3 = r0.A05
            android.content.Context r15 = r0.getContext()
            X.06E r16 = X.AnonymousClass06E.A00(r0)
            X.3Ur r14 = new X.3Ur
            r17 = r3
            r18 = r0
            r19 = r4
            r14.<init>((android.content.Context) r15, (X.AnonymousClass06E) r16, (X.C10300i6) r17, (X.C84364t1) r18, (com.instagram.ui.widget.searchedittext.SearchEditText) r19)
            r0.A02 = r14
            android.widget.ImageView r4 = r0.A09
            X.3Gi r3 = new X.3Gi
            r3.<init>(r4)
            r0.A01 = r3
            X.0bf r7 = r0.A05
            java.lang.Integer r6 = X.AnonymousClass006.A0Y
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            X.3Ft r3 = new X.3Ft
            r3.<init>(r4, r0, r7, r6)
            r0.A0D = r3
            java.lang.String r7 = r0.A00()
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = r0.A08
            boolean r3 = X.C09860go.A0p(r3)
            if (r3 == 0) goto L_0x0148
            if (r7 == 0) goto L_0x0148
            X.0bf r4 = r0.A05
            com.instagram.registration.model.RegFlowExtras r3 = r0.A03
            X.25r r3 = r3.A01()
            X.C54292zD.A00(r4, r3, r1, r7)
            X.0bf r6 = r0.A05
            java.lang.String r4 = r1.A01
            com.instagram.registration.model.RegFlowExtras r3 = r0.A03
            X.25r r3 = r3.A01()
            X.C04220Ms.A0B(r6, r11)
            X.C04220Ms.A0B(r4, r5)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C54242z8.A00(r6, r3, r4)
            r3.Bb4()
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = r0.A08
            r3.setText(r7)
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r0.A08
            int r3 = r7.length()
            r4.setSelection(r3)
            X.3Gi r3 = r0.A01
            r3.A01()
            android.os.Handler r4 = r0.A0F
            java.lang.Runnable r3 = r0.A0G
            r4.removeCallbacks(r3)
        L_0x0148:
            X.3Ft r3 = r0.A0D
            r3.A04 = r5
            com.instagram.registration.model.RegFlowExtras r5 = r0.A03
            X.25r r4 = r5.A01()
            X.25r r3 = X.C313625r.PHONE
            if (r4 != r3) goto L_0x01c2
            X.KHr r5 = X.C38040KHr.A01
            java.lang.Class<X.45S> r4 = X.AnonymousClass45S.class
            X.46x r3 = new X.46x
            r3.<init>(r0)
            r0.A0C = r3
        L_0x0161:
            r5.A03(r3, r4)
        L_0x0164:
            X.KHr r5 = X.C38040KHr.A01
            java.lang.Class<X.45Q> r4 = X.AnonymousClass45Q.class
            X.46v r3 = new X.46v
            r3.<init>(r0)
            r0.A0A = r3
            r5.A03(r3, r4)
            r3 = 2131304602(0x7f09209a, float:1.8227351E38)
            android.widget.TextView r5 = X.C18180wK.A0G(r13, r3)
            com.instagram.registration.model.RegFlowExtras r3 = r0.A03
            java.lang.String r4 = r3.A0X
            java.lang.String r3 = "kr"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x01a9
            android.content.Context r4 = r0.getContext()
            X.0bf r6 = r0.A05
            com.instagram.registration.model.RegFlowExtras r3 = r0.A03
            java.lang.String r8 = r3.A0X
            X.25r r7 = r3.A01()
            r9 = 0
            r10 = r9
            r12 = r11
            X.C63553hn.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r3 = 2131299001(0x7f090ab9, float:1.8215991E38)
            android.widget.TextView r5 = X.AnonymousClass0wJ.A0L(r13, r3)
            android.content.Context r4 = r0.requireContext()
            X.0bf r3 = r0.A05
            X.C63553hn.A02(r4, r5, r3)
        L_0x01a9:
            X.C691847d.A02(r0)
            X.3YT r4 = X.AnonymousClass3YT.A00
            X.0bf r3 = r0.A05
            java.lang.String r1 = r1.A01
            com.instagram.registration.model.RegFlowExtras r0 = r0.A03
            X.25r r0 = r0.A01()
            r4.A01(r3, r0, r1)
            r0 = -2001029771(0xffffffff88bab575, float:-1.1237128E-33)
            X.C14030oh.A09(r0, r2)
            return r13
        L_0x01c2:
            X.25r r4 = r5.A01()
            X.25r r3 = X.C313625r.EMAIL
            if (r4 != r3) goto L_0x0164
            X.KHr r5 = X.C38040KHr.A01
            java.lang.Class<X.45K> r4 = X.AnonymousClass45K.class
            X.46w r3 = new X.46w
            r3.<init>(r0)
            r0.A0B = r3
            goto L_0x0161
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cl.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1824451168);
        super.onDestroy();
        C38040KHr.A01.A04(this.A0J, AnonymousClass45N.class);
        C14030oh.A09(1798676529, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1031220482);
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
        this.A09 = null;
        this.A07 = null;
        C691446x r2 = this.A0C;
        if (r2 != null) {
            C38040KHr.A01.A04(r2, AnonymousClass45S.class);
            this.A0C = null;
        }
        C691346w r22 = this.A0B;
        if (r22 != null) {
            C38040KHr.A01.A04(r22, AnonymousClass45K.class);
            this.A0B = null;
        }
        C691246v r23 = this.A0A;
        if (r23 != null) {
            C38040KHr.A01.A04(r23, AnonymousClass45Q.class);
            this.A0A = null;
        }
        C14030oh.A09(533743747, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(2134887420);
        super.onPause();
        C09860go.A0I(this.A08);
        this.A04.A03();
        this.A0F.removeCallbacksAndMessages((Object) null);
        C18180wK.A0F(this).setSoftInputMode(0);
        C14030oh.A09(-1629268665, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(717935462);
        super.onResume();
        C63553hn.A06(this.A08);
        C18180wK.A15(this);
        C14030oh.A09(1617406560, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-2039613888);
        super.onStart();
        C14030oh.A09(-1824514499, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-742948969);
        super.onStop();
        C14030oh.A09(1507949634, A022);
    }
}
