package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.7Wf  reason: invalid class name and case insensitive filesystem */
public final class C123267Wf implements C145738l0, C147358pD {
    public AnonymousClass53U A00 = new AnonymousClass53U();
    public final AnonymousClass0ZU A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r9.A00 != r9.A03(r10, r11)) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass53U A00(X.AnonymousClass53U r9, X.C123267Wf r10, androidx.compose.runtime.snapshots.Snapshot r11, X.AnonymousClass0ZU r12, boolean r13) {
        /*
            r5 = 1
            X.C04220Ms.A0B(r11, r5)
            java.lang.Object r1 = r9.A02
            java.lang.Object r0 = X.AnonymousClass53U.A03
            if (r1 == r0) goto L_0x0013
            int r2 = r9.A00
            int r1 = r9.A03(r10, r11)
            r0 = 1
            if (r2 == r1) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r4 = 0
            if (r0 == 0) goto L_0x008f
            if (r13 == 0) goto L_0x0139
            X.Lsi r0 = X.C1191373q.A01
            java.lang.Object r5 = r0.A00()
            X.84X r5 = (X.AnonymousClass84X) r5
            if (r5 != 0) goto L_0x0029
            kotlin.Pair[] r0 = new kotlin.Pair[r4]
            X.84X r5 = X.AnonymousClass84X.A01(r0)
        L_0x0029:
            int r3 = r5.A00
            if (r3 <= 0) goto L_0x003d
            java.lang.Object[] r2 = r5.A01
            r1 = 0
        L_0x0030:
            r0 = r2[r1]
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A00
            X.C86134wK.A1L(r0, r10)
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x0030
        L_0x003d:
            X.7EA r7 = r9.A01     // Catch:{ all -> 0x0086 }
            X.Lsi r6 = X.C1191373q.A00     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r6.A00()     // Catch:{ all -> 0x0086 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x004e
            int r8 = r0.intValue()     // Catch:{ all -> 0x0086 }
            goto L_0x004f
        L_0x004e:
            r8 = 0
        L_0x004f:
            if (r7 == 0) goto L_0x007d
            int r3 = r7.A00     // Catch:{ all -> 0x0086 }
            r2 = 0
        L_0x0054:
            if (r2 >= r3) goto L_0x007d
            java.lang.Object[] r0 = r7.A01     // Catch:{ all -> 0x0086 }
            r1 = r0[r2]     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
            X.C04220Ms.A0C(r1, r0)     // Catch:{ all -> 0x0086 }
            java.lang.Object[] r0 = r7.A02     // Catch:{ all -> 0x0086 }
            r0 = r0[r2]     // Catch:{ all -> 0x0086 }
            int r0 = X.AnonymousClass0wJ.A04(r0)     // Catch:{ all -> 0x0086 }
            X.8l0 r1 = (X.C145738l0) r1     // Catch:{ all -> 0x0086 }
            int r0 = r0 + r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0086 }
            r6.A01(r0)     // Catch:{ all -> 0x0086 }
            X.0YY r0 = r11.A08()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x007a
            r0.invoke(r1)     // Catch:{ all -> 0x0086 }
        L_0x007a:
            int r2 = r2 + 1
            goto L_0x0054
        L_0x007d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0086 }
            r6.A01(r0)     // Catch:{ all -> 0x0086 }
            goto L_0x0126
        L_0x0086:
            r3 = move-exception
            int r2 = r5.A00
            if (r2 <= 0) goto L_0x0154
            java.lang.Object[] r1 = r5.A01
            goto L_0x0146
        L_0x008f:
            X.Lsi r3 = X.C1191373q.A00
            java.lang.Object r0 = r3.A00()
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = X.C18210wN.A03(r0)
            r0 = 0
            X.7EA r7 = new X.7EA
            r7.<init>(r0, r4, r5)
            X.Lsi r0 = X.C1191373q.A01
            java.lang.Object r1 = r0.A00()
            X.84X r1 = (X.AnonymousClass84X) r1
            if (r1 != 0) goto L_0x00b1
            kotlin.Pair[] r0 = new kotlin.Pair[r4]
            X.84X r1 = X.AnonymousClass84X.A01(r0)
        L_0x00b1:
            int r8 = r1.A00
            if (r8 <= 0) goto L_0x00c5
            java.lang.Object[] r5 = r1.A01
            r2 = 0
        L_0x00b8:
            r0 = r5[r2]
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A00
            X.C86134wK.A1L(r0, r10)
            int r2 = r2 + 1
            if (r2 < r8) goto L_0x00b8
        L_0x00c5:
            int r0 = r6 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x013f }
            r3.A01(r0)     // Catch:{ all -> 0x013f }
            r8 = 2
            kotlin.jvm.internal.KtLambdaShape31S0201000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape31S0201000_I2     // Catch:{ all -> 0x013f }
            r0.<init>(r6, r8, r10, r7)     // Catch:{ all -> 0x013f }
            java.lang.Object r5 = X.C121637Hc.A03(r12, r0)     // Catch:{ all -> 0x013f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x013f }
            r3.A01(r0)     // Catch:{ all -> 0x013f }
            int r3 = r1.A00
            if (r3 <= 0) goto L_0x00f3
            java.lang.Object[] r2 = r1.A01
            r1 = 0
        L_0x00e6:
            r0 = r2[r1]
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A01
            X.C86134wK.A1L(r0, r10)
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x00e6
        L_0x00f3:
            java.lang.Object r2 = X.C122127Kl.A04
            monitor-enter(r2)
            androidx.compose.runtime.snapshots.Snapshot r1 = X.C122127Kl.A00()     // Catch:{ all -> 0x013c }
            X.53U r0 = r10.A00     // Catch:{ all -> 0x013c }
            X.C04220Ms.A0B(r0, r4)     // Catch:{ all -> 0x013c }
            X.C04220Ms.A0B(r1, r8)     // Catch:{ all -> 0x013c }
            X.6rY r9 = X.C122127Kl.A04(r10, r0)     // Catch:{ all -> 0x013a }
            r9.A02(r0)     // Catch:{ all -> 0x013a }
            int r0 = r1.A04()     // Catch:{ all -> 0x013a }
            r9.A00 = r0     // Catch:{ all -> 0x013a }
            X.53U r9 = (X.AnonymousClass53U) r9     // Catch:{ all -> 0x013c }
            r9.A01 = r7     // Catch:{ all -> 0x013c }
            int r0 = r9.A03(r10, r1)     // Catch:{ all -> 0x013c }
            r9.A00 = r0     // Catch:{ all -> 0x013c }
            r9.A02 = r5     // Catch:{ all -> 0x013c }
            monitor-exit(r2)
            if (r6 != 0) goto L_0x0139
            androidx.compose.runtime.snapshots.Snapshot r0 = X.C122127Kl.A00()
            r0.A0D()
            return r9
        L_0x0126:
            int r2 = r5.A00
            if (r2 <= 0) goto L_0x0139
            java.lang.Object[] r1 = r5.A01
        L_0x012c:
            r0 = r1[r4]
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A01
            X.C86134wK.A1L(r0, r10)
            int r4 = r4 + 1
            if (r4 < r2) goto L_0x012c
        L_0x0139:
            return r9
        L_0x013a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x013c }
        L_0x013c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x013f:
            r3 = move-exception
            int r2 = r1.A00
            if (r2 <= 0) goto L_0x0154
            java.lang.Object[] r1 = r1.A01
        L_0x0146:
            r0 = r1[r4]
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A01
            X.C86134wK.A1L(r0, r10)
            int r4 = r4 + 1
            if (r4 >= r2) goto L_0x0154
            goto L_0x0146
        L_0x0154:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123267Wf.A00(X.53U, X.7Wf, androidx.compose.runtime.snapshots.Snapshot, X.0ZU, boolean):X.53U");
    }

    public static C123267Wf A01(AnonymousClass0ZU r1) {
        C04220Ms.A0B(r1, 0);
        return new C123267Wf(r1);
    }

    public final Object Abn() {
        return A00((AnonymousClass53U) C122127Kl.A06(this.A00), this, C122127Kl.A00(), this.A01, false).A02;
    }

    public final C113516rY Ail() {
        return this.A00;
    }

    public final void CXd(C113516rY r1) {
        this.A00 = (AnonymousClass53U) r1;
    }

    public final String toString() {
        String str;
        C122127Kl.A06(this.A00);
        AnonymousClass53U r3 = (AnonymousClass53U) C122127Kl.A06(this.A00);
        Snapshot A002 = C122127Kl.A00();
        C04220Ms.A0B(A002, 1);
        if (r3.A02 == AnonymousClass53U.A03 || r3.A00 != r3.A03(this, A002)) {
            str = "<Not calculated>";
        } else {
            str = String.valueOf(r3.A02);
        }
        return AnonymousClass00U.A05(hashCode(), "DerivedState(value=", str, ")@");
    }

    public C123267Wf(AnonymousClass0ZU r2) {
        this.A01 = r2;
    }

    public final Object getValue() {
        AnonymousClass0YY A08 = C122127Kl.A00().A08();
        if (A08 != null) {
            A08.invoke(this);
        }
        return A00((AnonymousClass53U) C122127Kl.A06(this.A00), this, C122127Kl.A00(), this.A01, true).A02;
    }

    public final /* synthetic */ C113516rY Bg8(C113516rY r2, C113516rY r3, C113516rY r4) {
        return null;
    }
}
