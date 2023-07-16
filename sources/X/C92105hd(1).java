package X;

/* renamed from: X.5hd  reason: invalid class name and case insensitive filesystem */
public final class C92105hd extends C92005hR {
    public C880856r A00 = C880856r.A04(false);
    public final int A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92105hd(com.facebookpay.form.cell.logging.FormCellLoggingEvents r28, com.facebookpay.form.cell.text.formatter.TextFormatter r29, com.fbpay.theme.FBPayIcon r30, com.google.common.collect.ImmutableList r31, java.lang.Integer r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, int r37, int r38, int r39, boolean r40, boolean r41, boolean r42) {
        /*
            r27 = this;
            r4 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            r8 = 0
            r18 = r38
            r17 = r37
            r25 = r42
            r7 = r29
            r23 = r41
            r6 = r28
            r22 = r40
            r5 = r27
            r9 = r30
            r10 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r19 = r4
            r20 = r4
            r21 = r4
            r24 = r4
            r26 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.56r r0 = X.C880856r.A04(r11)
            r5.A00 = r0
            r0 = r39
            r5.A01 = r0
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0053
            X.56q r2 = r5.A06
            java.lang.Object r0 = r2.A08()
            if (r0 != 0) goto L_0x0053
            com.fbpay.theme.FBPayIcon r1 = r5.A0K
            if (r1 == 0) goto L_0x0053
            X.75V r0 = new X.75V
            r0.<init>((com.fbpay.theme.FBPayIcon) r1)
            r2.A0H(r0)
        L_0x0053:
            int r3 = r5.A01
            if (r3 == 0) goto L_0x0087
            X.7Kz r2 = X.AnonymousClass7Kz.A0A()
            X.6sa r0 = r2.A00
            X.0Oe r1 = r0.A0G
            java.lang.String r0 = "SharedPreferences Factory is not provided!"
            X.C002801h.A02(r1, r0)
            X.6sa r0 = r2.A00
            X.0Oe r0 = r0.A0G
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "saw_card_scanner_tooltip"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x0087
            r0 = 1
            if (r3 != r0) goto L_0x0088
            android.os.Handler r3 = X.AnonymousClass0wJ.A0F()
            X.7zG r2 = new X.7zG
            r2.<init>(r5)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
        L_0x0087:
            return
        L_0x0088:
            r0 = 2
            if (r3 != r0) goto L_0x0087
            X.56r r1 = r5.A0B
            r0 = 62
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r0 = X.C86114wI.A0Q(r5, r0)
            X.C121277Fh.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92105hd.<init>(com.facebookpay.form.cell.logging.FormCellLoggingEvents, com.facebookpay.form.cell.text.formatter.TextFormatter, com.fbpay.theme.FBPayIcon, com.google.common.collect.ImmutableList, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.equals(((X.AnonymousClass75V) r2.A08()).A00) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C92105hd r5) {
        /*
            X.56q r2 = r5.A06
            java.lang.Object r0 = r2.A08()
            r4 = 1
            if (r0 == 0) goto L_0x001c
            com.fbpay.theme.FBPayIcon r1 = r5.A0K
            if (r1 == 0) goto L_0x001c
            java.lang.Object r0 = r2.A08()
            X.75V r0 = (X.AnonymousClass75V) r0
            com.fbpay.theme.FBPayIcon r0 = r0.A00
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            X.56r r1 = r5.A00
            java.lang.Object r0 = r1.A08()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0053
            if (r3 == 0) goto L_0x0053
            X.C86114wI.A1B(r1, r4)
            X.7Kz r2 = X.AnonymousClass7Kz.A0A()
            X.6sa r0 = r2.A00
            X.0Oe r1 = r0.A0G
            java.lang.String r0 = "SharedPreferences Factory is not provided!"
            X.C002801h.A02(r1, r0)
            X.6sa r0 = r2.A00
            X.0Oe r0 = r0.A0G
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "saw_card_scanner_tooltip"
            r1.putBoolean(r0, r4)
            r1.apply()
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92105hd.A01(X.5hd):void");
    }
}
