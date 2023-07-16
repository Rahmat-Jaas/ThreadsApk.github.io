package X;

import com.facebook.redex.IDxOCompletionShape14S1300000_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0QC  reason: invalid class name */
public final class AnonymousClass0QC {
    public UserSession A00;
    public final AnonymousClass0BO A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final C07540bg A03;
    public final C07420bU A04;
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();

    private final synchronized UserSession A02(User user, boolean z, boolean z2) {
        UserSession userSession;
        String id = user.getId();
        ConcurrentHashMap concurrentHashMap = this.A05;
        userSession = (UserSession) concurrentHashMap.get(id);
        if (userSession == null) {
            userSession = A01(user, z);
            concurrentHashMap.put(id, userSession);
            this.A02.put(id, new HashSet());
        } else if (z2) {
            userSession.sessionState = AnonymousClass0QH.STARTED;
            userSession.isManaged = true;
            this.A00 = userSession;
        }
        return userSession;
    }

    public static final void A03(AnonymousClass0QC r7, C04860Pl r8, C04850Pk r9, AnonymousClass0PT r10, String str) {
        AnonymousClass0QC r5 = r7;
        synchronized (r5) {
            String str2 = str;
            User A0E = r7.A01.A0E(str);
            if (A0E != null) {
                UserSession A022 = r5.A02(A0E, false, false);
                Object obj = r5.A02.get(str);
                if (obj == null) {
                    obj = new LinkedHashSet();
                }
                C04860Pl r3 = r8;
                ((Set) obj).add(r8);
                r8.AKs(A022, new IDxOCompletionShape14S1300000_I2(r3, r9, r5, str2, 0), r10);
            }
        }
    }

    public static final synchronized void A04(AnonymousClass0QC r5, C04860Pl r6, String str) {
        synchronized (r5) {
            ConcurrentHashMap concurrentHashMap = r5.A02;
            Set set = (Set) concurrentHashMap.get(str);
            if (set == null) {
                r5.A05.remove(str);
                C10450iM.A03("UserSessionManager", "operations for given userId is already null");
            } else {
                set.remove(r6);
                ConcurrentHashMap concurrentHashMap2 = r5.A05;
                UserSession userSession = (UserSession) concurrentHashMap2.get(str);
                if (set.isEmpty() || (userSession != null && userSession.sessionState.ordinal() == 1 && userSession.isLoggedOut)) {
                    concurrentHashMap.remove(str);
                    concurrentHashMap2.remove(str);
                    if (userSession != null && userSession.isManaged) {
                        new AnonymousClass3YQ().A03(userSession, AnonymousClass224.A01, str, "UserSessionManager");
                        if (userSession.sessionState.ordinal() == 1) {
                            for (Object next : userSession.A02()) {
                                if (next instanceof AnonymousClass0i1) {
                                    ((AnonymousClass0i1) next).onUserSessionWillEnd(userSession.isLoggedOut);
                                } else if (next instanceof AnonymousClass0i4) {
                                    ((AnonymousClass0i4) next).onSessionWillEnd();
                                }
                            }
                            userSession.sessionState = AnonymousClass0QH.ENDED;
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
        }
    }

    private final UserSession A01(User user, boolean z) {
        UserSession userSession = new UserSession(user, this.A01, this.A03, z, this.A04);
        if (z) {
            this.A00 = userSession;
            AnonymousClass0gN.A00().AKp(new C25191mg(new AnonymousClass3YQ(), userSession, "UserSessionManager", new AnonymousClass224[]{AnonymousClass224.A01, AnonymousClass224.A02}));
        }
        return userSession;
    }

    public final UserSession A05(User user, boolean z) {
        if (user == null) {
            return null;
        }
        if (z) {
            return A00(user);
        }
        return A01(user, false);
    }

    public AnonymousClass0QC(C07540bg r2, AnonymousClass0BO r3, C07420bU r4) {
        this.A01 = r3;
        this.A03 = r2;
        this.A04 = r4;
    }

    private final UserSession A00(User user) {
        String id = user.getId();
        UserSession A022 = A02(user, true, true);
        C07590bl r2 = new C07590bl();
        Object obj = this.A02.get(id);
        if (obj == null) {
            obj = new LinkedHashSet();
        }
        ((Set) obj).add(r2);
        r2.AKs(A022, new IDxOCompletionShape14S1300000_I2(r2, A022, this, id, 1), (AnonymousClass0PT) null);
        return A022;
    }
}
