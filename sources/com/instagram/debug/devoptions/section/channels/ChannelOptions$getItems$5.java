package com.instagram.debug.devoptions.section.channels;

import X.AnonymousClass0wJ;
import X.AnonymousClass2SO;
import X.C14030oh;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class ChannelOptions$getItems$5 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public ChannelOptions$getItems$5(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1270843292);
        AnonymousClass0wJ.A11(AnonymousClass2SO.A00(this.$userSession).A00.edit(), "broadcast_channel_moderation_reminder_impression_count", 0);
        C14030oh.A0C(-1729811777, A05);
    }
}
