package com.instagram.debug.devoptions.section.channels;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.C04220Ms;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class ChannelOptions implements DeveloperOptionsSection {
    public final int titleRes = 2131825226;

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity) {
        C04220Ms.A0B(userSession, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass4MA.A03(new ChannelOptions$getItems$1(userSession), A0v, 2131825427);
        AnonymousClass4MA.A03(new ChannelOptions$getItems$2(userSession), A0v, 2131825434);
        AnonymousClass4MA.A03(new ChannelOptions$getItems$3(userSession), A0v, 2131825479);
        AnonymousClass4MA.A03(new ChannelOptions$getItems$4(userSession), A0v, 2131825426);
        AnonymousClass4MA.A03(new ChannelOptions$getItems$5(userSession), A0v, 2131825428);
        return A0v;
    }

    public Integer getTitleRes() {
        return Integer.valueOf(this.titleRes);
    }

    public /* synthetic */ boolean isEnabled(UserSession userSession) {
        return true;
    }
}
