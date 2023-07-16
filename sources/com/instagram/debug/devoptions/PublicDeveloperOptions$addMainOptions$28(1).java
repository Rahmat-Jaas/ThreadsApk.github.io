package com.instagram.debug.devoptions;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C04220Ms;
import X.C14030oh;
import X.C18180wK;
import X.C18220wO;
import X.C28161tl;
import X.C54432zR;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

public final class PublicDeveloperOptions$addMainOptions$28 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$28(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1194845029);
        Integer num = AnonymousClass006.A00;
        UserSession userSession = this.$userSession;
        C04220Ms.A0B(userSession, 1);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        HashMap A0G = AnonymousClass3WS.A01(userSession).A0G();
        A0G.put(C54432zR.A00(num), A0v);
        C28161tl A01 = AnonymousClass3WS.A01(userSession);
        C18180wK.A0v(C28161tl.A02(A01), "nudge_tracker_map", C18220wO.A0p(A0G));
        C63813iO.A02(this.$context, "Cleared all entries for ALTERNATE_TOPIC_NUDGE", (String) null, 1);
        C14030oh.A0C(-1898683035, A05);
    }
}
