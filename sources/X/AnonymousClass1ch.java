package X;

import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxEListenerShape711S0100000_1_I2;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;

/* renamed from: X.1ch  reason: invalid class name */
public final class AnonymousClass1ch extends C34640IcN implements C82424pb, AnonymousClass4tS, C82824qK, C10390iG, C82804qI, CallerContextable {
    public static final String __redex_internal_original_name = "UsernameSuggestionSignUpFragment";
    public RegFlowExtras A00;
    public C07530bf A01;
    public String A02;
    public String A03;
    public C691546y A04;
    public C691646z A05;
    public AnonymousClass470 A06;
    public NotificationBar A07;
    public C24721jv A08;
    public final Handler A09 = C18250wR.A08();
    public final C82394pY A0A = C18220wO.A0P(this, 58);

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final boolean BXY() {
        return true;
    }

    public final void Csx(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C07530bf r7 = this.A01;
            C36482Rm.A00(activity, this.A09, this, this, this.A00, this.A08, r7, AnonymousClass2AT.A06.A00, str, str2, this.A03);
        }
    }

    public final C313625r Aiy() {
        return this.A00.A01();
    }

    public final AnonymousClass265 BDt() {
        return AnonymousClass2AT.A06.A00;
    }

    public final void C9G() {
        String str;
        if (!TextUtils.isEmpty(this.A02)) {
            C07530bf r4 = this.A01;
            AnonymousClass265 r3 = AnonymousClass2AT.A06.A00;
            String str2 = this.A02;
            RegFlowExtras regFlowExtras = this.A00;
            if (regFlowExtras.A01() != null) {
                str = regFlowExtras.A01().A00;
            } else {
                str = "";
            }
            C54322zG.A00(r4, r3, str2, str);
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof C84654td) {
            C67133yv A0R = AnonymousClass0wJ.A0R((C84654td) activity);
            C07530bf r6 = this.A01;
            String str3 = this.A03;
            RegFlowExtras regFlowExtras2 = this.A00;
            Handler handler = this.A09;
            C313625r A012 = regFlowExtras2.A01();
            String str4 = A0R.A0B;
            BusinessInfo businessInfo = A0R.A06;
            String A032 = C67353zP.A03(getActivity());
            if (A012 != C313625r.A03) {
                handler.post(new AnonymousClass4TG(handler, this, r6, businessInfo, this, regFlowExtras2, A012, str3, str4, A032));
                return;
            }
            return;
        }
        AnonymousClass01V.A0p.markerStart(4197923);
        C07530bf r11 = this.A01;
        String str5 = this.A03;
        C67283zI.A02(this.A09, this, this, this, this, this.A00, this.A08, r11, AnonymousClass2AT.A06.A00, str5, str5, false);
    }

    public final String getModuleName() {
        return "username_sign_up";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void Cth(String str, Integer num) {
        if (isVisible()) {
            C63553hn.A08(this.A07, str);
        }
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(-2108922303);
        RegFlowExtras regFlowExtras = this.A00;
        if (regFlowExtras.A01() != C313625r.A03) {
            AnonymousClass2AT.A00(this, AnonymousClass2AT.A06, regFlowExtras).A02(this.A01, this.A00);
        }
        C14030oh.A0A(888421431, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(-1580729831, C14030oh.A03(1652542070));
    }

    public final boolean onBackPressed() {
        if (!C18190wL.A1X(C18200wM.A0C(), "has_user_confirmed_dialog")) {
            C07530bf r3 = this.A01;
            AnonymousClass265 r5 = AnonymousClass2AT.A06.A00;
            AnonymousClass2S0.A00(this, new IDxEListenerShape711S0100000_1_I2(this, 4), r3, this.A00.A01(), r5, (Integer) null);
            return true;
        }
        C07530bf r32 = this.A01;
        String str = AnonymousClass2AT.A06.A00.A01;
        C313625r A012 = this.A00.A01();
        AnonymousClass0wJ.A1N(r32, str);
        C62223Xv.A00(r32, A012, (Boolean) null, (Integer) null, str);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
        if (X.C62433Zv.A02(com.facebook.common.callercontext.CallerContext.A00(X.AnonymousClass1ch.class), r5, "ig_username_suggestion_sign_up") == false) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -1771236737(0xffffffff966d127f, float:-1.9150544E-25)
            int r2 = X.C14030oh.A02(r0)
            super.onCreate(r12)
            X.0bf r0 = X.C18210wN.A0N(r11)
            r11.A01 = r0
            com.instagram.registration.model.RegFlowExtras r0 = X.C18210wN.A0M(r11)
            r11.A00 = r0
            r0.getClass()
            X.25r r4 = X.C313625r.A03
            r0.A03(r4)
            java.lang.String r0 = r0.A08
            boolean r0 = X.C18210wN.A1U(r0)
            com.instagram.registration.model.RegFlowExtras r1 = r11.A00
            if (r0 == 0) goto L_0x00c6
            X.25r r0 = X.C313625r.EMAIL
        L_0x002a:
            r1.A03(r0)
        L_0x002d:
            android.content.Context r1 = r11.getContext()
            X.0bf r0 = r11.A01
            X.C59733Mc.A01(r1, r0)
            com.instagram.registration.model.RegFlowExtras r0 = r11.A00
            java.lang.String r0 = r0.A0Z
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r5 = 0
            com.instagram.registration.model.RegFlowExtras r0 = r11.A00
            if (r1 != 0) goto L_0x008b
            java.lang.String r0 = r0.A0Z
            r11.A03 = r0
            r11.A02 = r5
        L_0x0049:
            com.instagram.registration.model.RegFlowExtras r0 = r11.A00
            X.25r r0 = r0.A01()
            boolean r0 = X.C18180wK.A1Z(r0, r4)
            X.3hW r3 = X.C63463hW.A02()
            android.content.Context r4 = r11.getContext()
            X.0bf r5 = r11.A01
            r7 = 0
            if (r0 == 0) goto L_0x006f
            java.lang.Class<X.1ch> r0 = X.AnonymousClass1ch.class
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r0)
            java.lang.String r0 = "ig_username_suggestion_sign_up"
            boolean r0 = X.C62433Zv.A02(r1, r5, r0)
            r8 = 1
            if (r0 != 0) goto L_0x0070
        L_0x006f:
            r8 = 0
        L_0x0070:
            com.instagram.registration.model.RegFlowExtras r0 = r11.A00
            X.25r r6 = r0.A01()
            r9 = r7
            r10 = r7
            r3.A07(r4, r5, r6, r7, r8, r9, r10)
            X.KHr r3 = X.C38040KHr.A01
            java.lang.Class<X.45N> r1 = X.AnonymousClass45N.class
            X.4pY r0 = r11.A0A
            r3.A03(r0, r1)
            r0 = 55181176(0x349ff78, float:5.9361855E-37)
            X.C14030oh.A09(r0, r2)
            return
        L_0x008b:
            java.util.List r1 = r0.A0f
            if (r1 != 0) goto L_0x0095
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            r0.A0f = r1
        L_0x0095:
            r3 = 0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b1
            java.lang.Object r0 = r1.get(r3)
            X.38z r0 = (X.C569038z) r0
            java.lang.String r0 = r0.A01
            r11.A03 = r0
            java.lang.Object r0 = r1.get(r3)
            X.38z r0 = (X.C569038z) r0
            java.lang.String r0 = r0.A00
            r11.A02 = r0
            goto L_0x0049
        L_0x00b1:
            r11.A02 = r5
            com.instagram.registration.model.RegFlowExtras r0 = r11.A00
            java.util.List r1 = r0.A0e
            if (r1 == 0) goto L_0x00c3
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00c3
            java.lang.String r5 = X.C18190wL.A0q(r1, r3)
        L_0x00c3:
            r11.A03 = r5
            goto L_0x0049
        L_0x00c6:
            java.lang.String r0 = r1.A0Q
            boolean r0 = X.C18210wN.A1U(r0)
            if (r0 == 0) goto L_0x002d
            com.instagram.registration.model.RegFlowExtras r1 = r11.A00
            X.25r r0 = X.C313625r.PHONE
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ch.onCreate(android.os.Bundle):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: X.46z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: X.470} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: X.46z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: X.46z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r28, android.view.ViewGroup r29, android.os.Bundle r30) {
        /*
            r27 = this;
            r0 = 1222669996(0x48e076ac, float:459701.38)
            int r16 = X.C14030oh.A02(r0)
            r0 = 2131496674(0x7f0c0ee2, float:1.861692E38)
            r5 = r28
            r1 = r29
            android.view.View r9 = X.AnonymousClass0wJ.A0H(r5, r1, r0)
            android.view.ViewGroup r4 = X.C18190wL.A0E(r9)
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r1 = 18304132708307552(0x41078300001260, double:1.8945772580578014E-307)
            boolean r3 = X.C63173fJ.A05(r0, r1)
            r8 = 1
            r0 = 2131495963(0x7f0c0c1b, float:1.8615477E38)
            if (r3 == 0) goto L_0x002a
            r0 = 2131495957(0x7f0c0c15, float:1.8615465E38)
        L_0x002a:
            r5.inflate(r0, r4, r8)
            r0 = 2131300543(0x7f0910bf, float:1.8219119E38)
            android.widget.TextView r5 = X.AnonymousClass0wJ.A0L(r9, r0)
            r7 = 0
            r5.setAllCaps(r7)
            r10 = r27
            java.lang.String r0 = r10.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01a7
            X.0bf r4 = r10.A01
            com.instagram.registration.model.RegFlowExtras r0 = r10.A00
            X.25r r3 = r0.A01()
            X.2AT r0 = X.AnonymousClass2AT.A06
            X.265 r14 = r0.A00
            java.lang.String r0 = r10.A03
            X.C54292zD.A00(r4, r3, r14, r0)
            android.content.res.Resources r4 = X.AnonymousClass0wJ.A0B(r10)
            r3 = 2131836397(0x7f113ded, float:1.930596E38)
            java.lang.String r0 = r10.A03
            X.C18200wM.A19(r4, r5, r0, r3)
            java.lang.String r0 = r10.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b3
            X.0bf r13 = r10.A01
            java.lang.String r12 = r10.A02
            com.instagram.registration.model.RegFlowExtras r3 = r10.A00
            X.25r r0 = r3.A01()
            if (r0 == 0) goto L_0x01a3
            X.25r r0 = r3.A01()
            java.lang.String r15 = r0.A00
        L_0x0079:
            X.C04220Ms.A0B(r13, r7)
            X.C04220Ms.A0B(r14, r8)
            X.AnonymousClass0wJ.A1Q(r12, r15)
            double r5 = X.C18200wM.A00()
            double r3 = X.AnonymousClass269.A00()
            X.0nS r11 = X.C13330nS.A02(r13)
            java.lang.String r0 = "usename_suggestion_prototype_used"
            X.0A2 r11 = X.AnonymousClass0wJ.A0M(r11, r0)
            r0 = 2806(0xaf6, float:3.932E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r11 = X.C18180wK.A0I(r11, r0)
            X.AnonymousClass0wJ.A1B(r11, r5, r3)
            X.C18210wN.A19(r11, r15)
            X.C18210wN.A17(r11)
            java.lang.String r0 = "prototype"
            r11.A0T(r0, r12)
            X.C18180wK.A1A(r11, r3)
            java.lang.String r0 = r14.A01
            X.AnonymousClass269.A08(r11, r0)
            X.C63683i7.A0A(r11, r13)
        L_0x00b3:
            r0 = 2131300539(0x7f0910bb, float:1.821911E38)
            android.widget.TextView r3 = X.AnonymousClass0wJ.A0L(r9, r0)
            r0 = 2131831698(0x7f112b92, float:1.9296429E38)
            r3.setText(r0)
            r0 = 2131298301(0x7f0907fd, float:1.8214571E38)
            android.view.View r3 = r9.requireViewById(r0)
            X.C18210wN.A0y(r3)
            r0 = 29
            X.AnonymousClass0wJ.A17(r3, r0, r10)
            r0 = 2131303801(0x7f091d79, float:1.8225727E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.registration.ui.NotificationBar r0 = (com.instagram.registration.ui.NotificationBar) r0
            r10.A07 = r0
            com.instagram.ui.widget.progressbutton.ProgressButton r25 = X.C18210wN.A0O(r9)
            X.0bf r3 = r10.A01
            r22 = 0
            r26 = 2131835969(0x7f113c41, float:1.9305092E38)
            X.1jv r0 = new X.1jv
            r21 = r0
            r23 = r3
            r24 = r10
            r21.<init>(r22, r23, r24, r25, r26)
            r10.A08 = r0
            r10.registerLifecycleListener(r0)
            com.instagram.registration.model.RegFlowExtras r4 = r10.A00
            X.25r r3 = r4.A01()
            X.25r r0 = X.C313625r.PHONE
            if (r3 != r0) goto L_0x018e
            X.KHr r4 = X.C38040KHr.A01
            java.lang.Class<X.45S> r3 = X.AnonymousClass45S.class
            X.470 r0 = new X.470
            r0.<init>(r10)
            r10.A06 = r0
        L_0x010a:
            r4.A03(r0, r3)
        L_0x010d:
            X.KHr r4 = X.C38040KHr.A01
            java.lang.Class<X.45Q> r3 = X.AnonymousClass45Q.class
            X.46y r0 = new X.46y
            r0.<init>(r10)
            r10.A04 = r0
            r4.A03(r0, r3)
            com.instagram.registration.model.RegFlowExtras r0 = r10.A00
            java.lang.String r0 = r0.A0X
            java.lang.String r4 = "kr"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x013f
            X.0TJ r0 = X.AnonymousClass0TJ.A06
            boolean r0 = X.C63173fJ.A05(r0, r1)
            if (r0 == 0) goto L_0x013f
            r0 = 2131299001(0x7f090ab9, float:1.8215991E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r9, r0)
            android.content.Context r1 = r10.requireContext()
            X.0bf r0 = r10.A01
            X.C63553hn.A02(r1, r2, r0)
        L_0x013f:
            r0 = 2131304602(0x7f09209a, float:1.8227351E38)
            android.view.View r3 = r9.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.instagram.registration.model.RegFlowExtras r0 = r10.A00
            java.lang.String r0 = r0.A0X
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x016f
            android.content.Context r17 = r10.getContext()
            X.0bf r2 = r10.A01
            com.instagram.registration.model.RegFlowExtras r1 = r10.A00
            java.lang.String r0 = r1.A0X
            X.25r r20 = r1.A01()
            r19 = r2
            r21 = r0
            r23 = r22
            r24 = r7
            r25 = r8
            r18 = r3
            X.C63553hn.A03(r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x016f:
            X.C691847d.A02(r10)
            X.3YT r3 = X.AnonymousClass3YT.A00
            X.0bf r2 = r10.A01
            X.2AT r0 = X.AnonymousClass2AT.A06
            X.265 r0 = r0.A00
            java.lang.String r1 = r0.A01
            com.instagram.registration.model.RegFlowExtras r0 = r10.A00
            X.25r r0 = r0.A01()
            r3.A01(r2, r0, r1)
            r1 = -747825756(0xffffffffd36d15a4, float:-1.01827032E12)
            r0 = r16
            X.C14030oh.A09(r1, r0)
            return r9
        L_0x018e:
            X.25r r3 = r4.A01()
            X.25r r0 = X.C313625r.EMAIL
            if (r3 != r0) goto L_0x010d
            X.KHr r4 = X.C38040KHr.A01
            java.lang.Class<X.45K> r3 = X.AnonymousClass45K.class
            X.46z r0 = new X.46z
            r0.<init>(r10)
            r10.A05 = r0
            goto L_0x010a
        L_0x01a3:
            java.lang.String r15 = ""
            goto L_0x0079
        L_0x01a7:
            r0 = 2131836396(0x7f113dec, float:1.9305958E38)
            r5.setText(r0)
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ch.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(375350777);
        super.onDestroy();
        C38040KHr.A01.A04(this.A0A, AnonymousClass45N.class);
        C14030oh.A09(-375544439, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-997909093);
        super.onDestroyView();
        unregisterLifecycleListener(this.A08);
        C691847d.A03(this);
        this.A07 = null;
        this.A08 = null;
        AnonymousClass470 r2 = this.A06;
        if (r2 != null) {
            C38040KHr.A01.A04(r2, AnonymousClass45S.class);
            this.A06 = null;
        }
        C691646z r22 = this.A05;
        if (r22 != null) {
            C38040KHr.A01.A04(r22, AnonymousClass45K.class);
            this.A05 = null;
        }
        C691546y r23 = this.A04;
        if (r23 != null) {
            C38040KHr.A01.A04(r23, AnonymousClass45Q.class);
            this.A04 = null;
        }
        C14030oh.A09(597330094, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(666761793);
        super.onPause();
        this.A07.A03();
        this.A09.removeCallbacksAndMessages((Object) null);
        C18180wK.A0F(this).setSoftInputMode(0);
        C14030oh.A09(160462824, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1569541694);
        super.onResume();
        C18180wK.A15(this);
        C14030oh.A09(197739478, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(632021633);
        super.onStart();
        C14030oh.A09(-1970576078, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(1949040369);
        super.onStop();
        C14030oh.A09(-1795609670, A022);
    }

    public final void CDH(boolean z) {
    }
}
