package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.redex.IDxLAdapterShape0S0100000_2_I2;
import com.facebookpay.widget.accordion.AccordionView;

/* renamed from: X.7Rp  reason: invalid class name and case insensitive filesystem */
public final class C122377Rp implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ AccordionView A03;

    public C122377Rp(View view, View view2, AccordionView accordionView, int i) {
        this.A03 = accordionView;
        this.A02 = view;
        this.A01 = view2;
        this.A00 = i;
    }

    public final void onGlobalLayout() {
        AccordionView accordionView = this.A03;
        C86154wM.A1J(accordionView, this);
        View view = this.A02;
        View view2 = this.A01;
        view.measure(C86134wK.A04(view2.getWidth()), View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 0));
        int measuredHeight = view.getMeasuredHeight() + (accordionView.A08 << 1);
        int i = this.A00;
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i, measuredHeight}).setDuration((long) ((((double) Math.abs(measuredHeight - i)) * 1.5d) / ((double) C18230wP.A0E(view2.getContext()).density)));
        C86134wK.A0z(duration, view2, 1);
        duration.addListener(new IDxLAdapterShape0S0100000_2_I2(view2, 4));
        duration.start();
    }
}
