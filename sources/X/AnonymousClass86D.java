package X;

/* renamed from: X.86D  reason: invalid class name */
public final class AnonymousClass86D implements AnonymousClass0ZU {
    public final C104636c6 A00;

    public final boolean equals(Object obj) {
        C104636c6 r2 = this.A00;
        if (!(obj instanceof AnonymousClass86D) || !C04220Ms.A0I(r2, ((AnonymousClass86D) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final Object invoke() {
        C104636c6 r0 = this.A00;
        M0S.A00();
        return C86144wL.A0j(r0.A00);
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("MemoizedCallback0(callbackHolder="));
    }

    public /* synthetic */ AnonymousClass86D(C104636c6 r1) {
        this.A00 = r1;
    }
}
