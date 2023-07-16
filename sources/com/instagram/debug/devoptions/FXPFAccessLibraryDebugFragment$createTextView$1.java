package com.instagram.debug.devoptions;

import X.C09830gl;
import X.C14030oh;
import android.view.View;

public final class FXPFAccessLibraryDebugFragment$createTextView$1 implements View.OnClickListener {
    public final /* synthetic */ String $text;
    public final /* synthetic */ FXPFAccessLibraryDebugFragment this$0;

    public FXPFAccessLibraryDebugFragment$createTextView$1(FXPFAccessLibraryDebugFragment fXPFAccessLibraryDebugFragment, String str) {
        this.this$0 = fXPFAccessLibraryDebugFragment;
        this.$text = str;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1239099443);
        C09830gl.A01(this.this$0.requireContext(), this.$text, (String) null);
        C14030oh.A0C(789726531, A05);
    }
}
