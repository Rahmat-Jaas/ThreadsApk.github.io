package com.instagram.quickpromotion.sdk;

import X.AnonymousClass006;
import X.AnonymousClass0IB;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C25549Dnh;
import X.C28341u6;
import X.C560235m;
import X.C677240d;
import android.content.Context;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

public final class IGSlotFetcher {
    public long A00;
    public Integer A01;
    public final long A02 = TimeUnit.SECONDS.toMillis(10);
    public final long A03 = C18230wP.A07();
    public final QuickPromotionSlot A04;
    public final Map A05;
    public final Map A06;
    public final Set A07;
    public final C25549Dnh A08;
    public final Context A09;
    public final AnonymousClass0IB A0A;
    public final UserSession A0B;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.quickpromotion.sdk.IGSlotFetcher r14, X.C568338s r15, X.C146958n9 r16, boolean r17) {
        /*
            r3 = 45
            r4 = r16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3.A00(r3, r4)
            r7 = r14
            if (r0 == 0) goto L_0x011a
            r6 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x011a
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r6.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 != r4) goto L_0x0121
            X.AnonymousClass0OU.A00(r1)
        L_0x0027:
            X.38r r1 = (X.C568238r) r1
            X.64g r4 = r1.A00
            if (r4 != 0) goto L_0x0033
            com.google.common.collect.ImmutableMap r5 = com.google.common.collect.RegularImmutableMap.A02
        L_0x002f:
            X.C04220Ms.A06(r5)
            return r5
        L_0x0033:
            com.google.common.collect.ImmutableMap$Builder r3 = new com.google.common.collect.ImmutableMap$Builder
            r3.<init>()
            java.lang.String r2 = r1.A01
            r1 = 29
            kotlin.jvm.internal.KtLambdaShape169S0100000_I2_2 r0 = new kotlin.jvm.internal.KtLambdaShape169S0100000_I2_2
            r0.<init>(r3, r1)
            X.C36812St.A00(r4, r2, r0)
            com.google.common.collect.ImmutableMap r5 = r3.build()
            goto L_0x002f
        L_0x0049:
            X.AnonymousClass0OU.A00(r1)
            r13 = r15
            java.lang.String r9 = r15.A01
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r14.A04
            java.util.Map r0 = X.M5W.A01
            java.lang.Object r1 = r0.get(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            if (r1 != 0) goto L_0x00c8
            X.4To r8 = X.AnonymousClass4To.A00()
        L_0x005f:
            com.google.common.collect.CompactHashMap r10 = new com.google.common.collect.CompactHashMap
            r10.<init>()
            if (r17 == 0) goto L_0x00c5
            long r2 = r14.A02
        L_0x0068:
            long r0 = r14.A00
            long r0 = r0 + r2
            long r11 = java.lang.System.currentTimeMillis()
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            boolean r12 = X.C18180wK.A1X(r2)
            java.util.Iterator r11 = X.AnonymousClass0wJ.A0z(r8)
        L_0x0079:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.util.Map$Entry r0 = X.C18180wK.A0o(r11)
            java.lang.Object r8 = r0.getKey()
            com.instagram.quickpromotion.intf.QuickPromotionSurface r8 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r8
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x0093:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r2 = r3.next()
            com.instagram.quickpromotion.intf.Trigger r2 = (com.instagram.quickpromotion.intf.Trigger) r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r1.<init>((com.instagram.quickpromotion.intf.QuickPromotionSurface) r8, (com.instagram.quickpromotion.intf.Trigger) r2, (java.lang.String) r9)
            java.util.Map r0 = r14.A05
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00ae
            if (r12 == 0) goto L_0x0093
        L_0x00ae:
            X.C30590GMc.A01(r8, r2)
            java.lang.Object r0 = r10.get(r8)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x00c1
            com.google.common.collect.CompactHashSet r0 = new com.google.common.collect.CompactHashSet
            r0.<init>()
            r10.put(r8, r0)
        L_0x00c1:
            r0.add(r2)
            goto L_0x0093
        L_0x00c5:
            long r2 = r14.A03
            goto L_0x0068
        L_0x00c8:
            r0 = 10
            int r0 = X.C02260Al.A0z(r1, r0)
            int r0 = X.AnonymousClass4WK.A0L(r0)
            java.util.LinkedHashMap r8 = X.C18190wL.A0v(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x00da:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r2.next()
            X.Lct r0 = (X.C40337Lct) r0
            com.instagram.quickpromotion.intf.QuickPromotionSurface r1 = r0.A00
            java.util.EnumSet r0 = r0.A01
            r8.put(r1, r0)
            goto L_0x00da
        L_0x00ee:
            java.util.Set r0 = r10.entrySet()
            com.google.common.collect.ImmutableSetMultimap r1 = com.google.common.collect.ImmutableSetMultimap.A00(r0)
            android.content.Context r0 = r14.A09
            X.0IB r12 = r14.A0A
            int r17 = X.C18190wL.A03(r0)
            X.35p r14 = new X.35p
            r14.<init>(r1)
            X.EnU r0 = new X.EnU
            r0.<init>()
            com.instagram.service.session.UserSession r15 = r7.A0B
            r16 = r0
            X.AnonymousClass4KC.A00(r12, r13, r14, r15, r16, r17)
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r1 = r0.AA2(r6)
            if (r1 != r5) goto L_0x0027
            return r5
        L_0x011a:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3
            r6.<init>(r14, r4, r3)
            goto L_0x0019
        L_0x0121:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.sdk.IGSlotFetcher.A00(com.instagram.quickpromotion.sdk.IGSlotFetcher, X.38s, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.quickpromotion.sdk.IGSlotFetcher r8, X.C568338s r9, X.C146958n9 r10, boolean r11) {
        /*
            r3 = 21
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2.A00(r3, r10)
            if (r0 == 0) goto L_0x00b8
            r4 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b8
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A03
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x00a8
            if (r1 != r0) goto L_0x00c2
            java.lang.Object r9 = r4.A02
            X.38s r9 = (X.C568338s) r9
            java.lang.Object r8 = r4.A01
            com.instagram.quickpromotion.sdk.IGSlotFetcher r8 = (com.instagram.quickpromotion.sdk.IGSlotFetcher) r8
            X.AnonymousClass0OU.A00(r3)
        L_0x002c:
            com.google.common.collect.ImmutableMap r3 = (com.google.common.collect.ImmutableMap) r3
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0036:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.util.Map$Entry r0 = X.C18180wK.A0o(r7)
            java.lang.Object r5 = r0.getKey()
            com.instagram.quickpromotion.intf.QuickPromotionSurface r5 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r5
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            X.C04220Ms.A04(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0053:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r4 = r6.next()
            X.18L r4 = (X.AnonymousClass18L) r4
            X.1u0 r0 = r4.A01
            java.util.List r0 = r0.A0F
            java.util.EnumSet r0 = java.util.EnumSet.copyOf(r0)
            X.C04220Ms.A06(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x006e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r1 = r3.next()
            com.instagram.quickpromotion.intf.Trigger r1 = (com.instagram.quickpromotion.intf.Trigger) r1
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = r8.A04
            X.C04220Ms.A04(r5)
            X.C04220Ms.A04(r1)
            java.util.EnumSet r0 = X.M5W.A00(r0, r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = r9.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r2.<init>((com.instagram.quickpromotion.intf.QuickPromotionSurface) r5, (com.instagram.quickpromotion.intf.Trigger) r1, (java.lang.String) r0)
            java.util.Map r1 = r8.A05
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L_0x00a2
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r1.put(r2, r0)
        L_0x00a2:
            java.util.List r0 = (java.util.List) r0
            r0.add(r4)
            goto L_0x006e
        L_0x00a8:
            X.AnonymousClass0OU.A00(r3)
            r4.A01 = r8
            r4.A02 = r9
            r4.A00 = r0
            java.lang.Object r3 = A00(r8, r9, r4, r11)
            if (r3 != r2) goto L_0x002c
            return r2
        L_0x00b8:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2
            r4.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x00bf:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x00c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.sdk.IGSlotFetcher.A01(com.instagram.quickpromotion.sdk.IGSlotFetcher, X.38s, X.8n9, boolean):java.lang.Object");
    }

    public static final void A02(KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2, IGSlotFetcher iGSlotFetcher, AnonymousClass0YY r8) {
        r8.invoke(new C28341u6(ktCSuperShape0S2100000_I2, "make_pending_callbacks"));
        Map map = iGSlotFetcher.A06;
        LinkedHashMap A0y = C18220wO.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            if (C18190wL.A1a((Collection) A0o.getValue())) {
                C18210wN.A1Q(A0y, A0o);
            }
        }
        ArrayList A0k = C18240wQ.A0k(A0y.size());
        Iterator A0u = C18190wL.A0u(A0y);
        while (A0u.hasNext()) {
            Map.Entry A0o2 = C18180wK.A0o(A0u);
            Object key = A0o2.getKey();
            Object value = A0o2.getValue();
            List list = (List) iGSlotFetcher.A05.get(key);
            if (list == null) {
                list = AnonymousClass0ZV.A00;
            }
            A0k.add(C18180wK.A0p(new C677240d(new KtCSuperShape0S1100000_I2(list, "5f56efad68e1edec7801f630b5c122704ec5378adbee6609a448f105f34a9c73", 45)), value));
        }
        Iterator it = A0k.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object obj = pair.A00;
            Set<C560235m> set = (Set) pair.A01;
            for (C560235m r1 : set) {
                C04220Ms.A0B(obj, 0);
                r1.A00.resumeWith(obj);
            }
            set.clear();
        }
    }

    public IGSlotFetcher(Context context, AnonymousClass0IB r5, QuickPromotionSlot quickPromotionSlot, UserSession userSession) {
        this.A04 = quickPromotionSlot;
        this.A0B = userSession;
        this.A09 = context;
        this.A0A = r5;
        Map synchronizedMap = Collections.synchronizedMap(C18220wO.A0y());
        C04220Ms.A06(synchronizedMap);
        this.A05 = synchronizedMap;
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        C04220Ms.A06(synchronizedSet);
        this.A07 = synchronizedSet;
        Map synchronizedMap2 = Collections.synchronizedMap(C18220wO.A0y());
        C04220Ms.A06(synchronizedMap2);
        this.A06 = synchronizedMap2;
        this.A01 = AnonymousClass006.A00;
        this.A08 = new C25549Dnh();
    }
}
