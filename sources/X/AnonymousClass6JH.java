package X;

/* renamed from: X.6JH  reason: invalid class name */
public final class AnonymousClass6JH {
    public static void A00(int i, int i2, String str, boolean z) {
        if (!z) {
            StringBuilder A0s = C18190wL.A0s("overflow: ");
            A0s.append(str);
            A0s.append("(");
            A0s.append(i);
            C86144wL.A1T(A0s);
            A0s.append(i2);
            throw new ArithmeticException(C18180wK.A0i(")", A0s));
        }
    }
}
