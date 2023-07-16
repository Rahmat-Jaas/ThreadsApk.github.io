package X;

import kotlin.Unit;

/* renamed from: X.8Zf  reason: invalid class name */
public final class AnonymousClass8Zf extends C02220Ah implements AnonymousClass0YM {
    public static final AnonymousClass8Zf A00 = new AnonymousClass8Zf();

    public AnonymousClass8Zf() {
        super(3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass0YP r4 = (AnonymousClass0YP) obj;
        C147188nY r5 = (C147188nY) obj2;
        int A04 = AnonymousClass0wJ.A04(obj3);
        if (C86124wJ.A0G(r4, A04) == 0) {
            A04 |= C147188nY.A09(r5, r4);
        }
        if ((A04 & 91) != 18 || !r5.BCM()) {
            C86104wH.A1S(r5, r4, A04);
        } else {
            r5.CuJ();
        }
        return Unit.A00;
    }
}
