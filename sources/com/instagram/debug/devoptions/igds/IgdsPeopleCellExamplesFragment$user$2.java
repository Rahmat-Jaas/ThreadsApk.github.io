package com.instagram.debug.devoptions.igds;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C06810aP;
import com.instagram.user.model.User;

public final class IgdsPeopleCellExamplesFragment$user$2 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ IgdsPeopleCellExamplesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCellExamplesFragment$user$2(IgdsPeopleCellExamplesFragment igdsPeopleCellExamplesFragment) {
        super(0);
        this.this$0 = igdsPeopleCellExamplesFragment;
    }

    public final User invoke() {
        return C06810aP.A01.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
    }
}
