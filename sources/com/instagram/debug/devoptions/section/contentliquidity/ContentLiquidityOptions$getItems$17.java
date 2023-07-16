package com.instagram.debug.devoptions.section.contentliquidity;

import X.C14030oh;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class ContentLiquidityOptions$getItems$17 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;
    public final /* synthetic */ ContentLiquidityOptions this$0;

    public ContentLiquidityOptions$getItems$17(ContentLiquidityOptions contentLiquidityOptions, UserSession userSession) {
        this.this$0 = contentLiquidityOptions;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(109825618);
        this.this$0.resetXpostSettingDisableCooldowns(this.$userSession);
        C14030oh.A0C(-1291865082, A05);
    }
}
