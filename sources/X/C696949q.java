package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

/* renamed from: X.49q  reason: invalid class name and case insensitive filesystem */
public class C696949q implements AnonymousClass0i1 {
    public final UserSession A00;
    public final AnonymousClass0gW A01;

    public C696949q(AnonymousClass0gW r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r2;
    }

    public SharedPreferences A01(D2R d2r) {
        SharedPreferences sharedPreferences;
        C04220Ms.A0B(d2r, 0);
        Context context = C10600ic.A00;
        String A0N = AnonymousClass00U.A0N(this.A00.getUserId(), d2r.A00, '_');
        if (context != null) {
            sharedPreferences = context.getSharedPreferences(A0N, 0);
        } else {
            sharedPreferences = null;
        }
        return new C08400dJ(sharedPreferences);
    }

    public SharedPreferences A02(D2R d2r, Class cls) {
        C04220Ms.A0B(d2r, 0);
        return A01(d2r);
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.A01.AKp(new AnonymousClass1mL(this));
        }
    }

    public static SharedPreferences.Editor A00(C696949q r0, D2R d2r) {
        return r0.A01(d2r).edit();
    }
}
