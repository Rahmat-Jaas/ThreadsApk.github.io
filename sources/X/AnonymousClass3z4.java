package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.3z4  reason: invalid class name */
public final class AnonymousClass3z4 implements CallerContextable {
    public static final CallerContext A01 = CallerContext.A01(__redex_internal_original_name);
    public static final String __redex_internal_original_name = "FacebookLinkageHelper";
    public final UserSession A00;

    public AnonymousClass3z4(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static /* synthetic */ void A00(AnonymousClass3z4 r4, int i, boolean z, boolean z2) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        synchronized (r4) {
            UserSession userSession = r4.A00;
            C67363zQ.A0E(userSession, z, z2, false);
            C60333Op.A00(userSession).A02((Boolean) null, "legacy_setting_unlink", false, z);
        }
    }
}
