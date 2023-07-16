package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.2sw  reason: invalid class name and case insensitive filesystem */
public final class C50402sw {
    public static final boolean A00(Uri uri) {
        String host = uri.getHost();
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2) {
            return false;
        }
        String A0p = C18190wL.A0p(pathSegments, 1);
        if (("ig.me".equalsIgnoreCase(host) || C62033Ww.A00(host)) && "j".equalsIgnoreCase(C18190wL.A0p(pathSegments, 0)) && A0p != null && A0p.length() != 0) {
            return true;
        }
        return false;
    }
}
