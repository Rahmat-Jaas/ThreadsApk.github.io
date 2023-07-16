package com.instagram.debug.devoptions;

import X.C14030oh;
import android.content.Context;
import android.view.View;
import com.facebook.endtoend.EndToEnd;
import com.instagram.debug.devoptions.refresh.AppRestartUtil;

public final class PublicDeveloperOptions$addMainOptions$1 implements View.OnClickListener {
    public final /* synthetic */ Context $context;

    public PublicDeveloperOptions$addMainOptions$1(Context context) {
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1827637580);
        if (!EndToEnd.A04()) {
            AppRestartUtil.restartApp(this.$context);
        }
        C14030oh.A0C(-1660639424, A05);
    }
}
