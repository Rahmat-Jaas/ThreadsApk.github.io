package X;

import android.os.Bundle;

/* renamed from: X.2SL  reason: invalid class name */
public final class AnonymousClass2SL {
    public static void A00(Bundle bundle, String str, String str2, String str3, boolean z, boolean z2) {
        C313225m r0;
        bundle.putString("COUNTRY_CODE", str2);
        bundle.putString("NATIONAL_NUMBER", str3);
        bundle.putBoolean("IS_PHONE_CONFIRMED", false);
        bundle.putString("PHONE_NUMBER", str);
        if (z) {
            r0 = C313225m.ARGUMENT_TWOFAC_FLOW;
        } else {
            r0 = C313225m.ARGUMENT_EDIT_PROFILE_FLOW;
        }
        C313225m.A00(bundle, r0);
        bundle.putBoolean("HAS_SMS_CONSENT", z2);
    }
}
