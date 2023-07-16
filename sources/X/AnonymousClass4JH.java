package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.service.session.UserSession;
import java.util.Iterator;

/* renamed from: X.4JH  reason: invalid class name */
public final class AnonymousClass4JH implements C82924qU {
    public final Context A00;
    public final AnonymousClass06E A01;
    public final UserSession A02;

    public AnonymousClass4JH(Context context, AnonymousClass06E r2, UserSession userSession) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = userSession;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        String path = uri.getPath();
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        if (!path.endsWith("/")) {
            path = AnonymousClass00U.A0L(path, "/");
        }
        C09140ev r5 = C09140ev.A02;
        UserSession userSession = this.A02;
        AnonymousClass3FH A0N = C18220wO.A0N(userSession);
        H1T h1t = new H1T(userSession);
        h1t.A0J(path);
        h1t.A0G(AnonymousClass006.A0Y);
        C18250wR.A16(h1t);
        Context context = this.A00;
        h1t.A0O("device", C09140ev.A00(context));
        h1t.A0O("guid", r5.A05(context));
        C18240wQ.A18(h1t);
        if (A0N != null) {
            str = A0N.A01;
        } else {
            str = "";
        }
        h1t.A0O("phone_id", str);
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            h1t.A0O(A0k, uri.getQueryParameter(A0k));
        }
        C32165H8c A0Q = C18190wL.A0Q(h1t);
        C63873iU.A0E(A0Q, this, 123);
        C31155GhB.A01(context, this.A01, A0Q);
    }
}
