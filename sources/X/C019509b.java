package X;

/* renamed from: X.09b  reason: invalid class name and case insensitive filesystem */
public abstract class C019509b {
    public abstract int A02(int i);

    public abstract Object A03(int i);

    public final int A01(int i, int i2) {
        try {
            return A02(i);
        } catch (AnonymousClass0KI e) {
            AnonymousClass0F8.A00.A09(e, "Could not get SomeArgs int arg at %d. Returning default %d.", Integer.valueOf(i), Integer.valueOf(i2));
            return i2;
        }
    }
}
