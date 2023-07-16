package X;

import android.os.Bundle;
import com.facebook.systrace.Systrace;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.IDxLambdaShape880S0100000_I2;

/* renamed from: X.0RA  reason: invalid class name */
public final class AnonymousClass0RA {
    public static String A0B = "NotInitiated";
    public static final AnonymousClass0RG A0C = new AnonymousClass0RG();
    public AnonymousClass0RB A00;
    public C07530bf A01;
    public final AnonymousClass0RK A02;
    public final AnonymousClass0BO A03;
    public final C07420bU A04;
    public final C07350bN A05;
    public final AnonymousClass0QC A06;
    public final C08350dD A07;
    public final AnonymousClass0RL A08;
    public final C07540bg A09;
    public final C07440bW A0A;

    public AnonymousClass0RA(AnonymousClass3GU r10, C08350dD r11, AnonymousClass0RK r12, C07440bW r13, C07420bU r14, AnonymousClass3Dt r15) {
        this.A07 = r11;
        this.A02 = r12;
        this.A0A = r13;
        this.A04 = r14;
        if (Systrace.A0F(1)) {
            C13930oX.A01("loadCurrentUser", 1733963055);
        }
        AnonymousClass0RL r6 = new AnonymousClass0RL(r11);
        this.A08 = r6;
        C07540bg r0 = new C07540bg(r12);
        this.A09 = r0;
        C07350bN r4 = new C07350bN();
        this.A05 = r4;
        AnonymousClass0BO A002 = AnonymousClass0R4.A00(r10, r6, r12, r0);
        this.A03 = A002;
        AnonymousClass0QC r2 = new AnonymousClass0QC(r0, A002, r14);
        this.A06 = r2;
        synchronized (C06900aZ.A01) {
            if (C06900aZ.A00 == null) {
                C06900aZ.A00 = new C06900aZ();
            }
        }
        User A032 = r6.A03();
        if (A032 != null) {
            r2.A05(A032, true);
        } else {
            this.A01 = new C07530bf(A002, r4);
        }
        r15.A00(r2.A00);
        if (Systrace.A0F(1)) {
            C13930oX.A00(457196427);
        }
    }

    public static final UserSession A00(Bundle bundle) {
        return A0C.A06(bundle);
    }

    public final UserSession A03(User user) {
        try {
            user.A1g(0);
            user.A1d();
            C08350dD r0 = this.A07;
            r0.A00.edit().putString("current", C36576Jax.A00(user)).apply();
            AnonymousClass0QC r5 = this.A06;
            boolean z = false;
            if (r5.A00 != null) {
                z = true;
            }
            if (z && !C04220Ms.A0I(A01().getUserId(), user.getId())) {
                UserSession A012 = A01();
                UserSession userSession = ((C05070Qs) A012.A01(C05070Qs.class, new IDxLambdaShape880S0100000_I2(A012, 6))).A00;
                userSession.sessionState = AnonymousClass0QH.STOPPED;
                userSession.isLoggedOut = false;
                C08030cc r02 = userSession.userSessionEnder;
                if (r02 != null) {
                    r02.A00.ADn((AnonymousClass0PT) null);
                }
                r5.A05(user, true);
            } else if (r5.A00 != null) {
                this.A08.A07(user);
            } else {
                r5.A05(user, true);
                this.A08.A07(user);
            }
            C07530bf r1 = this.A01;
            if (r1 != null) {
                if (!r1.A02) {
                    r1.A05();
                }
                this.A00 = new AnonymousClass0RB();
                this.A01 = null;
            }
            return A01();
        } catch (Exception e) {
            throw new RuntimeException("Unable to write current user", e);
        }
    }

    public final synchronized void A05(UserSession userSession) {
        String str;
        AnonymousClass0QC r3 = this.A06;
        String userId = userSession.getUserId();
        if (userId != null) {
            UserSession userSession2 = r3.A00;
            if (userSession2 != null) {
                str = userSession2.getUserId();
            } else {
                str = null;
            }
            if (userId.equals(str)) {
                this.A08.A06(C06810aP.A01.A01(userSession));
                UserSession userSession3 = ((C05070Qs) userSession.A01(C05070Qs.class, new IDxLambdaShape880S0100000_I2(userSession, 6))).A00;
                userSession3.sessionState = AnonymousClass0QH.STOPPED;
                userSession3.isLoggedOut = true;
                C08030cc r0 = userSession3.userSessionEnder;
                if (r0 != null) {
                    r0.A00.ADn((AnonymousClass0PT) null);
                }
                if (this.A01 == null) {
                    this.A01 = new C07530bf(this.A03, this.A05);
                }
                r3.A00 = null;
                this.A07.A00.edit().putString("current", (String) null).apply();
                AnonymousClass0RG.A01();
            }
        }
    }

    public final UserSession A01() {
        UserSession userSession = this.A06.A00;
        if (userSession != null) {
            return userSession;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final UserSession A04(String str) {
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (!str.equals("IgSessionManager.LOGGED_OUT_TOKEN")) {
            UserSession A012 = A01();
            if (C05040Qp.A00(str, A012.token)) {
                return A012;
            }
            C10450iM.A03("user_session_mismatch", AnonymousClass00U.A0h("requested user session (", str, ") does not match current user session (", A012.token, ")."));
            User A0E = this.A03.A0E(AnonymousClass0i2.A00(str));
            if (A0E != null) {
                return this.A06.A05(A0E, false);
            }
            throw new AnonymousClass0RB("Requesting UserSession for not logged in user", this.A00);
        } else {
            throw new IllegalStateException("Requesting UserSession while passing logged out session token");
        }
    }

    public final UserSession A02(C05020Qk r3, User user) {
        r3.ChM(A03(user));
        this.A08.A07(user);
        AnonymousClass0RG.A01();
        C07440bW.A00(this.A0A, false);
        return A01();
    }
}
