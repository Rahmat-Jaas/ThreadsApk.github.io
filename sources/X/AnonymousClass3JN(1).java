package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3JN  reason: invalid class name */
public final class AnonymousClass3JN {
    public static final void A01(C10300i6 r4, String str, String str2, boolean z) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r4), "ig_one_login_deferred_login_finished"), 1390);
        A0I.A0T("containermodule", "account_switch_fragment");
        A0I.A0S("account_id", AnonymousClass0wJ.A0d(str));
        A0I.A0Q("succeeded", Boolean.valueOf(z));
        A0I.A0T("reason", str2);
        A0I.Bb4();
    }

    public static final Set A00(List list) {
        HashSet A0u = C18200wM.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0u.add(AnonymousClass0wJ.A0d(C18180wK.A0k(it)));
        }
        return A0u;
    }
}
