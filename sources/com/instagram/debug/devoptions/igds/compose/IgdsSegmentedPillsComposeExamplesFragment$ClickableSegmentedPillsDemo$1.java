package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C04220Ms;
import X.C144678it;
import android.content.Context;
import kotlin.Unit;

public final class IgdsSegmentedPillsComposeExamplesFragment$ClickableSegmentedPillsDemo$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ IgdsSegmentedPillsComposeExamplesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsSegmentedPillsComposeExamplesFragment$ClickableSegmentedPillsDemo$1(IgdsSegmentedPillsComposeExamplesFragment igdsSegmentedPillsComposeExamplesFragment, Context context) {
        super(1);
        this.this$0 = igdsSegmentedPillsComposeExamplesFragment;
        this.$context = context;
    }

    public final void invoke(C144678it r3) {
        C04220Ms.A0B(r3, 0);
        this.this$0.showToast(this.$context, r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C144678it) obj);
        return Unit.A00;
    }
}
