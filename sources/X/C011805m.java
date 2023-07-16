package X;

import android.util.Log;

/* renamed from: X.05m  reason: invalid class name and case insensitive filesystem */
public abstract class C011805m extends AnonymousClass01G {
    public final AnonymousClass01E dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException e) {
            Log.e("CustomJobIntentService", AnonymousClass00U.A0L("Captured a failure for ", getClass().getSimpleName()), e);
            return null;
        }
    }
}
