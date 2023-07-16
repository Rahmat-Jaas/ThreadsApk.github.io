package X;

import androidx.compose.runtime.Recomposer;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.6vH  reason: invalid class name and case insensitive filesystem */
public abstract class C115506vH {
    public final C97706Cl A06(C97716Cm r4) {
        if (this instanceof Recomposer) {
            Recomposer recomposer = (Recomposer) this;
            C04220Ms.A0B(r4, 0);
            synchronized (recomposer.A09) {
                recomposer.A0E.remove(r4);
            }
            return null;
        }
        C04220Ms.A0B(r4, 0);
        return ((AnonymousClass530) this).A05.A0c.A06(r4);
    }

    public final C27952Ew2 A07() {
        if (this instanceof Recomposer) {
            return ((Recomposer) this).A0G;
        }
        return ((AnonymousClass530) this).A05.A0c.A07();
    }

    public final void A08(C147318p9 r5) {
        AnonymousClass8s9 r1;
        if (this instanceof Recomposer) {
            Recomposer recomposer = (Recomposer) this;
            synchronized (recomposer.A09) {
                List list = recomposer.A0A;
                if (!list.contains(r5)) {
                    list.add(r5);
                    r1 = Recomposer.A01(recomposer);
                } else {
                    r1 = null;
                }
            }
            if (r1 != null) {
                r1.resumeWith(Unit.A00);
                return;
            }
            return;
        }
        AnonymousClass7W3 r0 = ((AnonymousClass530) this).A05;
        C115506vH r12 = r0.A0c;
        r12.A08(r0.A0d);
        r12.A08(r5);
    }

