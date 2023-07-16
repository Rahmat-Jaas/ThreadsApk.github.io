package X;

import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3an  reason: invalid class name and case insensitive filesystem */
public final class C62813an {
    public final C62353Yv A00;
    public final AnonymousClass0BO A01;
    public final Map A02 = new ConcurrentHashMap();
    public final C10300i6 A03;

    public static int A00(C62813an r5, String str) {
        Map map = r5.A02;
        int i = 0;
        if (map.get(str) != null && r5.A07(str)) {
            Set<Object> A0i = C18210wN.A0i(r5.A01);
            List A002 = C50492t5.A00(((AccountFamily) map.get(str)).A04);
            HashSet A0u = C18200wM.A0u();
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                C72144Mm.A00(A0u, it);
            }
            for (Object contains : A0i) {
                if (A0u.contains(contains)) {
                    i++;
                }
            }
        }
        return i;
    }

    public static C62813an A01(C10300i6 r2) {
        return (C62813an) C18180wK.A0c(r2, C62813an.class, 1);
    }

    public final boolean A05() {
        Iterator it = C18210wN.A0i(this.A01).iterator();
        int i = 0;
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            if (!A06(A0k) || A08(A0k) || A00(this, A0k) == 0) {
                i++;
            }
        }
        if (i <= 1) {
            return false;
        }
        return true;
    }

    public final boolean A06(String str) {
        String str2;
        String str3;
        AccountFamily accountFamily = (AccountFamily) this.A02.get(str);
        if (accountFamily == null) {
            str2 = "AccountLinkingManager";
            str3 = "The linking state of the requested account is never fetched";
        } else {
            AnonymousClass22H r1 = accountFamily.A00;
            if (r1 == AnonymousClass22H.UNKNOWN) {
                str2 = "AccountLinkingManager";
                str3 = "The linking state of the requested account isn't fetched yet";
            } else if (r1 != AnonymousClass22H.UNLINKED_ACCOUNT) {
                return true;
            } else {
                return false;
            }
        }
        C10450iM.A03(str2, str3);
        return false;
    }

    public C62813an(C10300i6 r2) {
        C62353Yv r0;
        this.A03 = r2;
        this.A01 = C05030Qo.A01(r2);
        if (r2 instanceof UserSession) {
            r0 = C62353Yv.A00(r2);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    public static AccountFamily A02(C62813an r0, UserSession userSession) {
        return (AccountFamily) r0.A02.get(userSession.getUserId());
    }

    public final User A03(UserSession userSession) {
        String userId = userSession.getUserId();
        Map map = this.A02;
        if (map.get(userId) == null) {
            return null;
        }
        if (A08(userId)) {
            return AnonymousClass0wJ.A0Y(userSession);
        }
        List A04 = userSession.multipleAccountHelper.A00.A04((User) null);
        List A002 = C50492t5.A00(((AccountFamily) map.get(userId)).A04);
        HashSet A0u = C18200wM.A0u();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            C72144Mm.A00(A0u, it);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it2 = A04.iterator();
        while (it2.hasNext()) {
            User A0c = C18220wO.A0c(it2);
            if (A0u.contains(A0c.getId())) {
                A0v.add(A0c);
            }
        }
        if (A0v.size() == 1) {
            return (User) A0v.get(0);
        }
        C10450iM.A03("AccountLinkingManager", "Showing Log Out family option when there's multiple or no main accounts logged in");
        return null;
    }

    public final List A04(UserSession userSession) {
        List list;
        User A032 = A03(userSession);
        if (A032 != null) {
            String id = A032.getId();
            Map map = this.A02;
            if (map.get(id) != null) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                A0v.add(A032);
                AccountFamily accountFamily = (AccountFamily) map.get(A032.getId());
                if (accountFamily.A04.isEmpty()) {
                    list = accountFamily.A03;
                } else {
                    list = accountFamily.A04;
                }
                List A002 = C50492t5.A00(list);
                HashSet A0u = C18200wM.A0u();
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    C72144Mm.A00(A0u, it);
                }
                Iterator it2 = userSession.multipleAccountHelper.A00.A04((User) null).iterator();
                while (it2.hasNext()) {
                    User A0c = C18220wO.A0c(it2);
                    if (A0u.contains(A0c.getId())) {
                        A0v.add(A0c);
                    }
                }
                return A0v;
            }
        }
        return null;
    }

    public final boolean A07(String str) {
        if (A06(str)) {
            Map map = this.A02;
            if (map.get(str) == null || ((AccountFamily) map.get(str)).A00 != AnonymousClass22H.CHILD_ACCOUNT) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A08(String str) {
        if (A06(str)) {
            Map map = this.A02;
            if (map.get(str) == null || ((AccountFamily) map.get(str)).A00 != AnonymousClass22H.MAIN_ACCOUNT) {
                return false;
            }
            return true;
        }
        return false;
    }
}
