package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.C145968lP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import com.instagram.mainfeed.network.FeedCacheCoordinator;
import kotlin.Unit;

public class KtSLambdaShape0S0702000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0702000_I2(C145968lP r2, FeedCacheCoordinator feedCacheCoordinator, C146958n9 r4) {
        super(2, r4);
        this.A08 = feedCacheCoordinator;
        this.A02 = r2;
    }

    public final C146958n9 create(Object obj, C146958n9 r5) {
        if (this.A09 != 0) {
            return new KtSLambdaShape0S0702000_I2((C145968lP) this.A02, (FeedCacheCoordinator) this.A08, r5);
        }
        KtSLambdaShape0S0702000_I2 ktSLambdaShape0S0702000_I2 = new KtSLambdaShape0S0702000_I2(r5, (AnonymousClass0ZU) this.A02);
        ktSLambdaShape0S0702000_I2.A03 = obj;
        return ktSLambdaShape0S0702000_I2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ae A[Catch:{ all -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b5 A[Catch:{ all -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0282 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02a3 A[EDGE_INSN: B:154:0x02a3->B:111:0x02a3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02a2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02a3 A[EDGE_INSN: B:156:0x02a3->B:111:0x02a3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0250 A[Catch:{ all -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0259 A[Catch:{ all -> 0x030a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            r31 = this;
            r5 = r31
            r3 = r32
            int r0 = r5.A09
            if (r0 == 0) goto L_0x01a9
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A01
            r19 = 2
            r15 = 0
            r13 = 974459630(0x3a1512ee, float:5.6867197E-4)
            r14 = 1
            if (r0 == 0) goto L_0x00c1
            if (r0 != r14) goto L_0x02ef
            int r12 = r5.A00
            java.lang.Object r2 = r5.A07
            X.IlY r2 = (X.C35029IlY) r2
            java.lang.Object r0 = r5.A06
            X.8lP r0 = (X.C145968lP) r0
            java.lang.Object r6 = r5.A05
            com.instagram.mainfeed.network.FeedCacheCoordinator r6 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r6
            java.lang.Object r4 = r5.A04
            X.0Mo r4 = (X.C04180Mo) r4
            java.lang.Object r1 = r5.A03
            X.01V r1 = (X.AnonymousClass01V) r1
            X.AnonymousClass0OU.A00(r3)
        L_0x0030:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x007b
            java.util.ArrayList r8 = X.C18200wM.A0s(r3)
            int r7 = r3.size()
            r3 = 265(0x109, float:3.71E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r1.markerAnnotate((int) r13, (int) r12, (java.lang.String) r3, (int) r7)
            java.util.List r7 = r2.A01()
            java.util.List r3 = r6.A0A
            java.util.List r3 = X.AnonymousClass6TA.A00(r7, r3)
            r8.addAll(r15, r3)
            boolean r3 = X.C18190wL.A1a(r8)
            if (r3 == 0) goto L_0x007b
            r4.A00 = r15
            java.util.ArrayList r23 = X.C18200wM.A0s(r8)
            X.9vo r22 = X.C170939vo.LOCAL
            X.DpX r6 = r6.A07
            java.io.File r3 = r6.A03
            if (r3 != 0) goto L_0x0069
            r6.A01()
        L_0x0069:
            java.io.File r3 = r6.A03
            if (r3 == 0) goto L_0x00be
            long r24 = r3.lastModified()
        L_0x0071:
            r20 = r0
            r21 = r2
            r20.C2W(r21, r22, r23, r24)
            r0 = 0
            r6.A01 = r0
        L_0x007b:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r5.A08
            com.instagram.mainfeed.network.FeedCacheCoordinator r0 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r0
            X.DpX r2 = r0.A07
            java.lang.Object r3 = r5.A02
            X.8lP r3 = (X.C145968lP) r3
            r2.A01()
            X.IlY r4 = r2.A01
            if (r4 == 0) goto L_0x00b6
            java.util.List r6 = java.util.Collections.emptyList()
            X.9vo r5 = X.C170939vo.CACHED
            java.io.File r0 = r2.A03
            if (r0 != 0) goto L_0x009d
            r2.A01()
        L_0x009d:
            java.io.File r0 = r2.A03
            if (r0 == 0) goto L_0x00b3
            long r7 = r0.lastModified()
        L_0x00a5:
            r3.C2W(r4, r5, r6, r7)
            r0 = 0
            r2.A01 = r0
        L_0x00ab:
            r0 = r19
            r1.markerEnd(r13, r12, r0)
            kotlin.Unit r8 = kotlin.Unit.A00
        L_0x00b2:
            return r8
        L_0x00b3:
            r7 = -1
            goto L_0x00a5
        L_0x00b6:
            X.9vo r2 = X.C170939vo.CACHED
            java.lang.String r0 = "ColdStartFeedCache response is null"
            r3.C2V(r2, r0)
            goto L_0x00ab
        L_0x00be:
            r24 = -1
            goto L_0x0071
        L_0x00c1:
            X.AnonymousClass0OU.A00(r3)
            java.lang.Object r6 = r5.A08
            com.instagram.mainfeed.network.FeedCacheCoordinator r6 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r6
            com.instagram.service.session.UserSession r9 = r6.A09
            X.01V r1 = X.AnonymousClass01V.A0p
            java.util.concurrent.atomic.AtomicInteger r0 = com.instagram.mainfeed.network.FeedCacheCoordinator.A0E
            int r12 = r0.incrementAndGet()
            r1.markerStart((int) r13, (int) r12)
            java.lang.String r2 = "CACHE_NAME"
            java.lang.String r0 = "COLD_START"
            r1.markerAnnotate((int) r13, (int) r12, (java.lang.String) r2, (java.lang.String) r0)
            X.0Mo r4 = new X.0Mo
            r4.<init>()
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r2 = 36324252114231692(0x810cb70000218c, double:3.0349415308387027E-306)
            boolean r0 = X.C63803iN.A0E(r7, r9, r2)
            r0 = r0 ^ 1
            r4.A00 = r0
            r2 = 2342154642714657449(0x2081013d000a02a9, double:4.058491798764624E-152)
            boolean r0 = X.C63803iN.A0E(r7, r9, r2)
            if (r0 == 0) goto L_0x007b
            X.DpX r0 = r6.A07
            long r17 = java.lang.System.currentTimeMillis()
            java.io.File r2 = r0.A03
            if (r2 != 0) goto L_0x0108
            r0.A01()
        L_0x0108:
            java.io.File r2 = r0.A03
            if (r2 == 0) goto L_0x01a5
            long r2 = r2.lastModified()
        L_0x0110:
            long r17 = r17 - r2
            long r10 = r6.A06
            long r2 = r6.A05
            int r16 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r16 > 0) goto L_0x007b
            int r2 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x007b
            r2 = 36324252114297229(0x810cb70001218d, double:3.0349415308801485E-306)
            boolean r2 = X.C63803iN.A0E(r7, r9, r2)
            if (r2 != 0) goto L_0x007b
            X.IlY r2 = r0.A01
            if (r2 != 0) goto L_0x0130
            r0.A01()
        L_0x0130:
            X.IlY r2 = r0.A01
            if (r2 == 0) goto L_0x007b
            java.lang.Object r0 = r5.A02
            X.8lP r0 = (X.C145968lP) r0
            com.instagram.mainfeed.network.FlashFeedCache r3 = r6.A08
            r16 = r3
            if (r3 == 0) goto L_0x007b
            int r3 = r6.A04
            r17 = r3
            r10 = 36593108477477695(0x82013d0007033f, double:3.204967377553154E-306)
            long r25 = X.C63803iN.A03(r7, r9, r10)
            r10 = 36318840456024848(0x8107cb00091310, double:3.031519176397696E-306)
            boolean r3 = X.C63803iN.A0E(r7, r9, r10)
            if (r3 == 0) goto L_0x019e
            X.Iu1 r10 = X.C35393Iu1.A0S
            X.Iu1 r3 = X.C35393Iu1.A0T
            X.Iu1[] r3 = new X.C35393Iu1[]{r10, r3}
        L_0x015e:
            java.util.ArrayList r22 = X.C06750aI.A14(r3)
            r10 = 36593108477870915(0x82013d000d0343, double:3.204967377801828E-306)
            int r10 = X.C63803iN.A01(r7, r9, r10)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r10)
            r10 = 36318840455959311(0x8107cb0008130f, double:3.03151917635625E-306)
            boolean r7 = X.C63803iN.A0E(r7, r9, r10)
            r30 = r7 ^ 1
            r5.A03 = r1
            r5.A04 = r4
            r5.A05 = r6
            r5.A06 = r0
            r5.A07 = r2
            r5.A00 = r12
            r5.A01 = r14
            r23 = r5
            r24 = r17
            r27 = r15
            r28 = r15
            r29 = r14
            r20 = r16
            r21 = r3
            java.lang.Object r3 = r20.A01(r21, r22, r23, r24, r25, r27, r28, r29, r30)
            if (r3 != r8) goto L_0x0030
            return r8
        L_0x019e:
            X.Iu1 r3 = X.C35393Iu1.A0S
            X.Iu1[] r3 = new X.C35393Iu1[]{r3}
            goto L_0x015e
        L_0x01a5:
            r2 = -1
            goto L_0x0110
        L_0x01a9:
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A01
            r13 = 0
            r12 = 3
            r11 = 2
            r15 = 1
            if (r0 == 0) goto L_0x01e8
            if (r0 == r15) goto L_0x01d1
            if (r0 != r11) goto L_0x01d1
            int r1 = r5.A00
            java.lang.Object r14 = r5.A08
            java.lang.Object r7 = r5.A07
            X.8fj r7 = (X.C142868fj) r7
            java.lang.Object r10 = r5.A06
            X.Ewk r10 = (X.C27996Ewk) r10
            java.lang.Object r9 = r5.A05
            X.0YY r9 = (X.AnonymousClass0YY) r9
            java.lang.Object r6 = r5.A04
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r4 = r5.A03
            X.4r0 r4 = (X.C83234r0) r4
            goto L_0x0252
        L_0x01d1:
            java.lang.Object r14 = r5.A08
            java.lang.Object r7 = r5.A07
            X.8fj r7 = (X.C142868fj) r7
            java.lang.Object r10 = r5.A06
            X.Ewk r10 = (X.C27996Ewk) r10
            java.lang.Object r9 = r5.A05
            X.0YY r9 = (X.AnonymousClass0YY) r9
            java.lang.Object r6 = r5.A04
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r4 = r5.A03
            X.4r0 r4 = (X.C83234r0) r4
            goto L_0x0237
        L_0x01e8:
            X.AnonymousClass0OU.A00(r3)
            java.lang.Object r4 = r5.A03
            X.4r0 r4 = (X.C83234r0) r4
            java.util.LinkedHashSet r6 = X.C86134wK.A0u()
            r0 = 6
            kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2 r9 = X.C86154wM.A10(r6, r0)
            X.EnY r10 = new X.EnY
            r10.<init>()
            r0 = 13
            kotlin.jvm.internal.KtLambdaShape167S0100000_I2 r0 = X.C86164wN.A0u(r10, r0)
            X.8fj r7 = X.C121637Hc.A01(r0)
            androidx.compose.runtime.snapshots.Snapshot r0 = X.C122127Kl.A00()     // Catch:{ all -> 0x030a }
            androidx.compose.runtime.snapshots.Snapshot r2 = r0.A06(r9)     // Catch:{ all -> 0x030a }
            java.lang.Object r0 = r5.A02     // Catch:{ all -> 0x030a }
            X.0ZU r0 = (X.AnonymousClass0ZU) r0     // Catch:{ all -> 0x030a }
            androidx.compose.runtime.snapshots.Snapshot r1 = r2.A05()     // Catch:{ all -> 0x0301 }
            java.lang.Object r14 = r0.invoke()     // Catch:{ all -> 0x02fc }
            X.C86144wL.A1N(r1)     // Catch:{ all -> 0x0301 }
            r2.A0A()     // Catch:{ all -> 0x030a }
            r5.A03 = r4     // Catch:{ all -> 0x030a }
            r5.A04 = r6     // Catch:{ all -> 0x030a }
            r5.A05 = r9     // Catch:{ all -> 0x030a }
            r5.A06 = r10     // Catch:{ all -> 0x030a }
            r5.A07 = r7     // Catch:{ all -> 0x030a }
            r5.A08 = r14     // Catch:{ all -> 0x030a }
            r5.A01 = r15     // Catch:{ all -> 0x030a }
            java.lang.Object r0 = r4.emit(r14, r5)     // Catch:{ all -> 0x030a }
            if (r0 != r8) goto L_0x023a
            goto L_0x02f4
        L_0x0237:
            X.AnonymousClass0OU.A00(r3)     // Catch:{ all -> 0x030a }
        L_0x023a:
            r5.A03 = r4     // Catch:{ all -> 0x030a }
            r5.A04 = r6     // Catch:{ all -> 0x030a }
            r5.A05 = r9     // Catch:{ all -> 0x030a }
            r5.A06 = r10     // Catch:{ all -> 0x030a }
            r5.A07 = r7     // Catch:{ all -> 0x030a }
            r5.A08 = r14     // Catch:{ all -> 0x030a }
            r5.A00 = r13     // Catch:{ all -> 0x030a }
            r5.A01 = r11     // Catch:{ all -> 0x030a }
            java.lang.Object r3 = r10.CZF(r5)     // Catch:{ all -> 0x030a }
            if (r3 == r8) goto L_0x00b2
            r1 = 0
            goto L_0x0255
        L_0x0252:
            X.AnonymousClass0OU.A00(r3)     // Catch:{ all -> 0x030a }
        L_0x0255:
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x030a }
        L_0x0257:
            if (r1 != 0) goto L_0x02a5
            int r1 = r6.size()     // Catch:{ all -> 0x030a }
            int r0 = r3.size()     // Catch:{ all -> 0x030a }
            if (r1 >= r0) goto L_0x0283
            boolean r0 = r6 instanceof java.util.Collection     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x026e
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x026e
            goto L_0x02a3
        L_0x026e:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x030a }
        L_0x0272:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x030a }
            boolean r0 = r3.contains(r0)     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x0272
            goto L_0x02a5
        L_0x0283:
            boolean r0 = r3 instanceof java.util.Collection     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x028e
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x028e
            goto L_0x02a3
        L_0x028e:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x030a }
        L_0x0292:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x030a }
            boolean r0 = r6.contains(r0)     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x0292
            goto L_0x02a5
        L_0x02a3:
            r1 = 0
            goto L_0x02a6
        L_0x02a5:
            r1 = 1
        L_0x02a6:
            java.lang.Object r3 = r10.D7u()     // Catch:{ all -> 0x030a }
            boolean r0 = r3 instanceof X.C111626o2     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x02af
            r3 = 0
        L_0x02af:
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x030a }
            if (r3 != 0) goto L_0x0257
            if (r1 == 0) goto L_0x023a
            r6.clear()     // Catch:{ all -> 0x030a }
            androidx.compose.runtime.snapshots.Snapshot r0 = X.C122127Kl.A00()     // Catch:{ all -> 0x030a }
            androidx.compose.runtime.snapshots.Snapshot r3 = r0.A06(r9)     // Catch:{ all -> 0x030a }
            java.lang.Object r0 = r5.A02     // Catch:{ all -> 0x030a }
            X.0ZU r0 = (X.AnonymousClass0ZU) r0     // Catch:{ all -> 0x030a }
            androidx.compose.runtime.snapshots.Snapshot r2 = r3.A05()     // Catch:{ all -> 0x02fa }
            java.lang.Object r1 = r0.invoke()     // Catch:{ all -> 0x02f5 }
            X.C86144wL.A1N(r2)     // Catch:{ all -> 0x02fa }
            r3.A0A()     // Catch:{ all -> 0x030a }
            boolean r0 = X.C04220Ms.A0I(r1, r14)     // Catch:{ all -> 0x030a }
            if (r0 != 0) goto L_0x023a
            r5.A03 = r4     // Catch:{ all -> 0x030a }
            r5.A04 = r6     // Catch:{ all -> 0x030a }
            r5.A05 = r9     // Catch:{ all -> 0x030a }
            r5.A06 = r10     // Catch:{ all -> 0x030a }
            r5.A07 = r7     // Catch:{ all -> 0x030a }
            r5.A08 = r1     // Catch:{ all -> 0x030a }
            r5.A01 = r12     // Catch:{ all -> 0x030a }
            java.lang.Object r0 = r4.emit(r1, r5)     // Catch:{ all -> 0x030a }
            if (r0 == r8) goto L_0x00b2
            r14 = r1
            goto L_0x023a
        L_0x02ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x02f4:
            return r8
        L_0x02f5:
            r0 = move-exception
            X.C86144wL.A1N(r2)     // Catch:{ all -> 0x02fa }
            throw r0     // Catch:{ all -> 0x02fa }
        L_0x02fa:
            r0 = move-exception
            goto L_0x0306
        L_0x02fc:
            r0 = move-exception
            X.C86144wL.A1N(r1)     // Catch:{ all -> 0x0301 }
            throw r0     // Catch:{ all -> 0x0301 }
        L_0x0301:
            r0 = move-exception
            r2.A0A()     // Catch:{ all -> 0x030a }
            goto L_0x0309
        L_0x0306:
            r3.A0A()     // Catch:{ all -> 0x030a }
        L_0x0309:
            throw r0     // Catch:{ all -> 0x030a }
        L_0x030a:
            r0 = move-exception
            r7.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S0702000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S0702000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0702000_I2(C146958n9 r2, AnonymousClass0ZU r3) {
        super(2, r2);
        this.A02 = r3;
    }
}
