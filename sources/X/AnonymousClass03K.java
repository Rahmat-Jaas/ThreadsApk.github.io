package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.03K  reason: invalid class name */
public final class AnonymousClass03K implements Runnable {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass03H A02;
    public final /* synthetic */ AnonymousClass03L A03;
    public final /* synthetic */ AnonymousClass03O A04;

    public AnonymousClass03K(ValueAnimator valueAnimator, View view, AnonymousClass03H r3, AnonymousClass03L r4, AnonymousClass03O r5) {
        this.A03 = r4;
        this.A01 = view;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = valueAnimator;
    }

    public final void run() {
        C005702o.A02(this.A01, this.A02, this.A04);
        this.A00.start();
    }
}
