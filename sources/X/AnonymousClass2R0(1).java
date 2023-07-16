package X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.2R0  reason: invalid class name */
public final class AnonymousClass2R0 {
    public static String A00() {
        String upperCase;
        AnonymousClass3FH A0N = C18220wO.A0N(C10260hz.A00);
        if (A0N == null) {
            upperCase = "";
        } else {
            upperCase = A0N.A01.toUpperCase(Locale.ROOT);
        }
        if (!TextUtils.isEmpty(upperCase)) {
            return upperCase;
        }
        AnonymousClass0LU.A0N("MobileConfigIGUtils", "Initializing device id MetaConfig with empty family device id:%s", "EMPTY_FAMILY_DEVICE_ID");
        return "EMPTY_FAMILY_DEVICE_ID";
    }
}
