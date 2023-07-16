package com.instagram.debug.devoptions;

import X.AnonymousClass3LM;
import X.C14030oh;
import X.C19223Ask;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$174 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$174(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$fragmentActivity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-778640990);
        C19223Ask ask = new C19223Ask(ClipsViewerSource.A0n, this.$userSession);
        ask.A0v = true;
        ClipsViewerConfig A01 = ask.A01();
        AnonymousClass3LM.A01().A06(this.$fragmentActivity, A01, this.$userSession);
        C14030oh.A0C(-219975176, A05);
    }
}
