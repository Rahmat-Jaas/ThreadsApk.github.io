package com.google.common.base;

import X.AnonymousClass00U;
import X.C18220wO;
import X.C86114wI;
import X.C86144wL;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Strings {
    public static boolean validSurrogatePairAt(CharSequence charSequence, int i) {
        return i >= 0 && i <= charSequence.length() + -2 && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    public static String A00(String str, Object... objArr) {
        int length;
        String valueOf = String.valueOf(str);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            String str2 = objArr[i2];
            try {
                str2 = String.valueOf(str2);
            } catch (Exception e) {
                String A0N = AnonymousClass00U.A0N(C18220wO.A0q(str2), C86144wL.A0u(str2), '@');
                Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, AnonymousClass00U.A0L("Exception during lenientFormat for ", A0N), e);
                str2 = AnonymousClass00U.A0h("<", A0N, " threw ", C18220wO.A0q(e), ">");
            }
            objArr[i2] = str2;
            i2++;
        }
        int length2 = valueOf.length();
        StringBuilder A0s = C86114wI.A0s((length << 4) + length2);
        int i3 = 0;
        while (i < length) {
            int indexOf = valueOf.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            A0s.append(valueOf, i3, indexOf);
            A0s.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        A0s.append(valueOf, i3, length2);
        if (i < length) {
            A0s.append(" [");
            A0s.append(objArr[i]);
            for (int i4 = i + 1; i4 < length; i4++) {
                C86144wL.A1T(A0s);
                A0s.append(objArr[i4]);
            }
            A0s.append(']');
        }
        return A0s.toString();
    }
}
