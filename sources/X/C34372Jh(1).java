package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Jh  reason: invalid class name and case insensitive filesystem */
public final class C34372Jh {
    public static List A00(C28161tl r2) {
        try {
            String A0h = C18200wM.A0h(r2.A00, "feed_btp_timestamps");
            if (A0h == null) {
                return AnonymousClass0ZV.A00;
            }
            List A06 = C81074n3.A06(A0h);
            ArrayList A0w = AnonymousClass0wJ.A0w(A06);
            Iterator it = A06.iterator();
            while (it.hasNext()) {
                A0w.add(AnonymousClass0wJ.A0d(C18180wK.A0k(it)));
            }
            return A0w;
        } catch (Exception unused) {
            return AnonymousClass0ZV.A00;
        }
    }
}
