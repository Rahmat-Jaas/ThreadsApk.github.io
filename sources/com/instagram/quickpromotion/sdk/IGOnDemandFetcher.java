package com.instagram.quickpromotion.sdk;

import X.AnonymousClass0IB;
import X.AnonymousClass0YY;
import X.C57223Af;
import android.content.Context;

public final class IGOnDemandFetcher {
    public final AnonymousClass0IB A00;
    public final AnonymousClass0YY A01;
    public final Context A02;
    public final C57223Af A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d9, code lost:
        if (r10.A07.contains(r1) == false) goto L_0x01db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r15, X.AnonymousClass32X r16, com.instagram.quickpromotion.intf.QuickPromotionSurface r17, com.instagram.quickpromotion.sdk.IGOnDemandFetcher r18, X.C568338s r19, com.instagram.service.session.UserSession r20, X.C146958n9 r21, X.AnonymousClass0YY r22, boolean r23) {
        /*
            r5 = r21
            r3 = r18
            r4 = r15
            boolean r0 = r5 instanceof X.AnonymousClass4WQ
            if (r0 == 0) goto L_0x0109
            r8 = r5
            X.4WQ r8 = (X.AnonymousClass4WQ) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0109
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r8.A07
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r5 = 2
            r13 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r13) goto L_0x0220
            if (r0 != r5) goto L_0x0123
            java.lang.Object r4 = r8.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r4
            java.lang.Object r3 = r8.A01
            com.instagram.quickpromotion.sdk.IGOnDemandFetcher r3 = (com.instagram.quickpromotion.sdk.IGOnDemandFetcher) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x0030:
            X.38r r1 = (X.C568238r) r1
            java.lang.String r5 = r1.A01
            X.64g r2 = r1.A00
            if (r2 == 0) goto L_0x0110
            java.lang.String r1 = "5f56efad68e1edec7801f630b5c122704ec5378adbee6609a448f105f34a9c73"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2
            r0.<init>((X.C963064g) r2, (java.lang.String) r5, (java.lang.String) r1)
            X.40e r6 = new X.40e
            r6.<init>(r0)
            return r6
        L_0x0045:
            X.AnonymousClass0OU.A00(r1)
            boolean r0 = r3.A04
            r11 = r17
            r7 = r19
            r9 = r20
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = "using_slot_fetching"
            X.1u6 r1 = new X.1u6
            r1.<init>(r15, r0)
            X.0YY r0 = r3.A01
            X.4l7 r0 = (X.C80074l7) r0
            r0.invoke(r1)
            java.lang.Object r10 = r15.A00
            r2 = 0
            X.C04220Ms.A0B(r11, r2)
            X.C04220Ms.A0B(r10, r13)
            java.util.Map r0 = X.M5W.A01
            java.util.Iterator r15 = X.AnonymousClass0wJ.A0z(r0)
        L_0x006f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0128
            java.util.Map$Entry r0 = X.C18180wK.A0o(r15)
            java.lang.Object r12 = r0.getKey()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r12 = (com.instagram.quickpromotion.intf.QuickPromotionSlot) r12
            java.lang.Object r1 = r0.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x008e
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x008e
            goto L_0x006f
        L_0x008e:
            java.util.Iterator r14 = r1.iterator()
        L_0x0092:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r1 = r14.next()
            X.Lct r1 = (X.C40337Lct) r1
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = r1.A00
            if (r0 != r11) goto L_0x0092
            java.util.EnumSet r0 = r1.A01
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x0092
            goto L_0x0129
        L_0x00ab:
            java.lang.String r0 = "using_op_payload"
            X.1u6 r1 = new X.1u6
            r1.<init>(r15, r0)
            X.0YY r0 = r3.A01
            X.4l7 r0 = (X.C80074l7) r0
            r0.invoke(r1)
            android.content.Context r0 = r3.A02
            X.0IB r2 = r3.A00
            int r14 = X.C18190wL.A03(r0)
            java.lang.Object r10 = r15.A00
            com.google.common.collect.CompactHashMap r1 = new com.google.common.collect.CompactHashMap
            r1.<init>()
            X.C30590GMc.A01(r11, r10)
            java.lang.Object r0 = r1.get(r11)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x00db
            com.google.common.collect.CompactHashSet r0 = new com.google.common.collect.CompactHashSet
            r0.<init>()
            r1.put(r11, r0)
        L_0x00db:
            r0.add(r10)
            java.util.Set r0 = r1.entrySet()
            com.google.common.collect.ImmutableSetMultimap r0 = com.google.common.collect.ImmutableSetMultimap.A00(r0)
            X.35p r1 = new X.35p
            r1.<init>(r0)
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            X.EnU r0 = new X.EnU
            r0.<init>()
            r12 = r9
            r13 = r0
            r10 = r7
            r11 = r1
            r9 = r2
            X.AnonymousClass4KC.A00(r9, r10, r11, r12, r13, r14)
            r8.A01 = r3
            r8.A02 = r15
            r8.A00 = r5
            java.lang.Object r1 = r0.AA2(r8)
            if (r1 != r6) goto L_0x0030
            return r6
        L_0x0109:
            X.4WQ r8 = new X.4WQ
            r8.<init>(r3, r5)
            goto L_0x0017
        L_0x0110:
            java.lang.String r2 = "No QP response received"
            X.1u5 r1 = new X.1u5
            r1.<init>(r4, r2)
            X.0YY r0 = r3.A01
            X.4l7 r0 = (X.C80074l7) r0
            r0.invoke(r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r2)
            throw r0
        L_0x0123:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0128:
            r12 = 0
        L_0x0129:
            if (r12 == 0) goto L_0x0227
            X.3Af r0 = r3.A03
            X.C04220Ms.A0B(r9, r2)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r3 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1
            r3.<init>((com.instagram.quickpromotion.intf.QuickPromotionSlot) r12, (com.instagram.service.session.UserSession) r9)
            java.util.Map r2 = r0.A02
            java.lang.Object r10 = r2.get(r3)
            if (r10 != 0) goto L_0x0149
            android.content.Context r1 = r0.A00
            X.0IB r0 = r0.A01
            com.instagram.quickpromotion.sdk.IGSlotFetcher r10 = new com.instagram.quickpromotion.sdk.IGSlotFetcher
            r10.<init>(r1, r0, r12, r9)
            r2.put(r3, r10)
        L_0x0149:
            com.instagram.quickpromotion.sdk.IGSlotFetcher r10 = (com.instagram.quickpromotion.sdk.IGSlotFetcher) r10
            r8.A01 = r4
            r8.A02 = r7
            r12 = r16
            r8.A03 = r12
            r8.A04 = r11
            r9 = r22
            r8.A05 = r9
            r8.A06 = r10
            r8.A00 = r13
            X.8n9 r0 = X.C25598DoY.A02(r8)
            X.Eei r8 = new X.Eei
            r8.<init>(r0)
            X.35m r2 = new X.35m
            r2.<init>(r8)
            X.C18190wL.A1S(r7, r5, r12)
            r0 = 6
            X.C04220Ms.A0B(r9, r0)
            java.lang.Object r1 = r4.A00
            com.instagram.quickpromotion.intf.Trigger r1 = (com.instagram.quickpromotion.intf.Trigger) r1
            java.lang.String r0 = r7.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r13 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r13.<init>((com.instagram.quickpromotion.intf.QuickPromotionSurface) r11, (com.instagram.quickpromotion.intf.Trigger) r1, (java.lang.String) r0)
            monitor-enter(r10)
            java.util.Map r1 = r10.A06     // Catch:{ all -> 0x0224 }
            java.lang.Object r0 = r1.get(r13)     // Catch:{ all -> 0x0224 }
            if (r0 != 0) goto L_0x018e
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0224 }
            r0.<init>()     // Catch:{ all -> 0x0224 }
            r1.put(r13, r0)     // Catch:{ all -> 0x0224 }
        L_0x018e:
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0224 }
            r0.add(r2)     // Catch:{ all -> 0x0224 }
            monitor-exit(r10)
            java.lang.String r1 = "before_sync_block"
            X.1u6 r0 = new X.1u6
            r0.<init>(r4, r1)
            r9.invoke(r0)
            monitor-enter(r10)
            java.lang.String r1 = "inside_sync_block"
            X.1u6 r0 = new X.1u6     // Catch:{ all -> 0x0224 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0224 }
            r9.invoke(r0)     // Catch:{ all -> 0x0224 }
            java.lang.Integer r14 = r10.A01     // Catch:{ all -> 0x0224 }
            java.lang.Integer r11 = X.AnonymousClass006.A01     // Catch:{ all -> 0x0224 }
            r5 = 0
            r17 = r23
            if (r14 == r11) goto L_0x01dc
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x0224 }
            if (r14 == r0) goto L_0x01db
            if (r23 == 0) goto L_0x01b9
            goto L_0x01bc
        L_0x01b9:
            long r2 = r10.A03     // Catch:{ all -> 0x0224 }
            goto L_0x01be
        L_0x01bc:
            long r2 = r10.A02     // Catch:{ all -> 0x0224 }
        L_0x01be:
            long r0 = r10.A00     // Catch:{ all -> 0x0224 }
            long r0 = r0 + r2
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0224 }
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x01db
            java.lang.String r1 = r13.A02     // Catch:{ all -> 0x0224 }
            if (r1 != 0) goto L_0x01cf
            java.lang.String r1 = "empty_trigger_context"
        L_0x01cf:
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x0224 }
            if (r14 != r0) goto L_0x01dc
            java.util.Set r0 = r10.A07     // Catch:{ all -> 0x0224 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0224 }
            if (r0 != 0) goto L_0x01dc
        L_0x01db:
            r5 = 1
        L_0x01dc:
            if (r5 == 0) goto L_0x01e0
            r10.A01 = r11     // Catch:{ all -> 0x0224 }
        L_0x01e0:
            monitor-exit(r10)
            java.lang.String r1 = "after_sync_block"
            X.1u6 r0 = new X.1u6
            r0.<init>(r4, r1)
            r9.invoke(r0)
            java.lang.String r0 = "should_fetch_"
            java.lang.String r1 = X.AnonymousClass00U.A0o(r0, r5)
            X.1u6 r0 = new X.1u6
            r0.<init>(r4, r1)
            r9.invoke(r0)
            if (r5 == 0) goto L_0x0214
            X.4qz r2 = r12.A00
            r1 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0911000_I2 r11 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0911000_I2
            r16 = r9
            r14 = r7
            r15 = r1
            r13 = r10
            r12 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0 = 3
            X.C25237DiI.A00(r1, r1, r11, r2, r0)
        L_0x020d:
            java.lang.Object r1 = r8.A00()
            if (r1 != r6) goto L_0x0223
            return r6
        L_0x0214:
            monitor-enter(r10)
            java.lang.Integer r1 = r10.A01     // Catch:{ all -> 0x0224 }
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x0224 }
            if (r1 != r0) goto L_0x021e
            com.instagram.quickpromotion.sdk.IGSlotFetcher.A02(r4, r10, r9)     // Catch:{ all -> 0x0224 }
        L_0x021e:
            monitor-exit(r10)
            goto L_0x020d
        L_0x0220:
            X.AnonymousClass0OU.A00(r1)
        L_0x0223:
            return r1
        L_0x0224:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0227:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.sdk.IGOnDemandFetcher.A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2, X.32X, com.instagram.quickpromotion.intf.QuickPromotionSurface, com.instagram.quickpromotion.sdk.IGOnDemandFetcher, X.38s, com.instagram.service.session.UserSession, X.8n9, X.0YY, boolean):java.lang.Object");
    }

    public IGOnDemandFetcher(Context context, AnonymousClass0IB r3, AnonymousClass0YY r4, boolean z) {
        this.A02 = context;
        this.A00 = r3;
        this.A04 = z;
        this.A01 = r4;
        this.A03 = new C57223Af(context, r3);
    }
}
