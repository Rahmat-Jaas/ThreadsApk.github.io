package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape61S0100000_I2_41;

/* renamed from: X.3Gu  reason: invalid class name and case insensitive filesystem */
public final class C58703Gu {
    public final UserSession A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(new KtLambdaShape61S0100000_I2_41(this, 38));

    public C58703Gu(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(Activity activity, C303820v r8, Integer num, Integer num2) {
        C303820v r2 = r8;
        C04220Ms.A0B(r8, 3);
        if (((AnonymousClass49L) this.A01.getValue()).A02()) {
            C63643hy.A04(new AnonymousClass4T5(activity, r2, this, num, num2));
        }
    }

    public final void A01(Activity activity, C303820v r8, Integer num, Integer num2) {
        C303820v r2 = r8;
        Integer num3 = num2;
        AnonymousClass0wJ.A1Q(num2, r8);
        if (((AnonymousClass49L) this.A01.getValue()).A02()) {
            C63643hy.A04(new AnonymousClass4T6(activity, r2, this, num3, num));
        }
    }
}
