package X;

import android.os.Handler;
import java.util.Set;

/* renamed from: X.7mq  reason: invalid class name and case insensitive filesystem */
public final class C129847mq implements C145428kU {
    public final C111146mr A00;
    public final Handler A01 = AnonymousClass0wJ.A0F();
    public final AnonymousClass75s A02;
    public final C105136cw A03;
    public final AnonymousClass75H A04;

    public final synchronized void Ca5(C148668re r7) {
        AnonymousClass4wz r1;
        C111146mr r5 = this.A00;
        synchronized (r5) {
            r5.A03.A01("registerListener", C86164wN.A1T());
            Set set = r5.A04;
            set.add(r7);
            if (!set.isEmpty() && r5.A00 == null) {
                AnonymousClass4wz r2 = new AnonymousClass4wz(r5);
                r5.A00 = r2;
                r5.A01.registerReceiver(r2, r5.A02);
            }
            if (set.isEmpty() && (r1 = r5.A00) != null) {
                r5.A01.unregisterReceiver(r1);
                r5.A00 = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = X.C18200wM.A0u();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001e */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C1202579k AHO(java.util.List r11) {
        /*
            r10 = this;
            X.6cw r5 = r10.A03
            java.lang.Class<X.6cw> r4 = X.C105136cw.class
            monitor-enter(r4)
            android.content.Context r1 = r5.A00     // Catch:{ Exception -> 0x001e }
            java.lang.String r0 = "playcore_split_install_internal"
            android.content.SharedPreferences r2 = X.C86164wN.A0C(r1, r0)     // Catch:{ Exception -> 0x001e }
            java.util.HashSet r1 = X.C18200wM.A0u()     // Catch:{ Exception -> 0x001e }
            java.lang.String r0 = "modules_to_uninstall_if_emulated"
            java.util.Set r0 = r2.getStringSet(r0, r1)     // Catch:{ Exception -> 0x001e }
            if (r0 != 0) goto L_0x0022
            java.util.HashSet r0 = X.C18200wM.A0u()     // Catch:{ Exception -> 0x001e }
            goto L_0x0022
        L_0x001e:
            java.util.HashSet r0 = X.C18200wM.A0u()     // Catch:{ all -> 0x00e8 }
        L_0x0022:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x00ea }
            r3.<init>(r0)     // Catch:{ all -> 0x00ea }
            java.util.Iterator r2 = r11.iterator()     // Catch:{ all -> 0x00ea }
            r1 = 0
        L_0x002c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = X.C18180wK.A0k(r2)     // Catch:{ all -> 0x00ea }
            boolean r0 = r3.add(r0)     // Catch:{ all -> 0x00ea }
            r1 = r1 | r0
            goto L_0x002c
        L_0x003c:
            if (r1 == 0) goto L_0x0053
            android.content.Context r1 = r5.A00     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "playcore_split_install_internal"
            android.content.SharedPreferences r0 = X.C86164wN.A0C(r1, r0)     // Catch:{ Exception -> 0x0053 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "modules_to_uninstall_if_emulated"
            android.content.SharedPreferences$Editor r0 = r1.putStringSet(r0, r3)     // Catch:{ Exception -> 0x0053 }
            r0.apply()     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            monitor-exit(r4)     // Catch:{ all -> 0x00ea }
            X.75s r3 = r10.A02
            X.7Eb r7 = r3.A00
            if (r7 != 0) goto L_0x0080
            X.78d r5 = X.AnonymousClass75s.A02
            r4 = -14
            java.lang.Object[] r3 = X.C18210wN.A1X(r4)
            java.lang.String r2 = "onError(%d)"
            java.lang.String r1 = "PlayCore"
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = r5.A00
            java.lang.String r0 = X.AnonymousClass78d.A00(r0, r2, r3)
            android.util.Log.e(r1, r0)
        L_0x0076:
            X.5r7 r0 = new X.5r7
            r0.<init>(r4)
            X.79k r6 = X.AnonymousClass6JE.A00(r0)
            return r6
        L_0x0080:
            X.78d r2 = X.AnonymousClass75s.A02
            r9 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r11}
            java.lang.String r0 = "deferredUninstall(%s)"
            r2.A01(r0, r1)
            X.6oV r1 = new X.6oV
            r1.<init>()
            X.5r0 r5 = new X.5r0
            r5.<init>(r3, r1, r1, r11)
            java.lang.Object r8 = r7.A08
            monitor-enter(r8)
            java.util.Set r0 = r7.A0C     // Catch:{ all -> 0x00e5 }
            r0.add(r1)     // Catch:{ all -> 0x00e5 }
            X.79k r6 = r1.A00     // Catch:{ all -> 0x00e5 }
            X.7mx r3 = new X.7mx     // Catch:{ all -> 0x00e5 }
            r3.<init>(r7, r1)     // Catch:{ all -> 0x00e5 }
            java.util.concurrent.Executor r2 = X.C103016Xm.A00     // Catch:{ all -> 0x00e5 }
            X.6s1 r1 = r6.A02     // Catch:{ all -> 0x00e5 }
            X.7my r0 = new X.7my     // Catch:{ all -> 0x00e5 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x00e5 }
            r1.A00(r0)     // Catch:{ all -> 0x00e5 }
            X.C1202579k.A00(r6)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r8)     // Catch:{ all -> 0x00e5 }
            monitor-enter(r8)
            java.util.concurrent.atomic.AtomicInteger r0 = r7.A0D     // Catch:{ all -> 0x00e2 }
            int r0 = r0.getAndIncrement()     // Catch:{ all -> 0x00e2 }
            if (r0 <= 0) goto L_0x00d2
            X.78d r4 = r7.A06     // Catch:{ all -> 0x00e2 }
            java.lang.String r3 = "Already connected to the service."
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = "PlayCore"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x00e2 }
            X.AnonymousClass78d.A00(r0, r3, r2)     // Catch:{ all -> 0x00e2 }
        L_0x00d2:
            monitor-exit(r8)     // Catch:{ all -> 0x00e2 }
            X.6oV r0 = r5.A00
            X.5qy r1 = new X.5qy
            r1.<init>(r5, r7, r0)
            android.os.Handler r0 = r7.A01()
            r0.post(r1)
            return r6
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e2 }
            throw r0
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e5 }
            throw r0
        L_0x00e8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ea }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129847mq.AHO(java.util.List):X.79k");
    }

    public C129847mq(AnonymousClass75s r2, C105136cw r3, AnonymousClass75H r4, C111146mr r5) {
        this.A02 = r2;
        this.A00 = r5;
        this.A04 = r4;
        this.A03 = r3;
    }
}
