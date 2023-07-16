package X;

/* renamed from: X.0NO  reason: invalid class name */
public final class AnonymousClass0NO {
    public static char A00(char c, char c2, char c3) {
        if (c2 == '0' || c2 == 'i') {
            if (c3 == '0' || c3 == 'i') {
                return c;
            }
            return c3;
        } else if (!(c2 == '9' && c == 'j')) {
            if ((c == 'R' || c == 'U' || c == 'r' || c == 'c' || c == 'u' || c == 'q' || c == 'm' || c == 'j') && c2 == 'Q') {
                return c;
            }
            return c2;
        }
        return c;
    }

    public static boolean A01(char c) {
        if ('r' == c || 'c' == c || 's' == c || 'p' == c || 'f' == c) {
            return true;
        }
        return false;
    }

    public static boolean A02(char c, char c2, char c3) {
        Integer num = AnonymousClass006.A0N;
        if ((!A04(num, c) || A04(AnonymousClass006.A0C, c2)) && !A04(num, c3)) {
            return false;
        }
        return true;
    }

    public static boolean A03(char c, char c2, char c3) {
        if (!A04(AnonymousClass006.A01, c)) {
            Integer num = AnonymousClass006.A0N;
            if (A04(num, c) || A04(AnonymousClass006.A0C, c2) || A04(num, c3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A04(Integer num, char c) {
        AnonymousClass0NQ[] values = AnonymousClass0NQ.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            AnonymousClass0NQ r1 = values[i];
            if (r1.A01 != c) {
                i++;
            } else if (r1.A00 == num) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
