package X;

/* renamed from: X.6lO  reason: invalid class name and case insensitive filesystem */
public final class C110266lO {
    public final int A00;
    public final int A01;
    public final AnonymousClass67E A02;
    public final Object A03;
    public final boolean A04;

    public C110266lO(AnonymousClass67E r2, Object obj, int i, int i2, boolean z) {
        C04220Ms.A0B(r2, 1);
        this.A02 = r2;
        this.A03 = obj;
        this.A00 = i;
        this.A04 = z;
        this.A01 = i2;
        if (r2 != AnonymousClass67E.REFRESH && obj == null) {
            throw C18190wL.A0a("Key must be non-null for prepend/append");
        }
    }
}
