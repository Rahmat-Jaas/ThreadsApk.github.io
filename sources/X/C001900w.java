package X;

import android.view.ViewParent;

/* renamed from: X.00w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C001900w extends AnonymousClass019 implements AnonymousClass0YY {
    public static final C001900w A00 = new C001900w();

    public C001900w() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewParent viewParent = (ViewParent) obj;
        C04220Ms.A0B(viewParent, 0);
        return viewParent.getParent();
    }
}
