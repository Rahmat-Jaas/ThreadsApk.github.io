package com.instagram.debug.devoptions;

import X.AnonymousClass3GR;
import X.C63813iO;
import android.content.Context;

public final class PublicDeveloperOptions$addInteropSwitchItem$1$onCheckedChanged$1 extends AnonymousClass3GR {
    public final /* synthetic */ Context $context;

    public PublicDeveloperOptions$addInteropSwitchItem$1$onCheckedChanged$1(Context context) {
        this.$context = context;
    }

    public void onFail(String str) {
        Context context = this.$context;
        if (str == null) {
            str = "UNKNOWN ERROR";
        }
        C63813iO.A0B(context, str);
    }

    public void onSuccess() {
        C63813iO.A0B(this.$context, "You have upgraded to Interop");
    }
}
