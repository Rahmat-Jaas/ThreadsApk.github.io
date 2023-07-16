package X;

import javax.net.ssl.X509TrustManager;

/* renamed from: X.0Tj  reason: invalid class name and case insensitive filesystem */
public class C05380Tj {
    public final X509TrustManager[] A00;

    public C05380Tj(long j) {
        X509TrustManager[] x509TrustManagerArr = new X509TrustManager[1];
        this.A00 = x509TrustManagerArr;
        x509TrustManagerArr[0] = new AnonymousClass0Jh(j);
    }

    public C05380Tj(long j, boolean z) {
        X509TrustManager[] x509TrustManagerArr = new X509TrustManager[1];
        this.A00 = x509TrustManagerArr;
        x509TrustManagerArr[0] = new AnonymousClass0Jg((C02910Dj) null, j);
    }
}
