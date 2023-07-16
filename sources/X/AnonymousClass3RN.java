package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.3RN  reason: invalid class name */
public final class AnonymousClass3RN {
    public static byte[] A00 = {72, 73, 90, 69, 79, 73, 115, 69, 72, 11, 29, 11, 11, 17, 23, 22, 87, 20, 23, 31, 17, 22, 39, 25, 27, 12, 17, 14, 17, 12, 1, 87};

    public static C32165H8c A00(Context context, C10300i6 r7) {
        H1T A0O = C18180wK.A0O(r7);
        byte[] bArr = A00;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, 32);
        for (int i = 0; i < copyOfRange.length; i = C18250wR.A02(copyOfRange, (copyOfRange[i] ^ 9) ^ 113, i)) {
        }
        A0O.A0J(C18250wR.A0b(copyOfRange));
        A0O.A0B(AnonymousClass1TH.class, C60543Pn.class);
        String A0i = C18230wP.A0i(context);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 0, 9);
        for (int i2 = 0; i2 < copyOfRange2.length; i2 = C18250wR.A02(copyOfRange2, (copyOfRange2[i2] ^ 93) ^ 113, i2)) {
        }
        return C18200wM.A0T(A0O, C18250wR.A0b(copyOfRange2), A0i);
    }
}
