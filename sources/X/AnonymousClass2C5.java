package X;

import android.app.Activity;

/* renamed from: X.2C5  reason: invalid class name */
public final class AnonymousClass2C5 {
    public static void A00(Activity activity, int i) {
        if (activity != null) {
            try {
                activity.setRequestedOrientation(i);
            } catch (IllegalStateException e) {
                if ("Only fullscreen activities can request orientation".equals(e.getMessage())) {
                    AnonymousClass0LU.A0M("FixedOrientationCompat", "%s hit fixed orientation exception", e, C03800Ku.A00(activity.getClass()));
                    return;
                }
                throw e;
            }
        }
    }
}
