package X;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: X.7Gz  reason: invalid class name and case insensitive filesystem */
public final class C121607Gz {
    public final int A00;
    public final int A01;
    public final CharSequence A02;
    public final BreakIterator A03;

    public C121607Gz(CharSequence charSequence, Locale locale, int i) {
        this.A02 = charSequence;
        if (0 > charSequence.length()) {
            throw C18190wL.A0a("input start index is outside the CharSequence");
        } else if (i < 0 || i > charSequence.length()) {
            throw C18190wL.A0a("input end index is outside the CharSequence");
        } else {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            C04220Ms.A06(wordInstance);
            this.A03 = wordInstance;
            this.A01 = Math.max(0, -50);
            this.A00 = Math.min(charSequence.length(), i + 50);
            wordInstance.setText(new AnonymousClass83V(charSequence, i));
        }
    }

    public static final void A00(C121607Gz r4, int i) {
        int i2 = r4.A01;
        int i3 = r4.A00;
        if (i > i3 || i2 > i) {
            StringBuilder A0s = C18190wL.A0s("Invalid offset: ");
            A0s.append(i);
            A0s.append(". Valid range is [");
            A0s.append(i2);
            A0s.append(" , ");
            A0s.append(i3);
            throw C18190wL.A0a(C86114wI.A0q(A0s, ']'));
        }
    }

    public static final boolean A01(C121607Gz r4, int i) {
        int i2 = r4.A01 + 1;
        if (i > r4.A00 || i2 > i || !Character.isLetterOrDigit(Character.codePointBefore(r4.A02, i))) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C121607Gz r4, int i) {
        int i2 = r4.A01;
        if (i >= r4.A00 || i2 > i || !Character.isLetterOrDigit(Character.codePointAt(r4.A02, i))) {
            return false;
        }
        return true;
    }

    public final boolean A03(int i) {
        int i2 = this.A01 + 1;
        if (i > this.A00 || i2 > i) {
            return false;
        }
        return AnonymousClass6FS.A00(Character.codePointBefore(this.A02, i));
    }
}
