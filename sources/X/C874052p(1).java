package X;

/* renamed from: X.52p  reason: invalid class name and case insensitive filesystem */
public final class C874052p extends AnonymousClass55F {
    public final C104166bL A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C874052p(C104166bL r2, AnonymousClass0YY r3) {
        super(r3);
        C04220Ms.A0B(r3, 2);
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        C874052p r3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C874052p) || (r3 = (C874052p) obj) == null) {
            return false;
        }
        return C04220Ms.A0I(this.A00, r3.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("WithAlignmentLine(line="));
    }
}
