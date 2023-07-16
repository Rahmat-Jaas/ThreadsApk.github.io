package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.8Me  reason: invalid class name and case insensitive filesystem */
public final class C138978Me extends C02220Ah implements AnonymousClass0YY {
    public static final C138978Me A00 = new C138978Me();

    public C138978Me() {
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
