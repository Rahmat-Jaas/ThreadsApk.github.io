package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Bq  reason: invalid class name and case insensitive filesystem */
public final class C120597Bq {
    public static final void A00(Context context, BKU bku, UserSession userSession, Integer num, String str, int i) {
        C18330wh r7 = new C18330wh(context);
        r7.setCancelable(false);
        r7.setCanceledOnTouchOutside(false);
        C18330wh.A02(context, r7, i);
        C13950oZ.A00(r7);
        C95035yg r3 = new C95035yg(context, bku, userSession, r7, num);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0T(str, C18180wK.A0j("%s_%s", new Object[]{bku.A0f.A4Y, userSession.getUserId()}));
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, AnonymousClass5uB.class, C1184971d.class);
        A0T.A00 = r3;
        C31155GhB.A03(A0T);
    }

    public static final boolean A01(BKU bku, UserSession userSession) {
        List A3O = bku.A3O();
        C04220Ms.A06(A3O);
        if (!(A3O instanceof Collection) || !A3O.isEmpty()) {
            Iterator it = A3O.iterator();
            while (it.hasNext()) {
                if (C18250wR.A1J(userSession, C86134wK.A0p(C18220wO.A0c(it)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A02(BKU bku, UserSession userSession) {
        if (!C18250wR.A1J(userSession, C86134wK.A0p(bku.A2Z(userSession)))) {
            return false;
        }
        List A3O = bku.A3O();
        C04220Ms.A06(A3O);
        if (C18190wL.A1a(A3O)) {
            return true;
        }
        return false;
    }
}
