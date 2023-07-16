package X;

import android.animation.PropertyValuesHolder;
import android.util.Property;

/* renamed from: X.7mZ  reason: invalid class name */
public final class AnonymousClass7mZ implements McA {
    public int A00;

    public static PropertyValuesHolder[] A00(Property property, float f, float f2) {
        return new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(property, new float[]{f, f2})};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r8.getLayoutDirection() == 1) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r0 = ((float) r2) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r8.getLayoutDirection() == 1) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator AFO(android.view.View r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            int r5 = r6.A00
            android.content.res.Resources r1 = X.C86164wN.A0D(r7)
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            int r2 = r1.getDimensionPixelSize(r0)
            float r4 = r7.getTranslationX()
            float r3 = r7.getTranslationY()
            r0 = 48
            if (r5 == r0) goto L_0x0052
            r0 = 80
            if (r5 == r0) goto L_0x004f
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r0) goto L_0x0045
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r5 != r0) goto L_0x0066
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x004c
        L_0x002e:
            float r0 = (float) r2
            float r0 = r4 - r0
        L_0x0031:
            android.util.Property r1 = android.view.View.TRANSLATION_X
            r3 = 2
            android.animation.PropertyValuesHolder[] r0 = A00(r1, r0, r4)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            com.facebook.redex.IDxLAdapterShape0S0100001_2_I2 r1 = new com.facebook.redex.IDxLAdapterShape0S0100001_2_I2
            r1.<init>(r7, r4, r3)
        L_0x0041:
            r2.addListener(r1)
            return r2
        L_0x0045:
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x002e
        L_0x004c:
            float r0 = (float) r2
            float r0 = r0 + r4
            goto L_0x0031
        L_0x004f:
            float r1 = (float) r2
            float r1 = r1 + r3
            goto L_0x0055
        L_0x0052:
            float r0 = (float) r2
            float r1 = r3 - r0
        L_0x0055:
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            android.animation.PropertyValuesHolder[] r0 = A00(r0, r1, r3)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            r0 = 3
            com.facebook.redex.IDxLAdapterShape0S0100001_2_I2 r1 = new com.facebook.redex.IDxLAdapterShape0S0100001_2_I2
            r1.<init>(r7, r3, r0)
            goto L_0x0041
        L_0x0066:
            java.lang.String r0 = "Invalid slide direction: "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r5)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7mZ.AFO(android.view.View, android.view.ViewGroup):android.animation.Animator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r8.getLayoutDirection() == 1) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r1 = r4 - ((float) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r8.getLayoutDirection() == 1) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator AFf(android.view.View r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            int r5 = r6.A00
            android.content.res.Resources r1 = X.C86164wN.A0D(r7)
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            int r2 = r1.getDimensionPixelSize(r0)
            float r4 = r7.getTranslationX()
            float r3 = r7.getTranslationY()
            r0 = 48
            if (r5 == r0) goto L_0x0053
            r0 = 80
            if (r5 == r0) goto L_0x004f
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r0) goto L_0x0044
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r5 != r0) goto L_0x0066
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x004b
        L_0x002e:
            float r1 = (float) r2
            float r1 = r1 + r4
        L_0x0030:
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r3 = 2
            android.animation.PropertyValuesHolder[] r0 = A00(r0, r4, r1)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            com.facebook.redex.IDxLAdapterShape0S0100001_2_I2 r1 = new com.facebook.redex.IDxLAdapterShape0S0100001_2_I2
            r1.<init>(r7, r4, r3)
        L_0x0040:
            r2.addListener(r1)
            return r2
        L_0x0044:
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x002e
        L_0x004b:
            float r0 = (float) r2
            float r1 = r4 - r0
            goto L_0x0030
        L_0x004f:
            float r0 = (float) r2
            float r1 = r3 - r0
            goto L_0x0055
        L_0x0053:
            float r1 = (float) r2
            float r1 = r1 + r3
        L_0x0055:
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            android.animation.PropertyValuesHolder[] r0 = A00(r0, r3, r1)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            r0 = 3
            com.facebook.redex.IDxLAdapterShape0S0100001_2_I2 r1 = new com.facebook.redex.IDxLAdapterShape0S0100001_2_I2
            r1.<init>(r7, r3, r0)
            goto L_0x0040
        L_0x0066:
            java.lang.String r0 = "Invalid slide direction: "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r5)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7mZ.AFf(android.view.View, android.view.ViewGroup):android.animation.Animator");
    }

    public AnonymousClass7mZ(int i) {
        this.A00 = i;
    }
}
