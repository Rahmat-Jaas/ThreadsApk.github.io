package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.bottomsheet.intf.IDxCListenerShape179S0100000_1_I2;

/* renamed from: X.1wA  reason: invalid class name */
public class AnonymousClass1wA extends C23411dm {
    public static final String __redex_internal_original_name = "RageshakeBottomSheetFragment";
    public AnonymousClass1jI A00;
    public AnonymousClass25S A01;
    public C58533Ga A02;
    public C61593Uj A03;
    public AnonymousClass1lP A04;
    public AnonymousClass3EX A05;
    public UserSession A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final View.OnClickListener A0E = new IDxCListenerShape201S0100000_1_I2(this, 103);

    public static void A0C(AnonymousClass1wA r1) {
        r1.A0A = true;
        C18200wM.A12(r1.getActivity(), C25745DrH.A00);
    }

    public final String getModuleName() {
        return "rageshake_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x014a, code lost:
        if (X.C34442Jo.A00() != false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r0.A01 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(android.content.Context r16, X.AnonymousClass1wA r17) {
        /*
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            r6 = r17
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x0013
            X.1lP r0 = r6.A04
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A01
            r11 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r11 = 0
        L_0x0014:
            boolean r0 = r6 instanceof X.C23641ev
            r7 = r16
            if (r0 == 0) goto L_0x01f9
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            X.3EX r1 = r6.A05
            X.29m r0 = X.C319229m.SHOW_BUILD_OUT_OF_DATE
            r1.A00(r0)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            r0 = 2131834020(0x7f1134a4, float:1.9301139E38)
            X.3hC r1 = new X.3hC
            r1.<init>((int) r0)
            r8 = 1
            r1.A05 = r8
            r0 = 2131887425(0x7f120541, float:1.9409457E38)
            r1.A00 = r0
            r9 = 2131165209(0x7f070019, float:1.7944629E38)
            r1.A01 = r9
            r4.add(r1)
            android.content.Context r0 = r6.requireContext()
            X.0Jb r0 = X.AnonymousClass0Jc.A00(r0)
            long r0 = r0.A00
            long r2 = X.C18230wP.A06()
            long r2 = r2 - r0
            r0 = 86400000(0x5265c00, float:7.82218E-36)
            long r0 = (long) r0
            long r2 = r2 / r0
            int r0 = (int) r2
            r1 = 2131834019(0x7f1134a3, float:1.9301136E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r6, r0, r1)
            X.3hC r1 = new X.3hC
            r1.<init>((java.lang.CharSequence) r0)
            r0 = 2131886943(0x7f12035f, float:1.940848E38)
            r1.A00 = r0
            r1.A05 = r8
            r4.add(r1)
            java.lang.String r10 = "v"
            android.content.Context r0 = r6.requireContext()
            java.lang.String r3 = X.C10380iF.A02(r0)
            java.lang.String r2 = " (Build #"
            int r1 = X.C10380iF.A00()
            java.lang.String r0 = ")"
            java.lang.String r1 = X.AnonymousClass00U.A07(r1, r10, r3, r2, r0)
            X.3hC r0 = new X.3hC
            r0.<init>((java.lang.CharSequence) r1)
            r0.A05 = r8
            r4.add(r0)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131834027(0x7f1134ab, float:1.9301153E38)
            java.lang.String r3 = X.AnonymousClass0wJ.A0k(r1, r0)
            boolean r0 = X.C09650fs.A02(r7)
            if (r0 == 0) goto L_0x01f5
            java.lang.String r2 = "https://fburl.com/mobile_builds/lns0ufoc"
        L_0x00a3:
            r0 = 12
            com.facebook.redex.IDxCListenerShape14S1100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape14S1100000_1_I2
            r1.<init>((java.lang.String) r2, (java.lang.Object) r6, (int) r0)
            X.3T9 r0 = new X.3T9
            r0.<init>(r1, r3, r3)
            r4.add(r0)
            r0 = 2131834021(0x7f1134a5, float:1.930114E38)
            X.3hC r1 = new X.3hC
            r1.<init>((int) r0)
            r0 = 2131887451(0x7f12055b, float:1.940951E38)
            r1.A00 = r0
            r1.A01 = r9
            r0 = 81
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r6, r0)
            r1.A03 = r0
            r1.A05 = r8
            r4.add(r1)
            X.C63273h9.A02(r4)
        L_0x00d1:
            r5.addAll(r4)
            r2 = 2131833992(0x7f113488, float:1.9301082E38)
            r1 = 104(0x68, float:1.46E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape201S0100000_1_I2
            r0.<init>((X.AnonymousClass1wA) r6, (int) r1)
            X.4MA r0 = X.AnonymousClass4MA.A00(r0, r2)
            r3 = 2131232720(0x7f0807d0, float:1.8081557E38)
            r0.A01 = r3
            r5.add(r0)
            if (r11 == 0) goto L_0x00ff
            r2 = 2131833995(0x7f11348b, float:1.9301088E38)
            r1 = 105(0x69, float:1.47E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape201S0100000_1_I2
            r0.<init>((X.AnonymousClass1wA) r6, (int) r1)
            X.4MA r0 = X.AnonymousClass4MA.A00(r0, r2)
            r0.A01 = r3
            r5.add(r0)
        L_0x00ff:
            X.C63273h9.A02(r5)
            com.instagram.service.session.UserSession r2 = r6.A06
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36312634227950718(0x8102260004047e, double:3.0275943327731416E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r3, r2, r0)
            boolean r8 = r0.booleanValue()
            X.1lP r0 = r6.A04
            if (r0 == 0) goto L_0x0166
            if (r8 != 0) goto L_0x0121
            com.instagram.service.session.UserSession r0 = r6.A06
            boolean r0 = X.C19573AyZ.A03(r0)
            if (r0 != 0) goto L_0x0166
        L_0x0121:
            com.instagram.service.session.UserSession r2 = r6.A06
            r4 = 0
            X.C04220Ms.A0B(r2, r4)
            r0 = 37
            kotlin.jvm.internal.KtLambdaShape39S0100000_I2_19 r1 = new kotlin.jvm.internal.KtLambdaShape39S0100000_I2_19
            r1.<init>(r2, r0)
            java.lang.Class<X.33X> r0 = X.AnonymousClass33X.class
            java.lang.Object r0 = r2.A01(r0, r1)
            X.33X r0 = (X.AnonymousClass33X) r0
            com.instagram.service.session.UserSession r0 = r0.A00
            android.content.SharedPreferences r2 = X.C28161tl.A04(r0)
            java.lang.String r1 = "rageshake_v2_enabled"
            r0 = 1
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x014c
            boolean r0 = X.C34442Jo.A00()
            r2 = 1
            if (r0 == 0) goto L_0x014d
        L_0x014c:
            r2 = 0
        L_0x014d:
            r1 = 2131834000(0x7f113490, float:1.9301098E38)
            com.facebook.redex.IDxCListenerShape149S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape149S0200000_1_I2
            r0.<init>(r4, r7, r6)
            X.4MC r1 = X.AnonymousClass4MC.A03(r0, r1, r2)
            r0 = 2131833999(0x7f11348f, float:1.9301096E38)
            if (r2 == 0) goto L_0x0161
            r0 = 2131833998(0x7f11348e, float:1.9301094E38)
        L_0x0161:
            r1.A02 = r0
            r5.add(r1)
        L_0x0166:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0187
            com.instagram.service.session.UserSession r0 = r6.A06
            boolean r0 = X.C19573AyZ.A02(r0)
            if (r0 == 0) goto L_0x0187
            r2 = 2131834018(0x7f1134a2, float:1.9301134E38)
            X.0et r0 = X.C09120et.A02()
            X.0dK r0 = r0.A1N
            boolean r1 = X.AnonymousClass0wJ.A1V(r0)
            r0 = 2
            X.4MC r0 = X.AnonymousClass4MC.A05(r6, r0, r2, r1)
            r5.add(r0)
        L_0x0187:
            if (r8 != 0) goto L_0x0318
            boolean r0 = r6.A0C
            if (r0 != 0) goto L_0x0318
            com.instagram.service.session.UserSession r0 = r6.A06
            boolean r0 = X.C19573AyZ.A02(r0)
            if (r0 == 0) goto L_0x0318
            boolean r0 = X.C09650fs.A02(r7)
            if (r0 != 0) goto L_0x0318
            r2 = 2131834010(0x7f11349a, float:1.9301118E38)
            r1 = 107(0x6b, float:1.5E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape201S0100000_1_I2
            r0.<init>((X.AnonymousClass1wA) r6, (int) r1)
            X.4MA r0 = X.AnonymousClass4MA.A00(r0, r2)
            r5.add(r0)
            com.instagram.service.session.UserSession r2 = r6.A06
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            r0 = 36324965078803274(0x810d5d0000234a, double:3.035392412504649E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            if (r0 == 0) goto L_0x01ce
            r2 = 2131834012(0x7f11349c, float:1.9301122E38)
            r1 = 101(0x65, float:1.42E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape201S0100000_1_I2
            r0.<init>((X.AnonymousClass1wA) r6, (int) r1)
            X.4MA r0 = X.AnonymousClass4MA.A00(r0, r2)
            r5.add(r0)
        L_0x01ce:
            com.instagram.service.session.UserSession r8 = r6.A06
            X.JmN r7 = X.C37200JmN.A00()
            X.FfK r0 = X.C28979FfK.DEVELOPER_OPTIONS
            X.FfK[] r0 = new X.C28979FfK[]{r0}
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            X.C18240wQ.A1Q(r4, r0)
            java.lang.Integer r3 = X.AnonymousClass006.A00
            X.0m7 r2 = X.C18250wR.A0B(r6)
            X.4Db r1 = new X.4Db
            r1.<init>(r6, r8, r6, r5)
            X.Jf5 r0 = new X.Jf5
            r0.<init>(r2, r1, r3, r4)
            r7.A02(r8, r0)
            return
        L_0x01f5:
            java.lang.String r2 = "https://fburl.com/mobile_builds/akmu1kq4"
            goto L_0x00a3
        L_0x01f9:
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x0207
            r0 = 2131232004(0x7f080504, float:1.8080105E38)
            X.AnonymousClass3S0.A00(r4, r0)
        L_0x0207:
            java.util.HashMap r8 = X.AnonymousClass0wJ.A0y()
            r0 = 2131834004(0x7f113494, float:1.9301106E38)
            if (r11 != 0) goto L_0x0213
            r0 = 2131834003(0x7f113493, float:1.9301104E38)
        L_0x0213:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "title"
            r8.put(r3, r0)
            r0 = 2131834002(0x7f113492, float:1.9301102E38)
            if (r11 != 0) goto L_0x0224
            r0 = 2131834001(0x7f113491, float:1.93011E38)
        L_0x0224:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "subtitle"
            r8.put(r2, r0)
            r0 = 2131834005(0x7f113495, float:1.9301108E38)
            if (r11 != 0) goto L_0x0235
            r0 = 2131834026(0x7f1134aa, float:1.930115E38)
        L_0x0235:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "button_cta"
            r8.put(r1, r0)
            java.lang.Object r0 = r8.get(r3)
            r0.getClass()
            int r3 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r0 = r8.get(r2)
            r0.getClass()
            int r9 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r0 = r8.get(r1)
            r0.getClass()
            int r2 = X.AnonymousClass0wJ.A04(r0)
            X.3hC r1 = new X.3hC
            r1.<init>((int) r3)
            r3 = 1
            r1.A05 = r3
            r0 = 2131887425(0x7f120541, float:1.9409457E38)
            r1.A00 = r0
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            r1.A01 = r0
            r4.add(r1)
            r8 = 0
            java.lang.String r0 = X.C121907Is.A04(r7)
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r7, r0, r9)
            X.3hC r0 = new X.3hC
            r0.<init>((java.lang.CharSequence) r1)
            r0.A05 = r3
            r4.add(r0)
            android.content.Context r0 = r6.requireContext()
            java.lang.String r2 = r0.getString(r2)
            if (r11 == 0) goto L_0x0315
            r0 = 102(0x66, float:1.43E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape201S0100000_1_I2
            r1.<init>((X.AnonymousClass1wA) r6, (int) r0)
        L_0x0298:
            X.3T9 r0 = new X.3T9
            r0.<init>(r1, r2, r2)
            r4.add(r0)
            X.3Tk r12 = X.AnonymousClass31M.A00
            com.instagram.service.session.UserSession r9 = r6.A06
            X.0TJ r2 = X.C18250wR.A0D(r9, r8)
            r0 = 36321889882217551(0x810a9100001c4f, double:3.033447645801015E-306)
            boolean r0 = X.C63803iN.A0E(r2, r9, r0)
            if (r0 == 0) goto L_0x00d1
            X.3EX r1 = r6.A05
            X.29m r0 = X.C319229m.RAGESHAKE_OPEN
            r1.A00(r0)
            android.content.Context r0 = r6.requireContext()
            X.0Jb r0 = X.AnonymousClass0Jc.A00(r0)
            long r14 = r0.A00
            long r0 = X.C18230wP.A06()
            android.content.Context r13 = r6.requireContext()
            r16 = r0
            java.lang.String r10 = r12.A01(r13, r14, r16)
            java.lang.String r9 = ": v"
            java.lang.String r2 = X.C10380iF.A02(r13)
            java.lang.String r10 = X.AnonymousClass00U.A0V(r10, r9, r2)
            X.C04220Ms.A06(r10)
            java.lang.Integer r9 = X.C61433Tk.A00(r14, r0)
            int r1 = r9.intValue()
            if (r1 == r8) goto L_0x0311
            r0 = 2131100060(0x7f06019c, float:1.781249E38)
            if (r1 == r3) goto L_0x02f1
            r0 = 2131100067(0x7f0601a3, float:1.7812505E38)
        L_0x02f1:
            X.4MA r2 = new X.4MA
            r2.<init>((java.lang.CharSequence) r10, (int) r0)
            int r1 = r9.intValue()
            if (r1 == r8) goto L_0x030d
            r0 = 2131232459(0x7f0806cb, float:1.8081028E38)
            if (r1 == r3) goto L_0x0304
            r0 = 2131232461(0x7f0806cd, float:1.8081032E38)
        L_0x0304:
            r2.A01 = r0
            r2.A08 = r3
            r4.add(r2)
            goto L_0x00d1
        L_0x030d:
            r0 = 2131231237(0x7f080205, float:1.807855E38)
            goto L_0x0304
        L_0x0311:
            r0 = 2131100117(0x7f0601d5, float:1.7812606E38)
            goto L_0x02f1
        L_0x0315:
            android.view.View$OnClickListener r1 = r6.A0E
            goto L_0x0298
        L_0x0318:
            r6.setBottomSheetMenuItems(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1wA.A0B(android.content.Context, X.1wA):void");
    }

    public void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1848731738);
        super.onCreate(bundle);
        Bundle A072 = C18250wR.A07(this);
        this.A07 = A072.getString("ARG_RAGESHAKE_BOTTOM_SHEET_AD_ID");
        this.A01 = (AnonymousClass25S) A072.getSerializable("ARG_BOTTOM_SHEET_BUG_REPORT_SOURCE");
        this.A0C = A072.getBoolean("ARG_RAGESHAKE_BOTTOM_SHEET_MANUAL_REPORT_FROM_HELP_SETTING");
        this.A0D = A072.getBoolean("ARG_RAGESHAKE_BOTTOM_SHEET_REPORT_FROM_LONG_PRESS");
        this.A0B = A072.getBoolean("ARG_RAGESHAKE_DISMISSED_PREVIOUS_VIEWS");
        UserSession A0V = C18180wK.A0V(A072);
        this.A06 = A0V;
        this.A02 = new C58533Ga(A0V, "rageshake_bottom_sheet");
        this.A03 = C61593Uj.A04.A00(this.A06);
        this.A09 = A072.getString("ARG_SCREEN_FROM");
        this.A08 = A072.getString("ARG_NAV_CHAIN");
        this.A04 = (AnonymousClass1lP) this.A06.A00(AnonymousClass1lP.class);
        this.A05 = new AnonymousClass3EX(this.A06);
        C14030oh.A09(1827196043, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1565819063);
        super.onPause();
        AnonymousClass1jI r0 = this.A00;
        if (r0 != null) {
            r0.A06();
            this.A00 = null;
            AnonymousClass0LU.A0C(__redex_internal_original_name, "onPause, cleaned up mLaunchBugReporterTask");
        }
        C14030oh.A09(493056056, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        Window window;
        Context context = view.getContext();
        C18230wP.A0z(context, view, R.color.igds_elevated_background);
        super.onViewCreated(view, bundle);
        A0B(context, this);
        C58533Ga r1 = this.A02;
        if (this.A0C) {
            num = AnonymousClass006.A01;
        } else {
            num = AnonymousClass006.A00;
        }
        r1.A01(num);
        C25745DrH A0b = C18220wO.A0b(getActivity());
        if (A0b != null) {
            A0b.A0A(new IDxCListenerShape179S0100000_1_I2(this, 0));
        } else {
            C10450iM.A00().CuW("RageshakeBottomSheetFragment#bindBottomSheetNavListener", "BottomSheetNavigator.getBottomSheetNavigator() returned null, couldn't bind for listening to on dismiss.");
        }
        if (C09650fs.A02(context)) {
            FragmentActivity activity = getActivity();
            if (!(activity == null || (window = activity.getWindow()) == null)) {
                AnonymousClass03G.A00(window, true);
            }
            if (A0b != null) {
                C18240wQ.A1K(this, 0, A0b);
            }
        }
    }
}
