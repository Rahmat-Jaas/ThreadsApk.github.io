package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4A8  reason: invalid class name */
public final class AnonymousClass4A8 implements C33841Hva {
    public final /* synthetic */ C28451uI A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ boolean A03;

    public final String getName() {
        return "forceSynchronizeQE";
    }

    public final int getRunnableId() {
        return 259;
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public AnonymousClass4A8(C28451uI r1, UserSession userSession, User user, boolean z) {
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = user;
        this.A03 = z;
    }

    public final void onFinish() {
        C28451uI r5 = this.A00;
        UserSession userSession = this.A01;
        User user = this.A02;
        boolean z = this.A03;
        AnonymousClass3HF r1 = r5.A04;
        if (r1 != null && r1.A00) {
            r1.A00();
        }
        if (z) {
            r5.A02(userSession, user);
        } else {
            r5.A03(user);
        }
    }

    public final void run() {
        C61823Vx.A01.A06(this.A01);
    }
}
