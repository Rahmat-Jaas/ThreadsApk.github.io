package com.instagram.debug.devoptions.proidentity;

import X.AnonymousClass00U;
import X.C04220Ms;
import X.C564637h;
import X.C63813iO;
import X.C82234pI;

public final class BusinessLinkingInfoFragment$fetchNewBizAccountInfo$1 implements C82234pI {
    public final /* synthetic */ BusinessLinkingInfoFragment this$0;

    public void onError(Throwable th) {
    }

    public void onSuccess(C564637h r5) {
        C04220Ms.A0B(r5, 0);
        C63813iO.A02(this.this$0.getContext(), AnonymousClass00U.A0L("Fetched Business Name from API: ", r5.A00), (String) null, 0);
    }

    public BusinessLinkingInfoFragment$fetchNewBizAccountInfo$1(BusinessLinkingInfoFragment businessLinkingInfoFragment) {
        this.this$0 = businessLinkingInfoFragment;
    }
}
