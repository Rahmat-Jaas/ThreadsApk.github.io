package com.instagram.debug.devoptions.proidentity;

import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C61303Sr;
import X.C63813iO;
import X.C82234pI;
import android.content.Context;

public final class BusinessLinkingInfoFragment$fetchNewBizAccountInfoCustom$1 implements C82234pI {
    public final /* synthetic */ BusinessLinkingInfoFragment this$0;

    public void onError(Throwable th) {
    }

    public void onSuccess(C61303Sr r5) {
        C04220Ms.A0B(r5, 0);
        Context context = this.this$0.getContext();
        StringBuilder A0s = C18190wL.A0s("Fetched Business Name from API Custom: ");
        A0s.append(r5.A02);
        A0s.append(" 2FacEnable=");
        A0s.append(r5.A00);
        A0s.append(" isHidden= ");
        C63813iO.A02(context, C18200wM.A0m(r5.A01, A0s), (String) null, 0);
    }

    public BusinessLinkingInfoFragment$fetchNewBizAccountInfoCustom$1(BusinessLinkingInfoFragment businessLinkingInfoFragment) {
        this.this$0 = businessLinkingInfoFragment;
    }
}
