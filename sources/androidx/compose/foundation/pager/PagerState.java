package androidx.compose.foundation.pager;

import X.AnonymousClass00J;
import X.AnonymousClass00U;
import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass6EM;
import X.AnonymousClass74J;
import X.AnonymousClass7VH;
import X.AnonymousClass7WR;
import X.AnonymousClass8LB;
import X.AnonymousClass8WA;
import X.AnonymousClass8bI;
import X.AnonymousClass8cc;
import X.C115676vj;
import X.C123267Wf;
import X.C141738cs;
import X.C146258lv;
import X.C146958n9;
import X.C147158nU;
import X.C147168nV;
import X.C147368pE;
import X.C18190wL;
import X.C18240wQ;
import X.C81784oM;
import X.C86104wH;
import X.C86124wJ;
import X.C86144wL;
import X.C86154wM;
import X.C967166k;
import X.D0E;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import kotlin.Unit;

public final class PagerState implements C146258lv {
    public static final C141738cs A0C = AnonymousClass6EM.A00(AnonymousClass8LB.A00, AnonymousClass8WA.A00);
    public final float A00;
    public final int A01;
    public final AwaitLazyListStateSet A02;
    public final C147368pE A03;
    public final C147368pE A04;
    public final C147368pE A05;
    public final C147368pE A06;
    public final C147368pE A07;
    public final C81784oM A08;
    public final C81784oM A09;
    public final C81784oM A0A;
    public final C81784oM A0B;

