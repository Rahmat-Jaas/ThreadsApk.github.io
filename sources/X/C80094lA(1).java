package X;

import java.util.Map;

/* renamed from: X.4lA  reason: invalid class name and case insensitive filesystem */
public final class C80094lA extends C02220Ah implements AnonymousClass0YY {
    public static final C80094lA A00 = new C80094lA();

    public C80094lA() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C04220Ms.A0B(entry, 0);
        return Boolean.valueOf(C04220Ms.A0I(entry.getKey(), "media_id"));
    }
}
