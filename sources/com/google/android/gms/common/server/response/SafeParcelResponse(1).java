package com.google.android.gms.common.server.response;

import X.C122167Ky;
import X.C13320nQ;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(24);
    public final Parcel A00;
    public final zan A01;
    public final String A02;
    public final int A03;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r0 = android.util.Base64.encodeToString(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r3.append(r0);
        r3.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(java.lang.Object r2, java.lang.StringBuilder r3, int r4) {
        /*
            java.lang.String r1 = "\""
            switch(r4) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0016;
                case 2: goto L_0x0016;
                case 3: goto L_0x0016;
                case 4: goto L_0x0016;
                case 5: goto L_0x0016;
                case 6: goto L_0x0016;
                case 7: goto L_0x001a;
                case 8: goto L_0x0029;
                case 9: goto L_0x0032;
                case 10: goto L_0x0048;
                case 11: goto L_0x0051;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 26
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Unknown type = "
            java.lang.String r0 = X.C86104wH.A10(r0, r1, r4)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0016:
            r3.append(r2)
            return
        L_0x001a:
            r3.append(r1)
            X.C13320nQ.A01(r2)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = X.C1192173z.A00(r0)
            goto L_0x003f
        L_0x0029:
            r3.append(r1)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L_0x0046
            r0 = 0
            goto L_0x003b
        L_0x0032:
            r3.append(r1)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L_0x0046
            r0 = 10
        L_0x003b:
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r0)
        L_0x003f:
            r3.append(r0)
            r3.append(r1)
            return
        L_0x0046:
            r0 = 0
            goto L_0x003f
        L_0x0048:
            X.C13320nQ.A01(r2)
            java.util.HashMap r2 = (java.util.HashMap) r2
            X.C32552Ch.A00(r3, r2)
            return
        L_0x0051:
            java.lang.String r0 = "Method does not accept concrete type."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.A01(java.lang.Object, java.lang.StringBuilder, int):void");
    }

    public final String toString() {
        zan zan = this.A01;
        C13320nQ.A02(zan, "Cannot convert to JSON on client side.");
        Parcel parcel = this.A00;
        parcel.setDataPosition(0);
        StringBuilder A0s = C86114wI.A0s(100);
        String str = this.A02;
        C13320nQ.A01(str);
        Map map = (Map) zan.A02.get(str);
        C13320nQ.A01(map);
        A00(parcel, A0s, map);
        return A0s.toString();
    }

    public SafeParcelResponse(Parcel parcel, zan zan, int i) {
        String str;
        this.A03 = i;
        C13320nQ.A01(parcel);
        this.A00 = parcel;
        this.A01 = zan;
        if (zan == null) {
            str = null;
        } else {
            str = zan.A01;
        }
        this.A02 = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x039b, code lost:
        r5.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a0, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x040b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0418, code lost:
        r5.append(r0);
        r5.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x042b, code lost:
        A01(r10, r5, r9.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cc, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0113, code lost:
        r10 = X.AnonymousClass7Eu.A02(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0119, code lost:
        if (r9.A05 == false) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011b, code lost:
        r10 = (java.util.AbstractList) r10;
        r5.append("[");
        r8 = r10.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0127, code lost:
        if (r2 >= r8) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0129, code lost:
        if (r2 == 0) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012b, code lost:
        r5.append(com.facebook.traffic.knob.InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012e, code lost:
        A01(r10.get(r2), r5, r9.A02);
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.os.Parcel r18, java.lang.StringBuilder r19, java.util.Map r20) {
        /*
            r17 = this;
            android.util.SparseArray r7 = X.C86154wM.A0D()
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r20)
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001e
            java.util.Map$Entry r1 = X.C18180wK.A0o(r2)
            java.lang.Object r0 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = (com.google.android.gms.common.server.response.FastJsonResponse$Field) r0
            int r0 = r0.A03
            r7.put(r0, r1)
            goto L_0x0008
        L_0x001e:
            r0 = 123(0x7b, float:1.72E-43)
            r5 = r19
            r5.append(r0)
            r4 = r18
            int r3 = X.AnonymousClass7Kw.A02(r4)
            r6 = 0
            r8 = 0
        L_0x002d:
            int r0 = r4.dataPosition()
            if (r0 >= r3) goto L_0x0441
            int r1 = r4.readInt()
            char r0 = (char) r1
            java.lang.Object r2 = r7.get(r0)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 == 0) goto L_0x002d
            java.lang.String r11 = ","
            if (r8 == 0) goto L_0x0047
            r5.append(r11)
        L_0x0047:
            java.lang.String r0 = X.C18200wM.A0p(r2)
            java.lang.Object r9 = r2.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = (com.google.android.gms.common.server.response.FastJsonResponse$Field) r9
            java.lang.String r10 = "\""
            r5.append(r10)
            r5.append(r0)
            java.lang.String r0 = "\":"
            r5.append(r0)
            X.8eM r0 = r9.A00
            if (r0 == 0) goto L_0x013a
            int r2 = r9.A07
            switch(r2) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00b4;
                case 2: goto L_0x00ab;
                case 3: goto L_0x00a2;
                case 4: goto L_0x0099;
                case 5: goto L_0x0078;
                case 6: goto L_0x0107;
                case 7: goto L_0x0102;
                case 8: goto L_0x00fd;
                case 9: goto L_0x00fd;
                case 10: goto L_0x00d7;
                case 11: goto L_0x0433;
                default: goto L_0x0067;
            }
        L_0x0067:
            r0 = 36
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Unknown field out type = "
            java.lang.String r0 = X.C86104wH.A10(r0, r1, r2)
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)
            throw r1
        L_0x0078:
            int r8 = X.AnonymousClass7Kw.A05(r4, r1)
            int r0 = r4.dataPosition()
            if (r8 == 0) goto L_0x00cc
            byte[] r2 = r4.createByteArray()
            int r1 = r4.readInt()
            int r0 = r0 + r8
            r4.setDataPosition(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0, r1)
            goto L_0x0113
        L_0x0099:
            double r0 = X.AnonymousClass7Kw.A00(r4, r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            goto L_0x0113
        L_0x00a2:
            float r0 = X.AnonymousClass7Kw.A01(r4, r1)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            goto L_0x0113
        L_0x00ab:
            long r0 = X.AnonymousClass7Kw.A07(r4, r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L_0x0113
        L_0x00b4:
            int r2 = X.AnonymousClass7Kw.A05(r4, r1)
            int r1 = r4.dataPosition()
            if (r2 == 0) goto L_0x00cc
            byte[] r0 = r4.createByteArray()
            int r1 = r1 + r2
            r4.setDataPosition(r1)
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r0)
            goto L_0x0113
        L_0x00cc:
            r2 = 0
            goto L_0x0113
        L_0x00ce:
            int r0 = X.AnonymousClass7Kw.A04(r4, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0113
        L_0x00d7:
            android.os.Bundle r10 = X.AnonymousClass7Kw.A09(r4, r1)
            java.util.HashMap r8 = X.AnonymousClass0wJ.A0y()
            java.util.Iterator r2 = X.C86144wL.A0x(r10)
        L_0x00e3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = X.C18180wK.A0k(r2)
            java.lang.String r0 = r10.getString(r1)
            X.C13320nQ.A01(r0)
            r8.put(r1, r0)
            goto L_0x00e3
        L_0x00f8:
            java.lang.Object r10 = X.AnonymousClass7Eu.A02(r9, r8)
            goto L_0x0117
        L_0x00fd:
            byte[] r2 = X.AnonymousClass7Kw.A0O(r4, r1)
            goto L_0x0113
        L_0x0102:
            java.lang.String r2 = X.AnonymousClass7Kw.A0E(r4, r1)
            goto L_0x0113
        L_0x0107:
            int r0 = X.AnonymousClass7Kw.A04(r4, r1)
            boolean r0 = X.C18180wK.A1V(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0113:
            java.lang.Object r10 = X.AnonymousClass7Eu.A02(r9, r2)
        L_0x0117:
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x042b
            java.util.AbstractList r10 = (java.util.AbstractList) r10
            java.lang.String r0 = "["
            r5.append(r0)
            int r8 = r10.size()
            r2 = 0
        L_0x0127:
            if (r2 >= r8) goto L_0x0304
            if (r2 == 0) goto L_0x012e
            r5.append(r11)
        L_0x012e:
            int r1 = r9.A02
            java.lang.Object r0 = r10.get(r2)
            A01(r0, r5, r1)
            int r2 = r2 + 1
            goto L_0x0127
        L_0x013a:
            boolean r0 = r9.A0A
            r8 = r17
            if (r0 == 0) goto L_0x0308
            java.lang.String r0 = "["
            r5.append(r0)
            int r0 = r9.A07
            switch(r0) {
                case 0: goto L_0x02eb;
                case 1: goto L_0x0298;
                case 2: goto L_0x026f;
                case 3: goto L_0x0246;
                case 4: goto L_0x021d;
                case 5: goto L_0x01dc;
                case 6: goto L_0x01b3;
                case 7: goto L_0x02d0;
                case 8: goto L_0x043a;
                case 9: goto L_0x043a;
                case 10: goto L_0x043a;
                case 11: goto L_0x0151;
                default: goto L_0x014a;
            }
        L_0x014a:
            java.lang.String r0 = "Unknown field type out."
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)
            throw r1
        L_0x0151:
            int r16 = X.AnonymousClass7Kw.A05(r4, r1)
            int r15 = r4.dataPosition()
            r14 = 0
            if (r16 == 0) goto L_0x0188
            int r13 = r4.readInt()
            android.os.Parcel[] r12 = new android.os.Parcel[r13]
            r10 = 0
        L_0x0163:
            if (r10 >= r13) goto L_0x0182
            int r2 = r4.readInt()
            if (r2 == 0) goto L_0x017f
            int r1 = r4.dataPosition()
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r0.appendFrom(r4, r1, r2)
            r12[r10] = r0
            int r1 = r1 + r2
            r4.setDataPosition(r1)
        L_0x017c:
            int r10 = r10 + 1
            goto L_0x0163
        L_0x017f:
            r12[r10] = r14
            goto L_0x017c
        L_0x0182:
            int r15 = r15 + r16
            r4.setDataPosition(r15)
            r14 = r12
        L_0x0188:
            int r10 = r14.length
            r2 = 0
        L_0x018a:
            if (r2 >= r10) goto L_0x0304
            if (r2 <= 0) goto L_0x0191
            r5.append(r11)
        L_0x0191:
            r0 = r14[r2]
            r0.setDataPosition(r6)
            java.lang.String r1 = r9.A04
            X.C13320nQ.A01(r1)
            com.google.android.gms.common.server.response.zan r0 = r9.A01
            X.C13320nQ.A01(r0)
            java.util.HashMap r0 = r0.A02
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            X.C13320nQ.A01(r1)
            r0 = r14[r2]
            r8.A00(r0, r5, r1)
            int r2 = r2 + 1
            goto L_0x018a
        L_0x01b3:
            int r1 = X.AnonymousClass7Kw.A05(r4, r1)
            int r0 = r4.dataPosition()
            if (r1 != 0) goto L_0x01d3
            r8 = 0
        L_0x01be:
            int r2 = r8.length
            r1 = 0
        L_0x01c0:
            if (r1 >= r2) goto L_0x0304
            if (r1 == 0) goto L_0x01c7
            r5.append(r11)
        L_0x01c7:
            boolean r0 = r8[r1]
            java.lang.String r0 = java.lang.Boolean.toString(r0)
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x01c0
        L_0x01d3:
            boolean[] r8 = r4.createBooleanArray()
            int r0 = r0 + r1
            r4.setDataPosition(r0)
            goto L_0x01be
        L_0x01dc:
            int r13 = X.AnonymousClass7Kw.A05(r4, r1)
            int r12 = r4.dataPosition()
            if (r13 != 0) goto L_0x01f8
            r10 = 0
        L_0x01e7:
            int r2 = r10.length
            r1 = 0
        L_0x01e9:
            if (r1 >= r2) goto L_0x0304
            if (r1 == 0) goto L_0x01f0
            r5.append(r11)
        L_0x01f0:
            r0 = r10[r1]
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x01e9
        L_0x01f8:
            int r9 = r4.readInt()
            java.math.BigDecimal[] r10 = new java.math.BigDecimal[r9]
            r8 = 0
        L_0x01ff:
            if (r8 >= r9) goto L_0x0218
            byte[] r0 = r4.createByteArray()
            int r2 = r4.readInt()
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r2)
            r10[r8] = r0
            int r8 = r8 + 1
            goto L_0x01ff
        L_0x0218:
            int r12 = r12 + r13
            r4.setDataPosition(r12)
            goto L_0x01e7
        L_0x021d:
            int r1 = X.AnonymousClass7Kw.A05(r4, r1)
            int r0 = r4.dataPosition()
            if (r1 != 0) goto L_0x023d
            r9 = 0
        L_0x0228:
            int r8 = r9.length
            r2 = 0
        L_0x022a:
            if (r2 >= r8) goto L_0x0304
            if (r2 == 0) goto L_0x0231
            r5.append(r11)
        L_0x0231:
            r0 = r9[r2]
            java.lang.String r0 = java.lang.Double.toString(r0)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x022a
        L_0x023d:
            double[] r9 = r4.createDoubleArray()
            int r0 = r0 + r1
            r4.setDataPosition(r0)
            goto L_0x0228
        L_0x0246:
            int r1 = X.AnonymousClass7Kw.A05(r4, r1)
            int r0 = r4.dataPosition()
            if (r1 != 0) goto L_0x0266
            r8 = 0
        L_0x0251:
            int r2 = r8.length
            r1 = 0
        L_0x0253:
            if (r1 >= r2) goto L_0x0304
            if (r1 == 0) goto L_0x025a
            r5.append(r11)
        L_0x025a:
            r0 = r8[r1]
            java.lang.String r0 = java.lang.Float.toString(r0)
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x0253
        L_0x0266:
            float[] r8 = r4.createFloatArray()
            int r0 = r0 + r1
            r4.setDataPosition(r0)
            goto L_0x0251
        L_0x026f:
            int r1 = X.AnonymousClass7Kw.A05(r4, r1)
            int r0 = r4.dataPosition()
            if (r1 != 0) goto L_0x028f
            r9 = 0
        L_0x027a:
            int r8 = r9.length
            r2 = 0
        L_0x027c:
            if (r2 >= r8) goto L_0x0304
            if (r2 == 0) goto L_0x0283
            r5.append(r11)
        L_0x0283:
            r0 = r9[r2]
            java.lang.String r0 = java.lang.Long.toString(r0)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x027c
        L_0x028f:
            long[] r9 = r4.createLongArray()
            int r0 = r0 + r1
            r4.setDataPosition(r0)
            goto L_0x027a
        L_0x0298:
            int r12 = X.AnonymousClass7Kw.A05(r4, r1)
            int r10 = r4.dataPosition()
            if (r12 != 0) goto L_0x02b4
            r9 = 0
        L_0x02a3:
            int r2 = r9.length
            r1 = 0
        L_0x02a5:
            if (r1 >= r2) goto L_0x0304
            if (r1 == 0) goto L_0x02ac
            r5.append(r11)
        L_0x02ac:
            r0 = r9[r1]
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x02a5
        L_0x02b4:
            int r8 = r4.readInt()
            java.math.BigInteger[] r9 = new java.math.BigInteger[r8]
            r2 = 0
        L_0x02bb:
            if (r2 >= r8) goto L_0x02cb
            byte[] r1 = r4.createByteArray()
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            r9[r2] = r0
            int r2 = r2 + 1
            goto L_0x02bb
        L_0x02cb:
            int r10 = r10 + r12
            r4.setDataPosition(r10)
            goto L_0x02a3
        L_0x02d0:
            java.lang.String[] r8 = X.AnonymousClass7Kw.A0R(r4, r1)
            int r2 = r8.length
            r1 = 0
        L_0x02d6:
            if (r1 >= r2) goto L_0x0304
            if (r1 == 0) goto L_0x02dd
            r5.append(r11)
        L_0x02dd:
            r5.append(r10)
            r0 = r8[r1]
            r5.append(r0)
            r5.append(r10)
            int r1 = r1 + 1
            goto L_0x02d6
        L_0x02eb:
            int[] r8 = X.AnonymousClass7Kw.A0P(r4, r1)
            int r2 = r8.length
            r1 = 0
        L_0x02f1:
            if (r1 >= r2) goto L_0x0304
            if (r1 == 0) goto L_0x02f8
            r5.append(r11)
        L_0x02f8:
            r0 = r8[r1]
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x02f1
        L_0x0304:
            java.lang.String r0 = "]"
            goto L_0x03e9
        L_0x0308:
            int r0 = r9.A07
            switch(r0) {
                case 0: goto L_0x03a2;
                case 1: goto L_0x0384;
                case 2: goto L_0x037b;
                case 3: goto L_0x0372;
                case 4: goto L_0x0369;
                case 5: goto L_0x0348;
                case 6: goto L_0x041f;
                case 7: goto L_0x040d;
                case 8: goto L_0x03fd;
                case 9: goto L_0x03ed;
                case 10: goto L_0x03ab;
                case 11: goto L_0x0314;
                default: goto L_0x030d;
            }
        L_0x030d:
            java.lang.String r0 = "Unknown field type out"
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)
            throw r1
        L_0x0314:
            int r1 = X.AnonymousClass7Kw.A05(r4, r1)
            int r0 = r4.dataPosition()
            if (r1 != 0) goto L_0x033c
            r2 = 0
        L_0x031f:
            r2.setDataPosition(r6)
            java.lang.String r1 = r9.A04
            X.C13320nQ.A01(r1)
            com.google.android.gms.common.server.response.zan r0 = r9.A01
            X.C13320nQ.A01(r0)
            java.util.HashMap r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            X.C13320nQ.A01(r0)
            r8.A00(r2, r5, r0)
            goto L_0x0430
        L_0x033c:
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r2.appendFrom(r4, r0, r1)
            int r0 = r0 + r1
            r4.setDataPosition(r0)
            goto L_0x031f
        L_0x0348:
            int r8 = X.AnonymousClass7Kw.A05(r4, r1)
            int r0 = r4.dataPosition()
            if (r8 == 0) goto L_0x03a0
            byte[] r2 = r4.createByteArray()
            int r1 = r4.readInt()
            int r0 = r0 + r8
            r4.setDataPosition(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0, r1)
            goto L_0x039b
        L_0x0369:
            double r0 = X.AnonymousClass7Kw.A00(r4, r1)
            r5.append(r0)
            goto L_0x0430
        L_0x0372:
            float r0 = X.AnonymousClass7Kw.A01(r4, r1)
            r5.append(r0)
            goto L_0x0430
        L_0x037b:
            long r0 = X.AnonymousClass7Kw.A07(r4, r1)
            r5.append(r0)
            goto L_0x0430
        L_0x0384:
            int r2 = X.AnonymousClass7Kw.A05(r4, r1)
            int r1 = r4.dataPosition()
            if (r2 == 0) goto L_0x03a0
            byte[] r0 = r4.createByteArray()
            int r1 = r1 + r2
            r4.setDataPosition(r1)
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r0)
        L_0x039b:
            r5.append(r2)
            goto L_0x0430
        L_0x03a0:
            r2 = 0
            goto L_0x039b
        L_0x03a2:
            int r0 = X.AnonymousClass7Kw.A04(r4, r1)
            r5.append(r0)
            goto L_0x0430
        L_0x03ab:
            android.os.Bundle r9 = X.AnonymousClass7Kw.A09(r4, r1)
            java.util.Set r1 = r9.keySet()
            java.lang.String r0 = "{"
            r5.append(r0)
            java.util.Iterator r8 = r1.iterator()
            r2 = 1
        L_0x03bd:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x03e7
            java.lang.String r1 = X.C18180wK.A0k(r8)
            if (r2 != 0) goto L_0x03cc
            r5.append(r11)
        L_0x03cc:
            r5.append(r10)
            r5.append(r1)
            java.lang.String r0 = "\":\""
            r5.append(r0)
            java.lang.String r0 = r9.getString(r1)
            java.lang.String r0 = X.C1192173z.A00(r0)
            r5.append(r0)
            r5.append(r10)
            r2 = 0
            goto L_0x03bd
        L_0x03e7:
            java.lang.String r0 = "}"
        L_0x03e9:
            r5.append(r0)
            goto L_0x0430
        L_0x03ed:
            byte[] r1 = X.AnonymousClass7Kw.A0O(r4, r1)
            r5.append(r10)
            if (r1 == 0) goto L_0x040b
            r0 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            goto L_0x0418
        L_0x03fd:
            byte[] r0 = X.AnonymousClass7Kw.A0O(r4, r1)
            r5.append(r10)
            if (r0 == 0) goto L_0x040b
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r6)
            goto L_0x0418
        L_0x040b:
            r0 = 0
            goto L_0x0418
        L_0x040d:
            java.lang.String r0 = X.AnonymousClass7Kw.A0E(r4, r1)
            r5.append(r10)
            java.lang.String r0 = X.C1192173z.A00(r0)
        L_0x0418:
            r5.append(r0)
            r5.append(r10)
            goto L_0x0430
        L_0x041f:
            int r0 = X.AnonymousClass7Kw.A04(r4, r1)
            boolean r0 = X.C18180wK.A1V(r0)
            r5.append(r0)
            goto L_0x0430
        L_0x042b:
            int r0 = r9.A02
            A01(r10, r5, r0)
        L_0x0430:
            r8 = 1
            goto L_0x002d
        L_0x0433:
            java.lang.String r0 = "Method does not accept concrete type."
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)
            throw r1
        L_0x043a:
            java.lang.String r0 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            java.lang.UnsupportedOperationException r1 = X.C86134wK.A0s(r0)
            throw r1
        L_0x0441:
            int r0 = r4.dataPosition()
            if (r0 != r3) goto L_0x044d
            r0 = 125(0x7d, float:1.75E-43)
            r5.append(r0)
            return
        L_0x044d:
            r0 = 37
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Overread allowed size end="
            java.lang.String r0 = X.C86104wH.A10(r0, r1, r3)
            X.88N r1 = new X.88N
            r1.<init>(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.A00(android.os.Parcel, java.lang.StringBuilder, java.util.Map):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A03);
        Parcel parcel2 = this.A00;
        if (parcel2 != null) {
            int A012 = C122167Ky.A01(parcel, 2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            C122167Ky.A05(parcel, A012);
        }
        C122167Ky.A0D(parcel, this.A01, 3, i, false);
        C122167Ky.A05(parcel, A002);
    }
}
