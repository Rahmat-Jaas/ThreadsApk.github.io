package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.3yp  reason: invalid class name and case insensitive filesystem */
public final class C67073yp implements CallerContextable {
    public static final String __redex_internal_original_name = "PendingSessionDelegate";
    public UserSession A00;
    public C313625r A01;
    public Integer A02;
    public boolean A03 = false;
    public boolean A04 = false;

    public final boolean A00() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return C62963bD.A03(CallerContext.A00(C67073yp.class), userSession, "ig_pending_session_delegate");
        }
        return false;
    }
}
