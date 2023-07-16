package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Fn  reason: invalid class name and case insensitive filesystem */
public final class C33392Fn {
    public static final void A00(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, List list) {
        C04220Ms.A0B(list, 1);
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw C18210wN.A0W("threadKey");
        }
        uSLEBaseShape0S0000000.A0S("unread_threads_count", C18230wP.A0f(A0w.size()));
        uSLEBaseShape0S0000000.A0U("unread_threads", A0w);
    }
}
