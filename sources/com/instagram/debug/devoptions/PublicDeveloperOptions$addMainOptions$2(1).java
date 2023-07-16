package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C18180wK;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$2(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1604320086);
        C18180wK.A17(new EventDebuggerSettingsFragment(), C18180wK.A0Q(this.$fragmentActivity, this.$userSession));
        C14030oh.A0C(-2026356409, A05);
    }
}
