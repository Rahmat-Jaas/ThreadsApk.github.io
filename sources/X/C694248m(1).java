package X;

import android.util.LruCache;

/* renamed from: X.48m  reason: invalid class name and case insensitive filesystem */
public final class C694248m implements AnonymousClass0i4 {
    public final LruCache A00 = new LruCache(30);

    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
