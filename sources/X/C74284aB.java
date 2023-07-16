package X;

import java.util.LinkedHashMap;

/* renamed from: X.4aB  reason: invalid class name and case insensitive filesystem */
public final class C74284aB extends C02220Ah implements AnonymousClass0ZU {
    public static final C74284aB A00 = new C74284aB();

    public C74284aB() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C311824o[] values = C311824o.values();
        int length = values.length;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(length));
        int i = 0;
        while (i < length) {
            C311824o r1 = values[i];
            i = C18200wM.A08(r1, A0v, r1.A00, i);
        }
        return A0v;
    }
}
