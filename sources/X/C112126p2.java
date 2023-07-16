package X;

import android.util.LruCache;
import com.android.billingclient.api.SkuDetails;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2;

/* renamed from: X.6p2  reason: invalid class name and case insensitive filesystem */
public final class C112126p2 {
    public final LruCache A00 = new LruCache(20);
    public final C03700Kj A01 = AnonymousClass0IY.A00;

    public final SkuDetails A00(String str) {
        C04220Ms.A0B(str, 0);
        LruCache lruCache = this.A00;
        KtCSuperShape0S0100100_I2 ktCSuperShape0S0100100_I2 = (KtCSuperShape0S0100100_I2) lruCache.get(str);
        if (ktCSuperShape0S0100100_I2 == null) {
            return null;
        }
        if (ktCSuperShape0S0100100_I2.A00 > System.currentTimeMillis()) {
            return (SkuDetails) ktCSuperShape0S0100100_I2.A01;
        }
        lruCache.remove(str);
        return null;
    }
}
