package androidx.compose.animation.core;

import X.AnonymousClass7WR;
import X.C115556vT;
import X.C147368pE;
import X.C18180wK;
import X.C86104wH;

public final class MutableTransitionState {
    public final C147368pE A00;
    public final C147368pE A01;
    public final C147368pE A02;

    public static Object A00(C115556vT r0) {
        return r0.A01.A00.getValue();
    }

    public MutableTransitionState(Object obj) {
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        this.A00 = C86104wH.A0I(r2, obj, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A02 = C86104wH.A0I(r2, obj, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A01 = C86104wH.A0I(r2, C18180wK.A0X(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }
}
