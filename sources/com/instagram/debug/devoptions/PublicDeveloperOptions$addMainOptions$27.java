package com.instagram.debug.devoptions;

import X.AnonymousClass006;
import X.C14030oh;
import X.C18200wM;
import X.C60573Pq;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$27 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$27(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-169847927);
        C60573Pq.A01(this.$userSession, AnonymousClass006.A00, C18200wM.A0A());
        C63813iO.A0C(this.$context, "Added ALTERNATE_TOPIC_NUDGE entry");
        C14030oh.A0C(-626140732, A05);
    }
}
