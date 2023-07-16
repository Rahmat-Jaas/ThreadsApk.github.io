package com.facebook.redex;

import X.C04560Oe;

public class IDxProviderShape244S0100000_1_I2 implements C04560Oe {
    public Object A00;
    public final int A01;

    public IDxProviderShape244S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0333, code lost:
        if (r8 != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x033b, code lost:
        throw X.C18250wR.A0V("Invalid paramsMapContent: no END marker found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        r0 = X.C18250wR.A0V(X.AnonymousClass00U.A0L("could not find key in configs ", r9));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:182:0x0365 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:221:0x0404 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:252:0x0482 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:290:0x0546 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:295:0x054b */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x027c A[Catch:{ all -> 0x0361, all -> 0x0365, IOException -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0297 A[Catch:{ all -> 0x0361, all -> 0x0365, IOException -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b8 A[Catch:{ all -> 0x0361, all -> 0x0365, IOException -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02ce A[Catch:{ all -> 0x0361, all -> 0x0365, IOException -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0326 A[Catch:{ all -> 0x0361, all -> 0x0365, IOException -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0168 A[Catch:{ all -> 0x0361, all -> 0x0365, IOException -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017b A[Catch:{ all -> 0x0361, all -> 0x0365, IOException -> 0x0366 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:295:0x054b=Splitter:B:295:0x054b, B:284:0x053c=Splitter:B:284:0x053c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r44 = this;
            r1 = r44
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0579;
                case 2: goto L_0x056a;
                case 3: goto L_0x0054;
                case 4: goto L_0x004b;
                case 5: goto L_0x0010;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
        L_0x000b:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r4 = X.AnonymousClass067.A00(r0)
        L_0x000f:
            return r4
        L_0x0010:
            java.lang.Object r0 = r1.A00
            androidx.core.app.ComponentActivity r0 = (androidx.core.app.ComponentActivity) r0
            goto L_0x000b
        L_0x0015:
            java.lang.Object r0 = r1.A00
            X.19k r0 = (X.C211919k) r0
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            X.19b r3 = r0.A02
            if (r3 == 0) goto L_0x000f
            r2 = 0
        L_0x0022:
            r1 = 42
            int r0 = r3.A04(r1)
            if (r0 == 0) goto L_0x0049
            int r0 = r3.A06(r0)
        L_0x002e:
            if (r2 >= r0) goto L_0x000f
            int r0 = r3.A04(r1)
            if (r0 == 0) goto L_0x0047
            int r1 = r3.A05(r0)
            int r0 = r2 << 2
            int r1 = r1 + r0
            java.lang.String r0 = r3.A07(r1)
        L_0x0041:
            r4.add(r0)
            int r2 = r2 + 1
            goto L_0x0022
        L_0x0047:
            r0 = 0
            goto L_0x0041
        L_0x0049:
            r0 = 0
            goto L_0x002e
        L_0x004b:
            java.lang.Object r0 = r1.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.0nS r4 = X.C13330nS.A02(r0)
            return r4
        L_0x0054:
            java.lang.Object r2 = r1.A00
            android.content.Context r2 = (android.content.Context) r2
            r7 = 0
            X.3SH r6 = new X.3SH
            r6.<init>()
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            android.content.res.AssetManager r1 = r2.getAssets()
            r5 = 2
            java.lang.String r0 = "params_map_v4_u0.txt"
            byte[] r3 = X.AnonymousClass3W3.A01(r1, r0)
            if (r3 != 0) goto L_0x0075
            java.lang.String r0 = "params_map.txt"
            byte[] r3 = X.AnonymousClass3W3.A01(r1, r0)
        L_0x0075:
            android.content.res.AssetManager r1 = r2.getAssets()
            java.lang.String r0 = "params_names_v4_u0.txt"
            byte[] r8 = X.AnonymousClass3W3.A01(r1, r0)
            if (r3 == 0) goto L_0x0562
            int r0 = r3.length
            if (r0 < r5) goto L_0x0562
            r0 = 0
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3, r0, r5)
            java.lang.String r1 = "v2"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03aa
            java.lang.String r7 = X.C18250wR.A0b(r3)
            java.lang.String r26 = ""
            java.util.LinkedList r25 = new java.util.LinkedList
            r25.<init>()
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r24 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r23 = X.AnonymousClass0wJ.A0y()
            r22 = 6
            r1 = r22
            int[] r3 = new int[r1]
            int[] r1 = new int[r1]
            r21 = r1
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            r2.add(r7)
            boolean r1 = r26.isEmpty()
            if (r1 != 0) goto L_0x033c
            r1 = r26
            r2.add(r1)
            r20 = 1
        L_0x00cb:
            java.util.Iterator r19 = r2.iterator()
            r2 = r26
            r18 = -1
            r7 = -1
            r1 = -1
            r40 = 0
        L_0x00d7:
            boolean r8 = r19.hasNext()
            if (r8 == 0) goto L_0x038a
            java.lang.String r10 = X.C18220wO.A0t(r19)
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x00ef
            java.lang.String r9 = "ParamsMapParserOld"
            java.lang.String r8 = "paramsMap content is empty"
            X.AnonymousClass0LU.A0B(r9, r8)
            goto L_0x00d7
        L_0x00ef:
            java.lang.String r8 = "v2,"
            boolean r8 = r10.startsWith(r8)
            if (r8 == 0) goto L_0x036d
            r11 = 0
        L_0x00f8:
            r9 = r3[r11]
            r8 = r21[r11]
            if (r9 >= r8) goto L_0x0102
            r8 = r21[r11]
            r3[r11] = r8
        L_0x0102:
            int r11 = r11 + 1
            r8 = r22
            if (r11 < r8) goto L_0x00f8
            java.io.StringReader r9 = new java.io.StringReader     // Catch:{ IOException -> 0x0366 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x0366 }
            java.io.BufferedReader r17 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0366 }
            r8 = r17
            r8.<init>(r9)     // Catch:{ IOException -> 0x0366 }
            r15 = 0
            r8 = 1
        L_0x0116:
            java.lang.String r9 = r17.readLine()     // Catch:{ all -> 0x0361 }
            if (r9 != 0) goto L_0x011e
            goto L_0x032d
        L_0x011e:
            if (r8 != 0) goto L_0x032a
            java.lang.String r8 = "END"
            boolean r8 = r9.startsWith(r8)     // Catch:{ all -> 0x0361 }
            if (r8 == 0) goto L_0x012a
            goto L_0x032f
        L_0x012a:
            java.lang.String r10 = ","
            r16 = -1
            r8 = r16
            java.lang.String[] r11 = r9.split(r10, r8)     // Catch:{ all -> 0x0361 }
            r8 = r11[r0]     // Catch:{ all -> 0x0361 }
            java.lang.String r10 = "+"
            boolean r10 = r8.startsWith(r10)     // Catch:{ all -> 0x0361 }
            if (r10 != 0) goto L_0x02d4
            java.lang.String r10 = "-"
            boolean r10 = r8.startsWith(r10)     // Catch:{ all -> 0x0361 }
            if (r10 != 0) goto L_0x02d4
            java.lang.String r10 = "*"
            boolean r10 = r8.startsWith(r10)     // Catch:{ all -> 0x0361 }
            if (r10 == 0) goto L_0x01d9
            r1 = 1
            java.lang.String r2 = r8.substring(r1)     // Catch:{ all -> 0x0361 }
            int r8 = r11.length     // Catch:{ all -> 0x0361 }
            if (r8 <= r1) goto L_0x0165
            r7 = r11[r1]     // Catch:{ all -> 0x0361 }
            boolean r1 = r7.isEmpty()     // Catch:{ all -> 0x0361 }
            if (r1 != 0) goto L_0x0165
            r1 = 16
            int r1 = java.lang.Integer.parseInt(r7, r1)     // Catch:{ all -> 0x0361 }
            goto L_0x0166
        L_0x0165:
            r1 = 0
        L_0x0166:
            if (r8 <= r5) goto L_0x0177
            r8 = r11[r5]     // Catch:{ all -> 0x0361 }
            boolean r7 = r8.isEmpty()     // Catch:{ all -> 0x0361 }
            if (r7 != 0) goto L_0x0177
            r7 = 16
            int r40 = java.lang.Integer.parseInt(r8, r7)     // Catch:{ all -> 0x0361 }
            goto L_0x0179
        L_0x0177:
            r40 = 0
        L_0x0179:
            if (r20 == 0) goto L_0x0326
            java.lang.String r9 = java.lang.Integer.toString(r40)     // Catch:{ all -> 0x0361 }
            boolean r7 = r6.containsKey(r9)     // Catch:{ all -> 0x0361 }
            if (r7 == 0) goto L_0x019d
            java.lang.Object r8 = r4.get(r9)     // Catch:{ all -> 0x0361 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0361 }
            if (r8 == 0) goto L_0x0340
            boolean r7 = r8.isEmpty()     // Catch:{ all -> 0x0361 }
            if (r7 != 0) goto L_0x0340
            java.lang.Object r7 = r8.get(r0)     // Catch:{ all -> 0x0361 }
            X.3GH r7 = (X.AnonymousClass3GH) r7     // Catch:{ all -> 0x0361 }
            int r7 = r7.A02     // Catch:{ all -> 0x0361 }
            goto L_0x032a
        L_0x019d:
            boolean r7 = r4.containsKey(r2)     // Catch:{ all -> 0x0361 }
            if (r7 == 0) goto L_0x01bb
            java.lang.Object r8 = r4.get(r2)     // Catch:{ all -> 0x0361 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0361 }
            if (r8 == 0) goto L_0x0356
            boolean r7 = r8.isEmpty()     // Catch:{ all -> 0x0361 }
            if (r7 != 0) goto L_0x0356
            java.lang.Object r7 = r8.get(r0)     // Catch:{ all -> 0x0361 }
            X.3GH r7 = (X.AnonymousClass3GH) r7     // Catch:{ all -> 0x0361 }
            int r7 = r7.A02     // Catch:{ all -> 0x0361 }
            goto L_0x032a
        L_0x01bb:
            int r18 = r18 + 1
            if (r40 != 0) goto L_0x01c0
            r9 = r2
        L_0x01c0:
            java.util.HashSet r7 = X.C18200wM.A0u()     // Catch:{ all -> 0x0361 }
            r6.put(r9, r7)     // Catch:{ all -> 0x0361 }
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0361 }
            r4.put(r9, r7)     // Catch:{ all -> 0x0361 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x0361 }
            r7 = r24
            r7.put(r8, r9)     // Catch:{ all -> 0x0361 }
            goto L_0x0328
        L_0x01d9:
            java.lang.String r10 = "?"
            boolean r10 = r8.startsWith(r10)     // Catch:{ all -> 0x0361 }
            if (r10 == 0) goto L_0x01fa
            if (r15 == 0) goto L_0x01f7
            java.lang.String r11 = r15.A00     // Catch:{ all -> 0x0361 }
            java.lang.String r10 = ":"
            java.lang.String r8 = r15.A01     // Catch:{ all -> 0x0361 }
            java.lang.String r10 = X.AnonymousClass00U.A0V(r11, r10, r8)     // Catch:{ all -> 0x0361 }
            r8 = 1
            java.lang.String r9 = r9.substring(r8)     // Catch:{ all -> 0x0361 }
            r8 = r23
            r8.put(r10, r9)     // Catch:{ all -> 0x0361 }
        L_0x01f7:
            r15 = 0
            goto L_0x032a
        L_0x01fa:
            int r12 = r11.length     // Catch:{ all -> 0x0361 }
            r10 = 1
            if (r12 <= r10) goto L_0x034b
            r9 = r26
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x0361 }
            if (r9 == 0) goto L_0x0208
            java.lang.String r8 = "_"
        L_0x0208:
            r14 = 1
            r13 = r11[r10]     // Catch:{ all -> 0x0361 }
            r9 = r26
            boolean r9 = r13.equals(r9)     // Catch:{ all -> 0x0361 }
            if (r9 != 0) goto L_0x0219
            r9 = 16
            int r14 = java.lang.Integer.parseInt(r13, r9)     // Catch:{ all -> 0x0361 }
        L_0x0219:
            int r1 = r1 + r14
            if (r20 == 0) goto L_0x0255
            java.lang.String r9 = java.lang.Integer.toString(r40)     // Catch:{ all -> 0x0361 }
            java.lang.String r14 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0361 }
            boolean r13 = r6.containsKey(r9)     // Catch:{ all -> 0x0361 }
            if (r13 == 0) goto L_0x0231
            java.lang.Object r13 = r6.get(r9)     // Catch:{ all -> 0x0361 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0361 }
            goto L_0x0237
        L_0x0231:
            java.lang.Object r13 = r6.get(r2)     // Catch:{ all -> 0x0361 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0361 }
        L_0x0237:
            if (r13 == 0) goto L_0x0247
            boolean r9 = r13.contains(r14)     // Catch:{ all -> 0x0361 }
            if (r9 != 0) goto L_0x032a
            boolean r9 = r13.contains(r8)     // Catch:{ all -> 0x0361 }
            if (r9 == 0) goto L_0x0247
            goto L_0x032a
        L_0x0247:
            r9 = r16
            if (r1 == r9) goto L_0x024f
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r1 < r9) goto L_0x0250
        L_0x024f:
            r14 = r8
        L_0x0250:
            if (r13 == 0) goto L_0x0255
            r13.add(r14)     // Catch:{ all -> 0x0361 }
        L_0x0255:
            if (r12 <= r5) goto L_0x0266
            r13 = r11[r5]     // Catch:{ all -> 0x0361 }
            boolean r9 = r13.isEmpty()     // Catch:{ all -> 0x0361 }
            if (r9 != 0) goto L_0x0266
            r9 = 16
            int r13 = java.lang.Integer.parseInt(r13, r9)     // Catch:{ all -> 0x0361 }
            goto L_0x0267
        L_0x0266:
            r13 = 4
        L_0x0267:
            r9 = r13 & 28
            int r38 = r9 >> 2
            r9 = r13 & 64
            boolean r42 = X.C18180wK.A1V(r9)
            r9 = 3
            if (r12 <= r9) goto L_0x0275
            goto L_0x027c
        L_0x0275:
            r37 = r3[r38]     // Catch:{ all -> 0x0361 }
            int r9 = r37 + 1
            r3[r38] = r9     // Catch:{ all -> 0x0361 }
            goto L_0x028a
        L_0x027c:
            r11 = r11[r9]     // Catch:{ all -> 0x0361 }
            boolean r9 = r11.isEmpty()     // Catch:{ all -> 0x0361 }
            if (r9 != 0) goto L_0x0275
            r9 = 16
            int r37 = java.lang.Integer.parseInt(r11, r9)     // Catch:{ all -> 0x0361 }
        L_0x028a:
            r9 = r21[r38]     // Catch:{ all -> 0x0361 }
            int r9 = r9 + 1
            r21[r38] = r9     // Catch:{ all -> 0x0361 }
            int r9 = r13 / 2
            r39 = 2
            int r9 = r9 % r5
            if (r9 != r10) goto L_0x0299
            r39 = 1
        L_0x0299:
            int r9 = r13 % 2
            boolean r41 = X.AnonymousClass0wJ.A1T(r9, r10)
            r9 = r13 & 32
            boolean r43 = X.C18180wK.A1V(r9)
            X.3GH r9 = new X.3GH     // Catch:{ all -> 0x0361 }
            r31 = r9
            r32 = r2
            r33 = r8
            r34 = r1
            r35 = r7
            r36 = r1
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x0361 }
            if (r20 == 0) goto L_0x02ce
            if (r40 == 0) goto L_0x02bb
            goto L_0x02bd
        L_0x02bb:
            r8 = r2
            goto L_0x02c1
        L_0x02bd:
            java.lang.String r8 = java.lang.Integer.toString(r40)     // Catch:{ all -> 0x0361 }
        L_0x02c1:
            java.lang.Object r8 = r4.get(r8)     // Catch:{ all -> 0x0361 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0361 }
            r8.add(r9)     // Catch:{ all -> 0x0361 }
            if (r43 == 0) goto L_0x032a
            r15 = r9
            goto L_0x032a
        L_0x02ce:
            r8 = r25
            r8.add(r9)     // Catch:{ all -> 0x0361 }
            goto L_0x032a
        L_0x02d4:
            r9 = 1
            java.lang.String r2 = r8.substring(r9)     // Catch:{ all -> 0x0361 }
            int r7 = r7 + 1
            r8 = r11[r0]     // Catch:{ all -> 0x0361 }
            char r10 = r8.charAt(r0)     // Catch:{ all -> 0x0361 }
            r8 = 43
            r35 = 2
            if (r10 != r8) goto L_0x02e9
            r35 = 1
        L_0x02e9:
            int r8 = r11.length     // Catch:{ all -> 0x0361 }
            if (r8 <= r9) goto L_0x031f
            r10 = r11[r9]     // Catch:{ all -> 0x0361 }
            boolean r8 = r10.isEmpty()     // Catch:{ all -> 0x0361 }
            if (r8 != 0) goto L_0x031f
            r8 = 16
            int r33 = java.lang.Integer.parseInt(r10, r8)     // Catch:{ all -> 0x0361 }
        L_0x02fa:
            java.lang.String r8 = "gk_"
            java.lang.String r28 = X.AnonymousClass00U.A0L(r8, r2)     // Catch:{ all -> 0x0361 }
            X.3GH r10 = new X.3GH     // Catch:{ all -> 0x0361 }
            r27 = r10
            r29 = r26
            r30 = r9
            r31 = r7
            r32 = r9
            r34 = r9
            r36 = r0
            r37 = r0
            r38 = r0
            r39 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0361 }
            r8 = r25
            r8.add(r10)     // Catch:{ all -> 0x0361 }
            goto L_0x032a
        L_0x031f:
            r33 = r3[r9]     // Catch:{ all -> 0x0361 }
            int r8 = r33 + 1
            r3[r9] = r8     // Catch:{ all -> 0x0361 }
            goto L_0x02fa
        L_0x0326:
            int r18 = r18 + 1
        L_0x0328:
            r7 = r18
        L_0x032a:
            r8 = 0
            goto L_0x0116
        L_0x032d:
            r8 = 0
            goto L_0x0330
        L_0x032f:
            r8 = 1
        L_0x0330:
            r17.close()     // Catch:{ IOException -> 0x0366 }
            if (r8 != 0) goto L_0x00d7
            java.lang.String r0 = "Invalid paramsMapContent: no END marker found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x033c:
            r20 = 0
            goto L_0x00cb
        L_0x0340:
            java.lang.String r0 = "could not find key in configs "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r9)     // Catch:{ all -> 0x0361 }
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ all -> 0x0361 }
            goto L_0x0360
        L_0x034b:
            java.lang.String r0 = "Found incognible line : "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r9)     // Catch:{ all -> 0x0361 }
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ all -> 0x0361 }
            goto L_0x0360
        L_0x0356:
            java.lang.String r0 = "could not find configName in configs "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r2)     // Catch:{ all -> 0x0361 }
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ all -> 0x0361 }
        L_0x0360:
            throw r0     // Catch:{ all -> 0x0361 }
        L_0x0361:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0365 }
        L_0x0365:
            throw r0     // Catch:{ IOException -> 0x0366 }
        L_0x0366:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x036d:
            int r2 = r10.length()
            r1 = 15
            int r1 = java.lang.Math.min(r2, r1)
            java.lang.String r0 = r10.substring(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "current ParamsMap parsing only supports version 2 but found %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x038a:
            if (r20 == 0) goto L_0x0559
            java.util.Iterator r2 = X.C18190wL.A0u(r24)
        L_0x0390:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0559
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r1 = r4.get(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = r25
            r0.addAll(r1)
            goto L_0x0390
        L_0x03aa:
            java.lang.String r1 = "v4"
            boolean r1 = r2.equals(r1)
            java.lang.String r5 = "ParamsMapParser"
            if (r1 == 0) goto L_0x0553
            java.io.ByteArrayInputStream r17 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x054c }
            r1 = r17
            r1.<init>(r3)     // Catch:{ IOException -> 0x054c }
            if (r8 != 0) goto L_0x03bf
            r3 = 0
            goto L_0x03c4
        L_0x03bf:
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0547 }
            r3.<init>(r8)     // Catch:{ all -> 0x0547 }
        L_0x03c4:
            java.nio.channels.ReadableByteChannel r12 = java.nio.channels.Channels.newChannel(r17)     // Catch:{ IOException -> 0x0483 }
            X.36y r1 = X.AnonymousClass3W3.A00(r12)     // Catch:{ all -> 0x047c }
            int r1 = r1.A00     // Catch:{ all -> 0x047c }
            if (r1 <= 0) goto L_0x0476
            int r1 = r1 << 1
            int[] r7 = X.AnonymousClass3W3.A02(r12, r1)     // Catch:{ all -> 0x047c }
            if (r3 == 0) goto L_0x0471
            java.lang.StringBuilder r9 = X.C18200wM.A0r()     // Catch:{ all -> 0x047c }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x0405 }
            java.lang.String r1 = r1.name()     // Catch:{ IOException -> 0x0405 }
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r1)     // Catch:{ IOException -> 0x0405 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0405 }
            r1.<init>(r3, r2)     // Catch:{ IOException -> 0x0405 }
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0405 }
            r8.<init>(r1)     // Catch:{ IOException -> 0x0405 }
        L_0x03f0:
            int r2 = r8.read()     // Catch:{ all -> 0x0400 }
            r1 = -1
            if (r2 == r1) goto L_0x03fc
            char r1 = (char) r2     // Catch:{ all -> 0x0400 }
            r9.append(r1)     // Catch:{ all -> 0x0400 }
            goto L_0x03f0
        L_0x03fc:
            r8.close()     // Catch:{ IOException -> 0x0405 }
            goto L_0x040d
        L_0x0400:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0404 }
        L_0x0404:
            throw r1     // Catch:{ IOException -> 0x0405 }
        L_0x0405:
            r8 = move-exception
            java.lang.String r2 = "FileParsingUtils"
            java.lang.String r1 = "getFileContentAsString: failed due to exception: "
            X.AnonymousClass0LU.A0I(r2, r1, r8)     // Catch:{ all -> 0x047c }
        L_0x040d:
            java.lang.String r1 = r9.toString()     // Catch:{ all -> 0x047c }
            org.json.JSONArray r15 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0464 }
            r15.<init>(r1)     // Catch:{ JSONException -> 0x0464 }
            java.util.HashMap r14 = X.AnonymousClass0wJ.A0y()     // Catch:{ JSONException -> 0x0464 }
            r13 = 0
        L_0x041b:
            int r1 = r15.length()     // Catch:{ JSONException -> 0x0464 }
            if (r13 >= r1) goto L_0x0475
            java.lang.String r2 = r15.getString(r13)     // Catch:{ JSONException -> 0x0464 }
            if (r2 == 0) goto L_0x0461
            java.lang.String r1 = ":"
            java.lang.String[] r11 = r2.split(r1)     // Catch:{ JSONException -> 0x0464 }
            r1 = r11[r0]     // Catch:{ JSONException -> 0x0464 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ JSONException -> 0x0464 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0464 }
            r1 = 1
            r2 = r11[r1]     // Catch:{ JSONException -> 0x0464 }
            java.util.HashMap r9 = X.AnonymousClass0wJ.A0y()     // Catch:{ JSONException -> 0x0464 }
            r1 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0464 }
            r9.put(r1, r2)     // Catch:{ JSONException -> 0x0464 }
            r8 = 2
        L_0x0447:
            int r1 = r11.length     // Catch:{ JSONException -> 0x0464 }
            if (r8 >= r1) goto L_0x045e
            r1 = r11[r8]     // Catch:{ JSONException -> 0x0464 }
            int r16 = java.lang.Integer.parseInt(r1)     // Catch:{ JSONException -> 0x0464 }
            int r1 = r8 + 1
            r2 = r11[r1]     // Catch:{ JSONException -> 0x0464 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)     // Catch:{ JSONException -> 0x0464 }
            r9.put(r1, r2)     // Catch:{ JSONException -> 0x0464 }
            int r8 = r8 + 2
            goto L_0x0447
        L_0x045e:
            r14.put(r10, r9)     // Catch:{ JSONException -> 0x0464 }
        L_0x0461:
            int r13 = r13 + 1
            goto L_0x041b
        L_0x0464:
            r2 = move-exception
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x047c }
            X.AnonymousClass0LU.A0E(r5, r1, r2)     // Catch:{ all -> 0x047c }
            java.util.HashMap r14 = X.AnonymousClass0wJ.A0y()     // Catch:{ all -> 0x047c }
            goto L_0x0475
        L_0x0471:
            java.util.HashMap r14 = X.AnonymousClass0wJ.A0y()     // Catch:{ all -> 0x047c }
        L_0x0475:
            r4 = r14
        L_0x0476:
            if (r12 == 0) goto L_0x0489
            r12.close()     // Catch:{ IOException -> 0x0483 }
            goto L_0x0489
        L_0x047c:
            r1 = move-exception
            if (r12 == 0) goto L_0x0482
            r12.close()     // Catch:{ all -> 0x0482 }
        L_0x0482:
            throw r1     // Catch:{ IOException -> 0x0483 }
        L_0x0483:
            r2 = move-exception
            java.lang.String r1 = "Failed to load params map due to exception"
            X.AnonymousClass0LU.A0E(r5, r1, r2)     // Catch:{ all -> 0x0540 }
        L_0x0489:
            if (r7 == 0) goto L_0x0532
            r22 = -1
            r12 = 0
            r26 = 0
        L_0x0490:
            int r1 = r7.length     // Catch:{ all -> 0x0540 }
            if (r0 >= r1) goto L_0x0537
            int r2 = r0 + 1
            r1 = r7[r2]     // Catch:{ all -> 0x0540 }
            int r11 = r1 >>> 12
            r1 = r7[r2]     // Catch:{ all -> 0x0540 }
            r13 = r1 & 4095(0xfff, float:5.738E-42)
            r1 = r7[r0]     // Catch:{ all -> 0x0540 }
            int r1 = r1 >> 9
            r15 = r1 & 127(0x7f, float:1.78E-43)
            r1 = r15 & 2
            r9 = 1
            int r1 = r1 >> r9
            if (r11 == r12) goto L_0x04b2
            int r22 = r22 + 1
            r12 = r11
            r26 = 2
            if (r1 <= 0) goto L_0x04b2
            r26 = 1
        L_0x04b2:
            r2 = r7[r0]     // Catch:{ all -> 0x0540 }
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r1
            int r24 = r2 >> 16
            r1 = r7[r0]     // Catch:{ all -> 0x0540 }
            r1 = r1 & 14336(0x3800, float:2.0089E-41)
            int r25 = r1 >> 11
            r14 = r15 & 32
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0540 }
            boolean r1 = r4.containsKey(r10)     // Catch:{ all -> 0x0540 }
            java.lang.String r20 = ""
            if (r1 == 0) goto L_0x0509
            java.lang.Object r2 = r4.get(r10)     // Catch:{ all -> 0x0540 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x0540 }
            r2.getClass()     // Catch:{ all -> 0x0540 }
            r1 = -2
            java.lang.Object r2 = X.C18200wM.A0f(r2, r1)     // Catch:{ all -> 0x0540 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0540 }
            r2.getClass()     // Catch:{ all -> 0x0540 }
        L_0x04e0:
            boolean r1 = r4.containsKey(r10)     // Catch:{ all -> 0x0540 }
            if (r1 == 0) goto L_0x0506
            java.lang.Object r8 = r4.get(r10)     // Catch:{ all -> 0x0540 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x0540 }
            r8.getClass()     // Catch:{ all -> 0x0540 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0540 }
            boolean r8 = r8.containsKey(r1)     // Catch:{ all -> 0x0540 }
            if (r8 == 0) goto L_0x0506
            java.lang.Object r8 = r4.get(r10)     // Catch:{ all -> 0x0540 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x0540 }
            java.lang.String r20 = X.C18220wO.A0r(r1, r8)     // Catch:{ all -> 0x0540 }
            r20.getClass()     // Catch:{ all -> 0x0540 }
        L_0x0506:
            int r1 = r15 % 2
            goto L_0x050c
        L_0x0509:
            r2 = r20
            goto L_0x04e0
        L_0x050c:
            boolean r28 = X.AnonymousClass0wJ.A1T(r1, r9)
            int r1 = r15 >> 6
            boolean r29 = X.AnonymousClass0wJ.A1T(r1, r9)
            boolean r30 = X.C18180wK.A1X(r14)
            X.3GH r1 = new X.3GH     // Catch:{ all -> 0x0540 }
            r18 = r1
            r19 = r2
            r21 = r13
            r23 = r13
            r27 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0540 }
            java.util.List r2 = r6.A00     // Catch:{ all -> 0x0540 }
            r2.add(r1)     // Catch:{ all -> 0x0540 }
            int r0 = r0 + 2
            goto L_0x0490
        L_0x0532:
            java.lang.String r0 = "Failed to load base params_map v4"
            X.AnonymousClass0LU.A0B(r5, r0)     // Catch:{ all -> 0x0540 }
        L_0x0537:
            if (r3 == 0) goto L_0x053c
            r3.close()     // Catch:{ all -> 0x0547 }
        L_0x053c:
            r17.close()     // Catch:{ IOException -> 0x054c }
            goto L_0x0562
        L_0x0540:
            r0 = move-exception
            if (r3 == 0) goto L_0x0546
            r3.close()     // Catch:{ all -> 0x0546 }
        L_0x0546:
            throw r0     // Catch:{ all -> 0x0547 }
        L_0x0547:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x054b }
        L_0x054b:
            throw r0     // Catch:{ IOException -> 0x054c }
        L_0x054c:
            r1 = move-exception
            java.lang.String r0 = "Failed to load two input streams when parsing params map to map"
            X.AnonymousClass0LU.A0E(r5, r0, r1)
            goto L_0x0562
        L_0x0553:
            java.lang.String r0 = "unrecognizable params map byte array"
            X.AnonymousClass0LU.A0B(r5, r0)
            goto L_0x0562
        L_0x0559:
            X.3SH r6 = new X.3SH
            r1 = r25
            r0 = r23
            r6.<init>(r1, r0)
        L_0x0562:
            java.util.List r0 = r6.A00
            X.3IC r4 = new X.3IC
            r4.<init>(r0)
            return r4
        L_0x056a:
            java.lang.Object r0 = r1.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.49q r1 = X.AnonymousClass3Zs.A03(r0)
            X.D2R r0 = X.D2R.A10
            android.content.SharedPreferences r4 = r1.A01(r0)
            return r4
        L_0x0579:
            java.lang.Object r0 = r1.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.Jj9 r4 = X.C18210wN.A0L(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxProviderShape244S0100000_1_I2.get():java.lang.Object");
    }
}
