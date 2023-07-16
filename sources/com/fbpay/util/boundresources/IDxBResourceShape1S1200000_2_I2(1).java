package com.fbpay.util.boundresources;

import X.AnonymousClass6BW;
import X.AnonymousClass6I0;
import X.C04220Ms;
import X.C104996ci;
import X.C108226i1;
import X.C111796oQ;
import X.C113806sA;
import X.C1198377e;
import X.C1202479j;
import X.C121157Ek;
import X.C121207Et;
import X.C128167j4;
import X.C145388kQ;
import X.C63233h2;
import X.C67463zb;
import X.C86114wI;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFunctionShape361S0100000_1_I2;
import com.instagram.fbpay.auth.graphql.IgPaymentsPINDeleteMutationResponseImpl;

public class IDxBResourceShape1S1200000_2_I2 extends C1202479j {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxBResourceShape1S1200000_2_I2(C104996ci r1, Object obj, Object obj2, String str, int i) {
        super(r1);
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj;
        this.A02 = str;
    }

    public final C145388kQ A04(C113806sA r18) {
        C111796oQ r3;
        C113806sA r2 = r18;
        switch (this.A03) {
            case 0:
                C04220Ms.A0B(r2, 0);
                r3 = ((C128167j4) this.A01).A02;
                break;
            case 1:
                C04220Ms.A0B(r2, 0);
                r3 = ((C1198377e) this.A01).A01;
                break;
            default:
                C108226i1 r32 = ((C121157Ek) this.A00).A02;
                String str = this.A02;
                C67463zb A002 = C67463zb.A00();
                C67463zb A003 = C67463zb.A00();
                GQLCallInputCInputShape1S0000000 A0K = C86114wI.A0K();
                GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
                A004.A0F(str, "sensitive_string_value");
                A0K.A0B(A004, "password");
                A002.A02(A0K, "input");
                return AnonymousClass6BW.A00(r2, r32.A00, new PandoGraphQLRequest(C63233h2.A01(), "IgPaymentsPINDeleteMutation", A002.getParamsCopy(), A003.getParamsCopy(), IgPaymentsPINDeleteMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 8, "input", "payment_pin_delete"), new IDxFunctionShape361S0100000_1_I2(r32));
        }
        return r3.A00(r2, AnonymousClass6I0.A00(this.A02), (C121207Et) this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0221, code lost:
        if (r8.getBooleanValue("should_order_new_options_first") == false) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0233, code lost:
        if (r8.getBooleanValue("should_de_prioritize_credit_cards") == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f9, code lost:
        if (r1 != false) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c0 A[Catch:{ Exception -> 0x00c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7Kx A05(X.AnonymousClass7EC r21) {
        /*
            r20 = this;
            r5 = r20
            int r0 = r5.A03
            r4 = r21
            switch(r0) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x0019;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Throwable r0 = r4.A02
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = r5.A02
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
            return r0
        L_0x0014:
            X.7Kx r0 = X.AnonymousClass7Kx.A0C(r0)
            return r0
        L_0x0019:
            r3 = 0
            X.C04220Ms.A0B(r4, r3)
            java.lang.Object r1 = r4.A01
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl r1 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl) r1
            java.lang.Throwable r0 = X.AnonymousClass7Fb.A02(r1)
            r12 = 0
            if (r0 != 0) goto L_0x0280
            java.lang.Throwable r0 = r4.A02
            if (r0 != 0) goto L_0x0280
            if (r1 == 0) goto L_0x005a
            com.facebook.pando.TreeJNI r2 = X.C86164wN.A0I(r1)     // Catch:{ Exception -> 0x00c5 }
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData r2 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData) r2     // Catch:{ Exception -> 0x00c5 }
            if (r2 == 0) goto L_0x005a
            java.lang.Class<com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData$Components> r1 = com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.Components.class
            java.lang.String r0 = "components"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x005a
            java.lang.Object r1 = r0.get(r3)     // Catch:{ Exception -> 0x00c5 }
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData$Components r1 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.Components) r1     // Catch:{ Exception -> 0x00c5 }
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = "PAYFBPayComponentDisclaimerWithSheet"
            boolean r0 = r1.isFulfilled(r0)     // Catch:{ Exception -> 0x00c5 }
            if (r0 != 0) goto L_0x0051
            goto L_0x005c
        L_0x0051:
            java.lang.Class<com.facebook.graphql.impls.TermsComponentImpl> r0 = com.facebook.graphql.impls.TermsComponentImpl.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x00c5 }
            com.facebook.graphql.impls.TermsComponentImpl r2 = (com.facebook.graphql.impls.TermsComponentImpl) r2     // Catch:{ Exception -> 0x00c5 }
            goto L_0x005d
        L_0x005a:
            r2 = r12
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            java.lang.String r3 = "Required value was null."
            if (r2 == 0) goto L_0x00c0
            java.lang.String r0 = "body_text"
            java.lang.String r0 = r2.getStringValue(r0)     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x00bb
            java.lang.Class<com.facebook.graphql.impls.TermsComponentImpl$CtaText> r1 = com.facebook.graphql.impls.TermsComponentImpl.CtaText.class
            java.lang.String r0 = "cta_text"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x00c5 }
            com.facebook.graphql.impls.TermsComponentImpl$CtaText r0 = (com.facebook.graphql.impls.TermsComponentImpl.CtaText) r0     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x00b6
            java.lang.Class<com.facebook.graphql.impls.TermsComponentImpl$PaymentsTerms> r1 = com.facebook.graphql.impls.TermsComponentImpl.PaymentsTerms.class
            java.lang.String r0 = "payments_terms"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x00c5 }
            com.facebook.graphql.impls.TermsComponentImpl$PaymentsTerms r0 = (com.facebook.graphql.impls.TermsComponentImpl.PaymentsTerms) r0     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x00b1
            java.lang.Class<com.facebook.graphql.impls.TermsComponentImpl$PrivacyPolicyTerms> r1 = com.facebook.graphql.impls.TermsComponentImpl.PrivacyPolicyTerms.class
            java.lang.String r0 = "privacy_policy_terms"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x00c5 }
            com.facebook.graphql.impls.TermsComponentImpl$PrivacyPolicyTerms r0 = (com.facebook.graphql.impls.TermsComponentImpl.PrivacyPolicyTerms) r0     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = "sheet_body_text"
            com.google.common.collect.ImmutableList r0 = r2.getStringList(r0)     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = "sheet_header"
            java.lang.String r0 = r2.getStringValue(r0)     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x00a2
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r2)     // Catch:{ Exception -> 0x00c5 }
            return r0
        L_0x00a2:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)     // Catch:{ Exception -> 0x00c5 }
            throw r0     // Catch:{ Exception -> 0x00c5 }
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)     // Catch:{ Exception -> 0x00c5 }
            throw r0     // Catch:{ Exception -> 0x00c5 }
        L_0x00ac:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)     // Catch:{ Exception -> 0x00c5 }
            throw r0     // Catch:{ Exception -> 0x00c5 }
        L_0x00b1:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)     // Catch:{ Exception -> 0x00c5 }
            throw r0     // Catch:{ Exception -> 0x00c5 }
        L_0x00b6:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)     // Catch:{ Exception -> 0x00c5 }
            throw r0     // Catch:{ Exception -> 0x00c5 }
        L_0x00bb:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)     // Catch:{ Exception -> 0x00c5 }
            throw r0     // Catch:{ Exception -> 0x00c5 }
        L_0x00c0:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)     // Catch:{ Exception -> 0x00c5 }
            throw r0     // Catch:{ Exception -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r12, r0)
            return r0
        L_0x00cb:
            java.lang.String r3 = "PERSISTENT_UP_TO_DATE"
            r6 = 0
            X.C04220Ms.A0B(r4, r6)
            java.lang.Object r1 = r5.A01
            X.7j4 r1 = (X.C128167j4) r1
            java.lang.Object r7 = r5.A00
            X.7Et r7 = (X.C121207Et) r7
            X.79R r0 = X.AnonymousClass6IY.A00(r7)
            X.7IT r2 = r1.A01
            X.56q r0 = X.AnonymousClass7IT.A00(r2, r0)
            X.7Kx r0 = X.C86104wH.A0R(r0)
            r12 = 0
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r0 = r0.A01
            X.79r r0 = (X.C1203179r) r0
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x00fb
            boolean r1 = X.AnonymousClass8bQ.A0n(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00fc
        L_0x00fb:
            r0 = 1
        L_0x00fc:
            java.lang.String r9 = "Required value was null."
            if (r0 != 0) goto L_0x0120
            java.lang.String r0 = r7.A09
            if (r0 == 0) goto L_0x010a
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 == 0) goto L_0x0120
        L_0x010a:
            X.79R r0 = X.AnonymousClass6IY.A00(r7)
            X.56q r0 = X.AnonymousClass7IT.A00(r2, r0)
            java.lang.Object r0 = r0.A08()
            if (r0 == 0) goto L_0x011b
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            return r0
        L_0x011b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0120:
            java.lang.Object r1 = r4.A01
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl r1 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl) r1
            java.lang.Throwable r0 = X.AnonymousClass7Fb.A02(r1)
            if (r0 != 0) goto L_0x0280
            java.lang.Throwable r0 = r4.A02
            if (r0 != 0) goto L_0x0280
            if (r1 == 0) goto L_0x0260
            com.facebook.pando.TreeJNI r2 = X.C86164wN.A0I(r1)     // Catch:{ Exception -> 0x026a }
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData r2 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData) r2     // Catch:{ Exception -> 0x026a }
            if (r2 == 0) goto L_0x0260
            java.lang.Class<com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData$Components> r1 = com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.Components.class
            java.lang.String r0 = "components"
            com.google.common.collect.ImmutableList r0 = r2.getTreeList(r0, r1)     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x0260
            java.lang.Object r1 = r0.get(r6)     // Catch:{ Exception -> 0x026a }
            com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl$FetchFbpayComponentData$Components r1 = (com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.Components) r1     // Catch:{ Exception -> 0x026a }
            if (r1 == 0) goto L_0x0260
            java.lang.String r0 = "PAYFBPayComponentPaymentMethod"
            boolean r0 = r1.isFulfilled(r0)     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x0260
            java.lang.Class<com.facebook.graphql.impls.PaymentMethodComponentImpl> r0 = com.facebook.graphql.impls.PaymentMethodComponentImpl.class
            com.facebook.pando.TreeJNI r8 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x026a }
            com.facebook.graphql.impls.PaymentMethodComponentImpl r8 = (com.facebook.graphql.impls.PaymentMethodComponentImpl) r8     // Catch:{ Exception -> 0x026a }
            if (r8 == 0) goto L_0x0260
            java.lang.Class<com.facebook.graphql.impls.PaymentMethodComponentImpl$AvailablePaymentCredentials> r1 = com.facebook.graphql.impls.PaymentMethodComponentImpl.AvailablePaymentCredentials.class
            java.lang.String r0 = "available_payment_credentials"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r8, r1, r0)     // Catch:{ Exception -> 0x026a }
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()     // Catch:{ Exception -> 0x026a }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x026a }
        L_0x016c:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x0186
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x026a }
            com.facebook.graphql.impls.PaymentMethodComponentImpl$AvailablePaymentCredentials r1 = (com.facebook.graphql.impls.PaymentMethodComponentImpl.AvailablePaymentCredentials) r1     // Catch:{ Exception -> 0x026a }
            java.lang.Class<com.facebook.graphql.impls.PaymentCredentialImpl> r0 = com.facebook.graphql.impls.PaymentCredentialImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x026a }
            com.facebook.graphql.impls.PaymentCredentialImpl r0 = (com.facebook.graphql.impls.PaymentCredentialImpl) r0     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x016c
            r6.add(r0)     // Catch:{ Exception -> 0x026a }
            goto L_0x016c
        L_0x0186:
            java.util.List r14 = X.C128167j4.A04(r6)     // Catch:{ Exception -> 0x026a }
            java.lang.Class<com.facebook.graphql.impls.PaymentMethodComponentImpl$UnsupportedPaymentCredentials> r1 = com.facebook.graphql.impls.PaymentMethodComponentImpl.UnsupportedPaymentCredentials.class
            java.lang.String r0 = "unsupported_payment_credentials"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r8, r1, r0)     // Catch:{ Exception -> 0x026a }
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()     // Catch:{ Exception -> 0x026a }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x026a }
        L_0x019a:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x026a }
            com.facebook.graphql.impls.PaymentMethodComponentImpl$UnsupportedPaymentCredentials r1 = (com.facebook.graphql.impls.PaymentMethodComponentImpl.UnsupportedPaymentCredentials) r1     // Catch:{ Exception -> 0x026a }
            java.lang.Class<com.facebook.graphql.impls.PaymentCredentialImpl> r0 = com.facebook.graphql.impls.PaymentCredentialImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x026a }
            com.facebook.graphql.impls.PaymentCredentialImpl r0 = (com.facebook.graphql.impls.PaymentCredentialImpl) r0     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x019a
            r6.add(r0)     // Catch:{ Exception -> 0x026a }
            goto L_0x019a
        L_0x01b4:
            java.util.List r15 = X.C128167j4.A04(r6)     // Catch:{ Exception -> 0x026a }
            java.lang.Class<com.facebook.graphql.impls.PaymentMethodComponentImpl$NewPaymentCredentialOptions> r1 = com.facebook.graphql.impls.PaymentMethodComponentImpl.NewPaymentCredentialOptions.class
            java.lang.String r0 = "new_payment_credential_options"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r8, r1, r0)     // Catch:{ Exception -> 0x026a }
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()     // Catch:{ Exception -> 0x026a }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x026a }
        L_0x01c8:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x01da
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x026a }
            com.facebook.graphql.impls.PaymentMethodComponentImpl$NewPaymentCredentialOptions r0 = (com.facebook.graphql.impls.PaymentMethodComponentImpl.NewPaymentCredentialOptions) r0     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x01c8
            r6.add(r0)     // Catch:{ Exception -> 0x026a }
            goto L_0x01c8
        L_0x01da:
            java.lang.Class<com.facebook.graphql.impls.PaymentMethodComponentImpl$ApmOptions> r1 = com.facebook.graphql.impls.PaymentMethodComponentImpl.ApmOptions.class
            java.lang.String r0 = "apm_options"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r8, r1, r0)     // Catch:{ Exception -> 0x026a }
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()     // Catch:{ Exception -> 0x026a }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x026a }
        L_0x01ea:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x01fc
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x026a }
            com.facebook.graphql.impls.PaymentMethodComponentImpl$ApmOptions r0 = (com.facebook.graphql.impls.PaymentMethodComponentImpl.ApmOptions) r0     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x01ea
            r2.add(r0)     // Catch:{ Exception -> 0x026a }
            goto L_0x01ea
        L_0x01fc:
            java.lang.Class<com.facebook.graphql.impls.PaymentMethodComponentImpl$AddressFormFieldsConfig> r1 = com.facebook.graphql.impls.PaymentMethodComponentImpl.AddressFormFieldsConfig.class
            java.lang.String r0 = "address_form_fields_config"
            com.facebook.pando.TreeJNI r1 = r8.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x026a }
            com.facebook.graphql.impls.PaymentMethodComponentImpl$AddressFormFieldsConfig r1 = (com.facebook.graphql.impls.PaymentMethodComponentImpl.AddressFormFieldsConfig) r1     // Catch:{ Exception -> 0x026a }
            if (r1 == 0) goto L_0x0265
            java.lang.Class<com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl> r0 = com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl.class
            com.facebook.pando.TreeJNI r11 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x026a }
            com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl r11 = (com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl) r11     // Catch:{ Exception -> 0x026a }
            X.C04220Ms.A06(r11)     // Catch:{ Exception -> 0x026a }
            java.lang.String r1 = "should_order_new_options_first"
            boolean r0 = r8.hasFieldValue(r1)     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x0223
            boolean r0 = r8.getBooleanValue(r1)     // Catch:{ Exception -> 0x026a }
            r18 = 1
            if (r0 != 0) goto L_0x0225
        L_0x0223:
            r18 = 0
        L_0x0225:
            java.lang.String r1 = "should_de_prioritize_credit_cards"
            boolean r0 = r8.hasFieldValue(r1)     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x0235
            boolean r0 = r8.getBooleanValue(r1)     // Catch:{ Exception -> 0x026a }
            r19 = 1
            if (r0 != 0) goto L_0x0237
        L_0x0235:
            r19 = 0
        L_0x0237:
            java.lang.String r13 = r7.A09     // Catch:{ Exception -> 0x026a }
            X.79r r10 = new X.79r     // Catch:{ Exception -> 0x026a }
            r16 = r6
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x026a }
            java.lang.String r2 = r5.A02     // Catch:{ Exception -> 0x026a }
            boolean r0 = X.C04220Ms.A0I(r2, r3)     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x0250
            java.lang.Integer r1 = r4.A00     // Catch:{ Exception -> 0x026a }
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ Exception -> 0x026a }
            if (r1 == r0) goto L_0x025b
        L_0x0250:
            boolean r0 = X.C04220Ms.A0I(r2, r3)     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x025b
            X.7Kx r0 = X.AnonymousClass7Kx.A09(r10)     // Catch:{ Exception -> 0x026a }
            return r0
        L_0x025b:
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r10)     // Catch:{ Exception -> 0x026a }
            return r0
        L_0x0260:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)     // Catch:{ Exception -> 0x026a }
            goto L_0x0269
        L_0x0265:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)     // Catch:{ Exception -> 0x026a }
        L_0x0269:
            throw r0     // Catch:{ Exception -> 0x026a }
        L_0x026a:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x027b
            X.6Cc r0 = new X.6Cc
            r0.<init>(r1)
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r12, r0)
            return r0
        L_0x027b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0280:
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r12, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fbpay.util.boundresources.IDxBResourceShape1S1200000_2_I2.A05(X.7EC):X.7Kx");
    }
}
