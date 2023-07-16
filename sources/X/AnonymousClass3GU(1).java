package X;

import android.content.Context;
import android.view.WindowManager;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3GU  reason: invalid class name */
public final class AnonymousClass3GU {
    public final void A01(UserSession userSession, Context context, boolean z) {
        String str;
        String str2;
        ArrayList arrayList = AnonymousClass3X5.A00;
        Iterator it = C18200wM.A0s(arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            C84344sz r1 = (C84344sz) it.next();
            if (!r1.BR1(context, userSession)) {
                str = r1.AOV(context, userSession, z);
                break;
            }
        }
        Iterator it2 = C18200wM.A0s(arrayList).iterator();
        while (true) {
            if (!it2.hasNext()) {
                str2 = null;
                break;
            }
            C84344sz r12 = (C84344sz) it2.next();
            if (!r12.BR1(context, userSession)) {
                str2 = r12.AOU(context, userSession, z);
                break;
            }
        }
        try {
            C25828Dsm A0W = C18190wL.A0W(context);
            str.getClass();
            A0W.A02 = str;
            str2.getClass();
            A0W.A0p(str2);
            A0W.A0q(false);
            C18180wK.A1O(A0W, this, 110, 2131831976);
            AnonymousClass0wJ.A1K(A0W);
        } catch (WindowManager.BadTokenException unused) {
            C63813iO.A01(context, str2);
        }
    }

    public final void A00(Context context) {
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(2131837190);
        A0W.A0q(false);
        A0W.A0K(2131830299);
        C18180wK.A1O(A0W, this, 111, 2131831976);
        AnonymousClass0wJ.A1K(A0W);
    }
}
