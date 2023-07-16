package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.453  reason: invalid class name */
public final class AnonymousClass453 implements C82384pX {
    public final Map Aow() {
        List A0n = C18180wK.A0n(new AnonymousClass4O1(AnonymousClass006.A0u, "clips_many_organic", "clips_organic_feed.json", "Many Organic Reels"));
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(C02260Al.A0z(A0n, 10)));
        Iterator it = A0n.iterator();
        while (it.hasNext()) {
            AnonymousClass4O1.A00(A0v, it);
        }
        return A0v;
    }
}
