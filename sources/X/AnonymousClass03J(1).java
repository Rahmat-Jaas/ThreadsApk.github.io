package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collections;

/* renamed from: X.03J  reason: invalid class name */
public final class AnonymousClass03J implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass03L A02;
    public final /* synthetic */ AnonymousClass03O A03;
    public final /* synthetic */ AnonymousClass03Y A04;
    public final /* synthetic */ AnonymousClass03Y A05;

    public AnonymousClass03J(View view, AnonymousClass03L r2, AnonymousClass03O r3, AnonymousClass03Y r4, AnonymousClass03Y r5, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A04 = r5;
        this.A00 = i;
        this.A01 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass03U r1;
        AnonymousClass03O r8 = this.A03;
        r8.A00.A08(valueAnimator.getAnimatedFraction());
        AnonymousClass03Y r7 = this.A05;
        AnonymousClass03Y r12 = this.A04;
        float A052 = r8.A00.A05();
        int i = this.A00;
        AnonymousClass03T r5 = new AnonymousClass03T(r7);
        int i2 = 1;
        do {
            int i3 = i & i2;
            AnonymousClass01T A053 = r7.A00.A05(i2);
            if (i3 != 0) {
                AnonymousClass01T A054 = r12.A00.A05(i2);
                float f = 1.0f - A052;
                A053 = AnonymousClass03Y.A00(A053, (int) (((double) (((float) (A053.A01 - A054.A01)) * f)) + 0.5d), (int) (((double) (((float) (A053.A03 - A054.A03)) * f)) + 0.5d), (int) (((double) (((float) (A053.A02 - A054.A02)) * f)) + 0.5d), (int) (((double) (((float) (A053.A00 - A054.A00)) * f)) + 0.5d));
            }
            r1 = r5.A00;
            r1.A07(A053, i2);
            i2 <<= 1;
        } while (i2 <= 256);
        C005702o.A04(this.A01, r1.A00(), Collections.singletonList(r8));
    }
}
