package X;

import android.util.LruCache;

/* renamed from: X.7t7  reason: invalid class name and case insensitive filesystem */
public final class C131977t7 implements AnonymousClass0i4 {
    public final LruCache A00 = new LruCache(30);

    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
