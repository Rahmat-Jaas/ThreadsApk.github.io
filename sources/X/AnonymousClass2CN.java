package X;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: X.2CN  reason: invalid class name */
public final class AnonymousClass2CN {
    public static void A00(Intent intent, Context context) {
        if (intent != null && "com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IS_MANAGED_APP_CHANGED".equals(intent.getAction())) {
            try {
                C62293Yd.A00(context).A02();
            } catch (IllegalStateException | SecurityException e) {
                Log.e("IsManagedAppCacheService", "onHandleIntent() isManagedForceQuery failed", e);
            }
        }
    }
}
