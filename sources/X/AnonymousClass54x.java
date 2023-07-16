package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.ui.Modifier;

/* renamed from: X.54x  reason: invalid class name */
public final class AnonymousClass54x extends AnonymousClass7YV implements C147418pJ {
    public final AndroidEdgeEffectOverscrollEffect A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54x(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, AnonymousClass0YY r3) {
        super(r3);
        C04220Ms.A0B(r3, 2);
        this.A00 = androidEdgeEffectOverscrollEffect;
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass54x)) {
            return false;
        }
        return C04220Ms.A0I(this.A00, ((AnonymousClass54x) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("DrawOverscrollModifier(overscrollEffect="));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        if (r0 != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
        if (r0 != false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AIj(X.C147558pX r11) {
        /*
            r10 = this;
            r11.AIq()
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r6 = r10.A00
            long r1 = r6.A00
            float r0 = X.AnonymousClass7JK.A02(r1)
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            float r0 = X.AnonymousClass7JK.A00(r1)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            X.8mg r0 = X.C147848q1.A01(r11)
            X.8pE r3 = r6.A0D
            r3.getValue()
            X.7Wy r0 = (X.C123447Wy) r0
            android.graphics.Canvas r5 = r0.A00
            android.widget.EdgeEffect r2 = r6.A07
            float r0 = X.C121617Ha.A00(r2)
            r9 = 1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0036
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A07(r5, r2, r6, r11)
            r2.finish()
        L_0x0036:
            android.widget.EdgeEffect r1 = r6.A06
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x00fa
            boolean r8 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A06(r5, r1, r6, r11)
            float r0 = X.C121617Ha.A00(r1)
            X.C121617Ha.A01(r2, r0, r4)
        L_0x0049:
            android.widget.EdgeEffect r2 = r6.A0B
            float r0 = X.C121617Ha.A00(r2)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0059
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A05(r5, r2, r6, r11)
            r2.finish()
        L_0x0059:
            android.widget.EdgeEffect r7 = r6.A0A
            boolean r0 = r7.isFinished()
            if (r0 != 0) goto L_0x0089
            int r1 = r5.save()
            X.6tM r0 = r6.A0C
            X.8jm r0 = r0.A01
            X.7V9 r0 = (X.AnonymousClass7V9) r0
            float r0 = r0.A03
            float r0 = r11.CxL(r0)
            r5.translate(r4, r0)
            boolean r0 = r7.draw(r5)
            r5.restoreToCount(r1)
            if (r0 != 0) goto L_0x0081
            r0 = r8
            r8 = 0
            if (r0 == 0) goto L_0x0082
        L_0x0081:
            r8 = 1
        L_0x0082:
            float r0 = X.C121617Ha.A00(r7)
            X.C121617Ha.A01(r2, r0, r4)
        L_0x0089:
            android.widget.EdgeEffect r2 = r6.A09
            float r0 = X.C121617Ha.A00(r2)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0099
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A06(r5, r2, r6, r11)
            r2.finish()
        L_0x0099:
            android.widget.EdgeEffect r1 = r6.A08
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x00b3
            boolean r0 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A07(r5, r1, r6, r11)
            if (r0 != 0) goto L_0x00ab
            r0 = r8
            r8 = 0
            if (r0 == 0) goto L_0x00ac
        L_0x00ab:
            r8 = 1
        L_0x00ac:
            float r0 = X.C121617Ha.A00(r1)
            X.C121617Ha.A01(r2, r0, r4)
        L_0x00b3:
            android.widget.EdgeEffect r2 = r6.A05
            float r0 = X.C121617Ha.A00(r2)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00d9
            int r1 = r5.save()
            X.6tM r0 = r6.A0C
            X.8jm r0 = r0.A01
            X.7V9 r0 = (X.AnonymousClass7V9) r0
            float r0 = r0.A03
            float r0 = r11.CxL(r0)
            r5.translate(r4, r0)
            r2.draw(r5)
            r5.restoreToCount(r1)
            r2.finish()
        L_0x00d9:
            android.widget.EdgeEffect r1 = r6.A04
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x00f2
            boolean r0 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A05(r5, r1, r6, r11)
            if (r0 != 0) goto L_0x00ea
            if (r8 != 0) goto L_0x00ea
            r9 = 0
        L_0x00ea:
            float r0 = X.C121617Ha.A00(r1)
            X.C121617Ha.A01(r2, r0, r4)
            r8 = r9
        L_0x00f2:
            if (r8 == 0) goto L_0x00f9
            kotlin.Unit r0 = kotlin.Unit.A00
            r3.CrC(r0)
        L_0x00f9:
            return
        L_0x00fa:
            r8 = 0
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54x.AIj(X.8pX):void");
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
