package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.Locale;

/* renamed from: X.2BX  reason: invalid class name */
public final class AnonymousClass2BX {
    public static final void A00(Context context, C127397h3 r7, IgdsMediaButton igdsMediaButton) {
        C308523f r0;
        String A0N;
        Drawable A01;
        C127397h3 A0K = r7.A0K(46);
        C127397h3 A0K2 = r7.A0K(45);
        if (!(A0K == null || (A0N = A0K.A0N(36)) == null || (A01 = C30842GYq.A01(context, A0N)) == null)) {
            igdsMediaButton.setStartAddOn(new AnonymousClass3SM(A01), (CharSequence) null);
        }
        if (A0K2 == null) {
            return;
        }
        if (r7.A0N(43) != null) {
            String A0N2 = A0K2.A0N(36);
            if (A0N2 != null) {
                String A0p = C18190wL.A0p(AnonymousClass8bP.A0f(A0N2, new String[]{"_"}, 3, 2), 0);
                Locale locale = Locale.ROOT;
                C04220Ms.A08(locale);
                String A0u = C18220wO.A0u(locale, A0p);
                if (A0u.equals("CHEVRON")) {
                    r0 = C308523f.CHEVRON;
                } else if (A0u.equals("CREATION-ARROW")) {
                    r0 = C308523f.CREATION_ARROW;
                } else {
                    return;
                }
                igdsMediaButton.setEndAddOn(r0);
                return;
            }
            return;
        }
        throw C18250wR.A0V("Cannot pass in only end icon when button has no text");
    }
}
