package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;

/* renamed from: X.4nF  reason: invalid class name and case insensitive filesystem */
public final class C81154nF extends C81174nH implements AnonymousClass0i1 {
    public static final C11630kW A03 = AnonymousClass44B.A00;
    public final AnonymousClass01V A00;
    public final C697149s A01;
    public final UserSession A02;

    public C81154nF(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = (C697149s) userSession.A01(C697149s.class, new KtLambdaShape75S0100000_I2_55(userSession, 45));
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        C04220Ms.A06(r0);
        this.A00 = r0;
    }

    public final void A03(String str) {
        C04220Ms.A0B(str, 0);
        super.A03(str);
        this.A00.markerPoint(444800256, "initial_async_controller_request_failure");
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A02.A03(C81154nF.class);
    }

    public final void A02() {
        super.A02();
        this.A00.markerPoint(444800256, "initial_async_controller_request_success");
    }
}
