package X;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: X.54r  reason: invalid class name and case insensitive filesystem */
public final class C878254r extends AnonymousClass7YO {
    public static C878254r A01;
    public BreakIterator A00;

    private final boolean A00(int i) {
        if (i < 0 || i >= AnonymousClass7YO.A01(this)) {
            return false;
        }
        return Character.isLetterOrDigit(A02().codePointAt(i));
    }

    public C878254r(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        C04220Ms.A06(wordInstance);
        this.A00 = wordInstance;
    }

    public final int[] ANN(int i) {
        if (AnonymousClass7YO.A01(this) > 0 && i < AnonymousClass7YO.A01(this)) {
            if (i < 0) {
                i = 0;
            }
            while (true) {
                if (!A00(i) && (!A00(i) || (i != 0 && A00(i - 1)))) {
                    i = this.A00.following(i);
                    if (i == -1) {
                        break;
                    }
                } else {
                    int following = this.A00.following(i);
                }
            }
            int following2 = this.A00.following(i);
            if (following2 != -1 && following2 > 0 && A00(following2 - 1) && (following2 == AnonymousClass7YO.A01(this) || !A00(following2))) {
                return A03(i, following2);
            }
        }
        return null;
    }

    public final int[] CX4(int i) {
        int A012 = AnonymousClass7YO.A01(this);
        if (A012 > 0 && i > 0) {
            if (i > A012) {
                i = A012;
            }
            while (true) {
                if (i <= 0) {
                    break;
                }
                int i2 = i - 1;
                if (A00(i2) || (A00(i2) && (i == AnonymousClass7YO.A01(this) || !A00(i)))) {
                    break;
                }
                i = this.A00.preceding(i);
                if (i == -1) {
                    break;
                }
            }
            int preceding = this.A00.preceding(i);
            if (preceding != -1 && A00(preceding) && (preceding == 0 || !A00(preceding - 1))) {
                return A03(preceding, i);
            }
        }
        return null;
    }
}
