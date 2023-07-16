package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.6H1  reason: invalid class name */
public final class AnonymousClass6H1 {
    public static boolean A00(Uri uri) {
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            return false;
        }
        return TextUtils.isEmpty(uri.getScheme()) || "file".equals(uri.getScheme()) || "content".equals(uri.getScheme());
    }
}
