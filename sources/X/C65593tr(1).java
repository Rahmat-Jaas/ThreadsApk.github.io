package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.3tr  reason: invalid class name and case insensitive filesystem */
public final class C65593tr implements View.OnTouchListener {
    public final Drawable A00;
    public final Drawable A01;
    public final View A02;
    public final Runnable A03;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65593tr(android.view.View r5, java.lang.Integer r6, java.lang.Runnable r7, boolean r8) {
        /*
            r4 = this;
            r0 = 4
            X.C04220Ms.A0B(r6, r0)
            r4.<init>()
            r4.A02 = r5
            r4.A03 = r7
            android.content.Context r3 = r5.getContext()
            if (r8 == 0) goto L_0x004d
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            if (r6 != r2) goto L_0x0045
            r1 = 2131233775(0x7f080bef, float:1.8083697E38)
        L_0x0018:
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r1)
            r4.A01 = r0
            if (r8 == 0) goto L_0x0034
            if (r6 != r2) goto L_0x002c
            r1 = 2131233775(0x7f080bef, float:1.8083697E38)
        L_0x0025:
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r1)
            r4.A00 = r0
            return
        L_0x002c:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r6 != r0) goto L_0x0034
            r1 = 2131233589(0x7f080b35, float:1.808332E38)
            goto L_0x0025
        L_0x0034:
            if (r6 != r2) goto L_0x003a
            r1 = 2131233858(0x7f080c42, float:1.8083865E38)
            goto L_0x0025
        L_0x003a:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1 = 2131231534(0x7f08032e, float:1.8079152E38)
            if (r6 != r0) goto L_0x0025
            r1 = 2131231533(0x7f08032d, float:1.807915E38)
            goto L_0x0025
        L_0x0045:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r6 != r0) goto L_0x004d
            r1 = 2131233589(0x7f080b35, float:1.808332E38)
            goto L_0x0018
        L_0x004d:
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            if (r6 != r2) goto L_0x0055
            r1 = 2131233858(0x7f080c42, float:1.8083865E38)
            goto L_0x0018
        L_0x0055:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1 = 2131231715(0x7f0803e3, float:1.8079519E38)
            if (r6 != r0) goto L_0x0018
            r1 = 2131231714(0x7f0803e2, float:1.8079517E38)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65593tr.<init>(android.view.View, java.lang.Integer, java.lang.Runnable, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3 == 3) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            r4 = 1
            X.C04220Ms.A0B(r7, r4)
            int r3 = r7.getAction()
            r2 = 1060320051(0x3f333333, float:0.7)
            if (r3 == 0) goto L_0x0017
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L_0x002a
            r0 = 2
            if (r3 == r0) goto L_0x0017
            r0 = 3
            if (r3 == r0) goto L_0x002f
        L_0x0017:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            android.graphics.drawable.Drawable r2 = r5.A01
        L_0x001d:
            float r1 = r0.floatValue()
            android.view.View r0 = r5.A02
            r0.setAlpha(r1)
            r0.setBackground(r2)
            return r4
        L_0x002a:
            java.lang.Runnable r0 = r5.A03
            r0.run()
        L_0x002f:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            android.graphics.drawable.Drawable r2 = r5.A00
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65593tr.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
