package com.instagram.debug.devoptions;

import X.AnonymousClass01V;
import X.AnonymousClass0wJ;
import X.AnonymousClass3LY;
import X.C18190wL;
import X.C62413Zr;
import X.C63813iO;
import android.content.Context;
import android.provider.Settings;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.refresh.DevOptionsRefreshEvent;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$90 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$90(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        this.$context = context;
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass0wJ.A1L(C18190wL.A0X().A2C, z);
        if (z) {
            if (!Settings.canDrawOverlays(this.$context)) {
                C62413Zr.A03(this.$fragmentActivity, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
            }
            C63813iO.A03(this.$context, (String) null, 2131837912, 1);
        } else {
            AnonymousClass3LY.A00(this.$userSession).CWx(DevOptionsRefreshEvent.INSTANCE);
        }
        AnonymousClass01V.A0p.updateListenerMarkers();
    }
}
