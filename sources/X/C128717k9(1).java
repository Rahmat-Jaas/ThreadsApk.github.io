package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.7k9  reason: invalid class name and case insensitive filesystem */
public final class C128717k9 implements C143628h3 {
    public final /* synthetic */ View A00;

    public C128717k9(View view) {
        this.A00 = view;
    }

    public final void C46(int i, boolean z) {
        View view = this.A00;
        ViewGroup.MarginLayoutParams A0H = C18230wP.A0H(view);
        int i2 = A0H.leftMargin;
        int i3 = A0H.topMargin;
        int i4 = A0H.rightMargin;
        int i5 = 0;
        if (0 < i) {
            i5 = i;
        }
        A0H.setMargins(i2, i3, i4, i5);
        view.requestLayout();
    }
}
