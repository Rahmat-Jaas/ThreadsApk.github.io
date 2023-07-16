package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.6St  reason: invalid class name and case insensitive filesystem */
public final class C101826St {
    public static final String A00(String str) {
        String queryParameter;
        Uri A00;
        if (str == null || str.length() == 0) {
            return str;
        }
        C16390sy r3 = C103276Ym.A00;
        Uri A002 = C15430rJ.A00(r3, str, false);
        if (A002 == null) {
            return "failed-to-parse";
        }
        if (!(!AnonymousClass7K0.A03(A002) || (queryParameter = A002.getQueryParameter("u")) == null || (A00 = C15430rJ.A00(r3, queryParameter, true)) == null)) {
            A002 = A00;
        }
        if (TextUtils.isEmpty(A002.getHost())) {
            return A002.toString();
        }
        String A003 = C10730ip.A00(A002, AnonymousClass7K0.A00).D7I();
        if (A003 == null) {
            return "failed-to-sanitize";
        }
        return A003;
    }
}
