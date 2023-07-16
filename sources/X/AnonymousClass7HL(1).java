package X;

import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.facebook.graphql.impls.FBPayAuthTicketFragmentImpl;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.7HL  reason: invalid class name */
public final class AnonymousClass7HL {
    public final SharedPreferences A00;
    public final AnonymousClass5k1 A01;
    public final AnonymousClass75Y A02;
    public final String A03;
    public final List A04 = new CopyOnWriteArrayList();

    public static synchronized PublicKey A00(AnonymousClass7HL r3, String str) {
        PublicKey publicKey;
        synchronized (r3) {
            AnonymousClass75Y r2 = r3.A02;
            r2.getClass();
            Certificate certificate = r2.A01.getCertificate(AnonymousClass00U.A0L(r3.A03, str));
            if (certificate == null) {
                publicKey = null;
            } else {
                publicKey = certificate.getPublicKey();
            }
        }
        return publicKey;
    }

    public final C120967Dk A05(String str, List list) {
        String encodeToString;
        String encodeToString2;
        String str2 = "MFT_TRUSTED_DEVICE";
        String str3 = str;
        if (!str2.equalsIgnoreCase(str3)) {
            str2 = C18230wP.A0h();
        }
        boolean equalsIgnoreCase = "BIO".equalsIgnoreCase(str3);
        synchronized (this) {
            this.A02.getClass();
            String A0L = AnonymousClass00U.A0L(this.A03, str2);
            C109816kf r6 = new C109816kf();
            r6.A00 = A0L;
            r6.A03 = equalsIgnoreCase;
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 20);
            if (r6.A01 == null) {
                r6.A01 = BigInteger.ONE;
            }
            X500Principal x500Principal = r6.A02;
            if (x500Principal == null) {
                x500Principal = new X500Principal(AnonymousClass00U.A0V("CN=", r6.A00, " CA Certificate"));
                r6.A02 = x500Principal;
            }
            String str4 = r6.A00;
            str4.getClass();
            C110636m1 r8 = new C110636m1(str4, r6.A01, instance.getTime(), instance2.getTime(), x500Principal, r6.A03);
            KeyGenParameterSpec.Builder algorithmParameterSpec = new KeyGenParameterSpec.Builder(r8.A00, 12).setKeySize(256).setCertificateSerialNumber(r8.A01).setCertificateSubject(r8.A04).setCertificateNotBefore(r8.A03).setCertificateNotAfter(r8.A02).setUserAuthenticationRequired(r8.A05).setDigests(new String[]{"SHA-256"}).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1"));
            if (C116996xx.A01()) {
                AnonymousClass75Y.A00(algorithmParameterSpec, r8);
            }
            KeyGenParameterSpec build = algorithmParameterSpec.build();
            KeyPairGenerator instance3 = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            instance3.initialize(build);
            PublicKey publicKey = instance3.generateKeyPair().getPublic();
            MessageDigest instance4 = MessageDigest.getInstance("SHA-256");
            instance4.update(publicKey.getEncoded());
            encodeToString = Base64.encodeToString(instance4.digest(), 11);
        }
        synchronized (this) {
            PublicKey A002 = A00(this, str2);
            A002.getClass();
            encodeToString2 = Base64.encodeToString(A002.getEncoded(), 2);
        }
        return C120967Dk.A01(str3, encodeToString, encodeToString2, str2, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.AnonymousClass0LU.A0E("DefaultAuthTicketManager", "Delete AT", r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Throwable A06(java.lang.String r7) {
        /*
            r6 = this;
            r5 = r6
            monitor-enter(r5)
            android.content.SharedPreferences r0 = r6.A00     // Catch:{ all -> 0x0040 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0040 }
            java.lang.String r4 = r6.A03     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r4, r7)     // Catch:{ all -> 0x0040 }
            X.C18180wK.A0u(r1, r0)     // Catch:{ all -> 0x0040 }
            X.75Y r0 = r6.A02     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = X.AnonymousClass00U.A0L(r4, r7)     // Catch:{ all -> 0x0040 }
            java.security.KeyStore r0 = r0.A01     // Catch:{ all -> 0x0040 }
            r0.deleteEntry(r1)     // Catch:{ all -> 0x0040 }
        L_0x001e:
            java.util.List r3 = r6.A04     // Catch:{ all -> 0x0040 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0040 }
        L_0x0024:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x004b
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0040 }
            X.7Dk r1 = (X.C120967Dk) r1     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r4, r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0024
            r3.remove(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x0024
        L_0x0040:
            r0 = move-exception
            throw r0     // Catch:{ IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException -> 0x0042 }
        L_0x0042:
            r2 = move-exception
            java.lang.String r1 = "DefaultAuthTicketManager"
            java.lang.String r0 = "Delete AT"
            X.AnonymousClass0LU.A0E(r1, r0, r2)     // Catch:{ all -> 0x004e }
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            monitor-exit(r5)
            return r2
        L_0x004e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HL.A06(java.lang.String):java.lang.Throwable");
    }

    public static Signature A01(AnonymousClass7HL r2, String str) {
        AnonymousClass75Y r1 = r2.A02;
        if (r1 != null) {
            String A0L = AnonymousClass00U.A0L(r2.A03, str);
            Signature instance = Signature.getInstance("SHA256withECDSA");
            instance.initSign((PrivateKey) r1.A01.getKey(A0L, (char[]) null));
            return instance;
        }
        throw new GeneralSecurityException("Key Store is null!");
    }

    public final C120967Dk A03() {
        PublicKey A002 = A00(this, "MFT_TRUSTED_DEVICE");
        if (A002 == null) {
            return null;
        }
        String encodeToString = Base64.encodeToString(A002.getEncoded(), 2);
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(A002.getEncoded());
        return C120967Dk.A01("MFT_TRUSTED_DEVICE", Base64.encodeToString(instance.digest(), 11), encodeToString, "MFT_TRUSTED_DEVICE", AnonymousClass0wJ.A0v());
    }

    public final C120967Dk A04(FBPayAuthTicketFragmentImpl fBPayAuthTicketFragmentImpl, C120967Dk r7) {
        C002801h.A04(r7.A05.equalsIgnoreCase(fBPayAuthTicketFragmentImpl.getStringValue("fingerprint")), "Local Auth Ticket and Server At fingerprint does not match");
        String str = r7.A03;
        AnonymousClass66N r0 = (AnonymousClass66N) C86104wH.A0a(fBPayAuthTicketFragmentImpl, AnonymousClass66N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "auth_ticket_type");
        r0.getClass();
        C002801h.A04(str.equalsIgnoreCase(r0.name()), "Auth Ticket and Server AT Type is differ!");
        C120967Dk A002 = C120967Dk.A00(fBPayAuthTicketFragmentImpl, r7.A01, r7.A07, System.currentTimeMillis());
        String str2 = A002.A01;
        C18180wK.A0v(this.A00.edit(), AnonymousClass00U.A0L(this.A03, str2), A002.A06);
        this.A04.add(A002);
        return A002;
    }

    public AnonymousClass7HL(SharedPreferences sharedPreferences, AnonymousClass75Y r3, C104996ci r4, AnonymousClass6S4 r5, String str) {
        this.A03 = str;
        this.A02 = r3;
        this.A00 = sharedPreferences;
        this.A01 = new AnonymousClass5k1(this, r4, r5);
    }

    public static Map A02(AnonymousClass7HL r6) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(r6.A00.getAll());
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            if (A0o.getValue() instanceof String) {
                String A0p = C18200wM.A0p(A0o);
                String str = r6.A03;
                if (A0p.startsWith(str)) {
                    C86144wL.A1P(C18200wM.A0p(A0o).substring(str.length()), A0y, A0o);
                }
            }
        }
        return A0y;
    }
}
