package com.instagram.mainfeed.network;

import X.C18200wM;
import X.C25549Dnh;
import X.C86134wK;
import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public final class FlashFeedCache {
    public int A00;
    public Long A01;
    public Long A02;
    public final Context A03;
    public final UserSession A04;
    public final LinkedList A05 = new LinkedList();
    public final List A06;
    public final FeedCacheRoom A07;
    public final C25549Dnh A08 = new C25549Dnh();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r7.isEmpty() != false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e A[Catch:{ all -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[Catch:{ all -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082 A[Catch:{ all -> 0x00f6 }, LOOP:0: B:25:0x0080->B:26:0x0082, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2 A[Catch:{ all -> 0x00f6 }, LOOP:1: B:28:0x009c->B:30:0x00a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7 A[Catch:{ all -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.util.List r10, X.C146958n9 r11, boolean r12) {
        /*
            r9 = this;
            r3 = 2
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0511000_I2.A00(r3, r11)
            if (r0 == 0) goto L_0x0033
            r5 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape0S0511000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0511000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0033
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r6 = r5.A04
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r2) goto L_0x0039
            boolean r12 = r5.A06
            java.lang.Object r3 = r5.A03
            X.Dnh r3 = (X.C25549Dnh) r3
            java.lang.Object r10 = r5.A02
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r5 = r5.A01
            com.instagram.mainfeed.network.FlashFeedCache r5 = (com.instagram.mainfeed.network.FlashFeedCache) r5
            X.AnonymousClass0OU.A00(r6)
            goto L_0x0054
        L_0x0033:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0511000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0511000_I2
            r5.<init>(r9, r11, r3)
            goto L_0x0015
        L_0x0039:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x003e:
            X.AnonymousClass0OU.A00(r6)
            X.Dnh r3 = r9.A08
            r5.A01 = r9
            r5.A02 = r10
            r5.A03 = r3
            r5.A06 = r12
            r5.A00 = r2
            java.lang.Object r0 = r3.A00(r4, r5)
            if (r0 == r1) goto L_0x00fb
            r5 = r9
        L_0x0054:
            r0 = 0
            X.C04220Ms.A0B(r10, r0)     // Catch:{ all -> 0x00f6 }
            java.util.ArrayList r1 = X.C18200wM.A0s(r10)     // Catch:{ all -> 0x00f6 }
            if (r12 != 0) goto L_0x005f
            r2 = 0
        L_0x005f:
            if (r2 != 0) goto L_0x0069
            java.util.LinkedList r7 = r5.A05     // Catch:{ all -> 0x00f6 }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x0072
        L_0x0069:
            java.util.LinkedList r7 = r5.A05     // Catch:{ all -> 0x00f6 }
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x00f6 }
            r7.addFirst(r0)     // Catch:{ all -> 0x00f6 }
        L_0x0072:
            java.lang.Object r0 = r7.getFirst()     // Catch:{ all -> 0x00f6 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00f6 }
            r0.addAll(r1)     // Catch:{ all -> 0x00f6 }
            int r6 = r7.size()     // Catch:{ all -> 0x00f6 }
            r2 = 0
        L_0x0080:
            if (r2 >= r6) goto L_0x0097
            java.lang.Object r1 = X.C86164wN.A0b(r7, r2)     // Catch:{ all -> 0x00f6 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00f6 }
            java.util.List r0 = r5.A06     // Catch:{ all -> 0x00f6 }
            java.util.List r0 = X.AnonymousClass6TA.A00(r1, r0)     // Catch:{ all -> 0x00f6 }
            r0.size()     // Catch:{ all -> 0x00f6 }
            r7.set(r2, r0)     // Catch:{ all -> 0x00f6 }
            int r2 = r2 + 1
            goto L_0x0080
        L_0x0097:
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x00f6 }
            r6 = 0
        L_0x009c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00f6 }
            int r0 = X.C86144wL.A08(r0)     // Catch:{ all -> 0x00f6 }
            int r6 = r6 + r0
            goto L_0x009c
        L_0x00ac:
            int r0 = r5.A00     // Catch:{ all -> 0x00f6 }
            if (r6 <= r0) goto L_0x00ee
            int r0 = r7.size()     // Catch:{ all -> 0x00f6 }
            r8 = 1
            if (r0 <= r8) goto L_0x00ee
            java.lang.Object r0 = r7.getLast()     // Catch:{ all -> 0x00f6 }
            int r2 = X.C86144wL.A08(r0)     // Catch:{ all -> 0x00f6 }
            int r0 = r5.A00     // Catch:{ all -> 0x00f6 }
            int r0 = r6 - r0
            java.lang.Object r1 = r7.removeLast()     // Catch:{ all -> 0x00f6 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00f6 }
            if (r2 > r0) goto L_0x00d1
            int r0 = r1.size()     // Catch:{ all -> 0x00f6 }
            int r6 = r6 - r0
            goto L_0x00ac
        L_0x00d1:
            int r0 = r5.A00     // Catch:{ all -> 0x00f6 }
            int r0 = r6 - r0
            if (r0 <= 0) goto L_0x00ea
            X.C04220Ms.A04(r1)     // Catch:{ all -> 0x00f6 }
            boolean r0 = X.C18190wL.A1a(r1)     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00ea
            int r0 = X.C86144wL.A0C(r1, r8)     // Catch:{ all -> 0x00f6 }
            r1.remove(r0)     // Catch:{ all -> 0x00f6 }
            int r6 = r6 + -1
            goto L_0x00d1
        L_0x00ea:
            r7.addLast(r1)     // Catch:{ all -> 0x00f6 }
            goto L_0x00ac
        L_0x00ee:
            java.util.List r1 = r5.A05()     // Catch:{ all -> 0x00f6 }
            r3.A02(r4)
            return r1
        L_0x00f6:
            r0 = move-exception
            r3.A02(r4)
            throw r0
        L_0x00fb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.FlashFeedCache.A02(java.util.List, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C146958n9 r11, boolean r12) {
        /*
            r10 = this;
            r3 = 3
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2.A00(r3, r11)
            if (r0 == 0) goto L_0x00b0
            r4 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b0
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r5) goto L_0x00b7
            boolean r12 = r4.A04
            java.lang.Object r3 = r4.A01
            com.instagram.mainfeed.network.FlashFeedCache r3 = (com.instagram.mainfeed.network.FlashFeedCache) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x0029:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r3.A02 = r0
        L_0x0034:
            if (r12 == 0) goto L_0x003b
            java.util.LinkedList r0 = r3.A05
            r0.clear()
        L_0x003b:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x003d:
            return r3
        L_0x003e:
            X.AnonymousClass0OU.A00(r1)
            java.util.LinkedList r0 = r10.A05
            java.util.List r7 = r10.A06
            java.util.LinkedHashSet r2 = X.C86134wK.A0u()
            java.util.Iterator r9 = r0.iterator()
        L_0x004d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r9.next()
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = X.AnonymousClass6TA.A00(r0, r7)
            java.util.Iterator r8 = r0.iterator()
        L_0x0061:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r6 = r8.next()
            X.JrZ r6 = (X.C37415JrZ) r6
            X.Iu1 r1 = r6.A0P
            X.Iu1 r0 = X.C35393Iu1.A0S
            if (r1 != r0) goto L_0x007f
            X.BKU r0 = X.C86144wL.A0W(r6)
            if (r0 == 0) goto L_0x007f
            X.BKN r0 = r0.A0f
            java.lang.Long r0 = r0.A3w
            if (r0 != 0) goto L_0x008f
        L_0x007f:
            X.BKU r0 = X.C86144wL.A0W(r6)
            boolean r0 = X.C19540Ay1.A04(r0)
            if (r0 != 0) goto L_0x008f
            X.Iu1 r1 = r6.A0P
            X.Iu1 r0 = X.C35393Iu1.A0D
            if (r1 != r0) goto L_0x0061
        L_0x008f:
            r2.add(r6)
            goto L_0x0061
        L_0x0093:
            java.lang.Long r0 = r10.A01
            if (r0 != 0) goto L_0x009f
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x009f
            r3 = r10
            goto L_0x0034
        L_0x009f:
            com.instagram.mainfeed.network.FeedCacheRoom r0 = r10.A07
            r4.A01 = r10
            r4.A04 = r12
            r4.A00 = r5
            java.lang.Object r0 = r0.A01(r2, r4)
            if (r0 == r3) goto L_0x003d
            r3 = r10
            goto L_0x0029
        L_0x00b0:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2
            r4.<init>(r10, r11, r3)
            goto L_0x0015
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.FlashFeedCache.A03(X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068 A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069 A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C146958n9 r13, boolean r14) {
        /*
            r12 = this;
            r10 = 2
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2.A00(r10, r13)
            if (r0 == 0) goto L_0x0028
            r9 = r13
            kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2 r9 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r9.A03
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r9.A00
            r11 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0041
            if (r0 == r11) goto L_0x0033
            if (r0 != r10) goto L_0x002e
            java.lang.Object r6 = r9.A01
            X.Dnh r6 = (X.C25549Dnh) r6
            goto L_0x007c
        L_0x0028:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2 r9 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2
            r9.<init>(r12, r13, r10)
            goto L_0x0015
        L_0x002e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0033:
            boolean r14 = r9.A05
            java.lang.Object r6 = r9.A02
            X.Dnh r6 = (X.C25549Dnh) r6
            java.lang.Object r5 = r9.A01
            com.instagram.mainfeed.network.FlashFeedCache r5 = (com.instagram.mainfeed.network.FlashFeedCache) r5
            X.AnonymousClass0OU.A00(r1)
            goto L_0x0055
        L_0x0041:
            X.AnonymousClass0OU.A00(r1)
            X.Dnh r6 = r12.A08
            r9.A01 = r12
            r9.A02 = r6
            r9.A05 = r14
            r9.A00 = r11
            java.lang.Object r0 = r6.A00(r7, r9)
            if (r0 == r8) goto L_0x008a
            r5 = r12
        L_0x0055:
            java.lang.Long r0 = r5.A02     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0069
            long r3 = r0.longValue()     // Catch:{ all -> 0x0085 }
        L_0x005d:
            r0 = 500(0x1f4, double:2.47E-321)
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x007f
            goto L_0x006c
        L_0x0069:
            r3 = 0
            goto L_0x005d
        L_0x006c:
            if (r14 != 0) goto L_0x006f
            r11 = 0
        L_0x006f:
            r9.A01 = r6     // Catch:{ all -> 0x0085 }
            r9.A02 = r7     // Catch:{ all -> 0x0085 }
            r9.A00 = r10     // Catch:{ all -> 0x0085 }
            java.lang.Object r0 = r5.A03(r9, r11)     // Catch:{ all -> 0x0085 }
            if (r0 != r8) goto L_0x007f
            return r8
        L_0x007c:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ all -> 0x0085 }
        L_0x007f:
            kotlin.Unit r8 = kotlin.Unit.A00     // Catch:{ all -> 0x0085 }
            r6.A02(r7)
            return r8
        L_0x0085:
            r0 = move-exception
            r6.A02(r7)
            throw r0
        L_0x008a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.FlashFeedCache.A04(X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.mainfeed.network.FlashFeedCache r14, java.util.List r15, X.C146958n9 r16) {
        /*
            r3 = 16
            r4 = r16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3.A00(r3, r4)
            if (r0 == 0) goto L_0x00ad
            r8 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ad
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r8.A02
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r6) goto L_0x00b4
            java.lang.Object r14 = r8.A01
            com.instagram.mainfeed.network.FlashFeedCache r14 = (com.instagram.mainfeed.network.FlashFeedCache) r14
            X.AnonymousClass0OU.A00(r1)
        L_0x002a:
            java.util.List r7 = r14.A05()
            return r7
        L_0x002f:
            X.AnonymousClass0OU.A00(r1)
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.LinkedList r4 = r14.A05
            java.util.Iterator r13 = r4.iterator()
        L_0x0040:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r3 = r13.next()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r12 = r3.iterator()
        L_0x0050:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r10 = r12.next()
            X.JrZ r10 = (X.C37415JrZ) r10
            X.BKU r2 = X.C86144wL.A0W(r10)
            if (r2 == 0) goto L_0x0050
            boolean r0 = r15 instanceof java.util.Collection
            if (r0 == 0) goto L_0x006d
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x006d
            goto L_0x0050
        L_0x006d:
            java.util.Iterator r11 = r15.iterator()
        L_0x0071:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r11.next()
            java.lang.String r1 = r0.toString()
            X.BKN r0 = r2.A0f
            java.lang.String r0 = r0.A4e
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0071
            r5.add(r10)
            goto L_0x0050
        L_0x008d:
            r3.removeAll(r5)
            r5.clear()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0040
            r9.add(r3)
            goto L_0x0040
        L_0x009d:
            r4.removeAll(r9)
            com.instagram.mainfeed.network.FeedCacheRoom r0 = r14.A07
            r8.A01 = r14
            r8.A00 = r6
            java.lang.Object r0 = r0.A02(r15, r8)
            if (r0 != r7) goto L_0x002a
            return r7
        L_0x00ad:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r8 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3
            r8.<init>(r14, r4, r3)
            goto L_0x0018
        L_0x00b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.FlashFeedCache.A00(com.instagram.mainfeed.network.FlashFeedCache, java.util.List, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (((kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2) r9).A0D != 1) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2 A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb A[Catch:{ all -> 0x0135 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9 A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010d A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011d A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0124 A[Catch:{ all -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a A[Catch:{ all -> 0x0135 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.Integer r19, java.util.List r20, X.C146958n9 r21, int r22, long r23, boolean r25, boolean r26, boolean r27, boolean r28) {
        /*
            r18 = this;
            r12 = r20
            r11 = r19
            r14 = r22
            r15 = r23
            r5 = r28
            r7 = r25
            r3 = r26
            r4 = r27
            r1 = 1
            r9 = r21
            boolean r0 = r9 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2
            if (r0 == 0) goto L_0x001f
            r0 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2) r0
            int r2 = r0.A0D
            r0 = 1
            if (r2 == r1) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r8 = r18
            if (r0 == 0) goto L_0x0050
            r13 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2 r13 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2) r13
            int r6 = r13.A01
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r2
            if (r0 == 0) goto L_0x0050
            int r6 = r6 - r2
            r13.A01 = r6
        L_0x0032:
            java.lang.Object r0 = r13.A07
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r13.A01
            r9 = 2
            r17 = 1
            if (r2 == 0) goto L_0x007b
            if (r2 == r1) goto L_0x005b
            if (r2 != r9) goto L_0x0056
            boolean r4 = r13.A0B
            boolean r3 = r13.A0A
            boolean r7 = r13.A09
            java.lang.Object r2 = r13.A04
            X.Dnh r2 = (X.C25549Dnh) r2
            java.lang.Object r1 = r13.A03
            com.instagram.mainfeed.network.FlashFeedCache r1 = (com.instagram.mainfeed.network.FlashFeedCache) r1
            goto L_0x00bc
        L_0x0050:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2 r13 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2
            r13.<init>(r8, r9, r1)
            goto L_0x0032
        L_0x0056:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0a()
            throw r1
        L_0x005b:
            boolean r5 = r13.A0C
            boolean r4 = r13.A0B
            boolean r3 = r13.A0A
            boolean r7 = r13.A09
            long r15 = r13.A02
            int r14 = r13.A00
            java.lang.Object r2 = r13.A06
            X.Dnh r2 = (X.C25549Dnh) r2
            java.lang.Object r11 = r13.A05
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r12 = r13.A04
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r1 = r13.A03
            com.instagram.mainfeed.network.FlashFeedCache r1 = (com.instagram.mainfeed.network.FlashFeedCache) r1
            X.AnonymousClass0OU.A00(r0)
            goto L_0x009e
        L_0x007b:
            X.AnonymousClass0OU.A00(r0)
            X.Dnh r2 = r8.A08
            r13.A03 = r8
            r13.A04 = r12
            r13.A05 = r11
            r13.A06 = r2
            r13.A00 = r14
            r13.A02 = r15
            r13.A09 = r7
            r13.A0A = r3
            r13.A0B = r4
            r13.A0C = r5
            r13.A01 = r1
            r0 = 0
            java.lang.Object r0 = r2.A00(r0, r13)
            if (r0 == r6) goto L_0x013d
            r1 = r8
        L_0x009e:
            com.instagram.mainfeed.network.FeedCacheRoom r10 = r1.A07     // Catch:{ all -> 0x0135 }
            if (r5 != 0) goto L_0x00a4
            r17 = 0
        L_0x00a4:
            r13.A03 = r1     // Catch:{ all -> 0x0135 }
            r13.A04 = r2     // Catch:{ all -> 0x0135 }
            r0 = 0
            r13.A05 = r0     // Catch:{ all -> 0x0138 }
            r13.A06 = r0     // Catch:{ all -> 0x0138 }
            r13.A09 = r7     // Catch:{ all -> 0x0135 }
            r13.A0A = r3     // Catch:{ all -> 0x0135 }
            r13.A0B = r4     // Catch:{ all -> 0x0135 }
            r13.A01 = r9     // Catch:{ all -> 0x0135 }
            java.lang.Object r0 = r10.A00(r11, r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0135 }
            if (r0 != r6) goto L_0x00bf
            return r6
        L_0x00bc:
            X.AnonymousClass0OU.A00(r0)     // Catch:{ all -> 0x0135 }
        L_0x00bf:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0135 }
            java.util.List r5 = r1.A06     // Catch:{ all -> 0x0135 }
            java.util.List r6 = X.AnonymousClass6TA.A00(r0, r5)     // Catch:{ all -> 0x0135 }
            if (r4 == 0) goto L_0x0107
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0135 }
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0135 }
            java.util.Iterator r8 = r6.iterator()     // Catch:{ all -> 0x0135 }
        L_0x00d5:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0103
            java.lang.Object r6 = r8.next()     // Catch:{ all -> 0x0135 }
            X.JrZ r6 = (X.C37415JrZ) r6     // Catch:{ all -> 0x0135 }
            X.BKU r5 = X.C86144wL.A0W(r6)     // Catch:{ all -> 0x0135 }
            if (r5 == 0) goto L_0x00ff
            X.K2e r0 = X.C37744K2e.A01()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x00ff
            com.instagram.service.session.UserSession r0 = r1.A04     // Catch:{ all -> 0x0135 }
            X.JSE r4 = X.AnonymousClass6SP.A00(r0)     // Catch:{ all -> 0x0135 }
            android.content.Context r0 = r1.A03     // Catch:{ all -> 0x0135 }
            boolean r0 = r4.A00(r0, r5)     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x00ff
            r10.add(r6)     // Catch:{ all -> 0x0135 }
            goto L_0x00d5
        L_0x00ff:
            r9.add(r6)     // Catch:{ all -> 0x0135 }
            goto L_0x00d5
        L_0x0103:
            r10.addAll(r9)     // Catch:{ all -> 0x0135 }
            r6 = r10
        L_0x0107:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0135 }
            if (r0 != 0) goto L_0x011b
            r6.size()     // Catch:{ all -> 0x0135 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0135 }
            java.lang.Long r0 = new java.lang.Long     // Catch:{ all -> 0x0135 }
            r0.<init>(r4)     // Catch:{ all -> 0x0135 }
            r1.A01 = r0     // Catch:{ all -> 0x0135 }
        L_0x011b:
            if (r7 == 0) goto L_0x0122
            java.util.LinkedList r0 = r1.A05     // Catch:{ all -> 0x0135 }
            r0.addLast(r6)     // Catch:{ all -> 0x0135 }
        L_0x0122:
            if (r3 == 0) goto L_0x012a
            java.util.List r1 = r1.A05()     // Catch:{ all -> 0x0135 }
            r0 = 0
            goto L_0x012f
        L_0x012a:
            r0 = 0
            java.util.List r1 = X.AnonymousClass00J.A0N(r6)     // Catch:{ all -> 0x0133 }
        L_0x012f:
            r2.A02(r0)
            return r1
        L_0x0133:
            r1 = move-exception
            goto L_0x0139
        L_0x0135:
            r1 = move-exception
            r0 = 0
            goto L_0x0139
        L_0x0138:
            r1 = move-exception
        L_0x0139:
            r2.A02(r0)
            throw r1
        L_0x013d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.FlashFeedCache.A01(java.lang.Integer, java.util.List, X.8n9, int, long, boolean, boolean, boolean, boolean):java.lang.Object");
    }

    public FlashFeedCache(Context context, UserSession userSession, List list, int i) {
        this.A03 = context;
        this.A04 = userSession;
        this.A00 = i;
        this.A06 = list;
        this.A07 = new FeedCacheRoom(userSession);
    }

    public final List A05() {
        LinkedHashSet A0u = C86134wK.A0u();
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            A0u.addAll((Collection) it.next());
        }
        return C18200wM.A0s(A0u);
    }
}
