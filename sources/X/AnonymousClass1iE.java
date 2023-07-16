package X;

import android.util.LruCache;

/* renamed from: X.1iE  reason: invalid class name */
public final class AnonymousClass1iE extends C63873iU {
    public final C63873iU A00;
    public final String A01;
    public final boolean A02;

    public AnonymousClass1iE(C63873iU r1, String str, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = str;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A03 = C14030oh.A03(1440261510);
        this.A00.onFail(r3);
        C14030oh.A0A(-771735818, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-1717032774);
        this.A00.onFinish();
        C14030oh.A0A(1278439295, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(1796051547);
        this.A00.onStart();
        C14030oh.A0A(-674861946, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        LruCache lruCache;
        int A03 = C14030oh.A03(694543919);
        int A032 = C14030oh.A03(1879860578);
        this.A00.onSuccess(obj);
        String str = this.A01;
        if (this.A02) {
            lruCache = AnonymousClass3SA.A02;
        } else {
            lruCache = AnonymousClass3SA.A01;
        }
        lruCache.put(str, obj);
        C14030oh.A0A(1391187431, A032);
        C14030oh.A0A(1523565075, A03);
    }
}
