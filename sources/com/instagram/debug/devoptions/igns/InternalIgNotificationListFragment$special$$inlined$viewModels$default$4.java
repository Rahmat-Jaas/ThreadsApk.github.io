package com.instagram.debug.devoptions.igns;

import X.AnonymousClass06C;
import X.AnonymousClass0ZU;
import X.C012605w;
import X.C02220Ah;
import X.C04530Oa;
import X.C111686o9;
import X.C884658e;

public final class InternalIgNotificationListFragment$special$$inlined$viewModels$default$4 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ AnonymousClass0ZU $extrasProducer;
    public final /* synthetic */ C04530Oa $owner$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InternalIgNotificationListFragment$special$$inlined$viewModels$default$4(AnonymousClass0ZU r2, C04530Oa r3) {
        super(0);
        this.$extrasProducer = r2;
        this.$owner$delegate = r3;
    }

    public final C111686o9 invoke() {
        C012605w r1;
        C111686o9 r0;
        AnonymousClass0ZU r02 = this.$extrasProducer;
        if (r02 != null && (r0 = (C111686o9) r02.invoke()) != null) {
            return r0;
        }
        AnonymousClass06C r12 = (AnonymousClass06C) this.$owner$delegate.getValue();
        if (!(r12 instanceof C012605w) || (r1 = (C012605w) r12) == null) {
            return C884658e.A00;
        }
        return r1.getDefaultViewModelCreationExtras();
    }
}
