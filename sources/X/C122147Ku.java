package X;

import ch.boye.httpclientandroidlib.impl.auth.NTLMEngineImpl;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.7Ku  reason: invalid class name and case insensitive filesystem */
public final class C122147Ku {
    public static final Object A08 = "false";
    public static final Object A09 = "length";
    public static final Object A0A = AnonymousClass3WF.A00(1.0d);
    public static final Object A0B = "true";
    public static final Object A0C = AnonymousClass3WF.A00(0.0d);
    public int A00;
    public int A01;
    public int A02;
    public C105936eE A03;
    public int[] A04 = new int[16];
    public Object[] A05 = new Object[16];
    public final Random A06 = new Random();
    public final Object A07 = AnonymousClass0wJ.A0y();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r9 != 1) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r0 > 0) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r0 < 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0C(int r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            int r0 = r8.A01
            int r1 = r0 + -1
            java.lang.Object[] r0 = r8.A05
            r2 = r0[r1]
            r5 = 1
            int r1 = r1 - r5
            r3 = r0[r1]
            boolean r1 = r3 instanceof java.lang.Long
            r6 = 2
            if (r1 == 0) goto L_0x0045
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0045
            if (r1 == 0) goto L_0x0043
            java.lang.Number r3 = (java.lang.Number) r3
        L_0x001a:
            long r3 = r3.longValue()
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0041
            java.lang.Number r2 = (java.lang.Number) r2
        L_0x0024:
            long r1 = r2.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
        L_0x002a:
            if (r9 == 0) goto L_0x0078
            if (r9 == r5) goto L_0x0073
        L_0x002e:
            if (r9 == r6) goto L_0x003e
            if (r0 > 0) goto L_0x0033
        L_0x0032:
            r7 = 1
        L_0x0033:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.A09(r5, r0)
            A0F(r8)
            return
        L_0x003e:
            if (r0 >= 0) goto L_0x0033
            goto L_0x0032
        L_0x0041:
            r2 = 0
            goto L_0x0024
        L_0x0043:
            r3 = 0
            goto L_0x001a
        L_0x0045:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x0056
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0056
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r3.compareTo(r2)
            goto L_0x002a
        L_0x0056:
            java.lang.Number r1 = A04(r3)
            java.lang.Number r0 = A04(r2)
            if (r1 == 0) goto L_0x007b
            if (r0 == 0) goto L_0x007b
            double r3 = r1.doubleValue()
            double r1 = r0.doubleValue()
            if (r9 == 0) goto L_0x0076
            if (r9 == r5) goto L_0x0071
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            goto L_0x002e
        L_0x0071:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
        L_0x0073:
            if (r0 <= 0) goto L_0x0033
            goto L_0x0032
        L_0x0076:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
        L_0x0078:
            if (r0 < 0) goto L_0x0033
            goto L_0x0032
        L_0x007b:
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r10)
            A0I(r3, r2, r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122147Ku.A0C(int, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.6ll} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.6ll} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.601} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: X.601} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: X.601} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: X.601} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: X.601} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: X.601} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: X.601} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v10, resolved type: X.601} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v84, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v85, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v86, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v87, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r2v44, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v80, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ea, code lost:
        r10.A09(0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0309, code lost:
        r10.A09(0, r10.A0O(A07(r10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0099, code lost:
        if (r0 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x037d, code lost:
        if (r4 != null) goto L_0x0387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x037f, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0381, code lost:
        r1 = X.AnonymousClass00U.A03(r3, "Type assertion failed. Expected ", ", got ", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0387, code lost:
        r0 = X.C18220wO.A0q(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c1, code lost:
        if (r0 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04a2, code lost:
        r10.A09(0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00cb, code lost:
        r18.position(r1 + r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x055c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00db, code lost:
        r18.getShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0c63, code lost:
        if (r1 == null) goto L_0x0c65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0168, code lost:
        if (r3 == r4) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0d06, code lost:
        X.C121467Gg.A01(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0d20, code lost:
        X.C121467Gg.A01(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016f, code lost:
        if (r0 == 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:0x0de0, code lost:
        if (r1 == null) goto L_0x0de2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:749:0x0e84, code lost:
        if (r12 == null) goto L_0x0e73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x0e86, code lost:
        r0 = r12.equals(r5.A04);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:0x0e8c, code lost:
        if (r0 != false) goto L_0x0e73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x0e8e, code lost:
        r5 = new X.C110486ll(r5.A00, r5.A01, r5.A02, (java.util.List) r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:762:0x0ed5, code lost:
        r1 = new X.C1373388e(X.AnonymousClass00U.A0L("TypeError: ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:778:0x0f34, code lost:
        r10.A09(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:795:0x0f87, code lost:
        A0K(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:805:0x0fe7, code lost:
        r10.A0P(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:879:0x1200, code lost:
        r1 = new X.C1373388e(X.AnonymousClass00U.A0L("RangeError: ", "key not in map"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:887:0x1237, code lost:
        r12 = "ArrayCopy dst index out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x123a, code lost:
        r12 = "ArrayCopy src index out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:890:0x1240, code lost:
        r12 = "StringSearch offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:892:0x1246, code lost:
        r12 = "SubstringCompare offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:894:0x124c, code lost:
        r12 = "Substring offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:904:0x1288, code lost:
        A0J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:911:0x12b3, code lost:
        A0K(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:912:0x12b6, code lost:
        r1 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1005:0x11e8 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0E(X.C122147Ku r33) {
        /*
            r0 = 4
            r10 = r33
            int r1 = r10.A00
            int r1 = r1 - r0
            java.lang.Object[] r0 = r10.A05
            r0 = r0[r1]
            X.6jr r17 = X.AnonymousClass70O.A00(r0)
            r0 = r17
            X.6l1 r2 = r0.A00
            X.78w r0 = r2.A03
            r33 = r0
            java.nio.ByteBuffer r0 = r0.A01
            java.nio.ByteBuffer r18 = r0.duplicate()
            java.nio.ByteOrder r1 = r0.order()
            r0 = r18
            r0.order(r1)
            int r1 = r2.A02
            r0.position(r1)
            int r0 = r2.A00
            int r1 = r1 + r0
            r0 = r18
            r0.limit(r1)
            int r1 = r18.position()
            byte r0 = r0.get(r1)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9 = 2
            r8 = 1
            r7 = 0
            if (r0 != r9) goto L_0x131f
            r19 = 0
            r16 = 0
        L_0x0045:
            int r16 = r18.position()     // Catch:{ 88e -> 0x12b8 }
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r2 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = "vector index out of range"
            java.lang.String r1 = "key not in map"
            r24 = 0
            java.lang.String r3 = "invalid get_by_val vector index"
            java.lang.String r4 = "modifying immutable container"
            r11 = 3
            switch(r2) {
                case 0: goto L_0x0fa8;
                case 1: goto L_0x0ea6;
                case 2: goto L_0x10e1;
                case 3: goto L_0x0181;
                case 4: goto L_0x0df0;
                case 5: goto L_0x07e6;
                case 6: goto L_0x07a5;
                case 7: goto L_0x0781;
                case 8: goto L_0x0753;
                case 9: goto L_0x0714;
                case 10: goto L_0x0694;
                case 11: goto L_0x115e;
                case 12: goto L_0x1291;
                case 13: goto L_0x10da;
                case 14: goto L_0x0fec;
                case 15: goto L_0x067c;
                case 16: goto L_0x065e;
                case 17: goto L_0x061f;
                case 18: goto L_0x0f3c;
                case 19: goto L_0x05bc;
                case 20: goto L_0x0577;
                case 21: goto L_0x0521;
                case 22: goto L_0x0521;
                case 23: goto L_0x050a;
                case 24: goto L_0x04e5;
                case 25: goto L_0x04e5;
                case 26: goto L_0x04bb;
                case 27: goto L_0x0467;
                case 28: goto L_0x043c;
                case 29: goto L_0x043c;
                case 30: goto L_0x048f;
                case 31: goto L_0x03e6;
                case 32: goto L_0x03e6;
                case 33: goto L_0x03dd;
                case 34: goto L_0x0f59;
                case 35: goto L_0x03bf;
                case 36: goto L_0x039e;
                case 37: goto L_0x038c;
                case 38: goto L_0x035f;
                case 39: goto L_0x07e0;
                case 40: goto L_0x10d3;
                case 41: goto L_0x10cc;
                case 42: goto L_0x0352;
                case 43: goto L_0x0345;
                case 44: goto L_0x0337;
                case 45: goto L_0x0329;
                case 46: goto L_0x1155;
                case 47: goto L_0x0316;
                case 48: goto L_0x02ef;
                case 49: goto L_0x0309;
                case 50: goto L_0x02d9;
                case 51: goto L_0x02c8;
                case 52: goto L_0x02b7;
                case 53: goto L_0x0299;
                case 54: goto L_0x0288;
                case 55: goto L_0x0270;
                case 56: goto L_0x025b;
                case 57: goto L_0x0237;
                case 58: goto L_0x021f;
                case 59: goto L_0x10c5;
                case 60: goto L_0x10be;
                case 61: goto L_0x10b7;
                case 62: goto L_0x10b0;
                case 63: goto L_0x10a8;
                case 64: goto L_0x01f6;
                case 65: goto L_0x01da;
                case 66: goto L_0x10a0;
                case 67: goto L_0x1098;
                case 68: goto L_0x108f;
                case 69: goto L_0x1086;
                case 70: goto L_0x107d;
                case 71: goto L_0x1074;
                case 72: goto L_0x01c2;
                case 73: goto L_0x106b;
                case 74: goto L_0x1062;
                case 75: goto L_0x1059;
                case 76: goto L_0x1050;
                case 77: goto L_0x1047;
                case 78: goto L_0x01a8;
                case 79: goto L_0x103e;
                case 80: goto L_0x1035;
                case 81: goto L_0x102c;
                case 82: goto L_0x1023;
                case 83: goto L_0x101a;
                case 84: goto L_0x1011;
                case 85: goto L_0x00e0;
                case 86: goto L_0x00e0;
                case 87: goto L_0x100a;
                case 88: goto L_0x1003;
                case 89: goto L_0x0ffc;
                case 90: goto L_0x0ff5;
                case 91: goto L_0x00d8;
                case 92: goto L_0x00d4;
                case 93: goto L_0x00af;
                case 94: goto L_0x009c;
                case 95: goto L_0x0087;
                case 96: goto L_0x0074;
                case 97: goto L_0x00c4;
                case 98: goto L_0x006c;
                default: goto L_0x005d;
            }
        L_0x005d:
            java.lang.String r1 = "Unsupported opcode "
            java.lang.String[] r0 = X.J67.A00     // Catch:{ 88e -> 0x12b8 }
            r0 = r0[r2]     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            A0J(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x006c:
            int r1 = r18.getInt()     // Catch:{ 88e -> 0x12b8 }
            r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            goto L_0x00cb
        L_0x0074:
            int r1 = r18.getInt()     // Catch:{ 88e -> 0x12b8 }
            r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = A0M(r0)     // Catch:{ 88e -> 0x12b8 }
            A0F(r10)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0099
        L_0x0087:
            short r1 = r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = A0M(r0)     // Catch:{ 88e -> 0x12b8 }
            A0F(r10)     // Catch:{ 88e -> 0x12b8 }
        L_0x0099:
            if (r0 != 0) goto L_0x0045
            goto L_0x00cb
        L_0x009c:
            int r1 = r18.getInt()     // Catch:{ 88e -> 0x12b8 }
            r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = A0M(r0)     // Catch:{ 88e -> 0x12b8 }
            A0F(r10)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x00c1
        L_0x00af:
            short r1 = r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = A0M(r0)     // Catch:{ 88e -> 0x12b8 }
            A0F(r10)     // Catch:{ 88e -> 0x12b8 }
        L_0x00c1:
            if (r0 == 0) goto L_0x0045
            goto L_0x00cb
        L_0x00c4:
            short r1 = r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            r18.getShort()     // Catch:{ 88e -> 0x12b8 }
        L_0x00cb:
            int r1 = r1 + r16
            r0 = r18
            r0.position(r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x00d4:
            r18.getInt()     // Catch:{ 88e -> 0x12b8 }
            goto L_0x00db
        L_0x00d8:
            r18.getShort()     // Catch:{ 88e -> 0x12b8 }
        L_0x00db:
            r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x00e0:
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r4 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            int r1 = r1 - r8
            r3 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            if (r3 != 0) goto L_0x00ee
            goto L_0x0162
        L_0x00ee:
            boolean r1 = r3 instanceof java.lang.Boolean     // Catch:{ 88e -> 0x12b8 }
            r11 = 1
            r0 = 0
            if (r1 == 0) goto L_0x0103
            boolean r5 = X.AnonymousClass0wJ.A1X(r3)     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = r4 instanceof java.lang.Boolean     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x012b
            boolean r0 = X.AnonymousClass0wJ.A1X(r4)     // Catch:{ 88e -> 0x12b8 }
            if (r5 != r0) goto L_0x016b
            goto L_0x0171
        L_0x0103:
            boolean r1 = X.AnonymousClass70O.A01(r3)     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x0118
            double r5 = X.C86124wJ.A00(r3)     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = X.AnonymousClass70O.A01(r4)     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x012b
            double r3 = X.C86124wJ.A00(r4)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x016d
        L_0x0118:
            boolean r1 = r3 instanceof java.lang.Long     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x0140
            long r5 = X.C18190wL.A08(r3)     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = r4 instanceof java.lang.Long     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x012b
            long r3 = X.C18190wL.A08(r4)     // Catch:{ 88e -> 0x12b8 }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            goto L_0x016f
        L_0x012b:
            java.lang.Number r3 = A04(r3)     // Catch:{ 88e -> 0x12b8 }
            if (r3 == 0) goto L_0x0166
            java.lang.Number r1 = A04(r4)     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x0166
            double r5 = r3.doubleValue()     // Catch:{ 88e -> 0x12b8 }
            double r3 = r1.doubleValue()     // Catch:{ 88e -> 0x12b8 }
            goto L_0x016d
        L_0x0140:
            boolean r0 = r3 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0151
            boolean r0 = r4 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x016b
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r3.equals(r4)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x016b
            goto L_0x0171
        L_0x0151:
            boolean r0 = r3 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0168
            boolean r0 = r3 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0168
            boolean r0 = r3 instanceof X.C105916eC     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0168
            boolean r0 = r3.equals(r4)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0166
        L_0x0162:
            boolean r0 = X.C18220wO.A1U(r4)
        L_0x0166:
            r11 = r0
            goto L_0x0171
        L_0x0168:
            if (r3 != r4) goto L_0x016b
            goto L_0x0171
        L_0x016b:
            r11 = 0
            goto L_0x0171
        L_0x016d:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
        L_0x016f:
            if (r0 != 0) goto L_0x016b
        L_0x0171:
            r0 = 86
            boolean r0 = X.AnonymousClass0wJ.A1T(r2, r0)
            r11 = r11 ^ r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r8, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0f59
        L_0x0181:
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r0 = r0 + -1
            int r0 = r0 - r3
            java.lang.Object[] r2 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r4 = r2[r0]     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r4 instanceof X.C105916eC     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0198
            java.lang.String r0 = "op_call target is not a closure"
            goto L_0x12b3
        L_0x0198:
            r1 = 4
            int r0 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r0 = r0 - r1
            r1 = r2[r0]     // Catch:{ 88e -> 0x12b8 }
            r0 = r16
            A0H(r10, r4, r1, r3, r0)     // Catch:{ 88e -> 0x12b8 }
            A0E(r10)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x01a8:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = A05(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x1186
            long r2 = r0.longValue()     // Catch:{ 88e -> 0x12b8 }
            r0 = -1
            long r2 = r2 ^ r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x01c2:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = A05(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x118d
            long r2 = r0.longValue()     // Catch:{ 88e -> 0x12b8 }
            long r0 = -r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x01da:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = A04(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x1194
            double r2 = r0.doubleValue()     // Catch:{ 88e -> 0x12b8 }
            long r0 = (long) r2     // Catch:{ 88e -> 0x12b8 }
            int r2 = (int) r0     // Catch:{ 88e -> 0x12b8 }
            r0 = r2 ^ -1
            double r0 = (double) r0     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x01f6:
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r3 = r0 + -1
            int r1 = r3 - r8
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r2 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            r1 = r0[r3]     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0217
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0217
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r2, r1)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r8, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0f59
        L_0x0217:
            r1 = 5
            java.lang.String r0 = "+"
            r10.A0A(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x021f:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = A04(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x119b
            double r2 = r0.doubleValue()     // Catch:{ 88e -> 0x12b8 }
            double r0 = -r2
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0237:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = A04(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x11a2
            double r1 = r0.doubleValue()     // Catch:{ 88e -> 0x12b8 }
            int r0 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x0256
            double r0 = java.lang.Math.floor(r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x024d:
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0256:
            double r0 = java.lang.Math.ceil(r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x024d
        L_0x025b:
            java.lang.Object r0 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = A0M(r0)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.C18180wK.A1W(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0270:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0045
            boolean r0 = X.AnonymousClass0wJ.A1X(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0285
            java.lang.Object r0 = A0A     // Catch:{ 88e -> 0x12b8 }
        L_0x0280:
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0285:
            java.lang.Object r0 = A0C     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0280
        L_0x0288:
            java.lang.Object r0 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = A0M(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0299:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = A03(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x11a9
            long r2 = r0.longValue()     // Catch:{ 88e -> 0x12b8 }
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            double r0 = (double) r2     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x02b7:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = A03(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x02ea
            java.lang.String r0 = "TO_INT32 operand must be numeric"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x02c8:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = A05(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x02ea
            java.lang.String r0 = "TO_BIGINT operand must be numeric"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x02d9:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = A04(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x02ea
            java.lang.String r0 = "TO_NUMBER operand must be numeric"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x02ea:
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x02ef:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = A03(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x11b0
            int r1 = r0.intValue()     // Catch:{ 88e -> 0x12b8 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            char r0 = (char) r1     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
        L_0x0309:
            java.lang.Object r0 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = r10.A0O(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0316:
            short r1 = r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = r33
            java.lang.Object r0 = r0.A01(r1)     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0329:
            int r0 = r18.getInt()     // Catch:{ 88e -> 0x12b8 }
            double r0 = (double) r0     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0337:
            short r0 = r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            double r0 = (double) r0     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0345:
            double r0 = r18.getDouble()     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0352:
            long r0 = r18.getLong()     // Catch:{ 88e -> 0x12b8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x035f:
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r3 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Object r4 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            int r1 = A02(r4)     // Catch:{ 88e -> 0x12b8 }
            r0 = 100
            if (r3 != r0) goto L_0x0377
            r0 = 4
            if (r1 == r0) goto L_0x0045
            if (r1 == r11) goto L_0x0045
            goto L_0x0379
        L_0x0377:
            if (r1 == r3) goto L_0x0045
        L_0x0379:
            java.lang.String r2 = "Type assertion failed. Expected "
            java.lang.String r1 = ", got "
            if (r4 != 0) goto L_0x0387
            java.lang.String r0 = "null"
        L_0x0381:
            java.lang.String r1 = X.AnonymousClass00U.A03(r3, r2, r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0ed5
        L_0x0387:
            java.lang.String r0 = X.C18220wO.A0q(r4)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0381
        L_0x038c:
            java.lang.Object r0 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            int r0 = A02(r0)     // Catch:{ 88e -> 0x12b8 }
            double r0 = (double) r0     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x039e:
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r3 = r0 & 255(0xff, float:3.57E-43)
            r0 = r19
            boolean r1 = X.C18230wP.A1W(r3, r0)
            java.lang.String r0 = "invalid local store index"
            if (r1 == 0) goto L_0x1288
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r0 = r0 + -1
            java.lang.Object[] r2 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r1 = r2[r0]     // Catch:{ 88e -> 0x12b8 }
            int r0 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r0 = r0 + r3
            int r0 = r0 + 1
            r2[r0] = r1     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0f59
        L_0x03bf:
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = r19
            boolean r1 = X.C18230wP.A1W(r2, r0)
            java.lang.String r0 = "invalid local load index"
            if (r1 == 0) goto L_0x1288
            int r0 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r0 = r0 + r2
            int r1 = r0 + 1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r0 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x03dd:
            java.lang.Object r0 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x03e6:
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r3 = r0 + -1
            int r0 = r3 - r9
            java.lang.Object[] r1 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r5 = r1[r0]     // Catch:{ 88e -> 0x12b8 }
            r6 = r1[r3]     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r5 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x03fd
            java.lang.String r0 = "vector_resize 1st argument must be a vector"
            A0K(r0, r5)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x03fd:
            java.util.List r5 = (java.util.List) r5     // Catch:{ UnsupportedOperationException -> 0x0437 }
            int r3 = r3 - r8
            r3 = r1[r3]     // Catch:{ UnsupportedOperationException -> 0x0437 }
            java.lang.String r1 = "invalid vector_resize_length"
            r0 = 4194304(0x400000, float:5.877472E-39)
            int r3 = r10.A0N(r3, r1, r0)     // Catch:{ UnsupportedOperationException -> 0x0437 }
            int r1 = r5.size()     // Catch:{ UnsupportedOperationException -> 0x0437 }
            if (r3 <= r1) goto L_0x0423
            boolean r0 = r5 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x0437 }
            if (r0 == 0) goto L_0x041a
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ UnsupportedOperationException -> 0x0437 }
            r0.ensureCapacity(r3)     // Catch:{ UnsupportedOperationException -> 0x0437 }
        L_0x041a:
            r5.add(r6)     // Catch:{ UnsupportedOperationException -> 0x0437 }
            int r1 = r1 + 1
            if (r3 > r1) goto L_0x041a
            goto L_0x0f37
        L_0x0423:
            if (r3 >= r1) goto L_0x0f37
        L_0x0425:
            int r1 = r1 + -1
            r5.remove(r1)     // Catch:{ UnsupportedOperationException -> 0x0437 }
            if (r3 < r1) goto L_0x0425
            boolean r0 = r5 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x0437 }
            if (r0 == 0) goto L_0x0f37
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ UnsupportedOperationException -> 0x0437 }
            r5.trimToSize()     // Catch:{ UnsupportedOperationException -> 0x0437 }
            goto L_0x0f37
        L_0x0437:
            r3 = move-exception
            r0 = 32
            goto L_0x0573
        L_0x043c:
            short r6 = r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r0
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r5 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            int r1 = r1 - r8
            r3 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            r1 = 28
            boolean r0 = r3 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x11b7
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ 88e -> 0x12b8 }
            r0 = r33
            java.lang.Object r0 = r0.A01(r6)     // Catch:{ UnsupportedOperationException -> 0x0462 }
            r3.put(r0, r5)     // Catch:{ UnsupportedOperationException -> 0x0462 }
            goto L_0x05b4
        L_0x0462:
            r3 = move-exception
            r0 = 29
            goto L_0x0506
        L_0x0467:
            short r4 = r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            java.lang.Object r3 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            r2 = 26
            boolean r0 = r3 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x11c5
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ 88e -> 0x12b8 }
            r0 = r33
            java.lang.Object r2 = r0.A01(r4)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = r3.get(r2)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x04a2
            boolean r0 = r3.containsKey(r2)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x1200
            r0 = 0
            goto L_0x04a2
        L_0x048f:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x04a7
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 88e -> 0x12b8 }
            int r0 = r1.size()     // Catch:{ 88e -> 0x12b8 }
        L_0x049d:
            double r0 = (double) r0     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
        L_0x04a2:
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x04a7:
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x04b0
            int r0 = X.C86144wL.A08(r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x049d
        L_0x04b0:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x11be
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 88e -> 0x12b8 }
            int r0 = r1.length()     // Catch:{ 88e -> 0x12b8 }
            goto L_0x049d
        L_0x04bb:
            short r3 = r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            java.lang.Object r2 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            r1 = 26
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x11cc
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 88e -> 0x12b8 }
            A0F(r10)     // Catch:{ 88e -> 0x12b8 }
            r0 = r33
            java.lang.Object r0 = r0.A01(r3)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r2.containsKey(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x04e5:
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r5 = r0 + -1
            int r1 = r5 - r8
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r3 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            r1 = r0[r5]     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r3 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x0503 }
            if (r0 == 0) goto L_0x04fc
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ UnsupportedOperationException -> 0x0503 }
            r3.remove(r1)     // Catch:{ UnsupportedOperationException -> 0x0503 }
            goto L_0x05b4
        L_0x04fc:
            java.lang.String r0 = "del_by_val 1st argument must be a map"
            A0K(r0, r3)     // Catch:{ UnsupportedOperationException -> 0x0503 }
            r0 = 0
            throw r0     // Catch:{ UnsupportedOperationException -> 0x0503 }
        L_0x0503:
            r3 = move-exception
            r0 = 25
        L_0x0506:
            if (r2 == r0) goto L_0x05b4
            goto L_0x11d3
        L_0x050a:
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r3 = r0 + -1
            int r1 = r3 - r8
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r2 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            r1 = r0[r3]     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r2 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x11e7 }
            if (r0 == 0) goto L_0x11e0
            java.util.List r2 = (java.util.List) r2     // Catch:{ UnsupportedOperationException -> 0x11e7 }
            r2.add(r1)     // Catch:{ UnsupportedOperationException -> 0x11e7 }
            goto L_0x05b4
        L_0x0521:
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r3 = r0 + -1
            int r0 = r3 - r9
            java.lang.Object[] r1 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r6 = r1[r0]     // Catch:{ 88e -> 0x12b8 }
            int r0 = r3 - r8
            r5 = r1[r0]     // Catch:{ 88e -> 0x12b8 }
            r3 = r1[r3]     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r6 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x0570 }
            if (r0 == 0) goto L_0x053c
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ UnsupportedOperationException -> 0x0570 }
            r6.put(r5, r3)     // Catch:{ UnsupportedOperationException -> 0x0570 }
            goto L_0x0f37
        L_0x053c:
            boolean r0 = r6 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x0570 }
            if (r0 == 0) goto L_0x055d
            java.util.List r6 = (java.util.List) r6     // Catch:{ UnsupportedOperationException -> 0x0570 }
            java.lang.String r1 = "invalid put_by_val vector index"
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r10.A0N(r5, r1, r0)     // Catch:{ UnsupportedOperationException -> 0x0570 }
            int r0 = r6.size()     // Catch:{ UnsupportedOperationException -> 0x0570 }
            if (r1 <= r0) goto L_0x0564
            java.lang.String r0 = "RangeError: "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r12)     // Catch:{ UnsupportedOperationException -> 0x0570 }
            X.88e r0 = new X.88e     // Catch:{ UnsupportedOperationException -> 0x0570 }
            r0.<init>(r1)     // Catch:{ UnsupportedOperationException -> 0x0570 }
        L_0x055c:
            throw r0     // Catch:{ UnsupportedOperationException -> 0x0570 }
        L_0x055d:
            java.lang.String r0 = "put_by_val 1st argument must be a container"
            A0K(r0, r6)     // Catch:{ UnsupportedOperationException -> 0x0570 }
            r0 = 0
            goto L_0x055c
        L_0x0564:
            if (r1 != r0) goto L_0x056b
            r6.add(r3)     // Catch:{ UnsupportedOperationException -> 0x0570 }
            goto L_0x0f37
        L_0x056b:
            r6.set(r1, r3)     // Catch:{ UnsupportedOperationException -> 0x0570 }
            goto L_0x0f37
        L_0x0570:
            r3 = move-exception
            r0 = 22
        L_0x0573:
            if (r2 == r0) goto L_0x0f37
            goto L_0x11e8
        L_0x0577:
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r5 = r0 + -1
            int r0 = r5 - r9
            java.lang.Object[] r1 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r4 = r1[r0]     // Catch:{ 88e -> 0x12b8 }
            int r0 = r5 - r8
            r2 = r1[r0]     // Catch:{ 88e -> 0x12b8 }
            r0 = r1[r5]     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = r4 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x059a
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r1 = r4.get(r2)     // Catch:{ 88e -> 0x12b8 }
            if (r1 != 0) goto L_0x05b1
            boolean r1 = r4.containsKey(r2)     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x05ba
            goto L_0x05b9
        L_0x059a:
            boolean r1 = r4 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x11f5
            java.util.List r4 = (java.util.List) r4     // Catch:{ 88e -> 0x12b8 }
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            int r2 = r10.A0N(r2, r3, r1)     // Catch:{ 88e -> 0x12b8 }
            int r1 = r4.size()     // Catch:{ 88e -> 0x12b8 }
            if (r2 >= r1) goto L_0x05ba
            java.lang.Object r1 = r4.get(r2)     // Catch:{ 88e -> 0x12b8 }
        L_0x05b1:
            r10.A09(r9, r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x05b4:
            r10.A08(r9)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x05b9:
            r0 = 0
        L_0x05ba:
            r1 = r0
            goto L_0x05b1
        L_0x05bc:
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r4 = r0 + -1
            int r2 = r4 - r8
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r2 = r0[r2]     // Catch:{ 88e -> 0x12b8 }
            r4 = r0[r4]     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x05dc
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = r2.get(r4)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x05f3
            boolean r0 = r2.containsKey(r4)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x1200
            r0 = 0
            goto L_0x05f3
        L_0x05dc:
            boolean r0 = r2 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x05f8
            java.util.List r2 = (java.util.List) r2     // Catch:{ 88e -> 0x12b8 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r10.A0N(r4, r3, r0)     // Catch:{ 88e -> 0x12b8 }
            int r0 = r2.size()     // Catch:{ 88e -> 0x12b8 }
            if (r1 >= r0) goto L_0x1255
            java.lang.Object r0 = r2.get(r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x05f3:
            r10.A09(r8, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0f59
        L_0x05f8:
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0617
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 88e -> 0x12b8 }
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r0 = "invalid get_by_val string index"
            int r1 = r10.A0N(r4, r0, r1)     // Catch:{ 88e -> 0x12b8 }
            int r0 = r2.length()     // Catch:{ 88e -> 0x12b8 }
            if (r1 >= r0) goto L_0x120d
            char r0 = r2.charAt(r1)     // Catch:{ 88e -> 0x12b8 }
            double r0 = (double) r0     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x05f3
        L_0x0617:
            java.lang.String r0 = "get_by_val 1st argument must be a container for key %s"
            java.lang.String r0 = X.C86164wN.A0i(r4, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0f87
        L_0x061f:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0636
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ 88e -> 0x12b8 }
            java.util.ArrayList r0 = X.C18200wM.A0s(r1)     // Catch:{ 88e -> 0x12b8 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)     // Catch:{ 88e -> 0x12b8 }
        L_0x0631:
            r10.A09(r7, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0636:
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0645
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 88e -> 0x12b8 }
            java.util.HashMap r0 = X.C86164wN.A0j(r1)     // Catch:{ 88e -> 0x12b8 }
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0631
        L_0x0645:
            if (r1 == 0) goto L_0x0631
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0631
            boolean r0 = r1 instanceof java.lang.Number     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0631
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0631
            boolean r0 = r1 instanceof X.C105916eC     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0631
            java.lang.String r0 = "argument of immutable_clone cannot be a host ref"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x065e:
            java.lang.Object r1 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0671
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ 88e -> 0x12b8 }
            java.util.ArrayList r0 = X.C18200wM.A0s(r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x066c:
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0671:
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x1210
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 88e -> 0x12b8 }
            java.util.HashMap r0 = X.C86164wN.A0j(r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x066c
        L_0x067c:
            java.lang.Object r2 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r1 = "invalid vector capacity"
            r0 = 4194304(0x400000, float:5.877472E-39)
            int r1 = r10.A0N(r2, r1, r0)     // Catch:{ 88e -> 0x12b8 }
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()     // Catch:{ 88e -> 0x12b8 }
            r0.ensureCapacity(r1)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0694:
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r12 = r0 & 255(0xff, float:3.57E-43)
            int r14 = r12 + 1
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r3 = r0 + -1
            int r0 = r3 - r14
            java.lang.Object[] r2 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r6 = r2[r0]     // Catch:{ 88e -> 0x12b8 }
            r1 = 10
            boolean r0 = r6 instanceof X.C105916eC     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x121e
            X.AnonymousClass70O.A00(r6)     // Catch:{ 88e -> 0x12b8 }
            r11 = r2[r3]     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r11 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x06bc
            java.util.List r11 = (java.util.List) r11     // Catch:{ 88e -> 0x12b8 }
            int r5 = r11.size()     // Catch:{ 88e -> 0x12b8 }
            goto L_0x06c0
        L_0x06bc:
            if (r11 != 0) goto L_0x1217
            r11 = 0
            r5 = 0
        L_0x06c0:
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = r0 - r12
            if (r0 >= r5) goto L_0x06ca
            java.lang.String r1 = "too many arguments to apply"
            goto L_0x0ed5
        L_0x06ca:
            int r4 = r12 + r5
            int r13 = r4 + 1
            A0G(r10, r13)     // Catch:{ 88e -> 0x12b8 }
            int r3 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r2 = r3 + -1
            int r2 = r2 - r12
            int r13 = r13 + r3
            r10.A01 = r13     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object[] r1 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r0 = 0
            java.util.Arrays.fill(r1, r3, r13, r0)     // Catch:{ 88e -> 0x12b8 }
            int r1 = r3 + 1
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r0[r3] = r6     // Catch:{ 88e -> 0x12b8 }
            java.lang.System.arraycopy(r0, r2, r0, r1, r12)     // Catch:{ 88e -> 0x12b8 }
            int r1 = r1 + r12
            if (r11 == 0) goto L_0x06fc
            r3 = 0
        L_0x06ec:
            if (r3 >= r5) goto L_0x06fc
            int r12 = r1 + 1
            java.lang.Object r2 = r11.get(r3)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r0[r1] = r2     // Catch:{ 88e -> 0x12b8 }
            int r3 = r3 + 1
            r1 = r12
            goto L_0x06ec
        L_0x06fc:
            r0 = 4
            int r1 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r1 = r1 - r0
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r1 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            r0 = r16
            A0H(r10, r6, r1, r4, r0)     // Catch:{ 88e -> 0x12b8 }
            A0E(r10)     // Catch:{ 88e -> 0x12b8 }
            int r11 = r14 + 1
            java.lang.Object r0 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0f34
        L_0x0714:
            r0 = 4
            int r3 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r1 = r3 - r0
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r0 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            X.6jr r0 = X.AnonymousClass70O.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object[] r1 = r0.A02     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x0746
            int r2 = r1.length     // Catch:{ 88e -> 0x12b8 }
        L_0x0726:
            int r3 = r3 - r11
            int[] r0 = r10.A04     // Catch:{ 88e -> 0x12b8 }
            r3 = r0[r3]     // Catch:{ 88e -> 0x12b8 }
            int r0 = r2 + r3
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x0734
            java.lang.System.arraycopy(r1, r7, r4, r7, r2)     // Catch:{ 88e -> 0x12b8 }
        L_0x0734:
            int r1 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r0 = r3 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            java.lang.System.arraycopy(r0, r1, r4, r2, r3)     // Catch:{ 88e -> 0x12b8 }
            int r3 = r4.length     // Catch:{ 88e -> 0x12b8 }
            java.util.ArrayList r2 = X.C18240wQ.A0k(r3)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0748
        L_0x0746:
            r2 = 0
            goto L_0x0726
        L_0x0748:
            r1 = 0
        L_0x0749:
            if (r1 >= r3) goto L_0x0fe7
            r0 = r4[r1]     // Catch:{ 88e -> 0x12b8 }
            r2.add(r0)     // Catch:{ 88e -> 0x12b8 }
            int r1 = r1 + 1
            goto L_0x0749
        L_0x0753:
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = 4
            int r3 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r1 = r3 - r0
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r0 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            X.6jr r0 = X.AnonymousClass70O.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object[] r0 = r0.A02     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0771
            int r1 = r0.length     // Catch:{ 88e -> 0x12b8 }
        L_0x076b:
            int r3 = r3 - r11
            int[] r0 = r10.A04     // Catch:{ 88e -> 0x12b8 }
            r0 = r0[r3]     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0773
        L_0x0771:
            r1 = 0
            goto L_0x076b
        L_0x0773:
            int r1 = r1 + r0
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0781:
            r0 = 4
            int r2 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r1 = r2 - r0
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r0 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            X.6jr r0 = X.AnonymousClass70O.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object[] r0 = r0.A02     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x07a3
            int r1 = r0.length     // Catch:{ 88e -> 0x12b8 }
        L_0x0793:
            int r2 = r2 - r11
            int[] r0 = r10.A04     // Catch:{ 88e -> 0x12b8 }
            r0 = r0[r2]     // Catch:{ 88e -> 0x12b8 }
            int r1 = r1 + r0
            double r0 = (double) r1     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x07a3:
            r1 = 0
            goto L_0x0793
        L_0x07a5:
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r5 = r0 & 255(0xff, float:3.57E-43)
            r0 = 4
            int r3 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r0 = r3 - r0
            java.lang.Object[] r2 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r0 = r2[r0]     // Catch:{ 88e -> 0x12b8 }
            X.6jr r0 = X.AnonymousClass70O.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object[] r6 = r0.A02     // Catch:{ 88e -> 0x12b8 }
            if (r6 == 0) goto L_0x07cc
            int r4 = r6.length     // Catch:{ 88e -> 0x12b8 }
        L_0x07bd:
            int r1 = r3 - r11
            int[] r0 = r10.A04     // Catch:{ 88e -> 0x12b8 }
            r1 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            if (r5 >= r4) goto L_0x07ce
            r0 = r6[r5]     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x07cc:
            r4 = 0
            goto L_0x07bd
        L_0x07ce:
            int r0 = r4 + r1
            if (r5 >= r0) goto L_0x07e0
            int r5 = r5 - r4
            int r1 = r1 - r5
            int r0 = r1 + -1
            int r0 = r0 + 5
            int r3 = r3 - r0
            r0 = r2[r3]     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x07e0:
            r0 = 0
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x07e6:
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            X.7Gg r6 = new X.7Gg     // Catch:{ 88e -> 0x12b8 }
            r6.<init>(r10, r0)     // Catch:{ 88e -> 0x12b8 }
            switch(r1) {
                case 0: goto L_0x0de8;
                case 1: goto L_0x0822;
                case 2: goto L_0x0da7;
                case 3: goto L_0x0d63;
                case 4: goto L_0x0d25;
                case 5: goto L_0x0d0b;
                case 6: goto L_0x0cb3;
                case 7: goto L_0x0c6b;
                case 8: goto L_0x0bd4;
                case 9: goto L_0x0ba2;
                case 10: goto L_0x0b28;
                case 11: goto L_0x0a77;
                case 12: goto L_0x09a5;
                case 13: goto L_0x08dc;
                case 14: goto L_0x08c3;
                case 15: goto L_0x0871;
                case 16: goto L_0x0846;
                case 17: goto L_0x07fc;
                case 18: goto L_0x083e;
                default: goto L_0x07fa;
            }     // Catch:{ 88e -> 0x12b8 }
        L_0x07fa:
            goto L_0x124f
        L_0x07fc:
            int r1 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x0806
            java.lang.String r1 = "MakeSmallMapKV requires an even number of arguments"
            goto L_0x0ed5
        L_0x0806:
            int r0 = r1 >> 1
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ 88e -> 0x12b8 }
            r3.<init>(r0)     // Catch:{ 88e -> 0x12b8 }
            r2 = 0
        L_0x080e:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            if (r2 >= r0) goto L_0x0d06
            java.lang.Object r1 = X.C121467Gg.A00(r6, r2)     // Catch:{ 88e -> 0x12b8 }
            int r0 = r2 + 1
            java.lang.Object r0 = X.C121467Gg.A00(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            r3.put(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            int r2 = r2 + 2
            goto L_0x080e
        L_0x0822:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = X.C18180wK.A1W(r0)
            java.lang.String r0 = "RuntimeRandom expects 0 arguments"
            X.AnonymousClass6QH.A00(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            X.7Ku r0 = r6.A02     // Catch:{ 88e -> 0x12b8 }
            java.util.Random r0 = r0.A06     // Catch:{ 88e -> 0x12b8 }
            double r0 = r0.nextDouble()     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x083e:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = X.AnonymousClass0wJ.A1T(r0, r11)
            goto L_0x0cd7
        L_0x0846:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = X.AnonymousClass0wJ.A1T(r0, r9)
            java.lang.String r0 = "MapHasValue expects 2 arguments"
            java.lang.Object r0 = A06(r6, r0, r7, r1)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x085a
            java.lang.String r1 = "MapHasValue 1st arg must be a map"
            goto L_0x0ed5
        L_0x085a:
            java.lang.Object r1 = X.C121467Gg.A00(r6, r7)     // Catch:{ 88e -> 0x12b8 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r1.containsValue(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 88e -> 0x12b8 }
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0871:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = X.AnonymousClass0wJ.A1T(r0, r9)
            java.lang.String r0 = "MapKeysValues expects 2 arguments"
            java.lang.Object r0 = A06(r6, r0, r7, r1)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0885
            java.lang.String r1 = "MapKeysValues 1st arg must be a map"
            goto L_0x0ed5
        L_0x0885:
            java.lang.Object r1 = X.C121467Gg.A00(r6, r7)     // Catch:{ 88e -> 0x12b8 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0897
            java.lang.String r1 = "MapKeysValues 2nd arg must be a boolean"
            goto L_0x0ed5
        L_0x0897:
            java.lang.Object r0 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x08ba
            java.util.Set r0 = r1.keySet()     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ 88e -> 0x12b8 }
        L_0x08a9:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ 88e -> 0x12b8 }
            java.util.ArrayList r0 = X.C18200wM.A0s(r0)     // Catch:{ 88e -> 0x12b8 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ 88e -> 0x12b8 }
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x08ba:
            java.util.Collection r0 = r1.values()     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ 88e -> 0x12b8 }
            goto L_0x08a9
        L_0x08c3:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = X.C18180wK.A1W(r0)
            java.lang.String r0 = "CurrentTimeMillis expects no arguments"
            X.AnonymousClass6QH.A00(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ 88e -> 0x12b8 }
            double r2 = (double) r0     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r2)     // Catch:{ 88e -> 0x12b8 }
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x08dc:
            int r1 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            r0 = 5
            boolean r1 = X.AnonymousClass0wJ.A1T(r1, r0)
            java.lang.String r0 = "ArrayCopy expects 5 arguments"
            java.lang.Object r0 = A06(r6, r0, r7, r1)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r0 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x08f1
            java.lang.String r1 = "ArrayCopy 1st argument must be an array"
            goto L_0x0ed5
        L_0x08f1:
            java.lang.Object r15 = X.C121467Gg.A00(r6, r7)     // Catch:{ 88e -> 0x12b8 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ 88e -> 0x12b8 }
            double r4 = A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.C121467Gg.A02(r4)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0905
            java.lang.String r1 = "ArrayCopy 2nd argument must be an integer"
            goto L_0x0ed5
        L_0x0905:
            java.lang.Object r0 = X.C121467Gg.A00(r6, r9)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r0 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0911
            java.lang.String r1 = "ArrayCopy 3rd argument must be an array"
            goto L_0x0ed5
        L_0x0911:
            java.lang.Object r14 = X.C121467Gg.A00(r6, r9)     // Catch:{ 88e -> 0x12b8 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ 88e -> 0x12b8 }
            double r2 = A00(r6, r11)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.C121467Gg.A02(r2)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0925
            java.lang.String r1 = "ArrayCopy 4th argument must be an integer"
            goto L_0x0ed5
        L_0x0925:
            r0 = 4
            double r12 = A00(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.C121467Gg.A02(r12)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0934
            java.lang.String r1 = "ArrayCopy 5th argument must be an integer"
            goto L_0x0ed5
        L_0x0934:
            int r11 = r15.size()     // Catch:{ 88e -> 0x12b8 }
            int r20 = r14.size()     // Catch:{ 88e -> 0x12b8 }
            int r0 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r0 >= 0) goto L_0x0942
            double r0 = (double) r11     // Catch:{ 88e -> 0x12b8 }
            double r4 = r4 + r0
        L_0x0942:
            int r0 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r0 < 0) goto L_0x123a
            double r0 = (double) r11     // Catch:{ 88e -> 0x12b8 }
            r22 = r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x123a
            int r11 = (int) r4     // Catch:{ 88e -> 0x12b8 }
            int r0 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r0 >= 0) goto L_0x0956
            r0 = r20
            double r0 = (double) r0     // Catch:{ 88e -> 0x12b8 }
            double r2 = r2 + r0
        L_0x0956:
            int r0 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r0 < 0) goto L_0x1237
            r0 = r20
            double r0 = (double) r0     // Catch:{ 88e -> 0x12b8 }
            r20 = r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x1237
            int r4 = (int) r2     // Catch:{ 88e -> 0x12b8 }
            int r0 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r0 < 0) goto L_0x1234
            double r0 = (double) r11     // Catch:{ 88e -> 0x12b8 }
            double r0 = r0 + r12
            int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r2 > 0) goto L_0x1234
            double r0 = (double) r4     // Catch:{ 88e -> 0x12b8 }
            double r0 = r0 + r12
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 > 0) goto L_0x1234
            int r0 = (int) r12     // Catch:{ 88e -> 0x12b8 }
            if (r15 != r14) goto L_0x098c
            if (r4 <= r11) goto L_0x098c
            int r11 = r11 + r0
            int r4 = r4 + r0
        L_0x097b:
            int r1 = r0 + -1
            if (r0 == 0) goto L_0x099f
            int r4 = r4 + -1
            int r11 = r11 + -1
            java.lang.Object r0 = r15.get(r11)     // Catch:{ UnsupportedOperationException -> 0x1225 }
            r14.set(r4, r0)     // Catch:{ UnsupportedOperationException -> 0x1225 }
            r0 = r1
            goto L_0x097b
        L_0x098c:
            int r3 = r0 + -1
            if (r0 == 0) goto L_0x099f
            int r2 = r4 + 1
            int r1 = r11 + 1
            java.lang.Object r0 = r15.get(r11)     // Catch:{ UnsupportedOperationException -> 0x1225 }
            r14.set(r4, r0)     // Catch:{ UnsupportedOperationException -> 0x1225 }
            r4 = r2
            r0 = r3
            r11 = r1
            goto L_0x098c
        L_0x099f:
            r0 = 0
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x09a5:
            int r1 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            r0 = 5
            boolean r1 = X.AnonymousClass0wJ.A1T(r1, r0)
            java.lang.String r0 = "StringSearch expects 5 arguments"
            java.lang.Object r0 = A06(r6, r0, r7, r1)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x09ba
            java.lang.String r1 = "StringSearch 1st arg must be a string"
            goto L_0x0ed5
        L_0x09ba:
            java.lang.Object r13 = X.C121467Gg.A00(r6, r7)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x09cc
            java.lang.String r1 = "StringSearch 2nd arg must be a string"
            goto L_0x0ed5
        L_0x09cc:
            java.lang.Object r12 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r9)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.C18220wO.A1U(r0)
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r0 != 0) goto L_0x09ec
            double r0 = A00(r6, r9)     // Catch:{ 88e -> 0x12b8 }
            boolean r4 = X.C121467Gg.A02(r0)     // Catch:{ 88e -> 0x12b8 }
            if (r4 != 0) goto L_0x09ee
            java.lang.String r1 = "StringSearch 3rd arg must be an integer or null"
            goto L_0x0ed5
        L_0x09ec:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x09ee:
            java.lang.Object r4 = X.C121467Gg.A00(r6, r11)     // Catch:{ 88e -> 0x12b8 }
            if (r4 == 0) goto L_0x0a02
            double r2 = A00(r6, r11)     // Catch:{ 88e -> 0x12b8 }
            boolean r4 = X.C121467Gg.A02(r2)     // Catch:{ 88e -> 0x12b8 }
            if (r4 != 0) goto L_0x0a02
            java.lang.String r1 = "StringSearch 4th arg must be an integer or null"
            goto L_0x0ed5
        L_0x0a02:
            r5 = 4
            java.lang.Object r4 = X.C121467Gg.A00(r6, r5)     // Catch:{ 88e -> 0x12b8 }
            boolean r4 = r4 instanceof java.lang.Boolean     // Catch:{ 88e -> 0x12b8 }
            if (r4 != 0) goto L_0x0a0f
            java.lang.String r1 = "StringSearch 5th arg must be a boolean"
            goto L_0x0ed5
        L_0x0a0f:
            java.lang.Object r4 = X.C121467Gg.A00(r6, r5)     // Catch:{ 88e -> 0x12b8 }
            boolean r20 = X.AnonymousClass0wJ.A1X(r4)     // Catch:{ 88e -> 0x12b8 }
            int r5 = r13.length()     // Catch:{ 88e -> 0x12b8 }
            boolean r4 = java.lang.Double.isNaN(r0)     // Catch:{ 88e -> 0x12b8 }
            if (r4 == 0) goto L_0x0a22
            goto L_0x0a2d
        L_0x0a22:
            int r4 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r4 >= 0) goto L_0x0a28
            double r14 = (double) r5     // Catch:{ 88e -> 0x12b8 }
            double r0 = r0 + r14
        L_0x0a28:
            int r4 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r4 < 0) goto L_0x1240
            goto L_0x0a2f
        L_0x0a2d:
            r0 = 0
        L_0x0a2f:
            double r14 = (double) r5     // Catch:{ 88e -> 0x12b8 }
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x1240
            int r4 = (int) r0     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = java.lang.Double.isNaN(r2)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0a47
            int r0 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r0 < 0) goto L_0x123d
            double r0 = (double) r4     // Catch:{ 88e -> 0x12b8 }
            double r0 = r0 + r2
            int r11 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x123d
            int r0 = (int) r2     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0a49
        L_0x0a47:
            int r0 = r5 - r4
        L_0x0a49:
            int r1 = r12.length()     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x0a6a
            if (r1 > r0) goto L_0x0a6a
            if (r4 != 0) goto L_0x0a58
            if (r0 != r5) goto L_0x0a58
        L_0x0a55:
            if (r20 == 0) goto L_0x0a63
            goto L_0x0a5e
        L_0x0a58:
            int r0 = r0 + r4
            java.lang.String r13 = r13.substring(r4, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0a55
        L_0x0a5e:
            int r0 = r13.lastIndexOf(r12)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0a67
        L_0x0a63:
            int r0 = r13.indexOf(r12)     // Catch:{ 88e -> 0x12b8 }
        L_0x0a67:
            if (r0 < 0) goto L_0x0a6a
            goto L_0x0a6c
        L_0x0a6a:
            r0 = 0
            goto L_0x0a72
        L_0x0a6c:
            int r0 = r0 + r4
            double r0 = (double) r0     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r0)     // Catch:{ 88e -> 0x12b8 }
        L_0x0a72:
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0a77:
            int r1 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            r0 = 4
            boolean r1 = X.AnonymousClass0wJ.A1T(r1, r0)
            java.lang.String r0 = "SubstringCompare expects 4 arguments"
            java.lang.Object r0 = A06(r6, r0, r7, r1)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0a8c
            java.lang.String r1 = "SubstringCompare 1st arg must be a string"
            goto L_0x0ed5
        L_0x0a8c:
            java.lang.Object r12 = X.C121467Gg.A00(r6, r7)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0a9e
            java.lang.String r1 = "SubstringCompare 2nd arg must be a string"
            goto L_0x0ed5
        L_0x0a9e:
            java.lang.Object r14 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r9)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.C18220wO.A1U(r0)
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r0 != 0) goto L_0x0abe
            double r0 = A00(r6, r9)     // Catch:{ 88e -> 0x12b8 }
            boolean r4 = X.C121467Gg.A02(r0)     // Catch:{ 88e -> 0x12b8 }
            if (r4 != 0) goto L_0x0ac0
            java.lang.String r1 = "SubstringCompare 3rd arg must be an integer or null"
            goto L_0x0ed5
        L_0x0abe:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0ac0:
            java.lang.Object r4 = X.C121467Gg.A00(r6, r11)     // Catch:{ 88e -> 0x12b8 }
            if (r4 == 0) goto L_0x0ad4
            double r2 = A00(r6, r11)     // Catch:{ 88e -> 0x12b8 }
            boolean r4 = X.C121467Gg.A02(r2)     // Catch:{ 88e -> 0x12b8 }
            if (r4 != 0) goto L_0x0ad4
            java.lang.String r1 = "SubstringCompare 4th arg must be an integer or null"
            goto L_0x0ed5
        L_0x0ad4:
            int r13 = r12.length()     // Catch:{ 88e -> 0x12b8 }
            boolean r4 = java.lang.Double.isNaN(r0)     // Catch:{ 88e -> 0x12b8 }
            r20 = 0
            if (r4 == 0) goto L_0x0ae1
            goto L_0x0aec
        L_0x0ae1:
            int r4 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r4 >= 0) goto L_0x0ae7
            double r4 = (double) r13     // Catch:{ 88e -> 0x12b8 }
            double r0 = r0 + r4
        L_0x0ae7:
            int r4 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r4 < 0) goto L_0x1246
            goto L_0x0aee
        L_0x0aec:
            r0 = 0
        L_0x0aee:
            double r4 = (double) r13     // Catch:{ 88e -> 0x12b8 }
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 > 0) goto L_0x1246
            int r11 = (int) r0     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = java.lang.Double.isNaN(r2)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0b06
            int r0 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r0 < 0) goto L_0x1243
            double r0 = (double) r11     // Catch:{ 88e -> 0x12b8 }
            double r0 = r0 + r2
            int r15 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r15 > 0) goto L_0x1243
            int r0 = (int) r2     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0b08
        L_0x0b06:
            int r0 = r13 - r11
        L_0x0b08:
            if (r11 != 0) goto L_0x0b0d
            if (r0 != r13) goto L_0x0b0d
            goto L_0x0b12
        L_0x0b0d:
            int r0 = r0 + r11
            java.lang.String r12 = r12.substring(r11, r0)     // Catch:{ 88e -> 0x12b8 }
        L_0x0b12:
            int r0 = r12.compareTo(r14)     // Catch:{ 88e -> 0x12b8 }
            if (r0 >= 0) goto L_0x0b1b
            r20 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x0b1f
        L_0x0b1b:
            if (r0 == 0) goto L_0x0b1f
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0b1f:
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r20)     // Catch:{ 88e -> 0x12b8 }
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0b28:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = X.AnonymousClass0wJ.A1T(r0, r11)
            java.lang.String r0 = "Substring expects 3 arguments"
            java.lang.Object r0 = A06(r6, r0, r7, r1)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0b3c
            java.lang.String r1 = "Substring 1st arg must be a string"
            goto L_0x0ed5
        L_0x0b3c:
            java.lang.Object r12 = X.C121467Gg.A00(r6, r7)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ 88e -> 0x12b8 }
            double r0 = A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            boolean r2 = X.C121467Gg.A02(r0)     // Catch:{ 88e -> 0x12b8 }
            if (r2 != 0) goto L_0x0b50
            java.lang.String r1 = "Substring 2nd arg must be an integer"
            goto L_0x0ed5
        L_0x0b50:
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Object r4 = X.C121467Gg.A00(r6, r9)     // Catch:{ 88e -> 0x12b8 }
            if (r4 == 0) goto L_0x0b66
            double r2 = A00(r6, r9)     // Catch:{ 88e -> 0x12b8 }
            boolean r4 = X.C121467Gg.A02(r2)     // Catch:{ 88e -> 0x12b8 }
            if (r4 != 0) goto L_0x0b66
            java.lang.String r1 = "Substring 3rd arg must be an integer or null"
            goto L_0x0ed5
        L_0x0b66:
            int r11 = r12.length()     // Catch:{ 88e -> 0x12b8 }
            int r4 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r4 >= 0) goto L_0x0b70
            double r4 = (double) r11     // Catch:{ 88e -> 0x12b8 }
            double r0 = r0 + r4
        L_0x0b70:
            int r4 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r4 < 0) goto L_0x124c
            double r4 = (double) r11     // Catch:{ 88e -> 0x12b8 }
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x124c
            int r13 = (int) r0     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = java.lang.Double.isNaN(r2)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0b8c
            int r0 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r0 < 0) goto L_0x1249
            double r0 = (double) r13     // Catch:{ 88e -> 0x12b8 }
            double r0 = r0 + r2
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x1249
            int r0 = (int) r2     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0b8e
        L_0x0b8c:
            int r0 = r11 - r13
        L_0x0b8e:
            if (r13 != 0) goto L_0x0b93
            if (r0 != r11) goto L_0x0b93
            goto L_0x0b99
        L_0x0b93:
            int r0 = r0 + r13
            java.lang.String r0 = r12.substring(r13, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0b9d
        L_0x0b99:
            java.lang.Object r0 = X.C121467Gg.A00(r6, r7)     // Catch:{ 88e -> 0x12b8 }
        L_0x0b9d:
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0ba2:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            r1 = 1
            if (r0 == r8) goto L_0x0ba8
            r1 = 0
        L_0x0ba8:
            java.lang.String r0 = "IsFinite expects 1 argument"
            java.lang.Object r0 = A06(r6, r0, r7, r1)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r0 = A04(r0)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0bb8
            java.lang.String r1 = "IsFinite argument must be numeric"
            goto L_0x0ed5
        L_0x0bb8:
            double r0 = r0.doubleValue()     // Catch:{ 88e -> 0x12b8 }
            double r4 = java.lang.Math.abs(r0)     // Catch:{ 88e -> 0x12b8 }
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x0bcb
            r0 = 1
        L_0x0bcb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 88e -> 0x12b8 }
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0bd4:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = X.AnonymousClass0wJ.A1T(r0, r9)
            java.lang.String r0 = "ParseInt64 requires 2 arguments"
            java.lang.Object r1 = A06(r6, r0, r7, r1)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            boolean r26 = A0M(r0)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.AnonymousClass70O.A01(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0bf8
            double r0 = X.C86124wJ.A00(r1)     // Catch:{ 88e -> 0x12b8 }
            long r2 = (long) r0     // Catch:{ 88e -> 0x12b8 }
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0c63
        L_0x0bf8:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0c63
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0c5f
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.AnonymousClass6QI.A00(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0c65
            java.lang.String r11 = r1.trim()     // Catch:{ 88e -> 0x12b8 }
            int r5 = r11.length()     // Catch:{ NumberFormatException -> 0x0c65 }
            if (r5 == 0) goto L_0x0c65
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            char r1 = r11.charAt(r7)     // Catch:{ NumberFormatException -> 0x0c65 }
            r0 = 45
            r15 = 1
            if (r1 != r0) goto L_0x0c25
            r24 = -9223372036854775808
            r4 = 1
            goto L_0x0c2b
        L_0x0c25:
            r0 = 43
            if (r1 != r0) goto L_0x0c2a
            r4 = 1
        L_0x0c2a:
            r15 = 0
        L_0x0c2b:
            if (r4 == r5) goto L_0x0c65
            r22 = 10
            long r20 = r24 / r22
            r0 = 0
        L_0x0c33:
            if (r4 >= r5) goto L_0x0c57
            char r2 = r11.charAt(r4)     // Catch:{ NumberFormatException -> 0x0c65 }
            int r3 = r2 + -48
            if (r3 < 0) goto L_0x0c65
            r2 = 9
            if (r3 > r2) goto L_0x0c65
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 < 0) goto L_0x0c52
            long r0 = r0 * r22
            long r2 = (long) r3     // Catch:{ NumberFormatException -> 0x0c65 }
            long r13 = r24 + r2
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 < 0) goto L_0x0c52
            long r0 = r0 - r2
        L_0x0c4f:
            int r4 = r4 + 1
            goto L_0x0c33
        L_0x0c52:
            if (r26 == 0) goto L_0x0c65
            r0 = r24
            goto L_0x0c4f
        L_0x0c57:
            if (r15 != 0) goto L_0x0c5a
            long r0 = -r0
        L_0x0c5a:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0c65 }
            goto L_0x0c63
        L_0x0c5f:
            java.lang.Number r1 = A05(r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x0c63:
            if (r1 != 0) goto L_0x0c66
        L_0x0c65:
            r1 = 0
        L_0x0c66:
            X.C121467Gg.A01(r6, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0c6b:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            r11 = 0
            boolean r1 = X.AnonymousClass0wJ.A1T(r0, r9)
            java.lang.String r0 = "MakeMap expects 2 arguments"
            java.lang.Object r5 = A06(r6, r0, r7, r1)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r4 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r5 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0c84
            java.lang.String r1 = "MakeMap arg 0 must be a list"
            goto L_0x0ed5
        L_0x0c84:
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0c8c
            java.lang.String r1 = "MakeMap arg 1 must be a list"
            goto L_0x0ed5
        L_0x0c8c:
            java.util.List r5 = (java.util.List) r5     // Catch:{ 88e -> 0x12b8 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ 88e -> 0x12b8 }
            int r3 = r5.size()     // Catch:{ 88e -> 0x12b8 }
            int r0 = r4.size()     // Catch:{ 88e -> 0x12b8 }
            if (r3 == r0) goto L_0x0c9e
            java.lang.String r1 = "MakeMap different number keys/values"
            goto L_0x0ed5
        L_0x0c9e:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ 88e -> 0x12b8 }
            r2.<init>(r3)     // Catch:{ 88e -> 0x12b8 }
        L_0x0ca3:
            if (r11 >= r3) goto L_0x0d20
            java.lang.Object r1 = r5.get(r11)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = r4.get(r11)     // Catch:{ 88e -> 0x12b8 }
            r2.put(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            int r11 = r11 + 1
            goto L_0x0ca3
        L_0x0cb3:
            int r1 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x0cbd
            java.lang.String r1 = "MakeSmallMap requires an even number of arguments"
            goto L_0x0ed5
        L_0x0cbd:
            int r4 = r1 >> 1
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ 88e -> 0x12b8 }
            r3.<init>(r4)     // Catch:{ 88e -> 0x12b8 }
            r2 = 0
        L_0x0cc5:
            if (r2 >= r4) goto L_0x0d06
            java.lang.Object r1 = X.C121467Gg.A00(r6, r2)     // Catch:{ 88e -> 0x12b8 }
            int r0 = r4 + r2
            java.lang.Object r0 = X.C121467Gg.A00(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            r3.put(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            int r2 = r2 + 1
            goto L_0x0cc5
        L_0x0cd7:
            java.lang.String r0 = "StringReplaceAll requires 3 arguments"
            X.AnonymousClass6QH.A00(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            X.7Ku r1 = r6.A02     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r7)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r3 = r1.A0O(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r2 = r1.A0O(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r9)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r1 = r1.A0O(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r2.isEmpty()     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0d06
            java.lang.String r3 = r3.replace(r2, r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x0d06:
            X.C121467Gg.A01(r6, r3)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0d0b:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            java.util.ArrayList r2 = X.C18240wQ.A0k(r0)     // Catch:{ 88e -> 0x12b8 }
            r1 = 0
        L_0x0d12:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            if (r1 >= r0) goto L_0x0d20
            java.lang.Object r0 = X.C121467Gg.A00(r6, r1)     // Catch:{ 88e -> 0x12b8 }
            r2.add(r0)     // Catch:{ 88e -> 0x12b8 }
            int r1 = r1 + 1
            goto L_0x0d12
        L_0x0d20:
            X.C121467Gg.A01(r6, r2)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0d25:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = X.AnonymousClass0wJ.A1T(r0, r11)
            java.lang.String r0 = "MapPutAll requires 3 arguments"
            java.lang.Object r2 = A06(r6, r0, r9, r1)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r1 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0d40
            java.lang.String r0 = "MapPutAll 2nd arg must be a Map"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x0d40:
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0d48
            java.lang.String r0 = "MapPutAll 3rd arg must be a Map"
            goto L_0x0f87
        L_0x0d48:
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 88e -> 0x12b8 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r7)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = A0M(r0)     // Catch:{ 88e -> 0x12b8 }
            if (r2 == r1) goto L_0x0d5d
            r1.putAll(r2)     // Catch:{ UnsupportedOperationException -> 0x0d5a }
            goto L_0x0d5d
        L_0x0d5a:
            r1 = move-exception
            if (r0 != 0) goto L_0x12a8
        L_0x0d5d:
            r0 = 0
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0d63:
            int r1 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            r0 = 4
            boolean r1 = X.AnonymousClass0wJ.A1T(r1, r0)
            java.lang.String r0 = "StringReplace requires 4 arguments"
            X.AnonymousClass6QH.A00(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            X.7Ku r1 = r6.A02     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r7)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r3 = r1.A0O(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r2 = r1.A0O(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r9)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r1 = r1.A0O(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = X.C121467Gg.A00(r6, r11)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = A0M(r0)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0da2
            java.lang.String r0 = r3.replaceAll(r2, r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x0d9d:
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0da2:
            java.lang.String r0 = r3.replaceFirst(r2, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0d9d
        L_0x0da7:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            r1 = 1
            if (r0 == r8) goto L_0x0dad
            r1 = 0
        L_0x0dad:
            java.lang.String r0 = "ParseNumber requires one argument"
            java.lang.Object r1 = A06(r6, r0, r7, r1)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.AnonymousClass70O.A01(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0de0
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0dc7
            long r0 = X.C18190wL.A08(r1)     // Catch:{ 88e -> 0x12b8 }
            double r2 = (double) r0     // Catch:{ 88e -> 0x12b8 }
            java.lang.Number r1 = X.AnonymousClass3WF.A00(r2)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0de0
        L_0x0dc7:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0ddc
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.AnonymousClass6QI.A00(r1)     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0de2
            double r0 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x0de2 }
            java.lang.Number r1 = X.AnonymousClass3WF.A00(r0)     // Catch:{ NumberFormatException -> 0x0de2 }
            goto L_0x0de0
        L_0x0ddc:
            java.lang.Number r1 = A04(r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x0de0:
            if (r1 != 0) goto L_0x0de3
        L_0x0de2:
            r1 = 0
        L_0x0de3:
            X.C121467Gg.A01(r6, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0de8:
            int r0 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            boolean r1 = X.AnonymousClass0wJ.A1T(r0, r9)
            goto L_0x0f77
        L_0x0df0:
            short r1 = r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r14 = r0 & 255(0xff, float:3.57E-43)
            r0 = r33
            java.lang.Object r13 = r0.A01(r1)     // Catch:{ 88e -> 0x12b8 }
            r0 = r17
            java.lang.Object r12 = r0.A01     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ 88e -> 0x12b8 }
            int r3 = r14 + -1
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r2 = r0 + -1
            int r2 = r2 - r3
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            java.lang.System.arraycopy(r0, r2, r1, r7, r14)     // Catch:{ 88e -> 0x12b8 }
            int r11 = r10.A02     // Catch:{ 88e -> 0x12b8 }
            r0 = r16
            r10.A02 = r0     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ 88e -> 0x12b8 }
            X.6eE r0 = r10.A03     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            java.util.List r6 = java.util.Arrays.asList(r1)     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            X.6ll r5 = r0.A00     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            boolean r0 = r5 instanceof X.AnonymousClass601     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            if (r0 == 0) goto L_0x0e84
            X.601 r5 = (X.AnonymousClass601) r5     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            if (r12 == 0) goto L_0x0e73
            java.util.List r0 = r5.A04     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            boolean r0 = r12.equals(r0)     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            if (r0 != 0) goto L_0x0e73
            java.util.List r12 = (java.util.List) r12     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            boolean r0 = r12.isEmpty()     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            if (r0 != 0) goto L_0x0e73
            X.3HX r0 = r5.A00     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            r22 = r0
            com.instagram.common.lispy.lang.BloksScript r0 = r5.A03     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            r25 = r0
            java.util.Map r0 = r5.A07     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            r20 = r0
            X.7A1 r0 = r5.A01     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            r23 = r0
            java.util.Set r15 = r5.A08     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            X.4pa r4 = r5.A02     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            X.73X r3 = r5.A02     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            java.lang.String r2 = r5.A06     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            X.6cC r1 = r5.A01     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            r29 = 0
            java.lang.Integer r0 = r5.A04     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            X.601 r5 = new X.601     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            r26 = r4
            r27 = r0
            r28 = r2
            r30 = r12
            r31 = r20
            r32 = r15
            r20 = r5
            r21 = r1
            r24 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
        L_0x0e73:
            X.4pa r2 = r5.A02     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            X.6eD r1 = new X.6eD     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            r1.<init>(r13)     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            X.3iY r0 = new X.3iY     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            r0.<init>(r6)     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            java.lang.Object r0 = r2.AKb(r0, r1, r5)     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            goto L_0x0e9c
        L_0x0e84:
            if (r12 == 0) goto L_0x0e73
            java.util.List r0 = r5.A04     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            boolean r0 = r12.equals(r0)     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            if (r0 != 0) goto L_0x0e73
            X.6HH r2 = r5.A00     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            X.4pa r1 = r5.A02     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            X.6cC r0 = r5.A01     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            X.6ll r5 = new X.6ll     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            r5.<init>(r2, r0, r1, r12)     // Catch:{ 88k -> 0x127a, Exception -> 0x1261 }
            goto L_0x0e73
        L_0x0e9c:
            r10.A02 = r11     // Catch:{ 88e -> 0x12b8 }
            r10.A08(r14)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0ea6:
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r12 = r0 & 255(0xff, float:3.57E-43)
            int r11 = r12 + 1
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r3 = r0 + -1
            int r0 = r3 - r11
            java.lang.Object[] r2 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r1 = r2[r0]     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r1 instanceof X.C105916eC     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x1282
            X.6jr r6 = X.AnonymousClass70O.A00(r1)     // Catch:{ 88e -> 0x12b8 }
            r5 = 0
            r4 = r2[r3]     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0ee8
            java.util.List r4 = (java.util.List) r4     // Catch:{ 88e -> 0x12b8 }
            r1 = 32768(0x8000, float:4.5918E-41)
            int r1 = r1 - r12
            int r0 = r4.size()     // Catch:{ 88e -> 0x12b8 }
            if (r1 >= r0) goto L_0x0ee2
            java.lang.String r1 = "too many arguments to bind"
        L_0x0ed5:
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            X.88e r1 = new X.88e     // Catch:{ 88e -> 0x12b8 }
            r1.<init>(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12a8
        L_0x0ee2:
            int r1 = r4.size()     // Catch:{ 88e -> 0x12b8 }
            int r1 = r1 + r12
            goto L_0x0eec
        L_0x0ee8:
            if (r4 != 0) goto L_0x127c
            r4 = 0
            r1 = r12
        L_0x0eec:
            if (r1 == 0) goto L_0x0f59
            java.lang.Object[] r0 = r6.A02     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0efa
            int r3 = r0.length     // Catch:{ 88e -> 0x12b8 }
            int r1 = r1 + r3
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ 88e -> 0x12b8 }
            java.lang.System.arraycopy(r0, r7, r2, r7, r3)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0efd
        L_0x0efa:
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ 88e -> 0x12b8 }
            r3 = 0
        L_0x0efd:
            if (r12 == 0) goto L_0x0f0a
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r1 = r0 + -1
            int r1 = r1 - r12
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            java.lang.System.arraycopy(r0, r1, r2, r3, r12)     // Catch:{ 88e -> 0x12b8 }
            int r3 = r3 + r12
        L_0x0f0a:
            if (r4 == 0) goto L_0x0f1e
            int r1 = r4.size()     // Catch:{ 88e -> 0x12b8 }
        L_0x0f10:
            if (r5 >= r1) goto L_0x0f1e
            int r12 = r3 + 1
            java.lang.Object r0 = r4.get(r5)     // Catch:{ 88e -> 0x12b8 }
            r2[r3] = r0     // Catch:{ 88e -> 0x12b8 }
            int r5 = r5 + 1
            r3 = r12
            goto L_0x0f10
        L_0x0f1e:
            X.6l1 r1 = r6.A00     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r0 = r6.A01     // Catch:{ 88e -> 0x12b8 }
            X.6jr r3 = new X.6jr     // Catch:{ 88e -> 0x12b8 }
            r3.<init>(r1, r0, r2)     // Catch:{ 88e -> 0x12b8 }
            r2 = 0
            java.lang.Object r0 = r3.A01     // Catch:{ 88e -> 0x12b8 }
            X.6jp r1 = new X.6jp     // Catch:{ 88e -> 0x12b8 }
            r1.<init>(r2, r3, r0)     // Catch:{ 88e -> 0x12b8 }
            X.6eC r0 = new X.6eC     // Catch:{ 88e -> 0x12b8 }
            r0.<init>(r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x0f34:
            r10.A09(r11, r0)     // Catch:{ 88e -> 0x12b8 }
        L_0x0f37:
            r10.A08(r11)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0f3c:
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r4 = r0 + -1
            int r1 = r4 - r8
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r2 = r0[r1]     // Catch:{ 88e -> 0x12b8 }
            r1 = r0[r4]     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0f5e
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r2.containsKey(r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x0f52:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 88e -> 0x12b8 }
            r10.A09(r8, r0)     // Catch:{ 88e -> 0x12b8 }
        L_0x0f59:
            A0F(r10)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0f5e:
            boolean r0 = r2 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x0f74
            java.util.List r2 = (java.util.List) r2     // Catch:{ 88e -> 0x12b8 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r10.A0N(r1, r3, r0)     // Catch:{ 88e -> 0x12b8 }
            int r0 = r2.size()     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = X.C18230wP.A1W(r1, r0)
            goto L_0x0f52
        L_0x0f74:
            java.lang.String r0 = "in_by_val 2nd argument must be a container"
            goto L_0x0f87
        L_0x0f77:
            java.lang.String r0 = "VectorRemove requires 2 arguments"
            java.lang.Object r2 = A06(r6, r0, r7, r1)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object r4 = X.C121467Gg.A00(r6, r8)     // Catch:{ 88e -> 0x12b8 }
            boolean r0 = r2 instanceof java.util.List     // Catch:{ 88e -> 0x12b8 }
            if (r0 != 0) goto L_0x0f8c
            java.lang.String r0 = "VectorRemove 1st arg must be a vector"
        L_0x0f87:
            A0K(r0, r2)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x0f8c:
            java.util.List r2 = (java.util.List) r2     // Catch:{ 88e -> 0x12b8 }
            X.7Ku r3 = r6.A02     // Catch:{ 88e -> 0x12b8 }
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            java.lang.String r0 = "VectorRemove invalid vector index"
            int r1 = r3.A0N(r4, r0, r1)     // Catch:{ 88e -> 0x12b8 }
            int r0 = r2.size()     // Catch:{ 88e -> 0x12b8 }
            if (r1 >= r0) goto L_0x0fa2
            r2.remove(r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x0fa2:
            r0 = 0
            X.C121467Gg.A01(r6, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0fa8:
            short r3 = r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r5 = r0 & 255(0xff, float:3.57E-43)
            r0 = r17
            java.lang.Object r4 = r0.A01     // Catch:{ 88e -> 0x12b8 }
            if (r5 != 0) goto L_0x0fbe
            r2 = 0
            goto L_0x0fcf
        L_0x0fbe:
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ 88e -> 0x12b8 }
            int r6 = r5 + -1
            int r0 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r1 = r0 + -1
            int r1 = r1 - r6
            java.lang.Object[] r0 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            java.lang.System.arraycopy(r0, r1, r2, r7, r5)     // Catch:{ 88e -> 0x12b8 }
            r10.A08(r5)     // Catch:{ 88e -> 0x12b8 }
        L_0x0fcf:
            r0 = r33
            X.6l1 r0 = r0.A00(r3)     // Catch:{ 88e -> 0x12b8 }
            X.6jr r3 = new X.6jr     // Catch:{ 88e -> 0x12b8 }
            r3.<init>(r0, r4, r2)     // Catch:{ 88e -> 0x12b8 }
            r2 = 0
            java.lang.Object r1 = r3.A01     // Catch:{ 88e -> 0x12b8 }
            X.6jp r0 = new X.6jp     // Catch:{ 88e -> 0x12b8 }
            r0.<init>(r2, r3, r1)     // Catch:{ 88e -> 0x12b8 }
            X.6eC r2 = new X.6eC     // Catch:{ 88e -> 0x12b8 }
            r2.<init>(r0)     // Catch:{ 88e -> 0x12b8 }
        L_0x0fe7:
            r10.A0P(r2)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0fec:
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0ff5:
            java.lang.String r0 = "<="
            r10.A0C(r11, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x0ffc:
            java.lang.String r0 = "<"
            r10.A0C(r9, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1003:
            java.lang.String r0 = ">"
            r10.A0C(r8, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x100a:
            java.lang.String r0 = ">="
            r10.A0C(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1011:
            java.lang.String r1 = "INT64_SHR"
            r0 = 22
            r10.A0B(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x101a:
            r1 = 21
            java.lang.String r0 = "INT64_ASR"
            r10.A0B(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1023:
            r1 = 20
            java.lang.String r0 = "INT64_SHL"
            r10.A0B(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x102c:
            r1 = 19
            java.lang.String r0 = "INT64_XOR"
            r10.A0B(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1035:
            r1 = 18
            java.lang.String r0 = "INT64_OR"
            r10.A0B(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x103e:
            r1 = 17
            java.lang.String r0 = "INT64_AND"
            r10.A0B(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1047:
            r1 = 16
            java.lang.String r0 = "INT64_ADD"
            r10.A0B(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1050:
            r1 = 15
            java.lang.String r0 = "INT64_SUB"
            r10.A0B(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1059:
            r1 = 14
            java.lang.String r0 = "INT64_MOD"
            r10.A0B(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1062:
            r1 = 13
            java.lang.String r0 = "INT64_DIV"
            r10.A0B(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x106b:
            java.lang.String r1 = "INT64_MUL"
            r0 = 12
            r10.A0B(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1074:
            r1 = 11
            java.lang.String r0 = ">>>"
            r10.A0A(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x107d:
            java.lang.String r1 = ">>"
            r0 = 10
            r10.A0A(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1086:
            r1 = 9
            java.lang.String r0 = "<<"
            r10.A0A(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x108f:
            r1 = 8
            java.lang.String r0 = "^"
            r10.A0A(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1098:
            r1 = 7
            java.lang.String r0 = "|"
            r10.A0A(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x10a0:
            r1 = 6
            java.lang.String r0 = "&"
            r10.A0A(r1, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x10a8:
            java.lang.String r1 = "-"
            r0 = 4
            r10.A0A(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x10b0:
            java.lang.String r0 = "%"
            r10.A0A(r11, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x10b7:
            java.lang.String r0 = "/"
            r10.A0A(r9, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x10be:
            java.lang.String r0 = "imul"
            r10.A0A(r8, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x10c5:
            java.lang.String r0 = "*"
            r10.A0A(r7, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x10cc:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x10d3:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x10da:
            java.lang.Object r0 = r10.A07     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x10e1:
            boolean r1 = X.C18180wK.A1W(r19)
            java.lang.String r0 = "enter executed more than once"
            if (r1 == 0) goto L_0x128c
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r19 = r0
            byte r0 = r18.get()     // Catch:{ 88e -> 0x12b8 }
            r2 = r0 & 255(0xff, float:3.57E-43)
            short r3 = r18.getShort()     // Catch:{ 88e -> 0x12b8 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            r1 = 0
            r0 = r19
            if (r2 > r0) goto L_0x1105
            r1 = 1
        L_0x1105:
            java.lang.String r0 = "op_enter too many params to copy"
            if (r1 == 0) goto L_0x1288
            int r3 = r3 + r19
            int r0 = r3 + 5
            A0G(r10, r0)     // Catch:{ 88e -> 0x12b8 }
            int r4 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r3 = r19 + r4
            r10.A01 = r3     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object[] r1 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r0 = 0
            java.util.Arrays.fill(r1, r4, r3, r0)     // Catch:{ 88e -> 0x12b8 }
            int r1 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r3 = r1 - r11
            int[] r0 = r10.A04     // Catch:{ 88e -> 0x12b8 }
            r5 = r0[r3]     // Catch:{ 88e -> 0x12b8 }
            r0 = 4
            int r1 = r1 - r0
            java.lang.Object[] r3 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r0 = r3[r1]     // Catch:{ 88e -> 0x12b8 }
            X.6jr r0 = X.AnonymousClass70O.A00(r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.Object[] r1 = r0.A02     // Catch:{ 88e -> 0x12b8 }
            if (r1 == 0) goto L_0x113d
            int r0 = r1.length     // Catch:{ 88e -> 0x12b8 }
        L_0x1133:
            int r0 = java.lang.Math.min(r0, r2)     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x1140
            java.lang.System.arraycopy(r1, r7, r3, r4, r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x113f
        L_0x113d:
            r0 = 0
            goto L_0x1133
        L_0x113f:
            int r4 = r4 + r0
        L_0x1140:
            int r2 = r2 - r0
            int r3 = java.lang.Math.min(r5, r2)     // Catch:{ 88e -> 0x12b8 }
            if (r3 <= 0) goto L_0x0045
            java.lang.Object[] r2 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            int r1 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r0 = r5 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r1, r2, r4, r3)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x1155:
            java.lang.Number r0 = X.AnonymousClass3WF.A00(r24)     // Catch:{ 88e -> 0x12b8 }
            r10.A0P(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x0045
        L_0x115e:
            int r6 = r10.A01     // Catch:{ 88e -> 0x12b8 }
            int r0 = r6 + -1
            java.lang.Object[] r5 = r10.A05     // Catch:{ 88e -> 0x12b8 }
            r4 = r5[r0]     // Catch:{ 88e -> 0x12b8 }
            int r3 = r10.A00     // Catch:{ 88e -> 0x12b8 }
            int r0 = r3 - r11
            int[] r1 = r10.A04     // Catch:{ 88e -> 0x12b8 }
            r2 = r1[r0]     // Catch:{ 88e -> 0x12b8 }
            int r0 = r2 + 1
            int r0 = r0 + -1
            int r0 = r0 + 5
            int r0 = r3 - r0
            r5[r0] = r4     // Catch:{ 88e -> 0x12b8 }
            r1 = r1[r3]     // Catch:{ 88e -> 0x12b8 }
            int r0 = r3 + 1
            int r0 = r0 + -5
            int r0 = r0 - r2
            int r6 = r6 - r0
            r10.A08(r6)     // Catch:{ 88e -> 0x12b8 }
            r10.A00 = r1     // Catch:{ 88e -> 0x12b8 }
            return
        L_0x1186:
            java.lang.String r0 = "INT64_NOT operand must be numeric"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x118d:
            java.lang.String r0 = "INT64_NEG operand must be numeric"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x1194:
            java.lang.String r0 = "BIN_NOT operand must be numeric"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x119b:
            java.lang.String r0 = "NEG operand must be numeric"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x11a2:
            java.lang.String r0 = "TRUNC operand must be numeric"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x11a9:
            java.lang.String r0 = "TO_UINT32 operand must be numeric"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x11b0:
            java.lang.String r0 = "CHR16 operand must be numeric"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x11b7:
            java.lang.String r0 = "Expected stack value of map type for opcode "
            A0L(r0, r3, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x11be:
            java.lang.String r0 = "get_element_count argument must be a container or string"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x11c5:
            java.lang.String r0 = "Expected stack value of map type for opcode "
            A0L(r0, r3, r2)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x11cc:
            java.lang.String r0 = "Expected stack value of map type for opcode "
            A0L(r0, r2, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x11d3:
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ 88e -> 0x12b8 }
            X.88e r1 = new X.88e     // Catch:{ 88e -> 0x12b8 }
            r1.<init>(r0, r3)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12a8
        L_0x11e0:
            java.lang.String r0 = "vector_append 1st argument must be a vector"
            A0K(r0, r2)     // Catch:{ UnsupportedOperationException -> 0x11e7 }
            r0 = 0
            throw r0     // Catch:{ UnsupportedOperationException -> 0x11e7 }
        L_0x11e7:
            r3 = move-exception
        L_0x11e8:
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ 88e -> 0x12b8 }
            X.88e r1 = new X.88e     // Catch:{ 88e -> 0x12b8 }
            r1.<init>(r0, r3)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12a8
        L_0x11f5:
            java.lang.String r0 = "get_by_val_or 1st argument must be a container for key %s"
            java.lang.String r0 = X.C86164wN.A0i(r2, r0)     // Catch:{ 88e -> 0x12b8 }
            A0K(r0, r4)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x1200:
            java.lang.String r0 = "RangeError: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            X.88e r1 = new X.88e     // Catch:{ 88e -> 0x12b8 }
            r1.<init>(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12a8
        L_0x120d:
            java.lang.String r12 = "string index out of range"
            goto L_0x1255
        L_0x1210:
            java.lang.String r0 = "argument of container_clone must be a container"
            A0K(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x1217:
            java.lang.String r0 = "last apply() argument must be a vector or undefined"
            A0K(r0, r11)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x121e:
            java.lang.String r0 = "Expected stack value of closure type for opcode "
            A0L(r0, r6, r1)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x1225:
            r2 = move-exception
            java.lang.String r1 = "ArrayCopy dst must be mutable"
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            X.88e r1 = new X.88e     // Catch:{ 88e -> 0x12b8 }
            r1.<init>(r0, r2)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12a8
        L_0x1234:
            java.lang.String r12 = "ArrayCopy length out of range"
            goto L_0x1255
        L_0x1237:
            java.lang.String r12 = "ArrayCopy dst index out of range"
            goto L_0x1255
        L_0x123a:
            java.lang.String r12 = "ArrayCopy src index out of range"
            goto L_0x1255
        L_0x123d:
            java.lang.String r12 = "StringSearch length out of range"
            goto L_0x1255
        L_0x1240:
            java.lang.String r12 = "StringSearch offset out of range"
            goto L_0x1255
        L_0x1243:
            java.lang.String r12 = "SubstringCompare length out of range"
            goto L_0x1255
        L_0x1246:
            java.lang.String r12 = "SubstringCompare offset out of range"
            goto L_0x1255
        L_0x1249:
            java.lang.String r12 = "Substring length out of range"
            goto L_0x1255
        L_0x124c:
            java.lang.String r12 = "Substring offset out of range"
            goto L_0x1255
        L_0x124f:
            java.lang.String r0 = "invalid runtime function index "
            java.lang.String r12 = X.AnonymousClass00U.A0J(r0, r1)     // Catch:{ 88e -> 0x12b8 }
        L_0x1255:
            java.lang.String r0 = "RangeError: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r12)     // Catch:{ 88e -> 0x12b8 }
            X.88e r1 = new X.88e     // Catch:{ 88e -> 0x12b8 }
            r1.<init>(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12a8
        L_0x1261:
            r3 = move-exception
            java.lang.String r2 = "extension '"
            java.lang.String r1 = "' threw an exception: "
            java.lang.String r0 = r3.getMessage()     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r1 = X.AnonymousClass00U.A0d(r2, r13, r1, r0)     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r0 = "UserError: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ 88e -> 0x12b8 }
            X.88e r1 = new X.88e     // Catch:{ 88e -> 0x12b8 }
            r1.<init>(r0, r3)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12a8
        L_0x127a:
            r1 = move-exception
            goto L_0x12a8
        L_0x127c:
            java.lang.String r0 = "last bind() operand must be a vector or undefined"
            A0K(r0, r4)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x1282:
            java.lang.String r0 = "Expected stack value of closure type for opcode "
            A0L(r0, r1, r8)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x1288:
            A0J(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12b6
        L_0x128c:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)     // Catch:{ 88e -> 0x12b8 }
            goto L_0x12a8
        L_0x1291:
            java.lang.Object r4 = A07(r10)     // Catch:{ 88e -> 0x12b8 }
            r2 = 12
            boolean r0 = r4 instanceof java.lang.String     // Catch:{ 88e -> 0x12b8 }
            if (r0 == 0) goto L_0x12a9
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r0 = "UserError: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ 88e -> 0x12b8 }
            X.88e r1 = new X.88e     // Catch:{ 88e -> 0x12b8 }
            r1.<init>(r0)     // Catch:{ 88e -> 0x12b8 }
        L_0x12a8:
            throw r1     // Catch:{ 88e -> 0x12b8 }
        L_0x12a9:
            java.lang.String r1 = "Expected stack value of string type for opcode "
            java.lang.String[] r0 = X.J67.A00     // Catch:{ 88e -> 0x12b8 }
            r0 = r0[r2]     // Catch:{ 88e -> 0x12b8 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ 88e -> 0x12b8 }
        L_0x12b3:
            A0K(r0, r4)     // Catch:{ 88e -> 0x12b8 }
        L_0x12b6:
            r1 = 0
            goto L_0x12a8
        L_0x12b8:
            r4 = move-exception
            java.io.StringWriter r5 = X.C18230wP.A0d()
            java.lang.String r0 = r4.getMessage()
            java.io.StringWriter r1 = r5.append(r0)
            r0 = 10
            java.io.StringWriter r6 = r1.append(r0)
            java.lang.String r0 = "mins stack trace:\n"
            java.lang.StringBuilder r7 = X.C18190wL.A0s(r0)
            int r2 = r10.A00
            int r1 = r2 + -4
            java.lang.Object[] r0 = r10.A05
            r0 = r0[r1]
            X.6jr r1 = X.AnonymousClass70O.A00(r0)
            r0 = r16
            A0D(r1, r7, r0)
        L_0x12e2:
            int[] r1 = r10.A04
            r3 = r1[r2]
            if (r3 != 0) goto L_0x130c
            java.lang.String r0 = r7.toString()
            r6.append(r0)
            java.lang.Throwable r1 = r4.getCause()
            if (r1 == 0) goto L_0x1302
            java.lang.String r0 = "\n\nNative Stack Trace:\n"
            r5.append(r0)
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r5)
            r1.printStackTrace(r0)
        L_0x1302:
            java.lang.String r1 = r5.toString()
            X.88k r0 = new X.88k
            r0.<init>(r1, r4)
            throw r0
        L_0x130c:
            int r0 = r2 + -1
            r2 = r1[r0]
            int r1 = r3 + -4
            java.lang.Object[] r0 = r10.A05
            r0 = r0[r1]
            X.6jr r0 = X.AnonymousClass70O.A00(r0)
            A0D(r0, r7, r2)
            r2 = r3
            goto L_0x12e2
        L_0x131f:
            r0 = 0
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122147Ku.A0E(X.7Ku):void");
    }

    public static int A02(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (AnonymousClass70O.A01(obj)) {
            return 4;
        }
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof List) {
            return 6;
        }
        if (obj instanceof Map) {
            return 7;
        }
        if (obj instanceof C105916eC) {
            return 8;
        }
        return 5;
    }

    public static Number A03(Object obj) {
        int A002;
        double d;
        Number number;
        if ((obj instanceof Long) && (number = (Number) obj) != null) {
            A002 = number.intValue();
        } else if (obj instanceof Boolean) {
            if (AnonymousClass0wJ.A1X(obj)) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            return AnonymousClass3WF.A00(d);
        } else if (!AnonymousClass70O.A01(obj)) {
            return null;
        } else {
            A002 = (int) ((long) C86124wJ.A00(obj));
        }
        d = (double) A002;
        return AnonymousClass3WF.A00(d);
    }

    public static Number A05(Object obj) {
        long A002;
        Number number;
        if ((obj instanceof Long) && (number = (Number) obj) != null) {
            return number;
        }
        if (obj instanceof Boolean) {
            A002 = C86114wI.A09(AnonymousClass0wJ.A1X(obj) ? 1 : 0);
        } else if (!AnonymousClass70O.A01(obj)) {
            return null;
        } else {
            A002 = (long) C86124wJ.A00(obj);
        }
        return Long.valueOf(A002);
    }

    public static Object A07(C122147Ku r2) {
        return r2.A05[r2.A01 - 1];
    }

    private void A08(int i) {
        int i2 = this.A01 - i;
        this.A01 = i2;
        Arrays.fill(this.A05, i2, i + i2, (Object) null);
    }

    private void A09(int i, Object obj) {
        this.A05[(this.A01 - i) - 1] = obj;
    }

    private void A0A(int i, String str) {
        int i2;
        double d;
        int i3 = this.A01 - 1;
        Object[] objArr = this.A05;
        Object obj = objArr[i3];
        Object obj2 = objArr[i3 - 1];
        Number A042 = A04(obj2);
        Number A043 = A04(obj);
        if (A042 == null || A043 == null) {
            A0I(obj2, obj, AnonymousClass00U.A0L("Incompatible operand types of ", str));
            throw null;
        }
        switch (i) {
            case 0:
                d = A042.doubleValue() * A043.doubleValue();
                break;
            case 1:
                i2 = (int) ((A042.longValue() & 4294967295L) * (A043.longValue() & 4294967295L));
                break;
            case 2:
                d = A042.doubleValue() / A043.doubleValue();
                break;
            case 3:
                d = A042.doubleValue() % A043.doubleValue();
                break;
            case 4:
                d = A042.doubleValue() - A043.doubleValue();
                break;
            case 5:
                d = A042.doubleValue() + A043.doubleValue();
                break;
            case 6:
                i2 = ((int) ((long) A042.doubleValue())) & ((int) ((long) A043.doubleValue()));
                break;
            case 7:
                i2 = ((int) ((long) A042.doubleValue())) | ((int) ((long) A043.doubleValue()));
                break;
            case 8:
                i2 = ((int) ((long) A042.doubleValue())) ^ ((int) ((long) A043.doubleValue()));
                break;
            case 9:
                i2 = ((int) ((long) A042.doubleValue())) << (((int) ((long) A043.doubleValue())) & 31);
                break;
            case 10:
                i2 = ((int) ((long) A042.doubleValue())) >> (((int) ((long) A043.doubleValue())) & 31);
                break;
            default:
                d = (double) (((long) (((int) ((long) A042.doubleValue())) >>> (((int) ((long) A043.doubleValue())) & 31))) & 4294967295L);
                break;
        }
        d = (double) i2;
        A09(1, AnonymousClass3WF.A00(d));
        A0F(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b3, code lost:
        throw new X.C1373388e(X.AnonymousClass00U.A0L("TypeError: ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        A09(1, java.lang.Long.valueOf(r5));
        A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B(int r10, java.lang.String r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            int r1 = r0 + -1
            java.lang.Object[] r0 = r9.A05
            r3 = r0[r1]
            r2 = 1
            int r1 = r1 - r2
            r1 = r0[r1]
            java.lang.Number r8 = A05(r1)
            java.lang.Number r7 = A05(r3)
            if (r8 == 0) goto L_0x00bf
            if (r7 == 0) goto L_0x00bf
            r5 = 0
            r0 = 63
            switch(r10) {
                case 12: goto L_0x0035;
                case 13: goto L_0x0089;
                case 14: goto L_0x009e;
                case 15: goto L_0x003f;
                case 16: goto L_0x0049;
                case 17: goto L_0x0053;
                case 18: goto L_0x005d;
                case 19: goto L_0x0067;
                case 20: goto L_0x0071;
                case 21: goto L_0x007d;
                default: goto L_0x001f;
            }
        L_0x001f:
            long r5 = r8.longValue()
            long r3 = r7.longValue()
            long r3 = r3 & r0
            int r0 = (int) r3
            long r5 = r5 >>> r0
        L_0x002a:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r9.A09(r2, r0)
            A0F(r9)
            return
        L_0x0035:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 * r0
            goto L_0x002a
        L_0x003f:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 - r0
            goto L_0x002a
        L_0x0049:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 + r0
            goto L_0x002a
        L_0x0053:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 & r0
            goto L_0x002a
        L_0x005d:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 | r0
            goto L_0x002a
        L_0x0067:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 ^ r0
            goto L_0x002a
        L_0x0071:
            long r5 = r8.longValue()
            long r3 = r7.longValue()
            long r3 = r3 & r0
            int r0 = (int) r3
            long r5 = r5 << r0
            goto L_0x002a
        L_0x007d:
            long r5 = r8.longValue()
            long r3 = r7.longValue()
            long r3 = r3 & r0
            int r0 = (int) r3
            long r5 = r5 >> r0
            goto L_0x002a
        L_0x0089:
            long r3 = r7.longValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0094
            java.lang.String r1 = "INT64_DIV division by zero"
            goto L_0x00a8
        L_0x0094:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 / r0
            goto L_0x002a
        L_0x009e:
            long r3 = r7.longValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00b4
            java.lang.String r1 = "INT64_MOD division by zero"
        L_0x00a8:
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)
            X.88e r1 = new X.88e
            r1.<init>(r0)
            throw r1
        L_0x00b4:
            long r5 = r8.longValue()
            long r0 = r7.longValue()
            long r5 = r5 % r0
            goto L_0x002a
        L_0x00bf:
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r11)
            A0I(r1, r3, r0)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122147Ku.A0B(int, java.lang.String):void");
    }

    public static void A0D(C109346jr r5, StringBuilder sb, int i) {
        C110036l1 r3 = r5.A00;
        AnonymousClass78w r2 = r3.A03;
        ByteBuffer byteBuffer = r2.A01;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(byteBuffer.order());
        int i2 = r3.A02;
        duplicate.position(i2);
        duplicate.limit(r3.A00 + i2);
        if ((duplicate.get(i) & 255) == 4) {
            sb.append("  at extension function ");
            C86154wM.A1W(sb, (String) r2.A01(duplicate.getShort(i + 1) & 65535));
        }
        sb.append("  at offset ");
        sb.append(i - r2.A02[2].A02);
        sb.append("  (offset ");
        sb.append(i - i2);
        sb.append(" in function ");
        sb.append((String) r2.A01(r3.A01));
        sb.append(')');
        sb.append(" in script \"");
        sb.append(r2.A00);
        sb.append('\"');
        sb.append("\n");
    }

    public static void A0F(C122147Ku r3) {
        int i = r3.A01 - 1;
        r3.A01 = i;
        r3.A05[i] = null;
    }

    public static void A0G(C122147Ku r5, int i) {
        Object[] objArr = r5.A05;
        int length = objArr.length;
        int i2 = r5.A01;
        if (length - i2 < i) {
            int i3 = i2 + i;
            int i4 = NTLMEngineImpl.FLAG_NEGOTIATE_128;
            if (i3 > 536870912) {
                throw C18180wK.A0a("MinScript stack overflow");
            }
            do {
                length <<= 1;
            } while (length < i3);
            if (length <= 536870912) {
                i4 = length;
            }
            Object[] objArr2 = new Object[i4];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            r5.A05 = objArr2;
            int[] iArr = new int[i4];
            System.arraycopy(r5.A04, 0, iArr, 0, r5.A01);
            r5.A04 = iArr;
        }
    }

    public static void A0I(Object obj, Object obj2, String str) {
        String A0q;
        String A0q2;
        if (obj == null) {
            A0q = "null";
        } else {
            A0q = C18220wO.A0q(obj);
        }
        if (obj2 == null) {
            A0q2 = "null";
        } else {
            A0q2 = C18220wO.A0q(obj2);
        }
        throw new C1373388e(AnonymousClass00U.A0i("TypeError: ", str, ". Got ", A0q, " and ", A0q2));
    }

    public static void A0J(String str) {
        throw new C1373988k(AnonymousClass00U.A0L("InvalidBytecode: ", str));
    }

    public static final void A0K(String str, Object obj) {
        String A0q;
        if (obj == null) {
            A0q = "null";
        } else {
            A0q = C18220wO.A0q(obj);
        }
        throw new C1373388e(AnonymousClass00U.A0d("TypeError: ", str, ". Got ", A0q));
    }

    public static void A0L(String str, Object obj, int i) {
        A0K(AnonymousClass00U.A0L(str, J67.A00[i]), obj);
        throw null;
    }

    public static boolean A0M(Object obj) {
        if (obj instanceof Boolean) {
            return AnonymousClass0wJ.A1X(obj);
        }
        if (!C18220wO.A1U(obj)) {
            if (obj instanceof String) {
                return !((String) obj).isEmpty();
            }
            if (AnonymousClass70O.A01(obj)) {
                double A002 = C86124wJ.A00(obj);
                if (A002 == 0.0d || Double.isNaN(A002)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof Long) || C18190wL.A08(obj) != 0) {
                return true;
            }
        }
        return false;
    }

    public final int A0N(Object obj, String str, int i) {
        int i2;
        int i3;
        if (obj instanceof Long) {
            long A082 = C18190wL.A08(obj);
            i2 = (int) A082;
            i3 = (((long) i2) > A082 ? 1 : (((long) i2) == A082 ? 0 : -1));
        } else {
            if (AnonymousClass70O.A01(obj)) {
                double A002 = C86124wJ.A00(obj);
                i2 = (int) A002;
                i3 = (((double) i2) > A002 ? 1 : (((double) i2) == A002 ? 0 : -1));
            }
            throw new C1373388e(AnonymousClass00U.A0L("TypeError: ", str));
        }
        if (i3 == 0 && i2 >= 0 && i2 <= i) {
            return i2;
        }
        throw new C1373388e(AnonymousClass00U.A0L("TypeError: ", str));
    }

    public final Object A0O(Object obj) {
        if (obj instanceof Boolean) {
            if (AnonymousClass0wJ.A1X(obj)) {
                return "true";
            }
            return "false";
        } else if (obj instanceof Long) {
            return Long.toString(C18190wL.A08(obj));
        } else {
            if (AnonymousClass70O.A01(obj)) {
                double A002 = C86124wJ.A00(obj);
                int i = (int) A002;
                if (((double) i) == A002) {
                    return Integer.toString(i);
                }
                String d = Double.toString(A002);
                int indexOf = d.indexOf(69);
                if (indexOf < 0) {
                    return d;
                }
                int length = d.length();
                int i2 = length + 1;
                char[] cArr = new char[i2];
                d.getChars(0, indexOf, cArr, 0);
                cArr[indexOf] = 'e';
                int i3 = indexOf + 1;
                if (d.charAt(i3) == '-') {
                    d.getChars(i3, length, cArr, i3);
                } else {
                    cArr[i3] = '+';
                    d.getChars(i3, length, cArr, indexOf + 2);
                    length = i2;
                }
                return new String(cArr, 0, length);
            } else if (obj instanceof String) {
                return obj;
            } else {
                A0K("Value cannot be converted to string", obj);
                throw null;
            }
        }
    }

    public final void A0P(Object obj) {
        Object[] objArr = this.A05;
        int i = this.A01;
        objArr[i] = obj;
        this.A01 = i + 1;
    }

    public static double A00(C121467Gg r0, int i) {
        return A01(C121467Gg.A00(r0, i));
    }

    public static double A01(Object obj) {
        Number number;
        if (AnonymousClass70O.A01(obj) && (number = (Number) obj) != null) {
            return number.doubleValue();
        }
        if (obj instanceof Boolean) {
            if (AnonymousClass0wJ.A1X(obj)) {
                return 1.0d;
            }
            return 0.0d;
        } else if (obj instanceof Long) {
            return (double) C18190wL.A08(obj);
        } else {
            return Double.NaN;
        }
    }

    public static Number A04(Object obj) {
        Object obj2;
        Number number;
        if (AnonymousClass70O.A01(obj) && (number = (Number) obj) != null) {
            return number;
        }
        if (obj instanceof Boolean) {
            if (AnonymousClass0wJ.A1X(obj)) {
                obj2 = A0A;
            } else {
                obj2 = A0C;
            }
            if (AnonymousClass70O.A01(obj2)) {
                return (Number) obj2;
            }
            return null;
        } else if (obj instanceof Long) {
            return AnonymousClass3WF.A00((double) C18190wL.A08(obj));
        } else {
            return null;
        }
    }

    public static Object A06(C121467Gg r0, Object obj, int i, boolean z) {
        AnonymousClass6QH.A00(z, obj);
        return C121467Gg.A00(r0, i);
    }

    public static void A0H(C122147Ku r3, Object obj, Object obj2, int i, int i2) {
        r3.A0P(obj);
        int[] iArr = r3.A04;
        int i3 = r3.A01;
        iArr[i3] = i;
        r3.A01 = i3 + 1;
        r3.A0P(obj2);
        int i4 = r3.A01;
        iArr[i4] = i2;
        int i5 = i4 + 1;
        r3.A01 = i5;
        iArr[i5] = r3.A00;
        int i6 = i5 + 1;
        r3.A01 = i6;
        r3.A00 = i6 - 1;
    }
}
