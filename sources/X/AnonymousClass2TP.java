package X;

import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.2TP  reason: invalid class name */
public final class AnonymousClass2TP {
    public static final void A00(View view, UserSession userSession) {
        Integer valueOf;
        AnonymousClass249 r0 = (AnonymousClass249) AnonymousClass249.A01.get(Integer.valueOf(C63803iN.A01(AnonymousClass0TJ.A05, userSession, 36608510230008699L)));
        if (r0 == null) {
            r0 = AnonymousClass249.NONE;
        }
        int ordinal = r0.ordinal();
        int i = 4;
        if (ordinal != 1) {
            i = 3;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    valueOf = 1;
                    view.performHapticFeedback(valueOf.intValue());
                }
                return;
            }
        }
        valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            return;
        }
        view.performHapticFeedback(valueOf.intValue());
    }
}
