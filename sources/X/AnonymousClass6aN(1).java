package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6aN  reason: invalid class name */
public final class AnonymousClass6aN {
    public static final Map A00;
    public static final Map A01;
    public static final Map A02 = AnonymousClass0wJ.A0y();

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A00 = A0y;
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        A01 = A0y2;
        Integer A0b = C86144wL.A0b();
        A0y.put(A0b, "Too many sessions are running for current app, existing sessions must be resolved first.");
        A0y.put(-2, "A requested module is not available (to this user/device, for the installed apk).");
        A0y.put(-3, "Request is otherwise invalid.");
        A0y.put(-4, "Requested session is not found.");
        A0y.put(-5, "Split Install API is not available.");
        A0y.put(-6, "Network error: unable to obtain split details.");
        A0y.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        A0y.put(-8, "Requested session contains modules from an existing active session and also new modules.");
        A0y.put(-9, "Service handling split install has died.");
        A0y.put(-10, "Install failed due to insufficient storage.");
        A0y.put(-11, "Signature verification error when invoking SplitCompat.");
        A0y.put(-12, "Error in SplitCompat emulation.");
        A0y.put(-13, "Error in copying files for SplitCompat.");
        A0y.put(-14, "The Play Store app is either not installed or not the official version.");
        A0y.put(-15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        A0y.put(-100, "Unknown error processing split install.");
        A0y2.put(A0b, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        A0y2.put(-2, "MODULE_UNAVAILABLE");
        A0y2.put(-3, "INVALID_REQUEST");
        A0y2.put(-4, "DOWNLOAD_NOT_FOUND");
        A0y2.put(-5, "API_NOT_AVAILABLE");
        A0y2.put(-6, "NETWORK_ERROR");
        A0y2.put(-7, "ACCESS_DENIED");
        A0y2.put(-8, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        A0y2.put(-9, "SERVICE_DIED");
        A0y2.put(-10, "INSUFFICIENT_STORAGE");
        A0y2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        A0y2.put(-12, "SPLITCOMPAT_EMULATION_ERROR");
        A0y2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        A0y2.put(-14, "PLAY_STORE_NOT_FOUND");
        A0y2.put(-15, "APP_NOT_OWNED");
        A0y2.put(-100, "INTERNAL_ERROR");
        Iterator A0u = C18190wL.A0u(A0y2);
        while (A0u.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0u);
            A02.put(A0o.getValue(), A0o.getKey());
        }
    }
}
