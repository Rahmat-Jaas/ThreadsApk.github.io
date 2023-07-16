package X;

import java.util.NoSuchElementException;

/* renamed from: X.8bN  reason: invalid class name */
public final class AnonymousClass8bN extends AnonymousClass8bO {
    public static final String A0D(String str, int i) {
        C04220Ms.A0B(str, 0);
        if (i >= 0) {
            int length = str.length() - i;
            if (length < 0) {
                length = 0;
            }
            return A0E(str, length);
        }
        throw C18190wL.A0a(AnonymousClass00U.A0S(C18170wI.A00(276), AnonymousClass000.A00(83), i));
    }

    public static final String A0E(String str, int i) {
        C04220Ms.A0B(str, 0);
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return C18230wP.A0s(str, 0, i);
        }
        throw C18190wL.A0a(AnonymousClass00U.A0S(C18170wI.A00(276), AnonymousClass000.A00(83), i));
    }

    public static final char A0C(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        throw new NoSuchElementException(I17.A00(369));
    }
}
