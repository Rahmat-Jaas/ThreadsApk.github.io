package com.instagram.debug.devoptions;

import X.AnonymousClass0LU;
import X.C10650ih;
import X.C14030oh;
import X.FLS;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.io.IOException;

public final class PublicDeveloperOptions$addMainOptions$138 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$138(Context context, UserSession userSession) {
        this.$context = context;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1062844559);
        try {
            C10650ih.A02(this.$context, new FLS(this.$context, this.$userSession, (String) null, (String) null, (String) null, (String) null).A00());
        } catch (IOException e) {
            AnonymousClass0LU.A0E(PublicDeveloperOptions.TAG, "Exception when launching ID Capture", e);
        }
        C14030oh.A0C(927055385, A05);
    }
}
