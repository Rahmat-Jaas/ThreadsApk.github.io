package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape0S0611000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0611000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, C146958n9 r7, int i, boolean z) {
        super(2, r7);
        this.A08 = i;
        this.A01 = obj;
        this.A07 = z;
        this.A03 = obj2;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A04 = obj5;
    }

    public final C146958n9 create(Object obj, C146958n9 r11) {
        boolean z;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        int i2 = this.A08;
        Object obj6 = this.A01;
        C146958n9 r6 = r11;
        if (i2 != 0) {
            obj4 = this.A02;
            obj3 = this.A05;
            obj5 = this.A04;
            obj2 = this.A03;
            z = this.A07;
            i = 1;
        } else {
            z = this.A07;
            obj2 = this.A03;
            obj3 = this.A05;
            obj4 = this.A02;
            obj5 = this.A04;
            i = 0;
        }
        KtSLambdaShape0S0611000_I2 ktSLambdaShape0S0611000_I2 = new KtSLambdaShape0S0611000_I2(obj6, obj2, obj3, obj4, obj5, r6, i, z);
        ktSLambdaShape0S0611000_I2.A06 = obj;
        return ktSLambdaShape0S0611000_I2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.A08
            if (r1 == 0) goto L_0x004a
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0015
            java.lang.Object r9 = r0.A06
            X.4qz r9 = (X.C83224qz) r9
            X.AnonymousClass0OU.A00(r19)     // Catch:{ CancellationException -> 0x0042 }
            goto L_0x0054
        L_0x0015:
            X.AnonymousClass0OU.A00(r19)
            java.lang.Object r9 = r0.A06
            X.4qz r9 = (X.C83224qz) r9
            java.lang.Object r2 = r0.A01     // Catch:{ CancellationException -> 0x0042 }
            X.8py r2 = (X.C147818py) r2     // Catch:{ CancellationException -> 0x0042 }
            java.lang.Object r6 = r0.A02     // Catch:{ CancellationException -> 0x0042 }
            X.4oM r6 = (X.C81784oM) r6     // Catch:{ CancellationException -> 0x0042 }
            java.lang.Object r7 = r0.A05     // Catch:{ CancellationException -> 0x0042 }
            X.4oM r7 = (X.C81784oM) r7     // Catch:{ CancellationException -> 0x0042 }
            java.lang.Object r5 = r0.A04     // Catch:{ CancellationException -> 0x0042 }
            X.66l r5 = (X.C967266l) r5     // Catch:{ CancellationException -> 0x0042 }
            java.lang.Object r10 = r0.A03     // Catch:{ CancellationException -> 0x0042 }
            X.4wD r10 = (X.C86064wD) r10     // Catch:{ CancellationException -> 0x0042 }
            boolean r11 = r0.A07     // Catch:{ CancellationException -> 0x0042 }
            r8 = 0
            androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1 r4 = new androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1     // Catch:{ CancellationException -> 0x0042 }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ CancellationException -> 0x0042 }
            r0.A06 = r9     // Catch:{ CancellationException -> 0x0042 }
            r0.A00 = r3     // Catch:{ CancellationException -> 0x0042 }
            java.lang.Object r0 = r2.AA6(r0, r4)     // Catch:{ CancellationException -> 0x0042 }
            goto L_0x00c3
        L_0x0042:
            r1 = move-exception
            boolean r0 = X.AnonymousClass7Ja.A06(r9)
            if (r0 != 0) goto L_0x0054
            throw r1
        L_0x004a:
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r0.A00
            r11 = 1
            if (r2 == 0) goto L_0x0057
            X.AnonymousClass0OU.A00(r19)
        L_0x0054:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x0057:
            X.AnonymousClass0OU.A00(r19)
            java.lang.Object r9 = r0.A06
            X.8py r9 = (X.C147818py) r9
            java.lang.Object r7 = r0.A01
            X.8pE r7 = (X.C147368pE) r7
            r2 = r9
            X.6bK r2 = (X.C104156bK) r2
            X.8mM r2 = r2.A00
            if (r2 == 0) goto L_0x00c6
            long r5 = r2.BCI()
        L_0x006d:
            r8 = 32
            long r2 = r5 >> r8
            int r4 = (int) r2
            int r3 = r4 >> 1
            int r2 = X.C86104wH.A08(r5)
            int r2 = r2 >> 1
            long r5 = X.AnonymousClass7Hh.A00(r3, r2)
            long r3 = r5 >> r8
            int r2 = (int) r3
            float r3 = (float) r2
            int r2 = X.C86104wH.A08(r5)
            float r2 = (float) r2
            long r2 = X.C86104wH.A0C(r3, r2)
            X.7KC r2 = X.C86124wJ.A0O(r2)
            r7.CrC(r2)
            boolean r4 = r0.A07
            java.lang.Object r13 = r0.A03
            X.8p3 r13 = (X.C147258p3) r13
            java.lang.Object r14 = r0.A05
            X.8pE r14 = (X.C147368pE) r14
            java.lang.Object r15 = r0.A02
            X.4oM r15 = (X.C81784oM) r15
            r10 = 0
            androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1 r6 = new androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1
            r12 = r6
            r16 = r10
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Object r3 = r0.A04
            r2 = 0
            kotlin.jvm.internal.KtLambdaShape5S0110000_I2 r8 = new kotlin.jvm.internal.KtLambdaShape5S0110000_I2
            r8.<init>(r2, r3, r4)
            r0.A00 = r11
            androidx.compose.foundation.gestures.PressGestureScopeImpl r7 = new androidx.compose.foundation.gestures.PressGestureScopeImpl
            r7.<init>(r9)
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (X.C146958n9) r10, (int) r11)
            java.lang.Object r0 = X.AnonymousClass7Ja.A00(r1, r0, r5)
        L_0x00c3:
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x00c6:
            r5 = 0
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S0611000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S0611000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
