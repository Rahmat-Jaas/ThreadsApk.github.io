package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 79, 82}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* renamed from: X.8C3  reason: invalid class name */
public final class AnonymousClass8C3 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0YM A07;
    public final /* synthetic */ C83234r0 A08;
    public final /* synthetic */ C84714tk[] A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8C3(C146958n9 r2, AnonymousClass0ZU r3, AnonymousClass0YM r4, C83234r0 r5, C84714tk[] r6) {
        super(2, r2);
        this.A09 = r6;
        this.A06 = r3;
        this.A07 = r4;
        this.A08 = r5;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        C146958n9 r1 = r8;
        AnonymousClass8C3 r0 = new AnonymousClass8C3(r1, this.A06, this.A07, this.A08, this.A09);
        r0.A05 = obj;
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
        if (r1 == r9) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r20
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            r10 = r19
            int r0 = r10.A02
            r4 = 0
            r8 = 3
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0039
            int r4 = r10.A01
            int r5 = r10.A00
            java.lang.Object r2 = r10.A04
            byte[] r2 = (byte[]) r2
            java.lang.Object r13 = r10.A03
            X.Ewk r13 = (X.C27996Ewk) r13
            java.lang.Object r3 = r10.A05
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            if (r0 == r6) goto L_0x007a
            X.AnonymousClass0OU.A00(r1)
        L_0x0023:
            int r0 = r4 + 1
            byte r4 = (byte) r0
            r10.A05 = r3
            r10.A03 = r13
            r10.A04 = r2
            r10.A00 = r5
            r10.A01 = r4
            r10.A02 = r6
            java.lang.Object r1 = r13.CZG(r10)
            if (r1 != r9) goto L_0x0081
        L_0x0038:
            return r9
        L_0x0039:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r2 = r10.A05
            X.4qz r2 = (X.C83224qz) r2
            X.4tk[] r15 = r10.A09
            int r5 = r15.length
            if (r5 == 0) goto L_0x008a
            java.lang.Object[] r3 = new java.lang.Object[r5]
            X.Lr0 r0 = X.DIV.A02
            r1 = 0
            java.util.Arrays.fill(r3, r4, r5, r0)
            java.lang.Integer r11 = X.AnonymousClass006.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r0) goto L_0x0074
            X.Ena r13 = new X.Ena
            r13.<init>(r11, r5)
        L_0x0059:
            java.util.concurrent.atomic.AtomicInteger r14 = new java.util.concurrent.atomic.AtomicInteger
            r14.<init>(r5)
            r0 = 0
        L_0x005f:
            r18 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0302000_I2 r12 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0302000_I2
            r17 = r0
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.C25237DiI.A00(r1, r1, r12, r2, r8)
            int r0 = r0 + 1
            if (r0 < r5) goto L_0x005f
            byte[] r2 = new byte[r5]
            goto L_0x0023
        L_0x0074:
            X.EnY r13 = new X.EnY
            r13.<init>()
            goto L_0x0059
        L_0x007a:
            X.AnonymousClass0OU.A00(r1)
            X.7Eh r1 = (X.C121137Eh) r1
            java.lang.Object r1 = r1.A00
        L_0x0081:
            boolean r0 = r1 instanceof X.C111626o2
            if (r0 == 0) goto L_0x0086
            r1 = 0
        L_0x0086:
            X.3I2 r1 = (X.AnonymousClass3I2) r1
            if (r1 != 0) goto L_0x008d
        L_0x008a:
            kotlin.Unit r9 = kotlin.Unit.A00
            return r9
        L_0x008d:
            int r11 = r1.A00
            r12 = r3[r11]
            java.lang.Object r0 = r1.A01
            r3[r11] = r0
            X.Lr0 r0 = X.DIV.A02
            if (r12 != r0) goto L_0x009b
            int r5 = r5 + -1
        L_0x009b:
            byte r0 = r2[r11]
            if (r0 == r4) goto L_0x00af
            byte r0 = (byte) r4
            r2[r11] = r0
            java.lang.Object r1 = r13.D7u()
            boolean r0 = r1 instanceof X.C111626o2
            if (r0 == 0) goto L_0x00ab
            r1 = 0
        L_0x00ab:
            X.3I2 r1 = (X.AnonymousClass3I2) r1
            if (r1 != 0) goto L_0x008d
        L_0x00af:
            if (r5 != 0) goto L_0x0023
            X.0ZU r0 = r10.A06
            java.lang.Object r11 = r0.invoke()
            if (r11 != 0) goto L_0x00d2
            X.0YM r1 = r10.A07
            X.4r0 r0 = r10.A08
            r10.A05 = r3
            r10.A03 = r13
            r10.A04 = r2
            r10.A00 = r5
            r10.A01 = r4
            r10.A02 = r7
            java.lang.Object r0 = r1.invoke(r0, r3, r10)
            if (r0 == r9) goto L_0x0038
            r5 = 0
            goto L_0x0023
        L_0x00d2:
            int r1 = r3.length
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r11, r0, r1)
            X.0YM r1 = r10.A07
            X.4r0 r0 = r10.A08
            r10.A05 = r3
            r10.A03 = r13
            r10.A04 = r2
            r10.A00 = r5
            r10.A01 = r4
            r10.A02 = r8
            java.lang.Object r0 = r1.invoke(r0, r11, r10)
            if (r0 != r9) goto L_0x0023
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8C3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass8C3) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
