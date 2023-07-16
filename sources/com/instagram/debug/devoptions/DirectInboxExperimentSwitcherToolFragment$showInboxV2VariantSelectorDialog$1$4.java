package com.instagram.debug.devoptions;

import X.AnonymousClass0MZ;
import android.content.DialogInterface;

public final class DirectInboxExperimentSwitcherToolFragment$showInboxV2VariantSelectorDialog$1$4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass0MZ $selected;
    public final /* synthetic */ DirectInboxExperimentSwitcherToolFragment this$0;

    public DirectInboxExperimentSwitcherToolFragment$showInboxV2VariantSelectorDialog$1$4(DirectInboxExperimentSwitcherToolFragment directInboxExperimentSwitcherToolFragment, AnonymousClass0MZ r2) {
        this.this$0 = directInboxExperimentSwitcherToolFragment;
        this.$selected = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.this$0.setVariant(this.$selected.A00, false);
    }
}
