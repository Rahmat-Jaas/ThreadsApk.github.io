package com.instagram.debug.devoptions.igds;

import X.C63813iO;
import android.content.Context;
import android.widget.CompoundButton;

public final class IgdsTextCellExamplesFragment$setOnCheckedChangeListener$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ IgdsTextCellExamplesFragment this$0;

    public IgdsTextCellExamplesFragment$setOnCheckedChangeListener$1(IgdsTextCellExamplesFragment igdsTextCellExamplesFragment) {
        this.this$0 = igdsTextCellExamplesFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        Context context = this.this$0.getContext();
        if (z) {
            str = IgdsTextCellExamplesFragment.TOGGLE_ON;
        } else {
            str = IgdsTextCellExamplesFragment.TOGGLE_OFF;
        }
        C63813iO.A0B(context, str);
    }
}
