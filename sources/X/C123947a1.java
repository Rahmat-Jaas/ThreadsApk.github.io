package X;

/* renamed from: X.7a1  reason: invalid class name and case insensitive filesystem */
public class C123947a1 implements C143158gC {
    public boolean A00 = true;
    public final C143158gC A01;

    public C123947a1(C143158gC r2) {
        this.A01 = r2;
    }

    public final void onChanged(Object obj) {
        if (obj != null && !this.A00) {
            this.A00 = true;
            this.A01.onChanged(obj);
        }
    }
}
