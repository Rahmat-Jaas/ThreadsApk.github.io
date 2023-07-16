package X;

import java.util.Set;

/* renamed from: X.76Z  reason: invalid class name */
public final class AnonymousClass76Z {
    public Set A00 = C86134wK.A0u();
    public Set A01 = C86134wK.A0u();
    public Set A02 = C86134wK.A0u();
    public final AnonymousClass0ZU A03 = C86154wM.A13(this, 12);
    public final AnonymousClass0YY A04;

    public AnonymousClass76Z(AnonymousClass0YY r2) {
        this.A04 = r2;
    }

    public static final void A00(AnonymousClass76Z r2, Object obj, Set set) {
        if (!set.contains(obj)) {
            set.add(obj);
            if (r2.A02.size() + r2.A00.size() + r2.A01.size() == 1) {
                r2.A04.invoke(r2.A03);
            }
        }
    }
}
