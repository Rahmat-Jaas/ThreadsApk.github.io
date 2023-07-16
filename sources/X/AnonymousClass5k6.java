package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.5k6  reason: invalid class name */
public final class AnonymousClass5k6 extends C1202479j {
    public final /* synthetic */ GQLCallInputCInputShape1S0000000 A00;
    public final /* synthetic */ OtcInput A01;
    public final /* synthetic */ C128157j3 A02;
    public final /* synthetic */ LoggingContext A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00de, code lost:
        if (r0 != null) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7Kx A05(X.AnonymousClass7EC r15) {
        /*
            r14 = this;
            r13 = 0
            X.C04220Ms.A0B(r15, r13)
            java.lang.Object r6 = r15.A01
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl r6 = (com.facebook.graphql.impls.ComponentDataMutationResponseImpl) r6
            r7 = 0
            if (r6 == 0) goto L_0x00eb
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r0 = r6.A00()
            if (r0 == 0) goto L_0x00eb
            java.lang.Class<com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$ShippingAddressResponse> r5 = com.facebook.graphql.impls.ComponentDataMutationResponseImpl.FbpayAccountMutation.ShippingAddressResponse.class
            java.lang.String r4 = "shipping_address_response"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r4, r5)
            if (r0 == 0) goto L_0x00eb
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressResponseImpl> r3 = com.facebook.graphql.impls.ShippingAddressResponseImpl.class
            com.facebook.pando.TreeJNI r2 = r0.reinterpret(r3)
            if (r2 == 0) goto L_0x00ec
            X.66s r1 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "error_step"
            java.lang.Enum r0 = X.C86104wH.A0a(r2, r1, r0)
            if (r0 == 0) goto L_0x00ec
            if (r0 == r1) goto L_0x00ec
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r0 = r6.A00()
            if (r0 == 0) goto L_0x008f
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r4, r5)
            if (r0 == 0) goto L_0x008f
            com.facebook.pando.TreeJNI r1 = r0.reinterpret(r3)
            if (r1 == 0) goto L_0x008f
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressResponseImpl$Error> r0 = com.facebook.graphql.impls.ShippingAddressResponseImpl.Error.class
            com.facebook.pando.TreeJNI r0 = X.C86154wM.A0M(r1, r0)
            if (r0 == 0) goto L_0x008f
            com.facebook.pando.TreeJNI r0 = X.C86124wJ.A0T(r0)
            com.facebook.graphql.impls.SharedPaymentsErrorImpl r0 = (com.facebook.graphql.impls.SharedPaymentsErrorImpl) r0
            if (r0 == 0) goto L_0x008f
            X.5kA r1 = X.AnonymousClass7Fb.A01(r0)
        L_0x0055:
            X.7Kx r9 = X.AnonymousClass7Kx.A0B(r7, r1)
        L_0x0059:
            com.fbpay.logging.LoggingContext r8 = r14.A03
            java.lang.String r10 = r14.A05
            java.lang.String r11 = r14.A04
            com.facebookpay.otc.models.OtcInput r0 = r14.A01
            if (r0 == 0) goto L_0x0067
            X.7DP r7 = X.AnonymousClass7DP.A00(r0)
        L_0x0067:
            X.7Kr r5 = X.AnonymousClass6XO.A00
            X.5Dg r3 = new X.5Dg
            r3.<init>()
            X.6BE r0 = X.AnonymousClass6BE.SHIPPING_ADDRESS
            X.6BL r1 = X.AnonymousClass6BL.A00(r0, r3, r10)
            java.lang.String r0 = "mutation_type"
            r3.A04(r1, r0)
            java.util.List r12 = X.C18180wK.A0n(r3)
            if (r2 == 0) goto L_0x008d
            X.66s r1 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "error_step"
            java.lang.Enum r6 = X.C86104wH.A0a(r2, r1, r0)
            X.66s r6 = (X.C967966s) r6
        L_0x0089:
            r5.A0G(r6, r7, r8, r9, r10, r11, r12, r13)
            return r9
        L_0x008d:
            r6 = 0
            goto L_0x0089
        L_0x008f:
            java.lang.Throwable r1 = r15.A02
            if (r1 != 0) goto L_0x0055
            if (r2 == 0) goto L_0x00e9
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressResponseImpl$Error> r0 = com.facebook.graphql.impls.ShippingAddressResponseImpl.Error.class
            com.facebook.pando.TreeJNI r0 = X.C86154wM.A0M(r2, r0)
            if (r0 == 0) goto L_0x00e9
            com.facebook.pando.TreeJNI r1 = X.C86124wJ.A0T(r0)
            if (r1 == 0) goto L_0x00e9
            java.lang.String r0 = "error_code"
            int r5 = r1.getIntValue(r0)
        L_0x00a9:
            java.lang.String r4 = "Unknown Server Error For Shipping Address Mutation"
            if (r2 == 0) goto L_0x00e0
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressResponseImpl$Error> r6 = com.facebook.graphql.impls.ShippingAddressResponseImpl.Error.class
            java.lang.String r3 = "error"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r3, r6)
            if (r0 == 0) goto L_0x00cc
            com.facebook.pando.TreeJNI r1 = X.C86124wJ.A0T(r0)
            if (r1 == 0) goto L_0x00cc
            java.lang.String r0 = "error_title"
            java.lang.String r1 = r1.getStringValue(r0)
            if (r1 == 0) goto L_0x00cc
            boolean r0 = X.AnonymousClass8bQ.A0m(r1)
            if (r0 == 0) goto L_0x00cc
            r4 = r1
        L_0x00cc:
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r3, r6)
            if (r0 == 0) goto L_0x00e0
            com.facebook.pando.TreeJNI r1 = X.C86124wJ.A0T(r0)
            if (r1 == 0) goto L_0x00e0
            java.lang.String r0 = "error_description"
            java.lang.String r0 = r1.getStringValue(r0)
            if (r0 != 0) goto L_0x00e2
        L_0x00e0:
            java.lang.String r0 = ""
        L_0x00e2:
            X.88i r1 = new X.88i
            r1.<init>(r5, r4, r0)
            goto L_0x0055
        L_0x00e9:
            r5 = 0
            goto L_0x00a9
        L_0x00eb:
            r2 = r7
        L_0x00ec:
            X.7Kx r9 = X.AnonymousClass7Kx.A0A(r2)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5k6.A05(X.7EC):X.7Kx");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5k6(GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000, OtcInput otcInput, C128157j3 r3, LoggingContext loggingContext, C104996ci r5, String str, String str2, String str3) {
        super(r5);
        this.A02 = r3;
        this.A03 = loggingContext;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = otcInput;
        this.A00 = gQLCallInputCInputShape1S0000000;
        this.A06 = str3;
    }

    public final C145388kQ A04(C113806sA r4) {
        if (r4 == null) {
            return null;
        }
        C128157j3 r0 = this.A02;
        return r0.A02.A00(r4, this.A00, this.A06);
    }
}
