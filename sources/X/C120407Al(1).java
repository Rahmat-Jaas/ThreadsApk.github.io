package X;

/* renamed from: X.7Al  reason: invalid class name and case insensitive filesystem */
public final class C120407Al {
    public static final void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw C86114wI.A0a("index: ", ", size: ", i, i2);
        }
    }

    public static final void A01(int i, int i2) {
        if (i < 0 || i > i2) {
            throw C86114wI.A0a("index: ", ", size: ", i, i2);
        }
    }

    public static final void A02(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(AnonymousClass00U.A0b("fromIndex: ", ", toIndex: ", ", size: ", i, i2, i3));
        } else if (i > i2) {
            throw C18190wL.A0a(AnonymousClass00U.A01(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }
}
