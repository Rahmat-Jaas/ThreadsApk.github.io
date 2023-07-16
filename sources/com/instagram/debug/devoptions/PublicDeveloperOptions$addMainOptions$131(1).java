package com.instagram.debug.devoptions;

import X.AnonymousClass24F;
import X.C04220Ms;
import X.C12560m7;
import X.C14030oh;
import X.C28591uf;
import X.C32165H8c;
import X.C54472zV;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$131 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$131(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$fragmentActivity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(955408659);
        C32165H8c A00 = C54472zV.A00(this.$userSession, Integer.valueOf(AnonymousClass24F.PROACTIVE.A00));
        FragmentActivity fragmentActivity = this.$fragmentActivity;
        C12560m7 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        C04220Ms.A0C(fragmentActivity, "null cannot be cast to non-null type com.instagram.base.activity.IgFragmentActivity");
        C28591uf.A00(supportFragmentManager, (IgFragmentActivity) fragmentActivity, A00, this.$userSession);
        C14030oh.A0C(1318657945, A05);
    }
}
