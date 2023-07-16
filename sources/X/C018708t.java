package X;

import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.08t  reason: invalid class name and case insensitive filesystem */
public final class C018708t extends C02220Ah implements AnonymousClass0YY {
    public static final C018708t A00 = new C018708t();

    public C018708t() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        C04220Ms.A0B(view, 0);
        Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
        if (tag instanceof AnonymousClass066) {
            return tag;
        }
        return null;
    }
}
