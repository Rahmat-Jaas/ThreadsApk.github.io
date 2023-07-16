package X;

import android.util.SparseArray;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.8Ji  reason: invalid class name */
public final class AnonymousClass8Ji extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ SparseArray A00;
    public final /* synthetic */ SparseArray A01;
    public final /* synthetic */ SparseArray A02;
    public final /* synthetic */ C120927Dd A03;
    public final /* synthetic */ OtcInput A04;
    public final /* synthetic */ LoggingContext A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Ji(SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, C120927Dd r5, OtcInput otcInput, LoggingContext loggingContext, String str, String str2) {
        super(1);
        this.A03 = r5;
        this.A05 = loggingContext;
        this.A04 = otcInput;
        this.A07 = str;
        this.A01 = sparseArray;
        this.A02 = sparseArray2;
        this.A00 = sparseArray3;
        this.A06 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04b8, code lost:
        if (r0 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04be, code lost:
        if (r0 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04c4, code lost:
        if (r0 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04ca, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        r4 = X.C967966s.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        r4 = X.C967966s.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        r4 = X.C967966s.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r4 = X.C967966s.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        r4 = X.C967966s.A01;
     */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r39) {
        /*
            r38 = this;
            r6 = r39
            X.7Kx r6 = (X.AnonymousClass7Kx) r6
            r23 = 0
            r0 = r23
            X.C04220Ms.A0B(r6, r0)
            boolean r0 = X.AnonymousClass7Kx.A0Q(r6)
            if (r0 != 0) goto L_0x042b
            java.lang.Object r0 = r6.A01
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl r0 = (com.facebook.graphql.impls.ComponentDataMutationResponseImpl) r0
            r2 = 0
            if (r0 == 0) goto L_0x04b7
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r4 = r0.A00()
            if (r4 == 0) goto L_0x04b7
            java.lang.Class<com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$CredentialResponse> r3 = com.facebook.graphql.impls.ComponentDataMutationResponseImpl.FbpayAccountMutation.CredentialResponse.class
            java.lang.String r1 = "credential_response"
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r1, r3)
            if (r3 == 0) goto L_0x04b7
            java.lang.Class<com.facebook.graphql.impls.CredentialResponseImpl> r1 = com.facebook.graphql.impls.CredentialResponseImpl.class
            com.facebook.pando.TreeJNI r7 = r3.reinterpret(r1)
        L_0x002e:
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r4 = r0.A00()
            if (r4 == 0) goto L_0x04bc
            java.lang.Class<com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$ShippingAddressResponse> r3 = com.facebook.graphql.impls.ComponentDataMutationResponseImpl.FbpayAccountMutation.ShippingAddressResponse.class
            java.lang.String r1 = "shipping_address_response"
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r1, r3)
            if (r3 == 0) goto L_0x04bc
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressResponseImpl> r1 = com.facebook.graphql.impls.ShippingAddressResponseImpl.class
            com.facebook.pando.TreeJNI r22 = r3.reinterpret(r1)
        L_0x0044:
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r1 = r0.A00()
            if (r1 == 0) goto L_0x04c2
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$EmailResponse r3 = r1.A00()
            if (r3 == 0) goto L_0x04c2
            java.lang.Class<com.facebook.graphql.impls.EmailResponseImpl> r1 = com.facebook.graphql.impls.EmailResponseImpl.class
            com.facebook.pando.TreeJNI r21 = r3.reinterpret(r1)
        L_0x0056:
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r1 = r0.A00()
            if (r1 == 0) goto L_0x04c8
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$PhoneResponse r3 = r1.A01()
            if (r3 == 0) goto L_0x04c8
            java.lang.Class<com.facebook.graphql.impls.PhoneResponseImpl> r1 = com.facebook.graphql.impls.PhoneResponseImpl.class
            com.facebook.pando.TreeJNI r20 = r3.reinterpret(r1)
        L_0x0068:
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r1 = r0.A00()
            if (r1 == 0) goto L_0x04ce
            com.facebook.pando.TreeJNI r3 = X.C86164wN.A0J(r1)
            if (r3 == 0) goto L_0x04ce
            java.lang.Class<com.facebook.graphql.impls.PayerNameResponseImpl> r1 = com.facebook.graphql.impls.PayerNameResponseImpl.class
            com.facebook.pando.TreeJNI r19 = r3.reinterpret(r1)
        L_0x007a:
            if (r22 == 0) goto L_0x0088
            X.66s r4 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "error_step"
            r1 = r22
            java.lang.Enum r1 = X.C86104wH.A0a(r1, r4, r3)
            if (r1 != 0) goto L_0x00be
        L_0x0088:
            if (r21 == 0) goto L_0x0096
            X.66s r4 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "error_step"
            r1 = r21
            java.lang.Enum r1 = X.C86104wH.A0a(r1, r4, r3)
            if (r1 != 0) goto L_0x00be
        L_0x0096:
            if (r20 == 0) goto L_0x00a4
            X.66s r4 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "error_step"
            r1 = r20
            java.lang.Enum r1 = X.C86104wH.A0a(r1, r4, r3)
            if (r1 != 0) goto L_0x00be
        L_0x00a4:
            if (r19 == 0) goto L_0x00b2
            X.66s r4 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "error_step"
            r1 = r19
            java.lang.Enum r1 = X.C86104wH.A0a(r1, r4, r3)
            if (r1 != 0) goto L_0x00be
        L_0x00b2:
            if (r7 == 0) goto L_0x04b3
            X.66s r4 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "error_step"
            java.lang.Enum r1 = X.C86104wH.A0a(r7, r4, r1)
            if (r1 == 0) goto L_0x04b3
        L_0x00be:
            if (r1 == r4) goto L_0x04b3
            java.lang.Throwable r1 = r6.A02
            X.7Kx r33 = X.AnonymousClass7Kx.A0B(r2, r1)
        L_0x00c6:
            r1 = r38
            X.7Dd r5 = r1.A03
            com.fbpay.logging.LoggingContext r3 = r1.A05
            r27 = r3
            if (r0 == 0) goto L_0x04b0
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r15 = r0.A00()
        L_0x00d4:
            r8 = 1
            com.facebookpay.otc.models.OtcInput r14 = r1.A04
            if (r14 == 0) goto L_0x04ac
            java.lang.String r4 = r14.A01
            X.7DP r18 = new X.7DP
            r3 = r18
            r3.<init>(r8, r4)
        L_0x00e2:
            r16 = 0
            java.lang.String r17 = ""
            if (r15 == 0) goto L_0x0394
            java.lang.Class<com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$ShippingAddressResponse> r4 = com.facebook.graphql.impls.ComponentDataMutationResponseImpl.FbpayAccountMutation.ShippingAddressResponse.class
            java.lang.String r3 = "shipping_address_response"
            com.facebook.pando.TreeJNI r4 = r15.getTreeValue(r3, r4)
            if (r4 == 0) goto L_0x0170
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressResponseImpl> r3 = com.facebook.graphql.impls.ShippingAddressResponseImpl.class
            com.facebook.pando.TreeJNI r11 = r4.reinterpret(r3)
            if (r11 == 0) goto L_0x0170
            X.7Kr r24 = X.AnonymousClass6XO.A00
            X.66s r10 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r9 = "error_step"
            java.lang.Enum r3 = X.C86104wH.A0a(r11, r10, r9)
            if (r3 == 0) goto L_0x04a6
            if (r3 == r10) goto L_0x04a6
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressResponseImpl$Error> r13 = com.facebook.graphql.impls.ShippingAddressResponseImpl.Error.class
            java.lang.String r12 = "error"
            com.facebook.pando.TreeJNI r3 = r11.getTreeValue(r12, r13)
            if (r3 == 0) goto L_0x04a3
            com.facebook.pando.TreeJNI r4 = X.C86124wJ.A0T(r3)
            if (r4 == 0) goto L_0x04a3
            java.lang.String r3 = "error_code"
            int r8 = r4.getIntValue(r3)
        L_0x011e:
            com.facebook.pando.TreeJNI r3 = r11.getTreeValue(r12, r13)
            if (r3 == 0) goto L_0x0132
            com.facebook.pando.TreeJNI r4 = X.C86124wJ.A0T(r3)
            if (r4 == 0) goto L_0x0132
            java.lang.String r3 = "error_title"
            java.lang.String r3 = r4.getStringValue(r3)
            if (r3 != 0) goto L_0x0134
        L_0x0132:
            r3 = r17
        L_0x0134:
            com.facebook.pando.TreeJNI r4 = r11.getTreeValue(r12, r13)
            if (r4 == 0) goto L_0x0148
            com.facebook.pando.TreeJNI r12 = X.C86124wJ.A0T(r4)
            if (r12 == 0) goto L_0x0148
            java.lang.String r4 = "error_description"
            java.lang.String r12 = r12.getStringValue(r4)
            if (r12 != 0) goto L_0x014a
        L_0x0148:
            r12 = r17
        L_0x014a:
            X.88i r4 = new X.88i
            r4.<init>(r8, r3, r12)
            X.7Kx r28 = X.AnonymousClass7Kx.A0B(r2, r4)
        L_0x0153:
            X.6BE r3 = X.AnonymousClass6BE.SHIPPING_ADDRESS
            X.5Dg r3 = X.C120927Dd.A00(r3)
            java.util.List r31 = X.C18180wK.A0n(r3)
            java.lang.Enum r3 = X.C86104wH.A0a(r11, r10, r9)
            X.66s r3 = (X.C967966s) r3
            java.lang.String r29 = "CREATE"
            java.lang.String r30 = "nux_checkout"
            r25 = r3
            r26 = r18
            r32 = r23
            r24.A0G(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x0170:
            java.lang.Class<com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$CredentialResponse> r4 = com.facebook.graphql.impls.ComponentDataMutationResponseImpl.FbpayAccountMutation.CredentialResponse.class
            java.lang.String r3 = "credential_response"
            com.facebook.pando.TreeJNI r4 = r15.getTreeValue(r3, r4)
            if (r4 == 0) goto L_0x01f8
            java.lang.Class<com.facebook.graphql.impls.CredentialResponseImpl> r3 = com.facebook.graphql.impls.CredentialResponseImpl.class
            com.facebook.pando.TreeJNI r11 = r4.reinterpret(r3)
            if (r11 == 0) goto L_0x01f8
            X.7Kr r24 = X.AnonymousClass6XO.A00
            X.66s r10 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r9 = "error_step"
            java.lang.Enum r3 = X.C86104wH.A0a(r11, r10, r9)
            if (r3 == 0) goto L_0x049d
            if (r3 == r10) goto L_0x049d
            java.lang.Class<com.facebook.graphql.impls.CredentialResponseImpl$Error> r13 = com.facebook.graphql.impls.CredentialResponseImpl.Error.class
            java.lang.String r12 = "error"
            com.facebook.pando.TreeJNI r3 = r11.getTreeValue(r12, r13)
            if (r3 == 0) goto L_0x049a
            com.facebook.pando.TreeJNI r4 = X.C86124wJ.A0T(r3)
            if (r4 == 0) goto L_0x049a
            java.lang.String r3 = "error_code"
            int r8 = r4.getIntValue(r3)
        L_0x01a6:
            com.facebook.pando.TreeJNI r3 = r11.getTreeValue(r12, r13)
            if (r3 == 0) goto L_0x01ba
            com.facebook.pando.TreeJNI r4 = X.C86124wJ.A0T(r3)
            if (r4 == 0) goto L_0x01ba
            java.lang.String r3 = "error_title"
            java.lang.String r3 = r4.getStringValue(r3)
            if (r3 != 0) goto L_0x01bc
        L_0x01ba:
            r3 = r17
        L_0x01bc:
            com.facebook.pando.TreeJNI r4 = r11.getTreeValue(r12, r13)
            if (r4 == 0) goto L_0x01d0
            com.facebook.pando.TreeJNI r12 = X.C86124wJ.A0T(r4)
            if (r12 == 0) goto L_0x01d0
            java.lang.String r4 = "error_description"
            java.lang.String r12 = r12.getStringValue(r4)
            if (r12 != 0) goto L_0x01d2
        L_0x01d0:
            r12 = r17
        L_0x01d2:
            X.88i r4 = new X.88i
            r4.<init>(r8, r3, r12)
            X.7Kx r28 = X.AnonymousClass7Kx.A0B(r2, r4)
        L_0x01db:
            X.6BE r3 = X.AnonymousClass6BE.CREDENTIALS
            X.5Dg r3 = X.C120927Dd.A00(r3)
            java.util.List r31 = X.C18180wK.A0n(r3)
            java.lang.Enum r3 = X.C86104wH.A0a(r11, r10, r9)
            X.66s r3 = (X.C967966s) r3
            java.lang.String r29 = "CREATE"
            java.lang.String r30 = "nux_checkout"
            r25 = r3
            r26 = r18
            r32 = r23
            r24.A0G(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x01f8:
            com.facebook.pando.TreeJNI r4 = X.C86164wN.A0J(r15)
            if (r4 == 0) goto L_0x027c
            java.lang.Class<com.facebook.graphql.impls.PayerNameResponseImpl> r3 = com.facebook.graphql.impls.PayerNameResponseImpl.class
            com.facebook.pando.TreeJNI r11 = r4.reinterpret(r3)
            if (r11 == 0) goto L_0x027c
            X.7Kr r24 = X.AnonymousClass6XO.A00
            X.66s r10 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r9 = "error_step"
            java.lang.Enum r3 = X.C86104wH.A0a(r11, r10, r9)
            if (r3 == 0) goto L_0x0494
            if (r3 == r10) goto L_0x0494
            java.lang.Class<com.facebook.graphql.impls.PayerNameResponseImpl$Error> r13 = com.facebook.graphql.impls.PayerNameResponseImpl.Error.class
            java.lang.String r12 = "error"
            com.facebook.pando.TreeJNI r3 = r11.getTreeValue(r12, r13)
            if (r3 == 0) goto L_0x0491
            com.facebook.pando.TreeJNI r4 = X.C86124wJ.A0T(r3)
            if (r4 == 0) goto L_0x0491
            java.lang.String r3 = "error_code"
            int r8 = r4.getIntValue(r3)
        L_0x022a:
            com.facebook.pando.TreeJNI r3 = r11.getTreeValue(r12, r13)
            if (r3 == 0) goto L_0x023e
            com.facebook.pando.TreeJNI r4 = X.C86124wJ.A0T(r3)
            if (r4 == 0) goto L_0x023e
            java.lang.String r3 = "error_title"
            java.lang.String r3 = r4.getStringValue(r3)
            if (r3 != 0) goto L_0x0240
        L_0x023e:
            r3 = r17
        L_0x0240:
            com.facebook.pando.TreeJNI r4 = r11.getTreeValue(r12, r13)
            if (r4 == 0) goto L_0x0254
            com.facebook.pando.TreeJNI r12 = X.C86124wJ.A0T(r4)
            if (r12 == 0) goto L_0x0254
            java.lang.String r4 = "error_description"
            java.lang.String r12 = r12.getStringValue(r4)
            if (r12 != 0) goto L_0x0256
        L_0x0254:
            r12 = r17
        L_0x0256:
            X.88i r4 = new X.88i
            r4.<init>(r8, r3, r12)
            X.7Kx r28 = X.AnonymousClass7Kx.A0B(r2, r4)
        L_0x025f:
            X.6BE r3 = X.AnonymousClass6BE.NAME
            X.5Dg r3 = X.C120927Dd.A00(r3)
            java.util.List r31 = X.C18180wK.A0n(r3)
            java.lang.Enum r3 = X.C86104wH.A0a(r11, r10, r9)
            X.66s r3 = (X.C967966s) r3
            java.lang.String r29 = "CREATE"
            java.lang.String r30 = "nux_checkout"
            r25 = r3
            r26 = r18
            r32 = r23
            r24.A0G(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x027c:
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$EmailResponse r4 = r15.A00()
            if (r4 == 0) goto L_0x0306
            java.lang.Class<com.facebook.graphql.impls.EmailResponseImpl> r3 = com.facebook.graphql.impls.EmailResponseImpl.class
            com.facebook.pando.TreeJNI r10 = r4.reinterpret(r3)
            com.facebook.graphql.impls.EmailResponseImpl r10 = (com.facebook.graphql.impls.EmailResponseImpl) r10
            if (r10 == 0) goto L_0x0306
            X.7Kr r24 = X.AnonymousClass6XO.A00
            X.66s r9 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r8 = "error_step"
            java.lang.Enum r3 = X.C86104wH.A0a(r10, r9, r8)
            if (r3 == 0) goto L_0x048b
            if (r3 == r9) goto L_0x048b
            java.lang.Class<com.facebook.graphql.impls.EmailResponseImpl$Error> r4 = com.facebook.graphql.impls.EmailResponseImpl.Error.class
            com.facebook.pando.TreeJNI r3 = X.C86154wM.A0M(r10, r4)
            com.facebook.graphql.impls.EmailResponseImpl$Error r3 = (com.facebook.graphql.impls.EmailResponseImpl.Error) r3
            if (r3 == 0) goto L_0x0488
            com.facebook.pando.TreeJNI r11 = X.C86124wJ.A0T(r3)
            if (r11 == 0) goto L_0x0488
            java.lang.String r3 = "error_code"
            int r12 = r11.getIntValue(r3)
        L_0x02b0:
            com.facebook.pando.TreeJNI r3 = X.C86154wM.A0M(r10, r4)
            com.facebook.graphql.impls.EmailResponseImpl$Error r3 = (com.facebook.graphql.impls.EmailResponseImpl.Error) r3
            if (r3 == 0) goto L_0x02c6
            com.facebook.pando.TreeJNI r11 = X.C86124wJ.A0T(r3)
            if (r11 == 0) goto L_0x02c6
            java.lang.String r3 = "error_title"
            java.lang.String r11 = r11.getStringValue(r3)
            if (r11 != 0) goto L_0x02c8
        L_0x02c6:
            r11 = r17
        L_0x02c8:
            com.facebook.pando.TreeJNI r3 = X.C86154wM.A0M(r10, r4)
            com.facebook.graphql.impls.EmailResponseImpl$Error r3 = (com.facebook.graphql.impls.EmailResponseImpl.Error) r3
            if (r3 == 0) goto L_0x02de
            com.facebook.pando.TreeJNI r4 = X.C86124wJ.A0T(r3)
            if (r4 == 0) goto L_0x02de
            java.lang.String r3 = "error_description"
            java.lang.String r4 = r4.getStringValue(r3)
            if (r4 != 0) goto L_0x02e0
        L_0x02de:
            r4 = r17
        L_0x02e0:
            X.88i r3 = new X.88i
            r3.<init>(r12, r11, r4)
            X.7Kx r28 = X.AnonymousClass7Kx.A0B(r2, r3)
        L_0x02e9:
            X.6BE r3 = X.AnonymousClass6BE.EMAIL
            X.5Dg r3 = X.C120927Dd.A00(r3)
            java.util.List r31 = X.C18180wK.A0n(r3)
            java.lang.Enum r3 = X.C86104wH.A0a(r10, r9, r8)
            X.66s r3 = (X.C967966s) r3
            java.lang.String r29 = "CREATE"
            java.lang.String r30 = "nux_checkout"
            r25 = r3
            r26 = r18
            r32 = r23
            r24.A0G(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x0306:
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$PhoneResponse r4 = r15.A01()
            if (r4 == 0) goto L_0x0394
            java.lang.Class<com.facebook.graphql.impls.PhoneResponseImpl> r3 = com.facebook.graphql.impls.PhoneResponseImpl.class
            com.facebook.pando.TreeJNI r10 = r4.reinterpret(r3)
            com.facebook.graphql.impls.PhoneResponseImpl r10 = (com.facebook.graphql.impls.PhoneResponseImpl) r10
            if (r10 == 0) goto L_0x0394
            X.7Kr r24 = X.AnonymousClass6XO.A00
            X.66s r9 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r8 = "error_step"
            java.lang.Enum r3 = X.C86104wH.A0a(r10, r9, r8)
            if (r3 == 0) goto L_0x0482
            if (r3 == r9) goto L_0x0482
            java.lang.Class<com.facebook.graphql.impls.PhoneResponseImpl$Error> r11 = com.facebook.graphql.impls.PhoneResponseImpl.Error.class
            com.facebook.pando.TreeJNI r3 = X.C86154wM.A0M(r10, r11)
            com.facebook.graphql.impls.PhoneResponseImpl$Error r3 = (com.facebook.graphql.impls.PhoneResponseImpl.Error) r3
            if (r3 == 0) goto L_0x033a
            com.facebook.pando.TreeJNI r4 = X.C86124wJ.A0T(r3)
            if (r4 == 0) goto L_0x033a
            java.lang.String r3 = "error_code"
            int r16 = r4.getIntValue(r3)
        L_0x033a:
            com.facebook.pando.TreeJNI r3 = X.C86154wM.A0M(r10, r11)
            com.facebook.graphql.impls.PhoneResponseImpl$Error r3 = (com.facebook.graphql.impls.PhoneResponseImpl.Error) r3
            if (r3 == 0) goto L_0x0350
            com.facebook.pando.TreeJNI r4 = X.C86124wJ.A0T(r3)
            if (r4 == 0) goto L_0x0350
            java.lang.String r3 = "error_title"
            java.lang.String r12 = r4.getStringValue(r3)
            if (r12 != 0) goto L_0x0352
        L_0x0350:
            r12 = r17
        L_0x0352:
            com.facebook.pando.TreeJNI r3 = X.C86154wM.A0M(r10, r11)
            com.facebook.graphql.impls.PhoneResponseImpl$Error r3 = (com.facebook.graphql.impls.PhoneResponseImpl.Error) r3
            if (r3 == 0) goto L_0x036a
            com.facebook.pando.TreeJNI r4 = X.C86124wJ.A0T(r3)
            if (r4 == 0) goto L_0x036a
            java.lang.String r3 = "error_description"
            java.lang.String r3 = r4.getStringValue(r3)
            if (r3 == 0) goto L_0x036a
            r17 = r3
        L_0x036a:
            X.88i r11 = new X.88i
            r4 = r16
            r3 = r17
            r11.<init>(r4, r12, r3)
            X.7Kx r28 = X.AnonymousClass7Kx.A0B(r2, r11)
        L_0x0377:
            X.6BE r3 = X.AnonymousClass6BE.PHONE
            X.5Dg r3 = X.C120927Dd.A00(r3)
            java.util.List r31 = X.C18180wK.A0n(r3)
            java.lang.Enum r3 = X.C86104wH.A0a(r10, r9, r8)
            X.66s r3 = (X.C967966s) r3
            java.lang.String r29 = "CREATE"
            java.lang.String r30 = "nux_checkout"
            r25 = r3
            r26 = r18
            r32 = r23
            r24.A0G(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x0394:
            boolean r3 = X.AnonymousClass7Kx.A0R(r6)
            if (r3 == 0) goto L_0x0436
            com.instagram.service.session.UserSession r9 = X.AnonymousClass7HK.A00()
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r3 = 36317470364208928(0x81068c00330f20, double:3.030652724816391E-306)
            boolean r3 = X.C63803iN.A0E(r8, r9, r3)
            if (r3 == 0) goto L_0x0436
            java.lang.String r0 = r1.A07
            X.79R r2 = new X.79R
            r2.<init>(r14, r0)
            android.util.SparseArray r9 = r1.A01
            if (r9 == 0) goto L_0x03e1
            java.lang.String r8 = r1.A06
            if (r7 == 0) goto L_0x04d2
            java.lang.Class<com.facebook.graphql.impls.CredentialResponseImpl$Credential> r3 = com.facebook.graphql.impls.CredentialResponseImpl.Credential.class
            java.lang.String r0 = "credential"
            com.facebook.pando.TreeJNI r4 = r7.getTreeValue(r0, r3)
            if (r4 == 0) goto L_0x04d2
            X.LcE r3 = X.C40307LcE.A07
            java.lang.String r0 = "credential_type"
            java.lang.Enum r6 = X.C86104wH.A0a(r4, r3, r0)
            if (r6 == 0) goto L_0x04d2
            X.LcE r4 = X.C40307LcE.A06
            X.0Oa r0 = r5.A03
            java.lang.Object r3 = r0.getValue()
            X.7j4 r3 = (X.C128167j4) r3
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r7)
            if (r6 != r4) goto L_0x0432
            r3.A0A(r2, r0, r8)
        L_0x03e1:
            android.util.SparseArray r0 = r1.A02
            if (r0 == 0) goto L_0x03f8
            X.0Oa r0 = r5.A04
            java.lang.Object r6 = r0.getValue()
            X.7j3 r6 = (X.C128157j3) r6
            X.7Kx r4 = X.AnonymousClass7Kx.A0A(r22)
            java.lang.String r3 = "CREATE"
            r0 = r23
            r6.A05(r2, r4, r3, r0)
        L_0x03f8:
            android.util.SparseArray r0 = r1.A00
            if (r0 == 0) goto L_0x0429
            if (r19 == 0) goto L_0x040b
            X.0Oa r0 = r5.A01
            X.7j5 r1 = X.C86144wL.A0R(r0)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r19)
            r1.A08(r2, r0)
        L_0x040b:
            if (r21 == 0) goto L_0x041a
            X.0Oa r0 = r5.A01
            X.7j5 r1 = X.C86144wL.A0R(r0)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r21)
            r1.A07(r2, r0)
        L_0x041a:
            if (r20 == 0) goto L_0x0429
            X.0Oa r0 = r5.A01
            X.7j5 r1 = X.C86144wL.A0R(r0)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r20)
            r1.A09(r2, r0)
        L_0x0429:
            r6 = r33
        L_0x042b:
            X.7Sj r0 = X.C122487Sj.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A02(r0, r6)
            return r0
        L_0x0432:
            r3.A07(r9, r2, r0)
            goto L_0x03e1
        L_0x0436:
            boolean r1 = X.AnonymousClass7Kx.A0O(r6)
            if (r1 == 0) goto L_0x0429
            if (r0 == 0) goto L_0x0444
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r0 = r0.A00()
            if (r0 != 0) goto L_0x0429
        L_0x0444:
            X.7Kr r29 = X.AnonymousClass6XO.A00
            X.6BE r0 = X.AnonymousClass6BE.SHIPPING_ADDRESS
            X.5Dg r5 = X.C120927Dd.A00(r0)
            X.6BE r0 = X.AnonymousClass6BE.CREDENTIALS
            X.5Dg r4 = X.C120927Dd.A00(r0)
            X.6BE r0 = X.AnonymousClass6BE.NAME
            X.5Dg r3 = X.C120927Dd.A00(r0)
            X.6BE r0 = X.AnonymousClass6BE.EMAIL
            X.5Dg r1 = X.C120927Dd.A00(r0)
            X.6BE r0 = X.AnonymousClass6BE.PHONE
            X.5Dg r0 = X.C120927Dd.A00(r0)
            X.5Dg[] r0 = new X.C89345Dg[]{r5, r4, r3, r1, r0}
            java.util.List r36 = X.C06750aI.A17(r0)
            X.66s r30 = X.C967966s.VALIDATION
            if (r14 == 0) goto L_0x0474
            X.7DP r2 = X.AnonymousClass7DP.A00(r14)
        L_0x0474:
            java.lang.String r34 = "CREATE"
            java.lang.String r35 = "nux_checkout"
            r31 = r2
            r32 = r27
            r37 = r23
            r29.A0G(r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0429
        L_0x0482:
            X.7Kx r28 = X.AnonymousClass7Kx.A0A(r10)
            goto L_0x0377
        L_0x0488:
            r12 = 0
            goto L_0x02b0
        L_0x048b:
            X.7Kx r28 = X.AnonymousClass7Kx.A0A(r10)
            goto L_0x02e9
        L_0x0491:
            r8 = 0
            goto L_0x022a
        L_0x0494:
            X.7Kx r28 = X.AnonymousClass7Kx.A0A(r11)
            goto L_0x025f
        L_0x049a:
            r8 = 0
            goto L_0x01a6
        L_0x049d:
            X.7Kx r28 = X.AnonymousClass7Kx.A0A(r11)
            goto L_0x01db
        L_0x04a3:
            r8 = 0
            goto L_0x011e
        L_0x04a6:
            X.7Kx r28 = X.AnonymousClass7Kx.A0A(r11)
            goto L_0x0153
        L_0x04ac:
            r18 = r2
            goto L_0x00e2
        L_0x04b0:
            r15 = r2
            goto L_0x00d4
        L_0x04b3:
            r33 = r6
            goto L_0x00c6
        L_0x04b7:
            r7 = r2
            if (r0 == 0) goto L_0x04bc
            goto L_0x002e
        L_0x04bc:
            r22 = r2
            if (r0 == 0) goto L_0x04c2
            goto L_0x0044
        L_0x04c2:
            r21 = r2
            if (r0 == 0) goto L_0x04c8
            goto L_0x0056
        L_0x04c8:
            r20 = r2
            if (r0 == 0) goto L_0x04ce
            goto L_0x0068
        L_0x04ce:
            r19 = r2
            goto L_0x007a
        L_0x04d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Ji.invoke(java.lang.Object):java.lang.Object");
    }
}
