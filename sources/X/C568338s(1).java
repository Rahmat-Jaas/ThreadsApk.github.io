package X;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;

/* renamed from: X.38s  reason: invalid class name and case insensitive filesystem */
public final class C568338s {
    public final AnonymousClass3UU A00;
    public final String A01;

    public C568338s(AnonymousClass3UU r6) {
        String obj;
        C04220Ms.A0B(r6, 1);
        this.A00 = r6;
        ImmutableMap immutableMap = r6.A01;
        C04220Ms.A06(immutableMap);
        if (immutableMap.isEmpty()) {
            obj = null;
        } else {
            StringBuilder A0r = C18200wM.A0r();
            Iterator it = AnonymousClass00J.A0M(immutableMap.keySet()).iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                if (A0r.length() > 0) {
                    A0r.append("|");
                }
                A0r.append(A0k);
                A0r.append(":");
                A0r.append(C18220wO.A0r(A0k, immutableMap));
            }
            obj = A0r.toString();
        }
        this.A01 = obj;
    }
}
