package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C25786Drz;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.ingestion.MediaDebugFragment;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$67 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$67(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(402223391);
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.$fragmentActivity, this.$userSession);
        A0Q.A03 = new MediaDebugFragment();
        A0Q.A05();
        C14030oh.A0C(1539976350, A05);
    }
}
