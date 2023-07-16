package com.instagram.compose.core;

import X.AnonymousClass00J;
import X.AnonymousClass0YY;
import X.AnonymousClass4WJ;
import X.AnonymousClass7Aj;
import X.AnonymousClass7UO;
import X.AnonymousClass7WR;
import X.C04220Ms;
import X.C142638fL;
import X.C142698fR;
import X.C146958n9;
import X.C147368pE;
import X.C18180wK;
import X.C80924mh;
import X.C84714tk;
import X.C86104wH;
import X.C86124wJ;
import X.C967166k;
import X.D0E;
import com.facebook.redex.IDxFlowShape250S0100000_1_I2;
import com.facebook.redex.IDxFlowShape253S0100000_4_I2;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0301001_I2;
import kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11;
import kotlin.jvm.internal.KtLambdaShape51S0100000_I2_31;

public final class SwipeableState {
    public float A00 = Float.POSITIVE_INFINITY;
    public float A01 = Float.NEGATIVE_INFINITY;
    public final C142638fL A02;
    public final C142698fR A03;
    public final C147368pE A04;
    public final C147368pE A05;
    public final C147368pE A06;
    public final C147368pE A07;
    public final C147368pE A08;
    public final C147368pE A09;
    public final C147368pE A0A;
    public final C147368pE A0B;
    public final C147368pE A0C;
    public final C147368pE A0D;
    public final AnonymousClass0YY A0E;
    public final C84714tk A0F = new IDxFlowShape253S0100000_4_I2((C84714tk) new IDxFlowShape250S0100000_1_I2(AnonymousClass7Aj.A02(new KtLambdaShape51S0100000_I2_31(this, 9)), 3), 49);

