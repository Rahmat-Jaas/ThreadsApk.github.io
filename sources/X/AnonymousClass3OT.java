package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.3OT  reason: invalid class name */
public final class AnonymousClass3OT {
    public static final String A00(String str) {
        String path;
        List A07;
        Uri uri = null;
        try {
            uri = C15430rJ.A01(A01(str));
        } catch (IllegalArgumentException | SecurityException unused) {
        }
        if (uri == null || (path = uri.getPath()) == null || (A07 = C81074n3.A07(AnonymousClass8bP.A0Q("/", path), "/", 0)) == null) {
            return null;
        }
        return (String) AnonymousClass00J.A0D(A07);
    }

    public static final String A01(String str) {
        String str2 = null;
        if (AnonymousClass8bP.A0j(str, "call.instagram.com", false)) {
            try {
                Uri A01 = C15430rJ.A01(str);
                if (C04220Ms.A0I(A01.getHost(), "call.instagram.com") && C18240wQ.A03(A01) == 2 && C04220Ms.A0I(A01.getPathSegments().get(0), "v")) {
                    Uri.Builder scheme = new Uri.Builder().scheme(A01.getScheme());
                    String authority = A01.getAuthority();
                    if (authority != null) {
                        str2 = AnonymousClass8bQ.A0l(authority, "call.instagram.com", "msngr.com", false);
                    }
                    return C18190wL.A0n(scheme.authority(str2).appendPath(C18190wL.A0p(A01.getPathSegments(), 1)).query(A01.getQuery()).fragment(A01.getFragment()).build());
                }
            } catch (SecurityException unused) {
            }
        }
        return str;
    }
}
