package androidx.compose.foundation.gestures;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.C146958n9;
import X.C18220wO;
import X.C39144Knq;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {176, 890, 940, 193}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "F$0", "F$1", "F$2"})
public final class DragGestureDetectorKt$detectDragGestures$5 extends C39144Knq implements AnonymousClass0YP {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public /* synthetic */ Object A0B;
    public final /* synthetic */ AnonymousClass0ZU A0C;
    public final /* synthetic */ AnonymousClass0ZU A0D;
    public final /* synthetic */ AnonymousClass0YY A0E;
    public final /* synthetic */ AnonymousClass0YP A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$5(C146958n9 r2, AnonymousClass0ZU r3, AnonymousClass0ZU r4, AnonymousClass0YY r5, AnonymousClass0YP r6) {
        super(2, r2);
        this.A0E = r5;
        this.A0F = r6;
        this.A0C = r3;
        this.A0D = r4;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        C146958n9 r1 = r8;
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(r1, this.A0C, this.A0D, this.A0E, this.A0F);
        dragGestureDetectorKt$detectDragGestures$5.A0B = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f2 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r7 = r26
            X.D0E r14 = X.D0E.COROUTINE_SUSPENDED
            r6 = r25
            int r1 = r6.A04
            r22 = 3
            r21 = 2
            r0 = 1
            r12 = 0
            if (r1 == 0) goto L_0x002e
            if (r1 == r0) goto L_0x0043
            r0 = r21
            if (r1 == r0) goto L_0x00a9
            r0 = r22
            if (r1 == r0) goto L_0x017f
            X.AnonymousClass0OU.A00(r7)
        L_0x001d:
            boolean r0 = X.AnonymousClass0wJ.A1X(r7)
            if (r0 != 0) goto L_0x002b
            X.0ZU r0 = r6.A0C
        L_0x0025:
            r0.invoke()
        L_0x0028:
            kotlin.Unit r14 = kotlin.Unit.A00
            return r14
        L_0x002b:
            X.0ZU r0 = r6.A0D
            goto L_0x0025
        L_0x002e:
            X.AnonymousClass0OU.A00(r7)
            java.lang.Object r3 = r6.A0B
            X.8pz r3 = (X.C147828pz) r3
            r6.A0B = r3
            r6.A04 = r0
            r1 = 0
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r7 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r3, r0, r6, r1)
            if (r7 != r14) goto L_0x0049
            return r14
        L_0x0043:
            java.lang.Object r0 = r6.A0B
            X.8pz r3 = X.C86164wN.A0H(r0, r7)
        L_0x0049:
            X.7Es r7 = (X.C121197Es) r7
            X.0MQ r8 = new X.0MQ
            r8.<init>()
            long r0 = X.AnonymousClass7KC.A03
            r8.A00 = r0
            long r0 = r7.A04
            int r9 = r7.A03
            X.8kv r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A01
            r2 = r3
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r2
            X.54D r5 = r2.A04
            X.6kM r2 = r5.A01
            boolean r2 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A05(r2, r0)
            if (r2 != 0) goto L_0x0028
            X.8lf r5 = r5.A05
            r2 = r21
            boolean r2 = X.AnonymousClass0wJ.A1T(r9, r2)
            float r11 = r5.BHh()
            if (r2 == 0) goto L_0x0078
            float r2 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00
            float r11 = r11 * r2
        L_0x0078:
            X.0MQ r9 = new X.0MQ
            r9.<init>()
            r9.A00 = r0
            r10 = 0
            r13 = 0
            r20 = r3
            r5 = 0
        L_0x0084:
            r0 = r20
            r6.A0B = r0
            r6.A05 = r7
            r6.A06 = r8
            r6.A07 = r3
            r6.A08 = r4
            r6.A09 = r9
            r6.A0A = r12
            r6.A03 = r13
            r6.A00 = r11
            r6.A01 = r5
            r6.A02 = r10
            r0 = r21
            r6.A04 = r0
            X.67C r0 = X.AnonymousClass67C.Main
            java.lang.Object r0 = r3.AA5(r0, r6)
            if (r0 != r14) goto L_0x00cd
            return r14
        L_0x00a9:
            float r10 = r6.A02
            float r5 = r6.A01
            float r11 = r6.A00
            int r13 = r6.A03
            java.lang.Object r9 = r6.A09
            X.0MQ r9 = (X.AnonymousClass0MQ) r9
            java.lang.Object r4 = r6.A08
            X.8kv r4 = (X.C145688kv) r4
            java.lang.Object r3 = r6.A07
            X.8pz r3 = (X.C147828pz) r3
            java.lang.Object r8 = r6.A06
            X.0MQ r8 = (X.AnonymousClass0MQ) r8
            java.lang.Object r1 = r6.A05
            X.7Es r1 = (X.C121197Es) r1
            java.lang.Object r0 = r6.A0B
            X.8pz r20 = X.C86164wN.A0H(r0, r7)
            r0 = r7
            r7 = r1
        L_0x00cd:
            X.6kM r0 = (X.C109656kM) r0
            java.util.List r0 = r0.A03
            r23 = r0
            int r19 = r23.size()
            r15 = 0
        L_0x00d8:
            r0 = r19
            if (r15 >= r0) goto L_0x00f2
            r0 = r23
            java.lang.Object r2 = r0.get(r15)
            r0 = r2
            X.7Es r0 = (X.C121197Es) r0
            long r0 = r0.A04
            r17 = r0
            long r0 = r9.A00
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x00f3
            int r15 = r15 + 1
            goto L_0x00d8
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            X.7Es r2 = (X.C121197Es) r2
            if (r2 == 0) goto L_0x0028
            boolean r0 = r2.A02()
            if (r0 != 0) goto L_0x0028
            boolean r0 = X.C121667Hg.A02(r2)
            if (r0 == 0) goto L_0x0125
            int r2 = r23.size()
            r1 = 0
        L_0x0108:
            if (r1 >= r2) goto L_0x011a
            r0 = r23
            java.lang.Object r15 = r0.get(r1)
            r0 = r15
            X.7Es r0 = (X.C121197Es) r0
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x011b
            int r1 = r1 + 1
            goto L_0x0108
        L_0x011a:
            r15 = 0
        L_0x011b:
            X.7Es r15 = (X.C121197Es) r15
            if (r15 == 0) goto L_0x0028
            long r0 = r15.A04
            r9.A00 = r0
            goto L_0x0084
        L_0x0125:
            long r0 = r2.A05
            r23 = r0
            long r15 = r2.A06
            float r18 = r4.BeQ(r0)
            r0 = r15
            float r0 = r4.BeQ(r0)
            float r18 = r18 - r0
            r0 = r23
            float r17 = r4.AGj(r0)
            r0 = r15
            float r0 = r4.AGj(r0)
            float r17 = r17 - r0
            float r5 = r5 + r18
            float r10 = r10 + r17
            if (r13 == 0) goto L_0x0176
            float r1 = java.lang.Math.abs(r5)
        L_0x014d:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ae
            X.67C r1 = X.AnonymousClass67C.Final
            r0 = r20
            r6.A0B = r0
            r6.A05 = r7
            r6.A06 = r8
            r6.A07 = r3
            r6.A08 = r4
            r6.A09 = r9
            r6.A0A = r2
            r6.A03 = r13
            r6.A00 = r11
            r6.A01 = r5
            r6.A02 = r10
            r0 = r22
            r6.A04 = r0
            java.lang.Object r0 = r3.AA5(r1, r6)
            if (r0 != r14) goto L_0x01a6
            return r14
        L_0x0176:
            long r0 = r4.Biq(r5, r10)
            float r1 = X.AnonymousClass7KC.A00(r0)
            goto L_0x014d
        L_0x017f:
            float r10 = r6.A02
            float r5 = r6.A01
            float r11 = r6.A00
            int r13 = r6.A03
            java.lang.Object r2 = r6.A0A
            X.7Es r2 = (X.C121197Es) r2
            java.lang.Object r9 = r6.A09
            X.0MQ r9 = (X.AnonymousClass0MQ) r9
            java.lang.Object r4 = r6.A08
            X.8kv r4 = (X.C145688kv) r4
            java.lang.Object r3 = r6.A07
            X.8pz r3 = (X.C147828pz) r3
            java.lang.Object r8 = r6.A06
            X.0MQ r8 = (X.AnonymousClass0MQ) r8
            java.lang.Object r1 = r6.A05
            X.7Es r1 = (X.C121197Es) r1
            java.lang.Object r0 = r6.A0B
            X.8pz r20 = X.C86164wN.A0H(r0, r7)
            r7 = r1
        L_0x01a6:
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0084
            goto L_0x0028
        L_0x01ae:
            if (r13 == 0) goto L_0x01fb
            float r0 = java.lang.Math.signum(r5)
            float r0 = r0 * r11
            float r5 = r5 - r0
            long r0 = r4.Biq(r5, r10)
        L_0x01ba:
            r2.A01()
            r8.A00 = r0
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0200
            X.0YY r1 = r6.A0E
            X.7KC r0 = X.C86124wJ.A0O(r23)
            r1.invoke(r0)
            X.0YP r3 = r6.A0F
            long r0 = r8.A00
            X.7KC r0 = X.C86124wJ.A0O(r0)
            r3.invoke(r2, r0)
            long r1 = r2.A04
            r0 = 28
            kotlin.jvm.internal.KtLambdaShape145S0100000_I2 r3 = X.C86144wL.A16(r3, r0)
            r6.A0B = r12
            r6.A05 = r12
            r6.A06 = r12
            r6.A07 = r12
            r6.A08 = r12
            r6.A09 = r12
            r6.A0A = r12
            r0 = 4
            r6.A04 = r0
            r0 = r20
            java.lang.Object r7 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(r0, r6, r3, r1)
            if (r7 != r14) goto L_0x001d
            return r14
        L_0x01fb:
            long r0 = X.AnonymousClass7FN.A01(r4, r5, r10, r1, r11)
            goto L_0x01ba
        L_0x0200:
            r10 = 0
            r5 = 0
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectDragGestures$5) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
