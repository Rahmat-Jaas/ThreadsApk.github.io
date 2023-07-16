package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.7ZU  reason: invalid class name */
public final class AnonymousClass7ZU implements C004402a {
    public static final AnonymousClass7ZU A00 = new AnonymousClass7ZU();

    public final AnonymousClass03Y Bky(View view, AnonymousClass03Y r5) {
        AnonymousClass0wJ.A1N(view, r5);
        AnonymousClass01T A05 = r5.A00.A05(7);
        C04220Ms.A06(A05);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = A05.A03;
            marginLayoutParams.bottomMargin = A05.A00;
            view.setLayoutParams(marginLayoutParams);
            return AnonymousClass03Y.A01;
        }
        throw C18210wN.A0W(C18170wI.A00(18));
    }
}
