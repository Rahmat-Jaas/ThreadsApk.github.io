package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7tv  reason: invalid class name and case insensitive filesystem */
public final class C132457tv implements AnonymousClass0i1 {
    public final AnonymousClass3Z0 A00;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static AnonymousClass3Z0 A00(Context context, UserSession userSession) {
        Class<C132457tv> cls = C132457tv.class;
        C132457tv r1 = (C132457tv) userSession.A00(cls);
        if (r1 == null) {
            r1 = new C132457tv(new AnonymousClass3Z0(context, userSession, I17.A00(684)));
            userSession.A04(cls, r1);
        }
        return r1.A00;
    }

    public C132457tv(AnonymousClass3Z0 r1) {
        this.A00 = r1;
    }
}
