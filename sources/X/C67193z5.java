package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3z5  reason: invalid class name and case insensitive filesystem */
public final class C67193z5 implements CallerContextable {
    public static final CallerContext A09 = CallerContext.A00(C67193z5.class);
    public static final String A0A = C29201xU.class.getName();
    public static final String __redex_internal_original_name = "BusinessOptionsController";
    public C61783Vj A00;
    public final BaseFragmentActivity A01;
    public final C22302CTd A02;
    public final MonetizationRepository A03;
    public final UserSession A04;
    public final C29201xU A05;
    public final C29201xU A06;
    public final User A07;
    public final String A08;

    public static void A00(Fragment fragment, C25786Drz drz) {
        drz.A03 = fragment;
        drz.A07 = A0A;
        drz.A05();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03ed, code lost:
        if (r7.A3Z() == false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r2.A04, 36321434615946008L) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b4, code lost:
        if (X.C63803iN.A0E(r8, r0, 36320794665556219L) == false) goto L_0x01b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C11630kW r21, java.lang.String r22, java.util.List r23, java.util.List r24) {
        /*
            r20 = this;
            r2 = r20
            com.instagram.monetization.repository.MonetizationRepository r5 = r2.A03
            com.instagram.api.schemas.UserMonetizationProductType r6 = com.instagram.api.schemas.UserMonetizationProductType.CONTENT_APPRECIATION
            boolean r8 = r5.A07(r6)
            r11 = 0
            if (r8 == 0) goto L_0x0024
            X.6uP r0 = X.AnonymousClass2FT.A00()
            r0.A02()
            com.instagram.service.session.UserSession r4 = r2.A04
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36321434615946008(0x810a2700041b18, double:3.033159733577681E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            r9 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r9 = 0
        L_0x0025:
            boolean r10 = r5.A06(r6)
            if (r10 == 0) goto L_0x0042
            X.6uP r0 = X.AnonymousClass2FT.A00()
            r0.A02()
            com.instagram.service.session.UserSession r4 = r2.A04
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36321434616732449(0x810a2700101b21, double:3.0331597340750296E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            if (r0 == 0) goto L_0x0042
            r11 = 1
        L_0x0042:
            r1 = r23
            if (r9 != 0) goto L_0x0048
            if (r11 == 0) goto L_0x0050
        L_0x0048:
            r3 = 2131824344(0x7f110ed8, float:1.9281513E38)
            r0 = 143(0x8f, float:2.0E-43)
            X.AnonymousClass4MA.A04(r2, r1, r0, r3)
        L_0x0050:
            X.6uP r3 = X.AnonymousClass2FT.A00()
            com.instagram.service.session.UserSession r0 = r2.A04
            X.7pP r7 = r3.A00(r0)
            X.4YZ r6 = new X.4YZ
            r6.<init>(r7, r8, r9, r10, r11)
            com.instagram.service.session.UserSession r3 = r7.A00
            boolean r3 = X.C19573AyZ.A02(r3)
            if (r3 == 0) goto L_0x006a
            r6.invoke()
        L_0x006a:
            com.instagram.api.schemas.UserMonetizationProductType r3 = com.instagram.api.schemas.UserMonetizationProductType.REVSHARE
            boolean r3 = r5.A07(r3)
            if (r3 == 0) goto L_0x007a
            r4 = 2131828566(0x7f111f56, float:1.9290076E38)
            r3 = 145(0x91, float:2.03E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x007a:
            com.instagram.api.schemas.UserMonetizationProductType r3 = com.instagram.api.schemas.UserMonetizationProductType.REELS_OVERLAY_ADS
            boolean r3 = r5.A07(r3)
            if (r3 == 0) goto L_0x008a
            r4 = 2131828509(0x7f111f1d, float:1.928996E38)
            r3 = 144(0x90, float:2.02E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x008a:
            com.instagram.api.schemas.UserMonetizationProductType r3 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            boolean r3 = r5.A07(r3)
            if (r3 == 0) goto L_0x009a
            r4 = 2131837641(0x7f1142c9, float:1.9308483E38)
            r3 = 156(0x9c, float:2.19E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x009a:
            com.instagram.api.schemas.UserMonetizationProductType r3 = com.instagram.api.schemas.UserMonetizationProductType.USER_PAY
            boolean r3 = r5.A07(r3)
            if (r3 == 0) goto L_0x00aa
            r4 = 2131837575(0x7f114287, float:1.9308349E38)
            r3 = 157(0x9d, float:2.2E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x00aa:
            com.instagram.api.schemas.UserMonetizationProductType r3 = com.instagram.api.schemas.UserMonetizationProductType.INCENTIVE_PLATFORM
            boolean r3 = r5.A07(r3)
            if (r3 == 0) goto L_0x00ba
            r4 = 2131829051(0x7f11213b, float:1.929106E38)
            r3 = 149(0x95, float:2.09E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x00ba:
            com.instagram.user.model.User r7 = r2.A07
            boolean r3 = r7.A2i()
            r11 = r22
            if (r3 == 0) goto L_0x00d5
            r5 = 2131822330(0x7f1106fa, float:1.9277428E38)
            r4 = 15
            com.facebook.redex.IDxCListenerShape14S1100000_1_I2 r3 = new com.facebook.redex.IDxCListenerShape14S1100000_1_I2
            r3.<init>((java.lang.String) r11, (java.lang.Object) r2, (int) r4)
            X.4MA r3 = X.AnonymousClass4MA.A00(r3, r5)
            r1.add(r3)
        L_0x00d5:
            r5 = r24
            if (r24 == 0) goto L_0x00ef
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L_0x00ef
            r4 = 2131832090(0x7f112d1a, float:1.9297224E38)
            r3 = 185(0xb9, float:2.59E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r3 = X.C18200wM.A0R(r2, r5, r3)
            X.4MA r3 = X.AnonymousClass4MA.A00(r3, r4)
            r1.add(r3)
        L_0x00ef:
            X.0Ok r5 = X.C06810aP.A01
            X.MeW r3 = X.C18240wQ.A0W(r0, r5)
            java.lang.Boolean r3 = r3.BYV()
            if (r3 == 0) goto L_0x0117
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0117
            X.MeW r3 = r7.A05
            java.lang.Boolean r3 = r3.BYU()
            if (r3 == 0) goto L_0x0420
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0420
            r4 = 2131835810(0x7f113ba2, float:1.930477E38)
            r3 = 153(0x99, float:2.14E-43)
        L_0x0114:
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x0117:
            com.instagram.base.activity.BaseFragmentActivity r10 = r2.A01
            if (r10 == 0) goto L_0x04bf
            android.content.res.Resources r4 = r10.getResources()
            r3 = 2131822521(0x7f1107b9, float:1.9277816E38)
            java.lang.String r4 = r4.getString(r3)
            r3 = 139(0x8b, float:1.95E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r3 = X.C18210wN.A0H(r2, r3)
            X.4MA r3 = X.AnonymousClass4MA.A01(r3, r4)
            r1.add(r3)
            X.266 r3 = X.C18200wM.A0b(r0, r5)
            X.266 r12 = X.AnonymousClass266.A05
            if (r3 == r12) goto L_0x0143
            X.266 r4 = X.C18200wM.A0b(r0, r5)
            X.266 r3 = X.AnonymousClass266.A04
            if (r4 != r3) goto L_0x015b
        L_0x0143:
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r3 = 36326635821082318(0x810ee2000026ce, double:3.0364489966494556E-306)
            boolean r3 = X.C63803iN.A0E(r6, r0, r3)
            r4 = 2131822571(0x7f1107eb, float:1.9277917E38)
            if (r3 == 0) goto L_0x0156
            r4 = 2131832173(0x7f112d6d, float:1.9297392E38)
        L_0x0156:
            r3 = 141(0x8d, float:1.98E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x015b:
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r3 = 36328207779113278(0x8110500000293e, double:3.0374431092380017E-306)
            boolean r3 = X.C63803iN.A0E(r6, r0, r3)
            if (r3 == 0) goto L_0x0170
            r4 = 2131829649(0x7f112391, float:1.9292273E38)
            r3 = 150(0x96, float:2.1E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x0170:
            boolean r3 = X.C35192Ml.A00(r0)
            if (r3 == 0) goto L_0x0189
            r3 = 36319029434258294(0x8107f700041376, double:3.0316386869934815E-306)
            boolean r3 = X.C63803iN.A0E(r6, r0, r3)
            if (r3 == 0) goto L_0x0189
            r4 = 2131825752(0x7f111458, float:1.928437E38)
            r3 = 146(0x92, float:2.05E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x0189:
            X.KK0 r3 = X.KK0.A00(r0)
            boolean r3 = r3.A01
            if (r3 != 0) goto L_0x0198
            X.KK0 r3 = X.KK0.A00(r0)
            r3.A02()
        L_0x0198:
            boolean r3 = X.C35102Mc.A00(r0)
            if (r3 != 0) goto L_0x0416
            X.0TJ r8 = X.AnonymousClass0TJ.A06
            r3 = 36318737376285420(0x8107b3000112ec, double:3.031453988355413E-306)
            boolean r3 = X.C63803iN.A0E(r8, r0, r3)
            if (r3 != 0) goto L_0x0416
            r3 = 36320794665556219(0x810992000018fb, double:3.032755026374305E-306)
            boolean r3 = X.C63803iN.A0E(r8, r0, r3)
            if (r3 != 0) goto L_0x0416
        L_0x01b6:
            boolean r3 = X.C35092Mb.A00(r0)
            if (r3 == 0) goto L_0x01d0
            r8 = 2131835225(0x7f113959, float:1.9303583E38)
            X.1xU r4 = r2.A05
            r3 = 158(0x9e, float:2.21E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r9 = X.C18210wN.A0H(r2, r3)
            if (r4 != 0) goto L_0x0408
            X.4MA r8 = X.AnonymousClass4MA.A00(r9, r8)
        L_0x01cd:
            r1.add(r8)
        L_0x01d0:
            boolean r3 = r2.A02()
            r9 = r21
            if (r3 == 0) goto L_0x0207
            r4 = 2131827710(0x7f111bfe, float:1.928834E38)
            r3 = 187(0xbb, float:2.62E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r3 = X.C18200wM.A0R(r2, r9, r3)
            X.3Xk r8 = new X.3Xk
            r8.<init>((android.view.View.OnClickListener) r3, (int) r4)
            X.KK1 r3 = X.KK1.A00(r0)
            int r3 = r3.A02()
            if (r3 == 0) goto L_0x0204
            X.CTd r3 = r2.A02
            android.content.Context r4 = r3.requireContext()
            X.KK1 r3 = X.KK1.A00(r0)
            int r3 = r3.A02()
            java.lang.String r3 = r4.getString(r3)
            r8.A04 = r3
        L_0x0204:
            r1.add(r8)
        L_0x0207:
            r8 = 1
            boolean r3 = r2.A03()
            if (r3 == 0) goto L_0x0242
            X.493 r4 = X.C35112Md.A00(r9, r0)
            r14 = 2131838048(0x7f114460, float:1.9309308E38)
            r13 = 61
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r3 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r3.<init>((int) r13, (java.lang.Object) r9, (java.lang.Object) r4, (java.lang.Object) r2)
            X.3Xk r13 = new X.3Xk
            r13.<init>((android.view.View.OnClickListener) r3, (int) r14)
            java.lang.Boolean r3 = r4.A03
            if (r3 == 0) goto L_0x023f
            X.CTd r3 = r2.A02
            android.content.Context r14 = r3.requireContext()
            java.lang.Boolean r3 = r4.A03
            boolean r4 = X.C18190wL.A1Z(r3, r8)
            r3 = 2131826102(0x7f1115b6, float:1.9285079E38)
            if (r4 == 0) goto L_0x0239
            r3 = 2131826103(0x7f1115b7, float:1.928508E38)
        L_0x0239:
            java.lang.String r3 = r14.getString(r3)
            r13.A04 = r3
        L_0x023f:
            r1.add(r13)
        L_0x0242:
            java.lang.String r3 = "business"
            boolean r3 = X.C04220Ms.A0I(r11, r3)
            if (r3 == 0) goto L_0x03cc
            X.266 r4 = r7.A0g()
            X.266 r3 = X.AnonymousClass266.A04
            if (r4 != r3) goto L_0x03cc
            r3 = 36327284361144267(0x810f79000027cb, double:3.0368591359960934E-306)
            boolean r3 = X.C63803iN.A0E(r6, r0, r3)
            if (r3 == 0) goto L_0x03cc
            com.facebook.common.callercontext.CallerContext r15 = A09
            java.lang.String r16 = "ig_android_ig_business_asset_ig_business_settings"
            java.lang.String r17 = "ig_settings_business"
            java.lang.String r18 = "settings_business"
            java.lang.String r19 = "loading"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r14 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2
            r14.<init>((com.facebook.common.callercontext.CallerContext) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19)
            int r13 = r1.size()
            X.4sb r11 = X.AnonymousClass3LA.A01(r0)
            X.42T r4 = X.AnonymousClass42T.A00
            X.42V r3 = new X.42V
            r3.<init>(r9, r2, r1, r13)
            r11.AML(r14, r4, r3)
        L_0x027e:
            boolean r3 = r7.A3I()
            if (r3 == 0) goto L_0x02a7
            r3 = 36312131716514655(0x8101b10000035f, double:3.027276542517524E-306)
            boolean r3 = X.C63803iN.A0E(r6, r0, r3)
            if (r3 == 0) goto L_0x02a7
            X.0TJ r9 = X.AnonymousClass0TJ.A06
            r3 = 36316400914009181(0x81059300000c5d, double:3.029976400203741E-306)
            boolean r3 = X.C63803iN.A0E(r9, r0, r3)
            r4 = 2131822780(0x7f1108bc, float:1.9278341E38)
            if (r3 == 0) goto L_0x02a2
            r4 = 2131822784(0x7f1108c0, float:1.927835E38)
        L_0x02a2:
            r3 = 147(0x93, float:2.06E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x02a7:
            r3 = 36327958671010030(0x811016000028ee, double:3.03728557227043E-306)
            boolean r3 = X.C63803iN.A0E(r6, r0, r3)
            if (r3 == 0) goto L_0x02ba
            r4 = 2131830241(0x7f1125e1, float:1.9293474E38)
            r3 = 151(0x97, float:2.12E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x02ba:
            X.266 r3 = X.C18200wM.A0b(r0, r5)
            X.266 r9 = X.AnonymousClass266.A04
            if (r3 == r9) goto L_0x02c8
            X.266 r3 = X.C18200wM.A0b(r0, r5)
            if (r3 != r12) goto L_0x02d0
        L_0x02c8:
            r4 = 2131822791(0x7f1108c7, float:1.9278363E38)
            r3 = 152(0x98, float:2.13E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x02d0:
            r4 = 2131830685(0x7f11279d, float:1.9294374E38)
            r3 = 140(0x8c, float:1.96E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
            X.MeW r3 = X.C18240wQ.A0W(r0, r5)
            java.lang.Boolean r3 = r3.BWp()
            if (r3 == 0) goto L_0x02f0
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x02f0
            r4 = 2131823242(0x7f110a8a, float:1.9279278E38)
            r3 = 142(0x8e, float:1.99E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
        L_0x02f0:
            r3 = 36314708696959104(0x81040900010880, double:3.028906235327261E-306)
            boolean r3 = X.C63803iN.A0E(r6, r0, r3)
            if (r3 == 0) goto L_0x0322
            r3 = 3
            kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67 r4 = new kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67
            r4.<init>(r0, r3)
            java.lang.Class<X.3Ey> r3 = X.C58313Ey.class
            java.lang.Object r13 = r0.A01(r3, r4)
            X.3Ey r13 = (X.C58313Ey) r13
            X.29T r11 = X.AnonymousClass29T.CREATOR_SETTINGS
            X.28e r4 = X.C315828e.IMPRESSION
            java.lang.String r3 = "entrypoint"
            r13.A00(r4, r11, r3)
            r4 = 2131829091(0x7f112163, float:1.9291141E38)
            r3 = 186(0xba, float:2.6E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r3 = X.C18200wM.A0R(r2, r13, r3)
            X.4MA r3 = X.AnonymousClass4MA.A00(r3, r4)
            r1.add(r3)
        L_0x0322:
            java.util.List r4 = r7.A1V()
            if (r4 == 0) goto L_0x0369
            java.lang.String r3 = "SHOPPING_SETTINGS_ROW"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0369
            X.MeW r3 = r7.A05
            X.4sq r4 = r3.AYV()
            if (r4 == 0) goto L_0x03bd
            java.lang.Boolean r3 = r4.BSG()
            boolean r3 = X.C18190wL.A1Z(r3, r8)
            if (r3 == 0) goto L_0x03bd
            java.lang.String r4 = r4.BAg()
            if (r4 != 0) goto L_0x034a
            java.lang.String r4 = ""
        L_0x034a:
            r3 = 188(0xbc, float:2.63E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r3 = X.C18200wM.A0R(r2, r7, r3)
            X.3Xg r7 = new X.3Xg
            r7.<init>((java.lang.CharSequence) r4, (android.view.View.OnClickListener) r3)
        L_0x0355:
            r3 = 36321537694899082(0x810a3f00001b8a, double:3.033224921122671E-306)
            boolean r4 = X.C63803iN.A0E(r6, r0, r3)
            r3 = 2131100091(0x7f0601bb, float:1.7812554E38)
            if (r4 == 0) goto L_0x0366
            r3 = 2131100092(0x7f0601bc, float:1.7812556E38)
        L_0x0366:
            X.C62133Xg.A00(r10, r7, r1, r3)
        L_0x0369:
            r3 = 36321537694899082(0x810a3f00001b8a, double:3.033224921122671E-306)
            boolean r3 = X.C63803iN.A0E(r6, r0, r3)
            if (r3 == 0) goto L_0x0385
            X.3Vj r4 = r2.A00
            java.lang.String r3 = "Required value was null."
            if (r4 == 0) goto L_0x04ba
            java.lang.Integer r3 = X.AnonymousClass006.A01
            r4.A02(r3, r1)
            r4.A03(r3, r1)
            X.AnonymousClass3YG.A00(r10, r0, r1)
        L_0x0385:
            X.266 r3 = X.C18200wM.A0b(r0, r5)
            if (r3 != r12) goto L_0x03ab
            r3 = 36326395302913578(0x810eaa0000262a, double:3.0362968919910555E-306)
            boolean r3 = X.C63803iN.A0E(r6, r0, r3)
            if (r3 == 0) goto L_0x03ab
        L_0x0396:
            r3 = 2131826678(0x7f1117f6, float:1.9286247E38)
            r0 = 148(0x94, float:2.07E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r2, r0)
            X.3Xg r2 = new X.3Xg
            r2.<init>((android.view.View.OnClickListener) r0, (int) r3)
            r0 = 2131100091(0x7f0601bb, float:1.7812554E38)
            X.C62133Xg.A00(r10, r2, r1, r0)
        L_0x03aa:
            return
        L_0x03ab:
            X.266 r3 = X.C18200wM.A0b(r0, r5)
            if (r3 != r9) goto L_0x03aa
            r3 = 36326395302913578(0x810eaa0000262a, double:3.0362968919910555E-306)
            boolean r0 = X.C63803iN.A0E(r6, r0, r3)
            if (r0 == 0) goto L_0x03aa
            goto L_0x0396
        L_0x03bd:
            r4 = 2131828997(0x7f112105, float:1.929095E38)
            r3 = 189(0xbd, float:2.65E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r3 = X.C18200wM.A0R(r2, r7, r3)
            X.3Xg r7 = new X.3Xg
            r7.<init>((android.view.View.OnClickListener) r3, (int) r4)
            goto L_0x0355
        L_0x03cc:
            java.lang.String r3 = r7.A17()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0401
            boolean r3 = r7.A3Z()
            if (r3 == 0) goto L_0x0401
        L_0x03dc:
            java.lang.String r3 = r7.A17()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x03ef
            boolean r3 = r7.A3Z()
            r4 = 2131824301(0x7f110ead, float:1.9281426E38)
            if (r3 != 0) goto L_0x03f2
        L_0x03ef:
            r4 = 2131823297(0x7f110ac1, float:1.927939E38)
        L_0x03f2:
            r3 = 184(0xb8, float:2.58E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r3 = X.C18200wM.A0R(r2, r9, r3)
            X.4MA r3 = X.AnonymousClass4MA.A00(r3, r4)
            r1.add(r3)
            goto L_0x027e
        L_0x0401:
            boolean r3 = r7.A2j()
            if (r3 == 0) goto L_0x027e
            goto L_0x03dc
        L_0x0408:
            com.instagram.quickpromotion.intf.QPTooltipAnchor r4 = com.instagram.quickpromotion.intf.QPTooltipAnchor.A16
            X.361 r3 = new X.361
            r3.<init>(r2)
            X.1xj r8 = new X.1xj
            r8.<init>(r9, r4, r3)
            goto L_0x01cd
        L_0x0416:
            r4 = 2131834897(0x7f113811, float:1.9302917E38)
            r3 = 159(0x9f, float:2.23E-43)
            X.AnonymousClass4MA.A04(r2, r1, r3, r4)
            goto L_0x01b6
        L_0x0420:
            boolean r3 = r7.A2x()
            if (r3 == 0) goto L_0x042d
            r4 = 2131835810(0x7f113ba2, float:1.930477E38)
            r3 = 154(0x9a, float:2.16E-43)
            goto L_0x0114
        L_0x042d:
            boolean r3 = r7.A2m()
            if (r3 != 0) goto L_0x0441
            java.util.List r4 = X.C18230wP.A0v(r0, r5)
            if (r4 == 0) goto L_0x0448
            java.lang.String r3 = "POLICY_MIGRATION_SHOPPING_SETTINGS"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0448
        L_0x0441:
            r4 = 2131835810(0x7f113ba2, float:1.930477E38)
            r3 = 155(0x9b, float:2.17E-43)
            goto L_0x0114
        L_0x0448:
            java.util.List r4 = X.C18230wP.A0v(r0, r5)
            if (r4 == 0) goto L_0x0457
            java.lang.String r3 = "SHOP_INVENTORY_SHOPPING_SETTINGS"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0457
            goto L_0x0441
        L_0x0457:
            java.util.List r4 = X.C18230wP.A0v(r0, r5)
            if (r4 == 0) goto L_0x0466
            java.lang.String r3 = "DOMAIN_CHANGE_SHOPPING_SETTINGS"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0466
            goto L_0x0441
        L_0x0466:
            boolean r3 = X.C49532rX.A00(r0)
            if (r3 != 0) goto L_0x0441
            java.util.List r4 = X.C18230wP.A0v(r0, r5)
            if (r4 == 0) goto L_0x047b
            java.lang.String r3 = "CHECKOUT_SETUP_SHOPPING_SETTINGS"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x047b
            goto L_0x0441
        L_0x047b:
            java.util.List r4 = X.C18230wP.A0v(r0, r5)
            if (r4 == 0) goto L_0x048a
            java.lang.String r3 = "CHECKOUT_DEFERRED_PAYOUT_SHOPPING_SETTINGS"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x048a
            goto L_0x0441
        L_0x048a:
            java.util.List r4 = X.C18230wP.A0v(r0, r5)
            if (r4 == 0) goto L_0x0499
            java.lang.String r3 = "CHECKOUT_UPSELL_SHOPPING_SETTINGS"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0499
            goto L_0x0441
        L_0x0499:
            boolean r3 = X.AnonymousClass3T7.A00(r0)
            if (r3 != 0) goto L_0x0441
            X.CTd r8 = r2.A02
            com.instagram.base.activity.BaseFragmentActivity r6 = r2.A01
            if (r6 == 0) goto L_0x04c4
            boolean r3 = X.C25790Ds3.A04(r0)
            if (r3 == 0) goto L_0x0117
            java.lang.Class<X.491> r4 = X.AnonymousClass491.class
            r3 = 31
            java.lang.Object r3 = X.C18180wK.A0c(r0, r4, r3)
            X.491 r3 = (X.AnonymousClass491) r3
            r3.A00(r8, r6)
            goto L_0x0117
        L_0x04ba:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)
            throw r0
        L_0x04bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x04c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67193z5.A01(X.0kW, java.lang.String, java.util.List, java.util.List):void");
    }

    public final boolean A02() {
        C04620Ok r0 = C06810aP.A01;
        UserSession userSession = this.A04;
        if (!r0.A01(userSession).A3a() || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36312015752463164L)) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        Bundle bundle = this.A02.mArguments;
        if (bundle != null) {
            bundle.getBoolean("is_entered_from_QP", false);
        }
        C04620Ok r0 = C06810aP.A01;
        UserSession userSession = this.A04;
        if (!r0.A01(userSession).A3a() || !C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36316753101524282L)) {
            return false;
        }
        return true;
    }

    public C67193z5(C22302CTd cTd, UserSession userSession, C29201xU r6, C29201xU r7, String str) {
        C61783Vj r0;
        AnonymousClass0wJ.A1Q(userSession, str);
        this.A02 = cTd;
        this.A04 = userSession;
        this.A08 = str;
        this.A01 = (BaseFragmentActivity) cTd.getActivity();
        this.A07 = AnonymousClass0wJ.A0Y(userSession);
        this.A05 = r6;
        this.A06 = r7;
        if (A02()) {
            KK1.A00(this.A04).A06();
        }
        if (A03()) {
            C35112Md.A00(this.A02, this.A04).A00();
        }
        this.A03 = AnonymousClass2RN.A00(userSession);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321537694899082L)) {
            r0 = new C61783Vj(cTd, userSession);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
