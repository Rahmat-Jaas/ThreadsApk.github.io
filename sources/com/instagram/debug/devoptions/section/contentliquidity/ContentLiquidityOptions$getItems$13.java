package com.instagram.debug.devoptions.section.contentliquidity;

import X.C14030oh;
import X.C28161tl;
import android.view.View;

public final class ContentLiquidityOptions$getItems$13 implements View.OnClickListener {
    public final /* synthetic */ C28161tl $userPreferences;
    public final /* synthetic */ ContentLiquidityOptions this$0;

    public ContentLiquidityOptions$getItems$13(ContentLiquidityOptions contentLiquidityOptions, C28161tl r2) {
        this.this$0 = contentLiquidityOptions;
        this.$userPreferences = r2;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(2134717134);
        this.this$0.resetRowshareUpsells(this.$userPreferences);
        C14030oh.A0C(-1953052151, A05);
    }
}
