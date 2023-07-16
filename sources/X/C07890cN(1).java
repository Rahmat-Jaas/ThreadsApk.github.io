package X;

import java.util.WeakHashMap;

/* renamed from: X.0cN  reason: invalid class name and case insensitive filesystem */
public abstract class C07890cN extends AnonymousClass0V0 {
    public final WeakHashMap A00 = new WeakHashMap();

    public abstract Object A05(AnonymousClass0UJ r1);

    public final synchronized Object A06(AnonymousClass0UJ r3) {
        Object obj;
        WeakHashMap weakHashMap = this.A00;
        if (weakHashMap.containsKey(r3)) {
            obj = weakHashMap.get(r3);
        } else {
            obj = A05(r3);
            weakHashMap.put(r3, obj);
        }
        return obj;
    }
}
