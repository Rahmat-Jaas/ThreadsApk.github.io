package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21;
import kotlin.jvm.internal.KtLambdaShape7S0110000_I2;

/* renamed from: X.8bP  reason: invalid class name */
public class AnonymousClass8bP extends AnonymousClass8bQ {
    public static /* synthetic */ int A0F(CharSequence charSequence, char c) {
        C04220Ms.A0B(charSequence, 0);
        int length = charSequence.length() - 1;
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, length);
        }
        char[] cArr = {c};
        int length2 = charSequence.length() - 1;
        if (length > length2) {
            length = length2;
        }
        while (-1 < length) {
            if (cArr[0] == charSequence.charAt(length)) {
                return length;
            }
            length--;
        }
        return -1;
    }

    public static /* synthetic */ int A0G(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        C04220Ms.A0B(charSequence, 0);
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        return A0K(charSequence, new char[]{c}, i, false);
    }

    public static /* synthetic */ int A0I(CharSequence charSequence, String str) {
        CharSequence charSequence2 = charSequence;
        C04220Ms.A0B(charSequence, 0);
        int length = charSequence.length() - 1;
        String str2 = str;
        C04220Ms.A0B(str, 1);
        if (!(charSequence2 instanceof String)) {
            return A0H(charSequence2, str2, length, 0, false, true);
        }
        return ((String) charSequence2).lastIndexOf(str, length);
    }

    public static final int A0J(CharSequence charSequence, String str, int i, boolean z) {
        String str2 = str;
        CharSequence charSequence2 = charSequence;
        boolean A1Y = AnonymousClass0wJ.A1Y(charSequence, str);
        int i2 = i;
        boolean z2 = z;
        if (z || !(charSequence2 instanceof String)) {
            return A0H(charSequence2, str2, i2, charSequence2.length(), z2, A1Y);
        }
        return ((String) charSequence2).indexOf(str2, i);
    }

    public static final int A0K(CharSequence charSequence, char[] cArr, int i, boolean z) {
        char upperCase;
        char upperCase2;
        C04220Ms.A0B(cArr, 1);
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            C1367083z A01 = AnonymousClass8bH.A01(i, charSequence.length() - 1);
            while (A01.hasNext()) {
                int A00 = A01.A00();
                char charAt = charSequence.charAt(A00);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        char c = cArr[i2];
                        if (c == charAt) {
                            return A00;
                        }
                        if (z && ((upperCase = Character.toUpperCase(c)) == (upperCase2 = Character.toUpperCase(charAt)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2))) {
                            return A00;
                        }
                        i2++;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(cArr[0], i);
    }

    public static final CharSequence A0L(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 0);
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A01 = AnonymousClass725.A01(charSequence.charAt(i2));
            if (z) {
                if (!A01) {
                    break;
                }
                length--;
            } else if (!A01) {
                z = true;
            } else {
                i++;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final CharSequence A0M(CharSequence charSequence) {
        C04220Ms.A0B(charSequence, 0);
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!AnonymousClass725.A01(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static final CharSequence A0O(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        C04220Ms.A0B(charSequence2, 3);
        if (i2 >= i) {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(charSequence, 0, i);
            A0r.append(charSequence2);
            A0r.append(charSequence, i2, charSequence.length());
            return A0r;
        }
        throw new IndexOutOfBoundsException(AnonymousClass00U.A0Z("End index (", ") is less than start index (", ").", i2, i));
    }

    public static final String A0Q(CharSequence charSequence, String str) {
        boolean A0i;
        String str2 = str;
        CharSequence charSequence2 = charSequence;
        boolean A1Z = AnonymousClass0wJ.A1Z(str, charSequence);
        if (charSequence instanceof String) {
            A0i = C18220wO.A1V((String) charSequence2, A1Z ? 1 : 0, str);
        } else {
            A0i = A0i(str2, charSequence2, 0, 0, charSequence.length(), false);
        }
        if (A0i) {
            return C86134wK.A0q(str2, charSequence2.length());
        }
        return str2;
    }

    public static final String A0R(CharSequence charSequence, String str) {
        String str2 = (String) charSequence;
        C04220Ms.A0B(str2, 1);
        if (str.endsWith(str2)) {
            return C18230wP.A0s(str, 0, str.length() - charSequence.length());
        }
        return str;
    }

    public static final String A0S(String str) {
        CharSequence charSequence;
        if (2 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder A0s = C86114wI.A0s(2);
            C1367083z A01 = AnonymousClass8bH.A01(1, 2 - str.length());
            while (A01.hasNext()) {
                A01.A00();
                A0s.append('0');
            }
            A0s.append(str);
            charSequence = A0s;
        }
        return charSequence.toString();
    }

    public static /* synthetic */ String A0U(String str, char c) {
        int A0G = A0G(str, c, 0, 6);
        if (A0G != -1) {
            return C18230wP.A0s(str, A0G + 1, str.length());
        }
        return str;
    }

    public static /* synthetic */ String A0V(String str, char c) {
        C04220Ms.A0B(str, 0);
        int A0G = A0G(str, c, 0, 6);
        if (A0G != -1) {
            return C18230wP.A0s(str, 0, A0G);
        }
        return str;
    }

    public static /* synthetic */ String A0Y(String str, String str2) {
        C04220Ms.A0B(str, 0);
        int A0J = A0J(str, str2, 0, false);
        if (A0J != -1) {
            return C18230wP.A0s(str, 0, A0J);
        }
        return str;
    }

    public static final String A0Z(String str, String str2, String str3) {
        C04220Ms.A0B(str, 0);
        AnonymousClass0wJ.A1O(str2, str3);
        int A0J = A0J(str, str2, 0, false);
        if (A0J != -1) {
            return C18230wP.A0s(str, C86154wM.A06(str2, A0J), str.length());
        }
        return str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r1 < 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A0a(java.lang.String r7, char... r8) {
        /*
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            r0 = 1
            int r6 = r7.length()
            int r6 = r6 - r0
            r5 = 0
            r4 = 0
        L_0x000c:
            if (r5 > r6) goto L_0x0033
            r0 = r6
            if (r4 != 0) goto L_0x0012
            r0 = r5
        L_0x0012:
            char r3 = r7.charAt(r0)
            int r2 = r8.length
            r1 = 0
        L_0x0018:
            if (r1 >= r2) goto L_0x0021
            char r0 = r8[r1]
            if (r3 != r0) goto L_0x0030
            r0 = 1
            if (r1 >= 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r4 != 0) goto L_0x002b
            if (r0 != 0) goto L_0x0028
            r4 = 1
            goto L_0x000c
        L_0x0028:
            int r5 = r5 + 1
            goto L_0x000c
        L_0x002b:
            if (r0 == 0) goto L_0x0033
            int r6 = r6 + -1
            goto L_0x000c
        L_0x0030:
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0033:
            int r0 = r6 + 1
            java.lang.CharSequence r0 = r7.subSequence(r5, r0)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8bP.A0a(java.lang.String, char[]):java.lang.String");
    }

    public static final List A0b(CharSequence charSequence) {
        List asList = Arrays.asList(new String[]{"\r\n", "\n", "\r"});
        C04220Ms.A06(asList);
        C1371486h r2 = new C1371486h(charSequence, new KtLambdaShape7S0110000_I2(2, asList, false), 0);
        KtLambdaShape166S0100000_I2_21 ktLambdaShape166S0100000_I2_21 = new KtLambdaShape166S0100000_I2_21(charSequence, 34);
        AnonymousClass0wJ.A1N(r2, ktLambdaShape166S0100000_I2_21);
        return C06750aI.A16(AnonymousClass8bJ.A02(new C1371286f(ktLambdaShape166S0100000_I2_21, r2)));
    }

    public static final List A0c(CharSequence charSequence, String str, int i) {
        int i2 = 0;
        int A0J = A0J(charSequence, str, 0, false);
        if (A0J == -1 || i == 1) {
            return C18180wK.A0n(charSequence.toString());
        }
        boolean z = false;
        int i3 = 10;
        if (i > 0) {
            z = true;
            i3 = i;
        }
        ArrayList A0k = C18240wQ.A0k(i3);
        do {
            C18210wN.A1O(charSequence.subSequence(i2, A0J), A0k);
            i2 = str.length() + A0J;
            if ((z && A0k.size() == i - 1) || (A0J = A0J(charSequence, str, i2, false)) == -1) {
                C18210wN.A1O(charSequence.subSequence(i2, charSequence.length()), A0k);
            }
            C18210wN.A1O(charSequence.subSequence(i2, A0J), A0k);
            i2 = str.length() + A0J;
            break;
        } while ((A0J = A0J(charSequence, str, i2, false)) == -1);
        C18210wN.A1O(charSequence.subSequence(i2, charSequence.length()), A0k);
        return A0k;
    }

    public static final List A0e(CharSequence charSequence, char[] cArr, int i) {
        C04220Ms.A0B(charSequence, 0);
        if (cArr.length == 1) {
            return A0c(charSequence, String.valueOf(cArr[0]), i);
        }
        C134907yZ<C134937yc> r0 = new C134907yZ(new C1371486h(charSequence, new KtLambdaShape7S0110000_I2(1, cArr, false), i));
        ArrayList A0w = AnonymousClass0wJ.A0w(r0);
        for (C134937yc r02 : r0) {
            C04220Ms.A0B(r02, 1);
            C18210wN.A1O(charSequence.subSequence(r02.A00, r02.A01 + 1), A0w);
        }
        return A0w;
    }

    public static /* synthetic */ List A0f(CharSequence charSequence, String[] strArr, int i, int i2) {
        int A00 = C18220wO.A00(i2, i);
        C04220Ms.A0B(charSequence, 0);
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return A0c(charSequence, str, A00);
            }
        }
        List asList = Arrays.asList(strArr);
        C04220Ms.A06(asList);
        C134907yZ<C134937yc> r0 = new C134907yZ(new C1371486h(charSequence, new KtLambdaShape7S0110000_I2(2, asList, false), A00));
        ArrayList A0w = AnonymousClass0wJ.A0w(r0);
        for (C134937yc r02 : r0) {
            C04220Ms.A0B(r02, 1);
            C18210wN.A1O(charSequence.subSequence(r02.A00, r02.A01 + 1), A0w);
        }
        return A0w;
    }

    public static final boolean A0i(CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            char charAt = charSequence.charAt(i + i4);
            char charAt2 = charSequence2.charAt(i2 + i4);
            if (charAt != charAt2) {
                if (!z) {
                    return false;
                }
                char upperCase = Character.toUpperCase(charAt);
                char upperCase2 = Character.toUpperCase(charAt2);
                if (!(upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean A0j(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int A0H;
        CharSequence charSequence3 = charSequence;
        CharSequence charSequence4 = charSequence2;
        boolean A1Y = AnonymousClass0wJ.A1Y(charSequence, charSequence2);
        boolean z2 = charSequence2 instanceof String;
        boolean z3 = z;
        if (z2) {
            A0H = A0J(charSequence, (String) charSequence4, A1Y, z);
        } else {
            A0H = A0H(charSequence3, charSequence4, A1Y ? 1 : 0, charSequence.length(), z3, A1Y);
        }
        if (A0H < 0) {
            return false;
        }
        return true;
    }

    public static final int A0H(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        int i3;
        C134937yc A09;
        int i4;
        boolean regionMatches;
        int i5;
        if (!z2) {
            i3 = 0;
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            A09 = AnonymousClass8bH.A02(i, i2);
        } else {
            int length2 = charSequence.length() - 1;
            if (i > length2) {
                i = length2;
            }
            i3 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            A09 = AnonymousClass8bI.A09(i, i2);
        }
        CharSequence charSequence3 = charSequence2;
        boolean z3 = z;
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i6 = A09.A00;
            int i7 = A09.A01;
            int i8 = A09.A02;
            if (i8 <= 0 ? !(i8 >= 0 || i7 > i6) : i6 <= i7) {
                do {
                    i4 = i6;
                    if (A0i(charSequence3, charSequence, i3, i4, charSequence3.length(), z)) {
                        return i6;
                    }
                    i6 += i8;
                } while (i4 != i7);
            }
        } else {
            int i9 = A09.A00;
            int i10 = A09.A01;
            int i11 = A09.A02;
            if (i11 <= 0 ? !(i11 >= 0 || i10 > i9) : i9 <= i10) {
                do {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length3 = charSequence2.length();
                    AnonymousClass0wJ.A1M(str, i3, str2);
                    if (!z) {
                        regionMatches = str.regionMatches(i3, str2, i9, length3);
                    } else {
                        regionMatches = str.regionMatches(z3, i3, str2, i9, length3);
                    }
                    if (regionMatches) {
                        return i9;
                    }
                    i5 = i9;
                    i9 += i11;
                } while (i5 != i10);
            }
        }
        return -1;
    }

    public static final String A0W(String str, String str2) {
        AnonymousClass0wJ.A1M(str, 0, str2);
        int A0F = A0F(str, '.');
        if (A0F != -1) {
            return C18230wP.A0s(str, A0F + 1, str.length());
        }
        return str2;
    }

    public static final CharSequence A0N(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!AnonymousClass725.A01(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static String A0P(CharSequence charSequence) {
        return A0L(charSequence).toString();
    }
}
