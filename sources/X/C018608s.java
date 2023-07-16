package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.08s  reason: invalid class name and case insensitive filesystem */
public final class C018608s extends C02220Ah implements AnonymousClass0YY {
    public static final C018608s A00 = new C018608s();

    public C018608s() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        C04220Ms.A0B(view, 0);
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return parent;
        }
        return null;
    }
}
