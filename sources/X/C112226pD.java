package X;

/* renamed from: X.6pD  reason: invalid class name and case insensitive filesystem */
public final class C112226pD {
    public final C144548ig A00;
    public volatile Object A01;

    public final Object A00() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = this.A00.get();
                }
            }
        }
        return this.A01;
    }

    public C112226pD(C144548ig r1) {
        this.A00 = r1;
    }
}
