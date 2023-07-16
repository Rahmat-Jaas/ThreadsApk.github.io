package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$103 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$103(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-715420625);
        SharedPreferences A04 = C28161tl.A04(this.$userSession);
        AnonymousClass0wJ.A11(A04.edit(), "fullscreen_video_hint_num_views", 0);
        AnonymousClass0wJ.A12(A04.edit(), "fullscreen_video_hint_last_opened_time", 0);
        AnonymousClass0wJ.A12(A04.edit(), "fullscreen_video_hint_last_seen_time", 0);
        C63813iO.A03(this.$context, (String) null, 2131825352, 0);
        C14030oh.A0C(138475063, A05);
    }
}
