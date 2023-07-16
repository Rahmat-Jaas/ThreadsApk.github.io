package X;

import kotlin.Unit;

/* renamed from: X.8XF  reason: invalid class name */
public final class AnonymousClass8XF extends C02220Ah implements AnonymousClass0YP {
    public static final AnonymousClass8XF A00 = new AnonymousClass8XF();

    public AnonymousClass8XF() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass7Y3 r2 = (AnonymousClass7Y3) obj;
        C15750rp r3 = (C15750rp) obj2;
        AnonymousClass0wJ.A1N(r2, r3);
        C872050o r0 = r2.A0E;
        if (r0 != null) {
            ((AnonymousClass55P) r0).setSavedStateRegistryOwner(r3);
            return Unit.A00;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
