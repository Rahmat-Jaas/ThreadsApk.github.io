package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2Ls  reason: invalid class name and case insensitive filesystem */
public final class C35002Ls {
    public static final void A00(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams A0H = C18230wP.A0H(view);
            if (A0H.bottomMargin != i) {
                A0H.bottomMargin = i;
                view.setLayoutParams(A0H);
                return;
            }
            return;
        }
        throw C18180wK.A0a("Check failed.");
    }
}
