package X;

import android.util.LruCache;

/* renamed from: X.48l  reason: invalid class name and case insensitive filesystem */
public final class C694148l implements AnonymousClass0i4 {
    public final LruCache A00 = new LruCache(30);

    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
