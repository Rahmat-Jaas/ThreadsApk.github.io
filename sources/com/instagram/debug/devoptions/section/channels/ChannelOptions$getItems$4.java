package com.instagram.debug.devoptions.section.channels;

import X.AnonymousClass0wJ;
import X.AnonymousClass2SO;
import X.C14030oh;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class ChannelOptions$getItems$4 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public ChannelOptions$getItems$4(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-792869700);
        AnonymousClass0wJ.A13(AnonymousClass2SO.A00(this.$userSession).A00.edit(), "broadcast_channel_comments_upsell", false);
        C14030oh.A0C(1801618080, A05);
    }
}
