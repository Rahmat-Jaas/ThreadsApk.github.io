package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Be  reason: invalid class name and case insensitive filesystem */
public final class C57473Be {
    public final Activity A00;
    public final C58593Gj A01;
    public final UserSession A02;
    public final Integer A03;

    public C57473Be(Activity activity, UserSession userSession, Integer num) {
        AnonymousClass0wJ.A1O(userSession, activity);
        this.A02 = userSession;
        this.A00 = activity;
        this.A03 = num;
        this.A01 = new C58593Gj(userSession);
    }
}
