package X;

import android.os.Bundle;

/* renamed from: X.2MR  reason: invalid class name */
public final class AnonymousClass2MR {
    public static final Integer A00(Bundle bundle) {
        String string = bundle.getString("waitlistJoinSourceKey");
        if (string == null) {
            throw AnonymousClass0wJ.A0b();
        } else if (string.equals("QUICK_PROMOTION")) {
            return AnonymousClass006.A00;
        } else {
            if (string.equals("WAITLIST_INFO_NUX")) {
                return AnonymousClass006.A01;
            }
            throw C18190wL.A0a(string);
        }
    }
}
