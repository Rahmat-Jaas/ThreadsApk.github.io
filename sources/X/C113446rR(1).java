package X;

import java.util.Map;

/* renamed from: X.6rR  reason: invalid class name and case insensitive filesystem */
public final class C113446rR {
    public final Map A00 = AnonymousClass0wJ.A0y();

    public final void A01(BKT bkt) {
        C04220Ms.A0B(bkt, 0);
        String str = bkt.A0D.A0f.A4Y;
        if (str != null) {
            this.A00.put(str, bkt);
        }
    }

    public final BKT A00(BKU bku) {
        String str = bku.A0f.A4Y;
        if (str == null) {
            return null;
        }
        return (BKT) this.A00.get(str);
    }
}
