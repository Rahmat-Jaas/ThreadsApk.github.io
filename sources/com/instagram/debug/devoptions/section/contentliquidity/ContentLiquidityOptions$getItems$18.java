package com.instagram.debug.devoptions.section.contentliquidity;

import X.C14030oh;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class ContentLiquidityOptions$getItems$18 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;
    public final /* synthetic */ ContentLiquidityOptions this$0;

    public ContentLiquidityOptions$getItems$18(ContentLiquidityOptions contentLiquidityOptions, UserSession userSession) {
        this.this$0 = contentLiquidityOptions;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-892248804);
        this.this$0.resetMediaCreationCooldowns(this.$userSession);
        C14030oh.A0C(-2121425272, A05);
    }
}
