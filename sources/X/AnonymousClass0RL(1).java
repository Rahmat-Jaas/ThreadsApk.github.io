package X;

import com.facebook.redex.IDxComparatorShape301S0100000_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0RL  reason: invalid class name */
public final class AnonymousClass0RL {
    public final C08350dD A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.instagram.user.model.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.instagram.user.model.User A00(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map r0 = r4.A01
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x000a:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x001e
            java.lang.String r2 = r0.getId()
        L_0x001e:
            boolean r0 = X.C04220Ms.A0I(r2, r5)
            if (r0 == 0) goto L_0x000a
            r2 = r1
        L_0x0025:
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RL.A00(java.lang.String):com.instagram.user.model.User");
    }

    private final Map A01() {
        try {
            String string = this.A00.A00.getString("user_access_map", (String) null);
            if (string != null) {
                Map A012 = C36575Jaw.A01(string);
                for (Map.Entry entry : A012.entrySet()) {
                    if (entry.getKey() == null) {
                        C10450iM.A04("UserDataValidator", "User is null", 1);
                    }
                    if (entry.getValue() == null) {
                        C10450iM.A04("UserDataValidator", "Last accessed time is null", 1);
                        entry.setValue(Long.valueOf(System.currentTimeMillis()));
                    }
                }
                C03940Lk.A02(A012);
                return A012;
            }
        } catch (IOException | NullPointerException unused) {
        }
        return new LinkedHashMap();
    }

    public static final void A02(AnonymousClass0RL r2) {
        try {
            String A012 = C36576Jax.A01(r2.A01);
            C04220Ms.A06(A012);
            C08360dF.A00().A00.edit().putString("user_access_map", A012).apply();
        } catch (IOException unused) {
        }
    }

    public final User A03() {
        String string = this.A00.A00.getString("current", (String) null);
        User user = null;
        if (string != null) {
            try {
                user = C36575Jaw.A00(string);
                User A002 = A00(user.getId());
                if (A002 != null) {
                    user = A002;
                }
                A07(user);
            } catch (IOException unused) {
            }
        }
        return user;
    }

    public final List A04(User user) {
        List A0K = AnonymousClass00J.A0K(this.A01.keySet());
        ArrayList arrayList = new ArrayList();
        for (Object next : A0K) {
            if (!C04220Ms.A0I(next, user)) {
                arrayList.add(next);
            }
        }
        return AnonymousClass00J.A0W(arrayList, new IDxComparatorShape301S0100000_I2(this, 5));
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A05(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map r0 = r4.A03
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x000a:
            boolean r1 = r3.hasNext()
            r0 = 0
            if (r1 == 0) goto L_0x0031
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getKey()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = r1.getId()
        L_0x0023:
            boolean r0 = X.C04220Ms.A0I(r0, r5)
            if (r0 == 0) goto L_0x000a
            java.lang.Object r0 = r2.getKey()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x000a
        L_0x0031:
            java.util.List r0 = r4.A04(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RL.A05(java.lang.String):java.util.List");
    }

    public final void A06(User user) {
        Map map = this.A01;
        if (map.containsKey(user)) {
            UserSession A042 = AnonymousClass0RG.A00().A04(user.getId());
            if (A042 != null) {
                new AnonymousClass3YQ().A03(A042, AnonymousClass224.A02, user.getId(), "AccountDataManager");
            }
            this.A02.remove(user);
            map.remove(user);
            A02(this);
        }
    }

    public final void A07(User user) {
        Map map = this.A02;
        Map map2 = this.A01;
        map.put(user, map2.get(user));
        map2.put(user, Long.valueOf(System.currentTimeMillis()));
        A02(this);
    }

    public AnonymousClass0RL(C08350dD r3) {
        this.A00 = r3;
        Map A012 = A01();
        this.A01 = A012;
        this.A03 = A012;
        LinkedHashMap linkedHashMap = new LinkedHashMap(A012);
        this.A02 = linkedHashMap;
        this.A04 = linkedHashMap;
    }
}
