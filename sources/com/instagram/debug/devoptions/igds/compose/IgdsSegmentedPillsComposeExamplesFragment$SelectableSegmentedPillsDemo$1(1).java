package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C04220Ms;
import X.C144678it;
import X.C147368pE;
import kotlin.Unit;

public final class IgdsSegmentedPillsComposeExamplesFragment$SelectableSegmentedPillsDemo$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C147368pE $selectedPill$delegate;
    public final /* synthetic */ IgdsSegmentedPillsComposeExamplesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsSegmentedPillsComposeExamplesFragment$SelectableSegmentedPillsDemo$1(IgdsSegmentedPillsComposeExamplesFragment igdsSegmentedPillsComposeExamplesFragment, C147368pE r3) {
        super(1);
        this.this$0 = igdsSegmentedPillsComposeExamplesFragment;
        this.$selectedPill$delegate = r3;
    }

    public final void invoke(C144678it r3) {
        C04220Ms.A0B(r3, 0);
        C147368pE r1 = this.$selectedPill$delegate;
        if (C04220Ms.A0I(r1.getValue(), r3)) {
            r3 = null;
        }
        r1.CrC(r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C144678it) obj);
        return Unit.A00;
    }
}
