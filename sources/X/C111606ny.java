package X;

import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;

/* renamed from: X.6ny  reason: invalid class name and case insensitive filesystem */
public final class C111606ny {
    public final SpannableStringBuilder A00(CharacterStyle characterStyle, CharacterStyle characterStyle2, String str, String str2, String str3) {
        SpannableStringBuilder A0E = C18200wM.A0E(str);
        String A0n = C18190wL.A0n(A0E);
        int A0I = AnonymousClass8bP.A0I(A0n, str2);
        int A0I2 = AnonymousClass8bP.A0I(A0n, str3);
        if (A0I != -1) {
            A0E.setSpan(characterStyle, A0I, AnonymousClass0hA.A01(str2) + A0I, 33);
        }
        if (A0I2 != -1) {
            A0E.setSpan(characterStyle2, A0I2, AnonymousClass0hA.A01(str3) + A0I2, 33);
        }
        return A0E;
    }
}
