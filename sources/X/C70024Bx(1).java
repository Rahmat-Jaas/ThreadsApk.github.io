package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.4Bx  reason: invalid class name and case insensitive filesystem */
public final class C70024Bx implements C146218lq {
    public final SharedPreferences A00;
    public final String A01;

    public final OutputStream BEI(Context context) {
        return new AnonymousClass1z8(this.A00, this.A01);
    }

    public final Integer BJ1() {
        return AnonymousClass006.A0C;
    }

    public final InputStream CwL(Context context) {
        String A0h = C18200wM.A0h(this.A00, this.A01);
        if (A0h == null) {
            return null;
        }
        int length = A0h.length();
        byte[] bArr = new byte[(length >> 1)];
        for (int i = 0; i < length; i += 2) {
            bArr[i >> 1] = (byte) ((Character.digit(A0h.charAt(i), 16) << 4) + Character.digit(A0h.charAt(i + 1), 16));
        }
        return new ByteArrayInputStream(C18250wR.A0b(bArr).getBytes());
    }

    public final String getName() {
        return this.A01;
    }

    public C70024Bx(Context context, String str) {
        this.A00 = context.getSharedPreferences("legacy_prefs", 0);
        this.A01 = str;
    }
}
