package X;

import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.facebook.redex.IDxFlowShape251S0100000_2_I2;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;
import kotlin.jvm.internal.KtLambdaShape39S0100000_I2_19;

/* renamed from: X.58F  reason: invalid class name */
public final class AnonymousClass58F extends C62793ak {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final M5J A04;
    public final BrandedContentSettingsRepository A05;
    public final C11630kW A06;
    public final MediaKitRepository A07;
    public final MonetizationRepository A08;
    public final C696949q A09;
    public final UserSession A0A;
    public final C04530Oa A0B = AnonymousClass0OY.A02(new KtLambdaShape39S0100000_I2_19(this, 34));
    public final C86064wD A0C;
    public final C84714tk A0D;
    public final C86074wE A0E;
    public final C86094wG A0F;
    public final boolean A0G;

    public AnonymousClass58F(BrandedContentSettingsRepository brandedContentSettingsRepository, C11630kW r13, MediaKitRepository mediaKitRepository, MonetizationRepository monetizationRepository, C696949q r16, UserSession userSession) {
        C04220Ms.A0B(brandedContentSettingsRepository, 3);
        C18190wL.A1S(monetizationRepository, 4, mediaKitRepository);
        C696949q r1 = r16;
        C04220Ms.A0B(r1, 6);
        UserSession userSession2 = userSession;
        this.A0A = userSession2;
        this.A06 = r13;
        this.A05 = brandedContentSettingsRepository;
        this.A08 = monetizationRepository;
        this.A07 = mediaKitRepository;
        this.A09 = r1;
        this.A0G = C18210wN.A1T(AnonymousClass0wJ.A0Y(userSession2).A05.AVK());
        C27457Enn A0z = C18190wL.A0z(DIV.A01);
        this.A0E = A0z;
        this.A0F = A0z;
        this.A04 = C29110FiC.A00((C27952Ew2) null, AnonymousClass7J0.A03(new IDxFlowShape251S0100000_2_I2(new C84714tk[]{A01(brandedContentSettingsRepository.A0C), A01(brandedContentSettingsRepository.A0B), A01(brandedContentSettingsRepository.A0A), A01(brandedContentSettingsRepository.A09), A01(brandedContentSettingsRepository.A08), A01(A0z), A01(mediaKitRepository.A0B)}, 23), AnonymousClass7J0.A00), 3);
        C27441EnX enX = new C27441EnX();
        this.A0C = enX;
        this.A0D = AnonymousClass7C4.A02(enX);
    }

    private final C84714tk A01(C84714tk r4) {
        return AnonymousClass3XM.A01(AnonymousClass7J0.A01(new KtSLambdaShape12S0100000_I2_1(this, (C146958n9) null, 42), r4));
    }

    public static final EK0 A00(C34362Jg r4, AnonymousClass58F r5, boolean z) {
        if (z) {
            return new EK0(C65443tG.A00, (Integer) null, 2131822230, true);
        }
        return new EK0(new IDxCListenerShape70S0200000_1_I2(26, (Object) r5, (Object) r4), 2131826643, 2131822230, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r6 = this;
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT
            com.instagram.api.schemas.UserMonetizationProductType[] r0 = new com.instagram.api.schemas.UserMonetizationProductType[]{r0}
            java.util.List r3 = X.C06750aI.A18(r0)
            com.instagram.service.session.UserSession r5 = r6.A0A
            r0 = 36322108925680827(0x810ac400021cbb, double:3.033586169769208E-306)
            boolean r0 = X.C25771Drk.A05(r5, r0)
            if (r0 == 0) goto L_0x0070
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND
        L_0x0019:
            r3.add(r0)
        L_0x001c:
            X.4qz r2 = X.AnonymousClass3J5.A00(r6)
            r4 = 0
            r1 = 44
            kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r6, (X.C146958n9) r4, (int) r1)
            r3 = 3
            X.C25237DiI.A00(r4, r4, r0, r2, r3)
            boolean r0 = X.C25771Drk.A03(r5)
            if (r0 == 0) goto L_0x0040
            X.4qz r2 = X.AnonymousClass3J5.A00(r6)
            r1 = 41
            kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1
            r0.<init>(r6, r4, r1)
            X.C25237DiI.A00(r4, r4, r0, r2, r3)
        L_0x0040:
            boolean r0 = X.C118066zh.A01(r5)
            if (r0 == 0) goto L_0x0054
            X.4qz r2 = X.AnonymousClass3J5.A00(r6)
            r1 = 27
            kotlin.coroutines.jvm.internal.KtSLambdaShape6S0101000_I2_3 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape6S0101000_I2_3
            r0.<init>(r6, r4, r1)
            X.C25237DiI.A00(r4, r4, r0, r2, r3)
        L_0x0054:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36320944989411753(0x8109b5000019a9, double:3.0328500917858505E-306)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)
            if (r0 == 0) goto L_0x006f
            X.4qz r2 = X.AnonymousClass3J5.A00(r6)
            r1 = 28
            kotlin.coroutines.jvm.internal.KtSLambdaShape6S0101000_I2_3 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape6S0101000_I2_3
            r0.<init>(r6, r4, r1)
            X.C25237DiI.A00(r4, r4, r0, r2, r3)
        L_0x006f:
            return
        L_0x0070:
            r0 = 36314901970421972(0x810436000008d4, double:3.0290284622434286E-306)
            boolean r0 = X.C25771Drk.A05(r5, r0)
            if (r0 == 0) goto L_0x001c
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58F.A03():void");
    }

    public final void onCleared() {
        this.A05.A03.A01();
    }

    public static final void A02(C34362Jg r4, AnonymousClass58F r5) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0201000_I2_2((Object) r4, (Object) r5, (C146958n9) null, 45), AnonymousClass3J5.A00(r5), 3);
    }
}
