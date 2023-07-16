package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2;
import com.facebook.redex.IDxCListenerShape42S0300000_2_I2;
import com.facebook.redex.IDxFlowShape251S0100000_2_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.barcelona.R;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0420000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0210000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;

/* renamed from: X.58H  reason: invalid class name */
public final class AnonymousClass58H extends C62793ak {
    public final C122027Jo A00;
    public final C111006md A01;
    public final OnboardingRepository A02;
    public final MonetizationRepository A03;
    public final UserSession A04;
    public final C86064wD A05;
    public final C84714tk A06;
    public final C84714tk A07;
    public final C86074wE A08;
    public final C86074wE A09;
    public final C86074wE A0A;
    public final C86074wE A0B;
    public final AnonymousClass6LN A0C;
    public final AnonymousClass6LT A0D;

    public AnonymousClass58H(C122027Jo r14, AnonymousClass6LN r15, C111006md r16, AnonymousClass6LT r17, OnboardingRepository onboardingRepository, MonetizationRepository monetizationRepository, UserSession userSession) {
        OnboardingRepository onboardingRepository2 = onboardingRepository;
        MonetizationRepository monetizationRepository2 = monetizationRepository;
        AnonymousClass0wJ.A1R(monetizationRepository2, onboardingRepository2);
        AnonymousClass6LT r4 = r17;
        C04220Ms.A0B(r4, 7);
        this.A04 = userSession;
        this.A01 = r16;
        this.A03 = monetizationRepository2;
        this.A02 = onboardingRepository2;
        this.A0C = r15;
        this.A00 = r14;
        this.A0D = r4;
        C27442EnY enY = new C27442EnY();
        this.A05 = enY;
        this.A06 = AnonymousClass7C4.A02(enY);
        C27457Enn A0z = C18190wL.A0z(true);
        this.A0A = A0z;
        C27457Enn A0z2 = C18190wL.A0z(false);
        this.A08 = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(false);
        this.A09 = A0z3;
        C27457Enn A0z4 = C18190wL.A0z(DIV.A01);
        this.A0B = A0z4;
        this.A07 = C86144wL.A0O(new KtSLambdaShape3S0101000_I2(42, (C146958n9) null), C25807DsL.A04(new KtSLambdaShape0S0420000_I2(this, (C146958n9) null, 0), A0z, A0z2, new IDxFlowShape251S0100000_2_I2(new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) new KtSLambdaShape5S0200000_I2(this, (C146958n9) null, 14), (C84714tk) this.A03.A0E, 34), 3), new IDxFlowShape251S0100000_2_I2(new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) new KtSLambdaShape5S0200000_I2(this, (C146958n9) null, 15), (C84714tk) this.A01.A05, 34), 4), C25807DsL.A01(new KtSLambdaShape1S0210000_I2(this, (C146958n9) null, 0), A0z4, A0z3)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r3 = com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl.EstimatedEarnings.class;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A00(com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl r6) {
        /*
            java.lang.String r5 = "date_range_start_timestamp"
            boolean r0 = r6.hasFieldValue(r5)
            r4 = 0
            if (r0 == 0) goto L_0x004c
            java.lang.Class<com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl$EstimatedEarnings> r3 = com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl.EstimatedEarnings.class
            java.lang.String r2 = "estimated_earnings"
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r2, r3)
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = "amount_with_offset"
            java.lang.String r0 = r0.getStringValue(r1)
            if (r0 == 0) goto L_0x004c
            java.lang.Long r0 = X.AnonymousClass4n2.A02(r0)
            if (r0 == 0) goto L_0x004c
            int r0 = r6.getIntValue(r5)
            long r4 = (long) r0
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r2, r3)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r0.getStringValue(r1)
            if (r0 == 0) goto L_0x004d
            java.lang.Long r0 = X.AnonymousClass4n2.A02(r0)
            if (r0 == 0) goto L_0x004d
            long r2 = r0.longValue()
        L_0x003c:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            java.util.Map r4 = X.AnonymousClass4WK.A0O(r0)
        L_0x004c:
            return r4
        L_0x004d:
            r2 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58H.A00(com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl):java.util.Map");
    }

    public static final void A01(KtCSuperShape0S1110000_I2 ktCSuperShape0S1110000_I2, AnonymousClass5HR r13, AnonymousClass58H r14) {
        Map map;
        C122027Jo r3 = r14.A00;
        Integer num = AnonymousClass006.A01;
        Integer num2 = AnonymousClass006.A0u;
        Boolean valueOf = Boolean.valueOf(r13.A04);
        Boolean valueOf2 = Boolean.valueOf(r13.A01);
        if (ktCSuperShape0S1110000_I2 != null) {
            map = (Map) ktCSuperShape0S1110000_I2.A00;
        } else {
            map = null;
        }
        C122027Jo.A02(r3, valueOf, valueOf2, Boolean.valueOf(r13.A02), Boolean.valueOf(r13.A03), num, num2, map, (Map) null, (Map) null, 288);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1101000_I2(r14, "https://help.instagram.com/738469380549477", (C146958n9) null, 0), AnonymousClass3J5.A00(r14), 3);
    }

    public final C27700Erq A03(KtCSuperShape0S1110000_I2 ktCSuperShape0S1110000_I2, AnonymousClass5HR r23) {
        Integer num;
        Integer num2;
        int i;
        AnonymousClass5HR r3 = r23;
        MonetizationEligibilityDecision monetizationEligibilityDecision = r3.A00;
        int ordinal = monetizationEligibilityDecision.ordinal();
        if (ordinal == 1) {
            num = Integer.valueOf(R.drawable.instagram_circle_check_pano_outline_24);
            num2 = Integer.valueOf(R.color.igds_success);
            i = 2131821419;
        } else if (ordinal == 5) {
            num = Integer.valueOf(R.drawable.instagram_warning_pano_outline_24);
            num2 = Integer.valueOf(R.color.activator_card_progress_bad);
            i = 2131821418;
        } else if (ordinal == 3 || ordinal == 2) {
            num = Integer.valueOf(R.drawable.instagram_circle_x_pano_outline_24);
            num2 = Integer.valueOf(R.color.igds_error_or_destructive);
            i = 2131821421;
        } else {
            throw C18190wL.A0a(AnonymousClass0wJ.A0t("Unsupported eligibility decision type ", monetizationEligibilityDecision));
        }
        Integer valueOf = Integer.valueOf(i);
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        int intValue3 = valueOf.intValue();
        return new EK3(new IDxCListenerShape42S0300000_2_I2(11, (Object) this, (Object) ktCSuperShape0S1110000_I2, (Object) r3), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (AnonymousClass0ZU) null, 524272, false, false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r13.A01 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A04(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r12, X.AnonymousClass5HR r13) {
        /*
            r11 = this;
            boolean r9 = r13.A04
            if (r9 != 0) goto L_0x000b
            boolean r0 = r13.A03
            if (r0 != 0) goto L_0x000b
            X.0ZV r2 = X.AnonymousClass0ZV.A00
            return r2
        L_0x000b:
            X.8AN r2 = new X.8AN
            r2.<init>()
            if (r9 == 0) goto L_0x0017
            boolean r0 = r13.A01
            r8 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r8 = 0
        L_0x0018:
            X.7w0 r5 = new X.7w0
            r5.<init>(r12, r13, r11)
            r4 = 0
            r6 = 2131299018(0x7f090aca, float:1.8216026E38)
            r7 = 2131821429(0x7f110375, float:1.92756E38)
            r10 = 1
            X.EK2 r3 = new X.EK2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.add(r3)
            if (r9 == 0) goto L_0x004c
            com.instagram.service.session.UserSession r4 = r11.A04
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325854137230624(0x810e2c00032520, double:3.035954656634056E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            r1 = 2131821430(0x7f110376, float:1.9275603E38)
            if (r0 == 0) goto L_0x0044
            r1 = 2131821431(0x7f110377, float:1.9275605E38)
        L_0x0044:
            X.7wD r0 = new X.7wD
            r0.<init>(r1)
            r2.add(r0)
        L_0x004c:
            X.AnonymousClass0OP.A11(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58H.A04(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2, X.5HR):java.util.List");
    }

    public final void A05() {
        if (AnonymousClass0wJ.A1X(this.A08.getValue())) {
            A07(true);
            return;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(this, (C146958n9) null, 35), AnonymousClass3J5.A00(this), 3);
    }

    public final void A06(Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Integer num;
        C122027Jo r0 = this.A00;
        if (z) {
            num = AnonymousClass006.A0Y;
        } else {
            num = AnonymousClass006.A15;
        }
        r0.A06(Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), num, map);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0111000_I2((Object) this, (C146958n9) null, 0, z), AnonymousClass3J5.A00(this), 3);
    }

    public final void onCleared() {
        this.A03.A0D.CrC(AnonymousClass68D.LOADING);
    }

    public static final void A02(AnonymousClass58H r4, int i) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S0102000_I2(r4, (C146958n9) null, i, 3), AnonymousClass3J5.A00(r4), 3);
    }

    public final void A07(boolean z) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(this, (C146958n9) null, 38), AnonymousClass3J5.A00(this), 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(this, (C146958n9) null, 39), AnonymousClass3J5.A00(this), 3);
        if (z) {
            this.A00.A06((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, AnonymousClass006.A0u, (Map) null);
            C37416Jrb.A0A(C35383Ito.A01, this.A03, C86164wN.A0w(this, 23));
            C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(this, (C146958n9) null, 36), AnonymousClass3J5.A00(this), 3);
            C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(this, (C146958n9) null, 37), AnonymousClass3J5.A00(this), 3);
        }
    }
}
