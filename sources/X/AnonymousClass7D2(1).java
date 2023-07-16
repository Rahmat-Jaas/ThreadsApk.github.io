package X;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.7D2  reason: invalid class name */
public final class AnonymousClass7D2 {
    public static final Set A00;
    public static final Set A01;
    public static final Set A02;

    public static boolean A01(C1195775y r1, String str) {
        String str2 = r1.A01;
        if (str2.equals(str) || str2.endsWith(AnonymousClass00U.A0L(".", str))) {
            return true;
        }
        return false;
    }

    static {
        HashSet A0u = C18200wM.A0u();
        A01 = A0u;
        A0u.add("dev");
        A0u.add("intern");
        A0u.add("alpha");
        A0u.add("beta");
        A0u.add("latest");
        A0u.add("prod");
        HashSet A0u2 = C18200wM.A0u();
        A00 = A0u2;
        A0u2.add("app");
        A0u2.add("developers");
        A0u2.add("partners");
        HashSet A0u3 = C18200wM.A0u();
        A02 = A0u3;
        A0u3.add("our");
        A0u3.add("tools");
        A0u3.add("fiddle");
        A0u3.add("interngraph");
    }

    public static boolean A00(Uri uri) {
        String fragment;
        Uri build;
        C1195775y A002 = C1195775y.A00(uri);
        if (A002 != null && A01(A002, "facebook.com") && A002.A02.equals("https") && !A002.A01.startsWith("apps")) {
            Uri uri2 = A002.A00;
            if (uri2.getPathSegments().isEmpty() || !C18190wL.A0p(uri2.getPathSegments(), 0).equalsIgnoreCase("apps")) {
                C1195775y A003 = C1195775y.A00(uri);
                if (A003 == null || !A01(A003, "facebook.com") || (fragment = uri.getFragment()) == null || !fragment.startsWith("!/") || (build = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getHost()).path(fragment.substring(1)).build()) == null || build.equals(uri)) {
                    return true;
                }
                return A00(build);
            }
        }
        return false;
    }
}
