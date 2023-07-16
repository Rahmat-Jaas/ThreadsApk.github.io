package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0301000_I2_5;
import kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95;
import kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17;

/* renamed from: X.1wh  reason: invalid class name and case insensitive filesystem */
public final class C29081wh extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "AdsOptionsFragment";
    public C85584vR A00;
    public Boolean A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final C04530Oa A05 = C80644m9.A00(this);
    public final C04530Oa A06;

    public final void configureActionBar(AnonymousClass4u2 r4) {
        C04220Ms.A0B(r4, 0);
        r4.Cqb(2131821225);
        r4.CtT(C18180wK.A1X(getParentFragmentManager().A0I()));
        C58763Hc r2 = new C58763Hc(AnonymousClass006.A00);
        r2.A05 = C63393hP.A01(requireContext(), R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        r4.Cro(r2.A00());
    }

    public final String getModuleName() {
        return "settings_ads_options";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass061 r3 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape13S0301000_I2_5(viewLifecycleOwner, r3, this, (C146958n9) null, 3), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        if (r0 == false) goto L_0x0113;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0B(X.C29081wh r18) {
        /*
            r6 = r18
            X.0Oa r0 = r6.A05
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3Bj r5 = new X.3Bj
            r5.<init>(r0, r6)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            boolean r11 = r6.A04
            java.lang.Boolean r0 = r6.A01
            r18 = r0
            java.lang.String r10 = r6.A02
            X.4vR r0 = r6.A00
            r17 = r0
            java.lang.String r9 = r6.A03
            X.0Oa r0 = r6.A06
            java.lang.Object r0 = r0.getValue()
            X.102 r0 = (X.AnonymousClass102) r0
            X.4wE r0 = r0.A04
            java.lang.Object r8 = r0.getValue()
            java.util.List r8 = (java.util.List) r8
            com.instagram.service.session.UserSession r3 = r5.A02
            X.0TJ r7 = X.AnonymousClass0TJ.A06
            r0 = 36311448816714334(0x8101120000025e, double:3.0268446739339845E-306)
            boolean r2 = X.C63803iN.A0E(r7, r3, r0)
            r0 = 36315958532377515(0x81052c00000bab, double:3.0296966362785475E-306)
            boolean r0 = X.C63803iN.A0E(r7, r3, r0)
            if (r2 != 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            r0 = 136(0x88, float:1.9E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r1 = X.C18210wN.A0H(r5, r0)
            X.36R r0 = new X.36R
            r0.<init>(r1)
            r4.add(r0)
            X.C63273h9.A03(r4)
        L_0x005a:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36314365099509627(0x8103b90000077b, double:3.028688942916656E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x018e
            r1 = 2131821012(0x7f1101d4, float:1.9274755E38)
            r0 = 134(0x86, float:1.88E-43)
            X.AnonymousClass4MA.A04(r5, r4, r0, r1)
            r13 = 1
        L_0x0070:
            r12 = 2131821014(0x7f1101d6, float:1.927476E38)
            r1 = 179(0xb3, float:2.51E-43)
            r0 = r18
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r0, r5, r1)
            X.4MA r0 = X.AnonymousClass4MA.A00(r0, r12)
            r14 = r11 ^ 1
            r0.A07 = r14
            r4.add(r0)
            r16 = r13 | 1
            r0 = 36311448816714334(0x8101120000025e, double:3.0268446739339845E-306)
            boolean r11 = X.C63803iN.A0E(r2, r3, r0)
            r12 = 0
            if (r11 == 0) goto L_0x00c4
            if (r9 == 0) goto L_0x00a7
            java.lang.String r11 = "detailed_version_group"
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x00a6
            java.lang.String r11 = "concise_version_group"
            boolean r11 = r9.equals(r11)
            if (r11 == 0) goto L_0x00a7
        L_0x00a6:
            r12 = 1
        L_0x00a7:
            java.util.HashMap r15 = X.AnonymousClass0wJ.A0y()
            r13 = 2131824753(0x7f111071, float:1.9282343E38)
            if (r12 == 0) goto L_0x00b3
            r13 = 2131820974(0x7f1101ae, float:1.9274678E38)
        L_0x00b3:
            r12 = 14
            com.facebook.redex.IDxCListenerShape8S1200000_1_I2 r11 = new com.facebook.redex.IDxCListenerShape8S1200000_1_I2
            r11.<init>((java.lang.Object) r5, (java.lang.Object) r15, (java.lang.String) r9, (int) r12)
            X.4MA r9 = X.AnonymousClass4MA.A00(r11, r13)
            r9.A07 = r14
            r4.add(r9)
            r12 = 1
        L_0x00c4:
            r12 = r12 | r16
            com.instagram.user.model.User r9 = X.AnonymousClass0wJ.A0Y(r3)
            boolean r9 = r9.A3a()
            if (r9 != 0) goto L_0x018b
            if (r8 == 0) goto L_0x018b
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x018b
            r11 = 2131832090(0x7f112d1a, float:1.9297224E38)
            r9 = 180(0xb4, float:2.52E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r8 = X.C18200wM.A0R(r8, r5, r9)
            X.4MA r8 = X.AnonymousClass4MA.A00(r8, r11)
            r4.add(r8)
            r8 = 1
        L_0x00e9:
            r12 = r12 | r8
            if (r12 == 0) goto L_0x0122
            r8 = 36316409504336996(0x81059500060c64, double:3.0299818327616416E-306)
            boolean r8 = X.C63803iN.A0E(r2, r3, r8)
            if (r8 == 0) goto L_0x0101
            if (r10 == 0) goto L_0x0101
            X.3hC r8 = new X.3hC
            r8.<init>((java.lang.CharSequence) r10)
            r4.add(r8)
        L_0x0101:
            boolean r8 = X.C63803iN.A0E(r7, r3, r0)
            r0 = 36315958532377515(0x81052c00000bab, double:3.0296966362785475E-306)
            boolean r0 = X.C63803iN.A0E(r7, r3, r0)
            if (r8 != 0) goto L_0x0113
            r7 = 2
            if (r0 != 0) goto L_0x0114
        L_0x0113:
            r7 = 0
        L_0x0114:
            r1 = 2131821012(0x7f1101d4, float:1.9274755E38)
            X.3hu r0 = new X.3hu
            r0.<init>((int) r1)
            r4.add(r7, r0)
            X.C63273h9.A03(r4)
        L_0x0122:
            r0 = 36316409504336996(0x81059500060c64, double:3.0299818327616416E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x014b
            if (r17 == 0) goto L_0x014b
            java.lang.String r8 = r17.BH2()
            java.lang.String r7 = r17.B3D()
            r17.B3E()
            r1 = 177(0xb1, float:2.48E-43)
            r0 = r17
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r0, r5, r1)
            X.3Sk r1 = new X.3Sk
            r1.<init>(r0, r8, r7)
            r0 = 0
            r4.add(r0, r1)
        L_0x014b:
            int r7 = r4.size()
            r1 = 2131820999(0x7f1101c7, float:1.9274729E38)
            X.3hu r0 = new X.3hu
            r0.<init>((int) r1)
            r4.add(r7, r0)
            r0 = 36321331536468713(0x810a0f00001ae9, double:3.033094545701172E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0177
            r2 = 2131821008(0x7f1101d0, float:1.9274747E38)
            r1 = 178(0xb2, float:2.5E-43)
            r0 = r18
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r0, r5, r1)
            X.4MA r0 = X.AnonymousClass4MA.A00(r0, r2)
            r4.add(r0)
        L_0x0177:
            r1 = 2131820979(0x7f1101b3, float:1.9274688E38)
            r0 = 133(0x85, float:1.86E-43)
            X.AnonymousClass4MA.A04(r5, r4, r0, r1)
            r1 = 2131820788(0x7f1100f4, float:1.92743E38)
            r0 = 135(0x87, float:1.89E-43)
            X.AnonymousClass4MA.A04(r5, r4, r0, r1)
            r6.setItems(r4)
            return
        L_0x018b:
            r8 = 0
            goto L_0x00e9
        L_0x018e:
            r13 = 0
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29081wh.A0B(X.1wh):void");
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public C29081wh() {
        KtLambdaShape115S0100000_I2_95 ktLambdaShape115S0100000_I2_95 = new KtLambdaShape115S0100000_I2_95(this, 14);
        C04530Oa A0l = C18240wQ.A0l(AnonymousClass006.A0C, new KtLambdaShape115S0100000_I2_95(this, 11), 12);
        this.A06 = C18220wO.A0M(new KtLambdaShape115S0100000_I2_95(A0l, 13), ktLambdaShape115S0100000_I2_95, new KtLambdaShape33S0200000_I2_17(44, (Object) null, A0l), C18210wN.A0l(AnonymousClass102.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-2114286793);
        super.onCreate(bundle);
        C67473zc A002 = C67473zc.A00(C67463zb.A00(), AnonymousClass155.class, "BasicAdsOptInQuery");
        C04530Oa r3 = this.A05;
        C63873iU.A0C(this, C18210wN.A0K(A002, AnonymousClass0wJ.A0U(r3)), 138);
        C63873iU.A0C(this, C18180wK.A0R(C67473zc.A00(C67463zb.A00(), AnonymousClass15S.class, "FxSettingsAdsTransition"), AnonymousClass0wJ.A0U(r3)), 137);
        C14030oh.A09(-244685617, A022);
    }
}
