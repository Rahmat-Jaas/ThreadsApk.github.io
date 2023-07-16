package X;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.0fO  reason: invalid class name */
public final class AnonymousClass0fO {
    public static final boolean A00(Context context) {
        C04220Ms.A0B(context, 0);
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
            return true;
        }
        return false;
    }
}
