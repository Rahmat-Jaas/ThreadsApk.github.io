package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.8KZ  reason: invalid class name */
public final class AnonymousClass8KZ extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8KZ A00 = new AnonymousClass8KZ();

    public AnonymousClass8KZ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewParent parent = C86124wJ.A0L(obj).getParent();
        if (parent instanceof View) {
            return parent;
        }
        return null;
    }
}
