package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.7Q8  reason: invalid class name */
public final class AnonymousClass7Q8 implements InputFilter {
    public static final AnonymousClass7Q8 A00 = new AnonymousClass7Q8();

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C134697yC A0h = C18250wR.A0h("[\\s]");
        C04220Ms.A07(charSequence);
        return A0h.A01(charSequence, "");
    }
}
