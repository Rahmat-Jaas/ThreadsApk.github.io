package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C18180wK;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$getMediaInjectionOptions$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$getMediaInjectionOptions$1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1986670569);
        C18180wK.A17(new InjectMediaToolFragment(), C18180wK.A0Q(this.$fragmentActivity, this.$userSession));
        C14030oh.A0C(-1243049062, A05);
    }
}
