package X;

import android.util.Base64;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.6rU  reason: invalid class name and case insensitive filesystem */
public final class C113476rU {
    public static C113476rU A01;
    public final C111776oN A00 = new C111776oN();

    public final String A00() {
        try {
            List<Certificate> asList = Arrays.asList(this.A00.A00.getCertificateChain("w6CmevIyM/PL6Q5uUDw="));
            StringBuilder A0r = C18200wM.A0r();
            try {
                for (Certificate encoded : asList) {
                    A0r.append("-----BEGIN CERTIFICATE-----\n");
                    A0r.append(Base64.encodeToString(encoded.getEncoded(), 0));
                    A0r.append("-----END CERTIFICATE-----\n");
                }
                return A0r.toString().trim();
            } catch (CertificateEncodingException e) {
                throw new AnonymousClass6CP("Unable to encode attestation certificates", e);
            }
        } catch (NullPointerException | KeyStoreException e2) {
            throw new AnonymousClass6CP("Unable to get certificate chain", e2);
        }
    }

    public final String A01() {
        try {
            KeyStore.Entry entry = this.A00.A00.getEntry("w6CmevIyM/PL6Q5uUDw=", (KeyStore.ProtectionParameter) null);
            try {
                if (entry instanceof KeyStore.PrivateKeyEntry) {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    instance.update(((KeyStore.PrivateKeyEntry) entry).getCertificate().getPublicKey().getEncoded());
                    byte[] digest = instance.digest();
                    StringBuilder A0r = C18200wM.A0r();
                    for (byte valueOf : digest) {
                        A0r.append(String.format(Locale.US, "%02x", new Object[]{Byte.valueOf(valueOf)}));
                    }
                    return A0r.toString();
                }
                throw C18180wK.A0a("Attestation key is not PrivateKeyEntry in keystore");
            } catch (IllegalArgumentException | IllegalStateException | NoSuchAlgorithmException e) {
                throw new AnonymousClass6CP("Unable to get key hash", e);
            }
        } catch (NullPointerException | UnsupportedOperationException | KeyStoreException | NoSuchAlgorithmException | ProviderException | UnrecoverableEntryException e2) {
            throw new AnonymousClass6CP("Unable to get entry", e2);
        }
    }
}
