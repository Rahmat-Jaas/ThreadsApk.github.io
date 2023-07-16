package X;

import java.util.Map;
import java.util.Random;

/* renamed from: X.0Wk  reason: invalid class name and case insensitive filesystem */
public final class C05840Wk implements C04050Mb {
    public static final C05840Wk A01 = new C05840Wk();
    public final Random A00 = new Random();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void A00(android.content.Context r8, java.lang.String r9, java.lang.String r10, int r11, boolean r12) {
        /*
            r7 = this;
            r2 = 0
            monitor-enter(r7)
            r3 = 0
            X.0MM r1 = X.AnonymousClass0MM.A00()     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            monitor-enter(r1)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            X.0s8 r0 = r1.A00     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            if (r0 != 0) goto L_0x001d
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            r1.<init>()     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            java.lang.String r0 = "BBType"
            r1.put(r0, r10)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            java.lang.String r0 = "PreviousSessionId"
            r1.put(r0, r9)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            goto L_0x007e
        L_0x001d:
            boolean r0 = X.C15020qa.A08()     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            if (r0 == 0) goto L_0x006f
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r12 != 0) goto L_0x0030
            java.util.Random r0 = r7.A00     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            int r0 = r0.nextInt(r1)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            if (r0 < r2) goto L_0x0030
            goto L_0x00a6
        L_0x0030:
            r6 = 30
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            r1 = 0
            r4 = 2
            r0 = 0
            if (r5 < r6) goto L_0x003a
            r0 = 2
        L_0x003a:
            int r0 = r0 + 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            java.lang.String r0 = "is_fad_v2"
            r2[r1] = r0     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            r1 = 1
            java.lang.String r0 = java.lang.Boolean.toString(r12)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            r2[r1] = r0     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            if (r5 < r6) goto L_0x0056
            java.lang.String r0 = "exit_info_reason"
            r2[r4] = r0     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            r1 = 3
            java.lang.String r0 = java.lang.Integer.toString(r11)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            r2[r1] = r0     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
        L_0x0056:
            java.lang.String r3 = X.AnonymousClass0UI.A00(r8, r9, r10, r2)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            if (r3 == 0) goto L_0x00a6
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            r2.<init>()     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            java.lang.String r0 = "black_box_trace"
            r2.put(r0, r3)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            X.0MM r1 = X.AnonymousClass0MM.A00()     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            monitor-enter(r1)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            r1.A01 = r2     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            goto L_0x00a6
        L_0x006f:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            r1.<init>()     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            java.lang.String r0 = "BBType"
            r1.put(r0, r10)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            java.lang.String r0 = "PreviousSessionId"
            r1.put(r0, r9)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
        L_0x007e:
            X.C04790Pd.A00()     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            goto L_0x00a6
        L_0x0082:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
            throw r0     // Catch:{ IllegalStateException | UnsatisfiedLinkError -> 0x0085 }
        L_0x0085:
            r2 = move-exception
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x00a8 }
            r1.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "BBType"
            r1.put(r0, r10)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "PreviousSessionId"
            r1.put(r0, r9)     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x009c
            java.lang.String r0 = "TraceId"
            r1.put(r0, r3)     // Catch:{ all -> 0x00a8 }
        L_0x009c:
            X.C04790Pd.A00()     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Black box collection failed"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ all -> 0x00a8 }
        L_0x00a6:
            monitor-exit(r7)
            return
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05840Wk.A00(android.content.Context, java.lang.String, java.lang.String, int, boolean):void");
    }

    public final synchronized void CWp(C04170Mn r5, AnonymousClass0ND r6) {
        Map map;
        AnonymousClass0MM A002 = AnonymousClass0MM.A00();
        synchronized (A002) {
            map = A002.A01;
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Map map2 = r5.A03;
                if (str2 == null) {
                    str2 = "unknown";
                }
                map2.put(str, str2);
            }
        }
    }

    public final Integer Awy() {
        return AnonymousClass006.A02;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
