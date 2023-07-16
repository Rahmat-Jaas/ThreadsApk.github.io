package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.08u  reason: invalid class name and case insensitive filesystem */
public final class C018808u extends C02220Ah implements AnonymousClass0YY {
    public static final C018808u A00 = new C018808u();

    public C018808u() {
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
