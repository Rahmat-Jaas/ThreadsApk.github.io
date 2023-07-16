package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7oV  reason: invalid class name */
public final class AnonymousClass7oV implements C39520Kv4 {
    public final BKT A00;

    public AnonymousClass7oV(BKT bkt) {
        C04220Ms.A0B(bkt, 1);
        this.A00 = bkt;
    }

    public final Map Agp() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        String A002 = I17.A00(667);
        String str = this.A00.A0Z;
        if (str != null) {
            A0y.put(A002, str);
            return A0y;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
