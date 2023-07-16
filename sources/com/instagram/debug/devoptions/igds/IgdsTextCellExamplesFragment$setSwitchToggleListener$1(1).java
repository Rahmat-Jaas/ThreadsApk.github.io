package com.instagram.debug.devoptions.igds;

import X.C33516HpC;
import X.C63813iO;
import android.content.Context;

public final class IgdsTextCellExamplesFragment$setSwitchToggleListener$1 implements C33516HpC {
    public final /* synthetic */ IgdsTextCellExamplesFragment this$0;

    public IgdsTextCellExamplesFragment$setSwitchToggleListener$1(IgdsTextCellExamplesFragment igdsTextCellExamplesFragment) {
        this.this$0 = igdsTextCellExamplesFragment;
    }

    public final boolean onToggle(boolean z) {
        String str;
        Context context = this.this$0.getContext();
        if (z) {
            str = IgdsTextCellExamplesFragment.TOGGLE_ON;
        } else {
            str = IgdsTextCellExamplesFragment.TOGGLE_OFF;
        }
        C63813iO.A0B(context, str);
        return true;
    }
}
