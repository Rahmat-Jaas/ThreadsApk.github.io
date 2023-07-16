package X;

import android.net.Uri;

/* renamed from: X.6IU  reason: invalid class name */
public final class AnonymousClass6IU {
    public static final String A00(String str) {
        String queryParameter;
        Uri A00;
        if (str == null) {
            return str;
        }
        C16390sy r3 = new C16390sy();
        Uri A002 = C15430rJ.A00(r3, str, false);
        if (A002 == null) {
            return null;
        }
        if (AnonymousClass7K0.A03(A002) && AnonymousClass7K0.A03(A002) && (queryParameter = A002.getQueryParameter("u")) != null && (A00 = C15430rJ.A00(r3, queryParameter, true)) != null) {
            A002 = A00;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(A002.getScheme());
        builder.authority(A002.getAuthority());
        String obj = builder.build().toString();
        if (obj != null) {
            return obj;
        }
        return str;
    }
}
