package com.instagram.debug.devoptions.proidentity;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass70T;
import X.AnonymousClass79L;
import X.AnonymousClass7JR;
import X.C02220Ah;
import X.C120537Bh;
import X.C142918fo;
import X.C147188nY;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public final class BusinessLinkingInfoFragment$onCreateView$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ BusinessLinkingInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessLinkingInfoFragment$onCreateView$1(BusinessLinkingInfoFragment businessLinkingInfoFragment) {
        super(2);
        this.this$0 = businessLinkingInfoFragment;
    }

    public final void invoke(C147188nY r15, int i) {
        C147188nY r4 = r15;
        if ((i & 11) != 2 || !r15.BCM()) {
            long j = C120537Bh.A00(r15).A0y;
            final BusinessLinkingInfoFragment businessLinkingInfoFragment = this.this$0;
            AnonymousClass70T.A01((AnonymousClass79L) null, r4, (Modifier) null, (C142918fo) null, AnonymousClass7JR.A00(r15, new AnonymousClass0YP() {
                public final void invoke(C147188nY r3, int i) {
                    if ((i & 11) != 2 || !r3.BCM()) {
                        BusinessLinkingInfoFragment.this.BuildDebugOptionList(r3, 8);
                    } else {
                        r3.CuJ();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
                    return Unit.A00;
                }
            }, 1907510559), 196608, 27, j, 0);
            return;
        }
        r15.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
