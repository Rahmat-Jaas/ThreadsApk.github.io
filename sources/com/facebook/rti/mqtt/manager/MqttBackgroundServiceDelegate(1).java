package com.facebook.rti.mqtt.manager;

import X.C02320Ar;
import X.C13100n0;
import X.C18040w1;
import X.C18080w5;
import android.content.Intent;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class MqttBackgroundServiceDelegate extends C18040w1 {
    public boolean A00;
    public final Object A01 = new Object();
    public volatile C02320Ar A02;

    public final void A09(Intent intent, int i) {
        A07(intent, -1, i);
    }

    public abstract void A0H();

    public abstract void A0I(int i, int i2, Intent intent);

    public final int A07(Intent intent, int i, int i2) {
        ((C13100n0) this.A02).A00.A0I(i, i2, intent);
        return 1;
    }

    public void A0F() {
        ((C13100n0) this.A02).A00.A0H();
        super.A0F();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0132, code lost:
        r14.apply();
        r11 = X.AnonymousClass0tp.A0A;
        r10 = -1;
        r12 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0146, code lost:
        if (r12.A00().isInstance(r10) == false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0148, code lost:
        r12 = ((java.lang.Integer) r12.A01(r4, r10, "logging_health_stats_sample_rate")).intValue();
        r13 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0156, code lost:
        if (r12 < 0) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0158, code lost:
        if (r12 <= 10000) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0166, code lost:
        if ((!X.AnonymousClass0PL.A00(r24.getApplicationContext()).A02) == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0168, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0169, code lost:
        r10 = java.lang.Integer.valueOf(r13);
        r1 = r4.edit();
        r11.A00(r1, r10);
        r1.apply();
        r12 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r49 = java.lang.Long.valueOf(java.lang.Long.parseLong(r4.getString("fb_uid", (java.lang.String) null)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r49 = -1L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01a2, code lost:
        r1 = new java.lang.StringBuilder("Cannot cast");
        r1.append(r10.getClass());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b9, code lost:
        throw new java.lang.ClassCastException(r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G() {
        /*
            r54 = this;
            java.lang.String r1 = "MqttBackgroundServiceDelegate.ensureInitialized"
            r0 = -1398809912(0xffffffffac9fdac8, float:-4.5433414E-12)
            X.C13780oI.A01(r1, r0)
            r53 = r54
            r0 = r53
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x0358 }
            r23 = r0
            monitor-enter(r23)     // Catch:{ all -> 0x0358 }
            r0 = r53
            boolean r0 = r0.A00     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x033d
            r0 = r53
            com.facebook.rti.mqtt.manager.MqttPushServiceDelegate r0 = (com.facebook.rti.mqtt.manager.MqttPushServiceDelegate) r0     // Catch:{ all -> 0x0355 }
            X.0P1 r2 = r0.A0A     // Catch:{ all -> 0x0355 }
            r1 = 0
            if (r2 != 0) goto L_0x0021
            r1 = 1
        L_0x0021:
            X.AnonymousClass0g1.A01(r1)     // Catch:{ all -> 0x0355 }
            r3 = r0
            com.facebook.rti.push.service.FbnsServiceDelegate r3 = (com.facebook.rti.push.service.FbnsServiceDelegate) r3     // Catch:{ all -> 0x0355 }
            com.facebook.rti.push.service.FbnsServiceDelegate r1 = com.facebook.rti.push.service.FbnsServiceDelegate.A0B     // Catch:{ all -> 0x0355 }
            if (r1 == 0) goto L_0x002e
            r1.A0S()     // Catch:{ all -> 0x0355 }
        L_0x002e:
            com.facebook.rti.push.service.FbnsServiceDelegate.A0B = r3     // Catch:{ all -> 0x0355 }
            X.0w5 r1 = r3.A01     // Catch:{ all -> 0x0355 }
            r24 = r1
            android.content.Context r2 = r24.getApplicationContext()     // Catch:{ all -> 0x0355 }
            X.0sF r1 = new X.0sF     // Catch:{ all -> 0x0355 }
            r1.<init>(r2)     // Catch:{ all -> 0x0355 }
            r3.A03 = r1     // Catch:{ all -> 0x0355 }
            r7 = 1
            com.facebook.redex.IDxIProviderShape675S0100000_I2 r22 = new com.facebook.redex.IDxIProviderShape675S0100000_I2     // Catch:{ all -> 0x0355 }
            r1 = r22
            r1.<init>(r3, r7)     // Catch:{ all -> 0x0355 }
            r2 = 2
            com.facebook.redex.IDxIProviderShape675S0100000_I2 r21 = new com.facebook.redex.IDxIProviderShape675S0100000_I2     // Catch:{ all -> 0x0355 }
            r1 = r21
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0355 }
            r2 = 3
            com.facebook.redex.IDxIProviderShape675S0100000_I2 r20 = new com.facebook.redex.IDxIProviderShape675S0100000_I2     // Catch:{ all -> 0x0355 }
            r1 = r20
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0355 }
            r6 = 0
            android.content.Context r2 = r24.getApplicationContext()     // Catch:{ all -> 0x0355 }
            r2.getClass()     // Catch:{ all -> 0x0355 }
            X.0mM r19 = new X.0mM     // Catch:{ all -> 0x0355 }
            r1 = r19
            r1.<init>((android.content.Context) r2)     // Catch:{ all -> 0x0355 }
            android.content.Context r1 = r24.getApplicationContext()     // Catch:{ all -> 0x0355 }
            X.0mV r5 = new X.0mV     // Catch:{ all -> 0x0355 }
            r5.<init>(r1)     // Catch:{ all -> 0x0355 }
            android.content.Context r1 = r24.getApplicationContext()     // Catch:{ all -> 0x0355 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0355 }
            boolean r2 = X.AnonymousClass0s5.A02(r1)     // Catch:{ all -> 0x0355 }
            java.lang.Object r9 = X.C17250ua.A00     // Catch:{ all -> 0x0355 }
            X.0m4 r9 = (X.C12530m4) r9     // Catch:{ all -> 0x0355 }
            X.0ib r1 = r9.A00     // Catch:{ all -> 0x0355 }
            java.lang.Object r1 = r1.A00     // Catch:{ all -> 0x0355 }
            if (r1 == 0) goto L_0x034d
            X.0tI r18 = new X.0tI     // Catch:{ all -> 0x0355 }
            r1 = r18
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0355 }
            java.lang.String r1 = r18.Ad5()     // Catch:{ all -> 0x0355 }
            r3.A0A = r1     // Catch:{ all -> 0x0355 }
            android.content.Context r1 = r24.getApplicationContext()     // Catch:{ all -> 0x0355 }
            X.0s6 r2 = new X.0s6     // Catch:{ all -> 0x0355 }
            r2.<init>(r1)     // Catch:{ all -> 0x0355 }
            android.content.Context r4 = r24.getApplicationContext()     // Catch:{ all -> 0x0355 }
            java.lang.Integer r17 = X.AnonymousClass006.A01     // Catch:{ all -> 0x0355 }
            r1 = r17
            android.content.SharedPreferences r4 = X.C05340Su.A00(r4, r1)     // Catch:{ all -> 0x0355 }
            android.content.Context r1 = r24.getApplicationContext()     // Catch:{ all -> 0x0355 }
            X.0PL r1 = X.AnonymousClass0PL.A00(r1)     // Catch:{ all -> 0x0355 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x0355 }
            r1 = r1 ^ 1
            r8 = 10000(0x2710, float:1.4013E-41)
            r11 = 1
            r10 = 1
            if (r1 != 0) goto L_0x00bb
            r10 = 10000(0x2710, float:1.4013E-41)
        L_0x00bb:
            android.content.SharedPreferences$Editor r14 = r4.edit()     // Catch:{ all -> 0x0355 }
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x0355 }
            r1.<init>()     // Catch:{ all -> 0x0355 }
            int r1 = r1.nextInt(r8)     // Catch:{ all -> 0x0355 }
            if (r1 < r10) goto L_0x00cb
            r11 = 0
        L_0x00cb:
            X.0tp r13 = X.AnonymousClass0tp.A0C     // Catch:{ all -> 0x0355 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0355 }
            r13.A00(r14, r1)     // Catch:{ all -> 0x0355 }
            X.0tp r10 = X.AnonymousClass0tp.A0B     // Catch:{ all -> 0x0355 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0355 }
            r10.A00(r14, r1)     // Catch:{ all -> 0x0355 }
            java.util.Map r1 = com.facebook.rti.push.service.FbnsServiceDelegate.A0E     // Catch:{ all -> 0x0355 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0355 }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ all -> 0x0355 }
        L_0x00e7:
            boolean r1 = r16.hasNext()     // Catch:{ all -> 0x0355 }
            if (r1 == 0) goto L_0x0132
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x0355 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0355 }
            java.lang.Object r15 = r1.getKey()     // Catch:{ all -> 0x0355 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0355 }
            java.lang.Object r12 = r1.getValue()     // Catch:{ all -> 0x0355 }
            if (r12 == 0) goto L_0x0124
            X.0tq r1 = r13.A00     // Catch:{ all -> 0x0355 }
            java.lang.Class r1 = r1.A00()     // Catch:{ all -> 0x0355 }
            boolean r1 = r1.isInstance(r12)     // Catch:{ all -> 0x0355 }
            if (r1 != 0) goto L_0x0124
            java.lang.String r0 = "Cannot cast"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0355 }
            r1.<init>(r0)     // Catch:{ all -> 0x0355 }
            java.lang.Class r0 = r12.getClass()     // Catch:{ all -> 0x0355 }
            r1.append(r0)     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0355 }
            java.lang.ClassCastException r1 = new java.lang.ClassCastException     // Catch:{ all -> 0x0355 }
            r1.<init>(r0)     // Catch:{ all -> 0x0355 }
            goto L_0x0354
        L_0x0124:
            X.0tq r11 = r13.A00     // Catch:{ all -> 0x0355 }
            java.lang.String r10 = "LOG_SR"
            java.lang.String r1 = "/"
            java.lang.String r1 = X.AnonymousClass00U.A0V(r10, r1, r15)     // Catch:{ all -> 0x0355 }
            r11.A02(r14, r12, r1)     // Catch:{ all -> 0x0355 }
            goto L_0x00e7
        L_0x0132:
            r14.apply()     // Catch:{ all -> 0x0355 }
            X.0tp r11 = X.AnonymousClass0tp.A0A     // Catch:{ all -> 0x0355 }
            r1 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0355 }
            X.0tq r12 = r11.A00     // Catch:{ all -> 0x0355 }
            java.lang.Class r1 = r12.A00()     // Catch:{ all -> 0x0355 }
            boolean r1 = r1.isInstance(r10)     // Catch:{ all -> 0x0355 }
            if (r1 == 0) goto L_0x01a2
            java.lang.String r1 = "logging_health_stats_sample_rate"
            java.lang.Object r1 = r12.A01(r4, r10, r1)     // Catch:{ all -> 0x0355 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0355 }
            int r12 = r1.intValue()     // Catch:{ all -> 0x0355 }
            r13 = 10000(0x2710, float:1.4013E-41)
            if (r12 < 0) goto L_0x015a
            if (r12 <= r8) goto L_0x0178
        L_0x015a:
            android.content.Context r1 = r24.getApplicationContext()     // Catch:{ all -> 0x0355 }
            X.0PL r1 = X.AnonymousClass0PL.A00(r1)     // Catch:{ all -> 0x0355 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x0355 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0169
            r13 = 1
        L_0x0169:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0355 }
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x0355 }
            r11.A00(r1, r10)     // Catch:{ all -> 0x0355 }
            r1.apply()     // Catch:{ all -> 0x0355 }
            r12 = r13
        L_0x0178:
            java.lang.String r1 = "fb_uid"
            java.lang.String r1 = r4.getString(r1, r6)     // Catch:{ NumberFormatException -> 0x0187 }
            long r10 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0187 }
            java.lang.Long r49 = java.lang.Long.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0187 }
            goto L_0x018d
        L_0x0187:
            r10 = -1
            java.lang.Long r49 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0355 }
        L_0x018d:
            X.0tT r1 = new X.0tT     // Catch:{ all -> 0x0355 }
            r1.<init>(r4)     // Catch:{ all -> 0x0355 }
            r3.A07 = r1     // Catch:{ all -> 0x0355 }
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x0355 }
            r1.<init>()     // Catch:{ all -> 0x0355 }
            int r1 = r1.nextInt(r8)     // Catch:{ all -> 0x0355 }
            r8 = 0
            if (r1 >= r12) goto L_0x01ba
            r8 = 1
            goto L_0x01ba
        L_0x01a2:
            java.lang.String r0 = "Cannot cast"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0355 }
            r1.<init>(r0)     // Catch:{ all -> 0x0355 }
            java.lang.Class r0 = r10.getClass()     // Catch:{ all -> 0x0355 }
            r1.append(r0)     // Catch:{ all -> 0x0355 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0355 }
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch:{ all -> 0x0355 }
            r0.<init>(r1)     // Catch:{ all -> 0x0355 }
            throw r0     // Catch:{ all -> 0x0355 }
        L_0x01ba:
            X.0ib r1 = r9.A02     // Catch:{ all -> 0x0355 }
            java.lang.Object r1 = r1.A00     // Catch:{ all -> 0x0355 }
            if (r1 == 0) goto L_0x0345
            X.0mS r1 = (X.C12770mS) r1     // Catch:{ all -> 0x0355 }
            android.content.Context r12 = r24.getApplicationContext()     // Catch:{ all -> 0x0355 }
            r1.A00 = r8     // Catch:{ all -> 0x0355 }
            java.lang.String r8 = r18.getAppName()     // Catch:{ all -> 0x0355 }
            com.facebook.redex.IDxIProviderShape268S0200000_I2 r9 = new com.facebook.redex.IDxIProviderShape268S0200000_I2     // Catch:{ all -> 0x0355 }
            r9.<init>(r2, r3, r7)     // Catch:{ all -> 0x0355 }
            java.lang.String r50 = "567310203415052"
            X.0lg r10 = new X.0lg     // Catch:{ all -> 0x0355 }
            r10.<init>(r12, r9, r8)     // Catch:{ all -> 0x0355 }
            X.0PL r11 = X.AnonymousClass0PL.A00(r12)     // Catch:{ all -> 0x0355 }
            X.0NR r16 = new X.0NR     // Catch:{ all -> 0x0355 }
            r9 = r16
            r9.<init>(r12, r11, r8, r6)     // Catch:{ all -> 0x0355 }
            java.lang.String r12 = r18.Ad5()     // Catch:{ all -> 0x0355 }
            android.content.Context r15 = r24.getApplicationContext()     // Catch:{ all -> 0x0355 }
            X.0ss r14 = new X.0ss     // Catch:{ all -> 0x0355 }
            r14.<init>(r4)     // Catch:{ all -> 0x0355 }
            java.lang.String r35 = X.C18140wF.A00(r17)     // Catch:{ all -> 0x0355 }
            r9 = 0
            com.facebook.redex.IDxIProviderShape268S0200000_I2 r13 = new com.facebook.redex.IDxIProviderShape268S0200000_I2     // Catch:{ all -> 0x0355 }
            r13.<init>(r2, r3, r9)     // Catch:{ all -> 0x0355 }
            X.0PL r11 = X.AnonymousClass0PL.A00(r15)     // Catch:{ all -> 0x0355 }
            X.0NR r9 = new X.0NR     // Catch:{ all -> 0x0355 }
            r9.<init>(r15, r11, r8, r6)     // Catch:{ all -> 0x0355 }
            X.0lz r8 = new X.0lz     // Catch:{ all -> 0x0355 }
            r8.<init>(r12)     // Catch:{ all -> 0x0355 }
            java.lang.String r36 = r9.A01()     // Catch:{ all -> 0x0355 }
            java.lang.String r12 = r11.A01     // Catch:{ all -> 0x0355 }
            java.lang.String r9 = r11.A00     // Catch:{ all -> 0x0355 }
            X.0m0 r28 = new X.0m0     // Catch:{ all -> 0x0355 }
            r29 = r15
            r30 = r4
            r31 = r10
            r32 = r13
            r33 = r8
            r34 = r14
            r37 = r12
            r38 = r9
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0355 }
            X.0tN r8 = new X.0tN     // Catch:{ all -> 0x0355 }
            r8.<init>(r10)     // Catch:{ all -> 0x0355 }
            r3.A09 = r8     // Catch:{ all -> 0x0355 }
            X.0pp r45 = new X.0pp     // Catch:{ all -> 0x0355 }
            r45.<init>()     // Catch:{ all -> 0x0355 }
            X.0pw r46 = new X.0pw     // Catch:{ all -> 0x0355 }
            r46.<init>()     // Catch:{ all -> 0x0355 }
            X.0mO r14 = X.C12730mO.A00     // Catch:{ all -> 0x0355 }
            android.content.Context r25 = r24.getApplicationContext()     // Catch:{ all -> 0x0355 }
            X.00d r42 = new X.00d     // Catch:{ all -> 0x0355 }
            r42.<init>()     // Catch:{ all -> 0x0355 }
            X.03q r13 = r3.A0D     // Catch:{ all -> 0x0355 }
            X.0tA r11 = new X.0tA     // Catch:{ all -> 0x0355 }
            r11.<init>(r5)     // Catch:{ all -> 0x0355 }
            X.0qy r47 = new X.0qy     // Catch:{ all -> 0x0355 }
            r47.<init>()     // Catch:{ all -> 0x0355 }
            android.os.Looper r8 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0355 }
            android.os.Handler r10 = new android.os.Handler     // Catch:{ all -> 0x0355 }
            r10.<init>(r8)     // Catch:{ all -> 0x0355 }
            X.0mN r29 = new X.0mN     // Catch:{ all -> 0x0355 }
            r29.<init>()     // Catch:{ all -> 0x0355 }
            X.0sF r12 = r3.A03     // Catch:{ all -> 0x0355 }
            X.0sD r9 = new X.0sD     // Catch:{ all -> 0x0355 }
            r9.<init>(r2)     // Catch:{ all -> 0x0355 }
            X.0vG r44 = new X.0vG     // Catch:{ all -> 0x0355 }
            r44.<init>()     // Catch:{ all -> 0x0355 }
            X.0mR r8 = new X.0mR     // Catch:{ all -> 0x0355 }
            r8.<init>(r1)     // Catch:{ all -> 0x0355 }
            X.0rw r3 = new X.0rw     // Catch:{ all -> 0x0355 }
            r3.<init>()     // Catch:{ all -> 0x0355 }
            X.0uL r1 = new X.0uL     // Catch:{ all -> 0x0355 }
            r26 = r10
            r27 = r6
            r30 = r8
            r31 = r12
            r32 = r5
            r33 = r6
            r34 = r22
            r35 = r20
            r36 = r21
            r37 = r20
            r38 = r2
            r39 = r11
            r40 = r9
            r41 = r13
            r43 = r18
            r48 = r17
            r51 = r6
            r52 = r6
            r24 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ all -> 0x0355 }
            X.0t1 r31 = X.C16410t1.A00     // Catch:{ all -> 0x0355 }
            r2 = r19
            r3.A00 = r2     // Catch:{ all -> 0x0355 }
            X.0mV r11 = r1.A07     // Catch:{ all -> 0x0355 }
            X.0lF r8 = new X.0lF     // Catch:{ all -> 0x0355 }
            r8.<init>(r11)     // Catch:{ all -> 0x0355 }
            java.util.List r5 = com.facebook.rti.push.service.FbnsServiceDelegate.A0D     // Catch:{ all -> 0x0355 }
            X.0mR r2 = new X.0mR     // Catch:{ all -> 0x0355 }
            r2.<init>(r8)     // Catch:{ all -> 0x0355 }
            r3.A00(r2, r1, r5)     // Catch:{ all -> 0x0355 }
            X.0mZ r8 = r3.A05     // Catch:{ all -> 0x0355 }
            X.0PL r5 = r3.A06     // Catch:{ all -> 0x0355 }
            X.0tR r2 = new X.0tR     // Catch:{ all -> 0x0355 }
            r2.<init>(r11, r8, r5)     // Catch:{ all -> 0x0355 }
            r3.A03 = r2     // Catch:{ all -> 0x0355 }
            android.content.Context r9 = r1.A00     // Catch:{ all -> 0x0355 }
            X.0OX r10 = r3.A08     // Catch:{ all -> 0x0355 }
            com.facebook.rti.common.time.RealtimeSinceBootClock r8 = r3.A04     // Catch:{ all -> 0x0355 }
            X.0mM r5 = r3.A00     // Catch:{ all -> 0x0355 }
            X.0P7 r2 = r3.A07     // Catch:{ all -> 0x0355 }
            X.0ta r1 = new X.0ta     // Catch:{ all -> 0x0355 }
            r24 = r1
            r25 = r9
            r26 = r5
            r27 = r11
            r28 = r8
            r29 = r2
            r30 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0355 }
            r3.A02 = r1     // Catch:{ all -> 0x0355 }
            X.068 r8 = r3.A0I     // Catch:{ all -> 0x0355 }
            com.facebook.rti.common.time.RealtimeSinceBootClock r5 = r3.A04     // Catch:{ all -> 0x0355 }
            X.0qQ r2 = r3.A01     // Catch:{ all -> 0x0355 }
            X.0tm r1 = new X.0tm     // Catch:{ all -> 0x0355 }
            r24 = r1
            r26 = r4
            r27 = r2
            r28 = r5
            r29 = r16
            r30 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0355 }
            r3.A01 = r1     // Catch:{ all -> 0x0355 }
            r0.A0A = r3     // Catch:{ all -> 0x0355 }
            r0.A0O()     // Catch:{ all -> 0x0355 }
            r0.A0N()     // Catch:{ all -> 0x0355 }
            X.0eQ r2 = r0.A01     // Catch:{ all -> 0x0355 }
            X.0nk r1 = new X.0nk     // Catch:{ all -> 0x0355 }
            r1.<init>(r0)     // Catch:{ all -> 0x0355 }
            X.0sF r2 = (X.C15960sF) r2     // Catch:{ all -> 0x0355 }
            r2.A01 = r1     // Catch:{ all -> 0x0355 }
            java.lang.String r1 = "doCreate"
            com.facebook.rti.mqtt.manager.MqttPushServiceDelegate.A06(r0, r1)     // Catch:{ all -> 0x0355 }
            X.0MO r2 = r0.A0E     // Catch:{ all -> 0x0355 }
            java.lang.String r3 = X.C18140wF.A00(r17)     // Catch:{ all -> 0x0355 }
            java.lang.String r1 = ".SERVICE_CREATE"
            java.lang.String r16 = X.AnonymousClass00U.A0L(r3, r1)     // Catch:{ all -> 0x0355 }
            java.lang.String r17 = r0.A0L()     // Catch:{ all -> 0x0355 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0B     // Catch:{ all -> 0x0355 }
            boolean r21 = r1.get()     // Catch:{ all -> 0x0355 }
            X.068 r1 = r0.A06     // Catch:{ all -> 0x0355 }
            java.util.concurrent.atomic.AtomicLong r1 = r1.A06     // Catch:{ all -> 0x0355 }
            long r19 = r1.get()     // Catch:{ all -> 0x0355 }
            X.068 r0 = r0.A06     // Catch:{ all -> 0x0355 }
            android.net.NetworkInfo r13 = r0.A02()     // Catch:{ all -> 0x0355 }
            r15 = r14
            r18 = r6
            r12 = r2
            r12.A02(r13, r14, r15, r16, r17, r18, r19, r21)     // Catch:{ all -> 0x0355 }
            r0 = r53
            r0.A00 = r7     // Catch:{ all -> 0x0355 }
        L_0x033d:
            monitor-exit(r23)     // Catch:{ all -> 0x0355 }
            r0 = 282297691(0x10d3855b, float:8.343029E-29)
            X.C13780oI.A00(r0)
            return
        L_0x0345:
            java.lang.String r0 = "IMqttStatsLogSwitcher not bound in FBNS Config Manager"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0355 }
            r1.<init>(r0)     // Catch:{ all -> 0x0355 }
            goto L_0x0354
        L_0x034d:
            java.lang.String r0 = "MqttIdManagerBuilder not bound in Fbns Config Manager"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0355 }
            r1.<init>(r0)     // Catch:{ all -> 0x0355 }
        L_0x0354:
            throw r1     // Catch:{ all -> 0x0355 }
        L_0x0355:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x0355 }
            throw r0     // Catch:{ all -> 0x0358 }
        L_0x0358:
            r1 = move-exception
            r0 = 1268921199(0x4ba2336f, float:2.1259998E7)
            X.C13780oI.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate.A0G():void");
    }

    public MqttBackgroundServiceDelegate(C18080w5 r2) {
        super(r2);
    }

    public final void A0A(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        A0G();
        A0J(fileDescriptor, printWriter, strArr);
    }

    public void A0C() {
        A08();
        this.A02 = new C13100n0(Looper.getMainLooper(), this);
        ((C13100n0) this.A02).A00.A0G();
    }

    public void A0J(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A0A(fileDescriptor, printWriter, strArr);
    }
}
