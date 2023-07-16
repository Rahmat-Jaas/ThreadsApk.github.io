package X;

import android.net.Uri;
import ch.boye.httpclientandroidlib.HttpHost;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.74M  reason: invalid class name */
public final class AnonymousClass74M {
    public static final C30943Gbe A00 = new C30943Gbe(100);
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final Set A02;
    public static final Pattern A03 = Pattern.compile("^(z-.*)?(origincache.*|cdn).fbsbx.com$");

    static {
        HashSet hashSet = new HashSet(6);
        Collections.addAll(hashSet, new String[]{"__gda__", "oh", "oe", "hdnea", "logcdn", "efg"});
        A02 = Collections.unmodifiableSet(hashSet);
    }

    public static boolean A00(Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null || ((!HttpHost.DEFAULT_SCHEME_NAME.equals(uri.getScheme()) && !"https".equals(uri.getScheme())) || ((!host.endsWith(I17.A00(32)) && !host.equals("facebook.com") && !host.equals("fb.me")) || host.startsWith("our.intern.") || !uri.getPath().equals("/l.php")))) {
            return false;
        }
        return true;
    }
}
