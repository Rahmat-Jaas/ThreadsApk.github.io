package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2tK  reason: invalid class name and case insensitive filesystem */
public final class C50642tK {
    public static void A00(C11630kW r5, UserSession userSession, String str, List list) {
        String str2;
        boolean z;
        String str3;
        ArrayList A0t = C18200wM.A0t(list);
        Iterator it = list.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                break;
            }
            C81524nw r2 = ((DirectShareTarget) it.next()).A09;
            if (r2 instanceof CMN) {
                str2 = ((CMN) r2).A00;
            }
            A0t.add(str2);
        }
        if (r5 != null) {
            str2 = r5.getModuleName();
        }
        C15730rn A01 = C15730rn.A01("direct_inapp_notification_tap", str2);
        A01.A0D("reason", str);
        A01.A0E("thread_ids", A0t);
        if (!A0t.isEmpty()) {
            A01.A0D("thread_id", C18190wL.A0p(A0t, 0));
        }
        if (userSession != null) {
            C18180wK.A1K(A01, userSession);
            if (A0t.size() > 1) {
                z = false;
                str3 = "Must call setInstance first";
            } else {
                H5O.A01().A06();
                z = false;
                str3 = "Must call setInstanceSupplier first";
            }
            AnonymousClass7Ko.A0E(z, str3);
            throw null;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
