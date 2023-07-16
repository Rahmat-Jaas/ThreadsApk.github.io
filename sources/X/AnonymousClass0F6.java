package X;

import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: X.0F6  reason: invalid class name */
public abstract class AnonymousClass0F6 {
    public static final AnonymousClass0K9 A07 = new AnonymousClass0K9("LifecycleCodeCallbacksHolder");
    public static final Object A08 = "N/A";
    public final SparseArray A00 = new SparseArray();
    public final AnonymousClass0F0 A01;
    public final AnonymousClass0F2 A02;
    public final Object A03 = new Object();
    public final String A04;
    public final C03190Eu A05;
    public final C03410If A06;

    public abstract Parcelable A00(Object obj);

    public abstract boolean A02(AnonymousClass01Q r1, AnonymousClass012 r2, int i);

    public abstract boolean A04(C016507v r1, Object obj);

    public final void A01(Object obj, int i, Object obj2) {
        AnonymousClass0F4 r10;
        AnonymousClass0K4 A022;
        Parcelable parcelable;
        int length;
        String str;
        Object obj3 = obj;
        if (obj == null) {
            obj3 = "";
        }
        AnonymousClass0K9 r9 = A07;
        String str2 = this.A04;
        int i2 = i;
        Integer valueOf = Integer.valueOf(i2);
        synchronized (this.A03) {
            r10 = (AnonymousClass0F4) this.A00.get(i2, (Object) null);
        }
        if (r10 != null) {
            Class<C016507v> cls = C016507v.class;
            AnonymousClass0KC r2 = C04650On.A04;
            if (r2.A03 != null) {
                A022 = AnonymousClass0KC.A01(r2, cls, (Object) null, 0, 0);
            } else {
                A022 = AnonymousClass0KC.A02(r2, cls);
            }
            C04650On r22 = (C04650On) A022;
            AnonymousClass01Q AXy = r10.AXy();
            try {
                Object obj4 = obj2;
                if (r10.BhS()) {
                    parcelable = A00(obj4);
                } else {
                    parcelable = null;
                }
                C03170Es[] AV3 = r10.AV3(parcelable, AXy, r22);
                if (!(AV3 == null || (length = AV3.length) == 0 || !r22.A03)) {
                    C016507v r4 = (C016507v) r22.A00;
                    if (r4 == null) {
                        if (parcelable != null) {
                            str = "Y";
                        } else {
                            str = "N";
                        }
                        r9.A07("Can't call hooks for %s %s with code %d since we failed to get the parsed result. Has Client Transaction: %s \n\t Lifecycle Code: %s  \n\t State: %s", str2, obj3, valueOf, str, AXy, r10.Arx());
                    } else {
                        AnonymousClass0KF.A01(A04(r4, obj4), 1);
                        int i3 = 0;
                        while (i3 < length) {
                            int i4 = i3 + 1;
                            try {
                                AV3[i3].BnV(r4);
                            } catch (Error | RuntimeException e) {
                                e.getMessage();
                            }
                            i3 = i4;
                        }
                    }
                }
            } finally {
                r22.A02(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0247, code lost:
        if (r7 != false) goto L_0x0249;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.AnonymousClass014 r35, X.C03170Es r36, X.AnonymousClass012 r37) {
        /*
            r34 = this;
            r11 = r35
            java.lang.String r0 = r11.A03
            r33 = r0
            X.0K9 r3 = A07
            r6 = r34
            java.lang.String r2 = r6.A04
            r10 = 0
            r23 = 1
            r22 = 2
            X.0If r9 = r6.A06
            X.0Eu r0 = r6.A05
            r25 = r0
            X.01Q[] r1 = r11.A01
            if (r1 != 0) goto L_0x0040
            X.0K9 r21 = X.AnonymousClass014.A05
            X.01Q[] r0 = r11.A04
            r20 = r0
            int r13 = r0.length
            if (r13 > 0) goto L_0x0054
            java.lang.Class r1 = r11.A02
            if (r1 == 0) goto L_0x0051
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            if (r1 == r0) goto L_0x0051
            java.lang.Class r0 = r1.getComponentType()
            r0.getClass()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r0, r10)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
        L_0x0039:
            X.01Q[] r1 = (X.AnonymousClass01Q[]) r1
        L_0x003b:
            r1.getClass()
            r11.A01 = r1
        L_0x0040:
            int r9 = r1.length
            r4 = r37
            if (r9 != 0) goto L_0x0174
            java.lang.String r0 = "on pause"
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r2, r4}
            java.lang.String r0 = "Adding hook failed for state %s because we found no usable %s codes. \n\t State: %s"
            r3.A07(r0, r1)
            return r10
        L_0x0051:
            java.lang.Object[] r1 = X.C03580Jp.A00
            goto L_0x0039
        L_0x0054:
            java.util.Arrays.toString(r20)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r13)
            r8 = 0
        L_0x005d:
            r7 = r20[r8]
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0079
            r0 = r25
            java.lang.Class r4 = r7.A01(r0, r9)
            if (r4 == 0) goto L_0x0079
            java.lang.String r1 = r7.A06
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = r7.A05
            if (r0 == 0) goto L_0x0102
            java.lang.Class r0 = r9.A0E(r0)
            if (r0 != 0) goto L_0x0102
        L_0x0079:
            boolean r0 = r7.A03()
            if (r0 != 0) goto L_0x00d8
            X.AnonymousClass0KF.A00(r33)
        L_0x0082:
            int r8 = r8 + 1
            if (r8 < r13) goto L_0x005d
            java.lang.Class r4 = r11.A02
            r4.getClass()
            int r1 = r12.size()
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            if (r1 != 0) goto L_0x00bc
            if (r4 != r0) goto L_0x00ae
            java.lang.Object[] r1 = X.C03580Jp.A00
        L_0x0097:
            X.01Q[] r1 = (X.AnonymousClass01Q[]) r1
            int r0 = r1.length
            if (r0 != 0) goto L_0x016c
            X.012 r5 = r11.A00
            java.lang.String r4 = r5.A03
            r0 = r33
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r0, r5}
            java.lang.String r4 = "Could not find a place to add a hook for %s %s codes. \n\t State: %s"
            r0 = r21
            r0.A06(r4, r5)
            goto L_0x003b
        L_0x00ae:
            java.lang.Class r0 = r4.getComponentType()
            r0.getClass()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r0, r10)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            goto L_0x0097
        L_0x00bc:
            if (r4 != r0) goto L_0x00ca
            if (r1 <= 0) goto L_0x00c7
            java.lang.Object[] r0 = new java.lang.Object[r1]
        L_0x00c2:
            java.lang.Object[] r1 = r12.toArray(r0)
            goto L_0x0097
        L_0x00c7:
            java.lang.Object[] r0 = X.C03580Jp.A00
            goto L_0x00c2
        L_0x00ca:
            java.lang.Class r0 = r4.getComponentType()
            r0.getClass()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L_0x00c2
        L_0x00d8:
            int r1 = r7.A00()
            r0 = -19842(0xffffffffffffb27e, float:NaN)
            if (r1 != r0) goto L_0x00f8
            X.012 r0 = r11.A00
            java.lang.String r5 = r0.A03
            java.lang.String r4 = X.AnonymousClass0KF.A00(r33)
            X.012 r1 = r11.A00
            r0 = r33
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r5, r4, r7, r1}
            java.lang.String r1 = "Potential %s Code %s is not viable. We got an unknown lifecycle code to use. \n\t %s Code: %s \n\t State: %s"
            r0 = r21
            r0.A07(r1, r4)
            goto L_0x0082
        L_0x00f8:
            X.AnonymousClass0KF.A00(r33)
            X.AnonymousClass0KF.A00(r33)
            r12.add(r7)
            goto L_0x0082
        L_0x0102:
            java.lang.reflect.Field r19 = r7.A02(r9, r4, r1)     // Catch:{ all -> 0x0251 }
            if (r19 == 0) goto L_0x0166
            java.lang.Class r18 = r19.getDeclaringClass()     // Catch:{ all -> 0x0251 }
            r1 = 0
            r0 = r19
            java.lang.Object r15 = r0.get(r1)     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ Exception -> 0x0150 }
            if (r15 == 0) goto L_0x0166
            int r14 = r15.intValue()     // Catch:{ Exception -> 0x0150 }
            int r5 = r7.A04     // Catch:{ Exception -> 0x0150 }
            r1 = -19842(0xffffffffffffb27e, float:NaN)
            if (r5 == r1) goto L_0x0147
            if (r14 == r5) goto L_0x0147
            X.0K9 r17 = X.AnonymousClass01Q.A09     // Catch:{ Exception -> 0x0150 }
            java.lang.String r16 = "For code %s, we found the field %s.%s has a value of %d which is different from the expected value %d."
            java.lang.String r0 = r7.A07     // Catch:{ Exception -> 0x0150 }
            r24 = r0
            java.lang.String r4 = r18.getName()     // Catch:{ Exception -> 0x0150 }
            java.lang.String r1 = r19.getName()     // Catch:{ Exception -> 0x0150 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0150 }
            r5 = r24
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4, r1, r15, r0}     // Catch:{ Exception -> 0x0150 }
            r1 = r17
            r0 = r16
            r1.A07(r0, r4)     // Catch:{ Exception -> 0x0150 }
            r7.A01 = r14     // Catch:{ Exception -> 0x0150 }
            goto L_0x0166
        L_0x0147:
            r7.A00 = r14     // Catch:{ Exception -> 0x0150 }
            r0 = 0
            if (r14 == r1) goto L_0x014d
            r0 = 1
        L_0x014d:
            r7.A03 = r0     // Catch:{ Exception -> 0x0150 }
            goto L_0x0166
        L_0x0150:
            r15 = move-exception
            X.0K9 r5 = X.AnonymousClass01Q.A09     // Catch:{ all -> 0x0251 }
            java.lang.String r4 = "Could not get %s code key value for %s.%s."
            java.lang.String r14 = r7.A07     // Catch:{ all -> 0x0251 }
            java.lang.String r1 = r18.getName()     // Catch:{ all -> 0x0251 }
            java.lang.String r0 = r19.getName()     // Catch:{ all -> 0x0251 }
            java.lang.Object[] r1 = new java.lang.Object[]{r14, r1, r0}     // Catch:{ all -> 0x0251 }
            r5.A0B(r15, r4, r1)     // Catch:{ all -> 0x0251 }
        L_0x0166:
            r0 = r23
            r7.A02 = r0
            goto L_0x0079
        L_0x016c:
            X.AnonymousClass0KF.A00(r33)
            java.util.Arrays.toString(r1)
            goto L_0x003b
        L_0x0174:
            r8 = 0
            r14 = 0
        L_0x0176:
            r10 = r1[r8]
            boolean r0 = r10.A03()
            X.AnonymousClass0KW.A04(r0)
            int r12 = r10.A00()
            r7 = -19842(0xffffffffffffb27e, float:NaN)
            r0 = 0
            if (r12 == r7) goto L_0x0189
            r0 = 1
        L_0x0189:
            X.AnonymousClass0KW.A04(r0)
            java.lang.String r5 = "on pause"
            int r8 = r8 + 1
            java.lang.Integer r29 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r12)
            X.AnonymousClass0KF.A00(r33)
            if (r12 != r7) goto L_0x01f9
            java.lang.String r7 = "Could not add hook for state %s since the given %s code could not be found. \n\t %s Code: %s \n\t State: %s"
            java.lang.String r0 = X.AnonymousClass0KF.A00(r33)
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r2, r0, r10, r4}
            r3.A06(r7, r0)
        L_0x01aa:
            r7 = 0
        L_0x01ab:
            r0 = 5
        L_0x01ac:
            if (r7 == 0) goto L_0x01f6
            java.lang.String r24 = "succeeded"
        L_0x01b0:
            java.lang.Integer r28 = java.lang.Integer.valueOf(r8)
            java.lang.String r30 = X.AnonymousClass0KF.A00(r33)
            r25 = r5
            r26 = r2
            r31 = r10
            r32 = r4
            java.lang.Object[] r11 = new java.lang.Object[]{r24, r25, r26, r27, r28, r29, r30, r31, r32}
            java.lang.String r10 = "Adding hook %s for state %s with the given %s code value %d (%d / %d). \n\t %s Code: %s \n\t State: %s"
            r3.A08(r10, r11, r0)
            if (r7 == 0) goto L_0x01cd
            int r14 = r14 + 1
        L_0x01cd:
            if (r8 < r9) goto L_0x0176
            r7 = 0
            r6 = 6
            if (r14 <= 0) goto L_0x01d5
            r7 = 1
            r6 = 3
        L_0x01d5:
            r0 = r22
            java.lang.String r8 = X.AnonymousClass0KF.A01(r7, r0)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            java.lang.String r13 = X.AnonymousClass0KF.A00(r33)
            java.lang.String r14 = java.util.Arrays.toString(r1)
            r9 = r5
            r10 = r2
            r12 = r29
            r15 = r4
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13, r14, r15}
            java.lang.String r0 = "%s hooked %s for %s with %d of %d attempted hooks. \n\t %s Codes: %s \n\t State: %s"
            r3.A08(r0, r1, r6)
            return r7
        L_0x01f6:
            java.lang.String r24 = "failed"
            goto L_0x01b0
        L_0x01f9:
            java.lang.Object r11 = r6.A03
            monitor-enter(r11)
            android.util.SparseArray r13 = r6.A00     // Catch:{ all -> 0x024e }
            r0 = 0
            java.lang.Object r7 = r13.get(r12, r0)     // Catch:{ all -> 0x024e }
            X.0F4 r7 = (X.AnonymousClass0F4) r7     // Catch:{ all -> 0x024e }
            if (r7 != 0) goto L_0x0232
            boolean r0 = r10.A08     // Catch:{ all -> 0x024e }
            if (r0 == 0) goto L_0x0218
            X.0F0 r0 = r6.A01     // Catch:{ all -> 0x024e }
            if (r0 == 0) goto L_0x0222
            X.093 r7 = new X.093     // Catch:{ all -> 0x024e }
            r7.<init>(r10, r4, r0, r2)     // Catch:{ all -> 0x024e }
        L_0x0214:
            r13.put(r12, r7)     // Catch:{ all -> 0x024e }
            goto L_0x0220
        L_0x0218:
            X.0F2 r0 = r6.A02     // Catch:{ all -> 0x024e }
            X.08c r7 = new X.08c     // Catch:{ all -> 0x024e }
            r7.<init>(r10, r4, r0)     // Catch:{ all -> 0x024e }
            goto L_0x0214
        L_0x0220:
            r0 = 1
            goto L_0x0233
        L_0x0222:
            java.lang.String r7 = "Y"
            java.lang.String r0 = "N"
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r0, r2, r10, r4}     // Catch:{ all -> 0x024e }
            java.lang.String r0 = "Cannot construct hook holder since it requires client transaction (platform supported: %s Have ClientTransaction deps: %s). \n\t %s code: %s \n\tState: %s"
            r3.A07(r0, r7)     // Catch:{ all -> 0x024e }
            monitor-exit(r11)     // Catch:{ all -> 0x024e }
            goto L_0x01aa
        L_0x0232:
            r0 = 0
        L_0x0233:
            monitor-exit(r11)     // Catch:{ all -> 0x024e }
            r11 = r36
            r7.A6m(r11, r4)
            if (r0 == 0) goto L_0x024c
            boolean r7 = r6.A02(r10, r4, r12)
            r0 = r23
            X.AnonymousClass0KF.A01(r7, r0)
            X.AnonymousClass0KF.A00(r33)
            if (r7 == 0) goto L_0x01ab
        L_0x0249:
            r0 = 3
            goto L_0x01ac
        L_0x024c:
            r7 = 1
            goto L_0x0249
        L_0x024e:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x024e }
            throw r0
        L_0x0251:
            r1 = move-exception
            r0 = r23
            r7.A02 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0F6.A03(X.014, X.0Es, X.012):boolean");
    }

    public AnonymousClass0F6(C03190Eu r2, AnonymousClass0F0 r3, AnonymousClass0F2 r4, C03410If r5, String str) {
        this.A04 = str;
        this.A06 = r5;
        this.A05 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
