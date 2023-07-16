package com.instagram.debug.devoptions.proidentity;

import X.AnonymousClass00U;
import X.C04220Ms;
import X.C110456li;
import X.C63813iO;
import X.C82234pI;

public final class BusinessLinkingInfoFragment$fetchNewWhatsAppBizInfo$1 implements C82234pI {
    public final /* synthetic */ BusinessLinkingInfoFragment this$0;

    public void onError(Throwable th) {
    }

    public void onSuccess(C110456li r5) {
        C04220Ms.A0B(r5, 0);
        C63813iO.A02(this.this$0.getContext(), AnonymousClass00U.A0L("Fetched WA Info from API: ", this.this$0.toReadableInfo(r5)), (String) null, 0);
    }

    public BusinessLinkingInfoFragment$fetchNewWhatsAppBizInfo$1(BusinessLinkingInfoFragment businessLinkingInfoFragment) {
        this.this$0 = businessLinkingInfoFragment;
    }
}
