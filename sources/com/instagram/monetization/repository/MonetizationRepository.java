package com.instagram.monetization.repository;

import X.AnonymousClass0i4;
import X.AnonymousClass0wJ;
import X.AnonymousClass2FJ;
import X.AnonymousClass3WS;
import X.AnonymousClass68D;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C27457Enn;
import X.C28161tl;
import X.C86074wE;
import X.C86094wG;
import X.C89895Hl;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import com.instagram.api.schemas.CanUseCreatorMonetizationProduct;
import com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.service.session.UserSession;
import com.instagram.userpay.api.UserPayApi;
import java.util.HashMap;

public final class MonetizationRepository implements AnonymousClass0i4 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final MonetizationApi A06;
    public final C28161tl A07;
    public final UserSession A08;
    public final UserPayApi A09;
    public final HashMap A0A = AnonymousClass0wJ.A0y();
    public final HashMap A0B = AnonymousClass0wJ.A0y();
    public final HashMap A0C = AnonymousClass0wJ.A0y();
    public final C86074wE A0D;
    public final C86094wG A0E;
    public final HashMap A0F = AnonymousClass0wJ.A0y();
    public final HashMap A0G = AnonymousClass0wJ.A0y();

    public final void A01(C89895Hl r9) {
        MonetizationEligibilityDecision monetizationEligibilityDecision;
        IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting;
        MonetizationEligibilityDecision monetizationEligibilityDecision2;
        IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting2;
        IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting3;
        C04220Ms.A0B(r9, 0);
        UserMonetizationProductType userMonetizationProductType = r9.A08;
        UserMonetizationProductType A002 = AnonymousClass2FJ.A00(userMonetizationProductType.A00);
        boolean z = r9.A0A;
        C04220Ms.A0B(A002, 0);
        this.A0C.put(A002, Boolean.valueOf(z));
        boolean z2 = false;
        this.A0B.put(A002, Boolean.valueOf(AnonymousClass0wJ.A1T(r9.A09 ? 1 : 0, 1)));
        A03(A002, C18180wK.A1Z(r9.A06, HasOnboardedCreatorMonetizationProduct.HAS_COMPLETED_ONBOARDING));
        CanUseCreatorMonetizationProduct canUseCreatorMonetizationProduct = r9.A05;
        CanUseCreatorMonetizationProduct canUseCreatorMonetizationProduct2 = CanUseCreatorMonetizationProduct.CAN_USE_PRODUCT;
        A02(A002, C18180wK.A1Z(canUseCreatorMonetizationProduct, canUseCreatorMonetizationProduct2));
        if (A002 == UserMonetizationProductType.FAN_CLUB_CREATOR) {
            KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2 = r9.A01;
            if (ktCSuperShape0S0110000_I2 != null && ktCSuperShape0S0110000_I2.A01) {
                z2 = true;
            }
            this.A05 = z2;
        }
        if (userMonetizationProductType == UserMonetizationProductType.REVSHARE) {
            if (canUseCreatorMonetizationProduct == canUseCreatorMonetizationProduct2) {
                monetizationEligibilityDecision2 = MonetizationEligibilityDecision.ELIGIBLE;
            } else {
                monetizationEligibilityDecision2 = MonetizationEligibilityDecision.NOT_ELIGIBLE;
            }
            C04220Ms.A0B(monetizationEligibilityDecision2, 0);
            this.A03 = monetizationEligibilityDecision2.A00;
            KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I2 = r9.A04;
            if (ktCSuperShape0S0400000_I2 == null || (iGTVAccountLevelMonetizationToggleSetting2 = (IGTVAccountLevelMonetizationToggleSetting) ktCSuperShape0S0400000_I2.A00) == null) {
                iGTVAccountLevelMonetizationToggleSetting2 = IGTVAccountLevelMonetizationToggleSetting.TOGGLED_OFF;
            }
            C04220Ms.A0B(iGTVAccountLevelMonetizationToggleSetting2, 0);
            this.A02 = iGTVAccountLevelMonetizationToggleSetting2.A00;
            if (ktCSuperShape0S0400000_I2 == null || (iGTVAccountLevelMonetizationToggleSetting3 = (IGTVAccountLevelMonetizationToggleSetting) ktCSuperShape0S0400000_I2.A02) == null) {
                iGTVAccountLevelMonetizationToggleSetting3 = IGTVAccountLevelMonetizationToggleSetting.TOGGLED_OFF;
            }
            C04220Ms.A0B(iGTVAccountLevelMonetizationToggleSetting3, 0);
            this.A01 = iGTVAccountLevelMonetizationToggleSetting3.A00;
        } else if (userMonetizationProductType == UserMonetizationProductType.REELS_OVERLAY_ADS) {
            if (canUseCreatorMonetizationProduct == canUseCreatorMonetizationProduct2) {
                monetizationEligibilityDecision = MonetizationEligibilityDecision.ELIGIBLE;
            } else {
                monetizationEligibilityDecision = MonetizationEligibilityDecision.NOT_ELIGIBLE;
            }
            C04220Ms.A0B(monetizationEligibilityDecision, 0);
            this.A04 = monetizationEligibilityDecision.A00;
            KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I22 = r9.A04;
            if (ktCSuperShape0S0400000_I22 == null || (iGTVAccountLevelMonetizationToggleSetting = (IGTVAccountLevelMonetizationToggleSetting) ktCSuperShape0S0400000_I22.A03) == null) {
                iGTVAccountLevelMonetizationToggleSetting = IGTVAccountLevelMonetizationToggleSetting.TOGGLED_OFF;
            }
            C04220Ms.A0B(iGTVAccountLevelMonetizationToggleSetting, 0);
            this.A00 = iGTVAccountLevelMonetizationToggleSetting.A00;
        }
    }

    public final void A02(UserMonetizationProductType userMonetizationProductType, boolean z) {
        C04220Ms.A0B(userMonetizationProductType, 0);
        this.A0F.put(userMonetizationProductType, Boolean.valueOf(z));
    }

    public final void A03(UserMonetizationProductType userMonetizationProductType, boolean z) {
        C04220Ms.A0B(userMonetizationProductType, 0);
        this.A0A.put(userMonetizationProductType, Boolean.valueOf(z));
    }

    public final boolean A04(UserMonetizationProductType userMonetizationProductType) {
        C04220Ms.A0B(userMonetizationProductType, 0);
        return C18190wL.A1Z(this.A0F.get(userMonetizationProductType), true);
    }

    public final boolean A05(UserMonetizationProductType userMonetizationProductType) {
        C04220Ms.A0B(userMonetizationProductType, 0);
        return C18190wL.A1Z(this.A0A.get(userMonetizationProductType), true);
    }

    public final boolean A06(UserMonetizationProductType userMonetizationProductType) {
        C04220Ms.A0B(userMonetizationProductType, 0);
        return C18190wL.A1Z(this.A0B.get(userMonetizationProductType), true);
    }

    public final boolean A07(UserMonetizationProductType userMonetizationProductType) {
        C04220Ms.A0B(userMonetizationProductType, 0);
        return C18190wL.A1Z(this.A0C.get(userMonetizationProductType), true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.api.schemas.UserMonetizationProductType r9, X.C146958n9 r10) {
        /*
            r8 = this;
            r3 = 24
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3.A00(r3, r10)
            if (r0 == 0) goto L_0x0078
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0078
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r1) goto L_0x0053
            if (r0 != r6) goto L_0x007e
            X.AnonymousClass0OU.A00(r3)
        L_0x0027:
            kotlin.Unit r4 = kotlin.Unit.A00
        L_0x0029:
            return r4
        L_0x002a:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.monetization.api.MonetizationApi r2 = r8.A06
            java.lang.String r0 = r9.A00
            r5.A01 = r8
            r5.A00 = r1
            java.util.List r1 = X.C18180wK.A0n(r0)
            com.instagram.service.session.UserSession r0 = r2.A00
            X.H8c r3 = com.instagram.monetization.api.MonetizationApi.A00(r0, r1)
            r2 = 352238759(0x14febca7, float:2.5721856E-26)
            r1 = 0
            r0 = 14
            X.4tk r1 = X.C63623hv.A03(r3, r2, r1, r0)
            r0 = 22
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r3 = X.C86124wJ.A0V(r1, r0)
            if (r3 == r4) goto L_0x0029
            r7 = r8
            goto L_0x0058
        L_0x0053:
            java.lang.Object r7 = r5.A01
            X.AnonymousClass0OU.A00(r3)
        L_0x0058:
            X.4tk r3 = (X.C84714tk) r3
            r1 = 0
            r0 = 86
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r2 = new com.facebook.redex.IDxFCollectorShape230S0100000_2_I2
            r2.<init>(r7, r0)
            r5.A01 = r1
            r5.A00 = r6
            r1 = 43
            com.facebook.redex.IDxFCollectorShape84S0200000_2_I2 r0 = new com.facebook.redex.IDxFCollectorShape84S0200000_2_I2
            r0.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r2)
            java.lang.Object r0 = r3.collect(r0, r5)
            if (r0 == r4) goto L_0x0075
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0075:
            if (r0 != r4) goto L_0x0027
            return r4
        L_0x0078:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3
            r5.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x007e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.repository.MonetizationRepository.A00(com.instagram.api.schemas.UserMonetizationProductType, X.8n9):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        this.A0C.clear();
    }

    public MonetizationRepository(UserSession userSession) {
        this.A08 = userSession;
        this.A07 = AnonymousClass3WS.A01(userSession);
        this.A06 = new MonetizationApi(userSession);
        this.A09 = new UserPayApi(userSession);
        C27457Enn A0z = C18190wL.A0z(AnonymousClass68D.LOADING);
        this.A0D = A0z;
        this.A0E = A0z;
        String str = IGTVAccountLevelMonetizationToggleSetting.TOGGLED_OFF.A00;
        this.A02 = str;
        this.A01 = str;
        this.A00 = str;
        this.A03 = "not_eligible";
        this.A04 = "not_eligible";
    }
}
