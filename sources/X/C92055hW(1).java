package X;

import android.util.SparseArray;
import com.facebookpay.form.cell.CellParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5hW  reason: invalid class name and case insensitive filesystem */
public abstract class C92055hW extends AnonymousClass7Ih {
    public SparseArray A00 = C86154wM.A0D();
    public final C880756q A01 = C880756q.A01();
    public final C880856r A02 = C880856r.A03();

    public void A0G() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i < sparseArray.size()) {
                AnonymousClass7Ih r0 = (AnonymousClass7Ih) sparseArray.valueAt(i);
                if (r0 != null) {
                    r0.A0G();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final AnonymousClass7Ih A0L(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i2 >= sparseArray.size()) {
                return null;
            }
            if (sparseArray.valueAt(i2) != null && ((AnonymousClass7Ih) sparseArray.valueAt(i2)).A02 == i) {
                return (AnonymousClass7Ih) sparseArray.valueAt(i2);
            }
            i2++;
        }
    }

    public static SparseArray A0B(AnonymousClass7Ih r0) {
        Object A08 = r0.A05.A08();
        A08.getClass();
        return (SparseArray) A08;
    }

    public final void A0I(boolean z) {
        Object A08 = this.A07.A08();
        A08.getClass();
        if (AnonymousClass0wJ.A1X(A08) != z) {
            super.A0I(z);
            A0N();
            C880756q r1 = this.A05;
            r1.A0H(r1.A08());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0270, code lost:
        if (r0 != null) goto L_0x0354;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.collect.ImmutableList A0M() {
        /*
            r18 = this;
            r1 = r18
            boolean r0 = r1 instanceof X.C92035hU
            if (r0 == 0) goto L_0x0292
            r2 = r1
            X.5hU r2 = (X.C92035hU) r2
            android.util.SparseArray r17 = A0B(r2)
            boolean r0 = r2.A0D
            r16 = r0
            if (r0 == 0) goto L_0x001c
            X.69W r1 = r2.A06
            com.facebookpay.form.cell.text.util.CvvTextFieldHandler r0 = new com.facebookpay.form.cell.text.util.CvvTextFieldHandler
            r0.<init>(r1)
            r2.A00 = r0
        L_0x001c:
            com.google.common.collect.ImmutableList$Builder r3 = X.C86164wN.A0Q()
            X.56r r0 = r2.A07
            java.lang.Object r0 = r0.A08()
            r0.getClass()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0357
            int r8 = r2.A03
            if (r8 == 0) goto L_0x0087
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            com.google.common.collect.ImmutableList r0 = r2.A07
            if (r0 == 0) goto L_0x0053
            X.83w r1 = r0.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r1.next()
            X.69W r0 = (X.AnonymousClass69W) r0
            int r0 = r0.A02()
            X.C18200wM.A1U(r4, r0)
            goto L_0x003f
        L_0x0053:
            r7 = 27
            boolean r0 = r2.A0A
            r9 = 2130969465(0x7f040379, float:1.7547613E38)
            if (r0 == 0) goto L_0x005d
            r9 = 0
        L_0x005d:
            r10 = 2130969439(0x7f04035f, float:1.754756E38)
            r11 = 2
            int r0 = r4.size()
            r1 = 5
            if (r0 <= r1) goto L_0x028f
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
        L_0x006c:
            com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams r5 = new com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.add((java.lang.Object) r5)
            int r0 = r4.size()
            if (r0 <= r1) goto L_0x0087
            X.5gq r1 = new X.5gq
            r1.<init>(r4)
            com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams r0 = new com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams
            r0.<init>((X.C91785gq) r1)
            r3.add((java.lang.Object) r0)
        L_0x0087:
            int r4 = r2.A02
            if (r4 == 0) goto L_0x00a5
            r0 = 38
            X.5h0 r1 = new X.5h0
            r1.<init>(r0)
            r1.A03 = r4
            r0 = 2130969441(0x7f040361, float:1.7547564E38)
            r1.A05 = r0
            r0 = 2130969440(0x7f040360, float:1.7547562E38)
            r1.A01 = r0
            com.facebookpay.form.cell.label.LabelCellParams r0 = r1.A00()
            r3.add((java.lang.Object) r0)
        L_0x00a5:
            r0 = 35
            boolean r4 = r2.A0B
            com.facebookpay.form.cell.creditcard.CardScannerCellParams r8 = new com.facebookpay.form.cell.creditcard.CardScannerCellParams
            r8.<init>(r0, r4)
            if (r4 != 0) goto L_0x00b9
            X.67I r1 = r2.A05
            X.67I r0 = X.AnonymousClass67I.INLINE
            if (r1 != r0) goto L_0x00b9
            r3.add((java.lang.Object) r8)
        L_0x00b9:
            r13 = 13
            X.5ha r9 = new X.5ha
            r9.<init>()
            int r0 = r2.A01
            r9.A00 = r0
            com.google.common.collect.ImmutableList r10 = r2.A07
            r9.A01 = r10
            r0 = 2131298196(0x7f090794, float:1.8214358E38)
            r9.A01 = r0
            java.lang.Integer r11 = X.AnonymousClass006.A0C
            r9.A0C = r11
            r0 = 2131823159(0x7f110a37, float:1.927911E38)
            r9.A03 = r0
            com.facebookpay.form.cell.text.formatter.CreditCardFormatter r0 = new com.facebookpay.form.cell.text.formatter.CreditCardFormatter
            r0.<init>()
            r9.A04 = r0
            com.google.common.collect.ImmutableList$Builder r6 = X.C86164wN.A0Q()
            java.lang.Integer r7 = X.AnonymousClass006.A0Y
            r5 = 2131823154(0x7f110a32, float:1.92791E38)
            r1 = 2131823148(0x7f110a2c, float:1.9279087E38)
            java.lang.String r12 = ""
            com.facebookpay.form.cell.text.TextValidatorParams r0 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0.<init>(r7, r12, r5, r1)
            r6.add((java.lang.Object) r0)
            if (r10 == 0) goto L_0x0103
            java.lang.Integer r10 = X.AnonymousClass006.A1C
            r5 = 2131823163(0x7f110a3b, float:1.9279118E38)
            r1 = 0
            com.facebookpay.form.cell.text.TextValidatorParams r0 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0.<init>(r10, r12, r5, r1)
            r6.add((java.lang.Object) r0)
        L_0x0103:
            java.lang.Integer r5 = X.AnonymousClass006.A15
            r1 = 2131823155(0x7f110a33, float:1.9279102E38)
            r10 = 0
            com.facebookpay.form.cell.text.TextValidatorParams r0 = new com.facebookpay.form.cell.text.TextValidatorParams
            r0.<init>(r5, r12, r1, r10)
            r6.add((java.lang.Object) r0)
            com.google.common.collect.ImmutableList r1 = r6.build()
            com.google.common.collect.ImmutableList$Builder r0 = r9.A0G
            r0.addAll((java.lang.Iterable) r1)
            r0 = r17
            java.lang.String r0 = X.C86114wI.A0m(r0, r13)
            r9.A0F = r0
            boolean r0 = r2.A0E
            r0 = r0 ^ 1
            r9.A03 = r0
            X.67I r5 = r2.A05
            X.67I r0 = X.AnonymousClass67I.TEXT_FIELD
            r1 = 0
            if (r5 != r0) goto L_0x028c
            com.fbpay.theme.FBPayIcon r0 = com.fbpay.theme.FBPayIcon.CAMERA_SECONDARY
        L_0x0131:
            r9.A06 = r0
            java.util.Map r6 = r2.A08
            if (r6 == 0) goto L_0x0289
            java.lang.Object r0 = X.C18200wM.A0f(r6, r13)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = (com.facebookpay.form.cell.logging.FormCellLoggingEvents) r0
        L_0x013d:
            r9.A02 = r0
            java.lang.String r0 = "creditCardNumber"
            X.C92045hV.A05(r9, r3, r0, r4)
            if (r4 == 0) goto L_0x014d
            X.67I r0 = X.AnonymousClass67I.INLINE
            if (r5 != r0) goto L_0x014d
            r3.add((java.lang.Object) r8)
        L_0x014d:
            r9 = 14
            X.5h1 r5 = new X.5h1
            r5.<init>(r9)
            r0 = 2131300305(0x7f090fd1, float:1.8218636E38)
            r5.A01 = r0
            r0 = 2131823158(0x7f110a36, float:1.9279108E38)
            r5.A03 = r0
            r0 = 2131823172(0x7f110a44, float:1.9279136E38)
            r5.A00 = r0
            r0 = 2131823173(0x7f110a45, float:1.9279138E38)
            r5.A01 = r0
            r5.A0C = r11
            com.facebookpay.form.cell.text.formatter.DateFormatter r0 = new com.facebookpay.form.cell.text.formatter.DateFormatter
            r0.<init>()
            r5.A04 = r0
            r8 = 2131823156(0x7f110a34, float:1.9279104E38)
            r0 = 2131823174(0x7f110a46, float:1.927914E38)
            com.facebookpay.form.cell.text.TextValidatorParams r15 = new com.facebookpay.form.cell.text.TextValidatorParams
            r15.<init>(r7, r12, r8, r0)
            java.lang.String r0 = "4"
            r14 = 2131823157(0x7f110a35, float:1.9279106E38)
            com.facebookpay.form.cell.text.TextValidatorParams r13 = new com.facebookpay.form.cell.text.TextValidatorParams
            r13.<init>(r11, r0, r14, r10)
            java.lang.Integer r0 = X.AnonymousClass006.A0u
            com.facebookpay.form.cell.text.TextValidatorParams r8 = new com.facebookpay.form.cell.text.TextValidatorParams
            r8.<init>(r0, r12, r14, r10)
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of(r15, r13, r8)
            com.google.common.collect.ImmutableList$Builder r0 = r5.A0G
            r0.addAll((java.lang.Iterable) r8)
            java.util.Set r8 = r2.A09
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r0 = r8.contains(r13)
            if (r0 != 0) goto L_0x01aa
            r0 = r17
            java.lang.Object r1 = r0.get(r9)
            java.lang.String r1 = (java.lang.String) r1
        L_0x01aa:
            r5.A0F = r1
            r9 = 1056964608(0x3f000000, float:0.5)
            r5.A00 = r9
            boolean r0 = r8.contains(r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A0A = r0
            if (r6 == 0) goto L_0x0286
            java.lang.Object r0 = r6.get(r13)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = (com.facebookpay.form.cell.logging.FormCellLoggingEvents) r0
        L_0x01c2:
            r5.A02 = r0
            java.lang.String r0 = "creditCardExpirationDate"
            X.C92045hV.A05(r5, r3, r0, r4)
            r1 = 15
            X.5h1 r5 = new X.5h1
            r5.<init>(r1)
            r0 = 2131306768(0x7f092910, float:1.8231744E38)
            r5.A01 = r0
            r0 = 2131823162(0x7f110a3a, float:1.9279116E38)
            r5.A03 = r0
            r0 = 2131823164(0x7f110a3c, float:1.927912E38)
            r5.A00 = r0
            r5.A0C = r11
            r13 = 2131823160(0x7f110a38, float:1.9279112E38)
            r0 = 2131823165(0x7f110a3d, float:1.9279122E38)
            com.facebookpay.form.cell.text.TextValidatorParams r14 = new com.facebookpay.form.cell.text.TextValidatorParams
            r14.<init>(r7, r12, r13, r0)
            X.69W r12 = r2.A06
            if (r12 == 0) goto L_0x0282
            java.lang.String r15 = r12.A04
        L_0x01f2:
            r0 = 2131823161(0x7f110a39, float:1.9279114E38)
            com.facebookpay.form.cell.text.TextValidatorParams r13 = new com.facebookpay.form.cell.text.TextValidatorParams
            r13.<init>(r11, r15, r0, r10)
            com.google.common.collect.ImmutableList r10 = com.google.common.collect.ImmutableList.of(r14, r13)
            com.google.common.collect.ImmutableList$Builder r0 = r5.A0G
            r0.addAll((java.lang.Iterable) r10)
            com.facebookpay.form.cell.text.util.TextFieldHandler r0 = r2.A00
            r5.A05 = r0
            if (r16 == 0) goto L_0x027b
            X.69W r0 = X.AnonymousClass69W.AMERICAN_EXPRESS
            if (r12 != r0) goto L_0x0278
            java.lang.String r0 = "••••"
        L_0x020f:
            r5.A0F = r0
            r0 = r16 ^ 1
            r5.A03 = r0
            r5.A00 = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r8.contains(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A0A = r0
            boolean r0 = r2.A0F
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A0B = r0
            if (r6 == 0) goto L_0x0276
            java.lang.Object r0 = r6.get(r1)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = (com.facebookpay.form.cell.logging.FormCellLoggingEvents) r0
        L_0x0235:
            r5.A02 = r0
            java.lang.String r0 = "creditCardSecurityCode"
            X.C92045hV.A05(r5, r3, r0, r4)
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x026e
            r5 = 2
            X.5h1 r1 = new X.5h1
            r1.<init>(r5)
            r0 = 2131298211(0x7f0907a3, float:1.8214389E38)
            r1.A01 = r0
            r0 = 2131823147(0x7f110a2b, float:1.9279085E38)
            r1.A03 = r0
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r1.A0C = r0
            X.C92045hV.A06(r1, r7, r0)
            r0 = r17
            java.lang.String r0 = X.C86114wI.A0m(r0, r5)
            r1.A0F = r0
            if (r6 == 0) goto L_0x0274
            java.lang.Object r0 = X.C18200wM.A0f(r6, r5)
            com.facebookpay.form.cell.logging.FormCellLoggingEvents r0 = (com.facebookpay.form.cell.logging.FormCellLoggingEvents) r0
        L_0x0267:
            r1.A02 = r0
            java.lang.String r0 = "personName"
            X.C92045hV.A05(r1, r3, r0, r4)
        L_0x026e:
            com.facebookpay.form.cell.address.AddressCellParams r0 = r2.A04
            if (r0 == 0) goto L_0x0357
            goto L_0x0354
        L_0x0274:
            r0 = 0
            goto L_0x0267
        L_0x0276:
            r0 = 0
            goto L_0x0235
        L_0x0278:
            java.lang.String r0 = "•••"
            goto L_0x020f
        L_0x027b:
            r0 = r17
            java.lang.String r0 = X.C86114wI.A0m(r0, r1)
            goto L_0x020f
        L_0x0282:
            java.lang.String r15 = "3"
            goto L_0x01f2
        L_0x0286:
            r0 = 0
            goto L_0x01c2
        L_0x0289:
            r0 = 0
            goto L_0x013d
        L_0x028c:
            r0 = r1
            goto L_0x0131
        L_0x028f:
            r6 = r4
            goto L_0x006c
        L_0x0292:
            boolean r0 = r1 instanceof X.C92025hT
            if (r0 == 0) goto L_0x02fb
            r6 = r1
            X.5hT r6 = (X.C92025hT) r6
            com.google.common.collect.ImmutableList$Builder r5 = com.google.common.collect.ImmutableList.builder()
            r0 = 26
            X.5h0 r2 = new X.5h0
            r2.<init>(r0)
            int r0 = r6.A00
            r2.A03 = r0
            r0 = 1
            r2.A07 = r0
            boolean r1 = r6.A04
            r0 = 2130969465(0x7f040379, float:1.7547613E38)
            if (r1 == 0) goto L_0x02b3
            r0 = 0
        L_0x02b3:
            r2.A04 = r0
            if (r1 == 0) goto L_0x02bc
            r0 = 2130969513(0x7f0403a9, float:1.754771E38)
            r2.A00 = r0
        L_0x02bc:
            com.facebookpay.form.cell.label.LabelCellParams r0 = r2.A00()
            r5.add((java.lang.Object) r0)
            com.facebook.graphql.impls.FBPayFormFieldImpl r4 = r6.A02
            if (r4 == 0) goto L_0x02d4
            boolean r3 = r6.A05
            r2 = 0
            java.lang.String r1 = "nux_new_full_name_form_field"
            r0 = 0
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128217jA.A00(r4, r2, r1, r3, r0)
            r5.add((java.lang.Object) r0)
        L_0x02d4:
            com.facebook.graphql.impls.FBPayFormFieldImpl r4 = r6.A01
            if (r4 == 0) goto L_0x02e5
            boolean r3 = r6.A05
            r2 = 0
            java.lang.String r1 = "nux_new_email_form_field"
            r0 = 0
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128207j9.A00(r4, r2, r1, r3, r0)
            r5.add((java.lang.Object) r0)
        L_0x02e5:
            com.facebook.graphql.impls.FBPayFormFieldImpl r4 = r6.A03
            if (r4 == 0) goto L_0x02f6
            boolean r3 = r6.A05
            r2 = 0
            java.lang.String r1 = "nux_new_phone_number_form_field"
            r0 = 0
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128227jB.A00(r4, r2, r1, r3, r0)
            r5.add((java.lang.Object) r0)
        L_0x02f6:
            com.google.common.collect.ImmutableList r0 = X.C18250wR.A0F(r5)
            return r0
        L_0x02fb:
            r6 = r1
            X.5hS r6 = (X.C92015hS) r6
            android.util.SparseArray r5 = A0B(r6)
            r0 = 10
            java.lang.Object r4 = X.C86124wJ.A0k(r5, r0)
            com.facebook.common.locale.Country r4 = (com.facebook.common.locale.Country) r4
            com.google.common.collect.ImmutableList$Builder r3 = X.C86164wN.A0Q()
            java.lang.String r1 = X.C86164wN.A0f(r4)
            java.lang.String r0 = "US"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0338
            r2 = 9
            X.5h1 r1 = new X.5h1
            r1.<init>(r2)
            r0 = 2131309181(0x7f09327d, float:1.8236639E38)
            r1.A01 = r0
            r0 = 2131823143(0x7f110a27, float:1.9279077E38)
            r1.A03 = r0
            java.lang.String r0 = X.C86114wI.A0m(r5, r2)
            r1.A0F = r0
            com.facebookpay.form.cell.text.TextCellParams r0 = r1.A00()
            r3.add((java.lang.Object) r0)
        L_0x0338:
            com.facebookpay.form.model.AddressFormFieldsConfig r0 = r6.A00
            java.util.List<com.facebookpay.form.model.FormCountry> r0 = r0.A01
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            X.5gw r1 = new X.5gw
            r1.<init>(r4, r0)
            r0 = 2131299158(0x7f090b56, float:1.821631E38)
            r1.A01 = r0
            r0 = 2131823134(0x7f110a1e, float:1.927906E38)
            r1.A00 = r0
            com.facebookpay.form.cell.selector.CountrySelectorCellParams r0 = new com.facebookpay.form.cell.selector.CountrySelectorCellParams
            r0.<init>(r1)
        L_0x0354:
            r3.add((java.lang.Object) r0)
        L_0x0357:
            com.google.common.collect.ImmutableList r0 = r3.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92055hW.A0M():com.google.common.collect.ImmutableList");
    }

    public C92055hW(int i, boolean z, boolean z2) {
        super(i, z, z2);
    }

    public void A0N() {
        SparseArray sparseArray;
        M5J m5j;
        M5J m5j2;
        ImmutableList A0M = A0M();
        int i = 0;
        while (true) {
            sparseArray = this.A00;
            if (i >= sparseArray.size()) {
                break;
            }
            AnonymousClass7Ih r2 = (AnonymousClass7Ih) sparseArray.valueAt(i);
            this.A05.A0J(r2.A05);
            C880756q r1 = this.A01;
            if (r2 instanceof C92055hW) {
                m5j2 = ((C92055hW) r2).A01;
            } else {
                m5j2 = r2.A06;
            }
            r1.A0J(m5j2);
            r2.A0G();
            i++;
        }
        this.A00 = C86154wM.A0D();
        C1366783w it = A0M.iterator();
        while (it.hasNext()) {
            CellParams cellParams = (CellParams) it.next();
            AnonymousClass7Ih A012 = cellParams.A01();
            cellParams.A00 = A012;
            A012.A0H(this.A00);
            int i2 = cellParams.A02;
            if (sparseArray.get(i2) instanceof C92005hR) {
                ((C92005hR) A012).A08.A0H(((C92005hR) sparseArray.get(i2)).A08.A08());
            }
            cellParams.A00 = A012;
            this.A00.put(i2, A012);
            C880756q r22 = this.A01;
            if (A012 instanceof C92055hW) {
                m5j = ((C92055hW) A012).A01;
            } else {
                m5j = A012.A06;
            }
            C880856r.A05(m5j, r22, this, 64);
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.A00;
            if (i3 < sparseArray2.size()) {
                AnonymousClass7Ih r3 = (AnonymousClass7Ih) sparseArray2.valueAt(i3);
                this.A05.A0K(r3.A05, C86164wN.A0O(r3, this, 6));
                i3++;
            } else {
                this.A02.A0H(A0M);
                return;
            }
        }
    }
}
