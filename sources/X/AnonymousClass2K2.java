package X;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;

/* renamed from: X.2K2  reason: invalid class name */
public final class AnonymousClass2K2 {
    public static boolean A00(String str, String str2, boolean z) {
        boolean equalsIgnoreCase;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return TextUtils.isEmpty(str) ^ TextUtils.isEmpty(str2);
        }
        if (z) {
            equalsIgnoreCase = PhoneNumberUtils.compare(str, str2);
        } else {
            equalsIgnoreCase = str.equalsIgnoreCase(str2);
        }
        if (equalsIgnoreCase) {
            return false;
        }
        return true;
    }
}
