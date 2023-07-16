package com.instagram.debug.devoptions.section.channels;

import X.AnonymousClass0wJ;
import X.AnonymousClass2SO;
import X.C14030oh;
import android.content.SharedPreferences;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class ChannelOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public ChannelOptions$getItems$2(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(960165985);
        SharedPreferences sharedPreferences = AnonymousClass2SO.A00(this.$userSession).A00;
        AnonymousClass0wJ.A13(sharedPreferences.edit(), "has_seen_view_channel_tooltip", false);
        AnonymousClass0wJ.A11(sharedPreferences.edit(), "creator_view_channel_upsell_impression_count", 0);
        C14030oh.A0C(1366000742, A05);
    }
}
