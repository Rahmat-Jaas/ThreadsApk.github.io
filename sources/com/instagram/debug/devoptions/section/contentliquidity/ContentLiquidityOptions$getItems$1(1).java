package com.instagram.debug.devoptions.section.contentliquidity;

import X.C14030oh;
import X.C28161tl;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class ContentLiquidityOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ C28161tl $userPreferences;
    public final /* synthetic */ UserSession $userSession;
    public final /* synthetic */ ContentLiquidityOptions this$0;

    public ContentLiquidityOptions$getItems$1(ContentLiquidityOptions contentLiquidityOptions, C28161tl r2, UserSession userSession) {
        this.this$0 = contentLiquidityOptions;
        this.$userPreferences = r2;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1571114469);
        this.this$0.resetAllUpsells(this.$userPreferences, this.$userSession);
        C14030oh.A0C(-88023040, A05);
    }
}
