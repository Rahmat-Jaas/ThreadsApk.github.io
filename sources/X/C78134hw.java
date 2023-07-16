package X;

import java.util.Map;

/* renamed from: X.4hw  reason: invalid class name and case insensitive filesystem */
public final class C78134hw extends C02220Ah implements AnonymousClass0YY {
    public static final C78134hw A00 = new C78134hw();

    public C78134hw() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C04220Ms.A0B(entry, 0);
        return Boolean.valueOf(C18180wK.A1X((C18190wL.A08(entry.getValue()) > (System.currentTimeMillis() + ((long) 5000)) ? 1 : (C18190wL.A08(entry.getValue()) == (System.currentTimeMillis() + ((long) 5000)) ? 0 : -1))));
    }
}
