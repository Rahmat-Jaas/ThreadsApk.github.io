package X;

/* renamed from: X.5Kb  reason: invalid class name and case insensitive filesystem */
public final class C90005Kb extends AnonymousClass0Sf implements C144128hs {
    public final int A00;
    public final long A01;

    public final C90005Kb CyD() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90005Kb) {
                C90005Kb r8 = (C90005Kb) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C18190wL.A02(this.A01) * 31) + this.A00;
    }

    public C90005Kb(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }
}
