package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C101206Qh;
import X.C147188nY;
import kotlin.Unit;

public final class IgdsProfilePictureComposeFragment$onCreateView$1$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ IgdsProfilePictureComposeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsProfilePictureComposeFragment$onCreateView$1$1(IgdsProfilePictureComposeFragment igdsProfilePictureComposeFragment) {
        super(2);
        this.this$0 = igdsProfilePictureComposeFragment;
    }

    public final void invoke(C147188nY r5, int i) {
        if ((i & 11) != 2 || !r5.BCM()) {
            C101206Qh.A00(r5, AnonymousClass0wJ.A0X(this.this$0.userSession$delegate), "igds_profile_picture_compose_examples", ComposableSingletons$IgdsProfilePictureComposeFragmentKt.f2lambda1, 448);
        } else {
            r5.CuJ();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
