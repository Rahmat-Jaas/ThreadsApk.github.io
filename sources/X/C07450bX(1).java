package X;

import ch.boye.httpclientandroidlib.conn.ssl.SSLSocketFactory;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;

/* renamed from: X.0bX  reason: invalid class name and case insensitive filesystem */
public final class C07450bX implements AnonymousClass09B {
    public long A00;
    public C05380Tj A01;

    public C07450bX(long j) {
        this.A00 = j;
    }

    public final HttpURLConnection AZ7(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            C05380Tj r3 = this.A01;
            if (r3 == null) {
                r3 = new C05380Tj(this.A00);
                this.A01 = r3;
            }
            try {
                SSLContext instance = SSLContext.getInstance(SSLSocketFactory.TLS);
                instance.init((KeyManager[]) null, r3.A00, (SecureRandom) null);
                httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
            } catch (KeyManagementException | NoSuchAlgorithmException e) {
                AnonymousClass0LU.A0G("lacrima", "Pinning failed", e);
                C04790Pd.A00();
            }
        }
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        return httpURLConnection;
    }
}
