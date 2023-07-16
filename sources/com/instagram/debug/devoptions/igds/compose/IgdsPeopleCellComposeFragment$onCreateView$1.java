package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass7GN;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C06810aP;
import X.C147188nY;
import com.instagram.user.model.User;
import kotlin.Unit;

public final class IgdsPeopleCellComposeFragment$onCreateView$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ IgdsPeopleCellComposeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsPeopleCellComposeFragment$onCreateView$1(IgdsPeopleCellComposeFragment igdsPeopleCellComposeFragment) {
        super(2);
        this.this$0 = igdsPeopleCellComposeFragment;
    }

    public final void invoke(C147188nY r5, int i) {
        if ((i & 11) != 2 || !r5.BCM()) {
            IgdsPeopleCellComposeFragment igdsPeopleCellComposeFragment = this.this$0;
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r5;
            Object A13 = r2.A13();
            if (A13 == AnonymousClass7GN.A00) {
                A13 = C06810aP.A01.A01(AnonymousClass0wJ.A0X(igdsPeopleCellComposeFragment.userSession$delegate));
                r2.A14(A13);
            }
            IgdsPeopleCellComposeFragmentKt.IgdsPeopleCellExamples((User) A13, r5, 8);
            return;
        }
        r5.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
