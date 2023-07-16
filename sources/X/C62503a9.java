package X;

import android.content.Context;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3a9  reason: invalid class name and case insensitive filesystem */
public final class C62503a9 {
    public static final List A00 = C40564Liz.A00;
    public static final List A01 = C40565Lj0.A00;

    public static boolean A02() {
        if (Locale.GERMANY.getCountry().equalsIgnoreCase(C31103Gfm.A02().getCountry()) || Locale.GERMANY.getCountry().equalsIgnoreCase(C31103Gfm.A03().getCountry())) {
            return true;
        }
        return false;
    }

    public static void A00() {
        C31103Gfm.A04();
    }

    public static void A01(Context context, AnonymousClass19W r4) {
        C31103Gfm.A02().toString();
        C08350dD A002 = C08360dF.A00();
        C18180wK.A0v(C18220wO.A0B(A002), "fb_language_locale", r4.A02);
        C31103Gfm.A04();
        C38040KHr.A01.A02(new AnonymousClass45O(context, r4));
        AnonymousClass0hB.A00 = null;
    }
}
