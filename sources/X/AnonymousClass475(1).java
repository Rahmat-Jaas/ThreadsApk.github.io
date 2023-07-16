package X;

import android.content.Context;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape119S0100000_I2_99;
import kotlin.jvm.internal.KtLambdaShape34S0200000_I2_18;

/* renamed from: X.475  reason: invalid class name */
public final class AnonymousClass475 implements C82394pY {
    public final C34640IcN A00;
    public final C84844tx A01;
    public final UserSession A02;
    public final C04530Oa A03 = AnonymousClass0OY.A02(new KtLambdaShape119S0100000_I2_99(this, 39));
    public final C04530Oa A04 = AnonymousClass0OY.A02(new KtLambdaShape119S0100000_I2_99(this, 40));

    public AnonymousClass475(C34640IcN icN, C84844tx r4, UserSession userSession) {
        this.A00 = icN;
        this.A02 = userSession;
        this.A01 = r4;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        List A3Y;
        int A032 = C14030oh.A03(-741566676);
        E6C e6c = (E6C) obj;
        int A002 = AnonymousClass0wJ.A00(613594210, e6c);
        BKU bku = e6c.A00.A10;
        if (bku == null || (A3Y = bku.A3Y(C171119w6.A0i)) == null || A3Y.isEmpty()) {
            i = -259614604;
        } else {
            List A3Y2 = bku.A3Y(C171119w6.A0Z);
            List A3Y3 = bku.A3Y(C171119w6.A0c);
            if ((A3Y2 == null || A3Y2.isEmpty()) && (A3Y3 == null || A3Y3.isEmpty())) {
                C04530Oa r1 = this.A04;
                Object A0d = C18180wK.A0d(((AnonymousClass3H0) r1.getValue()).A01);
                C04220Ms.A0A(A0d);
                if (AnonymousClass0wJ.A1X(A0d)) {
                    AnonymousClass3H0 r8 = (AnonymousClass3H0) r1.getValue();
                    C34640IcN icN = this.A00;
                    Context requireContext = icN.requireContext();
                    AnonymousClass06E A003 = AnonymousClass06E.A00(icN);
                    String A33 = bku.A33();
                    C04220Ms.A06(A33);
                    KtLambdaShape34S0200000_I2_18 ktLambdaShape34S0200000_I2_18 = new KtLambdaShape34S0200000_I2_18(30, bku, this);
                    C77104fF r10 = C77104fF.A00;
                    r8.A01(requireContext, A003, r10, new C77514gi(requireContext, A003, icN, r8, A33, r10, ktLambdaShape34S0200000_I2_18));
                } else {
                    UserSession userSession = this.A02;
                    C18180wK.A0v(C63703i9.A00(C63703i9.A00, userSession).edit(), "last_shopping_story_media_id", bku.A0N);
                    ((C70894Gs) this.A01).A05(C18250wR.A0c(Trigger.A1X));
                }
                i = -746433644;
            } else {
                i = 1719782301;
            }
        }
        C14030oh.A0A(i, A002);
        C14030oh.A0A(471483441, A032);
    }
}
