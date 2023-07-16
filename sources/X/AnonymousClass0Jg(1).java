package X;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: X.0Jg  reason: invalid class name */
public final class AnonymousClass0Jg extends C07830cG implements C07840cH {
    public final X509TrustManagerExtensions A00 = new X509TrustManagerExtensions(this.A02);

    public final void ACk(String str, String str2, X509Certificate[] x509CertificateArr) {
        A00(this.A00.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA", str2));
    }

    public final void ACl(String str, String str2, X509Certificate[] x509CertificateArr, boolean z) {
        List<X509Certificate> checkServerTrusted = this.A00.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA", str2);
        if (z) {
            A00(checkServerTrusted);
        }
    }

    public AnonymousClass0Jg(C02910Dj r3, long j) {
        super(r3, j);
    }
}
