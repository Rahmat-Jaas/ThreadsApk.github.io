package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3h1  reason: invalid class name and case insensitive filesystem */
public final class C63223h1 {
    public static final C63223h1 A00 = new C63223h1();

    public static final void A01(C84684tg r2, Object obj, String str) {
        String str2;
        C04220Ms.A0B(obj, 2);
        boolean z = obj instanceof Number;
        if (z) {
            r2.Bet(str, C18190wL.A08(obj));
        } else if (obj instanceof Boolean) {
            r2.Bev(str, AnonymousClass0wJ.A1X(obj));
        } else {
            if (!z || (str2 = obj.toString()) == null) {
                str2 = obj.toString();
            }
            r2.Beu(str, str2);
        }
    }

    public static final void A03(Long l, String str, String str2, Map map, int i) {
        C04220Ms.A0B(map, 3);
        C84684tg A002 = A00(str, i);
        if (A002 != null) {
            if (l == null) {
                A002.Bex(str2);
            } else {
                A002.Bey(str2, l.longValue());
            }
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                A0o.getKey();
                A0o.getValue();
                A02(A002, map);
            }
        }
    }

    public static final C84684tg A00(String str, int i) {
        C84684tg r0;
        if (str == null) {
            return null;
        }
        int parseInt = Integer.parseInt(str);
        C36978JiB A002 = C36978JiB.A05.A00();
        long j = (((long) parseInt) & 4294967295L) | ((((long) i) << 32) & -4294967296L);
        synchronized (A002) {
            r0 = (C84684tg) A002.A00.get(j);
        }
        return r0;
    }

    public static final void A02(C84684tg r4, Map map) {
        String str;
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object key = A0o.getKey();
            Object value = A0o.getValue();
            if (value != null) {
                if (!(key instanceof Number) || key == null || (str = key.toString()) == null) {
                    str = key.toString();
                }
                A01(r4, value, str);
            }
        }
    }
}
