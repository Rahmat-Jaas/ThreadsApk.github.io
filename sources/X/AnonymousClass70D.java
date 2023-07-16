package X;

import android.util.SparseArray;
import com.instagram.barcelona.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.70D  reason: invalid class name */
public final class AnonymousClass70D {
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x033b, code lost:
        if (r10.A05 == r0) goto L_0x033e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x026a A[Catch:{ 6C9 -> 0x00f5, all -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026b A[Catch:{ 6C9 -> 0x00f5, all -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027e A[Catch:{ 6C9 -> 0x00f5, all -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02c9 A[Catch:{ 6C9 -> 0x00f5, all -> 0x0366 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C127397h3 A01(X.C111246n1 r35, X.C127397h3 r36, X.C127397h3 r37, java.util.Map r38, java.util.Set r39) {
        /*
            r11 = r36
            int r0 = r11.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x03bd
            r12 = r35
            r10 = r37
            r37 = r39
            if (r10 == 0) goto L_0x002d
            X.7h3 r0 = r10.A05
            if (r0 != r11) goto L_0x002d
            java.util.Set r4 = r12.A0C
            if (r4 == 0) goto L_0x002d
            X.6jh r5 = r12.A04
            android.util.SparseArray r0 = r5.A02
            int r3 = r10.A02
            java.lang.Object r2 = r0.get(r3)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L_0x0036
            java.lang.String r1 = "BindEvaluator"
            java.lang.String r0 = "A previously bound node has a null variable dependency map"
            X.C30967GcS.A02(r1, r0)
        L_0x002d:
            X.MeU r0 = X.C41228M0s.A01
            boolean r20 = r0.BZ9()
            if (r20 == 0) goto L_0x009d
            goto L_0x004b
        L_0x0036:
            java.util.Iterator r1 = r2.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x036d
            java.lang.Object r0 = r1.next()
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x003a
            goto L_0x002d
        L_0x004b:
            java.lang.String r3 = "Bloks Bind Subtree"
            java.lang.StringBuilder r4 = X.C18200wM.A0r()     // Catch:{ all -> 0x0366 }
            java.lang.String r1 = r11.A0M()     // Catch:{ all -> 0x0366 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r0 = " id: "
            r4.append(r0)     // Catch:{ all -> 0x0366 }
            r4.append(r1)     // Catch:{ all -> 0x0366 }
        L_0x005f:
            java.util.List r2 = r11.A07     // Catch:{ all -> 0x0366 }
            if (r2 == 0) goto L_0x008b
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0366 }
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = " keyPath: "
            r4.append(r0)     // Catch:{ all -> 0x0366 }
            java.lang.Object r0 = X.C18240wQ.A0b(r2)     // Catch:{ all -> 0x0366 }
            r4.append(r0)     // Catch:{ all -> 0x0366 }
            r1 = 1
        L_0x0076:
            int r0 = r2.size()     // Catch:{ all -> 0x0366 }
            if (r1 >= r0) goto L_0x008b
            java.lang.String r0 = "/"
            r4.append(r0)     // Catch:{ all -> 0x0366 }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0366 }
            r4.append(r0)     // Catch:{ all -> 0x0366 }
            int r1 = r1 + 1
            goto L_0x0076
        L_0x008b:
            java.lang.String r0 = " styleId: "
            r4.append(r0)     // Catch:{ all -> 0x0366 }
            int r0 = r11.A03     // Catch:{ all -> 0x0366 }
            java.lang.String r0 = X.C86144wL.A0v(r4, r0)     // Catch:{ all -> 0x0366 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r3, r0)     // Catch:{ all -> 0x0366 }
            X.C41228M0s.A01(r0)     // Catch:{ all -> 0x0366 }
        L_0x009d:
            java.util.HashSet r9 = X.C18200wM.A0u()     // Catch:{ all -> 0x0366 }
            java.util.HashMap r8 = X.AnonymousClass0wJ.A0y()     // Catch:{ all -> 0x0366 }
            r19 = 135(0x87, float:1.89E-43)
            r0 = r19
            X.6jp r13 = r11.A0L(r0)     // Catch:{ all -> 0x0366 }
            if (r13 == 0) goto L_0x023d
            java.util.List r6 = r11.A07     // Catch:{ all -> 0x0366 }
            r34 = r6
            if (r6 != 0) goto L_0x00b9
            java.util.List r34 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0366 }
        L_0x00b9:
            com.instagram.common.lispy.lang.BloksScript r15 = r13.A01     // Catch:{ all -> 0x0366 }
            java.util.Map r14 = r12.A0A     // Catch:{ all -> 0x0366 }
            X.7A1 r5 = r12.A02     // Catch:{ all -> 0x0366 }
            X.4pa r4 = r12.A07     // Catch:{ all -> 0x0366 }
            X.73X r3 = r12.A00     // Catch:{ all -> 0x0366 }
            java.lang.String r2 = r12.A08     // Catch:{ all -> 0x0366 }
            X.6cC r1 = r12.A01     // Catch:{ all -> 0x0366 }
            java.lang.Integer r28 = X.AnonymousClass006.A00     // Catch:{ all -> 0x0366 }
            r7 = 0
            X.601 r0 = new X.601     // Catch:{ all -> 0x0366 }
            r21 = r0
            r22 = r1
            r23 = r7
            r24 = r5
            r25 = r3
            r26 = r15
            r27 = r4
            r29 = r2
            r30 = r7
            r31 = r6
            r32 = r14
            r33 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0366 }
            X.3iY r1 = X.C63893iY.A01     // Catch:{ 6C9 -> 0x00f5 }
            java.lang.Object r13 = X.AnonymousClass70N.A00(r1, r0, r13)     // Catch:{ 6C9 -> 0x00f5 }
            if (r13 == 0) goto L_0x00f2
            java.util.List r13 = (java.util.List) r13     // Catch:{ 6C9 -> 0x00f5 }
            goto L_0x0102
        L_0x00f2:
            java.util.List r13 = java.util.Collections.EMPTY_LIST     // Catch:{ 6C9 -> 0x00f5 }
            goto L_0x0102
        L_0x00f5:
            r5 = move-exception
            X.3HX r4 = r0.A00     // Catch:{ all -> 0x0366 }
            java.lang.String r3 = "BindEvaluator"
            java.lang.String r2 = "Exception evaluating onBind"
            r1 = 0
            X.C30967GcS.A01(r4, r3, r2, r5, r1)     // Catch:{ all -> 0x0366 }
            java.util.List r13 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0366 }
        L_0x0102:
            r0.A02 = r7     // Catch:{ all -> 0x0366 }
            X.7sW r0 = r0.A03     // Catch:{ all -> 0x0366 }
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00     // Catch:{ all -> 0x0366 }
            r0.clear()     // Catch:{ all -> 0x0366 }
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0366 }
            if (r0 != 0) goto L_0x023d
            r18 = 0
            r0 = r18
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x0366 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ all -> 0x0366 }
            r17 = r0
            java.lang.String r6 = "BindEvaluator"
            r16 = 2
            r15 = 1
            if (r0 == 0) goto L_0x0133
            int r0 = r13.size()     // Catch:{ all -> 0x0366 }
            int r0 = r0 % r16
            if (r0 != r15) goto L_0x0133
            java.lang.String r0 = "Encountered odd number of elements in interleaved binding array"
            X.C30967GcS.A02(r6, r0)     // Catch:{ all -> 0x0366 }
            goto L_0x023d
        L_0x0133:
            r5 = r11
            r1 = 0
        L_0x0135:
            int r0 = r13.size()     // Catch:{ all -> 0x0366 }
            if (r1 >= r0) goto L_0x023f
            if (r17 == 0) goto L_0x013e
            goto L_0x0169
        L_0x013e:
            java.lang.Object r2 = r13.get(r1)     // Catch:{ all -> 0x0366 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0366 }
            r0 = r18
            java.lang.String r3 = X.AnonymousClass70K.A01(r2, r0)     // Catch:{ all -> 0x0366 }
            java.lang.String r0 = r5.A0M()     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x015d
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0366 }
            if (r0 != 0) goto L_0x015d
            java.lang.String r0 = "Encountered binding targeted for a descendant "
            X.C30967GcS.A02(r6, r0)     // Catch:{ all -> 0x0366 }
            goto L_0x0238
        L_0x015d:
            java.lang.String r14 = X.C18190wL.A0p(r2, r15)     // Catch:{ all -> 0x0366 }
            r0 = r16
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x0366 }
            r4 = r1
            goto L_0x0173
        L_0x0169:
            int r4 = r1 + 1
            java.lang.String r14 = X.C18190wL.A0p(r13, r1)     // Catch:{ all -> 0x0366 }
            java.lang.Object r3 = r13.get(r4)     // Catch:{ all -> 0x0366 }
        L_0x0173:
            int r2 = X.AnonymousClass6Q5.A00(r14)     // Catch:{ all -> 0x0366 }
            r0 = 32
            if (r2 >= r0) goto L_0x018e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0366 }
            int r0 = r5.A03     // Catch:{ all -> 0x0366 }
            java.lang.Object[] r1 = X.C86134wK.A1b(r1, r14, r0)     // Catch:{ all -> 0x0366 }
            java.lang.String r0 = "Encountered invalid minified key: %s, raw: %s for styleId: %s while unwrapping binding expression"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0366 }
            X.C30967GcS.A02(r6, r0)     // Catch:{ all -> 0x0366 }
        L_0x018e:
            int[] r14 = X.AnonymousClass7H4.A00(r5)     // Catch:{ all -> 0x0366 }
            int r0 = r14.length     // Catch:{ all -> 0x0366 }
            r21 = r0
            r1 = 0
        L_0x0196:
            r0 = r21
            if (r1 >= r0) goto L_0x01e9
            r0 = r14[r1]     // Catch:{ all -> 0x0366 }
            if (r0 != r2) goto L_0x01a5
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0366 }
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0366 }
            goto L_0x01a8
        L_0x01a5:
            int r1 = r1 + 1
            goto L_0x0196
        L_0x01a8:
            if (r3 == 0) goto L_0x01ce
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0366 }
        L_0x01ae:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0366 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0366 }
            r31 = r12
            r32 = r5
            r33 = r10
            r35 = r0
            r36 = r8
            X.7h3 r0 = X.C101056Ps.A00(r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x01ae
            r1.add(r0)     // Catch:{ all -> 0x0366 }
            goto L_0x01ae
        L_0x01ce:
            r3 = r1
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x0366 }
        L_0x01d3:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x0222
            X.7h3 r1 = X.C86144wL.A0V(r14)     // Catch:{ all -> 0x0366 }
            if (r7 != 0) goto L_0x01e3
            android.util.SparseArray r7 = X.C86154wM.A0D()     // Catch:{ all -> 0x0366 }
        L_0x01e3:
            int r0 = r1.A02     // Catch:{ all -> 0x0366 }
            r7.put(r0, r1)     // Catch:{ all -> 0x0366 }
            goto L_0x01d3
        L_0x01e9:
            X.794 r0 = X.AnonymousClass794.A00()     // Catch:{ all -> 0x0366 }
            X.7H4 r1 = r0.A02     // Catch:{ all -> 0x0366 }
            int r0 = r5.A03     // Catch:{ all -> 0x0366 }
            int[] r14 = r1.A02(r0)     // Catch:{ all -> 0x0366 }
            int r0 = r14.length     // Catch:{ all -> 0x0366 }
            r21 = r0
            r1 = 0
        L_0x01f9:
            r0 = r21
            if (r1 >= r0) goto L_0x0222
            r0 = r14[r1]     // Catch:{ all -> 0x0366 }
            if (r0 != r2) goto L_0x0214
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0366 }
            r31 = r12
            r32 = r5
            r33 = r10
            r35 = r3
            r36 = r8
            X.7h3 r3 = X.C101056Ps.A00(r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0366 }
            if (r3 == 0) goto L_0x0222
            goto L_0x0217
        L_0x0214:
            int r1 = r1 + 1
            goto L_0x01f9
        L_0x0217:
            if (r7 != 0) goto L_0x021d
            android.util.SparseArray r7 = X.C86154wM.A0D()     // Catch:{ all -> 0x0366 }
        L_0x021d:
            int r0 = r3.A02     // Catch:{ all -> 0x0366 }
            r7.put(r0, r3)     // Catch:{ all -> 0x0366 }
        L_0x0222:
            int r1 = r5.A03     // Catch:{ all -> 0x0366 }
            r0 = 13688(0x3578, float:1.9181E-41)
            if (r1 == r0) goto L_0x022d
            X.7h3 r5 = X.AnonymousClass70E.A00(r5, r11, r3, r2)     // Catch:{ all -> 0x0366 }
            goto L_0x0239
        L_0x022d:
            java.util.List r1 = r12.A09     // Catch:{ all -> 0x0366 }
            X.6ji r0 = new X.6ji     // Catch:{ all -> 0x0366 }
            r0.<init>(r5, r3, r2)     // Catch:{ all -> 0x0366 }
            r1.add(r0)     // Catch:{ all -> 0x0366 }
            goto L_0x0239
        L_0x0238:
            r4 = r1
        L_0x0239:
            int r1 = r4 + 1
            goto L_0x0135
        L_0x023d:
            r5 = r11
            goto L_0x024a
        L_0x023f:
            X.6jh r0 = r12.A05     // Catch:{ all -> 0x0366 }
            if (r7 == 0) goto L_0x024a
            android.util.SparseArray r1 = r0.A01     // Catch:{ all -> 0x0366 }
            int r0 = r5.A02     // Catch:{ all -> 0x0366 }
            r1.put(r0, r7)     // Catch:{ all -> 0x0366 }
        L_0x024a:
            r0 = r19
            java.lang.Object r0 = X.C127397h3.A0A(r5, r0)     // Catch:{ all -> 0x0366 }
            boolean r19 = X.AnonymousClass0wJ.A1W(r0)
            int r0 = r5.A00     // Catch:{ all -> 0x0366 }
            r0 = r0 & 2
            boolean r18 = X.C18180wK.A1V(r0)
            java.util.HashSet r4 = X.C18200wM.A0u()     // Catch:{ all -> 0x0366 }
            int r1 = r5.A03     // Catch:{ all -> 0x0366 }
            r0 = 13326(0x340e, float:1.8674E-41)
            if (r1 == r0) goto L_0x026b
            r0 = 13336(0x3418, float:1.8688E-41)
            if (r1 == r0) goto L_0x026b
            goto L_0x0270
        L_0x026b:
            int r0 = r5.A02     // Catch:{ all -> 0x0366 }
            X.C18200wM.A1U(r4, r0)     // Catch:{ all -> 0x0366 }
        L_0x0270:
            X.794 r0 = X.AnonymousClass794.A00()     // Catch:{ all -> 0x0366 }
            X.7H4 r0 = r0.A02     // Catch:{ all -> 0x0366 }
            int[] r13 = r0.A02(r1)     // Catch:{ all -> 0x0366 }
            int r7 = r13.length     // Catch:{ all -> 0x0366 }
            r6 = 0
        L_0x027c:
            if (r6 >= r7) goto L_0x02bb
            r3 = r13[r6]     // Catch:{ all -> 0x0366 }
            X.7h3 r1 = r5.A0K(r3)     // Catch:{ all -> 0x0366 }
            if (r1 == 0) goto L_0x02b8
            if (r10 == 0) goto L_0x0289
            goto L_0x028b
        L_0x0289:
            r0 = 0
            goto L_0x028f
        L_0x028b:
            X.7h3 r0 = r10.A0K(r3)     // Catch:{ all -> 0x0366 }
        L_0x028f:
            X.7h3 r2 = A01(r12, r1, r0, r8, r9)     // Catch:{ all -> 0x0366 }
            boolean r0 = X.C18240wQ.A1Y(r2, r0)
            r19 = r19 | r0
            int r0 = r2.A00     // Catch:{ all -> 0x0366 }
            r0 = r0 & 2
            boolean r0 = X.C18180wK.A1V(r0)
            r18 = r18 | r0
            java.util.Set r1 = r2.A01     // Catch:{ all -> 0x0366 }
            if (r1 != 0) goto L_0x02ab
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0366 }
        L_0x02ab:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0366 }
            if (r0 != 0) goto L_0x02b4
            r4.addAll(r1)     // Catch:{ all -> 0x0366 }
        L_0x02b4:
            X.7h3 r5 = X.AnonymousClass70E.A00(r5, r11, r2, r3)     // Catch:{ all -> 0x0366 }
        L_0x02b8:
            int r6 = r6 + 1
            goto L_0x027c
        L_0x02bb:
            int[] r17 = X.AnonymousClass7H4.A00(r5)     // Catch:{ all -> 0x0366 }
            r0 = r17
            int r0 = r0.length     // Catch:{ all -> 0x0366 }
            r21 = r0
            r7 = 0
        L_0x02c5:
            r0 = r21
            if (r7 >= r0) goto L_0x0333
            r15 = r17[r7]     // Catch:{ all -> 0x0366 }
            java.util.List r14 = r5.A0Q(r15)     // Catch:{ all -> 0x0366 }
            if (r10 == 0) goto L_0x02d6
            java.util.List r13 = r10.A0Q(r15)     // Catch:{ all -> 0x0366 }
            goto L_0x02d7
        L_0x02d6:
            r13 = 0
        L_0x02d7:
            r0 = r14
            r6 = 0
        L_0x02d9:
            int r1 = r14.size()     // Catch:{ all -> 0x0366 }
            if (r6 >= r1) goto L_0x031c
            X.7h3 r3 = X.C86154wM.A0Q(r14, r6)     // Catch:{ all -> 0x0366 }
            if (r3 == 0) goto L_0x0319
            X.7h3 r1 = X.AnonymousClass70E.A01(r3, r13, r6)     // Catch:{ all -> 0x0366 }
            X.7h3 r2 = A01(r12, r3, r1, r8, r9)     // Catch:{ all -> 0x0366 }
            boolean r1 = X.C18240wQ.A1Y(r2, r1)
            r19 = r19 | r1
            int r1 = r2.A00     // Catch:{ all -> 0x0366 }
            r1 = r1 & 2
            boolean r1 = X.C18180wK.A1V(r1)
            r18 = r18 | r1
            java.util.Set r1 = r2.A01     // Catch:{ all -> 0x0366 }
            if (r1 != 0) goto L_0x0305
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0366 }
        L_0x0305:
            boolean r16 = r1.isEmpty()     // Catch:{ all -> 0x0366 }
            if (r16 != 0) goto L_0x030e
            r4.addAll(r1)     // Catch:{ all -> 0x0366 }
        L_0x030e:
            if (r2 == r3) goto L_0x0319
            if (r0 != r14) goto L_0x0316
            java.util.ArrayList r0 = X.C18200wM.A0s(r14)     // Catch:{ all -> 0x0366 }
        L_0x0316:
            r0.set(r6, r2)     // Catch:{ all -> 0x0366 }
        L_0x0319:
            int r6 = r6 + 1
            goto L_0x02d9
        L_0x031c:
            if (r0 == r14) goto L_0x0322
            X.7h3 r5 = X.AnonymousClass70E.A00(r5, r11, r0, r15)     // Catch:{ all -> 0x0366 }
        L_0x0322:
            if (r5 == r11) goto L_0x0330
            int r1 = r5.A00     // Catch:{ all -> 0x0366 }
            r0 = r1 & -3
            if (r18 == 0) goto L_0x032c
            r0 = r1 | 2
        L_0x032c:
            r5.A00 = r0     // Catch:{ all -> 0x0366 }
            r5.A01 = r4     // Catch:{ all -> 0x0366 }
        L_0x0330:
            int r7 = r7 + 1
            goto L_0x02c5
        L_0x0333:
            if (r19 != 0) goto L_0x033d
            if (r10 == 0) goto L_0x033d
            X.7h3 r1 = r10.A05     // Catch:{ all -> 0x0366 }
            r0 = r11
            r11 = r10
            if (r1 == r0) goto L_0x033e
        L_0x033d:
            r11 = r5
        L_0x033e:
            X.6jh r2 = r12.A05     // Catch:{ all -> 0x0366 }
            boolean r0 = X.C86164wN.A1R(r8)     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x034d
            android.util.SparseArray r1 = r2.A00     // Catch:{ all -> 0x0366 }
            int r0 = r11.A02     // Catch:{ all -> 0x0366 }
            r1.put(r0, r8)     // Catch:{ all -> 0x0366 }
        L_0x034d:
            java.util.Set r0 = r8.keySet()     // Catch:{ all -> 0x0366 }
            r9.removeAll(r0)     // Catch:{ all -> 0x0366 }
            android.util.SparseArray r1 = r2.A02     // Catch:{ all -> 0x0366 }
            int r0 = r11.A02     // Catch:{ all -> 0x0366 }
            r1.put(r0, r9)     // Catch:{ all -> 0x0366 }
            r0 = r37
            r0.addAll(r9)     // Catch:{ all -> 0x0366 }
            r0 = r38
            r0.putAll(r8)     // Catch:{ all -> 0x0366 }
            goto L_0x03b8
        L_0x0366:
            r0 = move-exception
            if (r20 == 0) goto L_0x036c
            X.C41228M0s.A00()
        L_0x036c:
            throw r0
        L_0x036d:
            r0 = r37
            r0.addAll(r2)
            X.6jh r2 = r12.A05
            r1 = 0
            com.facebook.redex.IDxVisitorShape319S0200000_2_I2 r0 = new com.facebook.redex.IDxVisitorShape319S0200000_2_I2
            r0.<init>(r1, r5, r2)
            r10.A0U(r0)
            android.util.SparseArray r0 = r5.A00
            java.lang.Object r1 = r0.get(r3)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x03b7
            r0 = r38
            r0.putAll(r1)
            java.util.Iterator r3 = X.AnonymousClass0wJ.A0z(r1)
        L_0x0390:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03b7
            java.util.Map$Entry r0 = X.C18180wK.A0o(r3)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.util.Map r0 = r12.A0A
            r0.put(r2, r1)
            java.util.Map r0 = r12.A0B
            java.lang.Object r0 = r0.get(r2)
            boolean r0 = X.C100986Pl.A00(r0, r1)
            if (r0 != 0) goto L_0x0390
            r4.add(r2)
            goto L_0x0390
        L_0x03b7:
            return r10
        L_0x03b8:
            if (r20 == 0) goto L_0x03bd
            X.C41228M0s.A00()
        L_0x03bd:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70D.A01(X.6n1, X.7h3, X.7h3, java.util.Map, java.util.Set):X.7h3");
    }

    public static C110936mW A00(C104686cC r13, AnonymousClass3HX r14, AnonymousClass7A1 r15, C110936mW r16, C127397h3 r17, AnonymousClass73X r18, C142478ev r19) {
        C127397h3 r0;
        SparseArray sparseArray = r14.A01;
        C82414pa r11 = (C82414pa) sparseArray.get(R.id.bk_context_key_interpreter_extensions);
        if (r11 == null) {
            r11 = AnonymousClass794.A00().A0C;
        }
        C110936mW r8 = r16;
        C111246n1 r4 = new C111246n1(r13, r15, (C112216pC) r14.A00(R.id.bk_context_key_scoped_client_id_mapper), r8, r18, r19, r11, (String) sparseArray.get(R.id.bk_context_key_logging_id));
        HashSet A0u = C18200wM.A0u();
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (r16 == null) {
            r0 = null;
        } else {
            r0 = r8.A02;
        }
        C127397h3 r6 = r17;
        C127397h3 A01 = A01(r4, r6, r0, A0y, A0u);
        HashMap hashMap = new HashMap(A0u.size());
        Iterator it = A0u.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            hashMap.put(next, r4.A02.A06.get(next));
        }
        Map map = r4.A02.A06;
        Map map2 = r4.A0A;
        return new C110936mW(r4.A05, r6, A01, r4.A09, map, map2, hashMap);
    }
}
