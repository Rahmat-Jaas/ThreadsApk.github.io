package androidx.compose.runtime;

import X.AnonymousClass0YM;
import X.C146958n9;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {492, 510}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
public final class Recomposer$runRecomposeAndApplyChanges$2 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ Recomposer A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, C146958n9 r3) {
        super(3, r3);
        this.A07 = recomposer;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.A07, (C146958n9) obj3);
        recomposer$runRecomposeAndApplyChanges$2.A06 = obj2;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.A00);
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            r10 = r27
            int r0 = r10.A00
            r18 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0071
            java.lang.Object r7 = r10.A05
            java.lang.Object r6 = r10.A04
            java.lang.Object r5 = r10.A03
            java.lang.Object r4 = r10.A02
            java.lang.Object r3 = r10.A01
            java.lang.Object r2 = r10.A06
            X.8sD r2 = (X.C148808sD) r2
            if (r0 == r8) goto L_0x00ca
            X.AnonymousClass0OU.A00(r28)
        L_0x001e:
            androidx.compose.runtime.Recomposer r14 = r10.A07
            java.lang.Object r12 = r14.A09
            monitor-enter(r12)
            java.util.Map r1 = r14.A0F     // Catch:{ all -> 0x012a }
            boolean r0 = X.C86164wN.A1R(r1)     // Catch:{ all -> 0x012a }
            r11 = 0
            if (r0 == 0) goto L_0x0062
            java.util.Collection r0 = r1.values()     // Catch:{ all -> 0x012a }
            java.util.List r17 = X.C02260Al.A10(r0)     // Catch:{ all -> 0x012a }
            r1.clear()     // Catch:{ all -> 0x012a }
            java.util.ArrayList r1 = X.C18200wM.A0t(r17)     // Catch:{ all -> 0x012a }
            int r16 = r17.size()     // Catch:{ all -> 0x012a }
            r13 = 0
        L_0x0040:
            r0 = r16
            if (r13 >= r0) goto L_0x005c
            r0 = r17
            java.lang.Object r15 = r0.get(r13)     // Catch:{ all -> 0x012a }
            X.6Cm r15 = (X.C97716Cm) r15     // Catch:{ all -> 0x012a }
            java.util.Map r0 = r14.A0E     // Catch:{ all -> 0x012a }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ all -> 0x012a }
            kotlin.Pair r0 = X.C18180wK.A0p(r15, r0)     // Catch:{ all -> 0x012a }
            r1.add(r0)     // Catch:{ all -> 0x012a }
            int r13 = r13 + 1
            goto L_0x0040
        L_0x005c:
            java.util.Map r0 = r14.A0E     // Catch:{ all -> 0x012a }
            r0.clear()     // Catch:{ all -> 0x012a }
            goto L_0x0064
        L_0x0062:
            X.0ZV r1 = X.AnonymousClass0ZV.A00     // Catch:{ all -> 0x012a }
        L_0x0064:
            monitor-exit(r12)
            int r0 = r1.size()
        L_0x0069:
            if (r11 >= r0) goto L_0x008c
            r1.get(r11)
            int r11 = r11 + 1
            goto L_0x0069
        L_0x0071:
            X.AnonymousClass0OU.A00(r28)
            java.lang.Object r2 = r10.A06
            X.8sD r2 = (X.C148808sD) r2
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.LinkedHashSet r6 = X.C86134wK.A0u()
            java.util.LinkedHashSet r7 = X.C86134wK.A0u()
        L_0x008c:
            androidx.compose.runtime.Recomposer r1 = r10.A07
            java.lang.Object r12 = r1.A09
            monitor-enter(r12)
            monitor-exit(r12)
            r10.A06 = r2
            r10.A01 = r3
            r10.A02 = r4
            r10.A03 = r5
            r10.A04 = r6
            r10.A05 = r7
            r10.A00 = r8
            boolean r0 = androidx.compose.runtime.Recomposer.A05(r1)
            if (r0 != 0) goto L_0x00c4
            X.EnC r11 = X.C18220wO.A11(r10)
            monitor-enter(r12)
            boolean r0 = androidx.compose.runtime.Recomposer.A05(r1)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x00b9
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x012a }
            r11.resumeWith(r0)     // Catch:{ all -> 0x012a }
        L_0x00b6:
            kotlin.Unit r1 = kotlin.Unit.A00     // Catch:{ all -> 0x012a }
            goto L_0x00bc
        L_0x00b9:
            r1.A03 = r11     // Catch:{ all -> 0x012a }
            goto L_0x00b6
        L_0x00bc:
            monitor-exit(r12)
            java.lang.Object r0 = r11.A0B()
            if (r0 != r9) goto L_0x00c7
            goto L_0x00c6
        L_0x00c4:
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x00c6:
            r1 = r0
        L_0x00c7:
            if (r1 != r9) goto L_0x00cd
            return r9
        L_0x00ca:
            X.AnonymousClass0OU.A00(r28)
        L_0x00cd:
            androidx.compose.runtime.Recomposer r12 = r10.A07
            java.lang.Object r11 = r12.A09
            monitor-enter(r11)
            java.util.List r13 = r12.A0A     // Catch:{ all -> 0x012d }
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x012d }
            r14 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00e6
            X.7WG r0 = r12.A07     // Catch:{ all -> 0x012d }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x012d }
            if (r0 != 0) goto L_0x00e6
            r14 = 0
        L_0x00e6:
            r1 = 0
            if (r14 != 0) goto L_0x00fb
            androidx.compose.runtime.Recomposer.A03(r12)     // Catch:{ all -> 0x012d }
            boolean r0 = X.C18190wL.A1a(r13)     // Catch:{ all -> 0x012d }
            if (r0 != 0) goto L_0x00fb
            X.7WG r0 = r12.A07     // Catch:{ all -> 0x012d }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x012d }
            if (r0 != 0) goto L_0x00fb
            r1 = 1
        L_0x00fb:
            monitor-exit(r11)
            if (r1 != 0) goto L_0x008c
            kotlin.jvm.internal.KtLambdaShape4S0600000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape4S0600000_I2
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r20 = r3
            r21 = r4
            r22 = r12
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r10.A06 = r2
            r10.A01 = r3
            r10.A02 = r4
            r10.A03 = r5
            r10.A04 = r6
            r10.A05 = r7
            r0 = r18
            r10.A00 = r0
            java.lang.Object r0 = r2.DBB(r10, r1)
            if (r0 != r9) goto L_0x001e
            return r9
        L_0x012a:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x012d:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
