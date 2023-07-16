package X;

import android.content.res.TypedArray;
import android.widget.Button;

/* renamed from: X.6If  reason: invalid class name and case insensitive filesystem */
public final class C99126If {
    public static final void A00(Button button, int i) {
        TypedArray obtainStyledAttributes = button.getContext().obtainStyledAttributes(AnonymousClass7Kz.A0G().A02(i), C29934Fwk.A0h);
        C04220Ms.A06(obtainStyledAttributes);
        button.setGravity(obtainStyledAttributes.getInt(0, 0));
        obtainStyledAttributes.recycle();
    }
}
