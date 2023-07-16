package com.fbpay.util.boundresources;

import X.AnonymousClass6I0;
import X.AnonymousClass7j5;
import X.C04220Ms;
import X.C104996ci;
import X.C111796oQ;
import X.C113806sA;
import X.C1202479j;
import X.C121207Et;
import X.C128157j3;
import X.C145388kQ;

public class IDxBResourceShape0S1210000_2_I2 extends C1202479j {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxBResourceShape0S1210000_2_I2(C104996ci r1, Object obj, Object obj2, String str, int i, boolean z) {
        super(r1);
        this.A04 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A03 = z;
        this.A02 = str;
    }

    public final C145388kQ A04(C113806sA r4) {
        C111796oQ r2;
        int i = this.A04;
        C04220Ms.A0B(r4, 0);
        Object obj = this.A01;
        if (i != 0) {
            r2 = ((C128157j3) obj).A01;
        } else {
            r2 = ((AnonymousClass7j5) obj).A02;
        }
        return r2.A00(r4, AnonymousClass6I0.A00(this.A02), (C121207Et) this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01af, code lost:
        if (r6 != false) goto L_0x01b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[Catch:{ Exception -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009f A[Catch:{ Exception -> 0x00fc }, LOOP:0: B:36:0x0099->B:38:0x009f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9 A[Catch:{ Exception -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f7 A[Catch:{ Exception -> 0x00fc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7Kx A05(X.AnonymousClass7EC r12) {
        /*
            r11 = this;
            int r0 = r11.A04
            java.lang.String r5 = "PERSISTENT_UP_TO_DATE"
            if (r0 == 0) goto L_0x0112
            java.lang.String r10 = "Required value was null."
            r8 = 0
            X.C04220Ms.A0B(r12, r8)
            java.lang.Object r2 = r12.A01
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl r2 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl) r2
            java.lang.Throwable r0 = X.AnonymousClass7Fb.A02(r2)
            r4 = 0
            if (r0 == 0) goto L_0x001c
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r4, r0)
            return r0
        L_0x001c:
            java.lang.Throwable r1 = r12.A02
            if (r1 != 0) goto L_0x02aa
            if (r2 == 0) goto L_0x0046
            com.facebook.pando.TreeJNI r2 = X.C86164wN.A0I(r2)     // Catch:{ Exception -> 0x00fc }
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData r2 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData) r2     // Catch:{ Exception -> 0x00fc }
            if (r2 == 0) goto L_0x0046
            java.lang.Class<com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData$Components> r1 = com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.Components.class
            java.lang.String r0 = "components"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)     // Catch:{ Exception -> 0x00fc }
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = X.AnonymousClass00J.A0D(r0)     // Catch:{ Exception -> 0x00fc }
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData$Components r1 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.Components) r1     // Catch:{ Exception -> 0x00fc }
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = "PAYFBPayComponentShippingAddress"
            boolean r0 = r1.isFulfilled(r0)     // Catch:{ Exception -> 0x00fc }
            if (r0 != 0) goto L_0x0048
            r7 = 0
            goto L_0x0050
        L_0x0046:
            r7 = r4
            goto L_0x0050
        L_0x0048:
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressComponentImpl> r0 = com.facebook.graphql.impls.ShippingAddressComponentImpl.class
            com.facebook.pando.TreeJNI r7 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x00fc }
            com.facebook.graphql.impls.ShippingAddressComponentImpl r7 = (com.facebook.graphql.impls.ShippingAddressComponentImpl) r7     // Catch:{ Exception -> 0x00fc }
        L_0x0050:
            java.lang.Object r0 = r11.A00     // Catch:{ Exception -> 0x00fc }
            X.7Et r0 = (X.C121207Et) r0     // Catch:{ Exception -> 0x00fc }
            boolean r9 = r11.A03     // Catch:{ Exception -> 0x00fc }
            X.8AN r2 = new X.8AN     // Catch:{ Exception -> 0x00fc }
            r2.<init>()     // Catch:{ Exception -> 0x00fc }
            com.facebookpay.otc.models.OtcInput r0 = r0.A03     // Catch:{ Exception -> 0x00fc }
            r6 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0081
            r3 = 1
            if (r7 == 0) goto L_0x0081
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressComponentImpl$OneTimeShippingAddressV2> r1 = com.facebook.graphql.impls.ShippingAddressComponentImpl.OneTimeShippingAddressV2.class
            java.lang.String r0 = "one_time_shipping_address_v2"
            com.facebook.pando.TreeJNI r1 = r7.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x00fc }
            com.facebook.graphql.impls.ShippingAddressComponentImpl$OneTimeShippingAddressV2 r1 = (com.facebook.graphql.impls.ShippingAddressComponentImpl.OneTimeShippingAddressV2) r1     // Catch:{ Exception -> 0x00fc }
            if (r1 == 0) goto L_0x0081
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressesImpl> r0 = com.facebook.graphql.impls.ShippingAddressesImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x00fc }
            com.facebook.graphql.impls.ShippingAddressesImpl r0 = (com.facebook.graphql.impls.ShippingAddressesImpl) r0     // Catch:{ Exception -> 0x00fc }
            if (r0 == 0) goto L_0x0081
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = X.AnonymousClass7BG.A01(r0, r6)     // Catch:{ Exception -> 0x00fc }
            r2.add(r0)     // Catch:{ Exception -> 0x00fc }
        L_0x0081:
            if (r9 != 0) goto L_0x0085
            if (r3 != 0) goto L_0x00b8
        L_0x0085:
            if (r7 == 0) goto L_0x00b8
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressComponentImpl$ShippingAddresses> r1 = com.facebook.graphql.impls.ShippingAddressComponentImpl.ShippingAddresses.class
            java.lang.String r0 = "shipping_addresses"
            com.google.common.collect.ImmutableList r0 = r7.getTreeList(r0, r1)     // Catch:{ Exception -> 0x00fc }
            if (r0 == 0) goto L_0x00b8
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0w(r0)     // Catch:{ Exception -> 0x00fc }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x00fc }
        L_0x0099:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x00fc }
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r1 = r3.next()     // Catch:{ Exception -> 0x00fc }
            com.facebook.graphql.impls.ShippingAddressComponentImpl$ShippingAddresses r1 = (com.facebook.graphql.impls.ShippingAddressComponentImpl.ShippingAddresses) r1     // Catch:{ Exception -> 0x00fc }
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressesImpl> r0 = com.facebook.graphql.impls.ShippingAddressesImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x00fc }
            com.facebook.graphql.impls.ShippingAddressesImpl r0 = (com.facebook.graphql.impls.ShippingAddressesImpl) r0     // Catch:{ Exception -> 0x00fc }
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = X.AnonymousClass7BG.A01(r0, r8)     // Catch:{ Exception -> 0x00fc }
            r6.add(r0)     // Catch:{ Exception -> 0x00fc }
            goto L_0x0099
        L_0x00b5:
            r2.addAll(r6)     // Catch:{ Exception -> 0x00fc }
        L_0x00b8:
            X.AnonymousClass0OP.A11(r2)     // Catch:{ Exception -> 0x00fc }
            if (r7 == 0) goto L_0x00f7
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressComponentImpl$AddressFormFieldsConfig> r1 = com.facebook.graphql.impls.ShippingAddressComponentImpl.AddressFormFieldsConfig.class
            java.lang.String r0 = "address_form_fields_config"
            com.facebook.pando.TreeJNI r1 = r7.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x00fc }
            com.facebook.graphql.impls.ShippingAddressComponentImpl$AddressFormFieldsConfig r1 = (com.facebook.graphql.impls.ShippingAddressComponentImpl.AddressFormFieldsConfig) r1     // Catch:{ Exception -> 0x00fc }
            if (r1 == 0) goto L_0x00f7
            java.lang.Class<com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl> r0 = com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x00fc }
            com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl r0 = (com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl) r0     // Catch:{ Exception -> 0x00fc }
            X.C04220Ms.A06(r0)     // Catch:{ Exception -> 0x00fc }
            X.6j5 r3 = new X.6j5     // Catch:{ Exception -> 0x00fc }
            r3.<init>(r0, r4, r2)     // Catch:{ Exception -> 0x00fc }
            java.lang.String r2 = r11.A02     // Catch:{ Exception -> 0x00fc }
            boolean r0 = X.C04220Ms.A0I(r2, r5)     // Catch:{ Exception -> 0x00fc }
            if (r0 == 0) goto L_0x00e7
            java.lang.Integer r1 = r12.A00     // Catch:{ Exception -> 0x00fc }
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ Exception -> 0x00fc }
            if (r1 == r0) goto L_0x00f2
        L_0x00e7:
            boolean r0 = X.C04220Ms.A0I(r2, r5)     // Catch:{ Exception -> 0x00fc }
            if (r0 == 0) goto L_0x00f2
            X.7Kx r0 = X.AnonymousClass7Kx.A09(r3)     // Catch:{ Exception -> 0x00fc }
            return r0
        L_0x00f2:
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r3)     // Catch:{ Exception -> 0x00fc }
            return r0
        L_0x00f7:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r10)     // Catch:{ Exception -> 0x00fc }
            throw r0     // Catch:{ Exception -> 0x00fc }
        L_0x00fc:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x010d
            X.6Cc r0 = new X.6Cc
            r0.<init>(r1)
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r4, r0)
            return r0
        L_0x010d:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r10)
            throw r0
        L_0x0112:
            r3 = 0
            X.C04220Ms.A0B(r12, r3)
            java.lang.Object r0 = r12.A01
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl r0 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl) r0
            java.lang.Throwable r1 = X.AnonymousClass7Fb.A02(r0)
            r4 = 0
            if (r1 != 0) goto L_0x02aa
            java.lang.Throwable r1 = r12.A02
            if (r1 != 0) goto L_0x02aa
            if (r0 == 0) goto L_0x029f
            com.facebook.pando.TreeJNI r2 = X.C86164wN.A0I(r0)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData r2 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData) r2     // Catch:{ Exception -> 0x02a4 }
            if (r2 == 0) goto L_0x029f
            java.lang.Class<com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData$Components> r1 = com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.Components.class
            java.lang.String r0 = "components"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)     // Catch:{ Exception -> 0x02a4 }
            if (r0 == 0) goto L_0x029f
            r7 = 0
            java.lang.Object r1 = r0.get(r3)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData$Components r1 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.Components) r1     // Catch:{ Exception -> 0x02a4 }
            if (r1 == 0) goto L_0x029f
            java.lang.String r0 = "PAYFBPayComponentContactInformation"
            boolean r0 = r1.isFulfilled(r0)     // Catch:{ Exception -> 0x02a4 }
            if (r0 == 0) goto L_0x029f
            java.lang.Class<com.facebook.graphql.impls.ContactInformationComponentImpl> r0 = com.facebook.graphql.impls.ContactInformationComponentImpl.class
            com.facebook.pando.TreeJNI r8 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.ContactInformationComponentImpl r8 = (com.facebook.graphql.impls.ContactInformationComponentImpl) r8     // Catch:{ Exception -> 0x02a4 }
            if (r8 == 0) goto L_0x029f
            java.lang.Object r0 = r11.A00     // Catch:{ Exception -> 0x02a4 }
            X.7Et r0 = (X.C121207Et) r0     // Catch:{ Exception -> 0x02a4 }
            com.facebookpay.otc.models.OtcInput r0 = r0.A03     // Catch:{ Exception -> 0x02a4 }
            if (r0 == 0) goto L_0x015d
            r7 = 1
        L_0x015d:
            boolean r6 = r11.A03     // Catch:{ Exception -> 0x02a4 }
            if (r7 == 0) goto L_0x0170
            java.lang.String r0 = "one_time_payer_name"
        L_0x0163:
            java.lang.String r2 = r8.getStringValue(r0)     // Catch:{ Exception -> 0x02a4 }
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()     // Catch:{ Exception -> 0x02a4 }
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()     // Catch:{ Exception -> 0x02a4 }
            goto L_0x0173
        L_0x0170:
            java.lang.String r0 = "payer_name"
            goto L_0x0163
        L_0x0173:
            if (r7 == 0) goto L_0x01b1
            java.lang.Class<com.facebook.graphql.impls.ContactInformationComponentImpl$OneTimeEmail> r1 = com.facebook.graphql.impls.ContactInformationComponentImpl.OneTimeEmail.class
            java.lang.String r0 = "one_time_email"
            com.facebook.pando.TreeJNI r1 = r8.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.ContactInformationComponentImpl$OneTimeEmail r1 = (com.facebook.graphql.impls.ContactInformationComponentImpl.OneTimeEmail) r1     // Catch:{ Exception -> 0x02a4 }
            if (r1 == 0) goto L_0x0192
            java.lang.Class<com.facebook.graphql.impls.FBPayEmailImpl> r0 = com.facebook.graphql.impls.FBPayEmailImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.FBPayEmailImpl r0 = (com.facebook.graphql.impls.FBPayEmailImpl) r0     // Catch:{ Exception -> 0x02a4 }
            if (r0 == 0) goto L_0x0192
            X.6uv r0 = X.C116846xe.A00(r0)     // Catch:{ Exception -> 0x02a4 }
            r10.add(r0)     // Catch:{ Exception -> 0x02a4 }
        L_0x0192:
            java.lang.Class<com.facebook.graphql.impls.ContactInformationComponentImpl$OneTimePhone> r1 = com.facebook.graphql.impls.ContactInformationComponentImpl.OneTimePhone.class
            java.lang.String r0 = "one_time_phone"
            com.facebook.pando.TreeJNI r1 = r8.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.ContactInformationComponentImpl$OneTimePhone r1 = (com.facebook.graphql.impls.ContactInformationComponentImpl.OneTimePhone) r1     // Catch:{ Exception -> 0x02a4 }
            if (r1 == 0) goto L_0x01af
            java.lang.Class<com.facebook.graphql.impls.FBPayPhoneNumberImpl> r0 = com.facebook.graphql.impls.FBPayPhoneNumberImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.FBPayPhoneNumberImpl r0 = (com.facebook.graphql.impls.FBPayPhoneNumberImpl) r0     // Catch:{ Exception -> 0x02a4 }
            if (r0 == 0) goto L_0x01af
            X.6uq r0 = X.C116846xe.A01(r0)     // Catch:{ Exception -> 0x02a4 }
            r3.add(r0)     // Catch:{ Exception -> 0x02a4 }
        L_0x01af:
            if (r6 == 0) goto L_0x021b
        L_0x01b1:
            java.lang.Class<com.facebook.graphql.impls.ContactInformationComponentImpl$Emails> r1 = com.facebook.graphql.impls.ContactInformationComponentImpl.Emails.class
            java.lang.String r0 = "emails"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r8, r1, r0)     // Catch:{ Exception -> 0x02a4 }
            r6 = 10
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0x(r0, r6)     // Catch:{ Exception -> 0x02a4 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ Exception -> 0x02a4 }
        L_0x01c3:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x02a4 }
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r1 = r7.next()     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.ContactInformationComponentImpl$Emails r1 = (com.facebook.graphql.impls.ContactInformationComponentImpl.Emails) r1     // Catch:{ Exception -> 0x02a4 }
            java.lang.Class<com.facebook.graphql.impls.FBPayEmailImpl> r0 = com.facebook.graphql.impls.FBPayEmailImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.FBPayEmailImpl r0 = (com.facebook.graphql.impls.FBPayEmailImpl) r0     // Catch:{ Exception -> 0x02a4 }
            X.C04220Ms.A06(r0)     // Catch:{ Exception -> 0x02a4 }
            X.6uv r0 = X.C116846xe.A00(r0)     // Catch:{ Exception -> 0x02a4 }
            r9.add(r0)     // Catch:{ Exception -> 0x02a4 }
            goto L_0x01c3
        L_0x01e2:
            r10.addAll(r9)     // Catch:{ Exception -> 0x02a4 }
            java.lang.Class<com.facebook.graphql.impls.ContactInformationComponentImpl$PhoneNumbers> r1 = com.facebook.graphql.impls.ContactInformationComponentImpl.PhoneNumbers.class
            r0 = 205(0xcd, float:2.87E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)     // Catch:{ Exception -> 0x02a4 }
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r8, r1, r0)     // Catch:{ Exception -> 0x02a4 }
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0x(r0, r6)     // Catch:{ Exception -> 0x02a4 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Exception -> 0x02a4 }
        L_0x01f9:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x02a4 }
            if (r0 == 0) goto L_0x0218
            java.lang.Object r1 = r6.next()     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.ContactInformationComponentImpl$PhoneNumbers r1 = (com.facebook.graphql.impls.ContactInformationComponentImpl.PhoneNumbers) r1     // Catch:{ Exception -> 0x02a4 }
            java.lang.Class<com.facebook.graphql.impls.FBPayPhoneNumberImpl> r0 = com.facebook.graphql.impls.FBPayPhoneNumberImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.FBPayPhoneNumberImpl r0 = (com.facebook.graphql.impls.FBPayPhoneNumberImpl) r0     // Catch:{ Exception -> 0x02a4 }
            X.C04220Ms.A06(r0)     // Catch:{ Exception -> 0x02a4 }
            X.6uq r0 = X.C116846xe.A01(r0)     // Catch:{ Exception -> 0x02a4 }
            r7.add(r0)     // Catch:{ Exception -> 0x02a4 }
            goto L_0x01f9
        L_0x0218:
            r3.addAll(r7)     // Catch:{ Exception -> 0x02a4 }
        L_0x021b:
            java.lang.Class<com.facebook.graphql.impls.ContactInformationComponentImpl$FullNameFieldConfig> r1 = com.facebook.graphql.impls.ContactInformationComponentImpl.FullNameFieldConfig.class
            java.lang.String r0 = "full_name_field_config"
            com.facebook.pando.TreeJNI r0 = r8.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.ContactInformationComponentImpl$FullNameFieldConfig r0 = (com.facebook.graphql.impls.ContactInformationComponentImpl.FullNameFieldConfig) r0     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = "Required value was null."
            if (r0 == 0) goto L_0x029a
            java.lang.Class<com.facebook.graphql.impls.FBPayFormFieldImpl> r7 = com.facebook.graphql.impls.FBPayFormFieldImpl.class
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r7)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.FBPayFormFieldImpl r0 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r0     // Catch:{ Exception -> 0x02a4 }
            X.C04220Ms.A06(r0)     // Catch:{ Exception -> 0x02a4 }
            X.6tj r6 = new X.6tj     // Catch:{ Exception -> 0x02a4 }
            r6.<init>(r0, r2)     // Catch:{ Exception -> 0x02a4 }
            java.lang.Class<com.facebook.graphql.impls.ContactInformationComponentImpl$EmailFormFieldConfig> r1 = com.facebook.graphql.impls.ContactInformationComponentImpl.EmailFormFieldConfig.class
            java.lang.String r0 = "email_form_field_config"
            com.facebook.pando.TreeJNI r0 = r8.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.ContactInformationComponentImpl$EmailFormFieldConfig r0 = (com.facebook.graphql.impls.ContactInformationComponentImpl.EmailFormFieldConfig) r0     // Catch:{ Exception -> 0x02a4 }
            if (r0 == 0) goto L_0x0295
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r7)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.FBPayFormFieldImpl r0 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r0     // Catch:{ Exception -> 0x02a4 }
            X.C04220Ms.A06(r0)     // Catch:{ Exception -> 0x02a4 }
            X.6ua r2 = new X.6ua     // Catch:{ Exception -> 0x02a4 }
            r2.<init>(r0, r4, r4, r10)     // Catch:{ Exception -> 0x02a4 }
            java.lang.Class<com.facebook.graphql.impls.ContactInformationComponentImpl$PhoneFormFieldConfig> r1 = com.facebook.graphql.impls.ContactInformationComponentImpl.PhoneFormFieldConfig.class
            java.lang.String r0 = "phone_form_field_config"
            com.facebook.pando.TreeJNI r0 = r8.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.ContactInformationComponentImpl$PhoneFormFieldConfig r0 = (com.facebook.graphql.impls.ContactInformationComponentImpl.PhoneFormFieldConfig) r0     // Catch:{ Exception -> 0x02a4 }
            if (r0 == 0) goto L_0x0290
            com.facebook.pando.TreeJNI r1 = r0.reinterpret(r7)     // Catch:{ Exception -> 0x02a4 }
            com.facebook.graphql.impls.FBPayFormFieldImpl r1 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r1     // Catch:{ Exception -> 0x02a4 }
            X.C04220Ms.A06(r1)     // Catch:{ Exception -> 0x02a4 }
            X.6ub r0 = new X.6ub     // Catch:{ Exception -> 0x02a4 }
            r0.<init>(r1, r4, r4, r3)     // Catch:{ Exception -> 0x02a4 }
            X.6uC r3 = new X.6uC     // Catch:{ Exception -> 0x02a4 }
            r3.<init>(r2, r6, r0)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r2 = r11.A02     // Catch:{ Exception -> 0x02a4 }
            boolean r0 = X.C04220Ms.A0I(r2, r5)     // Catch:{ Exception -> 0x02a4 }
            if (r0 == 0) goto L_0x0280
            java.lang.Integer r1 = r12.A00     // Catch:{ Exception -> 0x02a4 }
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ Exception -> 0x02a4 }
            if (r1 == r0) goto L_0x028b
        L_0x0280:
            boolean r0 = X.C04220Ms.A0I(r2, r5)     // Catch:{ Exception -> 0x02a4 }
            if (r0 == 0) goto L_0x028b
            X.7Kx r0 = X.AnonymousClass7Kx.A09(r3)     // Catch:{ Exception -> 0x02a4 }
            return r0
        L_0x028b:
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r3)     // Catch:{ Exception -> 0x02a4 }
            return r0
        L_0x0290:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)     // Catch:{ Exception -> 0x02a4 }
            throw r0     // Catch:{ Exception -> 0x02a4 }
        L_0x0295:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)     // Catch:{ Exception -> 0x02a4 }
            throw r0     // Catch:{ Exception -> 0x02a4 }
        L_0x029a:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)     // Catch:{ Exception -> 0x02a4 }
            throw r0     // Catch:{ Exception -> 0x02a4 }
        L_0x029f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()     // Catch:{ Exception -> 0x02a4 }
            throw r0     // Catch:{ Exception -> 0x02a4 }
        L_0x02a4:
            r0 = move-exception
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r4, r0)
            return r0
        L_0x02aa:
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fbpay.util.boundresources.IDxBResourceShape0S1210000_2_I2.A05(X.7EC):X.7Kx");
    }
}
