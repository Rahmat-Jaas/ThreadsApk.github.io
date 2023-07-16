package X;

import android.os.Bundle;

/* renamed from: X.3M9  reason: invalid class name */
public final class AnonymousClass3M9 {
    public static final void A01(Bundle bundle, Integer num) {
        String str;
        if (C18240wQ.A06(num, 1) != 0) {
            str = "EXTERNAL_LINK";
        } else {
            str = "QUICK_PROMOTION";
        }
        bundle.putString("waitlistInfoSourceKey", str);
    }

    public static final Integer A00(Bundle bundle) {
        String string = bundle.getString("waitlistInfoSourceKey");
        if (string == null) {
            throw AnonymousClass0wJ.A0b();
        } else if (string.equals("QUICK_PROMOTION")) {
            return AnonymousClass006.A00;
        } else {
            if (string.equals("EXTERNAL_LINK")) {
                return AnonymousClass006.A01;
            }
            throw C18190wL.A0a(string);
        }
    }
}
