package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2;
import com.facebook.redex.IDxFlowShape250S0100000_1_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape25S0201000_I2;
import kotlin.jvm.internal.IDxFReferenceShape178S0000000_1_I2;

/* renamed from: X.10c  reason: invalid class name and case insensitive filesystem */
public final class C195310c extends C62793ak {
    public final AnonymousClass23Z A00;
    public final C84874u0 A01;
    public final C38039KHq A02;
    public final C58783Hg A03;
    public final FanClubPromoAndWelcomeVideoApi A04;
    public final PendingMediaStore A05;
    public final UserSession A06;
    public final C86064wD A07;
    public final C84714tk A08;
    public final C84714tk A09;
    public final C86074wE A0A;
    public final C86074wE A0B;
    public final C86094wG A0C;
    public final boolean A0D;
    public final boolean A0E;

    public /* synthetic */ C195310c(AnonymousClass23Z r9, C38039KHq kHq, C58783Hg r11, FanClubPromoAndWelcomeVideoApi fanClubPromoAndWelcomeVideoApi, PendingMediaStore pendingMediaStore, UserSession userSession, boolean z, boolean z2) {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        C04220Ms.A0B(r9, 2);
        C18210wN.A1M(kHq, 7, r11);
        this.A06 = userSession;
        this.A00 = r9;
        this.A0D = z;
        this.A0E = z2;
        this.A05 = pendingMediaStore;
        this.A04 = fanClubPromoAndWelcomeVideoApi;
        this.A02 = kHq;
        this.A03 = r11;
        this.A01 = A0J;
        C27442EnY enY = new C27442EnY();
        this.A07 = enY;
        this.A08 = AnonymousClass7C4.A02(enY);
        C27457Enn A0z = C18190wL.A0z(C18220wO.A0d());
        this.A0A = A0z;
        C27457Enn A0z2 = C18190wL.A0z(new KtCSuperShape0S0100100_I2());
        this.A0B = A0z2;
        IDxFlowShape250S0100000_1_I2 iDxFlowShape250S0100000_1_I2 = new IDxFlowShape250S0100000_1_I2(AnonymousClass7J0.A02(new KtSLambdaShape25S0201000_I2(19, (C146958n9) null), AnonymousClass3XM.A01(new IDxFlowShape93S0200000_1_I2(17, (Object) this, (Object) new AnonymousClass7E6(kHq).A02(C26254E5w.class)))), 18);
        C86094wG A042 = C25753DrP.A04(new KtCSuperShape0S1110000_I2(), AnonymousClass3J5.A00(this), iDxFlowShape250S0100000_1_I2, AnonymousClass74I.A00);
        this.A0C = A042;
        this.A09 = C25807DsL.A02(new IDxFReferenceShape178S0000000_1_I2(this, 1), A0z2, A042, A0z);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(this, (C146958n9) null, 37), AnonymousClass3J5.A00(this), 3);
    }

    public static final BKU A00(KtCSuperShape0S0100100_I2 ktCSuperShape0S0100100_I2, KtCSuperShape0S1110000_I2 ktCSuperShape0S1110000_I2) {
        long j;
        if (ktCSuperShape0S1110000_I2.A02) {
            return null;
        }
        long j2 = ktCSuperShape0S0100100_I2.A00;
        BKU bku = (BKU) ktCSuperShape0S0100100_I2.A01;
        long j3 = 0;
        if (bku != null) {
            j = bku.A1t();
        } else {
            j = 0;
        }
        long max = Math.max(j2, j);
        BKU bku2 = (BKU) ktCSuperShape0S1110000_I2.A00;
        if (bku2 != null) {
            j3 = bku2.A1t();
        }
        if (max > j3) {
            return bku;
        }
        return bku2;
    }

    public static final void A01(C195310c r5) {
        r5.A0B.CrC(new KtCSuperShape0S0100100_I2(C18180wK.A04(), (Object) null, 5));
    }
}
