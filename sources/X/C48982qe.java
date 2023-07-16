package X;

import android.webkit.URLUtil;
import java.net.URI;

/* renamed from: X.2qe  reason: invalid class name and case insensitive filesystem */
public final class C48982qe {
    public static boolean A00(URI uri) {
        if (uri == null || !URLUtil.isHttpsUrl(uri.toString())) {
            return false;
        }
        if (C62033Ww.A01(uri.toString()) || C28174Ezk.A00(727).equals(uri.getHost())) {
            return true;
        }
        return false;
    }
}
