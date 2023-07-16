package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.4zV  reason: invalid class name and case insensitive filesystem */
public final class C86894zV extends InputFilter.LengthFilter {
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Spanned spanned2 = spanned;
        C18180wK.A1P(charSequence, 0, spanned);
        StringBuilder A0r = C18200wM.A0r();
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            if (charAt != '/') {
                A0r.append(charAt);
            }
        }
        return super.filter(A0r, i, i2, spanned2, i3, i4);
    }

    public C86894zV(int i) {
        super(i);
    }
}
