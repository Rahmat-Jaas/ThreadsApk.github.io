package com.instagram.debug.devoptions;

import X.AnonymousClass006;
import X.C14030oh;
import X.C60573Pq;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$29 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$29(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-19609765);
        Integer num = AnonymousClass006.A00;
        C60573Pq.A01(this.$userSession, num, 1648142445);
        C60573Pq.A01(this.$userSession, num, 1648145403);
        C60573Pq.A01(this.$userSession, num, 1648147574);
        C63813iO.A0C(this.$context, "Cleared all entries for ALTERNATE_TOPIC_NUDGE");
        C14030oh.A0C(-285252584, A05);
    }
}
