package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.7dd  reason: invalid class name and case insensitive filesystem */
public final class C125627dd implements CallerContextable {
    public static final CallerContext A04 = new CallerContext(C125627dd.class);
    public static final String __redex_internal_original_name = "SsoProviderIg4aImpl";
    public Context A00;
    public C106096eU A01;
    public UserSession A02;
    public C04560Oe A03;

    public C125627dd(Context context, UserSession userSession, C04560Oe r4) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = r4;
        this.A01 = new C106096eU(userSession);
    }
}
