package X;

import com.google.common.base.Strings;

/* renamed from: X.7Ko  reason: invalid class name */
public final class AnonymousClass7Ko {
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
        return Strings.A00(str2, A1b);
    }

    public static void A01(int i, int i2) {
        Object[] objArr;
        String str;
        if (i < 0) {
            objArr = C18210wN.A1Y("index", i);
            str = "%s (%s) must not be negative";
        } else if (i >= i2) {
            if (i2 >= 0) {
                objArr = C86134wK.A1b("index", Integer.valueOf(i), i2);
                str = "%s (%s) must be less than size (%s)";
            } else {
                throw C18190wL.A0a(AnonymousClass00U.A0J("negative size: ", i2));
            }
        } else {
            return;
        }
        throw new IndexOutOfBoundsException(Strings.A00(str, objArr));
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
                    str = Strings.A00("end index (%s) must not be less than start index (%s)", C18210wN.A1Y(Integer.valueOf(i2), i));
                }
                throw new IndexOutOfBoundsException(str);
            }
        }
        str = A00("start index", i, i3);
        throw new IndexOutOfBoundsException(str);
    }

    public static void A04(int i, String str, boolean z) {
        if (!z) {
            throw C18190wL.A0a(Strings.A00(str, C18210wN.A1X(i)));
        }
    }

    public static void A05(long j, String str, boolean z) {
        if (!z) {
            throw C18190wL.A0a(Strings.A00(str, Long.valueOf(j)));
        }
    }

    public static void A06(C93815rj r2, byte[] bArr, int i, int i2) {
        A0E(!r2.A00, "Cannot re-use a Hasher after calling hash() on it");
        r2.A03.update(bArr, i, i2);
    }

    public static void A07(Object obj, Object obj2) {
        if (obj == null) {
            throw C18210wN.A0W(String.valueOf(obj2));
        }
    }

    public static void A08(Object obj, Object obj2, String str, boolean z) {
        if (!z) {
            throw C18190wL.A0a(Strings.A00(str, obj, obj2));
        }
    }

    public static void A09(Object obj, String str, boolean z) {
        if (!z) {
            throw C18190wL.A0a(Strings.A00(str, obj));
        }
    }

    public static void A0A(Object obj, String str, boolean z) {
        if (!z) {
            throw C18180wK.A0a(Strings.A00(str, obj));
        }
    }

    public static void A0B(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A0C(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void A0D(boolean z, Object obj) {
        if (!z) {
            throw C18190wL.A0a(String.valueOf(obj));
        }
    }

    public static void A0E(boolean z, Object obj) {
        if (!z) {
            throw C18180wK.A0a(String.valueOf(obj));
        }
    }

    public static void A0F(boolean z, String str, Object... objArr) {
        if (!z) {
            throw C18190wL.A0a(Strings.A00(str, objArr));
        }
    }

    public static void A0G(boolean z, String str, Object... objArr) {
        if (!z) {
            throw C18180wK.A0a(Strings.A00(str, objArr));
        }
    }
}
