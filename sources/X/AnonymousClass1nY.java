package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1nY  reason: invalid class name */
public final class AnonymousClass1nY extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nY(C697249u r7) {
        super("initUiiDetector", 1241229546, 5, false, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        AnonymousClass0TJ A0J = C18180wK.A0J(userSession);
        if (C63803iN.A0E(A0J, userSession, 36318359419228507L)) {
            C678540u r2 = new C678540u();
            synchronized (C16320sq.class) {
                C16320sq.A00.add(r2);
            }
            User A0Y = AnonymousClass0wJ.A0Y(userSession);
            AnonymousClass31G.A00 = new AnonymousClass3AX(A0Y.getId(), A0Y.BK7(), userSession.token);
            AnonymousClass31G r22 = new AnonymousClass31G();
            int A01 = C63803iN.A01(A0J, userSession, 36599834396003608L);
            boolean A0E = C63803iN.A0E(A0J, userSession, 36318359419359580L);
            List A0n = C18180wK.A0n(r22);
            C14090on A002 = C10770iu.A00();
            C04220Ms.A06(A002);
            AnonymousClass3FI r23 = new AnonymousClass3FI(C13330nS.A02(userSession), A002, A0E);
            Arrays.copyOf(C18210wN.A1Y(Integer.valueOf(A0n.size()), A01), 2);
            C61293Sq r0 = new C61293Sq(r23, A0n, A01);
            synchronized (C550131i.A01) {
                C550131i.A00 = r0;
            }
        }
    }
}
