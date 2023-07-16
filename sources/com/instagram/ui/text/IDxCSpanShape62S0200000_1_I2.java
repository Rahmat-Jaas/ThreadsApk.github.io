package com.instagram.ui.text;

import X.AnonymousClass0wJ;
import X.AnonymousClass3W8;
import X.C04220Ms;
import X.C10300i6;
import X.C18250wR;
import X.C18720xk;
import android.content.Context;
import android.view.View;
import com.instagram.simplewebview.SimpleWebViewActivity;

public class IDxCSpanShape62S0200000_1_I2 extends C18720xk {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape62S0200000_1_I2(int i, int i2, Object obj, Object obj2) {
        super(i);
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                C04220Ms.A0B(view, 0);
                Context context = (Context) this.A00;
                SimpleWebViewActivity.A01.A02(context, (C10300i6) this.A01, C18250wR.A0P(AnonymousClass3W8.A01(context, "https://www.facebook.com/page_guidelines.php"), AnonymousClass0wJ.A0k(context, 2131829574)));
                return;
            case 1:
                ((View.OnClickListener) this.A01).onClick(view);
                return;
            default:
                return;
        }
    }
}
