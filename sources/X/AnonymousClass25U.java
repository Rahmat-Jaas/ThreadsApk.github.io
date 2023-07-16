package X;

import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.25U  reason: invalid class name */
public enum AnonymousClass25U {
    ;
    
    public final ImmutableList A00;

    public final long A00(UserSession userSession) {
        TimeUnit timeUnit;
        AnonymousClass0TJ r2;
        long j;
        if (this instanceof C28911vl) {
            C04220Ms.A0B(userSession, 0);
            timeUnit = TimeUnit.HOURS;
            r2 = AnonymousClass0TJ.A05;
            j = 36607195971916441L;
        } else if (this instanceof C28901vk) {
            C04220Ms.A0B(userSession, 0);
            timeUnit = TimeUnit.HOURS;
            r2 = AnonymousClass0TJ.A05;
            j = 36607195970671254L;
        } else if (!(this instanceof C28891vj)) {
            return 0;
        } else {
            C04220Ms.A0B(userSession, 0);
            timeUnit = TimeUnit.HOURS;
            r2 = AnonymousClass0TJ.A05;
            j = 36607195970736791L;
        }
        return timeUnit.toMillis(C63803iN.A03(r2, userSession, j));
    }

    public final boolean A01(UserSession userSession) {
        AnonymousClass0TJ A0J;
        long j;
        if (this instanceof C28911vl) {
            A0J = C18180wK.A0J(userSession);
        } else {
            boolean z = this instanceof C28901vk;
            A0J = C18180wK.A0J(userSession);
            if (z) {
                j = 36325720994555097L;
                return C63803iN.A0E(A0J, userSession, j);
            }
        }
        j = 36325720994620634L;
        return C63803iN.A0E(A0J, userSession, j);
    }

    /* access modifiers changed from: public */
    AnonymousClass25U(int i) {
        this.A00 = r1;
    }
}
