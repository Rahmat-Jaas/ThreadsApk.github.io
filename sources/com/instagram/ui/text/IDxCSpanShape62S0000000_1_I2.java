package com.instagram.ui.text;

import X.AnonymousClass3W8;
import X.C04220Ms;
import X.C10650ih;
import X.C15430rJ;
import X.C18730xl;
import android.content.Context;
import android.net.Uri;
import android.view.View;

public class IDxCSpanShape62S0000000_1_I2 extends C18730xl {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape62S0000000_1_I2(int i, int i2) {
        super(i);
        this.A00 = i2;
    }

    public final void onClick(View view) {
        if (this.A00 == 0) {
            C04220Ms.A0B(view, 0);
            Context context = view.getContext();
            Uri A002 = AnonymousClass3W8.A00(context, C15430rJ.A01("https://help.instagram.com/519522125107875"));
            C04220Ms.A06(A002);
            C10650ih.A06(context, A002);
        }
    }
}
