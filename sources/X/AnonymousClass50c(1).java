package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.50c  reason: invalid class name */
public final class AnonymousClass50c extends View {
    public static final int[] A05 = {16842919, 16842910};
    public static final int[] A06 = new int[0];
    public AnonymousClass4yS A00;
    public Boolean A01;
    public Long A02;
    public Runnable A03;
    public AnonymousClass0ZU A04;

    public static final void setRippleState$lambda$2(AnonymousClass50c r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4yS r1 = r2.A00;
        if (r1 != null) {
            r1.setState(A06);
        }
        r2.A03 = null;
    }

    public final void A00() {
        this.A04 = null;
        Runnable runnable = this.A03;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.A03;
            C04220Ms.A0A(runnable2);
            runnable2.run();
        } else {
            AnonymousClass4yS r1 = this.A00;
            if (r1 != null) {
                r1.setState(A06);
            }
        }
        AnonymousClass4yS r12 = this.A00;
        if (r12 != null) {
            r12.setVisible(false, false);
            unscheduleDrawable(r12);
        }
    }

    public final void A01() {
        setRippleState(false);
    }

    public final void A03(C122987Uv r13, AnonymousClass0ZU r14, float f, int i, long j, long j2, boolean z) {
        float centerX;
        float centerY;
        C04220Ms.A0B(r14, 6);
        boolean z2 = z;
        if (this.A00 == null || !C04220Ms.A0I(Boolean.valueOf(z2), this.A01)) {
            AnonymousClass4yS r0 = new AnonymousClass4yS(z2);
            setBackground(r0);
            this.A00 = r0;
            this.A01 = Boolean.valueOf(z2);
        }
        AnonymousClass4yS r4 = this.A00;
        C04220Ms.A0A(r4);
        this.A04 = r14;
        A02(f, i, j, j2);
        if (z) {
            long j3 = r13.A00;
            centerX = AnonymousClass7KC.A01(j3);
            centerY = AnonymousClass7KC.A02(j3);
        } else {
            centerX = (float) r4.getBounds().centerX();
            centerY = (float) r4.getBounds().centerY();
        }
        r4.setHotspot(centerX, centerY);
        setRippleState(true);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void refreshDrawableState() {
    }

    public final void A02(float f, int i, long j, long j2) {
        AnonymousClass4yS r3 = this.A00;
        if (r3 != null) {
            Integer num = r3.A01;
            if (num == null || num.intValue() != i) {
                r3.A01 = Integer.valueOf(i);
                r3.setRadius(i);
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            long A042 = C121657He.A04(C86154wM.A0G(j2), AnonymousClass7KE.A03(j2), AnonymousClass7KE.A02(j2), AnonymousClass7KE.A01(j2), f);
            AnonymousClass7KE r0 = r3.A00;
            if (r0 == null || r0.A00 != A042) {
                r3.A00 = C86134wK.A0I(A042);
                r3.setColor(ColorStateList.valueOf(C121657He.A01(A042)));
            }
            Rect rect = new Rect(0, 0, AnonymousClass8bA.A02(AnonymousClass7JK.A02(j)), AnonymousClass8bA.A02(AnonymousClass7JK.A00(j)));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            r3.setBounds(rect);
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        AnonymousClass0ZU r0 = this.A04;
        if (r0 != null) {
            r0.invoke();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setRippleState(boolean r8) {
        /*
            r7 = this;
            long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            java.lang.Runnable r0 = r7.A03
            if (r0 == 0) goto L_0x000e
            r7.removeCallbacks(r0)
            r0.run()
        L_0x000e:
            java.lang.Long r0 = r7.A02
            long r0 = X.C86134wK.A0C(r0)
            long r3 = r5 - r0
            if (r8 != 0) goto L_0x0034
            r1 = 5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
            X.7ym r2 = new X.7ym
            r2.<init>(r7)
            r7.A03 = r2
            r0 = 50
            r7.postDelayed(r2, r0)
        L_0x002a:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r7.A02 = r0
            return
        L_0x0031:
            int[] r1 = A06
            goto L_0x0036
        L_0x0034:
            int[] r1 = A05
        L_0x0036:
            X.4yS r0 = r7.A00
            if (r0 == 0) goto L_0x002a
            r0.setState(r1)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass50c.setRippleState(boolean):void");
    }

    public AnonymousClass50c(Context context) {
        super(context);
    }
}
