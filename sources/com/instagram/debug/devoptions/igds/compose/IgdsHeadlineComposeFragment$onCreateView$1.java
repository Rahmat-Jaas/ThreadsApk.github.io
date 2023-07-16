package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass70T;
import X.AnonymousClass79L;
import X.AnonymousClass7GN;
import X.AnonymousClass7JR;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C06810aP;
import X.C142918fo;
import X.C147188nY;
import androidx.compose.ui.Modifier;
import com.instagram.user.model.User;
import kotlin.Unit;

public final class IgdsHeadlineComposeFragment$onCreateView$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ IgdsHeadlineComposeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsHeadlineComposeFragment$onCreateView$1(IgdsHeadlineComposeFragment igdsHeadlineComposeFragment) {
        super(2);
        this.this$0 = igdsHeadlineComposeFragment;
    }

    public final void invoke(C147188nY r16, int i) {
        C147188nY r5 = r16;
        if ((i & 11) != 2 || !r5.BCM()) {
            IgdsHeadlineComposeFragment igdsHeadlineComposeFragment = this.this$0;
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r5;
            Object A13 = r2.A13();
            if (A13 == AnonymousClass7GN.A00) {
                A13 = C06810aP.A01.A01(AnonymousClass0wJ.A0X(igdsHeadlineComposeFragment.userSession$delegate));
                r2.A14(A13);
            }
            final User user = (User) A13;
            final IgdsHeadlineComposeFragment igdsHeadlineComposeFragment2 = this.this$0;
            AnonymousClass70T.A01((AnonymousClass79L) null, r5, (Modifier) null, (C142918fo) null, AnonymousClass7JR.A00(r5, new AnonymousClass0YP() {
                public final void invoke(C147188nY r4, int i) {
                    if ((i & 11) != 2 || !r4.BCM()) {
                        IgdsHeadlineComposeFragmentKt.IgdsHeadlineExamples(IgdsHeadlineComposeFragment.this.requireContext(), user, r4, 72);
                    } else {
                        r4.CuJ();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
                    return Unit.A00;
                }
            }, 350757763), 196608, 31, 0, 0);
            return;
        }
        r5.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
