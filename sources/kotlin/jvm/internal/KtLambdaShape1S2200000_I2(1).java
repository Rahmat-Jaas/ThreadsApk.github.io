package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape1S2200000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S2200000_I2(Object obj, Object obj2, String str, String str2, int i) {
        super(1);
        this.A04 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A00 = obj2;
        this.A02 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0179, code lost:
        X.AnonymousClass7Hr.A03(r3, r2);
        X.C86114wI.A1C(r10, r3);
        X.C86114wI.A1G(r10, r15.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0184, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019a, code lost:
        return kotlin.Unit.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r10 = r16
            int r0 = r15.A04
            switch(r0) {
                case 0: goto L_0x0185;
                case 1: goto L_0x015f;
                case 2: goto L_0x0142;
                case 3: goto L_0x0007;
                case 4: goto L_0x0007;
                case 5: goto L_0x0007;
                case 6: goto L_0x010f;
                case 7: goto L_0x0046;
                case 8: goto L_0x002d;
                default: goto L_0x0007;
            }
        L_0x0007:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r10 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r10
            X.5Db r3 = new X.5Db
            r3.<init>()
            java.lang.Object r2 = r15.A01
            com.fbpay.logging.LoggingContext r2 = (com.fbpay.logging.LoggingContext) r2
            X.C86104wH.A1K(r3, r2)
            java.lang.String r1 = r15.A02
            java.lang.String r0 = "shipping_option_id"
            r3.A0A(r0, r1)
            java.lang.String r0 = r15.A03
            X.C86124wJ.A1K(r3, r0)
            X.AnonymousClass7Hr.A03(r3, r2)
            X.C86114wI.A1C(r10, r3)
            java.lang.Object r0 = r15.A00
            X.C86114wI.A1G(r10, r0)
            return r10
        L_0x002d:
            int r4 = X.AnonymousClass0wJ.A04(r10)
            java.lang.Object r0 = r15.A01
            com.instagram.api.tigon.IGTigonQuickPerformanceLogger r0 = (com.instagram.api.tigon.IGTigonQuickPerformanceLogger) r0
            X.01V r3 = r0.logger
            java.lang.Object r0 = r15.A00
            int r2 = r0.hashCode()
            java.lang.String r1 = r15.A02
            java.lang.String r0 = r15.A03
            r3.markerAnnotate((int) r4, (int) r2, (java.lang.String) r1, (java.lang.String) r0)
            goto L_0x0198
        L_0x0046:
            X.7Kx r10 = (X.AnonymousClass7Kx) r10
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            boolean r0 = X.AnonymousClass7Kx.A0Q(r10)
            if (r0 != 0) goto L_0x0104
            java.lang.Object r0 = r10.A01
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl r0 = (com.facebook.graphql.impls.ComponentDataMutationResponseImpl) r0
            r8 = 0
            if (r0 == 0) goto L_0x010d
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r2 = r0.A00()
            if (r2 == 0) goto L_0x010d
            java.lang.Class<com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$CredentialResponse> r1 = com.facebook.graphql.impls.ComponentDataMutationResponseImpl.FbpayAccountMutation.CredentialResponse.class
            java.lang.String r0 = "credential_response"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x010d
            java.lang.Class<com.facebook.graphql.impls.CredentialResponseImpl> r0 = com.facebook.graphql.impls.CredentialResponseImpl.class
            com.facebook.pando.TreeJNI r5 = r1.reinterpret(r0)
            if (r5 == 0) goto L_0x010d
            X.66s r1 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "error_step"
            java.lang.Enum r7 = X.C86104wH.A0a(r5, r1, r0)
            X.66s r7 = (X.C967966s) r7
            if (r7 == 0) goto L_0x00d5
            if (r7 == r1) goto L_0x00d5
            java.lang.Throwable r1 = r10.A02
            if (r1 != 0) goto L_0x00d1
            java.lang.Class<com.facebook.graphql.impls.CredentialResponseImpl$Error> r6 = com.facebook.graphql.impls.CredentialResponseImpl.Error.class
            com.facebook.pando.TreeJNI r0 = X.C86154wM.A0M(r5, r6)
            if (r0 == 0) goto L_0x010b
            com.facebook.pando.TreeJNI r1 = X.C86124wJ.A0T(r0)
            if (r1 == 0) goto L_0x010b
            java.lang.String r0 = "error_code"
            int r4 = r1.getIntValue(r0)
        L_0x0097:
            java.lang.String r3 = "Unknown Server Error For Credential Mutation"
            java.lang.String r2 = "error"
            com.facebook.pando.TreeJNI r0 = r5.getTreeValue(r2, r6)
            if (r0 == 0) goto L_0x00b6
            com.facebook.pando.TreeJNI r1 = X.C86124wJ.A0T(r0)
            if (r1 == 0) goto L_0x00b6
            java.lang.String r0 = "error_title"
            java.lang.String r1 = r1.getStringValue(r0)
            if (r1 == 0) goto L_0x00b6
            boolean r0 = X.AnonymousClass8bQ.A0n(r1)
            if (r0 != 0) goto L_0x00b6
            r3 = r1
        L_0x00b6:
            com.facebook.pando.TreeJNI r0 = r5.getTreeValue(r2, r6)
            if (r0 == 0) goto L_0x00ca
            com.facebook.pando.TreeJNI r1 = X.C86124wJ.A0T(r0)
            if (r1 == 0) goto L_0x00ca
            java.lang.String r0 = "error_description"
            java.lang.String r0 = r1.getStringValue(r0)
            if (r0 != 0) goto L_0x00cc
        L_0x00ca:
            java.lang.String r0 = ""
        L_0x00cc:
            X.88i r1 = new X.88i
            r1.<init>(r4, r3, r0)
        L_0x00d1:
            X.7Kx r10 = X.AnonymousClass7Kx.A0B(r8, r1)
        L_0x00d5:
            X.7Kr r6 = X.AnonymousClass6XO.A00
            java.lang.Object r9 = r15.A00
            com.fbpay.logging.LoggingContext r9 = (com.fbpay.logging.LoggingContext) r9
            java.lang.String r11 = r15.A03
            r14 = 1
            X.5Dg r2 = new X.5Dg
            r2.<init>()
            X.6BE r0 = X.AnonymousClass6BE.CREDENTIALS
            X.6BL r1 = X.AnonymousClass6BL.A00(r0, r2, r11)
            java.lang.String r0 = "mutation_type"
            r2.A04(r1, r0)
            java.util.List r13 = X.C18180wK.A0n(r2)
            java.lang.String r12 = r15.A02
            java.lang.Object r0 = r15.A01
            com.facebookpay.otc.models.OtcInput r0 = (com.facebookpay.otc.models.OtcInput) r0
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = r0.A01
            X.7DP r8 = new X.7DP
            r8.<init>(r14, r0)
        L_0x0101:
            r6.A0G(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0104:
            X.7TK r0 = X.AnonymousClass7TK.A00
            X.7Kx r10 = X.AnonymousClass7Kx.A02(r0, r10)
            return r10
        L_0x010b:
            r4 = 0
            goto L_0x0097
        L_0x010d:
            r7 = r8
            goto L_0x00d5
        L_0x010f:
            boolean r7 = X.AnonymousClass0wJ.A1X(r10)
            X.7ke r6 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r15.A01
            X.58M r0 = (X.AnonymousClass58M) r0
            com.fbpay.logging.LoggingContext r5 = r0.A0v()
            java.lang.String r4 = r15.A03
            java.lang.Object r3 = r15.A00
            java.lang.Long r3 = (java.lang.Long) r3
            X.587 r0 = r0.A1O
            X.7DP r0 = r0.A03()
            java.lang.String r2 = r15.A02
            java.util.LinkedHashMap r1 = X.C18220wO.A0y()
            X.AnonymousClass7Kr.A0B(r0, r1)
            X.C86104wH.A1V(r1, r7)
            if (r2 == 0) goto L_0x013e
            java.lang.String r0 = "selected_shippingaddress_state"
            r1.put(r0, r2)
        L_0x013e:
            r6.A0C(r5, r3, r4, r1)
            goto L_0x0198
        L_0x0142:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r10 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r10
            X.5Cl r3 = new X.5Cl
            r3.<init>()
            java.lang.String r1 = r15.A02
            java.lang.String r0 = "auto_advance_from_field"
            r3.A0A(r0, r1)
            java.lang.String r1 = r15.A03
            java.lang.String r0 = "auto_advance_to_field"
            r3.A0A(r0, r1)
            java.lang.Object r2 = r15.A01
            com.fbpay.logging.LoggingContext r2 = (com.fbpay.logging.LoggingContext) r2
            X.C86104wH.A1K(r3, r2)
            goto L_0x0179
        L_0x015f:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r10 = (com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000) r10
            X.5Db r3 = new X.5Db
            r3.<init>()
            java.lang.Object r2 = r15.A01
            com.fbpay.logging.LoggingContext r2 = (com.fbpay.logging.LoggingContext) r2
            X.C86104wH.A1K(r3, r2)
            java.lang.String r1 = r15.A02
            java.lang.String r0 = "shipping_option_id"
            r3.A0A(r0, r1)
            java.lang.String r0 = r15.A03
            X.C86134wK.A1G(r3, r0)
        L_0x0179:
            X.AnonymousClass7Hr.A03(r3, r2)
            X.C86114wI.A1C(r10, r3)
            java.lang.Object r0 = r15.A00
            X.C86114wI.A1G(r10, r0)
            return r10
        L_0x0185:
            X.8mi r4 = X.C86104wH.A0N(r10)
            java.lang.String r3 = r15.A02
            java.lang.String r2 = r15.A03
            java.lang.Object r1 = r15.A01
            com.android.billingclient.api.Purchase r1 = (com.android.billingclient.api.Purchase) r1
            java.lang.Object r0 = r15.A00
            java.util.Map r0 = (java.util.Map) r0
            r4.CWF(r1, r3, r2, r0)
        L_0x0198:
            kotlin.Unit r10 = kotlin.Unit.A00
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape1S2200000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
