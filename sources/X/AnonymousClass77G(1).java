package X;

/* renamed from: X.77G  reason: invalid class name */
public final class AnonymousClass77G {
    public static final AnonymousClass77G A00 = new AnonymousClass77G();

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f7, code lost:
        if (r1 != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r2 == 13950) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence A00(X.C127397h3 r14) {
        /*
            r13 = this;
            int r2 = r14.A03
            r0 = 13319(0x3407, float:1.8664E-41)
            if (r2 == r0) goto L_0x0017
            r0 = 13623(0x3537, float:1.909E-41)
            if (r2 == r0) goto L_0x0017
            r0 = 13626(0x353a, float:1.9094E-41)
            if (r2 == r0) goto L_0x0017
            r0 = 13904(0x3650, float:1.9484E-41)
            if (r2 == r0) goto L_0x0017
            r1 = 13950(0x367e, float:1.9548E-41)
            r0 = 0
            if (r2 != r1) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            if (r0 == 0) goto L_0x0134
            r0 = 13319(0x3407, float:1.8664E-41)
            if (r2 != r0) goto L_0x003f
            r2 = 36
            r0 = 0
            long r4 = r14.A0I(r2, r0)
            r1 = 38
            java.lang.String r0 = "date"
            java.lang.String r0 = r14.A0O(r1, r0)
            java.lang.String r1 = X.C18220wO.A0o(r14)
            java.lang.String r2 = X.C127397h3.A0C(r14)
            java.lang.String r3 = X.C127397h3.A0D(r14)
            java.lang.CharSequence r3 = X.AnonymousClass2LF.A00(r0, r1, r2, r3, r4)
        L_0x003e:
            return r3
        L_0x003f:
            r0 = 13626(0x353a, float:1.9094E-41)
            if (r2 != r0) goto L_0x0053
            java.lang.String r0 = X.C18220wO.A0o(r14)
            java.lang.String r3 = ""
            java.lang.String r2 = "IGCheckoutSignalingTextProviderUtils"
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "Null Padding Horizontal value for IGCheckoutSignalingTextProviderUtils"
            X.C30967GcS.A02(r2, r0)
            return r3
        L_0x0053:
            r0 = 13623(0x3537, float:1.909E-41)
            if (r2 != r0) goto L_0x0098
            r0 = 36
            r12 = 0
            int r1 = r14.A0H(r0, r12)
            r0 = 35
            java.lang.String r3 = ""
            java.lang.String r2 = r14.A0O(r0, r3)
            long r7 = (long) r1
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            android.content.Context r4 = X.C18230wP.A08()
            java.lang.String r0 = "date"
            boolean r10 = r2.equals(r0)
            r5 = 0
            r11 = 1
            boolean r9 = X.C19585Ayl.A04(r7)
            r6 = r5
            java.lang.CharSequence r0 = X.C19496AxJ.A02(r4, r5, r6, r7, r9, r10, r11, r12)
            if (r0 == 0) goto L_0x003e
            return r0
        L_0x0082:
            X.77p r0 = X.AnonymousClass7Kk.A0C(r0)     // Catch:{ 1zB -> 0x0092 }
            android.content.Context r1 = X.C18230wP.A08()     // Catch:{ 1zB -> 0x0092 }
            float r0 = r0.A00     // Catch:{ 1zB -> 0x0092 }
            int r0 = (int) r0     // Catch:{ 1zB -> 0x0092 }
            java.lang.CharSequence r3 = X.C19524Axl.A01(r1, r0)     // Catch:{ 1zB -> 0x0092 }
            return r3
        L_0x0092:
            java.lang.String r0 = "Error while parsing Padding Horizontal"
            X.C30967GcS.A02(r2, r0)
            return r3
        L_0x0098:
            r0 = 13950(0x367e, float:1.9548E-41)
            if (r2 != r0) goto L_0x0101
            android.content.Context r0 = X.C18230wP.A08()
            android.content.res.Configuration r0 = X.C86114wI.A0B(r0)
            java.util.Locale r2 = r0.locale
            java.lang.String r1 = X.C18230wP.A0o(r14)
            r8 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            boolean r0 = X.AnonymousClass0hA.A08(r1)
            if (r0 != 0) goto L_0x00bd
            double r0 = java.lang.Double.parseDouble(r1)
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
        L_0x00bd:
            java.lang.String r0 = X.C18220wO.A0o(r14)
            if (r0 == 0) goto L_0x00fc
            java.util.Currency r0 = java.util.Currency.getInstance(r0)
            java.text.NumberFormat r6 = java.text.NumberFormat.getCurrencyInstance(r2)
            r6.setCurrency(r0)
            r5 = r6
            java.text.DecimalFormat r5 = (java.text.DecimalFormat) r5
            java.text.DecimalFormatSymbols r4 = r5.getDecimalFormatSymbols()
            char r0 = r4.getGroupingSeparator()
            r3 = 32
            r2 = 8239(0x202f, float:1.1545E-41)
            if (r0 != r2) goto L_0x00fa
            r4.setGroupingSeparator(r3)
            r1 = 1
        L_0x00e3:
            char r0 = r4.getDecimalSeparator()
            if (r0 != r2) goto L_0x00f7
            r4.setDecimalSeparator(r3)
        L_0x00ec:
            r5.setDecimalFormatSymbols(r4)
        L_0x00ef:
            r6.setMaximumFractionDigits(r8)
            java.lang.String r3 = r6.format(r7)
            return r3
        L_0x00f7:
            if (r1 == 0) goto L_0x00ef
            goto L_0x00ec
        L_0x00fa:
            r1 = 0
            goto L_0x00e3
        L_0x00fc:
            java.lang.String r3 = r7.toString()
            return r3
        L_0x0101:
            r0 = 13904(0x3650, float:1.9484E-41)
            if (r2 != r0) goto L_0x0125
            java.lang.String r0 = X.C18220wO.A0o(r14)
            if (r0 == 0) goto L_0x0122
            android.text.SpannableStringBuilder r3 = X.C18200wM.A0E(r0)
            android.content.Context r2 = X.C18230wP.A08()
            r0 = 36
            r1 = 0
            java.lang.Object r0 = X.C127397h3.A0A(r14, r0)
            boolean r0 = X.AnonymousClass2LL.A00(r0, r1)
            X.C63563ho.A03(r2, r3, r0)
            return r3
        L_0x0122:
            java.lang.String r3 = ""
            return r3
        L_0x0125:
            java.lang.Object[] r1 = X.C18210wN.A1X(r2)
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0134:
            java.lang.String r0 = "Unrecognized Text provider with style id "
            java.lang.String r1 = X.AnonymousClass00U.A0J(r0, r2)
            java.lang.String r0 = "BloksTextProviderMapper"
            X.C30967GcS.A02(r0, r1)
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77G.A00(X.7h3):java.lang.CharSequence");
    }
}
