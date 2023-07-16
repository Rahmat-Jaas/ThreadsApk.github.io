package X;

import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6gj  reason: invalid class name and case insensitive filesystem */
public final class C107426gj {
    public final X509Certificate A00;
    public final List A01;

    public C107426gj(List list) {
        this.A01 = Collections.unmodifiableList(list);
        X509Certificate x509Certificate = null;
        try {
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(AnonymousClass00U.A0V("-----BEGIN CERTIFICATE-----\n", (String) C18240wQ.A0b(list), "\n-----END CERTIFICATE-----").getBytes()));
            if (generateCertificate instanceof X509Certificate) {
                x509Certificate = (X509Certificate) generateCertificate;
            }
        } catch (Throwable unused) {
        }
        this.A00 = x509Certificate;
    }
}
