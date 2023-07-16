package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$122 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$122(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(535452193);
        SharedPreferences A04 = C28161tl.A04(this.$userSession);
        AnonymousClass0wJ.A11(A04.edit(), "music_attribution_tooltip_shown_count", 0);
        AnonymousClass0wJ.A12(A04.edit(), "music_attribution_tooltip_shown_timestamp", -1);
        AnonymousClass0wJ.A13(A04.edit(), "has_interacted_with_music_attribution_tooltip", false);
        AnonymousClass0wJ.A13(A04.edit(), "has_seen_save_music_bottom_sheet", false);
        C63813iO.A03(this.$context, (String) null, 2131825466, 0);
        C14030oh.A0C(770339901, A05);
    }
}
