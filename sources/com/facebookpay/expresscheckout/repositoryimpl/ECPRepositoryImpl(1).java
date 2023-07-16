package com.facebookpay.expresscheckout.repositoryimpl;

import X.AnonymousClass066;
import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass5k7;
import X.AnonymousClass68F;
import X.AnonymousClass68M;
import X.AnonymousClass77W;
import X.AnonymousClass79R;
import X.AnonymousClass7IT;
import X.AnonymousClass7JB;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.C03480Iw;
import X.C04220Ms;
import X.C04530Oa;
import X.C104856cU;
import X.C108866j5;
import X.C110336lW;
import X.C111796oQ;
import X.C113366rH;
import X.C1202479j;
import X.C1203179r;
import X.C121277Fh;
import X.C128157j3;
import X.C128167j4;
import X.C138158Gk;
import X.C138168Gl;
import X.C138178Gm;
import X.C18190wL;
import X.C18200wM;
import X.C18250wR;
import X.C61953Wm;
import X.C86104wH;
import X.C86144wL;
import X.C880756q;
import X.C880856r;
import X.M5J;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.redex.IDxFunctionShape152S0200000_2_I2;
import com.facebook.redex.IDxObserverShape4S2100000_2_I2;
import com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI;
import com.facebookpay.expresscheckout.models.DefaultCreditCardFields;
import com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.fbpay.logging.LoggingPolicy;
import java.util.ArrayList;
import java.util.Set;

public final class ECPRepositoryImpl {
    public C880856r A00 = C880856r.A03();
    public C110336lW A01;
    public C1202479j A02;
    public ArrayList A03 = AnonymousClass0wJ.A0v();
    public boolean A04;
    public final M5J A05;
    public final C880756q A06;
    public final C111796oQ A07 = new C111796oQ();
    public final C104856cU A08 = new C104856cU();
    public final AnonymousClass77W A09 = new AnonymousClass77W();
    public final C113366rH A0A = new C113366rH();
    public final C04530Oa A0B = AnonymousClass0OY.A02(C138158Gk.A00);
    public final C04530Oa A0C = AnonymousClass0OY.A02(C138168Gl.A00);
    public final C04530Oa A0D = AnonymousClass0OY.A02(C138178Gm.A00);
    public final ECPCheckoutSetupMutationAPI A0E = new ECPCheckoutSetupMutationAPI();

    public final M5J A03(String str, String str2, String str3, String str4) {
        C04220Ms.A0B(str2, 1);
        this.A01 = null;
        AnonymousClass7Kx.A0J(this.A06, (Object) null);
        this.A01 = null;
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        A002.A0F(str, C61953Wm.A00());
        A002.A0F(str2, "product_id");
        A002.A0F(str3, "receiver_id");
        A002.A0F(str4, "product_item_id");
        M5J A003 = AnonymousClass5k7.A00(new IDxFunctionShape152S0200000_2_I2(7, A002, this), AnonymousClass7Kz.A0C());
        C04220Ms.A06(A003);
        C121277Fh.A01((AnonymousClass066) null, A003, new IDxObserverShape4S2100000_2_I2(this, str2, str3, 0));
        return A003;
    }

    public final DefaultPaymentMethodFields A04(String str) {
        PaymentMethod paymentMethod;
        CreditCard creditCard;
        C04220Ms.A0B(str, 0);
        DefaultCreditCardFields defaultCreditCardFields = null;
        AnonymousClass7Kx A062 = ((C128167j4) this.A0C.getValue()).A06(new AnonymousClass79R((OtcInput) null, str));
        if (A062 == null || (paymentMethod = (PaymentMethod) A062.A01) == null) {
            return null;
        }
        if ((paymentMethod instanceof CreditCard) && (creditCard = (CreditCard) paymentMethod) != null) {
            defaultCreditCardFields = new DefaultCreditCardFields(creditCard.A00(), C86144wL.A0s(creditCard.A02, "last_four_digits"));
        }
        return new DefaultPaymentMethodFields(defaultCreditCardFields);
    }

