package X;

import android.os.Bundle;
import android.os.PersistableBundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.0RG  reason: invalid class name */
public final class AnonymousClass0RG {
    public final C10300i6 A02(Bundle bundle) {
        C10300i6 A04;
        C04220Ms.A0B(bundle, 0);
        String string = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
        if (string != null) {
            if (string.equals("IgSessionManager.LOGGED_OUT_TOKEN")) {
                A04 = A00().A01;
            } else {
                A04 = A00().A04(string);
            }
            if (A04 != null) {
                return A04;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C10300i6 A03(Object obj) {
        C04220Ms.A0B(obj, 0);
        AnonymousClass0RA A00 = A00();
        C10300i6 r0 = A00.A06.A00;
        if (r0 != null || (r0 = A00.A01) != null) {
            return r0;
        }
        throw new IllegalStateException("Both UserSession and LoggedOutSession are null");
    }

    public final C07530bf A04(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        String string = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
        if (string == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (string.equals("IgSessionManager.LOGGED_OUT_TOKEN")) {
            AnonymousClass0RA A00 = A00();
            C07530bf r2 = A00.A01;
            if (r2 != null) {
                if (!string.equals("IgSessionManager.LOGGED_OUT_TOKEN")) {
                    C10450iM.A03("logged_out_session_token_mismatch", AnonymousClass00U.A0i("requested logged out session (", string, ") does not match current user session (", "IgSessionManager.LOGGED_OUT_TOKEN", ") which was last set by ", AnonymousClass0RA.A0B));
                }
                return r2;
            }
            throw new AnonymousClass0RB("mCurrentLoggedOutSession is null", A00.A00);
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final C07530bf A05(AnonymousClass0RJ r5) {
        C07530bf r0;
        C04220Ms.A0B(r5, 0);
        Class<?> cls = r5.getClass();
        C04220Ms.A0B(cls, 0);
        String name = cls.getName();
        StringBuilder sb = new StringBuilder(name.length() + 11);
        sb.append("<cls>");
        sb.append(name);
        sb.append("</cls>");
        String obj = sb.toString();
        C04220Ms.A06(obj);
        AnonymousClass0RA.A0B = obj;
        AnonymousClass0RA A00 = A00();
        synchronized (A00) {
            C07530bf r1 = A00.A01;
            if (r1 != null && !r1.A02) {
                r1.A05();
            }
            r0 = new C07530bf(A00.A03, A00.A05);
            A00.A01 = r0;
        }
        return r0;
    }

    public final UserSession A06(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        UserSession A04 = A00().A04(bundle.getString("IgSessionManager.SESSION_TOKEN_KEY"));
        if (A04 != null) {
            return A04;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final AnonymousClass0RA A00() {
        C04530Oa r0 = AnonymousClass0RF.A00;
        if (r0 != null) {
            return (AnonymousClass0RA) r0.getValue();
        }
        throw new RuntimeException("IgSessionManager not initialized");
    }

    public final UserSession A07(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
        } else {
            str = null;
        }
        UserSession userSession = A00().A06.A00;
        if (userSession == null || !C05040Qp.A00(str, userSession.token)) {
            return null;
        }
        return userSession;
    }

    public final UserSession A08(PersistableBundle persistableBundle) {
        String str;
        if (persistableBundle != null) {
            str = persistableBundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
        } else {
            str = null;
        }
        UserSession userSession = A00().A06.A00;
        if (userSession == null || !C05040Qp.A00(str, userSession.token)) {
            return null;
        }
        return userSession;
    }

    public static final void A01() {
        AnonymousClass2LP.A00().A02(new AnonymousClass0RH());
    }

    public final boolean A09(C04860Pl r3, C04850Pk r4, AnonymousClass0PT r5, String str) {
        AnonymousClass0QC r1 = A00().A06;
        if (str == null) {
            return false;
        }
        if (r1.A01.A0O(str)) {
            AnonymousClass0QC.A03(r1, r3, r4, r5, str);
            return true;
        }
        StringBuilder sb = new StringBuilder("UserId(");
        sb.append(str);
        sb.append(") requesting operation(");
        sb.append(r3.getClass());
        sb.append(") is not an authenticated user.");
        C10450iM.A03("user_not_authenticated", sb.toString());
        return false;
    }
}
