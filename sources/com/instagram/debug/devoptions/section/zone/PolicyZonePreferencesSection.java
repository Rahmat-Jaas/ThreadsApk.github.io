package com.instagram.debug.devoptions.section.zone;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.C04220Ms;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class PolicyZonePreferencesSection implements DeveloperOptionsSection {
    public final Context context;
    public final int titleRes = 2131825360;

    public PolicyZonePreferencesSection(Context context2) {
        C04220Ms.A0B(context2, 1);
        this.context = context2;
    }

    public Integer getTitleRes() {
        return Integer.valueOf(this.titleRes);
    }

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass4MA.A03(new PolicyZonePreferencesSection$getItems$1(this), A0v, 2131825299);
        return A0v;
    }

    public /* synthetic */ boolean isEnabled(UserSession userSession) {
        return true;
    }
}