    public final C110336lW A05(String str, String str2) {
        C04220Ms.A0B(str, 0);
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        return this.A0A.A00(str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(com.fbpay.logging.LoggingPolicy r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List r21, X.C146958n9 r22) {
        /*
            r16 = this;
            r10 = 0
            r3 = 21
            r4 = r22
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r4)
            r5 = r16
            if (r0 == 0) goto L_0x005c
            r13 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r13 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r13
            int r2 = r13.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r13.A00 = r2
        L_0x001b:
            java.lang.Object r2 = r13.A01
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r13.A00
            r14 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r14) goto L_0x0061
            X.AnonymousClass0OU.A00(r2)
        L_0x0029:
            X.7Kx r2 = (X.AnonymousClass7Kx) r2
            r1 = 12
            com.facebook.redex.IDxFunctionShape326S0100000_2_I2 r0 = new com.facebook.redex.IDxFunctionShape326S0100000_2_I2
            r0.<init>((java.lang.Object) r2, (int) r1)
            X.7Kx r1 = X.AnonymousClass7Kx.A02(r0, r2)
            return r1
        L_0x0037:
            X.AnonymousClass0OU.A00(r2)
            X.6rH r0 = r5.A0A
            r8 = r19
            r9 = r20
            X.6lW r0 = r0.A00(r8, r9)
            if (r0 == 0) goto L_0x004b
            X.7Kx r1 = X.AnonymousClass7Kx.A0A(r0)
            return r1
        L_0x004b:
            r13.A00 = r14
            r6 = r17
            r7 = r18
            r12 = r21
            r11 = r10
            r15 = r14
            java.lang.Object r2 = A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r2 != r1) goto L_0x0029
            return r1
        L_0x005c:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r13 = X.C86114wI.A0x(r5, r4, r3)
            goto L_0x001b
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A07(com.fbpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (r1 == r3) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.List r21, X.C146958n9 r22) {
        /*
            r16 = this;
            r6 = 0
            r3 = 22
            r4 = r22
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r4)
            r5 = r16
            if (r0 == 0) goto L_0x007f
            r13 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r13 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r13
            int r2 = r13.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007f
            int r2 = r2 - r1
            r13.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r13.A01
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r13.A00
            r14 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r14) goto L_0x00e3
            X.AnonymousClass0OU.A00(r1)
        L_0x0029:
            X.7Kx r1 = (X.AnonymousClass7Kx) r1
            X.7Kx r3 = X.AnonymousClass7Kx.A09(r6)
            boolean r0 = X.AnonymousClass7Kx.A0R(r1)
            if (r0 == 0) goto L_0x003a
            java.lang.String r5 = "Required value was null."
            if (r1 == 0) goto L_0x00c8
            goto L_0x0084
        L_0x003a:
            boolean r0 = X.AnonymousClass7Kx.A0O(r1)
            if (r0 == 0) goto L_0x007e
            X.7Kx r3 = X.AnonymousClass7Kx.A0B(r6, r6)
            return r3
        L_0x0045:
            X.AnonymousClass0OU.A00(r1)
            r8 = r18
            r10 = r19
            r9 = r20
            if (r20 == 0) goto L_0x0070
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0070
            X.77W r0 = r5.A09
            X.6ly r2 = r0.A00(r8, r9)
            if (r2 == 0) goto L_0x0070
            com.facebook.graphql.impls.FBPayECPAvailabilityImpl r1 = r2.A01
            java.lang.String r0 = "is_ecp_available"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 == 0) goto L_0x00e8
            if (r19 == 0) goto L_0x0070
            int r0 = r10.length()
            if (r0 != 0) goto L_0x00e8
        L_0x0070:
            r13.A00 = r14
            r7 = r17
            r12 = r21
            r11 = r6
            r15 = r14
            java.lang.Object r1 = A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r3) goto L_0x0029
        L_0x007e:
            return r3
        L_0x007f:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r13 = X.C86114wI.A0x(r5, r4, r3)
            goto L_0x001b
        L_0x0084:
            java.lang.Object r4 = r1.A01     // Catch:{ Exception -> 0x00cd }
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl r4 = (com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl) r4     // Catch:{ Exception -> 0x00cd }
            if (r4 == 0) goto L_0x00c8
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r0 = r4.A00()     // Catch:{ Exception -> 0x00cd }
            if (r0 == 0) goto L_0x00c8
            X.6ly r3 = X.C122157Kv.A0B(r0)     // Catch:{ Exception -> 0x00cd }
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r2 = r4.A00()     // Catch:{ Exception -> 0x00cd }
            if (r2 == 0) goto L_0x00c6
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$TransactionInfo> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.TransactionInfo.class
            java.lang.String r0 = "transaction_info"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)     // Catch:{ Exception -> 0x00cd }
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$TransactionInfo r1 = (com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.TransactionInfo) r1     // Catch:{ Exception -> 0x00cd }
            if (r1 == 0) goto L_0x00c6
            java.lang.Class<com.facebook.graphql.impls.FBPayTransactionInfoImpl> r0 = com.facebook.graphql.impls.FBPayTransactionInfoImpl.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)     // Catch:{ Exception -> 0x00cd }
            com.facebook.graphql.impls.FBPayTransactionInfoImpl r2 = (com.facebook.graphql.impls.FBPayTransactionInfoImpl) r2     // Catch:{ Exception -> 0x00cd }
        L_0x00ae:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r1 = r4.A00()     // Catch:{ Exception -> 0x00cd }
            if (r1 == 0) goto L_0x00c4
            java.lang.String r0 = "order_id"
            java.lang.String r1 = r1.getStringValue(r0)     // Catch:{ Exception -> 0x00cd }
        L_0x00ba:
            com.facebookpay.expresscheckout.models.CheckoutAvailability r0 = new com.facebookpay.expresscheckout.models.CheckoutAvailability     // Catch:{ Exception -> 0x00cd }
            r0.<init>(r2, r3, r1)     // Catch:{ Exception -> 0x00cd }
            X.7Kx r3 = X.AnonymousClass7Kx.A0A(r0)     // Catch:{ Exception -> 0x00cd }
            return r3
        L_0x00c4:
            r1 = r6
            goto L_0x00ba
        L_0x00c6:
            r2 = r6
            goto L_0x00ae
        L_0x00c8:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)     // Catch:{ Exception -> 0x00cd }
            throw r0     // Catch:{ Exception -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x00de
            X.6Cc r0 = new X.6Cc
            r0.<init>(r1)
            X.7Kx r3 = X.AnonymousClass7Kx.A0B(r6, r0)
            return r3
        L_0x00de:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r5)
            throw r0
        L_0x00e3:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00e8:
            com.facebookpay.expresscheckout.models.CheckoutAvailability r0 = new com.facebookpay.expresscheckout.models.CheckoutAvailability
            r0.<init>(r6, r2, r6)
            X.7Kx r3 = X.AnonymousClass7Kx.A0A(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A08(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.8n9):java.lang.Object");
    }

    public final boolean A09(String str) {
        C04220Ms.A0B(str, 0);
        AnonymousClass79R r1 = new AnonymousClass79R((OtcInput) null, str);
        if (AnonymousClass7Kx.A0R(C86104wH.A0R(AnonymousClass7IT.A00(((C128157j3) this.A0D.getValue()).A00, r1))) && AnonymousClass7Kx.A0R(C86104wH.A0R(AnonymousClass7IT.A00(C86144wL.A0R(this.A0B).A01, r1)))) {
            if (!AnonymousClass7Kx.A0R(C86104wH.A0R(AnonymousClass7IT.A00(((C128167j4) this.A0C.getValue()).A01, new AnonymousClass79R((OtcInput) null, str))))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: kotlin.jvm.internal.KtLambdaShape3S1210000_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: X.8Iy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: X.8Iy} */
    /* JADX WARNING: type inference failed for: r13v3, types: [X.0YY] */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013a, code lost:
        if (r10.length() == 0) goto L_0x013c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r22, com.fbpay.logging.LoggingPolicy r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.List r29, X.C146958n9 r30) {
        /*
            r9 = r26
            r0 = r28
            r5 = 4
            r6 = r30
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2.A00(r5, r6)
            r3 = r22
            if (r1 == 0) goto L_0x0187
            r13 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r13 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2) r13
            int r4 = r13.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r2
            if (r1 == 0) goto L_0x0187
            int r4 = r4 - r2
            r13.A00 = r4
        L_0x001d:
            java.lang.Object r5 = r13.A05
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r4 = r13.A00
            r21 = 0
            r2 = 1
            if (r4 == 0) goto L_0x0114
            if (r4 != r2) goto L_0x018e
            java.lang.Object r14 = r13.A04
            com.fbpay.logging.LoggingContext r14 = (com.fbpay.logging.LoggingContext) r14
            java.lang.Object r0 = r13.A03
            java.lang.Object r9 = r13.A02
            java.lang.String r9 = (java.lang.String) r9
            X.AnonymousClass0OU.A00(r5)
        L_0x0037:
            r1 = r5
            X.7Kx r1 = (X.AnonymousClass7Kx) r1
            java.lang.Object r5 = r1.A01
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl r5 = (com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl) r5
            if (r5 == 0) goto L_0x005a
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r3 = r5.A00()
            if (r3 == 0) goto L_0x005a
            com.facebook.pando.TreeJNI r4 = X.C86164wN.A0K(r3)
            if (r4 == 0) goto L_0x005a
            java.lang.Class<com.facebook.graphql.impls.FBPayECPAvailabilityImpl> r3 = com.facebook.graphql.impls.FBPayECPAvailabilityImpl.class
            com.facebook.pando.TreeJNI r4 = r4.reinterpret(r3)
            if (r4 == 0) goto L_0x005a
            java.lang.String r3 = "is_ecp_available"
            boolean r21 = r4.getBooleanValue(r3)
        L_0x005a:
            boolean r3 = X.AnonymousClass7Kx.A0R(r1)
            if (r3 == 0) goto L_0x00a0
            X.7ke r4 = X.AnonymousClass7JJ.A00()
            if (r5 == 0) goto L_0x009e
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r3 = r5.A00()
            if (r3 == 0) goto L_0x009e
            java.lang.String r2 = "order_id"
            java.lang.String r7 = r3.getStringValue(r2)
        L_0x0072:
            java.util.LinkedHashMap r3 = X.C18220wO.A0y()
            if (r0 == 0) goto L_0x007d
            java.lang.String r2 = "product_session_id"
            r3.put(r2, r0)
        L_0x007d:
            r0 = 0
            X.C04220Ms.A0B(r14, r0)
            X.09x r2 = r4.A00
            java.lang.String r0 = "client_add_checkoutsetupmutation_success"
            X.0A2 r2 = X.C86104wH.A0K(r2, r0)
            r0 = 172(0xac, float:2.41E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r2, r0)
            X.8Iy r13 = new X.8Iy
            r4 = r13
            r5 = r14
            r6 = r9
            r8 = r3
            r9 = r21
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x009a:
            X.C128957ke.A04(r0, r14, r13)
        L_0x009d:
            return r1
        L_0x009e:
            r7 = 0
            goto L_0x0072
        L_0x00a0:
            boolean r3 = X.AnonymousClass7Kx.A0O(r1)
            if (r3 == 0) goto L_0x009d
            r6 = 0
            if (r5 == 0) goto L_0x0112
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r3 = r5.A00()
            if (r3 == 0) goto L_0x0112
            com.facebook.pando.TreeJNI r4 = X.C86164wN.A0K(r3)
            if (r4 == 0) goto L_0x0112
            java.lang.Class<com.facebook.graphql.impls.FBPayECPAvailabilityImpl> r3 = com.facebook.graphql.impls.FBPayECPAvailabilityImpl.class
            com.facebook.pando.TreeJNI r5 = r4.reinterpret(r3)
            if (r5 == 0) goto L_0x00ca
            java.lang.String r3 = "ecp_availability_reason"
            java.lang.String r3 = r5.getStringValue(r3)
            if (r3 == 0) goto L_0x00ca
            X.6tE r6 = new X.6tE
            r6.<init>(r3)
        L_0x00ca:
            X.7ke r4 = X.AnonymousClass7JJ.A00()
            r18 = 1
            if (r5 == 0) goto L_0x010f
            java.lang.String r3 = "is_ecp_available"
            boolean r3 = r5.getBooleanValue(r3)
            if (r3 != r2) goto L_0x010f
        L_0x00da:
            java.lang.Throwable r2 = r1.A02
            java.util.LinkedHashMap r15 = X.C18220wO.A0y()
            X.C86114wI.A1P(r2, r15)
            if (r6 == 0) goto L_0x00ec
            java.lang.String r3 = r6.A00
            java.lang.String r2 = "ecp_availability_reason"
            r15.put(r2, r3)
        L_0x00ec:
            if (r0 == 0) goto L_0x00f3
            java.lang.String r2 = "product_session_id"
            r15.put(r2, r0)
        L_0x00f3:
            r0 = 0
            X.C04220Ms.A0B(r14, r0)
            X.09x r2 = r4.A00
            java.lang.String r0 = "client_add_checkoutsetupmutation_fail"
            X.0A2 r2 = X.C86104wH.A0K(r2, r0)
            r0 = 170(0xaa, float:2.38E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r2, r0)
            r17 = 2
            kotlin.jvm.internal.KtLambdaShape3S1210000_I2 r13 = new kotlin.jvm.internal.KtLambdaShape3S1210000_I2
            r16 = r9
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x009a
        L_0x010f:
            r18 = 0
            goto L_0x00da
        L_0x0112:
            r5 = r6
            goto L_0x00ca
        L_0x0114:
            X.AnonymousClass0OU.A00(r5)
            r8 = r25
            long r19 = java.lang.Long.parseLong(r8)
            X.84Y r17 = X.AnonymousClass84Y.A00
            com.fbpay.logging.LoggingContext r14 = new com.fbpay.logging.LoggingContext
            r7 = r24
            r15 = r23
            r16 = r7
            r18 = r17
            r14.<init>(r15, r16, r17, r18, r19, r21)
            X.7ke r5 = X.AnonymousClass7JJ.A00()
            r10 = r27
            if (r27 == 0) goto L_0x013c
            int r4 = r10.length()
            r28 = 0
            if (r4 != 0) goto L_0x013e
        L_0x013c:
            r28 = 1
        L_0x013e:
            java.util.LinkedHashMap r6 = X.C18220wO.A0y()
            if (r0 == 0) goto L_0x0149
            java.lang.String r4 = "product_session_id"
            r6.put(r4, r0)
        L_0x0149:
            X.09x r5 = r5.A00
            java.lang.String r4 = "client_add_checkoutsetupmutation_init"
            X.0A2 r5 = X.C86104wH.A0K(r5, r4)
            r4 = 171(0xab, float:2.4E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r5, r4)
            r27 = 2
            kotlin.jvm.internal.KtLambdaShape1S1310000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape1S1310000_I2
            r12 = r29
            r22 = r4
            r23 = r14
            r24 = r12
            r25 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28)
            X.C128957ke.A04(r5, r14, r4)
            com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI r6 = r3.A0E
            X.AnonymousClass7Kz.A04()
            r4 = 67
            java.lang.String r11 = X.C18170wI.A00(r4)
            r13.A01 = r3
            r13.A02 = r9
            r13.A03 = r0
            r13.A04 = r14
            r13.A00 = r2
            java.lang.Object r5 = r6.A00(r7, r8, r9, r10, r11, r12, r13)
            if (r5 != r1) goto L_0x0037
            return r1
        L_0x0187:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2 r13 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2
            r13.<init>(r3, r6, r5)
            goto L_0x001d
        L_0x018e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A00(com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl, com.fbpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0104, code lost:
        if (r8 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010a, code lost:
        if (r8 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0110, code lost:
        if (r8 != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        if (r8 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011b, code lost:
        if (r8 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r13, com.fbpay.logging.LoggingPolicy r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.List r20, X.C146958n9 r21, boolean r22, boolean r23) {
        /*
            r6 = r21
            r3 = r13
            r4 = r15
            r5 = r16
            r7 = r14
            r9 = r22
            r10 = r23
            boolean r0 = r6 instanceof X.C137848Al
            if (r0 == 0) goto L_0x0138
            r8 = r6
            X.8Al r8 = (X.C137848Al) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0138
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001d:
            java.lang.Object r6 = r8.A07
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r12 = 1
            if (r0 == 0) goto L_0x011e
            if (r0 != r12) goto L_0x01ee
            boolean r10 = r8.A06
            boolean r9 = r8.A05
            java.lang.Object r7 = r8.A04
            com.fbpay.logging.LoggingPolicy r7 = (com.fbpay.logging.LoggingPolicy) r7
            java.lang.Object r5 = r8.A03
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r8.A02
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r8.A01
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r3 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r3
            X.AnonymousClass0OU.A00(r6)
        L_0x003f:
            X.7Kx r6 = (X.AnonymousClass7Kx) r6
            boolean r0 = X.AnonymousClass7Kx.A0R(r6)
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r8 = r6.A01
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl r8 = (com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl) r8
            r17 = 0
            if (r8 == 0) goto L_0x0102
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r0 = r8.A00()
            if (r0 == 0) goto L_0x0102
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$ReceiverInfo r1 = r0.A00()
            if (r1 == 0) goto L_0x0102
            java.lang.Class<com.facebook.graphql.impls.FBPayReceiverInfoImpl> r0 = com.facebook.graphql.impls.FBPayReceiverInfoImpl.class
            com.facebook.pando.TreeJNI r14 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayReceiverInfoImpl r14 = (com.facebook.graphql.impls.FBPayReceiverInfoImpl) r14
        L_0x0063:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r0 = r8.A00()
            if (r0 == 0) goto L_0x0108
            com.facebook.pando.TreeJNI r1 = X.C86164wN.A0K(r0)
            if (r1 == 0) goto L_0x0108
            java.lang.Class<com.facebook.graphql.impls.FBPayECPAvailabilityImpl> r0 = com.facebook.graphql.impls.FBPayECPAvailabilityImpl.class
            com.facebook.pando.TreeJNI r13 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayECPAvailabilityImpl r13 = (com.facebook.graphql.impls.FBPayECPAvailabilityImpl) r13
        L_0x0077:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r2 = r8.A00()
            if (r2 == 0) goto L_0x010e
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$CheckoutScreenConfig> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.CheckoutScreenConfig.class
            java.lang.String r0 = "checkout_screen_config"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x010e
            java.lang.Class<com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl> r0 = com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl.class
            com.facebook.pando.TreeJNI r11 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r11 = (com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl) r11
        L_0x008f:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r2 = r8.A00()
            if (r2 == 0) goto L_0x0114
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$PaymentConfig> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.PaymentConfig.class
            java.lang.String r0 = "payment_config"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0114
            java.lang.Class<com.facebook.graphql.impls.FBPayPaymentConfigImpl> r0 = com.facebook.graphql.impls.FBPayPaymentConfigImpl.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayPaymentConfigImpl r2 = (com.facebook.graphql.impls.FBPayPaymentConfigImpl) r2
        L_0x00a7:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r15 = r8.A00()
            if (r15 == 0) goto L_0x0119
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$LoggingPolicy> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.LoggingPolicy.class
            java.lang.String r0 = "logging_policy"
            com.facebook.pando.TreeJNI r1 = r15.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Class<com.facebook.graphql.impls.FBPayLoggingPolicyImpl> r0 = com.facebook.graphql.impls.FBPayLoggingPolicyImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayLoggingPolicyImpl r1 = (com.facebook.graphql.impls.FBPayLoggingPolicyImpl) r1
        L_0x00bf:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r15 = r8.A00()
            if (r15 == 0) goto L_0x00ca
            java.lang.String r0 = "order_id"
            r15.getStringValue(r0)
        L_0x00ca:
            X.6lW r0 = new X.6lW
            r18 = r0
            r19 = r11
            r20 = r13
            r21 = r1
            r22 = r2
            r23 = r14
            r18.<init>(r19, r20, r21, r22, r23)
            r3.A01 = r0
            if (r14 == 0) goto L_0x00ff
            java.lang.String r1 = X.C18220wO.A0m(r14)
        L_0x00e3:
            r11 = 0
            if (r1 == 0) goto L_0x00ed
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00ed
            r12 = 0
        L_0x00ed:
            java.lang.String r2 = ""
            if (r12 == 0) goto L_0x013f
            java.lang.String r0 = "Server receiver_id cannot be null"
            X.88i r1 = new X.88i
            r1.<init>(r11, r0, r2)
            r0 = r17
            X.7Kx r1 = X.AnonymousClass7Kx.A0B(r0, r1)
            return r1
        L_0x00ff:
            r1 = r17
            goto L_0x00e3
        L_0x0102:
            r14 = r17
            if (r8 == 0) goto L_0x0108
            goto L_0x0063
        L_0x0108:
            r13 = r17
            if (r8 == 0) goto L_0x010e
            goto L_0x0077
        L_0x010e:
            r11 = r17
            if (r8 == 0) goto L_0x0114
            goto L_0x008f
        L_0x0114:
            r2 = r17
            if (r8 == 0) goto L_0x0119
            goto L_0x00a7
        L_0x0119:
            r1 = r17
            if (r8 == 0) goto L_0x00ca
            goto L_0x00bf
        L_0x011e:
            X.AnonymousClass0OU.A00(r6)
            r8.A01 = r13
            r8.A02 = r15
            r8.A03 = r5
            r8.A04 = r14
            r8.A05 = r9
            r8.A06 = r10
            r8.A00 = r12
            r21 = r8
            java.lang.Object r6 = A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r6 != r1) goto L_0x003f
            return r1
        L_0x0138:
            X.8Al r8 = new X.8Al
            r8.<init>(r13, r6)
            goto L_0x001d
        L_0x013f:
            X.6lW r12 = r3.A01
            if (r12 == 0) goto L_0x0148
            X.6rH r0 = r3.A0A
            r0.A01(r12, r5, r1)
        L_0x0148:
            java.lang.String r16 = "Required value was null."
            if (r8 == 0) goto L_0x017c
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r0 = r8.A00()     // Catch:{ Exception -> 0x0181 }
            if (r0 == 0) goto L_0x017c
            X.6ly r15 = X.C122157Kv.A0B(r0)     // Catch:{ Exception -> 0x0181 }
            X.77W r0 = r3.A09     // Catch:{ Exception -> 0x0181 }
            X.C18200wM.A1S(r5, r1)     // Catch:{ Exception -> 0x0181 }
            android.util.LruCache r14 = r0.A00     // Catch:{ Exception -> 0x0181 }
            int r12 = r14.size()     // Catch:{ Exception -> 0x0181 }
            r0 = 20
            if (r12 != r0) goto L_0x016a
            r0 = 10
            r14.trimToSize(r0)     // Catch:{ Exception -> 0x0181 }
        L_0x016a:
            X.6tl r13 = new X.6tl     // Catch:{ Exception -> 0x0181 }
            r13.<init>(r5, r1)     // Catch:{ Exception -> 0x0181 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0181 }
            X.6tm r12 = new X.6tm     // Catch:{ Exception -> 0x0181 }
            r12.<init>(r15, r0)     // Catch:{ Exception -> 0x0181 }
            r14.put(r13, r12)     // Catch:{ Exception -> 0x0181 }
            goto L_0x0199
        L_0x017c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)     // Catch:{ Exception -> 0x0181 }
            throw r0     // Catch:{ Exception -> 0x0181 }
        L_0x0181:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x0194
            X.88i r1 = new X.88i
            r1.<init>(r11, r0, r2)
            r0 = r17
            X.7Kx r1 = X.AnonymousClass7Kx.A0B(r0, r1)
            return r1
        L_0x0194:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x0199:
            X.6lW r0 = r3.A01
            if (r0 == 0) goto L_0x01e5
            com.facebook.graphql.impls.FBPayECPAvailabilityImpl r1 = r0.A01
            if (r1 == 0) goto L_0x01e5
            java.lang.String r0 = "is_ecp_available"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 == 0) goto L_0x01e5
            X.6lW r2 = r3.A01
            if (r2 == 0) goto L_0x01e6
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r1 = r2.A00
        L_0x01af:
            if (r9 == 0) goto L_0x01e5
            if (r10 == 0) goto L_0x01e5
            if (r1 == 0) goto L_0x01e5
            if (r2 == 0) goto L_0x01e5
            com.facebook.graphql.impls.FBPayReceiverInfoImpl r0 = r2.A04
            if (r0 == 0) goto L_0x01e9
            java.lang.String r13 = X.C18220wO.A0m(r0)
            if (r13 == 0) goto L_0x01e9
            boolean r15 = X.C122157Kv.A0Q(r8)
            java.lang.String r14 = X.C122157Kv.A0K(r1, r3, r5)
            r8 = r2
            r9 = r17
            r10 = r7
            r11 = r4
            r12 = r5
            java.util.ArrayList r0 = X.AnonymousClass7JB.A01(r8, r9, r10, r11, r12, r13, r14, r15)
            r3.A03 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            X.7Kx r9 = X.AnonymousClass7Kx.A05(r6, r0)
            r7 = r2
            r8 = r3
            r10 = r4
            r11 = r5
            r12 = r13
            A02(r7, r8, r9, r10, r11, r12)
        L_0x01e5:
            return r6
        L_0x01e6:
            r1 = r17
            goto L_0x01af
        L_0x01e9:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        L_0x01ee:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A01(com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl, com.fbpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.8n9, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (((kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2) r8).A08 != 1) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ec A[Catch:{ Exception -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(com.facebookpay.expresscheckout.handler.ECPHandler r22, com.facebookpay.expresscheckout.models.ECPPaymentRequest r23, com.facebookpay.expresscheckout.models.TransactionInfo r24, java.lang.String r25, java.util.List r26, X.C146958n9 r27, boolean r28) {
        /*
            r21 = this;
            r2 = r22
            r1 = r23
            r6 = r24
            r5 = 1
            r8 = r27
            boolean r0 = r8 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2
            if (r0 == 0) goto L_0x0015
            r0 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2) r0
            int r3 = r0.A08
            r0 = 1
            if (r3 == r5) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r10 = r21
            if (r0 == 0) goto L_0x00bb
            r4 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2) r4
            int r7 = r4.A01
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r7 & r3
            if (r0 == 0) goto L_0x00bb
            int r7 = r7 - r3
            r4.A01 = r7
        L_0x0028:
            java.lang.Object r8 = r4.A06
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A01
            r11 = 0
            if (r0 == 0) goto L_0x0055
            if (r0 != r5) goto L_0x0128
            int r7 = r4.A00
            java.lang.Object r6 = r4.A05
            java.lang.Object r2 = r4.A04
            com.facebookpay.expresscheckout.handler.ECPHandler r2 = (com.facebookpay.expresscheckout.handler.ECPHandler) r2
            java.lang.Object r1 = r4.A03
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.Object r3 = r4.A02
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r3 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r3
            X.AnonymousClass0OU.A00(r8)
        L_0x0046:
            X.7Kx r8 = (X.AnonymousClass7Kx) r8
            boolean r0 = X.AnonymousClass7Kx.A0R(r8)
            if (r0 == 0) goto L_0x011d
            java.lang.String r9 = "Required value was null."
            if (r6 != 0) goto L_0x00f3
            if (r8 == 0) goto L_0x00e9
            goto L_0x00c2
        L_0x0055:
            X.AnonymousClass0OU.A00(r8)
            X.77W r7 = r10.A09
            java.lang.String r13 = r1.A08
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r8 = r1.A05
            if (r8 == 0) goto L_0x00b9
            java.lang.String r0 = r8.A02
        L_0x0062:
            X.6ly r0 = r7.A00(r13, r0)
            if (r0 == 0) goto L_0x00b2
            X.56r r7 = r10.A00
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C122157Kv.A0F(r0, r1, r6)
            X.AnonymousClass7Kx.A0I(r7, r0)
            r7 = 1
        L_0x0072:
            java.lang.String r15 = r1.A07
            if (r8 == 0) goto L_0x00b0
            java.lang.String r0 = r8.A02
        L_0x0078:
            r9 = 0
            if (r0 == 0) goto L_0x0087
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0087
            if (r15 == 0) goto L_0x0087
            if (r28 != 0) goto L_0x0088
            if (r24 != 0) goto L_0x0088
        L_0x0087:
            r9 = 1
        L_0x0088:
            if (r9 == 0) goto L_0x0146
            java.lang.String r12 = r1.A0A
            if (r8 == 0) goto L_0x00ae
            java.lang.String r14 = r8.A02
        L_0x0090:
            r4.A02 = r10
            r4.A03 = r1
            r4.A04 = r2
            r4.A05 = r6
            r4.A00 = r7
            r4.A01 = r5
            r20 = 0
            r16 = r25
            r17 = r26
            r19 = r5
            r18 = r4
            java.lang.Object r8 = A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r8 == r3) goto L_0x0148
            r3 = r10
            goto L_0x0046
        L_0x00ae:
            r14 = r11
            goto L_0x0090
        L_0x00b0:
            r0 = r11
            goto L_0x0078
        L_0x00b2:
            X.56r r0 = r10.A00
            X.AnonymousClass7Kx.A0I(r0, r1)
            r7 = 0
            goto L_0x0072
        L_0x00b9:
            r0 = r11
            goto L_0x0062
        L_0x00bb:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2
            r4.<init>(r10, r8, r5)
            goto L_0x0028
        L_0x00c2:
            java.lang.Object r0 = r8.A01     // Catch:{ Exception -> 0x012d }
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl r0 = (com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl) r0     // Catch:{ Exception -> 0x012d }
            if (r0 == 0) goto L_0x00e9
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r5 = r0.A00()     // Catch:{ Exception -> 0x012d }
            if (r5 == 0) goto L_0x00e9
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$TransactionInfo> r4 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.TransactionInfo.class
            java.lang.String r0 = "transaction_info"
            com.facebook.pando.TreeJNI r4 = r5.getTreeValue(r0, r4)     // Catch:{ Exception -> 0x012d }
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$TransactionInfo r4 = (com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.TransactionInfo) r4     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x00e9
            java.lang.Class<com.facebook.graphql.impls.FBPayTransactionInfoImpl> r0 = com.facebook.graphql.impls.FBPayTransactionInfoImpl.class
            com.facebook.pando.TreeJNI r0 = r4.reinterpret(r0)     // Catch:{ Exception -> 0x012d }
            com.facebook.graphql.impls.FBPayTransactionInfoImpl r0 = (com.facebook.graphql.impls.FBPayTransactionInfoImpl) r0     // Catch:{ Exception -> 0x012d }
            if (r0 == 0) goto L_0x00e9
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = X.C122157Kv.A0H(r0)     // Catch:{ Exception -> 0x012d }
            goto L_0x00ea
        L_0x00e9:
            r0 = 0
        L_0x00ea:
            if (r0 == 0) goto L_0x00f3
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)     // Catch:{ Exception -> 0x012d }
            r2.Cqk(r0)     // Catch:{ Exception -> 0x012d }
        L_0x00f3:
            if (r7 == 0) goto L_0x00fb
            if (r6 == 0) goto L_0x00fb
            java.lang.String r0 = r1.A07     // Catch:{ Exception -> 0x012d }
            if (r0 != 0) goto L_0x013f
        L_0x00fb:
            if (r8 == 0) goto L_0x010e
            java.lang.Object r0 = r8.A01     // Catch:{ Exception -> 0x012d }
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl r0 = (com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl) r0     // Catch:{ Exception -> 0x012d }
            if (r0 == 0) goto L_0x010e
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation r0 = r0.A00()     // Catch:{ Exception -> 0x012d }
            if (r0 == 0) goto L_0x010e
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C122157Kv.A0E(r0, r1)     // Catch:{ Exception -> 0x011b }
            goto L_0x010f
        L_0x010e:
            r0 = r11
        L_0x010f:
            if (r0 == 0) goto L_0x0116
            X.7Kx r11 = X.AnonymousClass7Kx.A0A(r0)     // Catch:{ Exception -> 0x011b }
            goto L_0x013f
        L_0x0116:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)     // Catch:{ Exception -> 0x011b }
            throw r0     // Catch:{ Exception -> 0x011b }
        L_0x011b:
            r0 = move-exception
            goto L_0x012e
        L_0x011d:
            boolean r0 = X.AnonymousClass7Kx.A0O(r8)
            if (r0 == 0) goto L_0x013f
            X.7Kx r11 = X.AnonymousClass7Kx.A0B(r11, r11)
            goto L_0x013f
        L_0x0128:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x012d:
            r0 = move-exception
        L_0x012e:
            if (r7 != 0) goto L_0x013f
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x0149
            X.6Cc r0 = new X.6Cc
            r0.<init>(r1)
            X.7Kx r11 = X.AnonymousClass7Kx.A0B(r11, r0)
        L_0x013f:
            if (r11 == 0) goto L_0x0146
            X.56r r0 = r3.A00
            r0.A0H(r11)
        L_0x0146:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x0148:
            return r3
        L_0x0149:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A06(com.facebookpay.expresscheckout.handler.ECPHandler, com.facebookpay.expresscheckout.models.ECPPaymentRequest, com.facebookpay.expresscheckout.models.TransactionInfo, java.lang.String, java.util.List, X.8n9, boolean):java.lang.Object");
    }

    public ECPRepositoryImpl() {
        C880756q A012 = C880756q.A01();
        this.A06 = A012;
        this.A05 = A012;
    }

    public static final void A02(C110336lW r11, ECPRepositoryImpl eCPRepositoryImpl, AnonymousClass7Kx r13, String str, String str2, String str3) {
        C880756q r1;
        AnonymousClass7Kx A052;
        if (!AnonymousClass7Kx.A0R(r13)) {
            r1 = eCPRepositoryImpl.A06;
            A052 = AnonymousClass7Kx.A05(r13, (Object) null);
        } else if (C18190wL.A1Z(r13.A01, true)) {
            String A0n = C18190wL.A0n(C03480Iw.A00());
            AnonymousClass7JB.A01(r11, new OtcInput(A0n, "CARD"), (LoggingPolicy) null, str, str2, str3, "NUX", true);
            r1 = eCPRepositoryImpl.A06;
            A052 = AnonymousClass7Kx.A0A(A0n);
        } else {
            r1 = eCPRepositoryImpl.A06;
            A052 = AnonymousClass7Kx.A0B((Object) null, C18250wR.A0V("OTC is not available"));
        }
        r1.A0H(A052);
    }

    public final boolean A0A(String str, Set set, Set set2) {
        AnonymousClass7Kx A0R;
        boolean z;
        C1203179r r0;
        AnonymousClass7Kx A0R2;
        C108866j5 r02;
        boolean A1Z = C18200wM.A1Z(str);
        AnonymousClass79R r2 = new AnonymousClass79R((OtcInput) null, str);
        if ((!set.contains(AnonymousClass68M.UX_SHIPPING_ADDRESS) || (A0R2 = C86104wH.A0R(AnonymousClass7IT.A00(((C128157j3) this.A0D.getValue()).A00, r2))) == null || (r02 = (C108866j5) A0R2.A01) == null || C18190wL.A1a(r02.A02) != A1Z) && ((!set2.contains(AnonymousClass68F.REQUEST_PAYER_NAME) || !C86144wL.A0R(this.A0B).A0B(r2)) && ((!set2.contains(AnonymousClass68F.REQUEST_PAYER_EMAIL) || !C86144wL.A0R(this.A0B).A0A(r2)) && ((!set2.contains(AnonymousClass68F.REQUEST_PAYER_PHONE) || !C86144wL.A0R(this.A0B).A0C(r2)) && ((A0R = C86104wH.A0R(AnonymousClass7IT.A00(((C128167j4) this.A0C.getValue()).A01, r2))) == null || (r0 = (C1203179r) A0R.A01) == null || C18190wL.A1a(r0.A02) != A1Z))))) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }
}
