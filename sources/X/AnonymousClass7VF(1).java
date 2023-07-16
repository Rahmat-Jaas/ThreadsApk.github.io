package X;

import androidx.compose.foundation.layout.WindowInsets;

/* renamed from: X.7VF  reason: invalid class name */
public final class AnonymousClass7VF implements WindowInsets {
    public final C147368pE A00;
    public final C147368pE A01;
    public final int A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AnonymousClass7VF) && this.A02 == ((AnonymousClass7VF) obj).A02;
        }
        return true;
    }

    public final void A00(AnonymousClass03Y r5) {
        int i = this.A02;
        AnonymousClass03V r2 = r5.A00;
        AnonymousClass01T A05 = r2.A05(i);
        C04220Ms.A0B(A05, 0);
        this.A00.CrC(A05);
        C147368pE.A04(this.A01, r2.A0I(i));
    }

    public final int AU2(C147168nV r2) {
        return ((AnonymousClass01T) this.A00.getValue()).A00;
    }

    public final int Aro(C147168nV r2, AnonymousClass69J r3) {
        return ((AnonymousClass01T) this.A00.getValue()).A01;
    }

    public final int B8D(C147168nV r2, AnonymousClass69J r3) {
        return ((AnonymousClass01T) this.A00.getValue()).A02;
    }

    public final int BHQ(C147168nV r2) {
        return ((AnonymousClass01T) this.A00.getValue()).A03;
    }

    public final int hashCode() {
        return this.A02;
    }

    public AnonymousClass7VF(int i, String str) {
        this.A02 = i;
        this.A03 = str;
        AnonymousClass01T r0 = AnonymousClass01T.A04;
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        this.A00 = C86104wH.A0I(r2, r0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A01 = C86104wH.A0I(r2, C18180wK.A0Y(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A03);
        A0r.append('(');
        C147368pE r2 = this.A00;
        A0r.append(((AnonymousClass01T) r2.getValue()).A01);
        A0r.append(", ");
        A0r.append(((AnonymousClass01T) r2.getValue()).A03);
        A0r.append(", ");
        A0r.append(((AnonymousClass01T) r2.getValue()).A02);
        A0r.append(", ");
        A0r.append(((AnonymousClass01T) r2.getValue()).A00);
        return AnonymousClass0wJ.A0u(A0r);
    }
}
