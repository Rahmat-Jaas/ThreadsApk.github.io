package com.instagram.debug.devoptions.proidentity;

import X.AnonymousClass00U;
import X.AnonymousClass3BJ;
import X.C04220Ms;
import X.C63813iO;
import X.C82234pI;
import android.content.Context;

public final class BusinessLinkingInfoFragment$fetchNewFBPageInfo$1 implements C82234pI {
    public final /* synthetic */ BusinessLinkingInfoFragment this$0;

    public void onError(Throwable th) {
    }

    public void onSuccess(AnonymousClass3BJ r5) {
        C04220Ms.A0B(r5, 0);
        Context context = this.this$0.getContext();
        String str = r5.A02;
        if (str == null) {
            str = r5.A01;
        }
        C63813iO.A02(context, AnonymousClass00U.A0L("Public callback from fetching: ", str), (String) null, 0);
    }

    public BusinessLinkingInfoFragment$fetchNewFBPageInfo$1(BusinessLinkingInfoFragment businessLinkingInfoFragment) {
        this.this$0 = businessLinkingInfoFragment;
    }
}
