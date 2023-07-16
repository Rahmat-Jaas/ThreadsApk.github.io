package X;

/* renamed from: X.6pO  reason: invalid class name and case insensitive filesystem */
public final class C112326pO {
    public final AnonymousClass0ZU A00;
    public final AnonymousClass0ZU A01;
    public final boolean A02;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ScrollAxisRange(value=");
        A0s.append(C18240wQ.A00(this.A01.invoke()));
        A0s.append(", maxValue=");
        A0s.append(C18240wQ.A00(this.A00.invoke()));
        A0s.append(", reverseScrolling=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C112326pO(AnonymousClass0ZU r1, AnonymousClass0ZU r2, boolean z) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = z;
    }
}
