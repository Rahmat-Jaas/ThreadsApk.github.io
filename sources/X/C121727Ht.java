package X;

import android.os.Handler;
import android.util.Pair;
import com.instagram.common.bloks.mutations.IDxUOperationShape42S0200000_2_I2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Ht  reason: invalid class name and case insensitive filesystem */
public final class C121727Ht {
    public static int A00(C144588ik r3, List list) {
        for (int i = 0; i < list.size(); i++) {
            C127397h3 A0Q = C86154wM.A0Q(list, i);
            if (A0Q.A0M() != null && r3.Cx4(A0Q)) {
                return i;
            }
        }
        return -1;
    }

    public static void A04(AnonymousClass7HV r4, String str, List list) {
        AnonymousClass7r5 r3 = new AnonymousClass7r5(str);
        Pair pair = new Pair(new AnonymousClass7r2(r3), new IDxUOperationShape42S0200000_2_I2(1, list, r3));
        r4.A0A((C144588ik) pair.first, (C111556ns) pair.second);
    }

    public static Pair A01(C127397h3 r6, C144588ik r7) {
        Object obj;
        int i;
        int[] A00 = AnonymousClass7H4.A00(r6);
        int length = A00.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                obj = Collections.EMPTY_LIST;
                i = -1;
                break;
            }
            int i3 = A00[i2];
            List A0Q = r6.A0Q(i3);
            i = A00(r7, A0Q);
            if (i >= 0) {
                obj = C18200wM.A0s(A0Q);
                r6.A04.put(i3, obj);
                break;
            }
            i2++;
        }
        return new Pair(obj, Integer.valueOf(i));
    }

    public static List A02(AnonymousClass7HV r5, List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C121997Jj r2 = (C121997Jj) it.next();
            if (r5.A06) {
                C30967GcS.A02("BloksTreeManager", "Trying to enqueue resources update on a destroyed BloksTreeManager");
            } else {
                AnonymousClass7J1.A03("Tree operations are only supported from the UI Thread");
                r5.A0G.add(r2);
                Handler handler = AnonymousClass7HV.A0L;
                Runnable runnable = r5.A0D;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
            A0v.add(r2.A02);
        }
        return A0v;
    }

    public static List A03(List list) {
        ArrayList A0t = C18200wM.A0t(list);
        for (int i = 0; i < list.size(); i++) {
            C127397h3 A0Q = C86154wM.A0Q(list, i);
            if (A0Q != null) {
                if (A0Q.A03 == 13346) {
                    List A0R = A0Q.A0R(32);
                    for (int i2 = 0; i2 < A0R.size(); i2++) {
                        A0t.add(A0R.get(i2));
                    }
                } else {
                    A0t.add(A0Q);
                }
            }
        }
        return A0t;
    }
}
