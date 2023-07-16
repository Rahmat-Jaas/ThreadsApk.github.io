package androidx.compose.foundation.lazy;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass6EM;
import X.AnonymousClass7DV;
import X.AnonymousClass7Us;
import X.AnonymousClass7VJ;
import X.AnonymousClass7VW;
import X.AnonymousClass7WR;
import X.AnonymousClass7Y4;
import X.AnonymousClass7ZI;
import X.AnonymousClass84E;
import X.AnonymousClass8L9;
import X.AnonymousClass8W6;
import X.C04220Ms;
import X.C111656o6;
import X.C114086sf;
import X.C120987Dn;
import X.C121637Hc;
import X.C122837Ua;
import X.C141738cs;
import X.C142778fZ;
import X.C146258lv;
import X.C146958n9;
import X.C147158nU;
import X.C147258p3;
import X.C147298p7;
import X.C147368pE;
import X.C147478pP;
import X.C86104wH;
import X.C86134wK;
import X.C86144wL;
import X.C967166k;
import X.C97986Ds;
import X.D0E;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

public final class LazyListState implements C146258lv {
    public static final C141738cs A0L = AnonymousClass6EM.A00(AnonymousClass8L9.A00, AnonymousClass8W6.A00);
    public float A00;
    public int A01;
    public int A02;
    public C142778fZ A03;
    public boolean A04;
    public boolean A05;
    public final C146258lv A06;
    public final C147258p3 A07;
    public final AwaitFirstLayoutModifier A08;
    public final AnonymousClass7DV A09;
    public final AnonymousClass84E A0A;
    public final C111656o6 A0B;
    public final C147368pE A0C;
    public final C147368pE A0D;
    public final C147368pE A0E;
    public final C147368pE A0F;
    public final C147368pE A0G;
    public final C147368pE A0H;
    public final C147368pE A0I;
    public final C147478pP A0J;
    public final AnonymousClass7VW A0K;

    public final Object A03(int i, C146958n9 r6) {
        AnonymousClass7VW r1 = this.A0K;
        Object CgB = r1.A00.CgB(C967166k.Default, r6, new LazyAnimateScrollKt$animateScrollToItem$2(r1, (C146958n9) null, i, 0));
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (CgB != d0e) {
            CgB = Unit.A00;
        }
        if (CgB != d0e) {
            CgB = Unit.A00;
        }
        if (CgB != d0e) {
            return Unit.A00;
        }
        return CgB;
    }

    public final void A05(C147298p7 r6) {
        Snapshot A052;
        C04220Ms.A0B(r6, 0);
        AnonymousClass7DV r4 = this.A09;
        Snapshot A022 = C121637Hc.A02();
        try {
            A052 = A022.A05();
            AnonymousClass7DV.A00(r4, C97986Ds.A00(r6, r4.A00, ((C114086sf) r4.A02.getValue()).A00), AnonymousClass0wJ.A04(r4.A03.getValue()));
            C86144wL.A1N(A052);
            A022.A0A();
        } catch (Throwable th) {
            A022.A0A();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CgB(X.C967166k r7, X.C146958n9 r8, X.AnonymousClass0YP r9) {
        /*
            r6 = this;
            r3 = 3
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r8)
            if (r0 == 0) goto L_0x005a
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r4 = r5.A04
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r1) goto L_0x0039
            if (r0 != r2) goto L_0x0060
            X.AnonymousClass0OU.A00(r4)
        L_0x0026:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x0028:
            return r3
        L_0x0029:
            X.AnonymousClass0OU.A00(r4)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r0 = r6.A08
            X.C86114wI.A1J(r6, r7, r9, r5, r1)
            java.lang.Object r0 = r0.A00(r5)
            if (r0 == r3) goto L_0x0028
            r0 = r6
            goto L_0x0048
        L_0x0039:
            java.lang.Object r9 = r5.A03
            X.0YP r9 = (X.AnonymousClass0YP) r9
            java.lang.Object r7 = r5.A02
            X.66k r7 = (X.C967166k) r7
            java.lang.Object r0 = r5.A01
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            X.AnonymousClass0OU.A00(r4)
        L_0x0048:
            X.8lv r1 = r0.A06
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A03 = r0
            r5.A00 = r2
            java.lang.Object r0 = r1.CgB(r7, r5, r9)
            if (r0 != r3) goto L_0x0026
            return r3
        L_0x005a:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r5.<init>(r6, r8, r3)
            goto L_0x0015
        L_0x0060:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.CgB(X.66k, X.8n9, X.0YP):java.lang.Object");
    }

    public final int A00() {
        return ((C114086sf) this.A09.A02.getValue()).A00;
    }

    public final int A01() {
        return AnonymousClass0wJ.A04(this.A09.A03.getValue());
    }

    public final C147158nU A02() {
        return (C147158nU) this.A0F.getValue();
    }

    public final void A04(int i, int i2) {
        AnonymousClass7DV r1 = this.A09;
        AnonymousClass7DV.A00(r1, i, i2);
        r1.A00 = null;
        C120987Dn r12 = (C120987Dn) this.A0G.getValue();
        if (r12 != null) {
            r12.A07.clear();
            r12.A01 = AnonymousClass4WJ.A0A();
            r12.A00 = -1;
        }
        C86134wK.A1B(this.A0I);
    }

    public final float AII(float f) {
        return this.A06.AII(f);
    }

    public final boolean AVn() {
        return C86104wH.A1X(this.A0C);
    }

    public final boolean AVo() {
        return C86104wH.A1X(this.A0D);
    }

    public final boolean BY9() {
        return this.A06.BY9();
    }

    public LazyListState(int i, int i2) {
        this.A09 = new AnonymousClass7DV(i, i2);
        this.A0K = new AnonymousClass7VW(this);
        AnonymousClass7VJ r0 = AnonymousClass7VJ.A00;
        AnonymousClass7WR r5 = AnonymousClass7WR.A00;
        this.A0F = C86104wH.A0I(r5, r0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A07 = new AnonymousClass7Us();
        this.A0E = C86104wH.A0I(r5, new AnonymousClass7ZI(1.0f, 1.0f), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A06 = new C122837Ua(C86144wL.A16(this, 47));
        this.A04 = true;
        this.A01 = -1;
        this.A0I = C86104wH.A0I(r5, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0J = new AnonymousClass7Y4(this);
        this.A08 = new AwaitFirstLayoutModifier();
        this.A0G = C86104wH.A0I(r5, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0H = C86104wH.A0I(r5, new Constraints(Constraints.A01.A04(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE)), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0A = new AnonymousClass84E();
        this.A0D = C86104wH.A0I(r5, false, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0C = C86104wH.A0I(r5, false, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0B = new C111656o6();
    }

    public LazyListState() {
        this(0, 0);
    }
}
