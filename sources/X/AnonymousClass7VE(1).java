package X;

import androidx.compose.foundation.layout.WindowInsets;

/* renamed from: X.7VE  reason: invalid class name */
public final class AnonymousClass7VE implements WindowInsets {
    public final C147368pE A00;
    public final String A01;

    public final int AU2(C147168nV r2) {
        return ((C115066uS) this.A00.getValue()).A00;
    }

    public final int Aro(C147168nV r2, AnonymousClass69J r3) {
        return ((C115066uS) this.A00.getValue()).A01;
    }

    public final int B8D(C147168nV r2, AnonymousClass69J r3) {
        return ((C115066uS) this.A00.getValue()).A02;
    }

    public final int BHQ(C147168nV r2) {
        return ((C115066uS) this.A00.getValue()).A03;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7VE)) {
            return false;
        }
        return C86124wJ.A1Y(((AnonymousClass7VE) obj).A00, this.A00.getValue());
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public AnonymousClass7VE(C115066uS r3, String str) {
        this.A01 = str;
        this.A00 = C86104wH.A0I(AnonymousClass7WR.A00, r3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A01);
        A0r.append("(left=");
        C147368pE r1 = this.A00;
        A0r.append(((C115066uS) r1.getValue()).A01);
        A0r.append(", top=");
        A0r.append(((C115066uS) r1.getValue()).A03);
        A0r.append(", right=");
        A0r.append(((C115066uS) r1.getValue()).A02);
        A0r.append(", bottom=");
        A0r.append(((C115066uS) r1.getValue()).A00);
        return AnonymousClass0wJ.A0u(A0r);
    }
}
