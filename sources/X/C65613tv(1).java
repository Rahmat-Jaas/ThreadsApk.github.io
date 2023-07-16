package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;

/* renamed from: X.3tv  reason: invalid class name and case insensitive filesystem */
public final class C65613tv implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ KtCSuperShape0S0110000_I2 A01;
    public final /* synthetic */ C83624ri A02;
    public final /* synthetic */ AnonymousClass136 A03;
    public final /* synthetic */ AnonymousClass192 A04;

    public C65613tv(View view, KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2, C83624ri r3, AnonymousClass136 r4, AnonymousClass192 r5) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = ktCSuperShape0S0110000_I2;
        this.A00 = view;
    }

    public final void onGlobalLayout() {
        this.A02.C2u(this.A03.A00, this.A01, this.A04.A01);
        this.A00.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
