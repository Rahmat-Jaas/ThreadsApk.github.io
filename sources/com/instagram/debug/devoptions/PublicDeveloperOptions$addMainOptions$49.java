package com.instagram.debug.devoptions;

import X.C14030oh;
import android.view.View;
import com.facebook.breakpad.BreakpadManager;

public final class PublicDeveloperOptions$addMainOptions$49 implements View.OnClickListener {
    public static final PublicDeveloperOptions$addMainOptions$49 INSTANCE = new PublicDeveloperOptions$addMainOptions$49();

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-712175071);
        BreakpadManager.crashThisProcessAsan();
        C14030oh.A0C(-752394926, A05);
    }
}
