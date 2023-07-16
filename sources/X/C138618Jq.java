package X;

import android.util.SparseArray;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.8Jq  reason: invalid class name and case insensitive filesystem */
public final class C138618Jq extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ SparseArray A00;
    public final /* synthetic */ M5J A01;
    public final /* synthetic */ AnonymousClass7j5 A02;
    public final /* synthetic */ OtcInput A03;
    public final /* synthetic */ OtcInput A04;
    public final /* synthetic */ LoggingContext A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138618Jq(SparseArray sparseArray, M5J m5j, AnonymousClass7j5 r4, OtcInput otcInput, OtcInput otcInput2, LoggingContext loggingContext, String str, String str2, String str3) {
        super(1);
        this.A05 = loggingContext;
        this.A07 = str;
        this.A02 = r4;
        this.A00 = sparseArray;
        this.A03 = otcInput;
        this.A08 = str2;
        this.A04 = otcInput2;
        this.A01 = m5j;
        this.A06 = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r8 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (r8 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0100, code lost:
        if (r6 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        if (r6 != null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r6 = r21
            X.7Kx r6 = (X.AnonymousClass7Kx) r6
            boolean r0 = X.AnonymousClass7Kx.A0Q(r6)
            if (r0 != 0) goto L_0x010c
            r9 = 0
            if (r6 == 0) goto L_0x00ff
            java.lang.Object r0 = r6.A01
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl r0 = (com.facebook.graphql.impls.ComponentDataMutationResponseImpl) r0
            if (r0 == 0) goto L_0x00ff
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r0 = r0.A00()
            if (r0 == 0) goto L_0x00ff
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$EmailResponse r1 = r0.A00()
            if (r1 == 0) goto L_0x00ff
            java.lang.Class<com.facebook.graphql.impls.EmailResponseImpl> r0 = com.facebook.graphql.impls.EmailResponseImpl.class
            com.facebook.pando.TreeJNI r5 = r1.reinterpret(r0)
        L_0x0025:
            java.lang.Object r0 = r6.A01
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl r0 = (com.facebook.graphql.impls.ComponentDataMutationResponseImpl) r0
            if (r0 == 0) goto L_0x0104
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r0 = r0.A00()
            if (r0 == 0) goto L_0x0104
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation$PhoneResponse r1 = r0.A01()
            if (r1 == 0) goto L_0x0104
            java.lang.Class<com.facebook.graphql.impls.PhoneResponseImpl> r0 = com.facebook.graphql.impls.PhoneResponseImpl.class
            com.facebook.pando.TreeJNI r4 = r1.reinterpret(r0)
        L_0x003d:
            java.lang.Object r0 = r6.A01
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl r0 = (com.facebook.graphql.impls.ComponentDataMutationResponseImpl) r0
            if (r0 == 0) goto L_0x0109
            com.facebook.graphql.impls.ComponentDataMutationResponseImpl$FbpayAccountMutation r0 = r0.A00()
            if (r0 == 0) goto L_0x0109
            com.facebook.pando.TreeJNI r1 = X.C86164wN.A0J(r0)
            if (r1 == 0) goto L_0x0109
            java.lang.Class<com.facebook.graphql.impls.PayerNameResponseImpl> r0 = com.facebook.graphql.impls.PayerNameResponseImpl.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)
        L_0x0055:
            if (r5 == 0) goto L_0x0063
            X.66s r1 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "error_step"
            java.lang.Enum r8 = X.C86104wH.A0a(r5, r1, r0)
            X.66s r8 = (X.C967966s) r8
            if (r8 != 0) goto L_0x007d
        L_0x0063:
            if (r4 == 0) goto L_0x0071
            X.66s r1 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "error_step"
            java.lang.Enum r8 = X.C86104wH.A0a(r4, r1, r0)
            X.66s r8 = (X.C967966s) r8
            if (r8 != 0) goto L_0x007d
        L_0x0071:
            if (r2 == 0) goto L_0x00fc
            X.66s r1 = X.C967966s.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "error_step"
            java.lang.Enum r8 = X.C86104wH.A0a(r2, r1, r0)
            X.66s r8 = (X.C967966s) r8
        L_0x007d:
            if (r8 == 0) goto L_0x00fd
            if (r8 == r1) goto L_0x00fd
            java.lang.Throwable r0 = r6.A02
            X.7Kx r11 = X.AnonymousClass7Kx.A0B(r9, r0)
        L_0x0087:
            X.7Kr r7 = X.AnonymousClass6XO.A00
            r1 = r20
            com.fbpay.logging.LoggingContext r10 = r1.A05
            X.C04220Ms.A09(r11)
            java.lang.String r12 = r1.A07
            r15 = 0
            X.7j5 r3 = r1.A02
            android.util.SparseArray r0 = r1.A00
            java.util.List r14 = X.AnonymousClass7j5.A01(r0, r12)
            java.lang.String r13 = "pux_checkout"
            com.facebookpay.otc.models.OtcInput r0 = r1.A03
            if (r0 == 0) goto L_0x00a5
            X.7DP r9 = X.AnonymousClass7DP.A00(r0)
        L_0x00a5:
            r7.A0G(r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = X.AnonymousClass7Kx.A0R(r6)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r7 = r1.A08
            com.facebookpay.otc.models.OtcInput r0 = r1.A04
            X.79R r6 = new X.79R
            r6.<init>(r0, r7)
            if (r2 == 0) goto L_0x00da
            X.M5J r7 = r1.A01
            r0 = 9
            X.M5J r7 = X.C86134wK.A0K(r7, r2, r0)
            X.56q r2 = X.AnonymousClass7IT.A01(r3, r6)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.PayerNameResponse>>"
            X.C04220Ms.A0C(r7, r0)
            com.facebook.redex.IDxObserverShape28S0400000_2_I2 r14 = new com.facebook.redex.IDxObserverShape28S0400000_2_I2
            r19 = r7
            r17 = r3
            r18 = r2
            r16 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            r2.A0K(r7, r14)
        L_0x00da:
            if (r5 == 0) goto L_0x00e9
            X.M5J r7 = r1.A01
            java.lang.String r2 = r1.A06
            r0 = 10
            X.M5J r0 = X.C86134wK.A0K(r7, r5, r0)
            X.AnonymousClass7j5.A02(r0, r6, r3, r12, r2)
        L_0x00e9:
            if (r4 == 0) goto L_0x00f8
            X.M5J r2 = r1.A01
            java.lang.String r1 = r1.A06
            r0 = 11
            X.M5J r0 = X.C86134wK.A0K(r2, r4, r0)
            X.AnonymousClass7j5.A03(r0, r6, r3, r12, r1)
        L_0x00f8:
            X.C04220Ms.A09(r11)
            return r11
        L_0x00fc:
            r8 = r9
        L_0x00fd:
            r11 = r6
            goto L_0x0087
        L_0x00ff:
            r5 = r9
            if (r6 == 0) goto L_0x0104
            goto L_0x0025
        L_0x0104:
            r4 = r9
            if (r6 == 0) goto L_0x0109
            goto L_0x003d
        L_0x0109:
            r2 = r9
            goto L_0x0055
        L_0x010c:
            r11 = r6
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138618Jq.invoke(java.lang.Object):java.lang.Object");
    }
}
