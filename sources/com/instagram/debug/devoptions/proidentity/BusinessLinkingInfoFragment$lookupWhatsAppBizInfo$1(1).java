package com.instagram.debug.devoptions.proidentity;

import X.C04220Ms;
import X.C554833j;
import X.C63813iO;
import X.C82234pI;

public final class BusinessLinkingInfoFragment$lookupWhatsAppBizInfo$1 implements C82234pI {
    public final /* synthetic */ BusinessLinkingInfoFragment this$0;

    public void onError(Throwable th) {
    }

    public void onSuccess(C554833j r5) {
        String str;
        C04220Ms.A0B(r5, 0);
        if (r5.A00 == null) {
            str = "Has no linked WA phone #";
        } else {
            str = "Has linked WA phone #";
        }
        C63813iO.A02(this.this$0.getContext(), str, (String) null, 0);
    }

    public BusinessLinkingInfoFragment$lookupWhatsAppBizInfo$1(BusinessLinkingInfoFragment businessLinkingInfoFragment) {
        this.this$0 = businessLinkingInfoFragment;
    }
}
