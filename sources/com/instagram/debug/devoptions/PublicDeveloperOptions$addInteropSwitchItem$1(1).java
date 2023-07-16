package com.instagram.debug.devoptions;

import X.AnonymousClass3DE;
import X.C35202Mn;
import X.C63473hX;
import android.content.Context;
import android.widget.CompoundButton;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addInteropSwitchItem$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addInteropSwitchItem$1(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C63473hX A01 = C63473hX.A01(this.$userSession);
        if (z) {
            AnonymousClass3DE r2 = new AnonymousClass3DE((String) null, "internal_settings");
            r2.A05 = "upgrade";
            A01.A07(new PublicDeveloperOptions$addInteropSwitchItem$1$onCheckedChanged$1(this.$context), r2);
            return;
        }
        AnonymousClass3DE r4 = new AnonymousClass3DE((String) null, "internal_settings");
        PublicDeveloperOptions$addInteropSwitchItem$1$onCheckedChanged$2 publicDeveloperOptions$addInteropSwitchItem$1$onCheckedChanged$2 = new PublicDeveloperOptions$addInteropSwitchItem$1$onCheckedChanged$2(this.$context, this.$userSession);
        C35202Mn.A00(new IDxACallbackShape35S0200000_1_I2(17, A01, publicDeveloperOptions$addInteropSwitchItem$1$onCheckedChanged$2), r4, A01.A04, false);
    }
}
