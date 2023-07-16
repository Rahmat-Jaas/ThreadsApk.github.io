package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8bQ  reason: invalid class name */
public class AnonymousClass8bQ extends AnonymousClass4n2 {
    public static final String A0k(CharSequence charSequence, int i) {
        int i2 = 0;
        if (i < 0) {
            throw C18190wL.A0a(AnonymousClass00U.A0E("Count 'n' must be non-negative, but was ", '.', i));
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder A0s = C86114wI.A0s(charSequence.length() * i);
                C1367083z A01 = AnonymousClass8bH.A01(1, i);
                while (A01.hasNext()) {
                    A01.A00();
                    A0s.append(charSequence);
                }
                return C18190wL.A0n(A0s);
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            do {
                cArr[i2] = charAt;
                i2++;
            } while (i2 < i);
            return new String(cArr);
        }
    }

    public static final String A0l(String str, String str2, String str3, boolean z) {
        int A1Z = AnonymousClass0wJ.A1Z(str, str2);
        C04220Ms.A0B(str3, 2);
        int i = 0;
        int A0J = AnonymousClass8bP.A0J(str, str2, 0, z);
        if (A0J < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length;
        if (length < A1Z) {
            i2 = 1;
        }
        int length2 = str.length();
        int A06 = C86154wM.A06(str3, length2 - length);
        if (A06 >= 0) {
            StringBuilder A0s = C86114wI.A0s(A06);
            do {
                A0s.append(str, i, A0J);
                A0s.append(str3);
                i = A0J + length;
                if (A0J >= length2 || (A0J = AnonymousClass8bP.A0J(str, str2, A0J + i2, z)) <= 0) {
                    A0s.append(str, i, length2);
                }
                A0s.append(str, i, A0J);
                A0s.append(str3);
                i = A0J + length;
                break;
            } while ((A0J = AnonymousClass8bP.A0J(str, str2, A0J + i2, z)) <= 0);
            A0s.append(str, i, length2);
            return C18190wL.A0n(A0s);
        }
        throw new OutOfMemoryError();
    }

    public static final boolean A0n(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 0);
        if (charSequence.length() == 0) {
            return true;
        }
        AnonymousClass8bH A02 = AnonymousClass8bH.A02(0, charSequence.length() - 1);
        if ((A02 instanceof Collection) && ((Collection) A02).isEmpty()) {
            return true;
        }
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            if (!AnonymousClass725.A01(charSequence.charAt(((C1367083z) it).A00()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0p(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        boolean A1Y = AnonymousClass0wJ.A1Y(str3, str2);
        boolean z2 = z;
        if (!z) {
            return str3.startsWith(str2);
        }
        return str3.regionMatches(z2, A1Y ? 1 : 0, str4, A1Y ? 1 : 0, str2.length());
    }

    public static boolean A0m(CharSequence charSequence) {
        return !A0n(charSequence);
    }
}
