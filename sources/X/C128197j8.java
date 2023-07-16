package X;

/* renamed from: X.7j8  reason: invalid class name and case insensitive filesystem */
public final class C128197j8 implements C142168e4 {
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0242, code lost:
        if (r23.isEmpty() == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0163, code lost:
        if (r9 != false) goto L_0x0165;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.facebookpay.form.fragment.model.FormParams A00(X.AnonymousClass67I r40, com.facebookpay.form.model.AddressFormFieldsConfig r41, com.fbpay.logging.LoggingContext r42, X.AnonymousClass69W r43, com.google.common.collect.ImmutableList r44, com.google.common.collect.ImmutableList r45, java.lang.Integer r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.util.List r61, int r62, int r63, int r64, int r65, int r66, boolean r67, boolean r68, boolean r69, boolean r70, boolean r71, boolean r72, boolean r73, boolean r74) {
        /*
            r24 = r58
            r12 = r57
            r28 = r56
            r29 = r55
            r30 = r54
            r31 = r53
            r32 = r52
            r34 = r51
            r35 = r50
            r36 = r49
            r15 = r48
            r37 = r47
            r33 = r46
            r27 = r59
            r38 = r43
            r25 = r45
            r26 = r60
            r10 = r40
            r39 = r42
            r23 = r61
            r1 = r65
            r46 = r64
            r0 = r65 & 4
            r22 = 0
            if (r0 == 0) goto L_0x0034
            r33 = r22
        L_0x0034:
            r0 = r65 & 8
            if (r0 == 0) goto L_0x003a
            r37 = r22
        L_0x003a:
            r0 = r65 & 16
            if (r0 == 0) goto L_0x0040
            r15 = r22
        L_0x0040:
            r0 = r65 & 32
            if (r0 == 0) goto L_0x0046
            r36 = r22
        L_0x0046:
            r0 = r65 & 64
            if (r0 == 0) goto L_0x004c
            r35 = r22
        L_0x004c:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0052
            r34 = r22
        L_0x0052:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0058
            r32 = r22
        L_0x0058:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x005e
            r31 = r22
        L_0x005e:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0064
            r30 = r22
        L_0x0064:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x006a
            r29 = r22
        L_0x006a:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0070
            r28 = r22
        L_0x0070:
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0076
            r12 = r22
        L_0x0076:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x007c
            r24 = r22
        L_0x007c:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r65
            if (r0 == 0) goto L_0x0085
            r27 = r22
        L_0x0085:
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r65
            if (r0 == 0) goto L_0x008d
            r38 = r22
        L_0x008d:
            r0 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r65
            if (r0 == 0) goto L_0x0095
            r25 = r22
        L_0x0095:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r65
            if (r0 == 0) goto L_0x009d
            r26 = r22
        L_0x009d:
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r65
            r2 = r67
            boolean r11 = X.C18240wQ.A1R(r0, r2)
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r65
            r2 = r68
            boolean r21 = X.C18240wQ.A1R(r0, r2)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r65
            r2 = r69
            boolean r20 = X.C18240wQ.A1R(r0, r2)
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r65
            r2 = r70
            boolean r19 = X.C18240wQ.A1R(r0, r2)
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 & r65
            if (r0 == 0) goto L_0x00cd
            X.67I r10 = X.AnonymousClass67I.NONE
        L_0x00cd:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r65
            r2 = r71
            boolean r9 = X.C18240wQ.A1R(r0, r2)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r65
            if (r0 == 0) goto L_0x00df
            r39 = r22
        L_0x00df:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r65
            if (r0 == 0) goto L_0x00e7
            r23 = r22
        L_0x00e7:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r65
            r2 = r72
            boolean r18 = X.C18240wQ.A1R(r0, r2)
            r0 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r65
            r2 = r73
            boolean r4 = X.C18240wQ.A1R(r0, r2)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r65 & r0
            r0 = r74
            boolean r8 = X.C18240wQ.A1R(r1, r0)
            r0 = r66 & 1
            if (r0 == 0) goto L_0x010b
            r46 = 0
        L_0x010b:
            r0 = 25
            X.C04220Ms.A0B(r10, r0)
            r17 = 10
            r16 = 0
            if (r25 == 0) goto L_0x0157
            r1 = r25
            r0 = r17
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r1, r0)
            java.util.Iterator r3 = r25.iterator()
        L_0x0122:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x015a
            java.lang.Object r0 = r3.next()
            X.67M r0 = (X.AnonymousClass67M) r0
            X.C04220Ms.A04(r0)
            int r1 = r0.ordinal()
            r0 = 7
            if (r1 == r0) goto L_0x014d
            r0 = 1
            if (r1 == r0) goto L_0x014a
            r0 = 4
            if (r1 == r0) goto L_0x0147
            r0 = 2
            if (r1 != r0) goto L_0x0150
            r0 = 14
        L_0x0143:
            X.C18200wM.A1U(r2, r0)
            goto L_0x0122
        L_0x0147:
            r0 = 15
            goto L_0x0143
        L_0x014a:
            r0 = 28
            goto L_0x0143
        L_0x014d:
            r0 = 9
            goto L_0x0143
        L_0x0150:
            java.lang.String r0 = "Unrecognized GraphQLPaymentMethodVerifyFieldsEnum"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0157:
            r7 = r22
            goto L_0x015e
        L_0x015a:
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
        L_0x015e:
            r1 = 0
            r6 = 1
            if (r11 != 0) goto L_0x0165
            r13 = 1
            if (r9 == 0) goto L_0x0166
        L_0x0165:
            r13 = 0
        L_0x0166:
            java.lang.Integer r2 = X.C86154wM.A0X()
            java.lang.String r0 = "new_full_name_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = X.C116856xf.A01(r0)
            kotlin.Pair r5 = X.C18180wK.A0p(r2, r0)
            r0 = 13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_card_number_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = X.C116856xf.A01(r0)
            kotlin.Pair r3 = X.C18180wK.A0p(r2, r0)
            r0 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_cvv_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = X.C116856xf.A01(r0)
            kotlin.Pair r2 = X.C18180wK.A0p(r2, r0)
            r0 = 14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_expiry_date_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = X.C116856xf.A01(r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r14, r0)
            r40 = 3
            kotlin.Pair[] r0 = new kotlin.Pair[]{r5, r3, r2, r0}
            java.util.Map r2 = X.AnonymousClass4WJ.A0H(r0)
            if (r21 == 0) goto L_0x01b1
            r15 = 0
        L_0x01b1:
            X.5gy r0 = new X.5gy
            r0.<init>()
            r3 = r24
            r0.A0D = r3
            r3 = r27
            r0.A0C = r3
            r3 = r37
            r0.A0A = r3
            r0.A0F = r15
            r3 = r36
            r0.A0E = r3
            r3 = r35
            r0.A0G = r3
            r3 = r34
            r0.A0B = r3
            r3 = r38
            r0.A05 = r3
            r14 = r44
            r0.A06 = r14
            r0.A07 = r7
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r20)
            r0.A09 = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r19)
            r0.A08 = r3
            r0.A0L = r13
            r0.A00 = r6
            r0.A04 = r10
            r3 = r18
            r0.A0J = r3
            r0.A02 = r1
            r0.A01 = r1
            r0.A0I = r1
            r0.A0K = r8
            if (r24 == 0) goto L_0x0200
            int r3 = r24.length()
            if (r3 != 0) goto L_0x0202
        L_0x0200:
            r0.A0H = r2
        L_0x0202:
            com.facebookpay.form.cell.creditcard.CreditCardCellParams r10 = new com.facebookpay.form.cell.creditcard.CreditCardCellParams
            r10.<init>((X.C91865gy) r0)
            if (r12 == 0) goto L_0x0210
            r0 = r22
            com.facebook.common.locale.Country r3 = com.facebook.common.locale.Country.A00(r0, r12)     // Catch:{ IllegalArgumentException -> 0x0210 }
            goto L_0x0212
        L_0x0210:
            r3 = r22
        L_0x0212:
            r2 = 11
            X.5gz r0 = new X.5gz
            r5 = r41
            r0.<init>(r5, r2)
            r2 = r34
            r0.A0F = r2
            r2 = r32
            r0.A0L = r2
            r2 = r31
            r0.A0G = r2
            r2 = r30
            r0.A0H = r2
            r2 = r29
            r0.A0K = r2
            r2 = r28
            r0.A0J = r2
            r0.A0B = r3
            r0.A0T = r11
            if (r9 == 0) goto L_0x0244
            if (r23 == 0) goto L_0x0244
            boolean r3 = r23.isEmpty()
            r2 = 2131826393(0x7f1116d9, float:1.928567E38)
            if (r3 == 0) goto L_0x0247
        L_0x0244:
            r2 = 2131826394(0x7f1116da, float:1.9285671E38)
        L_0x0247:
            r0.A03 = r2
            r0.A0S = r6
            r0.A0E = r7
            r2 = r26
            r0.A0M = r2
            r0.A0U = r9
            r2 = r39
            r0.A0C = r2
            r0.A0V = r9
            r2 = r23
            r0.A0N = r2
            r2 = r18
            r0.A0Q = r2
            r0.A0R = r8
            if (r24 == 0) goto L_0x0353
            int r2 = r24.length()
            if (r2 == 0) goto L_0x0353
            java.lang.String r5 = java.lang.String.valueOf(r25)
            java.lang.String r3 = "client_load_credential_success"
            java.lang.String r9 = "edit_card"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r9, r5)
            java.util.List r53 = X.C18180wK.A0n(r2)
            java.lang.String r5 = "user_edit_credential_submit"
            java.lang.String r3 = "edit_card_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r5, r3)
            java.util.List r54 = X.C18180wK.A0n(r2)
            java.lang.String r3 = "user_remove_credential_enter"
            java.lang.String r2 = "remove_card"
            com.facebookpay.form.fragment.model.FormClickEvent r8 = new com.facebookpay.form.fragment.model.FormClickEvent
            r8.<init>(r3, r2)
            java.lang.String r3 = "user_remove_credential_submit"
            r2 = 1076(0x434, float:1.508E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            com.facebookpay.form.fragment.model.FormClickEvent r7 = new com.facebookpay.form.fragment.model.FormClickEvent
            r7.<init>(r3, r2)
            java.lang.String r3 = "user_remove_credential_cancel"
            java.lang.String r2 = "remove_card_cancel"
            com.facebookpay.form.fragment.model.FormClickEvent r6 = new com.facebookpay.form.fragment.model.FormClickEvent
            r6.<init>(r3, r2)
            java.lang.String r3 = "client_edit_credential_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r9)
            java.util.List r55 = X.C18180wK.A0n(r2)
            java.lang.String r3 = "client_edit_credential_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r9)
            java.util.List r56 = X.C18180wK.A0n(r2)
            java.lang.String r2 = "client_remove_credential_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r5 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r5.<init>(r2, r9)
            java.lang.String r3 = "client_remove_credential_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r9)
            com.facebookpay.form.fragment.model.FormLoggingEvents r28 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r47 = r28
            r48 = r8
            r49 = r7
            r50 = r6
            r51 = r5
            r52 = r2
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56)
        L_0x02dd:
            com.facebookpay.form.cell.address.AddressCellParams r2 = new com.facebookpay.form.cell.address.AddressCellParams
            r2.<init>((X.C91875gz) r0)
            com.facebookpay.form.cell.CellParams[] r0 = new com.facebookpay.form.cell.CellParams[]{r10, r2}
            java.util.ArrayList r37 = X.C06750aI.A14(r0)
            if (r21 == 0) goto L_0x0324
            r33 = r22
            r26 = r22
        L_0x02f0:
            java.lang.Integer r32 = java.lang.Integer.valueOf(r63)
            if (r4 == 0) goto L_0x0321
            X.697 r30 = X.AnonymousClass697.PRIMARY_LOCK_FILLED_SMALL
        L_0x02f8:
            com.facebookpay.form.fragment.model.FeatureConfiguration r0 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r2 = r18
            r0.<init>(r2, r4)
            if (r44 == 0) goto L_0x040e
            r2 = r17
            java.util.ArrayList r16 = X.AnonymousClass0wJ.A0x(r14, r2)
            java.util.Iterator r4 = r14.iterator()
        L_0x030b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x040e
            java.lang.Object r2 = r4.next()
            X.69W r2 = (X.AnonymousClass69W) r2
            int r3 = r2.A02()
            r2 = r16
            X.C18200wM.A1U(r2, r3)
            goto L_0x030b
        L_0x0321:
            X.697 r30 = X.AnonymousClass697.PRIMARY_LOCK_FILLED_HEADER
            goto L_0x02f8
        L_0x0324:
            com.instagram.service.session.UserSession r5 = X.AnonymousClass7HK.A00()
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 36327542059182141(0x810fb50000283d, double:3.0370221052729116E-306)
            boolean r0 = X.C63803iN.A0E(r0, r5, r2)
            if (r0 == 0) goto L_0x033d
            r0 = 2131826389(0x7f1116d5, float:1.928566E38)
            com.facebookpay.form.cell.label.LabelCellParams r26 = X.AnonymousClass7BI.A02(r0, r1, r1, r1)
            goto L_0x02f0
        L_0x033d:
            boolean r0 = X.AnonymousClass7HK.A01()
            if (r0 == 0) goto L_0x034b
            r0 = 2131826390(0x7f1116d6, float:1.9285663E38)
            com.facebookpay.form.cell.label.LabelCellParams r26 = X.AnonymousClass7BI.A02(r0, r1, r1, r1)
            goto L_0x02f0
        L_0x034b:
            r0 = 2131826395(0x7f1116db, float:1.9285673E38)
            com.facebookpay.form.cell.label.LabelCellParams r26 = X.AnonymousClass7BI.A02(r0, r1, r1, r1)
            goto L_0x02f0
        L_0x0353:
            r5 = 6
            r2 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "new_address1_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r2 = X.C116856xf.A01(r2)
            kotlin.Pair r25 = X.C18180wK.A0p(r3, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "new_address2_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r2 = X.C116856xf.A01(r2)
            kotlin.Pair r26 = X.C18180wK.A0p(r3, r2)
            r2 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "new_city_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r2 = X.C116856xf.A01(r2)
            kotlin.Pair r27 = X.C18180wK.A0p(r3, r2)
            r2 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "new_state_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r2 = X.C116856xf.A01(r2)
            kotlin.Pair r28 = X.C18180wK.A0p(r3, r2)
            r2 = 9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "new_zip_code_form_field"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r2 = X.C116856xf.A01(r2)
            kotlin.Pair r29 = X.C18180wK.A0p(r3, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            java.lang.String r2 = "new_country_picker"
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r2 = X.C116856xf.A01(r2)
            kotlin.Pair r30 = X.C18180wK.A0p(r3, r2)
            kotlin.Pair[] r2 = new kotlin.Pair[]{r25, r26, r27, r28, r29, r30}
            java.util.Map r2 = X.AnonymousClass4WJ.A0H(r2)
            r0.A0O = r2
            java.lang.String r5 = "add_card"
            java.lang.String r8 = "add_card_inline"
            r7 = r5
            if (r4 == 0) goto L_0x03c0
            r7 = r8
        L_0x03c0:
            java.lang.String r6 = "client_load_credential_success"
            com.facebookpay.form.fragment.model.FormDisplayEvent r3 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2 = r22
            r3.<init>(r6, r7, r2)
            java.util.List r53 = X.C18180wK.A0n(r3)
            if (r4 == 0) goto L_0x040b
            r6 = r8
        L_0x03d0:
            java.lang.String r3 = "user_add_credential_submit"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r3, r6)
            java.util.List r54 = X.C18180wK.A0n(r2)
            r6 = r5
            if (r4 == 0) goto L_0x03df
            r6 = r8
        L_0x03df:
            java.lang.String r3 = "client_add_credential_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r6)
            java.util.List r55 = X.C18180wK.A0n(r2)
            if (r4 == 0) goto L_0x03ed
            r5 = r8
        L_0x03ed:
            java.lang.String r3 = "client_add_credential_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r5)
            java.util.List r56 = X.C18180wK.A0n(r2)
            com.facebookpay.form.fragment.model.FormLoggingEvents r28 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r47 = r28
            r48 = r22
            r49 = r22
            r50 = r22
            r51 = r22
            r52 = r22
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            goto L_0x02dd
        L_0x040b:
            java.lang.String r6 = "add_card_save"
            goto L_0x03d0
        L_0x040e:
            r42 = 2131826499(0x7f111743, float:1.9285884E38)
            r43 = 2131826498(0x7f111742, float:1.9285882E38)
            r44 = 2131826495(0x7f11173f, float:1.9285876E38)
            r45 = 2131826488(0x7f111738, float:1.9285862E38)
            com.facebookpay.form.fragment.model.FormParams r25 = new com.facebookpay.form.fragment.model.FormParams
            r41 = r62
            r27 = r0
            r29 = r22
            r31 = r38
            r34 = r22
            r35 = r22
            r36 = r24
            r38 = r16
            r39 = r22
            r47 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128197j8.A00(X.67I, com.facebookpay.form.model.AddressFormFieldsConfig, com.fbpay.logging.LoggingContext, X.69W, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}
