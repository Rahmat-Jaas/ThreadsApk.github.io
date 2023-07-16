package X;

import kotlin.Unit;

/* renamed from: X.8XD  reason: invalid class name */
public final class AnonymousClass8XD extends C02220Ah implements AnonymousClass0YP {
    public static final AnonymousClass8XD A00 = new AnonymousClass8XD();

    public AnonymousClass8XD() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass7Y3 r2 = (AnonymousClass7Y3) obj;
        C147168nV r3 = (C147168nV) obj2;
        AnonymousClass0wJ.A1N(r2, r3);
        C872050o r0 = r2.A0E;
        if (r0 != null) {
            ((AnonymousClass55P) r0).setDensity(r3);
            return Unit.A00;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
