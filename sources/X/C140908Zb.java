package X;

import kotlin.Unit;

/* renamed from: X.8Zb  reason: invalid class name and case insensitive filesystem */
public final class C140908Zb extends C02220Ah implements AnonymousClass0YM {
    public static final C140908Zb A00 = new C140908Zb();

    public C140908Zb() {
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
