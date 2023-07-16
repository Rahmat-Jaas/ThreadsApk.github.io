package com.instagram.debug.devoptions;

import X.C14030oh;
import android.view.View;
import com.facebook.breakpad.BreakpadManager;

public final class PublicDeveloperOptions$addMainOptions$48 implements View.OnClickListener {
    public static final PublicDeveloperOptions$addMainOptions$48 INSTANCE = new PublicDeveloperOptions$addMainOptions$48();

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1055214221);
        BreakpadManager.crashProcessByAssert("Developer simulating abort");
        C14030oh.A0C(-1588143841, A05);
    }
}
