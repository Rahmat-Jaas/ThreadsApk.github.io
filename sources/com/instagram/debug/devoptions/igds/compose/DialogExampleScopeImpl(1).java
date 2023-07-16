package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass7WR;
import X.C147368pE;
import X.C18180wK;
import X.C86104wH;

public final class DialogExampleScopeImpl implements DialogExampleScope {
    public final C147368pE isDialogShowing$delegate = C86104wH.A0I(AnonymousClass7WR.A00, C18180wK.A0X(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");

    public void dismissDialogExample() {
        setDialogShowing(false);
    }

    public final boolean isDialogShowing() {
        return C86104wH.A1X(this.isDialogShowing$delegate);
    }

    public final void setDialogShowing(boolean z) {
        C147368pE.A04(this.isDialogShowing$delegate, z);
    }
}
