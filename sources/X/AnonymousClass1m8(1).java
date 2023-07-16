package X;

import android.os.SystemClock;
import com.instagram.service.session.UserSession;

/* renamed from: X.1m8  reason: invalid class name */
public final class AnonymousClass1m8 extends AnonymousClass0gG {
    public final /* synthetic */ UserSession A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1m8(UserSession userSession) {
        super(88983322);
        this.A00 = userSession;
    }

    public final void run() {
        C28161tl A01 = AnonymousClass3WS.A01(this.A00);
        AnonymousClass0wJ.A12(C28161tl.A02(A01), "mobile_config_last_sync_time_peak", SystemClock.elapsedRealtime());
    }
}
