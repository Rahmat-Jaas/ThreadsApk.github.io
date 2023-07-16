package com.facebook.quickpromotion.sdk.fetcher.ondemand;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.C568338s;
import X.C57663Bz;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

public final class OnDemandSurfaceTriggerCache {
    public long A00;
    public ImmutableList A01 = ImmutableList.of();
    public Integer A02 = AnonymousClass006.A00;
    public boolean A03;
    public final C57663Bz A04;
    public final ArrayList A05 = AnonymousClass0wJ.A0v();
    public final KtCSuperShape0S2100000_I2 A06;
    public final C568338s A07;
    public final String A08;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    public static final java.lang.Object A01(X.AnonymousClass32X r12, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r13, java.lang.Object r14, X.C146958n9 r15, boolean r16) {
        /*
            r11 = r13
            r10 = r14
            r9 = r12
            r6 = r16
            r3 = 0
            r4 = r15
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0511000_I2.A00(r3, r15)
            if (r0 == 0) goto L_0x0033
            r8 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape0S0511000_I2 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0511000_I2) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0033
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001b:
            java.lang.Object r4 = r8.A04
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r7 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r7) goto L_0x0039
            boolean r6 = r8.A06
            java.lang.Object r9 = r8.A03
            X.32X r9 = (X.AnonymousClass32X) r9
            java.lang.Object r10 = r8.A02
            java.lang.Object r11 = r8.A01
            com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r11 = (com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache) r11
            goto L_0x0065
        L_0x0033:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0511000_I2 r8 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0511000_I2
            r8.<init>(r13, r15, r3)
            goto L_0x001b
        L_0x0039:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x003e:
            X.AnonymousClass0OU.A00(r4)
            X.3Bz r0 = r13.A04     // Catch:{ all -> 0x006b }
            X.39U r4 = r0.A03     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r13.A08     // Catch:{ all -> 0x006b }
            X.4qz r3 = r12.A00     // Catch:{ all -> 0x006b }
            r2 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S1100000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape3S1100000_I2     // Catch:{ all -> 0x006b }
            r1.<init>(r4, r0, r2, r7)     // Catch:{ all -> 0x006b }
            r0 = 3
            X.4wB r0 = X.C25599DoZ.A01(r2, r1, r3, r0)     // Catch:{ all -> 0x006b }
            r8.A01 = r13     // Catch:{ all -> 0x006b }
            r8.A02 = r14     // Catch:{ all -> 0x006b }
            r8.A03 = r12     // Catch:{ all -> 0x006b }
            r8.A06 = r6     // Catch:{ all -> 0x006b }
            r8.A00 = r7     // Catch:{ all -> 0x006b }
            java.lang.Object r4 = r0.AA2(r8)     // Catch:{ all -> 0x006b }
            if (r4 != r5) goto L_0x0068
            return r5
        L_0x0065:
            X.AnonymousClass0OU.A00(r4)     // Catch:{ all -> 0x006b }
        L_0x0068:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2) r4     // Catch:{ all -> 0x006b }
            goto L_0x0071
        L_0x006b:
            r0 = move-exception
            X.0OW r4 = new X.0OW
            r4.<init>(r0)
        L_0x0071:
            java.lang.Throwable r0 = X.AnonymousClass0OV.A00(r4)
            if (r0 == 0) goto L_0x0088
            X.3Bz r0 = r11.A04
            X.0IB r3 = r0.A00
            java.lang.String r2 = "OnDemandSurfaceTriggerCache"
            java.lang.String r1 = "Error deserializing for stash key "
            java.lang.String r0 = r11.A08
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            r3.CuW(r2, r0)
        L_0x0088:
            boolean r0 = r4 instanceof X.AnonymousClass0OW
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00a6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2) r4
            long r0 = r4.A00
            r11.A00 = r0
            java.lang.Object r0 = r4.A01
            X.4or r0 = (X.C81994or) r0
            if (r0 == 0) goto L_0x00a0
            com.google.common.collect.ImmutableList r0 = r0.CXu()
            if (r0 != 0) goto L_0x00a4
        L_0x00a0:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
        L_0x00a4:
            r11.A01 = r0
        L_0x00a6:
            monitor-enter(r11)
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x0104 }
            r11.A02 = r0     // Catch:{ all -> 0x0104 }
            boolean r0 = X.C18180wK.A1V(r6)
            r8 = 1
            if (r0 != 0) goto L_0x00ca
            long r2 = r11.A00     // Catch:{ all -> 0x0104 }
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00ca
            X.3Bz r0 = r11.A04     // Catch:{ all -> 0x0104 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0104 }
            X.32W r0 = r0.A02     // Catch:{ all -> 0x0104 }
            long r0 = r0.A00     // Catch:{ all -> 0x0104 }
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00ca
            r8 = 0
        L_0x00ca:
            if (r8 == 0) goto L_0x00e0
            r11.A03 = r7     // Catch:{ all -> 0x0104 }
            X.4qz r1 = r9.A00     // Catch:{ all -> 0x0104 }
            r12 = 0
            boolean r14 = X.C18180wK.A1V(r6)
            r13 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2 r8 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2     // Catch:{ all -> 0x0104 }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0104 }
            r0 = 3
            X.C25237DiI.A00(r12, r12, r8, r1, r0)     // Catch:{ all -> 0x0104 }
            goto L_0x0100
        L_0x00e0:
            java.util.ArrayList r3 = r11.A05     // Catch:{ all -> 0x0104 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0104 }
        L_0x00e6:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0104 }
            X.4wA r1 = (X.C86034wA) r1     // Catch:{ all -> 0x0104 }
            com.google.common.collect.ImmutableList r0 = r11.A01     // Catch:{ all -> 0x0104 }
            X.C04220Ms.A05(r0)     // Catch:{ all -> 0x0104 }
            X.EnU r1 = (X.C27438EnU) r1     // Catch:{ all -> 0x0104 }
            r1.A0M(r0)     // Catch:{ all -> 0x0104 }
            goto L_0x00e6
        L_0x00fd:
            r3.clear()     // Catch:{ all -> 0x0104 }
        L_0x0100:
            monitor-exit(r11)
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0104:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache.A01(X.32X, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache, java.lang.Object, X.8n9, boolean):java.lang.Object");
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
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0164  */
    public static final java.lang.Object A00(X.AnonymousClass32X r17, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r18, java.lang.Object r19, X.C146958n9 r20, boolean r21) {
        /*
            r15 = r19
            r6 = r17
            r5 = r18
            r10 = 0
            r3 = r20
            boolean r0 = r3 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2
            if (r0 == 0) goto L_0x0015
            r0 = r3
            kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2) r0
            int r1 = r0.A07
            r0 = 1
            if (r1 == r10) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x003e
            r9 = r3
            kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2 r9 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003e
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0026:
            java.lang.Object r2 = r9.A05
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r9.A00
            r7 = 2
            r11 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 == r11) goto L_0x0049
            if (r0 != r7) goto L_0x0044
            long r0 = r9.A01
            java.lang.Object r12 = r9.A03
            java.lang.Object r5 = r9.A02
            com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r5 = (com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache) r5
            goto L_0x0150
        L_0x003e:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2 r9 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0501100_I2
            r9.<init>(r5, r3, r10)
            goto L_0x0026
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0049:
            java.lang.Object r6 = r9.A03
            X.32X r6 = (X.AnonymousClass32X) r6
            java.lang.Object r5 = r9.A02
            com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r5 = (com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache) r5
            goto L_0x00db
        L_0x0053:
            X.AnonymousClass0OU.A00(r2)
            X.3Bz r0 = r5.A04     // Catch:{ all -> 0x00eb }
            com.instagram.quickpromotion.sdk.IGOnDemandFetcher r14 = r0.A04     // Catch:{ all -> 0x00eb }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r13 = r5.A06     // Catch:{ all -> 0x00eb }
            X.38s r0 = r5.A07     // Catch:{ all -> 0x00eb }
            r16 = r0
            boolean r21 = X.C18180wK.A1V(r21)
            r9.A02 = r5     // Catch:{ all -> 0x00eb }
            r9.A03 = r6     // Catch:{ all -> 0x00eb }
            r9.A00 = r11     // Catch:{ all -> 0x00eb }
            com.instagram.service.session.UserSession r15 = (com.instagram.service.session.UserSession) r15     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = "Unknown surface id"
            java.lang.String r1 = "igsdk_starts_execution"
            X.1u6 r0 = new X.1u6     // Catch:{ all -> 0x00eb }
            r0.<init>(r13, r1)     // Catch:{ all -> 0x00eb }
            X.0YY r12 = r14.A01     // Catch:{ all -> 0x00eb }
            r1 = r12
            X.4l7 r1 = (X.C80074l7) r1     // Catch:{ all -> 0x00eb }
            r1.invoke(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = r13.A01     // Catch:{ all -> 0x009a }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x009a }
            java.util.Map r0 = com.instagram.quickpromotion.intf.QuickPromotionSurface.A02     // Catch:{ all -> 0x009a }
            java.lang.Object r4 = X.C18200wM.A0f(r0, r3)     // Catch:{ all -> 0x009a }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r4 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r4     // Catch:{ all -> 0x009a }
            if (r4 != 0) goto L_0x00a0
            X.1u5 r0 = new X.1u5     // Catch:{ all -> 0x009a }
            r0.<init>(r13, r2)     // Catch:{ all -> 0x009a }
            r1.invoke(r0)     // Catch:{ all -> 0x009a }
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r2)     // Catch:{ all -> 0x009a }
            throw r0     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            X.0OW r4 = new X.0OW     // Catch:{ all -> 0x00eb }
            r4.<init>(r0)     // Catch:{ all -> 0x00eb }
        L_0x00a0:
            java.lang.Throwable r3 = X.AnonymousClass0OV.A00(r4)     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x00c0
            java.lang.String r2 = "Invalid surface id "
            java.lang.String r0 = r13.A01     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = X.AnonymousClass00U.A0L(r2, r0)     // Catch:{ all -> 0x00eb }
            X.1u5 r0 = new X.1u5     // Catch:{ all -> 0x00eb }
            r0.<init>(r13, r2)     // Catch:{ all -> 0x00eb }
            r1.invoke(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "IGOnDemandFetcher"
            X.AnonymousClass0LU.A0E(r1, r2, r3)     // Catch:{ all -> 0x00eb }
            X.0IB r0 = r14.A00     // Catch:{ all -> 0x00eb }
            r0.CuY(r1, r2, r3)     // Catch:{ all -> 0x00eb }
        L_0x00c0:
            boolean r0 = r4 instanceof X.AnonymousClass0OW     // Catch:{ all -> 0x00eb }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e2
            com.instagram.quickpromotion.intf.QuickPromotionSurface r4 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r4     // Catch:{ all -> 0x00eb }
            r18 = r15
            r19 = r9
            r20 = r12
            r17 = r16
            r16 = r14
            r15 = r4
            r14 = r6
            java.lang.Object r2 = com.instagram.quickpromotion.sdk.IGOnDemandFetcher.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00eb }
            if (r2 != r8) goto L_0x00de
            return r8
        L_0x00db:
            X.AnonymousClass0OU.A00(r2)     // Catch:{ all -> 0x00eb }
        L_0x00de:
            X.4or r2 = (X.C81994or) r2     // Catch:{ all -> 0x00eb }
            r12 = r2
            goto L_0x00f1
        L_0x00e2:
            X.AnonymousClass0OU.A00(r4)     // Catch:{ all -> 0x00eb }
            X.4VV r0 = new X.4VV     // Catch:{ all -> 0x00eb }
            r0.<init>()     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r0 = move-exception
            X.0OW r12 = new X.0OW
            r12.<init>(r0)
        L_0x00f1:
            java.lang.Throwable r3 = X.AnonymousClass0OV.A00(r12)
            if (r3 == 0) goto L_0x010f
            java.lang.String r0 = "Error fetching promotions for "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = r5.A06
            java.lang.String r2 = X.C18200wM.A0m(r0, r1)
            java.lang.String r1 = "OnDemandSurfaceTriggerCache"
            X.AnonymousClass0LU.A0E(r1, r2, r3)
            X.3Bz r0 = r5.A04
            X.0IB r0 = r0.A00
            r0.CuY(r1, r2, r3)
        L_0x010f:
            boolean r0 = r12 instanceof X.AnonymousClass0OW
            r2 = r0 ^ 1
            if (r2 == 0) goto L_0x011c
            long r0 = java.lang.System.currentTimeMillis()
        L_0x0119:
            if (r2 == 0) goto L_0x016f
            goto L_0x011f
        L_0x011c:
            long r0 = r5.A00
            goto L_0x0119
        L_0x011f:
            X.3Bz r2 = r5.A04     // Catch:{ all -> 0x0156 }
            X.39U r15 = r2.A03     // Catch:{ all -> 0x0156 }
            java.lang.String r13 = r5.A08     // Catch:{ all -> 0x0156 }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2     // Catch:{ all -> 0x0156 }
            r2.<init>(r0, r12, r11)     // Catch:{ all -> 0x0156 }
            X.4qz r4 = r6.A00     // Catch:{ all -> 0x0156 }
            r3 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S1200000_I2 r14 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S1200000_I2     // Catch:{ all -> 0x0156 }
            r16 = r2
            r17 = r13
            r18 = r3
            r19 = r10
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0156 }
            r2 = 3
            X.4wB r2 = X.C25599DoZ.A01(r3, r14, r4, r2)     // Catch:{ all -> 0x0156 }
            r9.A02 = r5     // Catch:{ all -> 0x0156 }
            r9.A03 = r12     // Catch:{ all -> 0x0156 }
            r9.A04 = r12     // Catch:{ all -> 0x0156 }
            r9.A01 = r0     // Catch:{ all -> 0x0156 }
            r9.A00 = r7     // Catch:{ all -> 0x0156 }
            java.lang.Object r2 = r2.Ba9(r9)     // Catch:{ all -> 0x0156 }
            if (r2 != r8) goto L_0x0153
            return r8
        L_0x0150:
            X.AnonymousClass0OU.A00(r2)     // Catch:{ all -> 0x0158 }
        L_0x0153:
            kotlin.Unit r2 = kotlin.Unit.A00     // Catch:{ all -> 0x0158 }
            goto L_0x015e
        L_0x0156:
            r3 = move-exception
            goto L_0x0159
        L_0x0158:
            r3 = move-exception
        L_0x0159:
            X.0OW r2 = new X.0OW
            r2.<init>(r3)
        L_0x015e:
            java.lang.Throwable r6 = X.AnonymousClass0OV.A00(r2)
            if (r6 == 0) goto L_0x016f
            X.3Bz r2 = r5.A04
            X.0IB r4 = r2.A00
            java.lang.String r3 = "OnDemandSurfaceTriggerCache"
            java.lang.String r2 = "Error serializing fetched promotions"
            r4.CuY(r3, r2, r6)
        L_0x016f:
            monitor-enter(r5)
            r5.A00 = r0     // Catch:{ all -> 0x01ad }
            boolean r0 = r12 instanceof X.AnonymousClass0OW     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x0177
            r12 = 0
        L_0x0177:
            X.4or r12 = (X.C81994or) r12     // Catch:{ all -> 0x01ad }
            if (r12 == 0) goto L_0x0181
            com.google.common.collect.ImmutableList r0 = r12.CXu()     // Catch:{ all -> 0x01ad }
            if (r0 != 0) goto L_0x0185
        L_0x0181:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()     // Catch:{ all -> 0x01ad }
        L_0x0185:
            r5.A01 = r0     // Catch:{ all -> 0x01ad }
            java.util.ArrayList r3 = r5.A05     // Catch:{ all -> 0x01ad }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x01ad }
        L_0x018d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01ad }
            X.4wA r1 = (X.C86034wA) r1     // Catch:{ all -> 0x01ad }
            com.google.common.collect.ImmutableList r0 = r5.A01     // Catch:{ all -> 0x01ad }
            X.C04220Ms.A05(r0)     // Catch:{ all -> 0x01ad }
            X.EnU r1 = (X.C27438EnU) r1     // Catch:{ all -> 0x01ad }
            r1.A0M(r0)     // Catch:{ all -> 0x01ad }
            goto L_0x018d
        L_0x01a4:
            r3.clear()     // Catch:{ all -> 0x01ad }
            r5.A03 = r10     // Catch:{ all -> 0x01ad }
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x01ad }
            monitor-exit(r5)
            return r0
        L_0x01ad:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache.A00(X.32X, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache, java.lang.Object, X.8n9, boolean):java.lang.Object");
    }

    public OnDemandSurfaceTriggerCache(KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2, C57663Bz r3, C568338s r4, String str) {
        this.A06 = ktCSuperShape0S2100000_I2;
        this.A07 = r4;
        this.A04 = r3;
        this.A08 = str;
    }
}
