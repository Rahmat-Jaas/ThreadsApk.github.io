package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.service.session.UserSession;

/* renamed from: X.77j  reason: invalid class name and case insensitive filesystem */
public final class C1198677j {
    public final Context A00;
    public final UserSession A01;

    public final String A01() {
        String BJN = C15500rQ.A01(this.A01).BJN();
        if (TextUtils.isEmpty(BJN)) {
            BJN = C18200wM.A0g();
        }
        if (TextUtils.isEmpty(BJN)) {
            BJN = C09140ev.A00(this.A00);
        }
        BJN.getClass();
        return BJN;
    }

    public C1198677j(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public static String A00() {
        return AnonymousClass7Kz.A0I().A01();
    }
}
