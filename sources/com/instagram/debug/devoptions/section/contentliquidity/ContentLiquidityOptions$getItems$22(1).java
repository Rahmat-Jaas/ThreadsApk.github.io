package com.instagram.debug.devoptions.section.contentliquidity;

import X.AnonymousClass0wJ;
import X.AnonymousClass3Zu;
import android.widget.CompoundButton;
import com.instagram.service.session.UserSession;

public final class ContentLiquidityOptions$getItems$22 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ UserSession $userSession;

    public ContentLiquidityOptions$getItems$22(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass0wJ.A13(AnonymousClass3Zu.A01(this.$userSession), "PREFERENCE_CREATED_MEDIA_COOLDOWN_ENABLED", z);
    }
}
