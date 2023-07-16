package com.instagram.debug.devoptions.proidentity;

import X.AnonymousClass00U;
import X.C04220Ms;
import X.C571039t;
import X.C63813iO;
import X.C82234pI;

public final class BusinessLinkingInfoFragment$fetchNewAdAccountInfo$1 implements C82234pI {
    public final /* synthetic */ BusinessLinkingInfoFragment this$0;

    public void onError(Throwable th) {
    }

    public void onSuccess(C571039t r5) {
        C04220Ms.A0B(r5, 0);
        C63813iO.A02(this.this$0.getContext(), AnonymousClass00U.A0L("Fetched Ad Account from API: ", this.this$0.toReadableInfo(r5)), (String) null, 0);
    }

    public BusinessLinkingInfoFragment$fetchNewAdAccountInfo$1(BusinessLinkingInfoFragment businessLinkingInfoFragment) {
        this.this$0 = businessLinkingInfoFragment;
    }
}
