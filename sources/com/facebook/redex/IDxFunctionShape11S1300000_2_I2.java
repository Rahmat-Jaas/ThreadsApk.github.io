package com.facebook.redex;

import X.C142618fJ;

public class IDxFunctionShape11S1300000_2_I2 implements C142618fJ {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxFunctionShape11S1300000_2_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A02 = obj3;
        this.A00 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f9, code lost:
        r8 = com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl.FetchProductConfig.CheckoutScreenConfig.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0103, code lost:
        r6 = com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010d, code lost:
        r3 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r0.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r9 = r25
            int r1 = r0.A04
            if (r1 == 0) goto L_0x006c
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r5 = r0.A02
            X.57w r5 = (X.C883957w) r5
            X.56q r1 = r5.A04
            r4 = 1
            X.C86114wI.A1B(r1, r4)
            java.lang.Object r1 = r0.A00
            X.7Ic r1 = (X.AnonymousClass7Ic) r1
            java.lang.String r7 = "THREE_DS"
            X.7k3 r1 = r1.A00
            if (r1 == 0) goto L_0x006a
            java.util.Map r6 = r1.A07
            java.util.Iterator r3 = X.C86154wM.A0s(r6)
        L_0x0024:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.6v0 r1 = (X.C115406v0) r1
            java.lang.String r1 = r1.A00
            boolean r1 = X.C04220Ms.A0I(r1, r7)
            if (r1 == 0) goto L_0x0024
        L_0x0039:
            java.lang.Object r1 = r6.get(r2)
            X.6j6 r1 = (X.C108876j6) r1
        L_0x003f:
            r3 = 0
            if (r1 == 0) goto L_0x0066
            android.os.Bundle r2 = r1.A00
            if (r2 == 0) goto L_0x0066
            java.lang.String r1 = "3ds_token_token"
            java.lang.String r11 = r2.getString(r1)
        L_0x004c:
            X.7JJ r1 = X.AnonymousClass7Kz.A05()
            X.78m r6 = r1.A0C
            java.lang.Object r8 = r0.A01
            X.6mt r8 = (X.C111166mt) r8
            X.C04220Ms.A07(r9)
            java.lang.String r10 = r0.A03
            X.587 r0 = r5.A0B
            com.facebookpay.otc.models.OtcInput r7 = r0.A02(r3, r4)
            X.M5J r0 = r6.A01(r7, r8, r9, r10, r11)
            return r0
        L_0x0066:
            r11 = 0
            goto L_0x004c
        L_0x0068:
            r2 = 0
            goto L_0x0039
        L_0x006a:
            r1 = 0
            goto L_0x003f
        L_0x006c:
            java.lang.Object r1 = r0.A02
            X.7Kx r1 = (X.AnonymousClass7Kx) r1
            java.lang.Object r5 = r1.A01
            com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl r5 = (com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl) r5
            if (r5 == 0) goto L_0x01b9
            com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig r4 = r5.A00()
            if (r4 == 0) goto L_0x01b9
            java.lang.Class<com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig$EcpAvailability> r3 = com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl.FetchProductConfig.EcpAvailability.class
            java.lang.String r2 = "ecp_availability"
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r2, r3)
            if (r3 == 0) goto L_0x01b9
            java.lang.Class<com.facebook.graphql.impls.FBPayECPAvailabilityImpl> r2 = com.facebook.graphql.impls.FBPayECPAvailabilityImpl.class
            com.facebook.pando.TreeJNI r3 = r3.reinterpret(r2)
            if (r3 == 0) goto L_0x01b9
            java.lang.String r2 = "is_ecp_available"
            boolean r23 = r3.getBooleanValue(r2)
        L_0x0094:
            boolean r2 = X.AnonymousClass7Kx.A0R(r1)
            r12 = 0
            if (r2 == 0) goto L_0x017c
            X.7ke r7 = X.AnonymousClass7JJ.A00()
            java.lang.Object r6 = r0.A00
            com.fbpay.logging.LoggingContext r6 = (com.fbpay.logging.LoggingContext) r6
            java.lang.String r16 = "5206913519322793"
            long r21 = java.lang.Long.parseLong(r16)
            java.lang.Long r19 = X.AnonymousClass0wJ.A0d(r16)
            if (r5 == 0) goto L_0x00cf
            com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig r4 = r5.A00()
            if (r4 == 0) goto L_0x00cf
            java.lang.Class<com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig$EcpAvailability> r3 = com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl.FetchProductConfig.EcpAvailability.class
            java.lang.String r2 = "ecp_availability"
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r2, r3)
            if (r3 == 0) goto L_0x00cf
            java.lang.Class<com.facebook.graphql.impls.FBPayECPAvailabilityImpl> r2 = com.facebook.graphql.impls.FBPayECPAvailabilityImpl.class
            com.facebook.pando.TreeJNI r3 = r3.reinterpret(r2)
            if (r3 == 0) goto L_0x00cf
            java.lang.String r2 = "ecp_availability_reason"
            java.lang.String r4 = r3.getStringValue(r2)
            if (r4 != 0) goto L_0x00d1
        L_0x00cf:
            java.lang.String r4 = ""
        L_0x00d1:
            r2 = 0
            X.C18180wK.A1Q(r6, r2, r4)
            X.09x r3 = r7.A00
            java.lang.String r2 = "client_load_ecpproductconfiguration_success"
            X.0A2 r3 = X.C86104wH.A0K(r3, r2)
            r2 = 295(0x127, float:4.13E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r2)
            X.8Iz r2 = new X.8Iz
            r18 = r6
            r20 = r4
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r23)
            X.C128957ke.A04(r3, r6, r2)
            if (r5 == 0) goto L_0x0175
            com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig r2 = r5.A00()
            if (r2 == 0) goto L_0x0175
            java.lang.Class<com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig$CheckoutScreenConfig> r8 = com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl.FetchProductConfig.CheckoutScreenConfig.class
            java.lang.String r7 = "checkout_screen_config"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r7, r8)
            if (r2 == 0) goto L_0x0175
            java.lang.Class<com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl> r6 = com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl.class
            com.facebook.pando.TreeJNI r4 = r2.reinterpret(r6)
            if (r4 == 0) goto L_0x0175
            if (r23 == 0) goto L_0x0175
            java.lang.Object r3 = r0.A01
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r3 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r3
            X.6lW r11 = r3.A01
            if (r11 == 0) goto L_0x0175
            java.lang.String r15 = "137885231632764"
            java.lang.String r14 = r0.A03
            r2 = 1
            com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig r9 = r5.A00()
            if (r9 == 0) goto L_0x017a
            java.lang.Class<com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig$EcpAvailability> r10 = com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl.FetchProductConfig.EcpAvailability.class
            java.lang.String r0 = "ecp_availability"
            com.facebook.pando.TreeJNI r9 = r9.getTreeValue(r0, r10)
            if (r9 == 0) goto L_0x017a
            java.lang.Class<com.facebook.graphql.impls.FBPayECPAvailabilityImpl> r0 = com.facebook.graphql.impls.FBPayECPAvailabilityImpl.class
            com.facebook.pando.TreeJNI r9 = r9.reinterpret(r0)
            if (r9 == 0) goto L_0x017a
            java.lang.String r0 = "is_ecp_available"
            boolean r0 = r9.getBooleanValue(r0)
            if (r0 != r2) goto L_0x017a
            com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl$FetchProductConfig r0 = r5.A00()
            if (r0 == 0) goto L_0x017a
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r7, r8)
            if (r0 == 0) goto L_0x017a
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r6)
            if (r0 == 0) goto L_0x017a
            com.google.common.collect.ImmutableList r5 = X.AnonymousClass69P.A00(r0)
            if (r5 == 0) goto L_0x017a
            X.69P r0 = X.AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION
            boolean r0 = X.AnonymousClass7BG.A02(r0, r5)
            if (r0 != r2) goto L_0x017a
        L_0x015a:
            java.lang.String r17 = X.C122157Kv.A0K(r4, r3, r15)
            r13 = r12
            r18 = r2
            X.AnonymousClass7JB.A01(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.7Kx r2 = X.AnonymousClass7Kx.A05(r1, r0)
            r0 = r11
            r1 = r3
            r3 = r14
            r4 = r15
            r5 = r16
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A02(r0, r1, r2, r3, r4, r5)
        L_0x0175:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            return r0
        L_0x017a:
            r2 = 0
            goto L_0x015a
        L_0x017c:
            boolean r2 = X.AnonymousClass7Kx.A0O(r1)
            if (r2 == 0) goto L_0x0175
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            java.lang.Object r7 = r0.A00
            com.fbpay.logging.LoggingContext r7 = (com.fbpay.logging.LoggingContext) r7
            java.lang.String r0 = "5206913519322793"
            long r3 = java.lang.Long.parseLong(r0)
            java.lang.Long r5 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.Throwable r0 = r1.A02
            java.util.LinkedHashMap r6 = X.C18220wO.A0y()
            X.C86114wI.A1P(r0, r6)
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            X.09x r1 = r2.A00
            java.lang.String r0 = "client_load_ecpproductconfiguration_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 293(0x125, float:4.1E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r2 = 1
            kotlin.jvm.internal.KtLambdaShape0S0300100_I2 r1 = new kotlin.jvm.internal.KtLambdaShape0S0300100_I2
            r1.<init>(r2, r3, r5, r6, r7)
            X.C128957ke.A04(r0, r7, r1)
            goto L_0x0175
        L_0x01b9:
            r23 = 0
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFunctionShape11S1300000_2_I2.apply(java.lang.Object):java.lang.Object");
    }
}