    public final void A09(C147318p9 r4) {
        if (this instanceof Recomposer) {
            Recomposer recomposer = (Recomposer) this;
            synchronized (recomposer.A09) {
                recomposer.A0D.remove(r4);
                recomposer.A0A.remove(r4);
                recomposer.A0C.remove(r4);
            }
            return;
        }
        ((AnonymousClass530) this).A05.A0c.A09(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0082, code lost:
        r3 = X.AnonymousClass0wJ.A0v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0086, code lost:
        r3.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r2 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0092, code lost:
        if (r2.hasNext() == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0094, code lost:
        r0 = (X.C97716Cm) r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009a, code lost:
        if (r13 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009c, code lost:
        r3.add(r0);
        r2.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a8, code lost:
        if (X.C18250wR.A1K(r3) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00aa, code lost:
        androidx.compose.runtime.Recomposer.A00(r1, (X.AnonymousClass84Z) null, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.C147318p9 r13, X.AnonymousClass0YP r14) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof androidx.compose.runtime.Recomposer
            if (r0 == 0) goto L_0x00f0
            r1 = r12
            androidx.compose.runtime.Recomposer r1 = (androidx.compose.runtime.Recomposer) r1
            r11 = 0
            r10 = 1
            r3 = r13
            X.7W5 r3 = (X.AnonymousClass7W5) r3
            X.7W3 r9 = r3.A07
            boolean r7 = r9.A0Q
            r5 = 0
            r0 = 5
            kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2 r2 = X.C86154wM.A10(r13, r0)     // Catch:{ Exception -> 0x00eb }
            kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1 r0 = X.C86164wN.A11(r5, r13, r10)     // Catch:{ Exception -> 0x00eb }
            X.53I r8 = X.C121637Hc.A00(r2, r0)     // Catch:{ Exception -> 0x00eb }
            androidx.compose.runtime.snapshots.Snapshot r6 = r8.A05()     // Catch:{ all -> 0x00e3 }
            java.lang.Object r4 = r3.A0D     // Catch:{ all -> 0x00d4 }
            monitor-enter(r4)     // Catch:{ all -> 0x00d4 }
            X.AnonymousClass7W5.A04(r3)     // Catch:{ all -> 0x00d1 }
            X.7EA r2 = r3.A02     // Catch:{ all -> 0x00d1 }
            X.7EA r0 = new X.7EA     // Catch:{ all -> 0x00d1 }
            r0.<init>(r5, r11, r10)     // Catch:{ all -> 0x00d1 }
            r3.A02 = r0     // Catch:{ all -> 0x00d1 }
            X.C04220Ms.A0B(r2, r11)     // Catch:{ Exception -> 0x00cd }
            java.util.List r0 = r9.A0K     // Catch:{ Exception -> 0x00cd }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x00cd }
            if (r0 == 0) goto L_0x00c7
            X.AnonymousClass7W3.A0q(r9, r2, r14)     // Catch:{ Exception -> 0x00cd }
            monitor-exit(r4)     // Catch:{ all -> 0x00d4 }
            X.C86144wL.A1N(r6)     // Catch:{ all -> 0x00e3 }
            androidx.compose.runtime.Recomposer.A04(r8)     // Catch:{ Exception -> 0x00eb }
            if (r7 != 0) goto L_0x004f
            androidx.compose.runtime.snapshots.Snapshot r0 = X.C122127Kl.A00()
            r0.A0D()
        L_0x004f:
            java.lang.Object r6 = r1.A09
            monitor-enter(r6)
            X.4wE r0 = r1.A0H     // Catch:{ all -> 0x00c4 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x00c4 }
            X.68B r2 = (X.AnonymousClass68B) r2     // Catch:{ all -> 0x00c4 }
            X.68B r0 = X.AnonymousClass68B.ShuttingDown     // Catch:{ all -> 0x00c4 }
            int r0 = r2.compareTo(r0)     // Catch:{ all -> 0x00c4 }
            if (r0 <= 0) goto L_0x006d
            java.util.List r2 = r1.A0D     // Catch:{ all -> 0x00c4 }
            boolean r0 = r2.contains(r13)     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x006d
            r2.add(r13)     // Catch:{ all -> 0x00c4 }
        L_0x006d:
            monitor-exit(r6)
            monitor-enter(r6)     // Catch:{ Exception -> 0x00eb }
            java.util.List r4 = r1.A0B     // Catch:{ all -> 0x00e8 }
            int r2 = r4.size()     // Catch:{ all -> 0x00e8 }
            r0 = 0
        L_0x0076:
            if (r0 >= r2) goto L_0x00ae
            r4.get(r0)     // Catch:{ all -> 0x00e8 }
            if (r13 != 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            int r0 = r0 + 1
            goto L_0x0076
        L_0x0081:
            monitor-exit(r6)     // Catch:{ Exception -> 0x00eb }
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()     // Catch:{ Exception -> 0x00eb }
        L_0x0086:
            r3.clear()     // Catch:{ Exception -> 0x00eb }
            monitor-enter(r6)     // Catch:{ Exception -> 0x00eb }
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x00e8 }
        L_0x008e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x00e8 }
            X.6Cm r0 = (X.C97716Cm) r0     // Catch:{ all -> 0x00e8 }
            if (r13 != 0) goto L_0x008e
            r3.add(r0)     // Catch:{ all -> 0x00e8 }
            r2.remove()     // Catch:{ all -> 0x00e8 }
            goto L_0x008e
        L_0x00a3:
            monitor-exit(r6)     // Catch:{ Exception -> 0x00eb }
            boolean r0 = X.C18250wR.A1K(r3)     // Catch:{ Exception -> 0x00eb }
            if (r0 == 0) goto L_0x00af
            androidx.compose.runtime.Recomposer.A00(r1, r5, r3)     // Catch:{ Exception -> 0x00eb }
            goto L_0x0086
        L_0x00ae:
            monitor-exit(r6)     // Catch:{ Exception -> 0x00eb }
        L_0x00af:
            r13.A8s()     // Catch:{ Exception -> 0x00bf }
            r13.A8w()     // Catch:{ Exception -> 0x00bf }
            if (r7 != 0) goto L_0x00be
            androidx.compose.runtime.snapshots.Snapshot r0 = X.C122127Kl.A00()
            r0.A0D()
        L_0x00be:
            return
        L_0x00bf:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A02(r5, r1, r0)
            return
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x00c7:
            java.lang.String r0 = "Expected applyChanges() to have been called"
            X.AnonymousClass7J4.A02(r0)     // Catch:{ Exception -> 0x00cd }
            throw r5     // Catch:{ Exception -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            r3.A02 = r2     // Catch:{ all -> 0x00d1 }
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00d4 }
            throw r0     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r0 = move-exception
            X.AnonymousClass7W5.A02(r3)     // Catch:{ Exception -> 0x00d9 }
            throw r0     // Catch:{ Exception -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            X.AnonymousClass7W5.A03(r3)     // Catch:{ all -> 0x00de }
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            X.C86144wL.A1N(r6)     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A04(r8)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00ea
        L_0x00e8:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ Exception -> 0x00eb }
        L_0x00ea:
            throw r0     // Catch:{ Exception -> 0x00eb }
        L_0x00eb:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A02(r13, r1, r0)
            return
        L_0x00f0:
            r0 = r12
            X.530 r0 = (X.AnonymousClass530) r0
            X.7W3 r0 = r0.A05
            X.6vH r0 = r0.A0c
            r0.A0A(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115506vH.A0A(X.8p9, X.0YP):void");
    }
}
