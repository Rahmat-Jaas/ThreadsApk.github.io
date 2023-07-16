package X;

import android.util.LruCache;

/* renamed from: X.6rH  reason: invalid class name and case insensitive filesystem */
public final class C113366rH {
    public final LruCache A00 = new LruCache(20);

    public final C110336lW A00(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        C114726tn r9 = new C114726tn(str, str2);
        LruCache lruCache = this.A00;
        C114736to r7 = (C114736to) lruCache.get(r9);
        if (r7 != null) {
            if (r7.A00 >= System.currentTimeMillis() - ((long) 14400000)) {
                return r7.A01;
            }
            lruCache.remove(r9);
        }
        return null;
    }

    public final void A01(C110336lW r6, String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        LruCache lruCache = this.A00;
        if (lruCache.size() == 20) {
            lruCache.trimToSize(10);
        }
        lruCache.put(new C114726tn(str, str2), new C114736to(r6, System.currentTimeMillis()));
    }
}
