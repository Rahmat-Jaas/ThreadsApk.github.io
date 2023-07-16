package X;

/* renamed from: X.0BM  reason: invalid class name */
public final class AnonymousClass0BM {
    public static void A01(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException(AnonymousClass00U.A0b("length=", "; regionStart=", "; regionLength=", i, i2, i3));
        }
    }

    public static StringIndexOutOfBoundsException A00(String str, int i, int i2) {
        return new StringIndexOutOfBoundsException(AnonymousClass00U.A0b("length=", "; regionStart=", "; regionLength=", str.length(), i, i2));
    }
}
