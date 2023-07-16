package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.1fR  reason: invalid class name */
public final class AnonymousClass1fR extends C34727Idy {
    public final AnonymousClass1gT A00;
    public final List A01;
    public final List A02;

    public AnonymousClass1fR(C85874vu r2, UserSession userSession, User user, List list, List list2) {
        C04220Ms.A0B(userSession, 5);
        this.A01 = list;
        this.A02 = list2;
        AnonymousClass1gT r0 = new AnonymousClass1gT(r2, userSession, user);
        this.A00 = r0;
        init(r0);
    }
}
