package X;

import android.os.MessageQueue;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.0R1  reason: invalid class name */
public final class AnonymousClass0R1 implements MessageQueue.IdleHandler {
    public final /* synthetic */ AnonymousClass01V A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    public AnonymousClass0R1(AnonymousClass01V r1, UserSession userSession, User user, String str) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = user;
        this.A03 = str;
    }

    public final boolean queueIdle() {
        UserSession userSession = this.A01;
        boolean hasEnded = userSession.hasEnded();
        if (hasEnded) {
            AnonymousClass01V r3 = this.A00;
            r3.markerAnnotate(31784965, "from_pk", userSession.getUserId());
            r3.markerAnnotate(31784965, "to_pk", this.A02.getId());
            r3.markerAnnotate(31784965, "entry_point", this.A03);
            r3.markerEnd(31784965, 2);
        }
        return !hasEnded;
    }
}
