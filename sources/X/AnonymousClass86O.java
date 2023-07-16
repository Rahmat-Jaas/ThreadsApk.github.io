package X;

/* renamed from: X.86O  reason: invalid class name */
public final class AnonymousClass86O implements AnonymousClass0YY {
    public final C104636c6 A00;

    public final boolean equals(Object obj) {
        C104636c6 r2 = this.A00;
        if (!(obj instanceof AnonymousClass86O) || !C04220Ms.A0I(r2, ((AnonymousClass86O) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final Object invoke(Object obj) {
        C104636c6 r0 = this.A00;
        M0S.A00();
        return ((AnonymousClass0YY) r0.A00).invoke(obj);
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("MemoizedCallback1(callbackHolder="));
    }

    public /* synthetic */ AnonymousClass86O(C104636c6 r1) {
        this.A00 = r1;
    }
}
