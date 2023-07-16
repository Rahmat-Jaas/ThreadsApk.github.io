package com.fbpay.common;

import X.C108886j7;
import X.C112166p6;
import X.C143638h4;
import android.view.View;

public class LinkableText$1 extends URLSpanNoUnderline {
    public final /* synthetic */ C108886j7 A00;
    public final /* synthetic */ C143638h4 A01;
    public final /* synthetic */ C112166p6 A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkableText$1(C108886j7 r1, C143638h4 r2, C112166p6 r3, String str, boolean z) {
        super(str);
        this.A02 = r3;
        this.A03 = z;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        if (this.A03) {
            view.cancelPendingInputEvents();
        }
        this.A01.C4b(this.A00);
    }
}
