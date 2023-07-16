package X;

/* renamed from: X.1UJ  reason: invalid class name */
public abstract class AnonymousClass1UJ extends AnonymousClass1j3 implements C28104Eyb {
    public long A00 = -1;
    public long A01 = -1;

    public final C112506pi A00() {
        C112506pi r0;
        if (this instanceof AnonymousClass1eG) {
            r0 = ((AnonymousClass1eG) this).A00;
        } else {
            r0 = ((AnonymousClass1eF) this).A00;
        }
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("bloksDataAdapter");
        throw null;
    }

    public final long AUu() {
        return this.A00;
    }

    public final long AUw() {
        return this.A01;
    }

    public final boolean BS2() {
        return C18180wK.A1V((this.A01 > -1 ? 1 : (this.A01 == -1 ? 0 : -1)));
    }

    public final void CiS(long j) {
        this.A00 = j;
    }

    public final void CiU(long j) {
        this.A01 = j;
    }
}
