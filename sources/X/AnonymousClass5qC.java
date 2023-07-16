package X;

/* renamed from: X.5qC  reason: invalid class name */
public final class AnonymousClass5qC extends C1366583u {
    public boolean A00;
    public final /* synthetic */ Object A01;

    public AnonymousClass5qC(Object obj) {
        this.A01 = obj;
    }

    public final boolean hasNext() {
        return C18180wK.A1W(this.A00 ? 1 : 0);
    }

    public final Object next() {
        if (!this.A00) {
            this.A00 = true;
            return this.A01;
        }
        throw C86154wM.A0u();
    }
}
