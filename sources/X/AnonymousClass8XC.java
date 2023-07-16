package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8XC  reason: invalid class name */
public final class AnonymousClass8XC extends C02220Ah implements AnonymousClass0YP {
    public static final AnonymousClass8XC A00 = new AnonymousClass8XC();

    public AnonymousClass8XC() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass7Y3 r2 = (AnonymousClass7Y3) obj;
        Modifier modifier = (Modifier) obj2;
        AnonymousClass0wJ.A1N(r2, modifier);
        C872050o r0 = r2.A0E;
        if (r0 != null) {
            ((AnonymousClass55P) r0).setModifier(modifier);
            return Unit.A00;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
