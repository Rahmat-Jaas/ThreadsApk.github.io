package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4WH  reason: invalid class name */
public final class AnonymousClass4WH extends AnonymousClass4WI {
    public static final List A06(Map map) {
        C04220Ms.A0B(map, 0);
        if (map.size() != 0) {
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            if (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                if (!A0z.hasNext()) {
                    return C18180wK.A0n(C18180wK.A0p(A0o.getKey(), A0o.getValue()));
                }
                ArrayList A0w = C18220wO.A0w(map);
                A0w.add(C18180wK.A0p(A0o.getKey(), A0o.getValue()));
                do {
                    Map.Entry A0o2 = C18180wK.A0o(A0z);
                    A0w.add(C18180wK.A0p(A0o2.getKey(), A0o2.getValue()));
                } while (A0z.hasNext());
                return A0w;
            }
        }
        return AnonymousClass0ZV.A00;
    }
}
