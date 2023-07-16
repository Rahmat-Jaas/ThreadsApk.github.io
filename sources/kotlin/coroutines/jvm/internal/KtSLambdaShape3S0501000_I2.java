package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39144Knq;
import kotlin.Unit;

public class KtSLambdaShape3S0501000_I2 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013e, code lost:
        if (r2.A0A != false) goto L_0x0140;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01f1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f5 A[Catch:{ CancellationException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011a A[Catch:{ CancellationException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014f A[Catch:{ CancellationException -> 0x0155 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r9 = r14
            int r0 = r13.A06
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x00b7;
                case 2: goto L_0x015c;
                default: goto L_0x0008;
            }
        L_0x0008:
            int r0 = r13.A00
            r4 = 1
            if (r0 == 0) goto L_0x0018
            if (r0 != r4) goto L_0x0013
            X.AnonymousClass0OU.A00(r14)     // Catch:{ CancellationException -> 0x0034 }
            goto L_0x0040
        L_0x0013:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0018:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r3 = r13.A05
            X.8pz r3 = (X.C147828pz) r3
            java.lang.Object r2 = r13.A03     // Catch:{ CancellationException -> 0x0034 }
            X.4oM r2 = (X.C81784oM) r2     // Catch:{ CancellationException -> 0x0034 }
            java.lang.Object r1 = r13.A02     // Catch:{ CancellationException -> 0x0034 }
            X.4wD r1 = (X.C86064wD) r1     // Catch:{ CancellationException -> 0x0034 }
            java.lang.Object r0 = r13.A04     // Catch:{ CancellationException -> 0x0034 }
            X.4oM r0 = (X.C81784oM) r0     // Catch:{ CancellationException -> 0x0034 }
            r13.A00 = r4     // Catch:{ CancellationException -> 0x0034 }
            java.lang.Object r0 = com.instagram.barcelona.feed.mediaviewer.ui.Transformable150Kt.A00(r2, r0, r3, r13, r1)     // Catch:{ CancellationException -> 0x0034 }
            if (r0 != r6) goto L_0x0040
            return r6
        L_0x0034:
            r1 = move-exception
            java.lang.Object r0 = r13.A01     // Catch:{ all -> 0x004b }
            X.4qz r0 = (X.C83224qz) r0     // Catch:{ all -> 0x004b }
            boolean r0 = X.AnonymousClass7Ja.A06(r0)     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0040
            throw r1     // Catch:{ all -> 0x004b }
        L_0x0040:
            java.lang.Object r1 = r13.A02
            X.8m8 r1 = (X.C146368m8) r1
            X.5va r0 = X.C94495va.A00
            r1.D7w(r0)
            goto L_0x017d
        L_0x004b:
            r2 = move-exception
            java.lang.Object r1 = r13.A02
            X.8m8 r1 = (X.C146368m8) r1
            X.5va r0 = X.C94495va.A00
            r1.D7w(r0)
            throw r2
        L_0x0056:
            int r0 = r13.A00
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L_0x00aa
            if (r0 != r8) goto L_0x00b2
            java.lang.Object r0 = r13.A05
            X.8pz r0 = X.C86164wN.A0H(r0, r14)
        L_0x0064:
            X.6kM r9 = (X.C109656kM) r9
            int r2 = r9.A00
            r1 = 4
            if (r2 != r1) goto L_0x0094
            java.lang.Object r5 = r13.A04
            X.4qz r5 = (X.C83224qz) r5
            java.lang.Object r4 = r13.A03
            java.lang.Object r3 = r13.A02
            r1 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (X.C146958n9) r7, (int) r1)
            r1 = 3
            X.C25237DiI.A00(r7, r7, r2, r5, r1)
        L_0x007d:
            java.lang.Object r1 = r13.A01
            X.Ew2 r1 = (X.C27952Ew2) r1
            boolean r1 = X.AnonymousClass7C2.A02(r1)
            if (r1 == 0) goto L_0x017d
            r13.A05 = r0
            r13.A00 = r8
            X.67C r1 = X.AnonymousClass67C.Main
            java.lang.Object r9 = r0.AA5(r1, r13)
            if (r9 != r6) goto L_0x0064
            return r6
        L_0x0094:
            r1 = 5
            if (r2 != r1) goto L_0x007d
            java.lang.Object r5 = r13.A04
            X.4qz r5 = (X.C83224qz) r5
            java.lang.Object r4 = r13.A02
            java.lang.Object r3 = r13.A03
            r1 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2
            r2.<init>((java.lang.Object) r4, (java.lang.Object) r3, (X.C146958n9) r7, (int) r1)
            r1 = 3
            X.C25237DiI.A00(r7, r7, r2, r5, r1)
            goto L_0x007d
        L_0x00aa:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r0 = r13.A05
            X.8pz r0 = (X.C147828pz) r0
            goto L_0x007d
        L_0x00b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00b7:
            int r1 = r13.A00
            r5 = 3
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x00c7
            java.lang.Object r4 = r13.A05
            X.8pz r4 = (X.C147828pz) r4
            if (r1 == r0) goto L_0x00dc
            if (r1 == r2) goto L_0x00ee
            goto L_0x0111
        L_0x00c7:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A05
            X.8pz r4 = (X.C147828pz) r4
            r13.A05 = r4     // Catch:{ CancellationException -> 0x0155 }
            r13.A00 = r0     // Catch:{ CancellationException -> 0x0155 }
            r1 = 0
            X.67C r0 = X.AnonymousClass67C.Main     // Catch:{ CancellationException -> 0x0155 }
            java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r4, r0, r13, r1)     // Catch:{ CancellationException -> 0x0155 }
            if (r9 != r6) goto L_0x00df
            return r6
        L_0x00dc:
            X.AnonymousClass0OU.A00(r14)     // Catch:{ CancellationException -> 0x0155 }
        L_0x00df:
            X.7Es r9 = (X.C121197Es) r9     // Catch:{ CancellationException -> 0x0155 }
            long r0 = r9.A04     // Catch:{ CancellationException -> 0x0155 }
            r13.A05 = r4     // Catch:{ CancellationException -> 0x0155 }
            r13.A00 = r2     // Catch:{ CancellationException -> 0x0155 }
            java.lang.Object r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A01(r4, r13, r0)     // Catch:{ CancellationException -> 0x0155 }
            if (r9 != r6) goto L_0x00f1
            return r6
        L_0x00ee:
            X.AnonymousClass0OU.A00(r14)     // Catch:{ CancellationException -> 0x0155 }
        L_0x00f1:
            X.7Es r9 = (X.C121197Es) r9     // Catch:{ CancellationException -> 0x0155 }
            if (r9 == 0) goto L_0x017d
            java.lang.Object r0 = r13.A04     // Catch:{ CancellationException -> 0x0155 }
            X.0YY r0 = (X.AnonymousClass0YY) r0     // Catch:{ CancellationException -> 0x0155 }
            X.C121197Es.A00(r9, r0)     // Catch:{ CancellationException -> 0x0155 }
            long r1 = r9.A04     // Catch:{ CancellationException -> 0x0155 }
            java.lang.Object r3 = r13.A01     // Catch:{ CancellationException -> 0x0155 }
            r0 = 29
            kotlin.jvm.internal.KtLambdaShape145S0100000_I2 r0 = X.C86144wL.A16(r3, r0)     // Catch:{ CancellationException -> 0x0155 }
            r13.A05 = r4     // Catch:{ CancellationException -> 0x0155 }
            r13.A00 = r5     // Catch:{ CancellationException -> 0x0155 }
            java.lang.Object r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(r4, r13, r0, r1)     // Catch:{ CancellationException -> 0x0155 }
            if (r9 != r6) goto L_0x0114
            return r6
        L_0x0111:
            X.AnonymousClass0OU.A00(r14)     // Catch:{ CancellationException -> 0x0155 }
        L_0x0114:
            boolean r0 = X.AnonymousClass0wJ.A1X(r9)     // Catch:{ CancellationException -> 0x0155 }
            if (r0 == 0) goto L_0x014f
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r4 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r4     // Catch:{ CancellationException -> 0x0155 }
            X.54D r0 = r4.A04     // Catch:{ CancellationException -> 0x0155 }
            X.6kM r0 = r0.A01     // Catch:{ CancellationException -> 0x0155 }
            java.util.List r5 = r0.A03     // Catch:{ CancellationException -> 0x0155 }
            r4 = 0
            int r3 = r5.size()     // Catch:{ CancellationException -> 0x0155 }
        L_0x0127:
            if (r4 >= r3) goto L_0x0149
            X.7Es r2 = X.C86124wJ.A0P(r5, r4)     // Catch:{ CancellationException -> 0x0155 }
            r0 = 0
            X.C04220Ms.A0B(r2, r0)     // Catch:{ CancellationException -> 0x0155 }
            boolean r0 = r2.A02()     // Catch:{ CancellationException -> 0x0155 }
            if (r0 != 0) goto L_0x0140
            boolean r0 = r2.A0B     // Catch:{ CancellationException -> 0x0155 }
            if (r0 == 0) goto L_0x0140
            boolean r1 = r2.A0A     // Catch:{ CancellationException -> 0x0155 }
            r0 = 1
            if (r1 == 0) goto L_0x0141
        L_0x0140:
            r0 = 0
        L_0x0141:
            if (r0 == 0) goto L_0x0146
            r2.A01()     // Catch:{ CancellationException -> 0x0155 }
        L_0x0146:
            int r4 = r4 + 1
            goto L_0x0127
        L_0x0149:
            java.lang.Object r0 = r13.A03     // Catch:{ CancellationException -> 0x0155 }
            X.C18240wQ.A1G(r0)     // Catch:{ CancellationException -> 0x0155 }
            goto L_0x017d
        L_0x014f:
            java.lang.Object r0 = r13.A02     // Catch:{ CancellationException -> 0x0155 }
            X.C18240wQ.A1G(r0)     // Catch:{ CancellationException -> 0x0155 }
            goto L_0x017d
        L_0x0155:
            r2 = move-exception
            java.lang.Object r0 = r13.A02
            X.C18240wQ.A1G(r0)
            throw r2
        L_0x015c:
            int r0 = r13.A00
            r3 = 2
            r2 = 1
            r10 = 0
            if (r0 == 0) goto L_0x019c
            if (r0 == r2) goto L_0x01bf
            if (r0 != r3) goto L_0x01f2
            X.AnonymousClass0OU.A00(r14)
        L_0x016a:
            X.7Es r9 = (X.C121197Es) r9
            if (r9 != 0) goto L_0x0180
            java.lang.Object r3 = r13.A01
            X.4qz r3 = (X.C83224qz) r3
            java.lang.Object r0 = r13.A04
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2
            r1.<init>(r0, r10, r2)
            r0 = 3
            X.C25237DiI.A00(r10, r10, r1, r3, r0)
        L_0x017d:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x0180:
            r9.A01()
            java.lang.Object r2 = r13.A01
            X.4qz r2 = (X.C83224qz) r2
            java.lang.Object r0 = r13.A04
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2
            r1.<init>(r0, r10, r3)
            r0 = 3
            X.C25237DiI.A00(r10, r10, r1, r2, r0)
            java.lang.Object r0 = r13.A03
            X.0YY r0 = (X.AnonymousClass0YY) r0
            if (r0 == 0) goto L_0x017d
            X.C121197Es.A00(r9, r0)
            goto L_0x017d
        L_0x019c:
            X.AnonymousClass0OU.A00(r14)
            java.lang.Object r4 = r13.A05
            X.8pz r4 = (X.C147828pz) r4
            java.lang.Object r5 = r13.A01
            X.4qz r5 = (X.C83224qz) r5
            java.lang.Object r1 = r13.A04
            r0 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r1, r10, r0)
            r0 = 3
            X.C25237DiI.A00(r10, r10, r1, r5, r0)
            r13.A05 = r4
            r13.A00 = r2
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r4, r0, r13, r2)
            if (r9 != r6) goto L_0x01c5
            return r6
        L_0x01bf:
            java.lang.Object r0 = r13.A05
            X.8pz r4 = X.C86164wN.A0H(r0, r14)
        L_0x01c5:
            X.7Es r9 = (X.C121197Es) r9
            r9.A01()
            java.lang.Object r11 = r13.A02
            X.0YM r11 = (X.AnonymousClass0YM) r11
            X.0YM r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            if (r11 == r0) goto L_0x01e5
            java.lang.Object r1 = r13.A01
            X.4qz r1 = (X.C83224qz) r1
            java.lang.Object r8 = r13.A04
            androidx.compose.foundation.gestures.PressGestureScopeImpl r8 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r8
            r12 = 10
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r7.<init>((androidx.compose.foundation.gestures.PressGestureScopeImpl) r8, (X.C121197Es) r9, (X.C146958n9) r10, (X.AnonymousClass0YM) r11, (int) r12)
            r0 = 3
            X.C25237DiI.A00(r10, r10, r7, r1, r0)
        L_0x01e5:
            r13.A05 = r10
            r13.A00 = r3
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(r4, r0, r13)
            if (r9 != r6) goto L_0x016a
            return r6
        L_0x01f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape3S0501000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape3S0501000_I2(Object obj, Object obj2, Object obj3, Object obj4, C146958n9 r6, int i) {
        super(2, r6);
        this.A06 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A01 = obj4;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        C146958n9 r5 = r9;
        switch (this.A06) {
            case 0:
                obj2 = this.A01;
                obj3 = this.A04;
                obj4 = this.A03;
                obj5 = this.A02;
                i = 0;
                break;
            case 1:
                obj3 = this.A04;
                obj4 = this.A03;
                obj5 = this.A02;
                obj2 = this.A01;
                i = 1;
                break;
            case 2:
                obj2 = this.A01;
                obj5 = this.A02;
                obj4 = this.A03;
                obj3 = this.A04;
                i = 2;
                break;
            default:
                obj4 = this.A03;
                obj5 = this.A02;
                obj3 = this.A04;
                obj2 = this.A01;
                i = 3;
                break;
        }
        KtSLambdaShape3S0501000_I2 ktSLambdaShape3S0501000_I2 = new KtSLambdaShape3S0501000_I2(obj4, obj5, obj3, obj2, r5, i);
        ktSLambdaShape3S0501000_I2.A05 = obj;
        return ktSLambdaShape3S0501000_I2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape3S0501000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
