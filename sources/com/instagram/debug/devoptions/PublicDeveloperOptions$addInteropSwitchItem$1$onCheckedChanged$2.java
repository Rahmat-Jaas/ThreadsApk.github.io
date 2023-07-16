package com.instagram.debug.devoptions;

import X.AnonymousClass3GR;
import X.C18180wK;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addInteropSwitchItem$1$onCheckedChanged$2 extends AnonymousClass3GR {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addInteropSwitchItem$1$onCheckedChanged$2(Context context, UserSession userSession) {
        this.$context = context;
        this.$userSession = userSession;
    }

    public void onFail(String str) {
        Context context = this.$context;
        if (str == null) {
            str = "UNKNOWN ERROR";
        }
        C63813iO.A0B(context, str);
    }

    public void onSuccess() {
        C63813iO.A02(this.$context, "You have downgraded from Interop", (String) null, 0);
        SharedPreferences.Editor putBoolean = C28161tl.A03(this.$userSession).putBoolean("has_user_seen_interop_upgrade_interstitial", false);
        putBoolean.remove("direct_inbox_interop_interstitial_count").remove("last_interop_interstitial_presentation_timestamp");
        putBoolean.apply();
        C18180wK.A0u(C28161tl.A03(this.$userSession).remove("last_reshare_sheet_interop_interstitial_impression_timestamp"), "reshare_sheet_interop_interstitial_impression_count");
    }
}
