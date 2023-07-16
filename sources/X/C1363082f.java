package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.redex.IDxLAdapterShape0S0100000_2_I2;

/* renamed from: X.82f  reason: invalid class name and case insensitive filesystem */
public final class C1363082f implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C113176qs A01;
    public final /* synthetic */ Runnable A02;

    public C1363082f(C113176qs r1, Runnable runnable, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = runnable;
    }

    public final void run() {
        C113176qs r4 = this.A01;
        View view = r4.A03;
        int width = view.getWidth();
        int height = view.getHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (this.A00 * width) / 100});
        C04220Ms.A06(ofInt);
        ofInt.addUpdateListener(new AnonymousClass7L9(r4, height));
        Runnable runnable = this.A02;
        if (runnable != null) {
            ofInt.addListener(new IDxLAdapterShape0S0100000_2_I2(runnable, 6));
        }
        ofInt.setDuration(400);
        ofInt.start();
    }
}
