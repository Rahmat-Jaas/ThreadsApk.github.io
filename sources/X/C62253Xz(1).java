package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.3Xz  reason: invalid class name and case insensitive filesystem */
public final class C62253Xz {
    public final C67603zp A00;

    public final Map A02(boolean z) {
        C67603zp r6 = this.A00;
        AnonymousClass3IC A09 = r6.A09();
        TreeMap treeMap = new TreeMap();
        if (A09 != null) {
            HashSet hashSet = null;
            if (z) {
                hashSet = C18200wM.A0u();
                for (int A1U : r6.A0G()) {
                    C18200wM.A1U(hashSet, A1U);
                }
            }
            List list = A09.A03;
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < list.size(); i3++) {
                AnonymousClass3GH r1 = (AnonymousClass3GH) list.get(i3);
                if (i != r1.A03) {
                    if (i > 0) {
                        A01(r6, list, treeMap, hashSet, r6.A03, i2, i3);
                    }
                    i = r1.A03;
                    i2 = i3;
                }
            }
            A01(r6, list, treeMap, hashSet, r6.A03, i2, list.size());
        }
        return treeMap;
    }

    public static Object A00(C07810cE r10, AnonymousClass0TJ r11, AnonymousClass3GH r12, long j) {
        Object obj;
        int i = r12.A06;
        C07810cE r5 = r10;
        AnonymousClass0TJ r6 = r11;
        long j2 = j;
        if (i == 1) {
            obj = Integer.valueOf(r10.ATw(r11, j, true) ? 1 : 0);
        } else if (i == 2) {
            obj = Long.valueOf(r5.At9(r6, j2, 20210614));
        } else if (i == 3) {
            obj = r10.BEU(r11, "20210614", j);
        } else if (i == 4) {
            obj = Double.valueOf(r10.Adu(r6, 2021.0614d, j));
        } else {
            AnonymousClass0LU.A0P("MobileConfigFunctions", "Caught unsupported type %d for config %s, param %s in IG consistency logging", Integer.valueOf(i), r12.A00, r12.A01);
            obj = null;
        }
        AnonymousClass0TN r1 = r6.A00.A00;
        if (r1 == AnonymousClass0TN.SERVER || r1 == AnonymousClass0TN.OVERRIDE) {
            return obj;
        }
        return null;
    }

    private void A01(C07810cE r8, List list, Map map, Set set, int i, int i2, int i3) {
        if (i2 < i3) {
            AnonymousClass3GH r3 = (AnonymousClass3GH) list.get(i2);
            if (r3.A08 != i) {
                return;
            }
            if (set == null || set.contains(Integer.valueOf(r3.A02))) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                AnonymousClass0TJ A0Q = C18200wM.A0Q();
                A0Q.A03 = true;
                AnonymousClass0TJ A002 = AnonymousClass0TJ.A00(A0Q);
                A002.A02 = true;
                while (i2 < i3) {
                    AnonymousClass3GH r5 = (AnonymousClass3GH) list.get(i2);
                    Object A003 = A00(r8, A002, r5, r5.A00());
                    if (A003 != null) {
                        Integer valueOf = Integer.valueOf(r5.A04);
                        A0v.add(StringFormatUtil.formatStrLocaleSafe("%d: _%d: %s", valueOf, valueOf, A003));
                    }
                    i2++;
                }
                if (!A0v.isEmpty()) {
                    Integer valueOf2 = Integer.valueOf(r3.A03);
                    map.put(StringFormatUtil.formatStrLocaleSafe("%d:_%d", valueOf2, valueOf2), A0v);
                }
            }
        }
    }

    public C62253Xz(C67603zp r1) {
        this.A00 = r1;
    }
}
