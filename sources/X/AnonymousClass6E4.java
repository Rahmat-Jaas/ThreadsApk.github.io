package X;

/* renamed from: X.6E4  reason: invalid class name */
public final class AnonymousClass6E4 {
    public static final void A00(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw C18190wL.A0a(AnonymousClass00U.A0Z("both minLines ", " and maxLines ", " must be greater than zero", i, i2));
        } else if (i > i2) {
            throw C18190wL.A0a(AnonymousClass00U.A01(i, i2, "minLines ", " must be less than or equal to maxLines "));
        }
    }
}
