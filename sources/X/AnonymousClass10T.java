package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0101000_I2_9;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S0110000_I2;

/* renamed from: X.10T  reason: invalid class name */
public final class AnonymousClass10T extends C62793ak {
    public final M5J A00;
    public final AnonymousClass35Z A01;
    public final C86064wD A02;
    public final C84714tk A03;
    public final C86074wE A04;
    public final C86074wE A05;
    public final C86074wE A06;
    public final UserSession A07;
    public final List A08;
    public final C86074wE A09;

    public AnonymousClass10T(AnonymousClass35Z r11, UserSession userSession, List list) {
        this.A07 = userSession;
        this.A08 = list;
        this.A01 = r11;
        Boolean A0X = C18180wK.A0X();
        C27441EnX enX = new C27441EnX();
        this.A02 = enX;
        this.A03 = AnonymousClass7C4.A02(enX);
        C27457Enn A0z = C18190wL.A0z(true);
        this.A05 = A0z;
        C27457Enn A0z2 = C18190wL.A0z(AnonymousClass0ZV.A00);
        this.A09 = A0z2;
        this.A06 = C18190wL.A0z(A0X);
        this.A04 = C18190wL.A0z(A0X);
        C84714tk A012 = C25807DsL.A01(new KtSLambdaShape3S0110000_I2(6, (C146958n9) null), A0z, A0z2);
        this.A00 = C29110FiC.A00((C27952Ew2) null, C25753DrP.A04(C28111tg.A00, AnonymousClass3J5.A00(this), A012, AnonymousClass74I.A00), 3);
        A0z.CrC(true);
        if (list == null || !list.contains(UserMonetizationProductType.REELS_OVERLAY_ADS)) {
            A0z.CrC(A0X);
            A00(this);
            return;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0101000_I2_9(this, (C146958n9) null, 32), AnonymousClass3J5.A00(this), 3);
    }

    public static final void A00(AnonymousClass10T r7) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        List list = r7.A08;
        if (list != null) {
            if (list.contains(UserMonetizationProductType.REELS_OVERLAY_ADS)) {
                if (!C63803iN.A0E(AnonymousClass0TJ.A06, r7.A07, 36318565578445434L)) {
                    A0v.add(new AnonymousClass4F8());
                    A0v.add(new AnonymousClass4FA(AnonymousClass0wJ.A1X(r7.A06.getValue())));
                    A0v.add(new AnonymousClass4F9());
                }
                A0v.add(new AnonymousClass4FB(IGRevShareProductType.REELS_OVERLAY_ADS, 2131821295));
            }
            if (list.contains(UserMonetizationProductType.REVSHARE)) {
                A0v.add(new AnonymousClass4FB(IGRevShareProductType.PROFILE_ADS, 2131821296));
            }
        }
        r7.A09.CrC(A0v);
    }
}
