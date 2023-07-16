package X;

/* renamed from: X.7Fi  reason: invalid class name and case insensitive filesystem */
public final class C121287Fi {
    public static String A00(String str, int i, int i2) {
        Object[] A1b;
        String str2;
        if (i < 0) {
            A1b = C18210wN.A1Y(str, i);
            str2 = "%s (%s) must not be negative";
        } else if (i2 >= 0) {
            A1b = C86134wK.A1b(str, Integer.valueOf(i), i2);
            str2 = "%s (%s) must not be greater than size (%s)";
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0J("negative size: ", i2));
        }
        return AnonymousClass6J6.A00(str2, A1b);
    }

    public static void A01(int i, int i2) {
        Object[] objArr;
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                objArr = C18210wN.A1Y("index", i);
                str = "%s (%s) must not be negative";
            } else if (i2 < 0) {
                throw C18190wL.A0a(AnonymousClass00U.A0J("negative size: ", i2));
            } else {
                objArr = C86134wK.A1b("index", Integer.valueOf(i), i2);
                str = "%s (%s) must be less than size (%s)";
            }
            throw new IndexOutOfBoundsException(AnonymousClass6J6.A00(str, objArr));
        }
    }

    public static void A02(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(A00("index", i, i2));
        }
    }

    public static void A03(int i, int i2, int i3) {
        String str;
        if (i >= 0) {
            if (i2 >= i && i2 <= i3) {
                return;
            }
            if (i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    str = A00("end index", i2, i3);
                } else {
                    str = AnonymousClass6J6.A00("end index (%s) must not be less than start index (%s)", C18210wN.A1Y(Integer.valueOf(i2), i));
                }
                throw new IndexOutOfBoundsException(str);
            }
        }
        str = A00("start index", i, i3);
        throw new IndexOutOfBoundsException(str);
    }
}
