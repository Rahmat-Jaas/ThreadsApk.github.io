package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.61U  reason: invalid class name */
public final class AnonymousClass61U extends C12140lP {
    public final /* synthetic */ C34653Icf A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61U(C34653Icf icf) {
        super("scrolling_speed_update", 1636287877, 5, false, false);
        this.A00 = icf;
    }

    public final void loggedRun() {
        C34653Icf icf = this.A00;
        UserSession userSession = icf.A0T;
        if (userSession != null) {
            C63643hy.A04(new C38779KgJ(icf, (double) C132467tw.A00(userSession).A00.getFloat(AnonymousClass00U.A0N("scroll_speed", "Result", '_'), 1.0f)));
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
