package com.instagram.debug.devoptions;

import X.C14030oh;
import android.view.View;
import com.facebook.breakpad.BreakpadManager;

public final class PublicDeveloperOptions$addMainOptions$47 implements View.OnClickListener {
    public static final PublicDeveloperOptions$addMainOptions$47 INSTANCE = new PublicDeveloperOptions$addMainOptions$47();

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1604742160);
        BreakpadManager.crashThisProcess();
        C14030oh.A0C(1064095572, A05);
    }
}
