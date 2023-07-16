package X;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: X.0Dj  reason: invalid class name and case insensitive filesystem */
public final class C02910Dj {
    public static C02910Dj A02;
    public final KeyStore A00;
    public final HashMap A01;

    public static synchronized C02910Dj A00() {
        C02910Dj r0;
        synchronized (C02910Dj.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = new C02910Dj();
                A02 = r0;
            }
        }
        return r0;
    }

    public C02910Dj() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidCAStore");
            instance.load((InputStream) null, (char[]) null);
            try {
                HashMap hashMap = new HashMap();
                Enumeration<String> aliases = instance.aliases();
                while (aliases.hasMoreElements()) {
                    X509Certificate x509Certificate = (X509Certificate) instance.getCertificate(aliases.nextElement());
                    if (x509Certificate != null) {
                        hashMap.put(x509Certificate.getSubjectX500Principal(), x509Certificate);
                    }
                }
                this.A01 = hashMap;
                this.A00 = instance;
            } catch (KeyStoreException e) {
                throw new AssertionError(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        } catch (KeyStoreException e3) {
            throw new AssertionError(e3);
        } catch (CertificateException e4) {
            throw new AssertionError(e4);
        } catch (FileNotFoundException e5) {
            throw new AssertionError(e5);
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
