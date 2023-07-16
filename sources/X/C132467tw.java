package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4;

/* renamed from: X.7tw  reason: invalid class name and case insensitive filesystem */
public final class C132467tw implements AnonymousClass0i1 {
    public final C1200878l A00;
    public final SharedPreferences A01;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C1200878l A00(C10300i6 r3) {
        return ((C132467tw) r3.A01(C132467tw.class, new KtLambdaShape24S0100000_I2_4(r3, 4))).A00;
    }

    public C132467tw(UserSession userSession) {
        SharedPreferences A02 = AnonymousClass3Zs.A03(userSession).A02(D2R.A0l, C1200878l.class);
        this.A01 = A02;
        this.A00 = new C1200878l(A02, "scroll_speed");
    }
}
