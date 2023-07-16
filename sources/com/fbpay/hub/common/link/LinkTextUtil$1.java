package com.fbpay.hub.common.link;

import android.view.View;
import com.fbpay.common.URLSpanNoUnderline;

public class LinkTextUtil$1 extends URLSpanNoUnderline {
    public final /* synthetic */ View.OnClickListener A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkTextUtil$1(View.OnClickListener onClickListener) {
        super((String) null);
        this.A00 = onClickListener;
    }

    public final void onClick(View view) {
        this.A00.onClick(view);
    }
}
