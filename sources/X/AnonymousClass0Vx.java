package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* renamed from: X.0Vx  reason: invalid class name */
public final class AnonymousClass0Vx {
    public static final boolean A00(Context context) {
        C04220Ms.A0B(context, 0);
        Object systemService = context.getSystemService("connectivity");
        C04220Ms.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasTransport(4);
            }
        } catch (RuntimeException | SecurityException unused) {
        }
        return false;
    }
}
