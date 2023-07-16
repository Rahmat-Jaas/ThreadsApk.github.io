package X;

import android.text.TextUtils;

/* renamed from: X.6Iq  reason: invalid class name and case insensitive filesystem */
public final class C99236Iq {
    public static boolean A00(AnonymousClass69W r6, String str) {
        int length;
        if (TextUtils.isEmpty(str) || AnonymousClass69W.EMPTY == r6 || !TextUtils.isDigitsOnly(str) || (length = str.length()) < r6.A01 || length > r6.A00) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int charAt = str.charAt((length - 1) - i2) - '0';
            if (i2 % 2 != 0 && (charAt = charAt << 1) > 9) {
                charAt = (charAt - 10) + 1;
            }
            i += charAt;
        }
        if (i % 10 == 0) {
            return true;
        }
        return false;
    }
}