    public SwipeableState(C142638fL r8, Object obj, AnonymousClass0YY r10) {
        C04220Ms.A0B(r8, 2);
        this.A02 = r8;
        this.A0E = r10;
        AnonymousClass7WR r4 = AnonymousClass7WR.A00;
        this.A07 = C86104wH.A0I(r4, obj, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A08 = C86104wH.A0I(r4, C18180wK.A0X(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        Float A0g = C86124wJ.A0g();
        this.A09 = C86104wH.A0I(r4, A0g, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0A = C86104wH.A0I(r4, A0g, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A04 = C86104wH.A0I(r4, A0g, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A06 = C86104wH.A0I(r4, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A05 = C86104wH.A0I(r4, AnonymousClass4WJ.A0A(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0C = C86104wH.A0I(r4, C80924mh.A00, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0D = C86104wH.A0I(r4, A0g, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0B = C86104wH.A0I(r4, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = new AnonymousClass7UO(new KtLambdaShape156S0100000_I2_11(this, 22));
    }

    public static final Object A00(C142638fL r6, SwipeableState swipeableState, C146958n9 r8, float f) {
        Object AIb = swipeableState.A03.AIb(C967166k.Default, r8, new KtSLambdaShape1S0301001_I2(swipeableState, r6, (C146958n9) null, f, 5));
        if (AIb != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return AIb;
    }

    public static void A01(SwipeableState swipeableState, Map map, float f) {
        swipeableState.A07.CrC(AnonymousClass4WJ.A07(new Float(f), map));
        Float A052 = AnonymousClass00J.A05(map.keySet());
        C04220Ms.A0A(A052);
        swipeableState.A01 = A052.floatValue();
        Float A042 = AnonymousClass00J.A04(map.keySet());
        C04220Ms.A0A(A042);
        swipeableState.A00 = A042.floatValue();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:4|5|(1:(1:(1:(6:10|12|13|78|84|87)(2:14|15))(3:16|17|18))(3:19|84|87))(4:20|(2:22|(3:24|(1:26)|(1:28))(2:29|30))(2:31|(6:33|(6:35|(2:37|(2:39|(3:41|(3:42|(1:44)|45)|85)))|63|64|65|(3:67|82|83)(1:88))(8:48|(1:50)|51|(2:53|(2:55|(3:57|(3:58|(1:60)|61)|86)))|63|64|65|(0)(0))|47|64|65|(0)(0)))|84|87)|72|73|(1:75)|(1:77)|78|84|87) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0186 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0181 A[Catch:{ CancellationException -> 0x0185, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019e A[Catch:{ all -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a2 A[Catch:{ all -> 0x01a7 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.util.Map r12, java.util.Map r13, X.C146958n9 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C137808Ae
            if (r0 == 0) goto L_0x002e
            r4 = r14
            X.8Ae r4 = (X.C137808Ae) r4
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r4.A01 = r2
        L_0x0012:
            java.lang.Object r2 = r4.A04
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A01
            r8 = 3
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 == r1) goto L_0x004d
            if (r0 == r7) goto L_0x003e
            if (r0 != r8) goto L_0x0039
            float r6 = r4.A00
            java.lang.Object r13 = r4.A03
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r5 = r4.A02
            com.instagram.compose.core.SwipeableState r5 = (com.instagram.compose.core.SwipeableState) r5
            goto L_0x0034
        L_0x002e:
            X.8Ae r4 = new X.8Ae
            r4.<init>(r11, r14)
            goto L_0x0012
        L_0x0034:
            X.AnonymousClass0OU.A00(r2)     // Catch:{ all -> 0x01a7 }
            goto L_0x01a3
        L_0x0039:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x003e:
            float r6 = r4.A00
            java.lang.Object r13 = r4.A03
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r5 = r4.A02
            com.instagram.compose.core.SwipeableState r5 = (com.instagram.compose.core.SwipeableState) r5
            X.AnonymousClass0OU.A00(r2)     // Catch:{ CancellationException -> 0x0186 }
            goto L_0x01ad
        L_0x004d:
            X.AnonymousClass0OU.A00(r2)
            goto L_0x01b0
        L_0x0052:
            X.AnonymousClass0OU.A00(r2)
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x00a5
            java.util.Set r0 = r13.keySet()
            java.lang.Float r0 = X.AnonymousClass00J.A05(r0)
            float r0 = X.C86164wN.A02(r0)
            r11.A01 = r0
            java.util.Set r0 = r13.keySet()
            java.lang.Float r0 = X.AnonymousClass00J.A04(r0)
            float r0 = X.C86164wN.A02(r0)
            r11.A00 = r0
            X.8pE r0 = r11.A07
            java.lang.Object r0 = r0.getValue()
            java.lang.Float r0 = X.C120527Bg.A02(r0, r13)
            if (r0 == 0) goto L_0x009e
            float r5 = r0.floatValue()
            r4.A01 = r1
            X.8fR r2 = r11.A03
            r0 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0200001_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0200001_I2
            r1.<init>(r11, r0, r5)
            X.66k r0 = X.C967166k.Default
            java.lang.Object r0 = r2.AIb(r0, r4, r1)
            if (r0 == r3) goto L_0x009b
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x009b:
            if (r0 != r3) goto L_0x01b0
            return r3
        L_0x009e:
            java.lang.String r0 = "The initial value must have an associated anchor."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x00a5:
            boolean r0 = X.C04220Ms.A0I(r13, r12)
            if (r0 != 0) goto L_0x01b0
            r0 = -8388608(0xffffffffff800000, float:-Infinity)
            r11.A01 = r0
            r0 = 2139095040(0x7f800000, float:Infinity)
            r11.A00 = r0
            X.8pE r0 = r11.A06
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            r10 = 0
            if (r1 == 0) goto L_0x010a
            java.lang.Object r0 = r12.get(r1)
            java.lang.Float r0 = X.C120527Bg.A02(r0, r13)
            if (r0 != 0) goto L_0x016d
            java.util.Iterator r9 = X.C86154wM.A0s(r13)
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r10 = r9.next()
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0102
            float r0 = X.C18240wQ.A00(r10)
            float r6 = r1.floatValue()
            float r5 = X.C86124wJ.A01(r0, r6)
        L_0x00e8:
            java.lang.Object r2 = r9.next()
            float r0 = X.C18240wQ.A00(r2)
            float r1 = X.C86124wJ.A01(r0, r6)
            int r0 = java.lang.Float.compare(r5, r1)
            if (r0 <= 0) goto L_0x00fc
            r10 = r2
            r5 = r1
        L_0x00fc:
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x00e8
        L_0x0102:
            X.C04220Ms.A0A(r10)
            float r6 = X.C18240wQ.A00(r10)
            goto L_0x0171
        L_0x010a:
            X.8pE r6 = r11.A09
            java.lang.Object r0 = r6.getValue()
            java.lang.Object r0 = r12.get(r0)
            X.8pE r2 = r11.A07
            boolean r1 = X.C86124wJ.A1Y(r2, r0)
            if (r1 == 0) goto L_0x0120
            java.lang.Object r0 = r2.getValue()
        L_0x0120:
            java.lang.Float r0 = X.C120527Bg.A02(r0, r13)
            if (r0 != 0) goto L_0x016d
            java.util.Iterator r9 = X.C86154wM.A0s(r13)
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r10 = r9.next()
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0102
            float r1 = X.C18240wQ.A00(r10)
            java.lang.Object r0 = r6.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r5 = X.C86124wJ.A01(r1, r0)
        L_0x014a:
            java.lang.Object r2 = r9.next()
            float r1 = X.C18240wQ.A00(r2)
            java.lang.Object r0 = r6.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r1 = X.C86124wJ.A01(r1, r0)
            int r0 = java.lang.Float.compare(r5, r1)
            if (r0 <= 0) goto L_0x0166
            r10 = r2
            r5 = r1
        L_0x0166:
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x014a
            goto L_0x0102
        L_0x016d:
            float r6 = r0.floatValue()
        L_0x0171:
            X.8fL r0 = r11.A02     // Catch:{ CancellationException -> 0x0185, all -> 0x0182 }
            r4.A02 = r11     // Catch:{ CancellationException -> 0x0185, all -> 0x0182 }
            r4.A03 = r13     // Catch:{ CancellationException -> 0x0185, all -> 0x0182 }
            r4.A00 = r6     // Catch:{ CancellationException -> 0x0185, all -> 0x0182 }
            r4.A01 = r7     // Catch:{ CancellationException -> 0x0185, all -> 0x0182 }
            java.lang.Object r0 = A00(r0, r11, r4, r6)     // Catch:{ CancellationException -> 0x0185, all -> 0x0182 }
            if (r0 == r3) goto L_0x01b2
            goto L_0x01ac
        L_0x0182:
            r0 = move-exception
            r5 = r11
            goto L_0x01a8
        L_0x0185:
            r5 = r11
        L_0x0186:
            r4.A02 = r5     // Catch:{ all -> 0x01a7 }
            r4.A03 = r13     // Catch:{ all -> 0x01a7 }
            r4.A00 = r6     // Catch:{ all -> 0x01a7 }
            r4.A01 = r8     // Catch:{ all -> 0x01a7 }
            X.8fR r2 = r5.A03     // Catch:{ all -> 0x01a7 }
            r0 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0200001_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0200001_I2     // Catch:{ all -> 0x01a7 }
            r1.<init>(r5, r0, r6)     // Catch:{ all -> 0x01a7 }
            X.66k r0 = X.C967166k.Default     // Catch:{ all -> 0x01a7 }
            java.lang.Object r0 = r2.AIb(r0, r4, r1)     // Catch:{ all -> 0x01a7 }
            if (r0 == r3) goto L_0x01a0
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x01a7 }
        L_0x01a0:
            if (r0 != r3) goto L_0x01a3
            return r3
        L_0x01a3:
            A01(r5, r13, r6)
            goto L_0x01b0
        L_0x01a7:
            r0 = move-exception
        L_0x01a8:
            A01(r5, r13, r6)
            throw r0
        L_0x01ac:
            r5 = r11
        L_0x01ad:
            A01(r5, r13, r6)
        L_0x01b0:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x01b2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.core.SwipeableState.A02(java.util.Map, java.util.Map, X.8n9):java.lang.Object");
    }
}
