package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Mg  reason: invalid class name and case insensitive filesystem */
public final class C04100Mg {
    public final C04200Mq A00;
    public final AnonymousClass0Y5 A01;
    public final AnonymousClass0Q4 A02;
    public final Object A03 = new Object();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final Set A07 = new HashSet();
    public final Map A08 = new HashMap();
    public volatile boolean A09;
    public volatile boolean A0A;

    public final void A06(C04170Mn r8, AnonymousClass0ND r9, AnonymousClass0PC r10) {
        A08(r8, r9, r10, r10.As3(), (Integer) null, 0);
    }

    public static String A00(AnonymousClass0ND r3, AnonymousClass0PD r4, String str, int i) {
        String A022;
        String str2 = r3.A00;
        String str3 = "";
        if (i == 0) {
            A022 = str3;
        } else {
            A022 = AnonymousClass00U.A02(i, "_");
        }
        if (r4.A01) {
            str3 = "suppl_";
        }
        return AnonymousClass00U.A0h(str2, A022, str3, r4.A00, str);
    }

    private List A01(AnonymousClass0ND r4, AnonymousClass0PC r5, Map map) {
        List list;
        synchronized (this.A03) {
            Map map2 = (Map) map.get(r4);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(r4, map2);
            }
            list = (List) map2.get(r5);
            if (list == null) {
                list = new ArrayList();
                map2.put(r5, list);
            }
        }
        return list;
    }

    public final Object A03(Class cls) {
        synchronized (this.A03) {
            for (AnonymousClass0PC r1 : this.A07) {
                if (cls.isInstance(r1)) {
                    return r1;
                }
            }
            return null;
        }
    }

    public final List A04(AnonymousClass0ND r6, AnonymousClass0PC r7, Integer num) {
        List<C04050Mb> list;
        synchronized (this.A03) {
            Map map = this.A08;
            Map map2 = (Map) map.get(r6);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(r6, map2);
            }
            list = (List) map2.get(r7);
            if (list == null) {
                list = new ArrayList<>();
                map2.put(r7, list);
            } else if (num != null) {
                ArrayList arrayList = new ArrayList();
                for (C04050Mb r1 : list) {
                    if (r1.BNv(num)) {
                        arrayList.add(r1);
                    }
                }
                list = arrayList;
            }
        }
        return list;
    }

    public final void A05(C04050Mb r3, AnonymousClass0ND r4, AnonymousClass0PC r5) {
        synchronized (this.A03) {
            A04(r4, r5, (Integer) null).add(r3);
            this.A07.add(r5);
        }
    }

    public final void A07(C04170Mn r3, AnonymousClass0ND r4, AnonymousClass0PC r5) {
        C04350Ng.A00.execute(new C04070Md(r3, this, r4, r5));
    }

    public final void A09(C04090Mf r3, AnonymousClass0ND r4, AnonymousClass0PC r5) {
        synchronized (this.A03) {
            A01(r4, r5, this.A04).add(r3);
        }
    }

    public final void A0A(C04090Mf r3, AnonymousClass0ND r4, AnonymousClass0PC r5) {
        synchronized (this.A03) {
            A01(r4, r5, this.A05).add(r3);
        }
    }

    public final void A0B(AnonymousClass0ND r2, AnonymousClass0PC r3) {
        A02(r2, r3, A01(r2, r3, this.A04));
    }

    public final void A0C(AnonymousClass0ND r2, AnonymousClass0PC r3) {
        A02(r2, r3, A01(r2, r3, this.A05));
    }

    public C04100Mg(C04200Mq r2, AnonymousClass0Y5 r3, AnonymousClass0Q4 r4) {
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }

    public static void A02(AnonymousClass0ND r4, AnonymousClass0PC r5, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((C04090Mf) it.next()).C9M(r4, r5);
            } catch (Throwable th) {
                C04790Pd.A00();
                AnonymousClass0LU.A0G("lacrima", "onNotify failed...", th);
            }
        }
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A08(X.C04170Mn r26, X.AnonymousClass0ND r27, X.AnonymousClass0PC r28, X.C06820aQ r29, java.lang.Integer r30, int r31) {
        /*
            r25 = this;
            r24 = 0
            r7 = r29
            if (r29 == 0) goto L_0x0055
            long r5 = android.os.SystemClock.uptimeMillis()
            long r0 = r7.A00
            long r3 = r5 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0053
            r7 = 1
        L_0x0015:
            X.0JW r0 = X.AnonymousClass0LU.A01
            int r0 = r0.getMinimumLoggingLevel()
            r1 = 5
            if (r0 < r1) goto L_0x003f
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            int r0 = r4.getPriority()
            if (r0 >= r1) goto L_0x003f
            java.lang.String r3 = "lacrima"
            java.lang.String r2 = "Applying collectors from thread with higher pri than main thread: %s %d"
            java.lang.String r1 = r4.getName()
            int r0 = r4.getPriority()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            X.AnonymousClass0LU.A0O(r3, r2, r0)
        L_0x003f:
            X.0ND r5 = X.AnonymousClass0ND.CRITICAL_REPORT
            r8 = r25
            r6 = r27
            if (r6 != r5) goto L_0x004c
            boolean r0 = r8.A09
        L_0x0049:
            if (r0 == 0) goto L_0x0057
            return
        L_0x004c:
            X.0ND r0 = X.AnonymousClass0ND.LARGE_REPORT
            if (r6 != r0) goto L_0x0057
            boolean r0 = r8.A0A
            goto L_0x0049
        L_0x0053:
            r7.A00 = r5
        L_0x0055:
            r7 = 0
            goto L_0x0015
        L_0x0057:
            java.lang.String r1 = "CollectorManager.applyCollectors."
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r2 = r28
            X.0PD r4 = r2.Awx()
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            r0 = 1766969124(0x6951cf24, float:1.5852731E25)
            X.C13810oL.A01(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x026f }
            r1.<init>()     // Catch:{ all -> 0x026f }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x026f }
            java.lang.Object r3 = r8.A03     // Catch:{ all -> 0x026f }
            monitor-enter(r3)     // Catch:{ all -> 0x026f }
            r0 = r30
            java.util.List r0 = r8.A04(r6, r2, r0)     // Catch:{ all -> 0x0268 }
            if (r7 == 0) goto L_0x00a1
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0268 }
        L_0x0089:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0268 }
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x0268 }
            X.0Mb r2 = (X.C04050Mb) r2     // Catch:{ all -> 0x0268 }
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x0268 }
            boolean r0 = r2.BNv(r0)     // Catch:{ all -> 0x0268 }
            if (r0 == 0) goto L_0x0089
            r1.add(r2)     // Catch:{ all -> 0x0268 }
            goto L_0x0089
        L_0x00a1:
            r1.addAll(r0)     // Catch:{ all -> 0x0268 }
        L_0x00a4:
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            r7 = r26
            java.util.Map r12 = r7.A03     // Catch:{ all -> 0x026f }
            int r13 = r12.size()     // Catch:{ all -> 0x026f }
            java.util.Map r9 = r7.A07     // Catch:{ all -> 0x026f }
            int r0 = r9.size()     // Catch:{ all -> 0x026f }
            int r13 = r13 + r0
            java.util.Map r11 = r7.A06     // Catch:{ all -> 0x026f }
            int r0 = r11.size()     // Catch:{ all -> 0x026f }
            int r13 = r13 + r0
            java.util.Map r10 = r7.A01     // Catch:{ all -> 0x026f }
            int r0 = r10.size()     // Catch:{ all -> 0x026f }
            int r13 = r13 + r0
            java.util.Map r2 = r7.A05     // Catch:{ all -> 0x026f }
            int r0 = r2.size()     // Catch:{ all -> 0x026f }
            int r13 = r13 + r0
            if (r13 != 0) goto L_0x00d6
            int r0 = r1.size()     // Catch:{ all -> 0x026f }
            if (r0 != 0) goto L_0x00d6
            r0 = -189985600(0xfffffffff4ad0cc0, float:-1.0968334E32)
            goto L_0x0264
        L_0x00d6:
            java.util.Iterator r15 = r1.iterator()     // Catch:{ all -> 0x026f }
        L_0x00da:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x026f }
            if (r0 == 0) goto L_0x013d
            java.lang.Object r13 = r15.next()     // Catch:{ all -> 0x026f }
            X.0Mb r13 = (X.C04050Mb) r13     // Catch:{ all -> 0x026f }
            java.lang.String r1 = "Collector "
            java.lang.Integer r14 = r13.Awy()     // Catch:{ all -> 0x026f }
            if (r14 == 0) goto L_0x0134
            java.lang.String r0 = X.C04110Mh.A00(r14)     // Catch:{ all -> 0x026f }
        L_0x00f2:
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x026f }
            r0 = -631614524(0xffffffffda5a53c4, float:-1.53634116E16)
            X.C13810oL.A01(r1, r0)     // Catch:{ all -> 0x026f }
            X.C04790Pd.A00()     // Catch:{ all -> 0x0106 }
            r13.CWp(r7, r6)     // Catch:{ all -> 0x0106 }
            r0 = 2030766383(0x790b092f, float:4.511972E34)
            goto L_0x0130
        L_0x0106:
            r13 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x0137 }
            X.0ON r1 = X.AnonymousClass0MU.A5q     // Catch:{ all -> 0x0137 }
            java.lang.Object r0 = r9.get(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0137 }
            if (r0 != 0) goto L_0x0116
            java.lang.String r0 = ""
        L_0x0116:
            java.lang.String r19 = "Error: "
            java.lang.String r20 = X.C04110Mh.A00(r14)     // Catch:{ all -> 0x0137 }
            java.lang.String r21 = ": "
            java.lang.String r22 = r13.getMessage()     // Catch:{ all -> 0x0137 }
            java.lang.String r23 = "\n"
            r18 = r0
            java.lang.String r0 = X.AnonymousClass00U.A0i(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0137 }
            r7.A03(r1, r0)     // Catch:{ all -> 0x0137 }
            r0 = 699882463(0x29b75bdf, float:8.1427696E-14)
        L_0x0130:
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x026f }
            goto L_0x00da
        L_0x0134:
            java.lang.String r0 = "null"
            goto L_0x00f2
        L_0x0137:
            r1 = move-exception
            r0 = 351706714(0x14f69e5a, float:2.4902111E-26)
            goto L_0x026b
        L_0x013d:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x026f }
            int r13 = r12.size()     // Catch:{ all -> 0x026f }
            int r12 = r9.size()     // Catch:{ all -> 0x026f }
            int r13 = r13 + r12
            int r11 = r11.size()     // Catch:{ all -> 0x026f }
            int r13 = r13 + r11
            int r10 = r10.size()     // Catch:{ all -> 0x026f }
            int r13 = r13 + r10
            int r2 = r2.size()     // Catch:{ all -> 0x026f }
            int r13 = r13 + r2
            if (r13 <= 0) goto L_0x0261
            X.0ON r11 = X.AnonymousClass0MU.A5r     // Catch:{ all -> 0x026f }
            java.lang.Object r2 = r9.get(r11)     // Catch:{ all -> 0x026f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x026f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            r9.<init>()     // Catch:{ all -> 0x026f }
            if (r2 != 0) goto L_0x016c
            java.lang.String r2 = ""
        L_0x016c:
            r9.append(r2)     // Catch:{ all -> 0x026f }
            java.lang.String r2 = "Time: "
            r9.append(r2)     // Catch:{ all -> 0x026f }
            java.lang.String r2 = "_ms"
            r10 = r31
            java.lang.String r2 = A00(r6, r4, r2, r10)     // Catch:{ all -> 0x026f }
            r9.append(r2)     // Catch:{ all -> 0x026f }
            java.lang.String r2 = "="
            r9.append(r2)     // Catch:{ all -> 0x026f }
            long r0 = r0 - r16
            r9.append(r0)     // Catch:{ all -> 0x026f }
            java.lang.String r0 = "/n"
            r9.append(r0)     // Catch:{ all -> 0x026f }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x026f }
            r7.A03(r11, r0)     // Catch:{ all -> 0x026f }
            java.lang.String r1 = "CollectorManager.store"
            r0 = 2094378733(0x7cd5aeed, float:8.876057E36)
            X.C13810oL.A01(r1, r0)     // Catch:{ all -> 0x026f }
            java.util.Properties r12 = new java.util.Properties     // Catch:{ all -> 0x025c }
            r12.<init>()     // Catch:{ all -> 0x025c }
            r7.A05(r12)     // Catch:{ all -> 0x025c }
            r22 = 0
            monitor-enter(r3)     // Catch:{ IOException -> 0x024a }
            X.0Q4 r0 = r8.A02     // Catch:{ all -> 0x0247 }
            java.io.File r9 = r0.A04     // Catch:{ all -> 0x0247 }
            java.lang.String r11 = "Did you call SessionManager.init()?"
            X.C002801h.A02(r9, r11)     // Catch:{ all -> 0x0247 }
            java.lang.String r0 = "_prop.txt"
            java.lang.String r0 = A00(r6, r4, r0, r10)     // Catch:{ all -> 0x0247 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0247 }
            r1.<init>(r9, r0)     // Catch:{ all -> 0x0247 }
            X.0Y5 r2 = r8.A01     // Catch:{ all -> 0x0247 }
            X.0PD r0 = X.AnonymousClass0PD.STARTUP     // Catch:{ all -> 0x0247 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0247 }
            java.lang.String r8 = "perf"
            if (r0 != 0) goto L_0x01fc
            X.0PD r0 = X.AnonymousClass0PD.PERIODIC_MEMORY     // Catch:{ all -> 0x0247 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0247 }
            if (r0 != 0) goto L_0x01fc
            X.0PD r0 = X.AnonymousClass0PD.PERIODIC_BATTERY     // Catch:{ all -> 0x0247 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0247 }
            if (r0 != 0) goto L_0x01fc
            X.0PD r0 = X.AnonymousClass0PD.CUSTOM_DATA     // Catch:{ all -> 0x0247 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0247 }
            if (r0 != 0) goto L_0x01fc
            X.0PD r0 = X.AnonymousClass0PD.APP_LIFECYCLE     // Catch:{ all -> 0x0247 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0247 }
            if (r0 != 0) goto L_0x01fc
            X.0PD r0 = X.AnonymousClass0PD.JAVA     // Catch:{ all -> 0x0247 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0247 }
            java.lang.String r21 = "collector"
            if (r0 == 0) goto L_0x01f3
            goto L_0x01f8
        L_0x01f3:
            if (r6 == r5) goto L_0x01fe
            r21 = 0
            goto L_0x01fe
        L_0x01f8:
            if (r6 == r5) goto L_0x01fc
            r8 = r21
        L_0x01fc:
            r21 = r8
        L_0x01fe:
            r19 = r2
            r20 = r1
            r23 = r12
            r19.A02(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0247 }
            monitor-exit(r3)     // Catch:{ all -> 0x0247 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x0238 }
            X.C002801h.A02(r9, r11)     // Catch:{ all -> 0x0235 }
            if (r6 != r5) goto L_0x0211
            java.util.Map r5 = r7.A02     // Catch:{ all -> 0x0235 }
            goto L_0x0213
        L_0x0211:
            java.util.Map r5 = r7.A04     // Catch:{ all -> 0x0235 }
        L_0x0213:
            int r0 = r5.size()     // Catch:{ all -> 0x0235 }
            if (r0 <= 0) goto L_0x0233
            java.lang.String r0 = "_attach.txt"
            java.lang.String r0 = A00(r6, r4, r0, r10)     // Catch:{ all -> 0x0235 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0235 }
            r1.<init>(r9, r0)     // Catch:{ all -> 0x0235 }
            java.util.Properties r0 = new java.util.Properties     // Catch:{ all -> 0x0235 }
            r0.<init>()     // Catch:{ all -> 0x0235 }
            r0.putAll(r5)     // Catch:{ all -> 0x0235 }
            r20 = r1
            r23 = r0
            r19.A02(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0235 }
        L_0x0233:
            monitor-exit(r3)     // Catch:{ all -> 0x0235 }
            goto L_0x0243
        L_0x0235:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0235 }
            throw r0     // Catch:{ IOException -> 0x0238 }
        L_0x0238:
            r2 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x025c }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Cannot create attachment properties"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ all -> 0x025c }
        L_0x0243:
            r0 = 1587902316(0x5ea5776c, float:5.9615586E18)
            goto L_0x0258
        L_0x0247:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0247 }
            throw r0     // Catch:{ IOException -> 0x024a }
        L_0x024a:
            r2 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x025c }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Cannot create property file"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ all -> 0x025c }
            r0 = -2045261691(0xffffffff8617c885, float:-2.8547262E-35)
        L_0x0258:
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x026f }
            goto L_0x0261
        L_0x025c:
            r1 = move-exception
            r0 = 308383930(0x126190ba, float:7.117587E-28)
            goto L_0x026b
        L_0x0261:
            r0 = 246753948(0xeb52a9c, float:4.4660976E-30)
        L_0x0264:
            X.C13810oL.A00(r0)
            return
        L_0x0268:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0268 }
            goto L_0x026e
        L_0x026b:
            X.C13810oL.A00(r0)     // Catch:{ all -> 0x026f }
        L_0x026e:
            throw r1     // Catch:{ all -> 0x026f }
        L_0x026f:
            r1 = move-exception
            r0 = 1220136919(0x48b9cfd7, float:380542.72)
            X.C13810oL.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04100Mg.A08(X.0Mn, X.0ND, X.0PC, X.0aQ, java.lang.Integer, int):void");
    }
}
