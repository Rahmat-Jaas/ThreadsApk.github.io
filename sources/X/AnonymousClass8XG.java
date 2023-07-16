package X;

import kotlin.Unit;

/* renamed from: X.8XG  reason: invalid class name */
public final class AnonymousClass8XG extends C02220Ah implements AnonymousClass0YP {
    public static final AnonymousClass8XG A00 = new AnonymousClass8XG();

    public AnonymousClass8XG() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass7Y3 r6 = (AnonymousClass7Y3) obj;
        AnonymousClass69J r7 = (AnonymousClass69J) obj2;
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, r7);
        C872050o r2 = r6.A0E;
        if (r2 != null) {
            AnonymousClass55P r22 = (AnonymousClass55P) r2;
            int ordinal = r7.ordinal();
            int i = 1;
            if (ordinal == 0) {
                i = 0;
            } else if (ordinal != A1Z) {
                throw AnonymousClass4VZ.A00();
            }
            r22.setLayoutDirection(i);
            return Unit.A00;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
