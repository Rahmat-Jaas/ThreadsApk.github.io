package androidx.compose.foundation.lazy.layout;

import X.AnonymousClass0YP;
import X.C146598mV;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {137, 233}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
public final class LazyAnimateScrollKt$animateScrollToItem$2 extends C39142Kno implements AnonymousClass0YP {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ int A09;
    public final /* synthetic */ int A0A;
    public final /* synthetic */ C146598mV A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyAnimateScrollKt$animateScrollToItem$2(C146598mV r2, C146958n9 r3, int i, int i2) {
        super(2, r3);
        this.A09 = i;
        this.A0B = r2;
        this.A0A = i2;
    }

    public final C146958n9 create(Object obj, C146958n9 r6) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.A0B, r6, this.A09, this.A0A);
        lazyAnimateScrollKt$animateScrollToItem$2.A08 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097 A[Catch:{ 8A1 -> 0x0147 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            r33 = this;
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            r5 = r33
            int r0 = r5.A04
            r7 = 0
            r9 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r9) goto L_0x001f
            java.lang.Object r1 = r5.A08
            X.8fT r1 = (X.C142718fT) r1
            X.AnonymousClass0OU.A00(r34)
        L_0x0013:
            X.8mV r3 = r5.A0B
            int r2 = r5.A09
            int r0 = r5.A0A
            r3.CuQ(r1, r2, r0)
        L_0x001c:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x001f:
            int r0 = r5.A03
            float r11 = r5.A02
            float r14 = r5.A01
            float r8 = r5.A00
            java.lang.Object r6 = r5.A07
            X.0MZ r6 = (X.AnonymousClass0MZ) r6
            java.lang.Object r3 = r5.A06
            X.0MJ r3 = (X.AnonymousClass0MJ) r3
            java.lang.Object r2 = r5.A05
            X.0Mo r2 = (X.C04180Mo) r2
            java.lang.Object r1 = r5.A08
            X.8fT r1 = (X.C142718fT) r1
            goto L_0x012e
        L_0x0039:
            X.AnonymousClass0OU.A00(r34)
            java.lang.Object r1 = r5.A08
            X.8fT r1 = (X.C142718fT) r1
            int r6 = r5.A09
            float r0 = (float) r6
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r0 = X.C86114wI.A1S(r0)
            if (r0 == 0) goto L_0x018d
            X.8mV r10 = r5.A0B     // Catch:{ 8A1 -> 0x0147 }
            X.8nV r2 = r10.Acs()     // Catch:{ 8A1 -> 0x0147 }
            float r0 = X.AnonymousClass6a6.A02     // Catch:{ 8A1 -> 0x0147 }
            float r8 = r2.CxL(r0)     // Catch:{ 8A1 -> 0x0147 }
            X.8nV r2 = r10.Acs()     // Catch:{ 8A1 -> 0x0147 }
            float r0 = X.AnonymousClass6a6.A00     // Catch:{ 8A1 -> 0x0147 }
            float r14 = r2.CxL(r0)     // Catch:{ 8A1 -> 0x0147 }
            X.8nV r2 = r10.Acs()     // Catch:{ 8A1 -> 0x0147 }
            float r0 = X.AnonymousClass6a6.A01     // Catch:{ 8A1 -> 0x0147 }
            float r11 = r2.CxL(r0)     // Catch:{ 8A1 -> 0x0147 }
            X.0Mo r2 = new X.0Mo     // Catch:{ 8A1 -> 0x0147 }
            r2.<init>()     // Catch:{ 8A1 -> 0x0147 }
            r2.A00 = r9     // Catch:{ 8A1 -> 0x0147 }
            X.0MJ r3 = X.C86144wL.A17()     // Catch:{ 8A1 -> 0x0147 }
            r0 = 30
            X.7WW r0 = X.AnonymousClass6DW.A00(r7, r7, r0)     // Catch:{ 8A1 -> 0x0147 }
            r3.A00 = r0     // Catch:{ 8A1 -> 0x0147 }
            java.lang.Integer r0 = r10.BFe(r6)     // Catch:{ 8A1 -> 0x0147 }
            if (r0 != 0) goto L_0x0139
            int r0 = r10.Ain()     // Catch:{ 8A1 -> 0x0147 }
            boolean r0 = X.C86134wK.A1X(r6, r0)
            X.0MZ r6 = new X.0MZ     // Catch:{ 8A1 -> 0x0147 }
            r6.<init>()     // Catch:{ 8A1 -> 0x0147 }
            r6.A00 = r9     // Catch:{ 8A1 -> 0x0147 }
        L_0x0093:
            boolean r10 = r2.A00     // Catch:{ 8A1 -> 0x0147 }
            if (r10 == 0) goto L_0x001c
            X.8mV r10 = r5.A0B     // Catch:{ 8A1 -> 0x0147 }
            r19 = r10
            int r10 = r19.getItemCount()     // Catch:{ 8A1 -> 0x0147 }
            if (r10 <= 0) goto L_0x001c
            int r10 = r5.A09     // Catch:{ 8A1 -> 0x0147 }
            r18 = r10
            int r15 = r5.A0A     // Catch:{ 8A1 -> 0x0147 }
            r12 = r19
            float r10 = r12.AL4(r10, r15)     // Catch:{ 8A1 -> 0x0147 }
            float r12 = java.lang.Math.abs(r10)     // Catch:{ 8A1 -> 0x0147 }
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00bd
            float r10 = java.lang.Math.max(r12, r11)     // Catch:{ 8A1 -> 0x0147 }
            if (r0 != 0) goto L_0x00c1
            float r10 = -r10
            goto L_0x00c1
        L_0x00bd:
            float r10 = -r8
            if (r0 == 0) goto L_0x00c1
            r10 = r8
        L_0x00c1:
            java.lang.Object r12 = r3.A00     // Catch:{ 8A1 -> 0x0147 }
            X.7WW r12 = (X.AnonymousClass7WW) r12     // Catch:{ 8A1 -> 0x0147 }
            r16 = 0
            X.7WW r12 = X.AnonymousClass7WW.A00(r12)     // Catch:{ 8A1 -> 0x0147 }
            r3.A00 = r12     // Catch:{ 8A1 -> 0x0147 }
            X.0Ma r21 = new X.0Ma     // Catch:{ 8A1 -> 0x0147 }
            r21.<init>()     // Catch:{ 8A1 -> 0x0147 }
            java.lang.Object r12 = r3.A00     // Catch:{ 8A1 -> 0x0147 }
            X.7WW r12 = (X.AnonymousClass7WW) r12     // Catch:{ 8A1 -> 0x0147 }
            java.lang.Float r29 = X.C86154wM.A0W(r10)     // Catch:{ 8A1 -> 0x0147 }
            java.lang.Object r13 = r3.A00     // Catch:{ 8A1 -> 0x0147 }
            X.7WW r13 = (X.AnonymousClass7WW) r13     // Catch:{ 8A1 -> 0x0147 }
            java.lang.Object r13 = r13.A01()     // Catch:{ 8A1 -> 0x0147 }
            float r13 = X.C18240wQ.A00(r13)     // Catch:{ 8A1 -> 0x0147 }
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            boolean r13 = X.C18180wK.A1W(r13)
            r32 = 0
            if (r13 != 0) goto L_0x00f2
            r32 = 1
        L_0x00f2:
            boolean r28 = X.C18180wK.A1V(r0)
            X.8Jz r17 = new X.8Jz     // Catch:{ 8A1 -> 0x0147 }
            r25 = r14
            r26 = r18
            r27 = r15
            r20 = r2
            r22 = r6
            r23 = r3
            r24 = r10
            r18 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ 8A1 -> 0x0147 }
            r5.A08 = r1     // Catch:{ 8A1 -> 0x0147 }
            r5.A05 = r2     // Catch:{ 8A1 -> 0x0147 }
            r5.A06 = r3     // Catch:{ 8A1 -> 0x0147 }
            r5.A07 = r6     // Catch:{ 8A1 -> 0x0147 }
            r5.A00 = r8     // Catch:{ 8A1 -> 0x0147 }
            r5.A01 = r14     // Catch:{ 8A1 -> 0x0147 }
            r5.A02 = r11     // Catch:{ 8A1 -> 0x0147 }
            r5.A03 = r0     // Catch:{ 8A1 -> 0x0147 }
            r5.A04 = r9     // Catch:{ 8A1 -> 0x0147 }
            X.7Tu r27 = X.C122777Tu.A00(r16)     // Catch:{ 8A1 -> 0x0147 }
            r28 = r12
            r30 = r5
            r31 = r17
            java.lang.Object r10 = androidx.compose.animation.core.SuspendAnimationKt.A03(r27, r28, r29, r30, r31, r32)     // Catch:{ 8A1 -> 0x0147 }
            if (r10 != r4) goto L_0x0131
            goto L_0x018c
        L_0x012e:
            X.AnonymousClass0OU.A00(r34)     // Catch:{ 8A1 -> 0x0147 }
        L_0x0131:
            int r10 = r6.A00     // Catch:{ 8A1 -> 0x0147 }
            int r10 = r10 + 1
            r6.A00 = r10     // Catch:{ 8A1 -> 0x0147 }
            goto L_0x0093
        L_0x0139:
            int r6 = r0.intValue()     // Catch:{ 8A1 -> 0x0147 }
            java.lang.Object r2 = r3.A00     // Catch:{ 8A1 -> 0x0147 }
            X.7WW r2 = (X.AnonymousClass7WW) r2     // Catch:{ 8A1 -> 0x0147 }
            X.8A1 r0 = new X.8A1     // Catch:{ 8A1 -> 0x0147 }
            r0.<init>(r2, r6)     // Catch:{ 8A1 -> 0x0147 }
            throw r0     // Catch:{ 8A1 -> 0x0147 }
        L_0x0147:
            r2 = move-exception
            X.7WW r0 = r2.A01
            r6 = 0
            X.7WW r9 = X.AnonymousClass7WW.A00(r0)
            int r2 = r2.A00
            int r0 = r5.A0A
            int r2 = r2 + r0
            float r8 = (float) r2
            X.0Ma r3 = new X.0Ma
            r3.<init>()
            java.lang.Float r10 = X.C86154wM.A0W(r8)
            java.lang.Object r0 = r9.A01()
            float r0 = X.C18240wQ.A00(r0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r0 = X.C18180wK.A1W(r0)
            r13 = r0 ^ 1
            r0 = 3
            kotlin.jvm.internal.KtLambdaShape2S0200001_I2 r2 = new kotlin.jvm.internal.KtLambdaShape2S0200001_I2
            r2.<init>(r1, r3, r8, r0)
            r0 = 2
            r5.A08 = r1
            r5.A05 = r6
            r5.A06 = r6
            r5.A07 = r6
            r5.A04 = r0
            X.7Tu r8 = X.C122777Tu.A00(r6)
            r11 = r5
            r12 = r2
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A03(r8, r9, r10, r11, r12, r13)
            if (r0 != r4) goto L_0x0013
            return r4
        L_0x018c:
            return r4
        L_0x018d:
            java.lang.String r0 = "Index should be non-negative ("
            java.lang.String r0 = X.C86134wK.A0r(r0, r6)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
