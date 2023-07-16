package androidx.compose.foundation.gestures;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.C146958n9;
import X.C18220wO;
import X.C39144Knq;
import X.C83224qz;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {100, 114, 129, 141, 156, 178}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
public final class TapGestureDetectorKt$detectTapGestures$2$1 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ PressGestureScopeImpl A06;
    public final /* synthetic */ AnonymousClass0YY A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ AnonymousClass0YY A09;
    public final /* synthetic */ AnonymousClass0YM A0A;
    public final /* synthetic */ C83224qz A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2$1(PressGestureScopeImpl pressGestureScopeImpl, C146958n9 r3, AnonymousClass0YY r4, AnonymousClass0YY r5, AnonymousClass0YY r6, AnonymousClass0YM r7, C83224qz r8) {
        super(2, r3);
        this.A0B = r8;
        this.A0A = r7;
        this.A08 = r4;
        this.A07 = r5;
        this.A09 = r6;
        this.A06 = pressGestureScopeImpl;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        C83224qz r7 = this.A0B;
        AnonymousClass0YM r6 = this.A0A;
        TapGestureDetectorKt$detectTapGestures$2$1 tapGestureDetectorKt$detectTapGestures$2$1 = new TapGestureDetectorKt$detectTapGestures$2$1(this.A06, r10, this.A08, this.A07, this.A09, r6, r7);
        tapGestureDetectorKt$detectTapGestures$2$1.A05 = obj;
        return tapGestureDetectorKt$detectTapGestures$2$1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (r3 == androidx.compose.foundation.gestures.TapGestureDetectorKt.A00) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        X.C25237DiI.A00((java.lang.Integer) null, (X.C27952Ew2) null, new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2(r13, r14, (X.C146958n9) null, r3, 11), r7, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        if (r1.A08 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        r2 = ((androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r0).A04.A05.At7();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        r9 = X.C86144wL.A17();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        r2 = 4611686018427387903L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r6 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0101000_I2(1, (X.C146958n9) null);
        r1.A05 = r0;
        r1.A02 = r14;
        r1.A03 = r9;
        r1.A04 = r9;
        r1.A01 = r2;
        r1.A00 = 2;
        r6 = r0.DBE(r1, r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        if (r6 == r4) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0092, code lost:
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r9.A00 = r6;
        r5 = r13.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if (r5 != null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        X.C25237DiI.A00((java.lang.Integer) null, (X.C27952Ew2) null, new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2(r1.A06, (X.C146958n9) null, 4), r1.A0B, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        ((X.C121197Es) r5).A01();
        X.C25237DiI.A00((java.lang.Integer) null, (X.C27952Ew2) null, new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2(r1.A06, (X.C146958n9) null, 5), r1.A0B, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d2, code lost:
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        X.C121197Es.A00(r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ef, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        X.C25237DiI.A00((java.lang.Integer) null, (X.C27952Ew2) null, new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2(r1.A06, (X.C146958n9) null, 3), r1.A0B, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0111, code lost:
        if (r1.A07 == null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0113, code lost:
        r0 = r1.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0115, code lost:
        if (r0 != null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0117, code lost:
        X.C121197Es.A00((X.C121197Es) r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011e, code lost:
        r1.A05 = r0;
        r1.A02 = r13;
        r1.A03 = null;
        r1.A04 = null;
        r1.A01 = r2;
        r1.A00 = 4;
        r6 = r0.DBF(r1, new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2((X.C121197Es) r8, (X.C146958n9) null), ((androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r0).A04.A05.Ads());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0141, code lost:
        if (r6 == r4) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0143, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0150, code lost:
        r5 = (X.C121197Es) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0153, code lost:
        if (r5 == null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0155, code lost:
        r0 = r1.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0157, code lost:
        if (r0 != null) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0159, code lost:
        r8 = r13.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015c, code lost:
        r14 = r1.A0B;
        r9 = r1.A06;
        X.C25237DiI.A00((java.lang.Integer) null, (X.C27952Ew2) null, X.C86164wN.A0o(r9, (X.C146958n9) null, 2), r14, 3);
        r7 = r1.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016d, code lost:
        if (r7 != androidx.compose.foundation.gestures.TapGestureDetectorKt.A00) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016f, code lost:
        X.C25237DiI.A00((java.lang.Integer) null, (X.C27952Ew2) null, new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2(r9, r5, (X.C146958n9) null, r7, 12), r14, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r8 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0601000_I2(r9, (X.C146958n9) null, r1.A07, r1.A09, r13, r14);
        r1.A05 = r0;
        r1.A02 = r13;
        r1.A03 = r5;
        r1.A00 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0197, code lost:
        if (r0.DBE(r1, r8, r2) == r4) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ab, code lost:
        r3 = r1.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ad, code lost:
        if (r3 != null) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01af, code lost:
        X.C121197Es.A00((X.C121197Es) r13.A00, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b6, code lost:
        r2 = r1.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b8, code lost:
        if (r2 != null) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ba, code lost:
        X.C121197Es.A00(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bd, code lost:
        r1.A05 = null;
        r1.A02 = null;
        r1.A03 = null;
        r1.A00 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ca, code lost:
        if (androidx.compose.foundation.gestures.TapGestureDetectorKt.A02(r0, r1) == r4) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01cc, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cd, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r14 = (X.C121197Es) r6;
        r14.A01();
        r7 = r1.A0B;
        r13 = r1.A06;
        X.C25237DiI.A00((java.lang.Integer) null, (X.C27952Ew2) null, X.C86164wN.A0o(r13, (X.C146958n9) null, 1), r7, 3);
        r3 = r1.A0A;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ef A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r6 = r22
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            r1 = r21
            int r0 = r1.A00
            r10 = 0
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0034;
                case 2: goto L_0x0094;
                case 3: goto L_0x00f0;
                case 4: goto L_0x0144;
                case 5: goto L_0x019a;
                default: goto L_0x000c;
            }
        L_0x000c:
            X.AnonymousClass0OU.A00(r6)
        L_0x000f:
            X.4qz r3 = r1.A0B
            androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r1.A06
            r1 = 3
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2
            r0.<init>(r2, r10, r1)
            X.C25237DiI.A00(r10, r10, r0, r3, r1)
        L_0x001c:
            kotlin.Unit r4 = kotlin.Unit.A00
        L_0x001e:
            return r4
        L_0x001f:
            X.AnonymousClass0OU.A00(r6)
            java.lang.Object r0 = r1.A05
            X.8pz r0 = (X.C147828pz) r0
            r1.A05 = r0
            r3 = 1
            r1.A00 = r3
            X.67C r2 = X.AnonymousClass67C.Main
            java.lang.Object r6 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r0, r2, r1, r3)
            if (r6 != r4) goto L_0x003a
            return r4
        L_0x0034:
            java.lang.Object r0 = r1.A05
            X.8pz r0 = X.C86164wN.A0H(r0, r6)
        L_0x003a:
            r14 = r6
            X.7Es r14 = (X.C121197Es) r14
            r14.A01()
            X.4qz r7 = r1.A0B
            androidx.compose.foundation.gestures.PressGestureScopeImpl r13 = r1.A06
            r5 = 1
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r2 = X.C86164wN.A0o(r13, r10, r5)
            r6 = 3
            X.C25237DiI.A00(r10, r10, r2, r7, r6)
            X.0YM r3 = r1.A0A
            X.0YM r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            if (r3 == r2) goto L_0x0060
            r17 = 11
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r12 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r15 = r10
            r16 = r3
            r12.<init>((androidx.compose.foundation.gestures.PressGestureScopeImpl) r13, (X.C121197Es) r14, (X.C146958n9) r15, (X.AnonymousClass0YM) r16, (int) r17)
            X.C25237DiI.A00(r10, r10, r12, r7, r6)
        L_0x0060:
            X.0YY r2 = r1.A08
            if (r2 == 0) goto L_0x0074
            r2 = r0
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r2
            X.54D r2 = r2.A04
            X.8lf r2 = r2.A05
            long r2 = r2.At7()
        L_0x006f:
            X.0MJ r9 = X.C86144wL.A17()
            goto L_0x007a
        L_0x0074:
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            goto L_0x006f
        L_0x007a:
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0101000_I2 r6 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0101000_I2     // Catch:{ 89x -> 0x00d5 }
            r6.<init>(r5, r10)     // Catch:{ 89x -> 0x00d5 }
            r1.A05 = r0     // Catch:{ 89x -> 0x00d5 }
            r1.A02 = r14     // Catch:{ 89x -> 0x00d5 }
            r1.A03 = r9     // Catch:{ 89x -> 0x00d5 }
            r1.A04 = r9     // Catch:{ 89x -> 0x00d5 }
            r1.A01 = r2     // Catch:{ 89x -> 0x00d5 }
            r5 = 2
            r1.A00 = r5     // Catch:{ 89x -> 0x00d5 }
            java.lang.Object r6 = r0.DBE(r1, r6, r2)     // Catch:{ 89x -> 0x00d5 }
            if (r6 == r4) goto L_0x001e
            r13 = r9
            goto L_0x00a9
        L_0x0094:
            long r2 = r1.A01
            java.lang.Object r9 = r1.A04
            X.0MJ r9 = (X.AnonymousClass0MJ) r9
            java.lang.Object r13 = r1.A03
            X.0MJ r13 = (X.AnonymousClass0MJ) r13
            java.lang.Object r14 = r1.A02
            X.7Es r14 = (X.C121197Es) r14
            java.lang.Object r0 = r1.A05
            X.8pz r0 = (X.C147828pz) r0
            X.AnonymousClass0OU.A00(r6)     // Catch:{ 89x -> 0x00d4 }
        L_0x00a9:
            r9.A00 = r6     // Catch:{ 89x -> 0x00d2 }
            java.lang.Object r5 = r13.A00     // Catch:{ 89x -> 0x00d2 }
            if (r5 != 0) goto L_0x00be
            X.4qz r8 = r1.A0B     // Catch:{ 89x -> 0x00d2 }
            androidx.compose.foundation.gestures.PressGestureScopeImpl r7 = r1.A06     // Catch:{ 89x -> 0x00d2 }
            r5 = 4
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r6 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2     // Catch:{ 89x -> 0x00d2 }
            r6.<init>(r7, r10, r5)     // Catch:{ 89x -> 0x00d2 }
            r5 = 3
            X.C25237DiI.A00(r10, r10, r6, r8, r5)     // Catch:{ 89x -> 0x00d2 }
            goto L_0x010b
        L_0x00be:
            X.7Es r5 = (X.C121197Es) r5     // Catch:{ 89x -> 0x00d2 }
            r5.A01()     // Catch:{ 89x -> 0x00d2 }
            X.4qz r8 = r1.A0B     // Catch:{ 89x -> 0x00d2 }
            androidx.compose.foundation.gestures.PressGestureScopeImpl r7 = r1.A06     // Catch:{ 89x -> 0x00d2 }
            r5 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r6 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2     // Catch:{ 89x -> 0x00d2 }
            r6.<init>(r7, r10, r5)     // Catch:{ 89x -> 0x00d2 }
            r5 = 3
            X.C25237DiI.A00(r10, r10, r6, r8, r5)     // Catch:{ 89x -> 0x00d2 }
            goto L_0x010b
        L_0x00d2:
            r9 = r13
            goto L_0x00d5
        L_0x00d4:
            r9 = r13
        L_0x00d5:
            X.0YY r5 = r1.A08
            if (r5 == 0) goto L_0x00dc
            X.C121197Es.A00(r14, r5)
        L_0x00dc:
            r1.A05 = r0
            r1.A02 = r9
            r1.A03 = r10
            r1.A04 = r10
            r1.A01 = r2
            r5 = 3
            r1.A00 = r5
            java.lang.Object r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A02(r0, r1)
            if (r5 != r4) goto L_0x00fc
            return r4
        L_0x00f0:
            long r2 = r1.A01
            java.lang.Object r9 = r1.A02
            X.0MJ r9 = (X.AnonymousClass0MJ) r9
            java.lang.Object r0 = r1.A05
            X.8pz r0 = X.C86164wN.A0H(r0, r6)
        L_0x00fc:
            X.4qz r8 = r1.A0B
            androidx.compose.foundation.gestures.PressGestureScopeImpl r7 = r1.A06
            r5 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r6 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2
            r6.<init>(r7, r10, r5)
            r5 = 3
            X.C25237DiI.A00(r10, r10, r6, r8, r5)
            r13 = r9
        L_0x010b:
            java.lang.Object r8 = r13.A00
            if (r8 == 0) goto L_0x001c
            X.0YY r5 = r1.A07
            if (r5 != 0) goto L_0x011e
            X.0YY r0 = r1.A09
            if (r0 == 0) goto L_0x001c
        L_0x0117:
            X.7Es r8 = (X.C121197Es) r8
            X.C121197Es.A00(r8, r0)
            goto L_0x001c
        L_0x011e:
            X.7Es r8 = (X.C121197Es) r8
            r1.A05 = r0
            r1.A02 = r13
            r1.A03 = r10
            r1.A04 = r10
            r1.A01 = r2
            r5 = 4
            r1.A00 = r5
            r5 = r0
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine r5 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine) r5
            X.54D r5 = r5.A04
            X.8lf r5 = r5.A05
            long r5 = r5.Ads()
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2 r7 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2
            r7.<init>(r8, r10)
            java.lang.Object r6 = r0.DBF(r1, r7, r5)
            if (r6 != r4) goto L_0x0150
            return r4
        L_0x0144:
            long r2 = r1.A01
            java.lang.Object r13 = r1.A02
            X.0MJ r13 = (X.AnonymousClass0MJ) r13
            java.lang.Object r0 = r1.A05
            X.8pz r0 = X.C86164wN.A0H(r0, r6)
        L_0x0150:
            r5 = r6
            X.7Es r5 = (X.C121197Es) r5
            if (r5 != 0) goto L_0x015c
            X.0YY r0 = r1.A09
            if (r0 == 0) goto L_0x001c
            java.lang.Object r8 = r13.A00
            goto L_0x0117
        L_0x015c:
            X.4qz r14 = r1.A0B
            androidx.compose.foundation.gestures.PressGestureScopeImpl r9 = r1.A06
            r6 = 2
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r6 = X.C86164wN.A0o(r9, r10, r6)
            r8 = 3
            X.C25237DiI.A00(r10, r10, r6, r14, r8)
            X.0YM r7 = r1.A0A
            X.0YM r6 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            if (r7 == r6) goto L_0x0181
            r20 = 12
            kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2 r15 = new kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2
            r16 = r9
            r17 = r5
            r18 = r10
            r19 = r7
            r15.<init>((androidx.compose.foundation.gestures.PressGestureScopeImpl) r16, (X.C121197Es) r17, (X.C146958n9) r18, (X.AnonymousClass0YM) r19, (int) r20)
            X.C25237DiI.A00(r10, r10, r15, r14, r8)
        L_0x0181:
            X.0YY r11 = r1.A07     // Catch:{ 89x -> 0x01ab }
            X.0YY r12 = r1.A09     // Catch:{ 89x -> 0x01ab }
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0601000_I2 r8 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0601000_I2     // Catch:{ 89x -> 0x01ab }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ 89x -> 0x01ab }
            r1.A05 = r0     // Catch:{ 89x -> 0x01ab }
            r1.A02 = r13     // Catch:{ 89x -> 0x01ab }
            r1.A03 = r5     // Catch:{ 89x -> 0x01ab }
            r6 = 5
            r1.A00 = r6     // Catch:{ 89x -> 0x01ab }
            java.lang.Object r0 = r0.DBE(r1, r8, r2)     // Catch:{ 89x -> 0x01ab }
            if (r0 != r4) goto L_0x001c
            goto L_0x01cd
        L_0x019a:
            java.lang.Object r5 = r1.A03
            X.7Es r5 = (X.C121197Es) r5
            java.lang.Object r13 = r1.A02
            X.0MJ r13 = (X.AnonymousClass0MJ) r13
            java.lang.Object r0 = r1.A05
            X.8pz r0 = (X.C147828pz) r0
            X.AnonymousClass0OU.A00(r6)     // Catch:{ 89x -> 0x01ab }
            goto L_0x001c
        L_0x01ab:
            X.0YY r3 = r1.A09
            if (r3 == 0) goto L_0x01b6
            java.lang.Object r2 = r13.A00
            X.7Es r2 = (X.C121197Es) r2
            X.C121197Es.A00(r2, r3)
        L_0x01b6:
            X.0YY r2 = r1.A08
            if (r2 == 0) goto L_0x01bd
            X.C121197Es.A00(r5, r2)
        L_0x01bd:
            r1.A05 = r10
            r1.A02 = r10
            r1.A03 = r10
            r2 = 6
            r1.A00 = r2
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A02(r0, r1)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x01cd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapGestures$2$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
