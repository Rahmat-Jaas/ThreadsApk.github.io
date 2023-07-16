package X;

/* renamed from: X.7Y2  reason: invalid class name */
public final class AnonymousClass7Y2 implements C142978fu, C142988fv, AnonymousClass8ck {
    public final C147368pE A00;
    public final C147368pE A01;
    public final C147368pE A02;
    public final C147368pE A03;
    public final Object A04;
    public final AnonymousClass84E A05;

    public final C142978fu CWg() {
        C142978fu r1;
        C147368pE r2 = this.A03;
        if (AnonymousClass0wJ.A04(r2.getValue()) == 0) {
            this.A05.A00.add(this);
            C142988fv r0 = (C142988fv) this.A00.getValue();
            if (r0 != null) {
                r1 = r0.CWg();
            } else {
                r1 = null;
            }
            this.A02.CrC(r1);
        }
        C147368pE.A03(r2, AnonymousClass0wJ.A04(r2.getValue()) + 1);
        return this;
    }

    public final void release() {
        C147368pE r1 = this.A03;
        if (AnonymousClass0wJ.A04(r1.getValue()) > 0) {
            C147368pE.A03(r1, AnonymousClass0wJ.A04(r1.getValue()) - 1);
            if (AnonymousClass0wJ.A04(r1.getValue()) == 0) {
                this.A05.A00.remove(this);
                C147368pE r12 = this.A02;
                C142978fu r0 = (C142978fu) r12.getValue();
                if (r0 != null) {
                    r0.release();
                }
                r12.CrC((Object) null);
                return;
            }
            return;
        }
        throw C18180wK.A0a("Release should only be called once");
    }

    public AnonymousClass7Y2(AnonymousClass84E r5, Object obj) {
        this.A04 = obj;
        this.A05 = r5;
        Integer A0b = C86144wL.A0b();
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        this.A01 = C86104wH.A0I(r2, A0b, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = C86104wH.A0I(r2, C18220wO.A0d(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A02 = C86104wH.A0I(r2, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A00 = C86104wH.A0I(r2, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }
}