    public static LazyListState A02(PagerState pagerState) {
        return (LazyListState) pagerState.A04.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(androidx.compose.foundation.pager.PagerState r6, X.C146958n9 r7) {
        /*
            r3 = 11
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x0055
            r5 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r1) goto L_0x003a
            if (r0 != r2) goto L_0x005a
            X.AnonymousClass0OU.A00(r4)
        L_0x0027:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x002a:
            X.AnonymousClass0OU.A00(r4)
            androidx.compose.foundation.pager.AwaitLazyListStateSet r0 = r6.A02
            r5.A01 = r6
            r5.A00 = r1
            java.lang.Object r0 = r0.A00(r5)
            if (r0 != r3) goto L_0x0041
            return r3
        L_0x003a:
            java.lang.Object r6 = r5.A01
            androidx.compose.foundation.pager.PagerState r6 = (androidx.compose.foundation.pager.PagerState) r6
            X.AnonymousClass0OU.A00(r4)
        L_0x0041:
            androidx.compose.foundation.lazy.LazyListState r0 = A02(r6)
            if (r0 == 0) goto L_0x005f
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r1 = r0.A08
            r0 = 0
            r5.A01 = r0
            r5.A00 = r2
            java.lang.Object r0 = r1.A00(r5)
            if (r0 != r3) goto L_0x0027
            return r3
        L_0x0055:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r5 = X.C86164wN.A0n(r6, r7, r3)
            goto L_0x0016
        L_0x005a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x005f:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.A04(androidx.compose.foundation.pager.PagerState, X.8n9):java.lang.Object");
    }

    public final int A05() {
        return AnonymousClass0wJ.A04(this.A09.getValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.C142638fL r22, X.C146958n9 r23, int r24) {
        /*
            r21 = this;
            r3 = r22
            r8 = r24
            r9 = 0
            r5 = r23
            boolean r0 = r5 instanceof X.C137838Ai
            r4 = r21
            if (r0 == 0) goto L_0x016f
            r7 = r5
            X.8Ai r7 = (X.C137838Ai) r7
            int r2 = r7.A03
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x016f
            int r2 = r2 - r1
            r7.A03 = r2
        L_0x001b:
            java.lang.Object r10 = r7.A06
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A03
            java.lang.String r14 = "Required value was null."
            r11 = 2
            r5 = 3
            r1 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 == r1) goto L_0x005c
            if (r0 == r11) goto L_0x0102
            if (r0 != r5) goto L_0x0176
            java.lang.Object r4 = r7.A04
            androidx.compose.foundation.pager.PagerState r4 = (androidx.compose.foundation.pager.PagerState) r4
            X.AnonymousClass0OU.A00(r10)
        L_0x0035:
            r1 = -1
            X.8pE r0 = r4.A03
            X.C147368pE.A03(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x003e:
            X.AnonymousClass0OU.A00(r10)
            int r0 = r4.A05()
            if (r8 != r0) goto L_0x004a
            kotlin.Unit r6 = kotlin.Unit.A00
        L_0x0049:
            return r6
        L_0x004a:
            r7.A04 = r4
            r7.A05 = r3
            r7.A01 = r8
            r7.A00 = r9
            r7.A03 = r1
            java.lang.Object r0 = A04(r4, r7)
            if (r0 == r6) goto L_0x0049
            r2 = 0
            goto L_0x006b
        L_0x005c:
            float r2 = r7.A00
            int r8 = r7.A01
            java.lang.Object r3 = r7.A05
            X.8fL r3 = (X.C142638fL) r3
            java.lang.Object r4 = r7.A04
            androidx.compose.foundation.pager.PagerState r4 = (androidx.compose.foundation.pager.PagerState) r4
            X.AnonymousClass0OU.A00(r10)
        L_0x006b:
            double r0 = (double) r2
            r12 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r9 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x0185
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 > 0) goto L_0x0185
            int r10 = r4.A05()
            int r9 = A00(r4, r8)
            X.8pE r0 = r4.A03
            X.C147368pE.A03(r0, r9)
            java.util.List r0 = X.C147158nU.A01(r4)
            java.lang.Object r0 = X.AnonymousClass00J.A0C(r0)
            X.8cc r0 = (X.AnonymousClass8cc) r0
            X.7VH r0 = (X.AnonymousClass7VH) r0
            int r12 = r0.A00
            java.util.List r0 = X.C147158nU.A01(r4)
            java.lang.Object r0 = X.AnonymousClass00J.A0E(r0)
            X.8cc r0 = (X.AnonymousClass8cc) r0
            X.7VH r0 = (X.AnonymousClass7VH) r0
            int r1 = r0.A00
            int r0 = r4.A05()
            if (r8 <= r0) goto L_0x00a9
            if (r8 > r1) goto L_0x00b1
        L_0x00a9:
            int r0 = r4.A05()
            if (r8 >= r0) goto L_0x0114
            if (r8 >= r12) goto L_0x0114
        L_0x00b1:
            int r0 = r4.A05()
            int r0 = r8 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r0 < r5) goto L_0x0114
            int r1 = r4.A05()
            java.util.List r0 = X.C147158nU.A01(r4)
            int r0 = r0.size()
            if (r8 <= r1) goto L_0x00fd
            int r8 = r8 - r0
            if (r8 >= r10) goto L_0x00cf
            r8 = r10
        L_0x00cf:
            androidx.compose.foundation.lazy.LazyListState r1 = A02(r4)
            if (r1 == 0) goto L_0x017b
            r17 = 0
            r7.A04 = r4
            r7.A05 = r3
            r7.A00 = r2
            r7.A01 = r9
            r7.A02 = r8
            r7.A03 = r11
            r19 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2 r15 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2
            r18 = r8
            r20 = r19
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            X.66k r0 = X.C967166k.Default
            java.lang.Object r0 = r1.CgB(r0, r7, r15)
            if (r0 == r6) goto L_0x00fa
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x00fa:
            if (r0 != r6) goto L_0x0113
            return r6
        L_0x00fd:
            if (r0 <= r10) goto L_0x0100
            r0 = r10
        L_0x0100:
            int r8 = r8 + r0
            goto L_0x00cf
        L_0x0102:
            int r8 = r7.A02
            int r9 = r7.A01
            float r2 = r7.A00
            java.lang.Object r3 = r7.A05
            X.8fL r3 = (X.C142638fL) r3
            java.lang.Object r4 = r7.A04
            androidx.compose.foundation.pager.PagerState r4 = (androidx.compose.foundation.pager.PagerState) r4
            X.AnonymousClass0OU.A00(r10)
        L_0x0113:
            r10 = r8
        L_0x0114:
            int r1 = r4.A06()
            X.8pE r12 = r4.A05
            java.lang.Object r0 = r12.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r1 = r1 + r0
            int r9 = r9 * r1
            int r1 = r4.A06()
            java.lang.Object r0 = r12.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r1 = r1 + r0
            int r10 = r10 * r1
            X.8cc r11 = A01(r4)
            if (r11 == 0) goto L_0x016d
            X.8nV r8 = A03(r4)
            X.8nU r1 = r4.A07()
            X.0YM r0 = X.AnonymousClass74J.A03
            float r8 = X.C115676vj.A00(r11, r1, r8, r0)
        L_0x0146:
            int r1 = r4.A06()
            java.lang.Object r0 = r12.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r1 = r1 + r0
            float r0 = (float) r1
            float r2 = r2 * r0
            float r8 = r8 + r2
            int r9 = r9 - r10
            float r2 = (float) r9
            float r2 = r2 + r8
            androidx.compose.foundation.lazy.LazyListState r1 = A02(r4)
            if (r1 == 0) goto L_0x0180
            r7.A04 = r4
            r0 = 0
            r7.A05 = r0
            r7.A03 = r5
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollExtensionsKt.A00(r3, r1, r7, r2)
            if (r0 != r6) goto L_0x0035
            return r6
        L_0x016d:
            r8 = 0
            goto L_0x0146
        L_0x016f:
            X.8Ai r7 = new X.8Ai
            r7.<init>(r4, r5)
            goto L_0x001b
        L_0x0176:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x017b:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r14)
            throw r0
        L_0x0180:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r14)
            throw r0
        L_0x0185:
            java.lang.String r1 = "pageOffsetFraction "
            java.lang.String r0 = " is not within the range -0.5 to 0.5"
            java.lang.String r0 = X.AnonymousClass00U.A0Q(r1, r0, r2)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.A08(X.8fL, X.8n9, int):java.lang.Object");
    }

    public PagerState(int i, float f) {
        this.A01 = i;
        this.A00 = f;
        double d = (double) f;
        if (-0.5d > d || d > 0.5d) {
            throw C18190wL.A0a(AnonymousClass00U.A0Q("initialPageOffsetFraction ", " is not within the range -0.5 to 0.5", f));
        }
        Float A0g = C86124wJ.A0g();
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        this.A07 = C86104wH.A0I(r2, A0g, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A04 = C86104wH.A0I(r2, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A05 = C86104wH.A0I(r2, 0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A02 = new AwaitLazyListStateSet();
        this.A09 = C123267Wf.A01(C86154wM.A12(this, 22));
        this.A03 = C86104wH.A0I(r2, C86144wL.A0b(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A06 = C86104wH.A0I(r2, Integer.valueOf(i), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0A = C123267Wf.A01(C86154wM.A12(this, 24));
        this.A0B = C123267Wf.A01(C86154wM.A12(this, 25));
        this.A08 = C123267Wf.A01(C86154wM.A12(this, 23));
    }

    public static final int A00(PagerState pagerState, int i) {
        if (pagerState.A07().BHd() > 0) {
            return AnonymousClass8bI.A02(i, 0, pagerState.A07().BHd() - 1);
        }
        return 0;
    }

    public static final AnonymousClass8cc A01(PagerState pagerState) {
        Object A0b;
        List A012 = C147158nU.A01(pagerState);
        if (A012.isEmpty()) {
            A0b = null;
        } else {
            A0b = C18240wQ.A0b(A012);
            C147168nV A032 = A03(pagerState);
            C147158nU A072 = pagerState.A07();
            AnonymousClass0YM r7 = AnonymousClass74J.A03;
            float f = -Math.abs(C115676vj.A00((AnonymousClass8cc) A0b, A072, A032, r7));
            int A0B2 = C86104wH.A0B(A012);
            int i = 1;
            if (1 <= A0B2) {
                while (true) {
                    Object obj = A012.get(i);
                    float f2 = -Math.abs(C115676vj.A00((AnonymousClass8cc) obj, pagerState.A07(), A03(pagerState), r7));
                    if (Float.compare(f, f2) < 0) {
                        A0b = obj;
                        f = f2;
                    }
                    if (i == A0B2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return (AnonymousClass8cc) A0b;
    }

    public static final C147168nV A03(PagerState pagerState) {
        C147168nV r0;
        LazyListState A022 = A02(pagerState);
        if (A022 == null || (r0 = (C147168nV) A022.A0E.getValue()) == null) {
            return AnonymousClass74J.A02;
        }
        return r0;
    }

    public final int A06() {
        AnonymousClass8cc r0 = (AnonymousClass8cc) AnonymousClass00J.A0D(C147158nU.A01(this));
        if (r0 != null) {
            return ((AnonymousClass7VH) r0).A02;
        }
        return 0;
    }

    public final C147158nU A07() {
        C147158nU A022;
        LazyListState A023 = A02(this);
        if (A023 == null || (A022 = A023.A02()) == null) {
            return AnonymousClass74J.A01;
        }
        return A022;
    }

    public final float AII(float f) {
        LazyListState A022 = A02(this);
        if (A022 != null) {
            return A022.A06.AII(f);
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final boolean AVn() {
        LazyListState A022 = A02(this);
        if (A022 != null) {
            return C86104wH.A1X(A022.A0C);
        }
        return true;
    }

    public final boolean AVo() {
        LazyListState A022 = A02(this);
        if (A022 != null) {
            return C86104wH.A1X(A022.A0D);
        }
        return true;
    }

    public final boolean BY9() {
        LazyListState A022 = A02(this);
        if (A022 != null) {
            return A022.A06.BY9();
        }
        return false;
    }

    public final Object CgB(C967166k r3, C146958n9 r4, AnonymousClass0YP r5) {
        Object CgB;
        LazyListState A022 = A02(this);
        if (A022 == null || (CgB = A022.CgB(r3, r4, r5)) != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return CgB;
    }

    public PagerState() {
        this(0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }
}
