package X;

import android.content.Context;
import android.text.InputFilter;

/* renamed from: X.3mN  reason: invalid class name and case insensitive filesystem */
public abstract class C64483mN implements InputFilter {
    public final Context A00;

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        if (r3 == 10004) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00a9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence filter(java.lang.CharSequence r14, int r15, int r16, android.text.Spanned r17, int r18, int r19) {
        /*
            r13 = this;
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r8 = r15
            r9 = r16
            r11.<init>(r14, r15, r9)
            boolean r0 = r14 instanceof android.text.Spanned
            r12 = 0
            if (r0 == 0) goto L_0x0015
            r7 = r14
            android.text.Spanned r7 = (android.text.Spanned) r7
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            android.text.TextUtils.copySpansFrom(r7, r8, r9, r10, r11, r12)
        L_0x0015:
            r2 = 0
            r7 = 0
        L_0x0017:
            int r0 = r16 - r15
            if (r2 >= r0) goto L_0x00cc
            int r0 = r2 + r15
            char r3 = r14.charAt(r0)
            boolean r1 = r13 instanceof X.AnonymousClass1w6
            if (r1 == 0) goto L_0x00b9
            r0 = 48
            if (r3 < r0) goto L_0x00b2
            r0 = 57
            if (r3 <= r0) goto L_0x00b6
            r0 = 97
            if (r3 < r0) goto L_0x00ad
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 <= r0) goto L_0x00b6
        L_0x0035:
            r4 = 0
        L_0x0036:
            if (r4 != 0) goto L_0x00a9
            int r4 = r2 + r12
            if (r1 == 0) goto L_0x0072
            java.lang.String r6 = "ascii"
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFD     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            java.lang.String r5 = java.text.Normalizer.normalize(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            java.lang.String r1 = "Œ"
            java.lang.String r0 = "OE"
            java.lang.String r5 = r5.replace(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            java.lang.String r1 = "œ"
            java.lang.String r0 = "oe"
            java.lang.String r5 = r5.replace(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            java.lang.String r1 = "Æ"
            java.lang.String r0 = "AE"
            java.lang.String r5 = r5.replace(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            java.lang.String r1 = "æ"
            java.lang.String r0 = "ae"
            java.lang.String r0 = r5.replace(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            byte[] r0 = r0.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            r1.<init>(r0, r6)     // Catch:{ UnsupportedEncodingException -> 0x0079 }
            goto L_0x007d
        L_0x0072:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "[\\u2611\\u2705\\u2713\\u2714]"
            goto L_0x008d
        L_0x0079:
            java.lang.String r1 = java.lang.String.valueOf(r3)
        L_0x007d:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r3 = r1.toLowerCase(r0)
            java.lang.String r1 = " "
            java.lang.String r0 = "_"
            java.lang.String r3 = r3.replace(r1, r0)
            java.lang.String r1 = "[^a-z0-9_.]"
        L_0x008d:
            java.lang.String r0 = ""
            java.lang.String r3 = r3.replaceAll(r1, r0)
            int r0 = r4 + 1
            r11.replace(r4, r0, r3)
            int r1 = r3.length()
            r0 = 1
            int r1 = r1 - r0
            int r12 = r12 + r1
            if (r7 != 0) goto L_0x00a8
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r7 = 0
            if (r0 == 0) goto L_0x00a9
        L_0x00a8:
            r7 = 1
        L_0x00a9:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x00ad:
            r0 = 95
            if (r3 == r0) goto L_0x00b6
            goto L_0x0035
        L_0x00b2:
            r0 = 46
            if (r3 != r0) goto L_0x0035
        L_0x00b6:
            r4 = 1
            goto L_0x0036
        L_0x00b9:
            r0 = 9745(0x2611, float:1.3656E-41)
            if (r3 == r0) goto L_0x0035
            r0 = 9989(0x2705, float:1.3998E-41)
            if (r3 == r0) goto L_0x0035
            r0 = 10003(0x2713, float:1.4017E-41)
            if (r3 == r0) goto L_0x0035
            r0 = 10004(0x2714, float:1.4019E-41)
            r4 = 1
            if (r3 != r0) goto L_0x0036
            goto L_0x0035
        L_0x00cc:
            if (r7 == 0) goto L_0x00f9
            boolean r0 = r13 instanceof X.AnonymousClass1w6
            if (r0 == 0) goto L_0x00fa
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18296951522984486(0x4100fb00000226, double:1.8917388764861644E-307)
            boolean r2 = X.C63173fJ.A05(r2, r0)
            android.content.Context r1 = r13.A00
            r0 = 2131829208(0x7f1121d8, float:1.9291379E38)
            if (r2 == 0) goto L_0x00e7
            r0 = 2131829207(0x7f1121d7, float:1.9291377E38)
        L_0x00e7:
            java.lang.String r2 = r1.getString(r0)
            r1 = r13
            boolean r0 = r13 instanceof X.AnonymousClass1w5
            if (r0 == 0) goto L_0x0100
            X.1w5 r1 = (X.AnonymousClass1w5) r1
            X.1cl r1 = r1.A00
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1.Cth(r2, r0)
        L_0x00f9:
            return r11
        L_0x00fa:
            android.content.Context r1 = r13.A00
            r0 = 2131829203(0x7f1121d3, float:1.9291368E38)
            goto L_0x00e7
        L_0x0100:
            boolean r0 = r13 instanceof X.AnonymousClass1w4
            if (r0 == 0) goto L_0x010e
            X.1w4 r1 = (X.AnonymousClass1w4) r1
            X.1ck r1 = r1.A00
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1.Cth(r2, r0)
            return r11
        L_0x010e:
            X.1w3 r1 = (X.AnonymousClass1w3) r1
            X.1cg r3 = r1.A00
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            r3.Cth(r2, r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r2 = r3.A0D
            android.os.Handler r1 = r3.A0L
            X.4Ri r0 = new X.4Ri
            r0.<init>(r2, r3)
            r1.post(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64483mN.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }

    public C64483mN(Context context) {
        this.A00 = context;
    }
}
