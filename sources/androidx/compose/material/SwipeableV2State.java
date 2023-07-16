package androidx.compose.material;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass2BN;
import X.AnonymousClass4WJ;
import X.AnonymousClass6ZN;
import X.AnonymousClass7UO;
import X.AnonymousClass7WR;
import X.C04220Ms;
import X.C123267Wf;
import X.C142638fL;
import X.C142698fR;
import X.C147168nV;
import X.C147368pE;
import X.C18180wK;
import X.C18190wL;
import X.C18240wQ;
import X.C81784oM;
import X.C86104wH;
import X.C86124wJ;
import X.C86154wM;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Map;

public final class SwipeableV2State {
    public C147168nV A00;
    public final float A01;
    public final C142638fL A02;
    public final C142698fR A03;
    public final C147368pE A04;
    public final C147368pE A05;
    public final C147368pE A06;
    public final C147368pE A07;
    public final C147368pE A08;
    public final C81784oM A09;
    public final C81784oM A0A;
    public final C81784oM A0B;
    public final C81784oM A0C = C123267Wf.A01(C86154wM.A13(this, 7));
    public final AnonymousClass0YY A0D;
    public final AnonymousClass0YP A0E;

    public /* synthetic */ SwipeableV2State(C142638fL r5, Object obj, AnonymousClass0YY r7, float f) {
        AnonymousClass0YP r0 = AnonymousClass6ZN.A01;
        this.A02 = r5;
        this.A0D = r7;
        this.A0E = r0;
        this.A01 = f;
        AnonymousClass7WR r3 = AnonymousClass7WR.A00;
        this.A06 = C86104wH.A0I(r3, obj, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A08 = C86104wH.A0I(r3, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0B = C123267Wf.A01(C86154wM.A13(this, 6));
        this.A07 = C86104wH.A0I(r3, C86124wJ.A0g(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0A = C123267Wf.A01(C86154wM.A13(this, 5));
        this.A09 = C123267Wf.A01(C86154wM.A13(this, 4));
        this.A05 = C86104wH.A0I(r3, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = new AnonymousClass7UO(C86154wM.A0z(this, 49));
        this.A04 = C86104wH.A0I(r3, AnonymousClass4WJ.A0A(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public static final Object A00(SwipeableV2State swipeableV2State, Object obj, float f, float f2) {
        boolean z;
        Object A002;
        float A012;
        Map A0t = C86154wM.A0t(swipeableV2State.A04);
        Float f3 = (Float) A0t.get(obj);
        C147168nV r4 = swipeableV2State.A00;
        if (r4 != null) {
            float CxL = r4.CxL(swipeableV2State.A01);
            if (!C04220Ms.A0G(f3, f) && f3 != null) {
                float floatValue = f3.floatValue();
                if (floatValue < f) {
                    z = true;
                    if (f2 < CxL) {
                        A002 = AnonymousClass2BN.A00(A0t, f, true);
                        A012 = Math.abs(floatValue + Math.abs(C18240wQ.A00(swipeableV2State.A0E.invoke(r4, Float.valueOf(C86124wJ.A01(C18240wQ.A00(AnonymousClass4WJ.A07(A002, A0t)), floatValue))))));
                    }
                    return AnonymousClass2BN.A00(A0t, f, z);
                }
                z = false;
                if (f2 > (-CxL)) {
                    A002 = AnonymousClass2BN.A00(A0t, f, false);
                    A012 = C86124wJ.A01(floatValue, Math.abs(C18240wQ.A00(swipeableV2State.A0E.invoke(r4, Float.valueOf(C86124wJ.A01(floatValue, C18240wQ.A00(AnonymousClass4WJ.A07(A002, A0t))))))));
                    if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f = Math.abs(f);
                    } else if (f > A012) {
                        return obj;
                    } else {
                        return A002;
                    }
                }
                return AnonymousClass2BN.A00(A0t, f, z);
                if (f < A012) {
                    return obj;
                }
                return A002;
            }
            return obj;
        }
        StringBuilder A0s = C18190wL.A0s("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=");
        A0s.append(swipeableV2State);
        throw C18190wL.A0a(C18180wK.A0i(" SwipeableState?", A0s));
    }

    public final float A01() {
        Number number = (Number) this.A08.getValue();
        if (number != null) {
            return number.floatValue();
        }
        throw C18180wK.A0a("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.Object r16, X.C146958n9 r17, float r18) {
        /*
            r15 = this;
            r3 = 12
            r4 = r17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r4)
            r9 = r15
            if (r0 == 0) goto L_0x002c
            r5 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r7 = 1056964608(0x3f000000, float:0.5)
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 != r3) goto L_0x0035
            java.lang.Object r5 = r5.A01
            androidx.compose.material.SwipeableV2State r5 = (androidx.compose.material.SwipeableV2State) r5
            goto L_0x0031
        L_0x002c:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r5 = X.C86164wN.A0n(r15, r4, r3)
            goto L_0x0019
        L_0x0031:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ all -> 0x00ae }
            goto L_0x0063
        L_0x0035:
            java.lang.IllegalStateException r6 = X.AnonymousClass0wJ.A0a()
            throw r6
        L_0x003a:
            X.AnonymousClass0OU.A00(r1)
            X.8pE r0 = r15.A04
            java.util.Map r0 = X.C86154wM.A0t(r0)
            r10 = r16
            java.lang.Object r11 = r0.get(r10)
            if (r11 == 0) goto L_0x00f7
            X.8fR r1 = r15.A03     // Catch:{ all -> 0x00ab }
            r12 = 0
            r14 = 4
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0301001_I2 r8 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0301001_I2     // Catch:{ all -> 0x00ab }
            r13 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00ab }
            r5.A01 = r15     // Catch:{ all -> 0x00ab }
            r5.A00 = r3     // Catch:{ all -> 0x00ab }
            X.66k r0 = X.C967166k.Default     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = r1.AIb(r0, r5, r8)     // Catch:{ all -> 0x00ab }
            if (r0 == r4) goto L_0x00fe
            r5 = r15
        L_0x0063:
            X.8pE r0 = r5.A05
            r0.CrC(r2)
            float r4 = r5.A01()
            X.8pE r0 = r5.A04
            java.util.Iterator r3 = X.C86114wI.A0u(r0)
        L_0x0072:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r1 = r3.next()
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r0 = X.C86124wJ.A01(r0, r4)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r0 = X.C86124wJ.A1X(r0)
            if (r0 == 0) goto L_0x0072
        L_0x0093:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L_0x009b
            java.lang.Object r2 = r1.getKey()
        L_0x009b:
            if (r2 != 0) goto L_0x00a3
            X.8pE r0 = r5.A06
            java.lang.Object r2 = r0.getValue()
        L_0x00a3:
            X.8pE r0 = r5.A06
            r0.CrC(r2)
            goto L_0x00fc
        L_0x00a9:
            r1 = r2
            goto L_0x0093
        L_0x00ab:
            r6 = move-exception
            r5 = r15
            goto L_0x00af
        L_0x00ae:
            r6 = move-exception
        L_0x00af:
            X.8pE r0 = r5.A05
            r0.CrC(r2)
            float r4 = r5.A01()
            X.8pE r0 = r5.A04
            java.util.Iterator r3 = X.C86114wI.A0u(r0)
        L_0x00be:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r1 = r3.next()
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            float r0 = X.C86124wJ.A01(r0, r4)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r0 = X.C86124wJ.A1X(r0)
            if (r0 == 0) goto L_0x00be
        L_0x00df:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L_0x00e7
            java.lang.Object r2 = r1.getKey()
        L_0x00e7:
            if (r2 != 0) goto L_0x00ef
            X.8pE r0 = r5.A06
            java.lang.Object r2 = r0.getValue()
        L_0x00ef:
            X.8pE r0 = r5.A06
            r0.CrC(r2)
            throw r6
        L_0x00f5:
            r1 = r2
            goto L_0x00df
        L_0x00f7:
            X.8pE r0 = r15.A06
            r0.CrC(r10)
        L_0x00fc:
            kotlin.Unit r4 = kotlin.Unit.A00
        L_0x00fe:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableV2State.A02(java.lang.Object, X.8n9, float):java.lang.Object");
    }
}
