package X;

import android.content.SharedPreferences;
import java.io.ByteArrayOutputStream;

/* renamed from: X.1z8  reason: invalid class name */
public final class AnonymousClass1z8 extends ByteArrayOutputStream {
    public final SharedPreferences A00;
    public final String A01;

    public AnonymousClass1z8(SharedPreferences sharedPreferences, String str) {
        this.A00 = sharedPreferences;
        this.A01 = str;
    }

    public final void close() {
        super.close();
        SharedPreferences.Editor edit = this.A00.edit();
        String str = this.A01;
        StringBuilder sb = new StringBuilder(r4 << 1);
        for (byte b : toByteArray()) {
            byte b2 = b & 255;
            if (b2 < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(b2));
        }
        C18180wK.A0v(edit, str, sb.toString().toUpperCase());
    }
}
