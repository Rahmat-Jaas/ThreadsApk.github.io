package com.instagram.debug.devoptions.igds;

import X.AnonymousClass3TC;
import X.AnonymousClass4DS;
import X.C14030oh;
import X.C18200wM;
import X.C25553Dnn;
import X.D0f;
import android.view.View;
import android.widget.TextView;

public final class IgdsTooltipExamplesFragment$getClickListener$1 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass3TC $color;
    public final /* synthetic */ D0f $position;
    public final /* synthetic */ TextView $textView;
    public final /* synthetic */ IgdsTooltipExamplesFragment this$0;

    public IgdsTooltipExamplesFragment$getClickListener$1(IgdsTooltipExamplesFragment igdsTooltipExamplesFragment, TextView textView, D0f d0f, AnonymousClass3TC r4) {
        this.this$0 = igdsTooltipExamplesFragment;
        this.$textView = textView;
        this.$position = d0f;
        this.$color = r4;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1409690246);
        C25553Dnn A01 = AnonymousClass4DS.A01(this.this$0.requireActivity(), IgdsTooltipExamplesFragment.LABEL);
        A01.A01(this.$textView);
        A01.A03(this.$position);
        A01.A04(this.$color);
        C18200wM.A1Q(A01);
        C14030oh.A0C(1679451675, A05);
    }
}
