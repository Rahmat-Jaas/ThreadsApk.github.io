package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C28161tl;
import android.content.SharedPreferences;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$10 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$10(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-545254004);
        SharedPreferences A04 = C28161tl.A04(this.$userSession);
        AnonymousClass0wJ.A11(A04.edit(), "newsfeed_row_inline_controls_nux_view_count", 0);
        AnonymousClass0wJ.A12(A04.edit(), "newsfeed_row_inline_controls_nux_timestamp", 0);
        C14030oh.A0C(-739766865, A05);
    }
}
