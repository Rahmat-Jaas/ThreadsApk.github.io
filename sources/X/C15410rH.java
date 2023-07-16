package X;

import android.text.TextUtils;
import java.nio.CharBuffer;

/* renamed from: X.0rH  reason: invalid class name and case insensitive filesystem */
public final class C15410rH {
    public final String A00;
    public final String A01;
    public final String A02;

    public final String A01() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.A02)) {
            sb.append("<REDACTED>");
            sb.append("@");
        }
        String str = this.A00;
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        String str2 = this.A01;
        if (!TextUtils.isEmpty(str2)) {
            sb.append(":");
            sb.append(str2);
        }
        return sb.toString();
    }

    public C15410rH(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public static void A00(CharBuffer charBuffer) {
        int limit = charBuffer.limit() - charBuffer.position();
        if (limit >= 4 || limit <= 0) {
            throw new IllegalArgumentException("IPV4 octet must contain between 1 and 3 digits");
        }
        try {
            int parseInt = Integer.parseInt(charBuffer.toString(), 10);
            if (parseInt < 0 || parseInt > 255) {
                throw new IllegalArgumentException(AnonymousClass00U.A0J("IPV4 octet value must be between 0 and 255, got ", parseInt));
            }
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("Unable to parse decimal octet ");
            sb.append(charBuffer);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public final String toString() {
        return A01();
    }
}
