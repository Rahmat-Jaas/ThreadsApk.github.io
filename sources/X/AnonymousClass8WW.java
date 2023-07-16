package X;

import android.graphics.Path;
import kotlin.Unit;

/* renamed from: X.8WW  reason: invalid class name */
public final class AnonymousClass8WW extends C02220Ah implements AnonymousClass0YP {
    public static final AnonymousClass8WW A00 = new AnonymousClass8WW();

    public AnonymousClass8WW() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Path.FillType fillType;
        AnonymousClass546 r4 = (AnonymousClass546) obj;
        int i = ((C114156sm) obj2).A00;
        C04220Ms.A0B(r4, 0);
        Path path = ((AnonymousClass7X1) r4.A0H).A01;
        if (i == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
        r4.A02();
        return Unit.A00;
    }
}
