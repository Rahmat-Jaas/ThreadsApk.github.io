package X;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;

/* renamed from: X.0Jh  reason: invalid class name */
public final class AnonymousClass0Jh extends X509ExtendedTrustManager implements C07840cH {
    public final AnonymousClass0Jg A00;

    public final void ACk(String str, String str2, X509Certificate[] x509CertificateArr) {
        this.A00.ACk("ECDHE_ECDSA", str2, x509CertificateArr);
    }

    public final void ACl(String str, String str2, X509Certificate[] x509CertificateArr, boolean z) {
        this.A00.ACl("ECDHE_ECDSA", str2, x509CertificateArr, z);
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        AnonymousClass0Jg r1 = this.A00;
        ((X509ExtendedTrustManager) r1.A02).checkServerTrusted(x509CertificateArr, str, socket);
        r1.A01(x509CertificateArr);
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.A00.getAcceptedIssuers();
    }

    public AnonymousClass0Jh(long j) {
        this.A00 = new AnonymousClass0Jg(C02910Dj.A00(), j);
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        AnonymousClass0Jg r1 = this.A00;
        ((X509ExtendedTrustManager) r1.A02).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        r1.A01(x509CertificateArr);
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.A00.checkServerTrusted(x509CertificateArr, str);
    }
}
