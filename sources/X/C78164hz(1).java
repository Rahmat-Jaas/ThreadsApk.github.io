package X;

import java.util.Map;

/* renamed from: X.4hz  reason: invalid class name and case insensitive filesystem */
public final class C78164hz extends C02220Ah implements AnonymousClass0YY {
    public static final C78164hz A00 = new C78164hz();

    public C78164hz() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C04220Ms.A0B(entry, 0);
        StringBuilder A0s = C18190wL.A0s("|    ");
        A0s.append(C18200wM.A0p(entry));
        A0s.append(" = ");
        return C18200wM.A0m(entry.getValue(), A0s);
    }
}
