package X;

import android.net.Uri;

/* renamed from: X.0Q2  reason: invalid class name */
public final class AnonymousClass0Q2 {
    public static Uri A00(String... strArr) {
        Uri.Builder authority;
        Uri.Builder scheme = new Uri.Builder().scheme("https");
        if (scheme == null || (authority = scheme.authority("b-www.facebook.com")) == null) {
            return C15430rJ.A01("");
        }
        for (String appendPath : strArr) {
            authority.appendPath(appendPath);
        }
        authority.appendPath("");
        return authority.build();
    }
}
