package com.instagram.barcelona.feed.data;

import X.AnonymousClass00J;
import X.AnonymousClass0wJ;
import X.AnonymousClass6W1;
import X.C107796hK;
import X.C25549Dnh;
import X.C41836MeS;
import X.C86144wL;
import android.content.Context;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class BarcelonaFeedCache {
    public int A00;
    public Long A01;
    public Long A02;
    public final Context A03;
    public final UserSession A04;
    public final LinkedList A05 = new LinkedList();
    public final CopyOnWriteArrayList A06;
    public final BarcelonaFeedCacheRoom A07;
    public final List A08;
    public final C25549Dnh A09 = new C25549Dnh();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.barcelona.feed.data.BarcelonaFeedCache r10, X.C146958n9 r11) {
        /*
            r3 = 46
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r11)
            if (r0 == 0) goto L_0x009c
            r6 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r7 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r7) goto L_0x00a2
            java.lang.Object r10 = r6.A01
            com.instagram.barcelona.feed.data.BarcelonaFeedCache r10 = (com.instagram.barcelona.feed.data.BarcelonaFeedCache) r10
            X.AnonymousClass0OU.A00(r1)
        L_0x0028:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r10.A02 = r0
        L_0x0033:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0036:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Long r0 = r10.A02
            long r3 = X.C86134wK.A0C(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0033
            java.util.LinkedList r0 = r10.A05
            java.util.List r9 = r10.A08
            java.util.LinkedHashSet r4 = X.C86134wK.A0u()
            java.util.Iterator r8 = r0.iterator()
        L_0x0056:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r8.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = A01(r0, r9)
            java.util.Iterator r3 = r0.iterator()
        L_0x006e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r2 = r3.next()
            X.JrZ r2 = (X.C37415JrZ) r2
            X.Iu1 r1 = r2.A0P
            X.Iu1 r0 = X.C35393Iu1.A0q
            if (r1 != r0) goto L_0x006e
            r4.add(r2)
            goto L_0x006e
        L_0x0084:
            java.lang.Long r0 = r10.A01
            if (r0 != 0) goto L_0x008f
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x008f
            goto L_0x0033
        L_0x008f:
            com.instagram.barcelona.feed.data.BarcelonaFeedCacheRoom r0 = r10.A07
            r6.A01 = r10
            r6.A00 = r7
            java.lang.Object r0 = r0.A01(r4, r6)
            if (r0 != r5) goto L_0x0028
            return r5
        L_0x009c:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r6 = X.C86164wN.A0n(r10, r11, r3)
            goto L_0x0016
        L_0x00a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.data.BarcelonaFeedCache.A00(com.instagram.barcelona.feed.data.BarcelonaFeedCache, X.8n9):java.lang.Object");
    }

    private final void A02() {
        LinkedList linkedList = this.A05;
        int size = linkedList.size();
        for (int i = 0; i < size; i++) {
            List A012 = A01((List) ((KtCSuperShape0S2100000_I2) linkedList.get(i)).A00, this.A08);
            A012.size();
            linkedList.set(i, new KtCSuperShape0S2100000_I2(A012, ((KtCSuperShape0S2100000_I2) linkedList.get(0)).A01, ((KtCSuperShape0S2100000_I2) linkedList.get(0)).A02, 12));
        }
    }

    private final void A03() {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            C107796hK r0 = (C107796hK) it.next();
            AnonymousClass6W1.A00(BarcelonaFeedRepository.A00(r0.A00.A01.A00()), r0.A01);
        }
    }

    private final void A04() {
        LinkedList linkedList = this.A05;
        Iterator it = linkedList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += C86144wL.A08(((KtCSuperShape0S2100000_I2) it.next()).A00);
        }
        while (true) {
            int i2 = this.A00;
            if (i > i2 && linkedList.size() > 1) {
                int i3 = i - i2;
                int A082 = C86144wL.A08(((KtCSuperShape0S2100000_I2) linkedList.getLast()).A00);
                KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2 = (KtCSuperShape0S2100000_I2) linkedList.removeLast();
                if (A082 >= i3) {
                    List list = (List) ktCSuperShape0S2100000_I2.A00;
                    linkedList.addLast(new KtCSuperShape0S2100000_I2(AnonymousClass00J.A0Q(list, C86144wL.A0C(list, i3)), 6, 12));
                } else {
                    i3 = C86144wL.A08(ktCSuperShape0S2100000_I2.A00);
                }
                i -= i3;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (((kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2) r8).A0D != 0) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4 A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4 A[Catch:{ all -> 0x0165 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2 A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0116 A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0126 A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0135 A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0158 A[Catch:{ all -> 0x0165 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.Integer r22, java.util.List r23, X.C146958n9 r24, int r25, boolean r26) {
        /*
            r21 = this;
            r1 = r23
            r2 = r22
            r17 = r25
            r7 = r26
            r4 = 0
            r12 = 0
            r8 = r24
            boolean r0 = r8 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2
            if (r0 == 0) goto L_0x0019
            r0 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2) r0
            int r3 = r0.A0D
            r0 = 1
            if (r3 == r12) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r13 = r21
            if (r0 == 0) goto L_0x0049
            r11 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2 r11 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2) r11
            int r6 = r11.A01
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r3
            if (r0 == 0) goto L_0x0049
            int r6 = r6 - r3
            r11.A01 = r6
        L_0x002c:
            java.lang.Object r0 = r11.A07
            X.D0E r10 = X.D0E.COROUTINE_SUSPENDED
            int r3 = r11.A01
            r9 = 2
            r8 = 1
            if (r3 == 0) goto L_0x0076
            if (r3 == r8) goto L_0x0054
            if (r3 != r9) goto L_0x004f
            boolean r6 = r11.A0B
            boolean r5 = r11.A0A
            boolean r4 = r11.A09
            java.lang.Object r3 = r11.A04
            X.Dnh r3 = (X.C25549Dnh) r3
            java.lang.Object r12 = r11.A03
            com.instagram.barcelona.feed.data.BarcelonaFeedCache r12 = (com.instagram.barcelona.feed.data.BarcelonaFeedCache) r12
            goto L_0x00c5
        L_0x0049:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2 r11 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0642100_I2
            r11.<init>(r13, r8, r12)
            goto L_0x002c
        L_0x004f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0054:
            boolean r7 = r11.A0C
            boolean r6 = r11.A0B
            boolean r5 = r11.A0A
            boolean r4 = r11.A09
            long r14 = r11.A02
            int r1 = r11.A00
            r17 = r1
            java.lang.Object r3 = r11.A06
            X.Dnh r3 = (X.C25549Dnh) r3
            java.lang.Object r2 = r11.A05
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r1 = r11.A04
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r12 = r11.A03
            com.instagram.barcelona.feed.data.BarcelonaFeedCache r12 = (com.instagram.barcelona.feed.data.BarcelonaFeedCache) r12
            X.AnonymousClass0OU.A00(r0)
            goto L_0x00a0
        L_0x0076:
            X.AnonymousClass0OU.A00(r0)
            X.Dnh r3 = r13.A09
            r11.A03 = r13
            r11.A04 = r1
            r11.A05 = r2
            r11.A06 = r3
            r0 = r17
            r11.A00 = r0
            r14 = 0
            r11.A02 = r4
            r4 = 0
            r11.A09 = r12
            r5 = 0
            r11.A0A = r12
            r6 = 0
            r11.A0B = r12
            r11.A0C = r7
            r11.A01 = r8
            r0 = 0
            java.lang.Object r0 = r3.A00(r0, r11)
            if (r0 == r10) goto L_0x016d
            r12 = r13
        L_0x00a0:
            com.instagram.barcelona.feed.data.BarcelonaFeedCacheRoom r13 = r12.A07     // Catch:{ all -> 0x0165 }
            if (r7 != 0) goto L_0x00a5
            r8 = 0
        L_0x00a5:
            r11.A03 = r12     // Catch:{ all -> 0x0165 }
            r11.A04 = r3     // Catch:{ all -> 0x0165 }
            r11.A05 = r12     // Catch:{ all -> 0x0165 }
            r7 = 0
            r11.A06 = r7     // Catch:{ all -> 0x0168 }
            r11.A09 = r4     // Catch:{ all -> 0x0165 }
            r11.A0A = r5     // Catch:{ all -> 0x0165 }
            r11.A0B = r6     // Catch:{ all -> 0x0165 }
            r11.A01 = r9     // Catch:{ all -> 0x0165 }
            r20 = r8
            r18 = r14
            r16 = r11
            r14 = r2
            r15 = r1
            java.lang.Object r0 = r13.A00(r14, r15, r16, r17, r18, r20)     // Catch:{ all -> 0x0165 }
            if (r0 != r10) goto L_0x00c8
            return r10
        L_0x00c5:
            X.AnonymousClass0OU.A00(r0)     // Catch:{ all -> 0x0165 }
        L_0x00c8:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0165 }
            java.util.List r1 = r12.A08     // Catch:{ all -> 0x0165 }
            java.util.List r9 = A01(r0, r1)     // Catch:{ all -> 0x0165 }
            if (r6 == 0) goto L_0x0110
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0165 }
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0165 }
            java.util.Iterator r7 = r9.iterator()     // Catch:{ all -> 0x0165 }
        L_0x00de:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x010c
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x0165 }
            X.JrZ r6 = (X.C37415JrZ) r6     // Catch:{ all -> 0x0165 }
            X.BKU r2 = X.C86144wL.A0W(r6)     // Catch:{ all -> 0x0165 }
            if (r2 == 0) goto L_0x0108
            X.K2e r0 = X.C37744K2e.A01()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0108
            com.instagram.service.session.UserSession r0 = r12.A04     // Catch:{ all -> 0x0165 }
            X.JSE r1 = X.AnonymousClass6SP.A00(r0)     // Catch:{ all -> 0x0165 }
            android.content.Context r0 = r12.A03     // Catch:{ all -> 0x0165 }
            boolean r0 = r1.A00(r0, r2)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0108
            r10.add(r6)     // Catch:{ all -> 0x0165 }
            goto L_0x00de
        L_0x0108:
            r8.add(r6)     // Catch:{ all -> 0x0165 }
            goto L_0x00de
        L_0x010c:
            r10.addAll(r8)     // Catch:{ all -> 0x0165 }
            r9 = r10
        L_0x0110:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0165 }
            if (r0 != 0) goto L_0x0124
            r9.size()     // Catch:{ all -> 0x0165 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0165 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x0165 }
            r2.<init>(r0)     // Catch:{ all -> 0x0165 }
            r12.A01 = r2     // Catch:{ all -> 0x0165 }
        L_0x0124:
            if (r4 == 0) goto L_0x0133
            java.util.LinkedList r4 = r12.A05     // Catch:{ all -> 0x0165 }
            r2 = 6
            r1 = 12
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2     // Catch:{ all -> 0x0165 }
            r0.<init>((java.util.List) r9, (int) r2, (int) r1)     // Catch:{ all -> 0x0165 }
            r4.addLast(r0)     // Catch:{ all -> 0x0165 }
        L_0x0133:
            if (r5 == 0) goto L_0x0158
            java.util.LinkedHashSet r2 = X.C86134wK.A0u()     // Catch:{ all -> 0x0165 }
            java.util.LinkedList r0 = r12.A05     // Catch:{ all -> 0x0165 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0165 }
        L_0x013f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0153
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0165 }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r0     // Catch:{ all -> 0x0165 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0165 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0165 }
            r2.addAll(r0)     // Catch:{ all -> 0x0165 }
            goto L_0x013f
        L_0x0153:
            java.util.ArrayList r0 = X.C18200wM.A0s(r2)     // Catch:{ all -> 0x0165 }
            goto L_0x015e
        L_0x0158:
            r7 = 0
            java.util.List r0 = X.AnonymousClass00J.A0N(r9)     // Catch:{ all -> 0x0163 }
            goto L_0x015f
        L_0x015e:
            r7 = 0
        L_0x015f:
            r3.A02(r7)
            return r0
        L_0x0163:
            r0 = move-exception
            goto L_0x0169
        L_0x0165:
            r0 = move-exception
            r7 = 0
            goto L_0x0169
        L_0x0168:
            r0 = move-exception
        L_0x0169:
            r3.A02(r7)
            throw r0
        L_0x016d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.data.BarcelonaFeedCache.A05(java.lang.Integer, java.util.List, X.8n9, int, boolean):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (((kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2) r5).A09 != 1) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086 A[Catch:{ all -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089 A[Catch:{ all -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0 A[Catch:{ all -> 0x00fd }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r14, java.lang.String r15, java.util.List r16, X.C146958n9 r17, boolean r18) {
        /*
            r13 = this;
            r1 = r16
            r11 = r18
            r4 = 1
            r5 = r17
            boolean r0 = r5 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2) r0
            int r2 = r0.A09
            r0 = 1
            if (r2 == r4) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x003d
            r10 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2 r10 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2) r10
            int r3 = r10.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x003d
            int r3 = r3 - r2
            r10.A00 = r3
        L_0x0024:
            java.lang.Object r2 = r10.A06
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r10.A00
            r8 = 2
            r3 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0062
            if (r0 == r4) goto L_0x0048
            if (r0 != r8) goto L_0x0043
            java.lang.Object r6 = r10.A02
            X.Dnh r6 = (X.C25549Dnh) r6
            java.lang.Object r5 = r10.A01
            com.instagram.barcelona.feed.data.BarcelonaFeedCache r5 = (com.instagram.barcelona.feed.data.BarcelonaFeedCache) r5
            goto L_0x00f1
        L_0x003d:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2 r10 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2
            r10.<init>(r13, r5, r4)
            goto L_0x0024
        L_0x0043:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0048:
            boolean r11 = r10.A08
            java.lang.Object r6 = r10.A05
            X.Dnh r6 = (X.C25549Dnh) r6
            java.lang.Object r15 = r10.A04
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r14 = r10.A03
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r1 = r10.A02
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r5 = r10.A01
            com.instagram.barcelona.feed.data.BarcelonaFeedCache r5 = (com.instagram.barcelona.feed.data.BarcelonaFeedCache) r5
            X.AnonymousClass0OU.A00(r2)
            goto L_0x007c
        L_0x0062:
            X.AnonymousClass0OU.A00(r2)
            X.Dnh r6 = r13.A09
            r10.A01 = r13
            r10.A02 = r1
            r10.A03 = r14
            r10.A04 = r15
            r10.A05 = r6
            r10.A08 = r11
            r10.A00 = r4
            java.lang.Object r0 = r6.A00(r7, r10)
            if (r0 == r9) goto L_0x0104
            r5 = r13
        L_0x007c:
            r4 = 0
            X.C04220Ms.A0B(r1, r4)     // Catch:{ all -> 0x00fd }
            java.util.ArrayList r2 = X.C18200wM.A0s(r1)     // Catch:{ all -> 0x00fd }
            if (r11 != 0) goto L_0x0087
            r3 = 0
        L_0x0087:
            if (r3 != 0) goto L_0x00c1
            java.util.LinkedList r3 = r5.A05     // Catch:{ all -> 0x00fd }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x00c1
            r3.getFirst()     // Catch:{ all -> 0x00fd }
            java.lang.Object r0 = r3.getFirst()     // Catch:{ all -> 0x00fd }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r0     // Catch:{ all -> 0x00fd }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x00fd }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00fd }
            java.util.List r0 = X.AnonymousClass00J.A0V(r2, r0)     // Catch:{ all -> 0x00fd }
            java.util.HashSet r11 = X.C18200wM.A0u()     // Catch:{ all -> 0x00fd }
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x00fd }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x00fd }
        L_0x00ae:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x00fd }
            r0 = r1
            X.JrZ r0 = (X.C37415JrZ) r0     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r0.A0j     // Catch:{ all -> 0x00fd }
            X.C86164wN.A1G(r0, r1, r11, r2)     // Catch:{ all -> 0x00fd }
            goto L_0x00ae
        L_0x00c1:
            java.util.LinkedList r3 = r5.A05     // Catch:{ all -> 0x00fd }
            r1 = 12
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2     // Catch:{ all -> 0x00fd }
            r0.<init>((java.util.List) r2, (java.lang.String) r14, (java.lang.String) r15, (int) r1)     // Catch:{ all -> 0x00fd }
            r3.addFirst(r0)     // Catch:{ all -> 0x00fd }
            goto L_0x00d8
        L_0x00ce:
            r1 = 12
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2     // Catch:{ all -> 0x00fd }
            r0.<init>((java.util.List) r2, (java.lang.String) r14, (java.lang.String) r15, (int) r1)     // Catch:{ all -> 0x00fd }
            r3.set(r4, r0)     // Catch:{ all -> 0x00fd }
        L_0x00d8:
            r5.A02()     // Catch:{ all -> 0x00fd }
            r5.A04()     // Catch:{ all -> 0x00fd }
            r10.A01 = r5     // Catch:{ all -> 0x00fd }
            r10.A02 = r6     // Catch:{ all -> 0x00fd }
            r10.A03 = r7     // Catch:{ all -> 0x00fd }
            r10.A04 = r7     // Catch:{ all -> 0x00fd }
            r10.A05 = r7     // Catch:{ all -> 0x00fd }
            r10.A00 = r8     // Catch:{ all -> 0x00fd }
            java.lang.Object r0 = A00(r5, r10)     // Catch:{ all -> 0x00fd }
            if (r0 != r9) goto L_0x00f4
            return r9
        L_0x00f1:
            X.AnonymousClass0OU.A00(r2)     // Catch:{ all -> 0x00ff }
        L_0x00f4:
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x00ff }
            r6.A02(r7)
            r5.A03()
            return r0
        L_0x00fd:
            r0 = move-exception
            goto L_0x0100
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            r6.A02(r7)
            throw r0
        L_0x0104:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.data.BarcelonaFeedCache.A06(java.lang.String, java.lang.String, java.util.List, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(java.util.List r14, X.C146958n9 r15) {
        /*
            r13 = this;
            r3 = 16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r15)
            if (r0 == 0) goto L_0x002e
            r10 = r15
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r10 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r10.A04
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r10.A00
            r11 = 2
            r0 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0049
            if (r1 == r0) goto L_0x0039
            if (r1 != r11) goto L_0x0034
            java.lang.Object r7 = r10.A02
            X.Dnh r7 = (X.C25549Dnh) r7
            java.lang.Object r6 = r10.A01
            com.instagram.barcelona.feed.data.BarcelonaFeedCache r6 = (com.instagram.barcelona.feed.data.BarcelonaFeedCache) r6
            goto L_0x00a8
        L_0x002e:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r10 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r10.<init>(r13, r15, r3)
            goto L_0x0016
        L_0x0034:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0039:
            java.lang.Object r7 = r10.A03
            X.Dnh r7 = (X.C25549Dnh) r7
            java.lang.Object r14 = r10.A02
            java.util.Collection r14 = (java.util.Collection) r14
            java.lang.Object r6 = r10.A01
            com.instagram.barcelona.feed.data.BarcelonaFeedCache r6 = (com.instagram.barcelona.feed.data.BarcelonaFeedCache) r6
            X.AnonymousClass0OU.A00(r2)
            goto L_0x0058
        L_0x0049:
            X.AnonymousClass0OU.A00(r2)
            X.Dnh r7 = r13.A09
            X.C86114wI.A1J(r13, r14, r7, r10, r0)
            java.lang.Object r0 = r7.A00(r8, r10)
            if (r0 == r9) goto L_0x00bb
            r6 = r13
        L_0x0058:
            java.util.LinkedList r5 = r6.A05     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = X.AnonymousClass00J.A0D(r5)     // Catch:{ all -> 0x00b6 }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r2     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x00ab
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x00b6 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00b6 }
            java.util.List r0 = X.AnonymousClass00J.A0V(r0, r14)     // Catch:{ all -> 0x00b6 }
            java.util.HashSet r4 = X.C18200wM.A0u()     // Catch:{ all -> 0x00b6 }
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x00b6 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x00b6 }
        L_0x0076:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x00b6 }
            r0 = r1
            X.JrZ r0 = (X.C37415JrZ) r0     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = r0.A0j     // Catch:{ all -> 0x00b6 }
            X.C86164wN.A1G(r0, r1, r4, r12)     // Catch:{ all -> 0x00b6 }
            goto L_0x0076
        L_0x0089:
            r4 = 0
            java.lang.String r3 = r2.A01     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = r2.A02     // Catch:{ all -> 0x00b6 }
            r1 = 12
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2     // Catch:{ all -> 0x00b6 }
            r0.<init>((java.util.List) r12, (java.lang.String) r3, (java.lang.String) r2, (int) r1)     // Catch:{ all -> 0x00b6 }
            r5.set(r4, r0)     // Catch:{ all -> 0x00b6 }
            r6.A02()     // Catch:{ all -> 0x00b6 }
            r6.A04()     // Catch:{ all -> 0x00b6 }
            X.C86114wI.A1J(r6, r7, r8, r10, r11)     // Catch:{ all -> 0x00b6 }
            java.lang.Object r0 = A00(r6, r10)     // Catch:{ all -> 0x00b6 }
            if (r0 != r9) goto L_0x00ab
            return r9
        L_0x00a8:
            X.AnonymousClass0OU.A00(r2)     // Catch:{ all -> 0x00b4 }
        L_0x00ab:
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x00b4 }
            r7.A02(r8)
            r6.A03()
            return r0
        L_0x00b4:
            r0 = move-exception
            goto L_0x00b7
        L_0x00b6:
            r0 = move-exception
        L_0x00b7:
            r7.A02(r8)
            throw r0
        L_0x00bb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.data.BarcelonaFeedCache.A07(java.util.List, X.8n9):java.lang.Object");
    }

    public BarcelonaFeedCache(Context context, UserSession userSession, List list, int i) {
        this.A03 = context;
        this.A04 = userSession;
        this.A00 = i;
        this.A08 = list;
        this.A07 = new BarcelonaFeedCacheRoom(userSession);
        this.A06 = new CopyOnWriteArrayList();
    }

    public static final List A01(List list, List list2) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C41836MeS) it.next()).apply(next)) {
                        break;
                    }
                } else {
                    A0v.add(next);
                    break;
                }
            }
        }
        return A0v;
    }
}
