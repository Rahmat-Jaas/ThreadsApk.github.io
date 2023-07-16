package androidx.compose.foundation.gestures;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39144Knq;
import X.C81784oM;
import X.C83224qz;
import X.C86064wD;
import X.C967266l;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", i = {0, 0, 1, 1, 1}, l = {268, 276}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "velocityTracker", "$this$awaitPointerEventScope", "velocityTracker", "isDragSuccessful"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
public final class DraggableKt$draggable$9$3$1$1 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ C967266l A06;
    public final /* synthetic */ C81784oM A07;
    public final /* synthetic */ C81784oM A08;
    public final /* synthetic */ C83224qz A09;
    public final /* synthetic */ C86064wD A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$9$3$1$1(C967266l r2, C81784oM r3, C81784oM r4, C146958n9 r5, C83224qz r6, C86064wD r7, boolean z) {
        super(2, r5);
        this.A09 = r6;
        this.A07 = r3;
        this.A08 = r4;
        this.A06 = r2;
        this.A0A = r7;
        this.A0B = z;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        C83224qz r5 = this.A09;
        DraggableKt$draggable$9$3$1$1 draggableKt$draggable$9$3$1$1 = new DraggableKt$draggable$9$3$1$1(this.A06, this.A07, this.A08, r10, r5, this.A0A, this.A0B);
        draggableKt$draggable$9$3$1$1.A05 = obj;
        return draggableKt$draggable$9$3$1$1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:17|18|19|20|21|22|23|24|(1:26)|27|(2:29|46)|30|31|(0)(0)|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012e, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0135, code lost:
        r8.D7w(X.AnonymousClass52h.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0141 A[SYNTHETIC, Splitter:B:49:0x0141] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r26
            X.D0E r10 = X.D0E.COROUTINE_SUSPENDED
            r11 = r25
            int r2 = r11.A00
            r18 = 2
            r17 = 0
            r16 = 1
            r15 = 0
            if (r2 == 0) goto L_0x002f
            r0 = r16
            if (r2 == r0) goto L_0x0061
            boolean r5 = r11.A04
            java.lang.Object r9 = r11.A03
            X.4qz r9 = (X.C83224qz) r9
            java.lang.Object r8 = r11.A02
            X.8m8 r8 = (X.C146368m8) r8
            java.lang.Object r7 = r11.A01
            X.6rr r7 = (X.C113636rr) r7
            java.lang.Object r6 = r11.A05
            X.8pz r6 = (X.C147828pz) r6
            X.AnonymousClass0OU.A00(r1)     // Catch:{ CancellationException -> 0x002c, all -> 0x0144 }
            goto L_0x00ef
        L_0x002c:
            r1 = move-exception
            goto L_0x012f
        L_0x002f:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r6 = r11.A05
            X.8pz r6 = (X.C147828pz) r6
        L_0x0036:
            X.4qz r0 = r11.A09
            boolean r0 = X.AnonymousClass7Ja.A06(r0)
            if (r0 == 0) goto L_0x014b
            X.6rr r7 = new X.6rr
            r7.<init>()
            X.4oM r3 = r11.A07
            X.4oM r2 = r11.A08
            X.66l r1 = r11.A06
            r11.A05 = r6
            r11.A01 = r7
            r11.A02 = r15
            r11.A03 = r15
            r0 = r16
            r11.A00 = r0
            r0 = r1
            r1 = r3
            r3 = r6
            r4 = r7
            r5 = r11
            java.lang.Object r1 = androidx.compose.foundation.gestures.DraggableKt.A01(r0, r1, r2, r3, r4, r5)
            if (r1 != r10) goto L_0x006b
            return r10
        L_0x0061:
            java.lang.Object r7 = r11.A01
            X.6rr r7 = (X.C113636rr) r7
            java.lang.Object r0 = r11.A05
            X.8pz r6 = X.C86164wN.A0H(r0, r1)
        L_0x006b:
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 == 0) goto L_0x0036
            X.4wD r8 = r11.A0A
            boolean r5 = r11.A0B
            X.66l r0 = r11.A06
            r21 = r0
            X.4qz r9 = r11.A09
            java.lang.Object r4 = r1.A00     // Catch:{ CancellationException -> 0x012e, all -> 0x013f }
            X.7Es r4 = (X.C121197Es) r4     // Catch:{ CancellationException -> 0x012e, all -> 0x013f }
            java.lang.Object r0 = r1.A01     // Catch:{ CancellationException -> 0x012e, all -> 0x013f }
            X.7KC r0 = (X.AnonymousClass7KC) r0     // Catch:{ CancellationException -> 0x012e, all -> 0x013f }
            long r2 = r0.A00     // Catch:{ CancellationException -> 0x012e, all -> 0x013f }
            boolean r14 = X.C18180wK.A1V(r5)
            r11.A05 = r6     // Catch:{ CancellationException -> 0x012e, all -> 0x013f }
            r11.A01 = r7     // Catch:{ CancellationException -> 0x012e, all -> 0x013f }
            r11.A02 = r8     // Catch:{ CancellationException -> 0x012e, all -> 0x013f }
            r11.A03 = r9     // Catch:{ CancellationException -> 0x012e, all -> 0x013f }
            r11.A04 = r5     // Catch:{ CancellationException -> 0x012e, all -> 0x013f }
            r0 = r18
            r11.A00 = r0     // Catch:{ CancellationException -> 0x012e, all -> 0x013f }
            long r0 = r4.A05     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            r19 = r0
            float r0 = X.AnonymousClass7KC.A01(r19)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            float r13 = java.lang.Math.signum(r0)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            float r0 = X.AnonymousClass7KC.A02(r19)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            float r12 = java.lang.Math.signum(r0)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            float r1 = X.AnonymousClass7KC.A01(r2)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            float r1 = r1 * r13
            float r0 = X.AnonymousClass7KC.A02(r2)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            float r0 = r0 * r12
            long r12 = X.C86104wH.A0C(r1, r0)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            r0 = r19
            long r0 = X.AnonymousClass7KC.A04(r0, r12)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            X.52f r12 = new X.52f     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            r12.<init>(r0)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            r8.D7w(r12)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            if (r14 == 0) goto L_0x00cd
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            long r2 = X.AnonymousClass7KC.A03(r0, r2)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
        L_0x00cd:
            X.52e r0 = new X.52e     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            r0.<init>(r2)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            r8.D7w(r0)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            long r0 = r4.A04     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            kotlin.jvm.internal.KtLambdaShape5S0210000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape5S0210000_I2     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            r2 = r17
            r3.<init>(r2, r7, r8, r14)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            r19 = r21
            r20 = r6
            r21 = r11
            r22 = r3
            r23 = r0
            java.lang.Object r1 = androidx.compose.foundation.gestures.DraggableKt.A02(r19, r20, r21, r22, r23)     // Catch:{ CancellationException -> 0x012c, all -> 0x013f }
            if (r1 != r10) goto L_0x00ef
            goto L_0x013c
        L_0x00ef:
            boolean r0 = X.AnonymousClass0wJ.A1X(r1)     // Catch:{ CancellationException -> 0x012a, all -> 0x013d }
            if (r0 == 0) goto L_0x0123
            X.77t r0 = r7.A01
            float r1 = r0.A00()
            X.77t r0 = r7.A02
            float r0 = r0.A00()
            long r3 = X.C86104wH.A0C(r1, r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x010b
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x010b:
            float r1 = X.C86104wH.A00(r3)
            float r1 = r1 * r2
            int r0 = X.C86104wH.A08(r3)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 * r2
            long r0 = X.C86104wH.A0C(r1, r0)
            X.52g r2 = new X.52g
            r2.<init>(r0)
            goto L_0x0125
        L_0x0123:
            X.52h r2 = X.AnonymousClass52h.A00
        L_0x0125:
            r8.D7w(r2)
            goto L_0x0036
        L_0x012a:
            r1 = move-exception
            goto L_0x012f
        L_0x012c:
            r1 = move-exception
            goto L_0x012f
        L_0x012e:
            r1 = move-exception
        L_0x012f:
            boolean r0 = X.AnonymousClass7Ja.A06(r9)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0141
            X.52h r0 = X.AnonymousClass52h.A00
            r8.D7w(r0)
            goto L_0x0036
        L_0x013c:
            return r10
        L_0x013d:
            r1 = move-exception
            goto L_0x0145
        L_0x013f:
            r1 = move-exception
            goto L_0x0145
        L_0x0141:
            throw r1     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r1 = move-exception
            goto L_0x0145
        L_0x0144:
            r1 = move-exception
        L_0x0145:
            X.52h r0 = X.AnonymousClass52h.A00
            r8.D7w(r0)
            throw r1
        L_0x014b:
            kotlin.Unit r10 = kotlin.Unit.A00
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DraggableKt$draggable$9$3$1$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
