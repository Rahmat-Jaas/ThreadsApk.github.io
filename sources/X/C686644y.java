package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.44y  reason: invalid class name and case insensitive filesystem */
public final class C686644y implements C39678Kxx {
    public final /* bridge */ /* synthetic */ String ChJ(Object obj) {
        String obj2;
        AnonymousClass36M r7 = (AnonymousClass36M) obj;
        synchronized (this) {
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            if (r7.A00 != null) {
                A0K.A0U("pending_reel_tray_seen_state");
                AnonymousClass3UL r1 = r7.A00;
                A0K.A0J();
                if (r1.A00 != null) {
                    A0K.A0U("reel_tray_impressions");
                    A0K.A0J();
                    Iterator A0u = C18190wL.A0u(r1.A00);
                    while (A0u.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0u);
                        A0K.A0U(C18200wM.A0p(A0o));
                        if (A0o.getValue() == null) {
                            A0K.A0H();
                        } else {
                            A0K.A0O(((Long) A0o.getValue()).longValue());
                        }
                    }
                    A0K.A0G();
                }
                A0K.A0G();
            }
            A0K.A0G();
            A0K.close();
            obj2 = A0d.toString();
        }
        return obj2;
    }

    public final /* bridge */ /* synthetic */ Object CW1(String str) {
        return C50162sY.parseFromJson(C18180wK.A0L(str));
    }
}
