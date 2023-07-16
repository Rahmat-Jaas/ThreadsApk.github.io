package X;

import android.net.Uri;

/* renamed from: X.73L  reason: invalid class name */
public final class AnonymousClass73L {
    public static final C013306f A00 = new C013306f();

    public static synchronized Uri A00() {
        Uri uri;
        synchronized (AnonymousClass73L.class) {
            C013306f r2 = A00;
            uri = (Uri) r2.get("com.google.android.gms.auth_account");
            if (uri == null) {
                uri = Uri.parse(C86104wH.A0u(Uri.encode("com.google.android.gms.auth_account"), "content://com.google.android.gms.phenotype/"));
                r2.put("com.google.android.gms.auth_account", uri);
            }
        }
        return uri;
    }
}
