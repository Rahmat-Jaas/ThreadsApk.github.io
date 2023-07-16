package X;

import android.net.Uri;
import ch.boye.httpclientandroidlib.HttpHost;
import java.util.Locale;

/* renamed from: X.75y  reason: invalid class name and case insensitive filesystem */
public final class C1195775y {
    public Uri A00;
    public String A01;
    public String A02;

    public C1195775y(Uri uri) {
        this.A00 = uri;
        String host = uri.getHost();
        AnonymousClass0SJ.A00(host);
        Locale locale = Locale.ENGLISH;
        this.A01 = host.toLowerCase(locale);
        String scheme = uri.getScheme();
        AnonymousClass0SJ.A00(scheme);
        this.A02 = scheme.toLowerCase(locale);
    }

    public static C1195775y A00(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return null;
        }
        if ((scheme.equalsIgnoreCase(HttpHost.DEFAULT_SCHEME_NAME) || scheme.equalsIgnoreCase("https")) && uri.getHost() != null) {
            return new C1195775y(uri);
        }
        return null;
    }
}
