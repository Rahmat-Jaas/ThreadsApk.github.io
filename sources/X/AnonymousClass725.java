package X;

/* renamed from: X.725  reason: invalid class name */
public final class AnonymousClass725 {
    public static final void A00(int i) {
        if (!AnonymousClass8bH.A02(2, 36).A06(i)) {
            StringBuilder A0s = C18190wL.A0s("radix ");
            A0s.append(i);
            A0s.append(" was not in valid range ");
            throw C18190wL.A0a(C18200wM.A0m(AnonymousClass8bH.A02(2, 36), A0s));
        }
    }

    public static final boolean A01(char c) {
        if (Character.isWhitespace(c) || Character.isSpaceChar(c)) {
            return true;
        }
        return false;
    }
}
