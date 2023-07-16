package com.instagram.debug.devoptions;

import X.AnonymousClass0ZU;
import X.C02220Ah;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.service.session.UserSession;

public final class PanavisionDevUtil$Companion$getInstance$1 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ QuickExperimentDebugStore $quickExperimentDebugStore;
    public final /* synthetic */ UserSession $userSession;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PanavisionDevUtil$Companion$getInstance$1(UserSession userSession, QuickExperimentDebugStore quickExperimentDebugStore) {
        super(0);
        this.$userSession = userSession;
        this.$quickExperimentDebugStore = quickExperimentDebugStore;
    }

    public final PanavisionDevUtil invoke() {
        return new PanavisionDevUtil(this.$userSession, this.$quickExperimentDebugStore);
    }
}
