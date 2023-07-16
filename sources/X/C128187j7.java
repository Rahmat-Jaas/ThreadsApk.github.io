package X;

/* renamed from: X.7j7  reason: invalid class name and case insensitive filesystem */
public final class C128187j7 implements C142168e4 {
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00aa, code lost:
        if (r14.A00 != true) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013d, code lost:
        if (r23.length() == 0) goto L_0x013f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.facebookpay.form.fragment.model.FormParams A00(com.facebookpay.form.fragment.model.FeatureConfiguration r29, com.facebookpay.form.model.AddressFormFieldsConfig r30, com.fbpay.logging.LoggingContext r31, com.google.common.collect.ImmutableList r32, java.lang.Integer r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, int r43, int r44, int r45, int r46, boolean r47, boolean r48) {
        /*
            r28 = r43
            r2 = r46
            r20 = r33
            r23 = r34
            r10 = r35
            r9 = r36
            r8 = r37
            r7 = r38
            r6 = r39
            r5 = r40
            r4 = r41
            r1 = r42
            r14 = r29
            r11 = r31
            r13 = r32
            r0 = r46 & 16
            r15 = 0
            if (r0 == 0) goto L_0x0025
            r20 = r15
        L_0x0025:
            r0 = r46 & 32
            if (r0 == 0) goto L_0x002b
            r23 = r15
        L_0x002b:
            r0 = r46 & 64
            if (r0 == 0) goto L_0x0030
            r10 = r15
        L_0x0030:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0035
            r9 = r15
        L_0x0035:
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003a
            r8 = r15
        L_0x003a:
            r0 = r2 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x003f
            r7 = r15
        L_0x003f:
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0044
            r6 = r15
        L_0x0044:
            r0 = r2 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0049
            r5 = r15
        L_0x0049:
            r0 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x004e
            r4 = r15
        L_0x004e:
            r0 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0053
            r1 = r15
        L_0x0053:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r46
            if (r0 == 0) goto L_0x005b
            r14 = r15
        L_0x005b:
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r46
            if (r0 == 0) goto L_0x0062
            r11 = r15
        L_0x0062:
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r46
            if (r0 == 0) goto L_0x0069
            r13 = r15
        L_0x0069:
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r46
            r3 = r47
            boolean r34 = X.C18240wQ.A1R(r0, r3)
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r46 & r0
            r0 = r48
            boolean r3 = X.C18240wQ.A1R(r2, r0)
            if (r23 == 0) goto L_0x0081
            r28 = r44
        L_0x0081:
            if (r1 == 0) goto L_0x0188
            com.facebook.common.locale.Country r2 = com.facebook.common.locale.Country.A00(r15, r1)
        L_0x0087:
            r1 = 11
            X.5gz r0 = new X.5gz
            r12 = r30
            r0.<init>(r12, r1)
            r0.A0F = r10
            r0.A0L = r9
            r0.A0G = r8
            r0.A0I = r7
            r0.A0H = r6
            r0.A0J = r5
            r0.A0K = r4
            r0.A0B = r2
            r0.A0C = r11
            r4 = 1
            r33 = 0
            if (r14 == 0) goto L_0x00ac
            boolean r2 = r14.A00
            r1 = 1
            if (r2 == r4) goto L_0x00ad
        L_0x00ac:
            r1 = 0
        L_0x00ad:
            r0.A0Q = r1
            r0.A0D = r13
            r0.A0R = r3
            if (r23 == 0) goto L_0x00bb
            int r1 = r23.length()
            if (r1 != 0) goto L_0x0131
        L_0x00bb:
            r1 = 2
            r3 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "new_full_name_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r1 = X.C116856xf.A00(r1)
            kotlin.Pair r4 = X.C18180wK.A0p(r2, r1)
            r1 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "new_address1_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r1 = X.C116856xf.A00(r1)
            kotlin.Pair r5 = X.C18180wK.A0p(r2, r1)
            r1 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "new_address2_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r1 = X.C116856xf.A00(r1)
            kotlin.Pair r6 = X.C18180wK.A0p(r2, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "new_city_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r1 = X.C116856xf.A00(r1)
            kotlin.Pair r7 = X.C18180wK.A0p(r2, r1)
            r1 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "new_state_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r1 = X.C116856xf.A00(r1)
            kotlin.Pair r8 = X.C18180wK.A0p(r2, r1)
            r1 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "new_zip_code_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r1 = X.C116856xf.A00(r1)
            kotlin.Pair r9 = X.C18180wK.A0p(r2, r1)
            r1 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "new_country_picker"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r1 = X.C116856xf.A00(r1)
            kotlin.Pair r10 = X.C18180wK.A0p(r2, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r1 = X.AnonymousClass4WJ.A0H(r1)
            r0.A0O = r1
        L_0x0131:
            com.facebookpay.form.cell.address.AddressCellParams r2 = new com.facebookpay.form.cell.address.AddressCellParams
            r2.<init>((X.C91875gz) r0)
            if (r23 == 0) goto L_0x013f
            int r0 = r23.length()
            r1 = 0
            if (r0 != 0) goto L_0x0140
        L_0x013f:
            r1 = 1
        L_0x0140:
            boolean r0 = X.AnonymousClass7HK.A01()
            if (r0 == 0) goto L_0x0180
            r0 = 2131826388(0x7f1116d4, float:1.9285659E38)
            com.facebookpay.form.cell.label.LabelCellParams r13 = X.AnonymousClass7BI.A00(r0)
        L_0x014d:
            java.lang.Integer r19 = java.lang.Integer.valueOf(r45)
            com.facebookpay.form.cell.CellParams[] r0 = new com.facebookpay.form.cell.CellParams[]{r2}
            java.util.ArrayList r24 = X.C06750aI.A14(r0)
            if (r1 == 0) goto L_0x017d
            java.lang.Integer r22 = X.AnonymousClass006.A00
        L_0x015d:
            r27 = 2
            r29 = 2131826497(0x7f111741, float:1.928588E38)
            r30 = 2131826496(0x7f111740, float:1.9285878E38)
            r31 = 2131826495(0x7f11173f, float:1.9285876E38)
            r32 = 2131826488(0x7f111738, float:1.9285862E38)
            com.facebookpay.form.fragment.model.FormParams r12 = new com.facebookpay.form.fragment.model.FormParams
            r16 = r15
            r17 = r15
            r18 = r15
            r21 = r15
            r25 = r15
            r26 = r15
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r12
        L_0x017d:
            java.lang.Integer r22 = X.AnonymousClass006.A01
            goto L_0x015d
        L_0x0180:
            r0 = 2131826507(0x7f11174b, float:1.92859E38)
            com.facebookpay.form.cell.label.LabelCellParams r13 = X.AnonymousClass7BI.A01(r0)
            goto L_0x014d
        L_0x0188:
            r2 = r15
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128187j7.A00(com.facebookpay.form.fragment.model.FeatureConfiguration, com.facebookpay.form.model.AddressFormFieldsConfig, com.fbpay.logging.LoggingContext, com.google.common.collect.ImmutableList, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, boolean, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}
