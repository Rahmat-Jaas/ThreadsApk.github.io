package X;

import android.content.Context;
import com.instagram.common.task.IDxLTaskShape48S0200000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1nq  reason: invalid class name and case insensitive filesystem */
public final class C25551nq extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25551nq(C697249u r3) {
        super("maybeSyncContactPoints", 359);
        this.A00 = r3;
    }

    public final void loggedRun() {
        C697249u r0 = this.A00;
        Context context = r0.A05;
        UserSession userSession = r0.A06;
        if (C18180wK.A05(C28161tl.A04(userSession), "last_successful_contact_points_auto_sync") <= System.currentTimeMillis() - 259200000 && context != null) {
            C31155GhB.A03(new IDxLTaskShape48S0200000_1_I2(5, context, userSession));
        }
    }
}
