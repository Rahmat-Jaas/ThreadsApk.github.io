package X;

import java.util.Map;

/* renamed from: X.8QX  reason: invalid class name */
public final class AnonymousClass8QX extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8QX A00 = new AnonymousClass8QX();

    public AnonymousClass8QX() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C04220Ms.A0B(entry, 0);
        String A0p = C18200wM.A0p(entry);
        Object value = entry.getValue();
        StringBuilder A0r = C18200wM.A0r();
        AnonymousClass744.A00(A0r, A0p);
        A0r.append(':');
        A0r.append(value);
        return C18190wL.A0n(A0r);
    }
}
