package com.instagram.debug.devoptions.section.contentliquidity;

import X.C14030oh;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class ContentLiquidityOptions$getItems$19 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;
    public final /* synthetic */ ContentLiquidityOptions this$0;

    public ContentLiquidityOptions$getItems$19(ContentLiquidityOptions contentLiquidityOptions, UserSession userSession) {
        this.this$0 = contentLiquidityOptions;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-292121363);
        this.this$0.resetMultipleUpsellDismissalCooldowns(this.$userSession);
        C14030oh.A0C(-346878420, A05);
    }
}
