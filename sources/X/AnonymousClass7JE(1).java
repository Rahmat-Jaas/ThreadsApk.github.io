package X;

import java.util.Arrays;

/* renamed from: X.7JE  reason: invalid class name */
public final class AnonymousClass7JE {
    public static final AnonymousClass68C A02 = AnonymousClass68C.AUTO;
    public int A00 = 0;
    public float[] A01 = new float[0];

    public static float[] A03(AnonymousClass7JE r1) {
        A00(r1, 2);
        return r1.A01;
    }

    public static void A00(AnonymousClass7JE r3, int i) {
        int i2 = r3.A00 + i;
        float[] fArr = r3.A01;
        int length = fArr.length;
        if (i2 > length) {
            int i3 = length << 1;
            if (i3 < i2) {
                i3 += i2 - i3;
            }
            r3.A01 = Arrays.copyOf(fArr, i3);
        }
    }

    public static void A01(String str, StringBuilder sb, float[] fArr, int i) {
        Integer A012 = AnonymousClass7B6.A01((int) fArr[i + 1]);
        float f = fArr[i + 2];
        sb.append(str);
        sb.append(AnonymousClass7B6.A02(A012));
        sb.append(": ");
        sb.append(f);
    }

    public static boolean A02(float f) {
        return C18180wK.A1W(Float.compare(f, Float.NaN));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0070, code lost:
        r3.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
        r3.append(r11[r4 + 1]);
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        r3.append(r11[r4 + 1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d8, code lost:
        r3.append(r0);
        r3.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00de, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e1, code lost:
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f0, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f7, code lost:
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fa, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0106, code lost:
        r3.append(r0);
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r17 = this;
            java.lang.StringBuilder r3 = X.C18200wM.A0r()
            r4 = 0
        L_0x0005:
            r12 = r17
            int r0 = r12.A00
            if (r4 >= r0) goto L_0x010d
            r0 = 32
            java.lang.Integer[] r1 = X.AnonymousClass006.A00(r0)
            float[] r11 = r12.A01
            r0 = r11[r4]
            int r0 = (int) r0
            r0 = r1[r0]
            int r16 = r0.intValue()
            java.lang.String r15 = "  position"
            java.lang.String r14 = "  maxHeight: "
            java.lang.String r13 = "  minHeight: "
            java.lang.String r10 = "  height: "
            java.lang.String r9 = "  maxWidth: "
            java.lang.String r8 = "  minWidth: "
            java.lang.String r7 = "  width: "
            java.lang.String r0 = "  flexBasis: "
            java.lang.String r6 = "  margin"
            java.lang.String r2 = ": "
            java.lang.String r1 = "%\n"
            java.lang.String r5 = "\n"
            switch(r16) {
                case 0: goto L_0x0068;
                case 1: goto L_0x006b;
                case 2: goto L_0x006e;
                case 3: goto L_0x0070;
                case 4: goto L_0x0078;
                case 5: goto L_0x0037;
                case 6: goto L_0x007c;
                case 7: goto L_0x0080;
                case 8: goto L_0x0037;
                case 9: goto L_0x0084;
                case 10: goto L_0x0088;
                case 11: goto L_0x008c;
                case 12: goto L_0x0090;
                case 13: goto L_0x0094;
                case 14: goto L_0x0098;
                case 15: goto L_0x0037;
                case 16: goto L_0x009c;
                case 17: goto L_0x00a0;
                case 18: goto L_0x00ae;
                case 19: goto L_0x0074;
                case 20: goto L_0x00b9;
                case 21: goto L_0x00c9;
                case 22: goto L_0x0065;
                case 23: goto L_0x0055;
                case 24: goto L_0x00ed;
                case 25: goto L_0x00f4;
                case 26: goto L_0x0038;
                case 27: goto L_0x00e9;
                case 28: goto L_0x00e5;
                case 29: goto L_0x0101;
                case 30: goto L_0x0104;
                case 31: goto L_0x00fe;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x0005
        L_0x0038:
            int r0 = r4 + 1
            r0 = r11[r0]
            int r0 = (int) r0
            java.lang.Integer r0 = X.AnonymousClass7B6.A01(r0)
            r3.append(r6)
            java.lang.String r0 = X.AnonymousClass7B6.A02(r0)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "auto\n"
            r3.append(r0)
            goto L_0x00e1
        L_0x0055:
            X.1zQ[] r2 = X.C29861zQ.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  display: "
            goto L_0x00d8
        L_0x0065:
            java.lang.String r0 = "  aspectRatio: "
            goto L_0x0070
        L_0x0068:
            java.lang.String r0 = "  flex: "
            goto L_0x0070
        L_0x006b:
            java.lang.String r0 = "  flexGrow: "
            goto L_0x0070
        L_0x006e:
            java.lang.String r0 = "  flexShrink: "
        L_0x0070:
            r3.append(r0)
            goto L_0x00b1
        L_0x0074:
            r3.append(r14)
            goto L_0x00a3
        L_0x0078:
            r3.append(r0)
            goto L_0x00a3
        L_0x007c:
            r3.append(r7)
            goto L_0x00b1
        L_0x0080:
            r3.append(r7)
            goto L_0x00a3
        L_0x0084:
            r3.append(r8)
            goto L_0x00b1
        L_0x0088:
            r3.append(r8)
            goto L_0x00a3
        L_0x008c:
            r3.append(r9)
            goto L_0x00b1
        L_0x0090:
            r3.append(r9)
            goto L_0x00a3
        L_0x0094:
            r3.append(r10)
            goto L_0x00b1
        L_0x0098:
            r3.append(r10)
            goto L_0x00a3
        L_0x009c:
            r3.append(r13)
            goto L_0x00b1
        L_0x00a0:
            r3.append(r13)
        L_0x00a3:
            int r0 = r4 + 1
            r0 = r11[r0]
            r3.append(r0)
            r3.append(r1)
            goto L_0x00e1
        L_0x00ae:
            r3.append(r14)
        L_0x00b1:
            int r0 = r4 + 1
            r0 = r11[r0]
            r3.append(r0)
            goto L_0x00de
        L_0x00b9:
            X.68C[] r2 = X.AnonymousClass68C.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignSelf: "
            goto L_0x00d8
        L_0x00c9:
            X.66I[] r2 = X.AnonymousClass66I.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  positionType: "
        L_0x00d8:
            r3.append(r0)
            r3.append(r1)
        L_0x00de:
            r3.append(r5)
        L_0x00e1:
            int r4 = r4 + 2
            goto L_0x0005
        L_0x00e5:
            A01(r15, r3, r11, r4)
            goto L_0x00f7
        L_0x00e9:
            A01(r15, r3, r11, r4)
            goto L_0x00f0
        L_0x00ed:
            A01(r6, r3, r11, r4)
        L_0x00f0:
            r3.append(r5)
            goto L_0x00fa
        L_0x00f4:
            A01(r6, r3, r11, r4)
        L_0x00f7:
            r3.append(r1)
        L_0x00fa:
            int r4 = r4 + 3
            goto L_0x0005
        L_0x00fe:
            java.lang.String r0 = "  enableTextRounding: true\n"
            goto L_0x0106
        L_0x0101:
            java.lang.String r0 = "  hasMeasureFunction: true\n"
            goto L_0x0106
        L_0x0104:
            java.lang.String r0 = "  hasBaselineFunction: true\n"
        L_0x0106:
            r3.append(r0)
            int r4 = r4 + 1
            goto L_0x0005
        L_0x010d:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0120
            java.lang.String r2 = "{\n"
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "}"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)
            return r0
        L_0x0120:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JE.toString():java.lang.String");
    }
}
