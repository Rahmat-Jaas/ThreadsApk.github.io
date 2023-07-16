package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.2tC  reason: invalid class name and case insensitive filesystem */
public final class C50562tC {
    public static final AnonymousClass1Xr A00(UserSession userSession, String str) {
        AnonymousClass0wJ.A1N(userSession, str);
        AnonymousClass1Xr r2 = new AnonymousClass1Xr();
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        A0E.putString("arg_media_id", str);
        r2.setArguments(A0E);
        return r2;
    }
}
