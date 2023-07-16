package com.instagram.debug.devoptions.section.contentliquidity;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C28161tl;
import android.view.View;

public final class ContentLiquidityOptions$getItems$7 implements View.OnClickListener {
    public final /* synthetic */ C28161tl $userPreferences;

    public ContentLiquidityOptions$getItems$7(C28161tl r1) {
        this.$userPreferences = r1;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1285010003);
        AnonymousClass0wJ.A12(C28161tl.A02(this.$userPreferences), "feed_xpost_user_migration_upsell_last_seen_sec", 0);
        C14030oh.A0C(-1728563929, A05);
    }
}
