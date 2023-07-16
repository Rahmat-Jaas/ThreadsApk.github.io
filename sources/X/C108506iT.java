package X;

/* renamed from: X.6iT  reason: invalid class name and case insensitive filesystem */
public final class C108506iT {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C108506iT(int i, int i2, Object obj) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        if (i < 0) {
            throw C18190wL.A0a(AnonymousClass00U.A0J("startIndex should be >= 0, but was ", i));
        }
    }
}
