package com.instagram.debug.devoptions;

import X.C14030oh;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

public final class PublicDeveloperOptions$addMainOptions$15 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;

    public PublicDeveloperOptions$addMainOptions$15(FragmentActivity fragmentActivity) {
        this.$fragmentActivity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1074544500);
        PublicDeveloperOptions.INSTANCE.showQpIpOverrideDialog(this.$fragmentActivity);
        C14030oh.A0C(1358239143, A05);
    }
}
