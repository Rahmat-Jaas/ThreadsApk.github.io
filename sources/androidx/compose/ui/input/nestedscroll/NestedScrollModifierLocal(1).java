package androidx.compose.ui.input.nestedscroll;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass6ER;
import X.AnonymousClass6ES;
import X.AnonymousClass7KC;
import X.AnonymousClass7WR;
import X.C04220Ms;
import X.C102776Wm;
import X.C104176bM;
import X.C142998fw;
import X.C146088lc;
import X.C147368pE;
import X.C147488pQ;
import X.C147498pR;
import X.C18180wK;
import X.C83224qz;
import X.C86104wH;
import X.C86154wM;
import androidx.compose.ui.Modifier;

public final class NestedScrollModifierLocal implements C146088lc, C147498pR, C147488pQ {
    public final C147368pE A00 = C86104wH.A0I(AnonymousClass7WR.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final C146088lc A01;
    public final NestedScrollDispatcher A02;

    public NestedScrollModifierLocal(C146088lc r4, NestedScrollDispatcher nestedScrollDispatcher) {
        C04220Ms.A0B(r4, 2);
        this.A02 = nestedScrollDispatcher;
        this.A01 = r4;
        nestedScrollDispatcher.A01 = C86154wM.A13(this, 18);
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final void C7Y(C142998fw r3) {
        C04220Ms.A0B(r3, 0);
        Object AbB = r3.AbB(C102776Wm.A00);
        C147368pE r0 = this.A00;
        r0.CrC(AbB);
        this.A02.A00 = (NestedScrollModifierLocal) r0.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CBn(X.C146958n9 r12, long r13, long r15) {
        /*
            r11 = this;
            r7 = r13
            r9 = r15
            boolean r0 = r12 instanceof X.C137798Ad
            if (r0 == 0) goto L_0x007c
            r6 = r12
            X.8Ad r6 = (X.C137798Ad) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0014:
            java.lang.Object r5 = r6.A04
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r6.A00
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r0) goto L_0x004a
            if (r1 != r2) goto L_0x0082
            long r0 = r6.A01
            X.AnonymousClass0OU.A00(r5)
        L_0x0027:
            X.7HA r5 = (X.AnonymousClass7HA) r5
            long r2 = r5.A00
        L_0x002b:
            long r0 = X.AnonymousClass7HA.A01(r0, r2)
            X.7HA r3 = new X.7HA
            r3.<init>(r0)
        L_0x0034:
            return r3
        L_0x0035:
            X.AnonymousClass0OU.A00(r5)
            X.8lc r5 = r11.A01
            r6.A03 = r11
            r6.A01 = r13
            r6.A02 = r15
            r6.A00 = r0
            java.lang.Object r5 = r5.CBn(r6, r7, r9)
            if (r5 == r3) goto L_0x0034
            r4 = r11
            goto L_0x0055
        L_0x004a:
            long r9 = r6.A02
            long r7 = r6.A01
            java.lang.Object r4 = r6.A03
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r4 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal) r4
            X.AnonymousClass0OU.A00(r5)
        L_0x0055:
            X.7HA r5 = (X.AnonymousClass7HA) r5
            long r0 = r5.A00
            X.8pE r4 = r4.A00
            java.lang.Object r5 = r4.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r5 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal) r5
            if (r5 == 0) goto L_0x0079
            long r7 = X.AnonymousClass7HA.A01(r7, r0)
            long r9 = X.AnonymousClass7HA.A00(r9, r0)
            r4 = 0
            r6.A03 = r4
            r6.A01 = r0
            r6.A00 = r2
            java.lang.Object r5 = r5.CBn(r6, r7, r9)
            if (r5 != r3) goto L_0x0027
            return r3
        L_0x0079:
            long r2 = X.AnonymousClass7HA.A01
            goto L_0x002b
        L_0x007c:
            X.8Ad r6 = new X.8Ad
            r6.<init>(r11, r12)
            goto L_0x0014
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.CBn(X.8n9, long, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r2 == r8) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CBr(X.C146958n9 r10, long r11) {
        /*
            r9 = this;
            r7 = 2
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2.A00(r7, r10)
            if (r0 == 0) goto L_0x0075
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r6.A03
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 == r1) goto L_0x0035
            if (r0 != r7) goto L_0x007b
            long r3 = r6.A01
            X.AnonymousClass0OU.A00(r2)
        L_0x0027:
            X.7HA r2 = (X.AnonymousClass7HA) r2
            long r0 = r2.A00
            long r1 = X.AnonymousClass7HA.A01(r3, r0)
            X.7HA r0 = new X.7HA
            r0.<init>(r1)
            return r0
        L_0x0035:
            long r11 = r6.A01
            java.lang.Object r0 = r6.A02
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal) r0
            X.AnonymousClass0OU.A00(r2)
            goto L_0x0059
        L_0x003f:
            X.AnonymousClass0OU.A00(r2)
            X.8pE r0 = r9.A00
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal) r0
            if (r0 == 0) goto L_0x0071
            r6.A02 = r9
            r6.A01 = r11
            r6.A00 = r1
            java.lang.Object r2 = r0.CBr(r6, r11)
            if (r2 == r8) goto L_0x0070
            r0 = r9
        L_0x0059:
            X.7HA r2 = (X.AnonymousClass7HA) r2
            long r3 = r2.A00
        L_0x005d:
            X.8lc r5 = r0.A01
            long r1 = X.AnonymousClass7HA.A00(r11, r3)
            r0 = 0
            r6.A02 = r0
            r6.A01 = r3
            r6.A00 = r7
            java.lang.Object r2 = r5.CBr(r6, r1)
            if (r2 != r8) goto L_0x0027
        L_0x0070:
            return r8
        L_0x0071:
            long r3 = X.AnonymousClass7HA.A01
            r0 = r9
            goto L_0x005d
        L_0x0075:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2
            r6.<init>(r9, r10, r7)
            goto L_0x0015
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.CBr(X.8n9, long):java.lang.Object");
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public static final C83224qz A00(NestedScrollModifierLocal nestedScrollModifierLocal) {
        C83224qz r0;
        NestedScrollModifierLocal nestedScrollModifierLocal2 = (NestedScrollModifierLocal) nestedScrollModifierLocal.A00.getValue();
        if ((nestedScrollModifierLocal2 != null && (r0 = A00(nestedScrollModifierLocal2)) != null) || (r0 = nestedScrollModifierLocal.A02.A02) != null) {
            return r0;
        }
        throw C18180wK.A0a("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final C104176bM Aqd() {
        return C102776Wm.A00;
    }

    public final long CBp(long j, long j2, int i) {
        long j3;
        int i2 = i;
        long CBp = this.A01.CBp(j, j2, i2);
        NestedScrollModifierLocal nestedScrollModifierLocal = (NestedScrollModifierLocal) this.A00.getValue();
        if (nestedScrollModifierLocal != null) {
            j3 = nestedScrollModifierLocal.CBp(AnonymousClass7KC.A05(j, CBp), AnonymousClass7KC.A04(j2, CBp), i2);
        } else {
            j3 = AnonymousClass7KC.A03;
        }
        return AnonymousClass7KC.A05(CBp, j3);
    }

    public final long CBu(long j, int i) {
        long j2;
        NestedScrollModifierLocal nestedScrollModifierLocal = (NestedScrollModifierLocal) this.A00.getValue();
        if (nestedScrollModifierLocal != null) {
            j2 = nestedScrollModifierLocal.CBu(j, i);
        } else {
            j2 = AnonymousClass7KC.A03;
        }
        return AnonymousClass7KC.A05(j2, this.A01.CBu(AnonymousClass7KC.A04(j, j2), i));
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return this;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
