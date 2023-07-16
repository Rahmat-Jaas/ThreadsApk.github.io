package X;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.util.TypedValue;

/* renamed from: X.7B1  reason: invalid class name */
public final class AnonymousClass7B1 {
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.CharSequence] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b0, code lost:
        if (r14 != 0) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
        if (X.C18220wO.A0o(r4) != null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013e, code lost:
        if (r12 != 0) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0142, code lost:
        r14 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b1 A[SYNTHETIC, Splitter:B:76:0x01b1] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x022b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C563536v A00(X.AnonymousClass3HX r26, X.C127397h3 r27, java.util.List r28) {
        /*
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            java.lang.StringBuilder r17 = X.C18200wM.A0r()
            java.util.Iterator r16 = r28.iterator()
        L_0x000d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02bd
            java.lang.Object r4 = r16.next()
            X.7h3 r4 = (X.C127397h3) r4
            int r3 = r5.length()
            r0 = 59
            X.7h3 r0 = r4.A0K(r0)
            if (r0 == 0) goto L_0x029c
            java.lang.String r2 = " "
        L_0x0027:
            r5.append(r2)
            int r1 = r5.length()
            r10 = 59
            X.7h3 r0 = r4.A0K(r10)
            r6 = r26
            if (r0 == 0) goto L_0x0155
            java.lang.String r9 = "Error parsing image width"
            r7 = 62
            android.util.SparseArray r0 = r4.A04
            java.lang.String r8 = X.C86114wI.A0m(r0, r7)
            r7 = 61
            java.lang.String r7 = X.C86114wI.A0m(r0, r7)
            X.7h3 r21 = r4.A0K(r10)
            java.lang.String r12 = "TextNodeUtils"
            if (r8 == 0) goto L_0x014e
            if (r7 == 0) goto L_0x014e
            if (r21 == 0) goto L_0x014e
            float r11 = X.AnonymousClass7Kk.A01(r8)     // Catch:{ 1zB -> 0x0240 }
            float r10 = X.AnonymousClass7Kk.A01(r7)     // Catch:{ 1zB -> 0x0240 }
            r8 = 0
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0145
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0145
            r7 = 68
            java.lang.String r9 = X.C86114wI.A0m(r0, r7)
            r7 = 69
            X.7h3 r13 = r4.A0K(r7)
            android.graphics.Rect r19 = X.C86134wK.A0D()
            if (r13 == 0) goto L_0x00b6
            r7 = 42
            float r7 = X.AnonymousClass6Q2.A00(r13, r7)
            int r14 = (int) r7
            r7 = 40
            float r7 = X.AnonymousClass6Q2.A00(r13, r7)
            int r15 = (int) r7
            r7 = 41
            float r7 = X.AnonymousClass6Q2.A00(r13, r7)
            int r12 = (int) r7
            r7 = 35
            float r7 = X.AnonymousClass6Q2.A00(r13, r7)
            int r8 = (int) r7
            r7 = 36
            float r7 = X.AnonymousClass6Q2.A00(r13, r7)
            int r7 = (int) r7
            r18 = r7
            r7 = 38
            float r7 = X.AnonymousClass6Q2.A00(r13, r7)
            int r13 = (int) r7
            android.content.Context r7 = r6.A00
            boolean r7 = X.AnonymousClass6Q3.A00(r7)
            if (r7 == 0) goto L_0x0138
            r7 = r12
            if (r12 != 0) goto L_0x00b0
            r7 = r18
        L_0x00b0:
            if (r14 == 0) goto L_0x0142
        L_0x00b2:
            android.graphics.Rect r19 = X.C86164wN.A0F(r7, r15, r14, r8)
        L_0x00b6:
            java.lang.String r7 = X.C127397h3.A0E(r4)
            if (r7 != 0) goto L_0x00c4
            java.lang.String r7 = X.C18220wO.A0o(r4)
            r22 = 0
            if (r7 == 0) goto L_0x00c6
        L_0x00c4:
            r22 = 1
        L_0x00c6:
            r23 = 1
            if (r9 == 0) goto L_0x00e7
            int r8 = r9.hashCode()
            r7 = -1720785339(0xffffffff996ee645, float:-1.2350814E-23)
            if (r8 == r7) goto L_0x00e7
            r7 = -1383228885(0xffffffffad8d9a2b, float:-1.6098308E-11)
            if (r8 == r7) goto L_0x012d
            r7 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r8 != r7) goto L_0x00e7
            java.lang.String r7 = "center"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x00e7
            r23 = 2
        L_0x00e7:
            r7 = 0
            X.5FZ r8 = new X.5FZ
            r18 = r8
            r20 = r6
            r18.<init>(r19, r20, r21, r22, r23)
            int r12 = (int) r11
            int r13 = (int) r10
            r9 = 0
            int r10 = r5.length()
            if (r1 > r10) goto L_0x0111
            X.8dm r11 = r8.A03
            r10 = 32
            java.lang.String r10 = X.AnonymousClass000.A00(r10)
            X.C04220Ms.A0C(r11, r10)
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            r11.setBounds(r9, r9, r12, r13)
            r8.A00 = r7
            r7 = 33
            r5.setSpan(r8, r3, r1, r7)
        L_0x0111:
            A01(r5, r6, r4, r3, r1)
            android.content.Context r10 = r6.A00
            java.lang.String r8 = X.C18220wO.A0o(r4)
            if (r8 == 0) goto L_0x0245
            X.794 r7 = X.AnonymousClass794.A00()
            X.3TV r7 = r7.A05
            android.graphics.Typeface r7 = r7.A01(r10, r8, r9)
            X.4zs r10 = new X.4zs
            r10.<init>(r7)
            goto L_0x023a
        L_0x012d:
            java.lang.String r7 = "bottom"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x00e7
            r23 = 0
            goto L_0x00e7
        L_0x0138:
            r7 = r14
            if (r14 != 0) goto L_0x013d
            r7 = r18
        L_0x013d:
            r14 = r12
            if (r12 == 0) goto L_0x0142
            goto L_0x00b2
        L_0x0142:
            r14 = r13
            goto L_0x00b2
        L_0x0145:
            r9 = 0
            java.lang.String r8 = "Invalid dimensions specified for image span"
            r7 = 0
            X.C30967GcS.A01(r6, r12, r8, r9, r7)
            goto L_0x0245
        L_0x014e:
            java.lang.String r7 = "Invalid image span attributes specified."
            X.C30967GcS.A02(r12, r7)
            goto L_0x0245
        L_0x0155:
            r0 = 44
            X.7h3 r7 = r4.A0K(r0)
            if (r7 == 0) goto L_0x0198
            r0 = 0
            int r0 = X.C101086Pv.A00(r6, r7, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0166:
            if (r0 == 0) goto L_0x0175
            int r0 = r0.intValue()
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            r7.<init>(r0)
            r0 = 0
            r5.setSpan(r7, r3, r1, r0)
        L_0x0175:
            A01(r5, r6, r4, r3, r1)
            java.lang.String r9 = X.C18220wO.A0o(r4)
            if (r9 == 0) goto L_0x0196
            android.content.Context r8 = r6.A00
            X.794 r0 = X.AnonymousClass794.A00()
            X.3TV r7 = r0.A05
            r0 = 0
            android.graphics.Typeface r11 = r7.A01(r8, r9, r0)
        L_0x018b:
            r7 = 43
            android.util.SparseArray r0 = r4.A04
            java.lang.String r8 = X.C86114wI.A0m(r0, r7)
            if (r8 == 0) goto L_0x01c1
            goto L_0x01b1
        L_0x0196:
            r11 = 0
            goto L_0x018b
        L_0x0198:
            java.lang.String r0 = X.C127397h3.A0C(r4)
            if (r0 == 0) goto L_0x0175
            int r0 = X.AnonymousClass7Kk.A04(r0)     // Catch:{ 1zB -> 0x01a7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 1zB -> 0x01a7 }
            goto L_0x0166
        L_0x01a7:
            r9 = move-exception
            java.lang.String r8 = "TextNodeUtils"
            java.lang.String r7 = "Error parsing TextSpan color"
            r0 = 0
            X.C30967GcS.A01(r6, r8, r7, r9, r0)
            goto L_0x0175
        L_0x01b1:
            android.content.Context r7 = r6.A00     // Catch:{ 1zB -> 0x01b8 }
            android.graphics.Typeface r11 = X.C101096Pw.A00(r7, r11, r8)     // Catch:{ 1zB -> 0x01b8 }
            goto L_0x01c1
        L_0x01b8:
            r10 = move-exception
            java.lang.String r9 = "TextNodeUtils"
            java.lang.String r8 = "Error parsing TextSpan textStyle"
            r7 = 0
            X.C30967GcS.A01(r6, r9, r8, r10, r7)
        L_0x01c1:
            r13 = 0
            if (r11 == 0) goto L_0x01cc
            android.text.style.TypefaceSpan r7 = new android.text.style.TypefaceSpan
            r7.<init>(r11)
            r5.setSpan(r7, r3, r1, r13)
        L_0x01cc:
            r7 = 45
            r9 = 0
            java.lang.Object r7 = X.C127397h3.A0A(r4, r7)
            boolean r7 = X.AnonymousClass2LL.A00(r7, r13)
            if (r7 == 0) goto L_0x01e1
            android.text.style.StrikethroughSpan r7 = new android.text.style.StrikethroughSpan
            r7.<init>()
            r5.setSpan(r7, r3, r1, r13)
        L_0x01e1:
            r7 = 52
            java.lang.Object r7 = X.C127397h3.A0A(r4, r7)
            boolean r7 = X.AnonymousClass2LL.A00(r7, r13)
            if (r7 == 0) goto L_0x01f5
            android.text.style.UnderlineSpan r7 = new android.text.style.UnderlineSpan
            r7.<init>()
            r5.setSpan(r7, r3, r1, r13)
        L_0x01f5:
            r7 = 56
            r8 = 0
            float r12 = r4.A0G(r7, r8)
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0220
            r7 = 54
            float r11 = r4.A0G(r7, r8)
            r7 = 55
            float r10 = r4.A0G(r7, r8)
            r7 = 53
            X.7h3 r7 = r4.A0K(r7)
            if (r7 == 0) goto L_0x023e
            int r8 = X.C101086Pv.A00(r6, r7, r13)
        L_0x0218:
            X.4za r7 = new X.4za
            r7.<init>(r12, r11, r10, r8)
            r5.setSpan(r7, r3, r1, r13)
        L_0x0220:
            r8 = 49
            r7 = 1
            float r8 = r4.A0G(r8, r7)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0245
            android.content.Context r7 = X.C18230wP.A08()
            android.util.DisplayMetrics r7 = X.C18230wP.A0E(r7)
            float r7 = r7.scaledDensity
            X.4zt r10 = new X.4zt
            r10.<init>(r8, r7)
        L_0x023a:
            r5.setSpan(r10, r3, r1, r9)
            goto L_0x0245
        L_0x023e:
            r8 = 0
            goto L_0x0218
        L_0x0240:
            r8 = move-exception
            r7 = 0
            X.C30967GcS.A01(r6, r12, r9, r8, r7)
        L_0x0245:
            r7 = 66
            java.lang.String r23 = X.C86114wI.A0m(r0, r7)
            r7 = 67
            java.lang.String r24 = X.C86114wI.A0m(r0, r7)
            X.6jp r22 = X.C127397h3.A08(r4)
            r8 = 0
            r20 = r27
            if (r22 == 0) goto L_0x026a
            X.5fc r7 = new X.5fc
            r18 = r7
            r19 = r6
            r21 = r4
            r25 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r5.setSpan(r7, r3, r1, r8)
        L_0x026a:
            r7 = 57
            X.6jp r22 = r4.A0L(r7)
            if (r22 == 0) goto L_0x0282
            r25 = 1
            X.5fc r7 = new X.5fc
            r18 = r7
            r19 = r6
            r21 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r5.setSpan(r7, r3, r1, r8)
        L_0x0282:
            r1 = 66
            java.lang.String r1 = X.C86114wI.A0m(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0295
            r0 = r17
            r0.append(r1)
            goto L_0x000d
        L_0x0295:
            r0 = r17
            r0.append(r2)
            goto L_0x000d
        L_0x029c:
            r0 = 41
            X.7h3 r1 = r4.A0K(r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x02b5
            X.794 r0 = X.AnonymousClass794.A00()
            X.77G r0 = r0.A08
            java.lang.CharSequence r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0027
            r2 = r0
            goto L_0x0027
        L_0x02b5:
            r0 = 38
            java.lang.String r2 = r4.A0O(r0, r2)
            goto L_0x0027
        L_0x02bd:
            java.lang.String r1 = r17.toString()
            X.36v r0 = new X.36v
            r0.<init>(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7B1.A00(X.3HX, X.7h3, java.util.List):X.36v");
    }

    public static void A02(MNV mnv, Integer num) {
        Integer num2;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                num2 = AnonymousClass006.A0C;
            } else if (intValue == 8388611 || intValue != 8388613) {
                num2 = AnonymousClass006.A00;
            } else {
                num2 = AnonymousClass006.A01;
            }
            mnv.A0X = num2;
        }
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, AnonymousClass3HX r4, C127397h3 r5, int i, int i2) {
        String A0E = C127397h3.A0E(r5);
        if (A0E != null) {
            try {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, AnonymousClass7Kk.A02(A0E), C18230wP.A0E(r4.A00))), i, i2, 0);
            } catch (C29721zB e) {
                C30967GcS.A01(r4, "TextNodeUtils", "Error parsing TextSpan size", e, 0);
            }
        }
    }
}
