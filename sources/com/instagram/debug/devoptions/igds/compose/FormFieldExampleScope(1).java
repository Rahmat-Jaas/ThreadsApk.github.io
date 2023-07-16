package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass7WR;
import X.C04220Ms;
import X.C147368pE;
import X.C86104wH;
import X.C86164wN;

public final class FormFieldExampleScope {
    public final C147368pE value$delegate;

    public FormFieldExampleScope(String str) {
        C04220Ms.A0B(str, 1);
        this.value$delegate = C86104wH.A0I(AnonymousClass7WR.A00, str, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public final void setValue(String str) {
        C04220Ms.A0B(str, 0);
        this.value$delegate.CrC(str);
    }

    public final String getValue() {
        return C86164wN.A0e(this.value$delegate);
    }
}
