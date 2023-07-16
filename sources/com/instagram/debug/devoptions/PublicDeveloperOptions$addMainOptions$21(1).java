package com.instagram.debug.devoptions;

import X.C05050Qq;
import X.C14030oh;
import X.C18180wK;
import X.C18240wQ;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$21 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$21(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$fragmentActivity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1193747821);
        Bundle A06 = C18180wK.A06();
        C05050Qq.A00(A06, this.$userSession);
        C18240wQ.A0u(A06, new SessionSurveyInternalSettingsFragment(), C18180wK.A0Q(this.$fragmentActivity, this.$userSession));
        C14030oh.A0C(451939689, A05);
    }
}
