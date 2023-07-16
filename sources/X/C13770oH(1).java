package X;

import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;

/* renamed from: X.0oH  reason: invalid class name and case insensitive filesystem */
public final class C13770oH {
    public static void A02(URLConnection uRLConnection, int i) {
        ExternalProvider externalProvider = ExternalProviders.A07;
        int i2 = i;
        int A00 = externalProvider.A08().A00(6, 21, i2, 0, 0);
        try {
            uRLConnection.connect();
        } finally {
            externalProvider.A08().A00(6, 22, i2, A00, 0);
        }
    }

    public static InputStream A00(URLConnection uRLConnection, int i) {
        return new C13910oV(uRLConnection.getInputStream(), i);
    }

    public static OutputStream A01(URLConnection uRLConnection, int i) {
        return new C13890oT(uRLConnection.getOutputStream(), i);
    }
}
