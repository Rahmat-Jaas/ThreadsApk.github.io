package X;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: X.54q  reason: invalid class name and case insensitive filesystem */
public final class C878154q extends AnonymousClass7YO {
    public static C878154q A01;
    public BreakIterator A00;

    public C878154q(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        C04220Ms.A06(characterInstance);
        this.A00 = characterInstance;
    }

    public final int[] ANN(int i) {
        int A012 = AnonymousClass7YO.A01(this);
        if (A012 > 0 && i < A012) {
            if (i < 0) {
                i = 0;
            }
            while (true) {
                BreakIterator breakIterator = this.A00;
                if (!breakIterator.isBoundary(i)) {
                    i = breakIterator.following(i);
                    if (i == -1) {
                        break;
                    }
                } else {
                    int following = breakIterator.following(i);
                    if (following != -1) {
                        return A03(i, following);
                    }
                }
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
                BreakIterator breakIterator = this.A00;
                if (!breakIterator.isBoundary(i)) {
                    i = breakIterator.preceding(i);
                    if (i == -1) {
                        break;
                    }
                } else {
                    int preceding = breakIterator.preceding(i);
                    if (preceding != -1) {
                        return A03(preceding, i);
                    }
                }
            }
        }
        return null;
    }
}
