package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C04220Ms;
import X.C144678it;
import X.C147368pE;
import java.util.Set;
import kotlin.Unit;

public final class IgdsSegmentedPillsComposeExamplesFragment$MultiselectSegmentedPillsDemo$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C147368pE $selectedPills$delegate;
    public final /* synthetic */ IgdsSegmentedPillsComposeExamplesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsSegmentedPillsComposeExamplesFragment$MultiselectSegmentedPillsDemo$1(IgdsSegmentedPillsComposeExamplesFragment igdsSegmentedPillsComposeExamplesFragment, C147368pE r3) {
        super(1);
        this.this$0 = igdsSegmentedPillsComposeExamplesFragment;
        this.$selectedPills$delegate = r3;
    }

    public final void invoke(C144678it r4) {
        C04220Ms.A0B(r4, 0);
        C147368pE r2 = this.$selectedPills$delegate;
        r2.CrC(this.this$0.toggle((Set) r2.getValue(), r4));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C144678it) obj);
        return Unit.A00;
    }
}
