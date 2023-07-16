package X;

import android.util.Base64;
import com.facebook.cryptopub.CryptoPubNative;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3XZ  reason: invalid class name */
public final class AnonymousClass3XZ {
    public static int A02 = 2;
    public static final C61253Sm A03 = new C61253Sm();
    public static final CryptoPubNative A04 = new CryptoPubNative();
    public static final AtomicBoolean A05 = C18230wP.A0w();
    public C58623Gm A00;
    public AnonymousClass301 A01;

    public static C57643Bw A00(String str, String str2) {
        try {
            return new C57643Bw("", Base64.encodeToString(A04.encrypt(41, "-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvcu1KMDR1vzuBr9iYKW8\nKWmhT8CVUBRkchiO8861H7zIOYRwkQrkeHA+0mkBo3Ly1PiLXDkbKQZyeqZbspke\n4e7WgFNwT23jHfRMV/cNPxjPEy4kxNEbzLET6GlWepGdXFhzHfnS1PinGQzj0ZOU\nZM3pQjgGRL9fAf8brt1ewhQ5XtpvKFdPyQq5BkeFEDKoInDsC/yKDWRAx2twgPFr\nCYUzAB8/yXuL30ErTHT79bt3yTnv1fRtE19tROIlBuqruwSBk9gGq/LuvSECgsl5\nz4VcpHXhgZt6MhrAj6y9vAAxO2RVrt0Mq4OY4HgyYz9Wlr1vAxXXGAAYIvrhAYLP\n7QIDAQAB\n-----END PUBLIC KEY-----\n", str, str2), 2), new C32142Ak("Default key used.", AnonymousClass006.A00), 0);
        } catch (Exception e) {
            return new C57643Bw("", str, new C32142Ak(e, AnonymousClass006.A01), 0);
        }
    }

    public AnonymousClass3XZ(C58623Gm r1, AnonymousClass301 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
