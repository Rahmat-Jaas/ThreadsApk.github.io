package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7Ie  reason: invalid class name and case insensitive filesystem */
public final class C121797Ie {
    public String A00;
    public String A01;
    public String A02 = C18180wK.A0e();
    public HashMap A03 = AnonymousClass0wJ.A0y();
    public HashMap A04 = AnonymousClass0wJ.A0y();
    public HashMap A05 = AnonymousClass0wJ.A0y();
    public HashMap A06 = AnonymousClass0wJ.A0y();
    public HashMap A07 = AnonymousClass0wJ.A0y();
    public HashMap A08 = AnonymousClass0wJ.A0y();
    public Map A09 = AnonymousClass0wJ.A0y();

    public static void A03(User user, String str, String str2, HashMap hashMap, long j) {
        if (user != null) {
            String str3 = str2;
            if (str2 != null) {
                C110956mY r4 = new C110956mY(str, str3, user.getId(), j, C18190wL.A07());
                String str4 = r4.A03;
                if (str4 == null) {
                    String str5 = r4.A02;
                    int indexOf = str5.indexOf(95);
                    if (indexOf != -1) {
                        str5 = str5.substring(0, indexOf);
                    }
                    str4 = AnonymousClass00U.A0h(str5, "_", r4.A06, "_", r4.A05);
                    r4.A03 = str4;
                }
                C106556fE r0 = (C106556fE) hashMap.get(str4);
                if (r0 == null) {
                    r0 = new C106556fE();
                    hashMap.put(str4, r0);
                }
                r0.A00.add(r4);
            }
        }
    }

    public final C121797Ie A04() {
        C121797Ie r4 = new C121797Ie();
        r4.A04 = C86164wN.A0j(this.A04);
        r4.A07 = C86164wN.A0j(this.A07);
        r4.A01 = this.A01;
        r4.A00 = this.A00;
        Iterator A0r = C86154wM.A0r(this.A03);
        while (true) {
            if (!A0r.hasNext()) {
                break;
            }
            Object next = A0r.next();
            Object obj = this.A03.get(next);
            obj.getClass();
            C106556fE r3 = (C106556fE) obj;
            C106556fE r2 = new C106556fE();
            for (int i = 0; i < r3.A00.size(); i++) {
                r2.A00.add(r3.A00.get(i));
            }
            r4.A03.put(next, r2);
        }
        Iterator A0r2 = C86154wM.A0r(this.A06);
        while (A0r2.hasNext()) {
            Object next2 = A0r2.next();
            Object obj2 = this.A06.get(next2);
            obj2.getClass();
            C106556fE r5 = (C106556fE) obj2;
            C106556fE r32 = new C106556fE();
            for (int i2 = 0; i2 < r5.A00.size(); i2++) {
                r32.A00.add(r5.A00.get(i2));
            }
            r4.A06.put(next2, r32);
        }
        Iterator A0r3 = C86154wM.A0r(this.A05);
        while (A0r3.hasNext()) {
            Object next3 = A0r3.next();
            r4.A05.put(next3, this.A05.get(next3));
        }
        Iterator A0r4 = C86154wM.A0r(this.A08);
        while (A0r4.hasNext()) {
            Object next4 = A0r4.next();
            r4.A08.put(next4, this.A08.get(next4));
        }
        Iterator A0x = C18220wO.A0x(this.A09);
        while (A0x.hasNext()) {
            Object next5 = A0x.next();
            r4.A09.put(next5, this.A09.get(next5));
        }
        return r4;
    }

    public final void A05(String str, UserSession userSession, BKU bku) {
        String str2 = bku.A0f.A4Y;
        String str3 = str;
        A03(bku.A2Z(userSession), str3, str2, this.A03, bku.A1t());
    }

    public final boolean A06() {
        if (!this.A04.isEmpty() || !this.A03.isEmpty() || !this.A05.isEmpty()) {
            return false;
        }
        return true;
    }

    public static String A00(HashMap hashMap) {
        try {
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            Iterator A0u = C18190wL.A0u(hashMap);
            while (A0u.hasNext()) {
                C106556fE r5 = (C106556fE) C86104wH.A0c(A0K, C18180wK.A0o(A0u));
                A0K.A0I();
                for (int i = 0; i < r5.A00.size(); i++) {
                    C110956mY r3 = (C110956mY) r5.A00.get(i);
                    String str = r3.A04;
                    if (str == null) {
                        StringBuilder A0r = C18200wM.A0r();
                        A0r.append(r3.A01);
                        A0r.append("_");
                        str = C86154wM.A0n(A0r, r3.A00);
                        r3.A04 = str;
                    }
                    A0K.A0Y(str);
                }
                A0K.A0F();
            }
            return C18180wK.A0h(A0K, A0d);
        } catch (IOException e) {
            AnonymousClass0LU.A0F("PendingReelSeenState", "Failed to serialize seen state to json", e);
            return null;
        }
    }

    public static String A01(HashMap hashMap) {
        try {
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            Iterator A0u = C18190wL.A0u(hashMap);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                A0K.A0d(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
            return C18180wK.A0h(A0K, A0d);
        } catch (IOException e) {
            AnonymousClass0LU.A0F("PendingReelSeenState", "Failed to serialize nuxes seen state to json", e);
            return null;
        }
    }

    public static String A02(HashMap hashMap) {
        try {
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            Iterator A0u = C18190wL.A0u(hashMap);
            while (A0u.hasNext()) {
                C110806mJ r3 = (C110806mJ) C86104wH.A0c(A0K, C18180wK.A0o(A0u));
                String str = r3.A03;
                if (str == null) {
                    StringBuilder A0r = C18200wM.A0r();
                    A0r.append(r3.A00);
                    A0r.append("_");
                    str = C86154wM.A0n(A0r, r3.A01);
                    r3.A03 = str;
                }
                A0K.A0Y(str);
            }
            return C18180wK.A0h(A0K, A0d);
        } catch (IOException e) {
            AnonymousClass0LU.A0F("PendingReelSeenState", "Failed to serialize replay seen state to json", e);
            return null;
        }
    }
}
