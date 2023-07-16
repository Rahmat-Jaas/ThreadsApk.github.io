package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape150S0100000_I2_5 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape150S0100000_I2_5(Object obj, int i) {
        super(1);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0234, code lost:
        r0.A0H(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0239, code lost:
        r3 = "viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x050e, code lost:
        r3.A07 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05d6, code lost:
        if (X.C63803iN.A0E(r4, r5, 36320201960527686L) != false) goto L_0x05d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0682, code lost:
        if (X.C63803iN.A0E(r4, r5, 36320201960724296L) != false) goto L_0x0684;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0798, code lost:
        X.C04220Ms.A0E(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0885, code lost:
        X.C04220Ms.A0E(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0888, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e4, code lost:
        X.C128957ke.A04(r1, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0889, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e9, code lost:
        r2 = "nuxViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x08ce, code lost:
        r2 = "loggingContext";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x08d8, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x06a6  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x06e9  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r42) {
        /*
            r41 = this;
            r0 = r41
            r3 = r42
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x002e;
                case 1: goto L_0x0045;
                case 2: goto L_0x0079;
                case 3: goto L_0x00ad;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00f8;
                case 6: goto L_0x0114;
                case 7: goto L_0x0877;
                case 8: goto L_0x014c;
                case 9: goto L_0x0422;
                case 10: goto L_0x01eb;
                case 11: goto L_0x021b;
                case 12: goto L_0x0228;
                case 13: goto L_0x0016;
                case 14: goto L_0x0016;
                case 15: goto L_0x023d;
                case 16: goto L_0x02cb;
                case 17: goto L_0x02df;
                case 18: goto L_0x031c;
                case 19: goto L_0x0345;
                case 20: goto L_0x0359;
                case 21: goto L_0x03fd;
                case 22: goto L_0x040e;
                case 23: goto L_0x042f;
                case 24: goto L_0x0009;
                case 25: goto L_0x0009;
                case 26: goto L_0x0009;
                case 27: goto L_0x043d;
                case 28: goto L_0x0454;
                case 29: goto L_0x0475;
                case 30: goto L_0x04b8;
                case 31: goto L_0x04dd;
                case 32: goto L_0x0513;
                case 33: goto L_0x052d;
                case 34: goto L_0x0555;
                case 35: goto L_0x0560;
                case 36: goto L_0x056d;
                case 37: goto L_0x057a;
                case 38: goto L_0x0737;
                case 39: goto L_0x0747;
                case 40: goto L_0x07b6;
                case 41: goto L_0x07bf;
                case 42: goto L_0x07ce;
                case 43: goto L_0x07e7;
                case 44: goto L_0x07fd;
                case 45: goto L_0x0814;
                case 46: goto L_0x082d;
                case 47: goto L_0x0837;
                case 48: goto L_0x08d1;
                case 49: goto L_0x084b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r1 = X.C18210wN.A0f(r3)
            java.lang.Object r0 = r0.A00
            X.5NL r0 = (X.AnonymousClass5NL) r0
            java.lang.String r3 = r0.A0B(r1)
        L_0x0015:
            return r3
        L_0x0016:
            r1 = r3
            X.6ga r1 = (X.C107336ga) r1
            java.lang.Object r0 = r1.A01
            if (r0 == 0) goto L_0x0023
            java.lang.String r3 = r0.toString()
            if (r3 != 0) goto L_0x0015
        L_0x0023:
            X.88i r10 = r1.A00
            if (r10 != 0) goto L_0x0889
            java.lang.String r0 = "Error information for mutation is not available."
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r0)
            throw r10
        L_0x002e:
            java.lang.String r1 = X.C18210wN.A0f(r3)
            java.lang.Object r0 = r0.A00
            X.5j8 r0 = (X.AnonymousClass5j8) r0
            X.58J r0 = r0.A0L
            if (r0 != 0) goto L_0x003e
            java.lang.String r3 = "nuxViewModel"
            goto L_0x0798
        L_0x003e:
            X.588 r0 = r0.A0R
            java.lang.Void r3 = r0.A02(r1)
            return r3
        L_0x0045:
            boolean r2 = X.AnonymousClass0wJ.A1X(r3)
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r0.A00
            X.5j8 r0 = (X.AnonymousClass5j8) r0
            com.fbpay.logging.LoggingContext r5 = r0.A0S
            if (r5 == 0) goto L_0x08ce
            X.58J r0 = r0.A0L
            if (r0 == 0) goto L_0x00e9
            X.587 r0 = r0.A0S
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A07(r0)
            X.C86104wH.A1V(r3, r2)
            java.lang.String r2 = "nux_checkout"
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_terms_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 373(0x175, float:5.23E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 2
            kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1 r4 = new kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1
            r4.<init>(r3, r5, r2, r0)
            goto L_0x00e4
        L_0x0079:
            boolean r2 = X.AnonymousClass0wJ.A1X(r3)
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r0.A00
            X.5j8 r0 = (X.AnonymousClass5j8) r0
            com.fbpay.logging.LoggingContext r4 = r0.A0S
            if (r4 == 0) goto L_0x08ce
            X.58J r0 = r0.A0L
            if (r0 == 0) goto L_0x00e9
            X.587 r0 = r0.A0S
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A07(r0)
            X.C86104wH.A1V(r3, r2)
            java.lang.String r2 = "nux_checkout"
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_ordersummary_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 337(0x151, float:4.72E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 42
            X.C128957ke.A03(r1, r4, r3, r2, r0)
            goto L_0x08d6
        L_0x00ad:
            boolean r2 = X.AnonymousClass0wJ.A1X(r3)
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r0.A00
            X.5j8 r0 = (X.AnonymousClass5j8) r0
            com.fbpay.logging.LoggingContext r5 = r0.A0S
            if (r5 == 0) goto L_0x08ce
            X.58J r0 = r0.A0L
            if (r0 == 0) goto L_0x00e9
            X.587 r0 = r0.A0S
            java.util.LinkedHashMap r6 = X.AnonymousClass7Kr.A07(r0)
            X.C86104wH.A1V(r6, r2)
            java.lang.String r8 = ""
            java.lang.String r7 = "nux_shipping_option"
            X.09x r1 = X.C128957ke.A00(r1, r8)
            java.lang.String r0 = "client_load_shippingoption_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 366(0x16e, float:5.13E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r9 = 5
            kotlin.jvm.internal.KtLambdaShape1S2200000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape1S2200000_I2
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x00e4:
            X.C128957ke.A04(r1, r5, r4)
            goto L_0x08d6
        L_0x00e9:
            java.lang.String r2 = "nuxViewModel"
            goto L_0x0885
        L_0x00ed:
            java.lang.Object r0 = r0.A00
            X.5j8 r0 = (X.AnonymousClass5j8) r0
            X.56r r0 = r0.A0U
            X.AnonymousClass7JD.A02(r0, r3)
            goto L_0x08d6
        L_0x00f8:
            java.lang.Object r1 = r0.A00
            X.5j8 r1 = (X.AnonymousClass5j8) r1
            X.58J r0 = r1.A0L
            java.lang.String r2 = "nuxViewModel"
            if (r0 == 0) goto L_0x0885
            X.587 r0 = r0.A0S
            X.0YY r0 = r0.A08
            r0.invoke(r3)
            X.58J r1 = r1.A0L
            if (r1 == 0) goto L_0x0885
            java.lang.String r0 = "otc_toggle"
            r1.A0D(r0)
            goto L_0x08d6
        L_0x0114:
            boolean r2 = X.AnonymousClass0wJ.A1X(r3)
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r0.A00
            X.5j1 r0 = (X.C92635j1) r0
            com.fbpay.logging.LoggingContext r4 = r0.A01
            if (r4 == 0) goto L_0x08ce
            X.58J r0 = r0.A00
            if (r0 != 0) goto L_0x012c
            java.lang.String r2 = "ecpViewModel"
            goto L_0x0885
        L_0x012c:
            X.587 r0 = r0.A0S
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A07(r0)
            X.C86104wH.A1V(r3, r2)
            java.lang.String r2 = "nux_checkout"
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_entityitems_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 298(0x12a, float:4.18E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 36
            X.C128957ke.A03(r1, r4, r3, r2, r0)
            goto L_0x08d6
        L_0x014c:
            X.7Kx r5 = X.C86104wH.A0S(r3)
            java.lang.Object r6 = r0.A00
            X.5j5 r6 = (X.AnonymousClass5j5) r6
            X.8mX r0 = r6.A01
            java.lang.String r9 = "viewModel"
            r10 = 0
            if (r0 != 0) goto L_0x015f
            X.C04220Ms.A0E(r9)
            throw r10
        L_0x015f:
            X.M5J r0 = r0.Abc()
            java.lang.Object r7 = r0.A08()
            java.lang.String r8 = "Required value was null."
            if (r7 == 0) goto L_0x01e6
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "ECP_SESSION_ID"
            java.lang.String r13 = r1.getString(r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "ECP_PRODUCT_ID"
            java.lang.String r14 = r1.getString(r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "ECP_CLIENT_RECEIVER_ID"
            java.lang.String r15 = r1.getString(r0)
            com.fbpay.logging.LoggingContext r12 = r6.A03
            if (r12 != 0) goto L_0x0191
            X.C86124wJ.A19()
            throw r10
        L_0x0191:
            java.lang.Object r11 = X.C86144wL.A0h(r6)
            if (r11 == 0) goto L_0x01e1
            X.69R r11 = (X.AnonymousClass69R) r11
            r17 = 80
            r16 = r10
            android.os.Bundle r4 = X.AnonymousClass7I8.A02(r10, r11, r12, r13, r14, r15, r16, r17)
            X.67k r0 = X.C969667k.EDIT
            java.lang.String r3 = "viewContext"
            X.8mX r2 = r6.A01
            if (r7 != r0) goto L_0x01c5
            if (r2 != 0) goto L_0x01af
            X.C04220Ms.A0E(r9)
            throw r10
        L_0x01af:
            androidx.fragment.app.Fragment r1 = r6.mParentFragment
            if (r1 == 0) goto L_0x01c0
            android.view.ContextThemeWrapper r0 = r6.A00
            if (r0 != 0) goto L_0x01bb
            X.C04220Ms.A0E(r3)
            throw r10
        L_0x01bb:
            r2.BrQ(r4, r0, r1, r5)
            goto L_0x08d6
        L_0x01c0:
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r8)
            throw r10
        L_0x01c5:
            if (r2 != 0) goto L_0x01cb
            X.C04220Ms.A0E(r9)
            throw r10
        L_0x01cb:
            androidx.fragment.app.Fragment r1 = r6.mParentFragment
            if (r1 == 0) goto L_0x01dc
            android.view.ContextThemeWrapper r0 = r6.A00
            if (r0 != 0) goto L_0x01d7
            X.C04220Ms.A0E(r3)
            throw r10
        L_0x01d7:
            r2.ACT(r4, r0, r1, r5)
            goto L_0x08d6
        L_0x01dc:
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r8)
            throw r10
        L_0x01e1:
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r8)
            throw r10
        L_0x01e6:
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r8)
            throw r10
        L_0x01eb:
            X.7EC r3 = (X.AnonymousClass7EC) r3
            java.lang.Object r2 = X.C86134wK.A0j(r3, r0)
            X.0YY r2 = (X.AnonymousClass0YY) r2
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
            java.lang.Throwable r1 = r3.A02
            boolean r0 = X.C18220wO.A1U(r1)
            if (r0 == 0) goto L_0x020d
            r1 = 0
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0212 }
            if (r0 == 0) goto L_0x0208
            java.lang.Object r1 = r2.invoke(r0)     // Catch:{ all -> 0x0212 }
        L_0x0208:
            X.7EC r3 = X.AnonymousClass7EC.A00(r1)
            goto L_0x0217
        L_0x020d:
            X.7EC r3 = X.AnonymousClass7EC.A01(r1)
            goto L_0x0217
        L_0x0212:
            r0 = move-exception
            X.7EC r3 = X.AnonymousClass7EC.A01(r0)
        L_0x0217:
            X.C04220Ms.A0A(r3)
            return r3
        L_0x021b:
            java.lang.Object r0 = X.C86134wK.A0j(r3, r0)
            X.564 r0 = (X.AnonymousClass564) r0
            X.56X r0 = r0.A09
            if (r0 == 0) goto L_0x0239
            X.56r r0 = r0.A09
            goto L_0x0234
        L_0x0228:
            java.lang.Object r0 = X.C86134wK.A0j(r3, r0)
            X.564 r0 = (X.AnonymousClass564) r0
            X.56X r0 = r0.A09
            if (r0 == 0) goto L_0x0239
            X.56r r0 = r0.A08
        L_0x0234:
            r0.A0H(r3)
            goto L_0x08d6
        L_0x0239:
            java.lang.String r3 = "viewModel"
            goto L_0x0798
        L_0x023d:
            X.6rw r3 = (X.C113666rw) r3
            r6 = 0
            if (r3 == 0) goto L_0x027e
            com.google.common.collect.ImmutableList r0 = r3.A00
            com.google.common.collect.ImmutableList r8 = r3.A01
            java.lang.String r6 = r3.A02
        L_0x0248:
            r7 = 0
            com.google.common.collect.ImmutableList.of()
            com.google.common.collect.ImmutableList.of()
            r9 = 10
            if (r0 == 0) goto L_0x0281
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0x(r0, r9)
            java.util.Iterator r4 = r0.iterator()
        L_0x025b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0282
            com.facebook.pando.TreeJNI r1 = X.C18210wN.A0G(r4)
            java.lang.String r0 = "normalized_email_address"
            java.lang.String r3 = r1.getStringValue(r0)
            java.lang.String r2 = X.C18250wR.A0X(r1)
            java.lang.String r0 = "is_default"
            java.lang.Boolean r1 = X.C18250wR.A0S(r1, r0)
            com.fbpay.w3c.Email r0 = new com.fbpay.w3c.Email
            r0.<init>(r1, r3, r2)
            r5.add(r0)
            goto L_0x025b
        L_0x027e:
            r0 = r6
            r8 = r6
            goto L_0x0248
        L_0x0281:
            r5 = r7
        L_0x0282:
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r5)
            java.lang.String r0 = "emails"
            X.AnonymousClass3ZT.A02(r5, r0)
            if (r8 == 0) goto L_0x02b8
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0x(r8, r9)
            java.util.Iterator r4 = r8.iterator()
        L_0x0295:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02b8
            com.facebook.pando.TreeJNI r1 = X.C18210wN.A0G(r4)
            java.lang.String r0 = "normalized_phone_number"
            java.lang.String r3 = r1.getStringValue(r0)
            java.lang.String r2 = X.C18250wR.A0X(r1)
            java.lang.String r0 = "is_default"
            java.lang.Boolean r1 = X.C18250wR.A0S(r1, r0)
            com.fbpay.w3c.Phone r0 = new com.fbpay.w3c.Phone
            r0.<init>(r1, r2, r3)
            r7.add(r0)
            goto L_0x0295
        L_0x02b8:
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r7)
            java.lang.String r0 = "phones"
            X.AnonymousClass3ZT.A02(r1, r0)
            com.fbpay.w3c.Contact r0 = new com.fbpay.w3c.Contact
            r0.<init>(r5, r1, r6)
            java.util.List r3 = X.C18180wK.A0n(r0)
            return r3
        L_0x02cb:
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r1 = r0.A00
            com.fbpay.w3c.FBPaymentServiceAddressCallback r1 = (com.fbpay.w3c.FBPaymentServiceAddressCallback) r1
            if (r3 == 0) goto L_0x02dc
            java.util.ArrayList r0 = X.C18200wM.A0s(r3)
        L_0x02d7:
            r1.CRf(r0)
            goto L_0x08d6
        L_0x02dc:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            goto L_0x02d7
        L_0x02df:
            X.7EC r3 = (X.AnonymousClass7EC) r3
            if (r3 != 0) goto L_0x02f5
            java.lang.Object r4 = r0.A00
            com.fbpay.w3c.FBPaymentServiceAddCardCallback r4 = (com.fbpay.w3c.FBPaymentServiceAddCardCallback) r4
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            java.lang.String r0 = r0.getMessage()
        L_0x02f0:
            r4.onError(r0)
            goto L_0x08d6
        L_0x02f5:
            java.lang.Throwable r2 = r3.A02
            boolean r1 = X.C18220wO.A1U(r2)
            java.lang.Object r4 = r0.A00
            com.fbpay.w3c.FBPaymentServiceAddCardCallback r4 = (com.fbpay.w3c.FBPaymentServiceAddCardCallback) r4
            if (r1 == 0) goto L_0x030a
            java.lang.Object r0 = r3.A01
            java.lang.String r0 = (java.lang.String) r0
            r4.CI0(r0)
            goto L_0x08d6
        L_0x030a:
            if (r2 == 0) goto L_0x0312
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L_0x02f0
        L_0x0312:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            java.lang.String r0 = r0.getMessage()
            goto L_0x02f0
        L_0x031c:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            if (r3 == 0) goto L_0x033a
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r3)
            java.util.Iterator r2 = r3.iterator()
        L_0x0328:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x033c
            java.lang.Object r1 = r2.next()
            com.fbpay.w3c.models.W3CCardDetail r1 = (com.fbpay.w3c.models.W3CCardDetail) r1
            com.fbpay.w3c.CardDetails r1 = r1.A00
            r4.add(r1)
            goto L_0x0328
        L_0x033a:
            X.0ZV r4 = X.AnonymousClass0ZV.A00
        L_0x033c:
            java.lang.Object r0 = r0.A00
            com.fbpay.w3c.FBPaymentServiceCardDetailsCallback r0 = (com.fbpay.w3c.FBPaymentServiceCardDetailsCallback) r0
            r0.CRf(r4)
            goto L_0x08d6
        L_0x0345:
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r1 = r0.A00
            com.fbpay.w3c.FBPaymentServiceContactCallback r1 = (com.fbpay.w3c.FBPaymentServiceContactCallback) r1
            if (r3 == 0) goto L_0x0356
            java.util.ArrayList r0 = X.C18200wM.A0s(r3)
        L_0x0351:
            r1.CRf(r0)
            goto L_0x08d6
        L_0x0356:
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            goto L_0x0351
        L_0x0359:
            X.7EC r3 = (X.AnonymousClass7EC) r3
            if (r3 != 0) goto L_0x037a
            java.lang.Object r5 = r0.A00
            com.fbpay.w3c.FBPaymentServiceRemoveCardCallback$Stub$Proxy r5 = (com.fbpay.w3c.FBPaymentServiceRemoveCardCallback$Stub$Proxy) r5
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            java.lang.String r1 = r0.getMessage()
        L_0x036a:
            r0 = -298209634(0xffffffffee39ae9e, float:-1.4366457E28)
            int r4 = X.C14030oh.A03(r0)
            android.os.Parcel r3 = android.os.Parcel.obtain()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            goto L_0x03ac
        L_0x037a:
            java.lang.Throwable r2 = r3.A02
            boolean r1 = X.C18220wO.A1U(r2)
            java.lang.Object r5 = r0.A00
            com.fbpay.w3c.FBPaymentServiceRemoveCardCallback$Stub$Proxy r5 = (com.fbpay.w3c.FBPaymentServiceRemoveCardCallback$Stub$Proxy) r5
            if (r1 == 0) goto L_0x039a
            java.lang.Object r1 = r3.A01
            java.lang.String r1 = (java.lang.String) r1
            r0 = 1579012487(0x5e1dd187, float:2.84300474E18)
            int r4 = X.C14030oh.A03(r0)
            android.os.Parcel r3 = android.os.Parcel.obtain()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            goto L_0x03c9
        L_0x039a:
            if (r2 == 0) goto L_0x03a2
            java.lang.String r1 = r2.getMessage()
            if (r1 != 0) goto L_0x036a
        L_0x03a2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            java.lang.String r1 = r0.getMessage()
            goto L_0x036a
        L_0x03ac:
            java.lang.String r0 = "com.fbpay.w3c.FBPaymentServiceRemoveCardCallback"
            r3.writeInterfaceToken(r0)     // Catch:{ all -> 0x03bb }
            r3.writeString(r1)     // Catch:{ all -> 0x03bb }
            android.os.IBinder r1 = r5.A00     // Catch:{ all -> 0x03bb }
            r0 = 2
            X.C86104wH.A19(r1, r3, r2, r0)     // Catch:{ all -> 0x03bb }
            goto L_0x03e1
        L_0x03bb:
            r1 = move-exception
            r2.recycle()
            r3.recycle()
            r0 = -1582631632(0xffffffffa1aaf530, float:-1.1584549E-18)
            X.C14030oh.A0A(r0, r4)
            throw r1
        L_0x03c9:
            java.lang.String r0 = "com.fbpay.w3c.FBPaymentServiceRemoveCardCallback"
            r3.writeInterfaceToken(r0)     // Catch:{ all -> 0x03ef }
            r3.writeString(r1)     // Catch:{ all -> 0x03ef }
            android.os.IBinder r1 = r5.A00     // Catch:{ all -> 0x03ef }
            r0 = 1
            X.C86104wH.A19(r1, r3, r2, r0)     // Catch:{ all -> 0x03ef }
            r2.recycle()
            r3.recycle()
            r0 = 1220025894(0x48b81e26, float:377073.2)
            goto L_0x03ea
        L_0x03e1:
            r2.recycle()
            r3.recycle()
            r0 = -952524116(0xffffffffc739a2ac, float:-47522.67)
        L_0x03ea:
            X.C14030oh.A0A(r0, r4)
            goto L_0x08d6
        L_0x03ef:
            r10 = move-exception
            r2.recycle()
            r3.recycle()
            r0 = 1333208734(0x4f77269e, float:4.14650317E9)
            X.C14030oh.A0A(r0, r4)
            throw r10
        L_0x03fd:
            X.7EC r3 = (X.AnonymousClass7EC) r3
            java.lang.Object r0 = X.C86134wK.A0j(r3, r0)
            X.76P r0 = (X.AnonymousClass76P) r0
            monitor-enter(r0)
            r0.A00 = r3     // Catch:{ all -> 0x041f }
            X.7EC r3 = X.AnonymousClass76P.A00(r0)     // Catch:{ all -> 0x041f }
            monitor-exit(r0)
            return r3
        L_0x040e:
            X.7EC r3 = (X.AnonymousClass7EC) r3
            java.lang.Object r0 = X.C86134wK.A0j(r3, r0)
            X.76P r0 = (X.AnonymousClass76P) r0
            monitor-enter(r0)
            r0.A01 = r3     // Catch:{ all -> 0x041f }
            X.7EC r3 = X.AnonymousClass76P.A00(r0)     // Catch:{ all -> 0x041f }
            monitor-exit(r0)
            return r3
        L_0x041f:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L_0x0422:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            boolean r0 = X.AnonymousClass7Kx.A0R(r3)
            if (r0 == 0) goto L_0x042d
            java.lang.Object r3 = r3.A01
            return r3
        L_0x042d:
            r3 = 0
            return r3
        L_0x042f:
            X.4vo r3 = (X.C85814vo) r3
            java.lang.Object r0 = r0.A00
            X.H1T r0 = (X.H1T) r0
            X.0i6 r1 = r0.A06
            java.lang.String r0 = r0.A03
            X.C32702Cw.A00(r3, r1, r0)
            return r3
        L_0x043d:
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            java.lang.Object r2 = X.C86134wK.A0j(r3, r0)
            X.K8N r2 = (X.K8N) r2
            X.JXy r1 = r2.A05
            X.GXK r0 = r2.A06
            r1.A08(r0, r3)
            int r0 = r2.A00
            int r0 = r0 + 1
            r2.A00 = r0
            goto L_0x08d6
        L_0x0454:
            X.7Dm r3 = X.C86124wJ.A0b(r3)
            r2 = 2131493942(0x7f0c0436, float:1.8611378E38)
            X.6dh r1 = new X.6dh
            r1.<init>(r2)
            r3.A02 = r1
            java.lang.Object r0 = r0.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r0.requireContext()
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>()
            r3.A01 = r0
            r0 = 0
            r3.A04 = r0
            goto L_0x050e
        L_0x0475:
            long r8 = X.C18190wL.A08(r3)
            java.lang.Object r1 = r0.A00
            X.5xd r1 = (X.AnonymousClass5xd) r1
            X.0Oa r0 = r1.A08
            java.lang.Object r4 = r0.getValue()
            X.58E r4 = (X.AnonymousClass58E) r4
            android.os.Bundle r1 = r1.requireArguments()
            java.lang.String r0 = "arg_media_id"
            java.lang.String r5 = r1.getString(r0)
            if (r5 == 0) goto L_0x04b3
            r7 = 0
            X.4wE r0 = r4.A06
            java.lang.Object r3 = r0.getValue()
            boolean r0 = r3 instanceof X.AnonymousClass5LQ
            if (r0 == 0) goto L_0x04ac
            X.4qz r1 = X.AnonymousClass3J5.A00(r4)
            r6 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S1201100_I2 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S1201100_I2
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 3
            X.C25237DiI.A00(r6, r6, r2, r1, r0)
            goto L_0x08d6
        L_0x04ac:
            java.lang.String r0 = "[appreciation gift feed] illegal view state"
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r0)
            throw r10
        L_0x04b3:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            throw r10
        L_0x04b8:
            X.7Dm r3 = X.C86124wJ.A0b(r3)
            r2 = 2131493943(0x7f0c0437, float:1.861138E38)
            X.6dh r1 = new X.6dh
            r1.<init>(r2)
            r3.A02 = r1
            java.lang.Object r0 = r0.A00
            android.content.Context r2 = X.C18220wO.A0A(r0)
            r1 = 1
            com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager r0 = new com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager
            r0.<init>(r2)
            r3.A01 = r0
            r0 = 0
            r3.A04 = r0
            r3.A07 = r1
            r3.A08 = r1
            goto L_0x08d6
        L_0x04dd:
            X.7Dm r3 = (X.AnonymousClass7Dm) r3
            r5 = 0
            X.C04220Ms.A0B(r3, r5)
            r2 = 2131493944(0x7f0c0438, float:1.8611382E38)
            X.6dh r1 = new X.6dh
            r1.<init>(r2)
            r3.A02 = r1
            java.lang.Object r4 = r0.A00
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            android.content.Context r2 = r4.requireContext()
            r0 = 3
            com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager r1 = new com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager
            r1.<init>(r2, r0)
            androidx.recyclerview.widget.IDxSLookupShape43S0100000_2_I2 r0 = new androidx.recyclerview.widget.IDxSLookupShape43S0100000_2_I2
            r0.<init>(r4, r5)
            r1.A02 = r0
            r3.A01 = r1
            r0 = 0
            r3.A04 = r0
            androidx.recyclerview.widget.IDxIDecorationShape56S0100000_2_I2 r0 = new androidx.recyclerview.widget.IDxIDecorationShape56S0100000_2_I2
            r0.<init>(r4, r5)
            r3.A00 = r0
        L_0x050e:
            r0 = 1
            r3.A07 = r0
            goto L_0x08d6
        L_0x0513:
            java.lang.String r3 = (java.lang.String) r3
            r2 = 0
            X.C04220Ms.A0B(r3, r2)
            java.lang.Object r0 = r0.A00
            X.5xY r0 = (X.AnonymousClass5xY) r0
            X.0Oa r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.C8j r0 = (X.C21924C8j) r0
            r1 = 1
            X.Gqg r0 = r0.A00
            r0.A01(r2, r3, r1)
            goto L_0x08d6
        L_0x052d:
            X.7Dm r3 = X.C86124wJ.A0b(r3)
            java.lang.Object r2 = r0.A00
            X.5xY r2 = (X.AnonymousClass5xY) r2
            int r1 = r2.A00()
            X.6dh r0 = new X.6dh
            r0.<init>(r1)
            r3.A02 = r0
            r2.getContext()
            r1 = 3
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>(r1)
            r3.A01 = r0
            r1 = 1
            androidx.recyclerview.widget.IDxIDecorationShape56S0100000_2_I2 r0 = new androidx.recyclerview.widget.IDxIDecorationShape56S0100000_2_I2
            r0.<init>(r2, r1)
            r3.A00 = r0
            goto L_0x08d6
        L_0x0555:
            java.lang.Object r0 = r0.A00
            X.57J r0 = (X.AnonymousClass57J) r0
            X.4wE r0 = r0.A03
            r0.CrC(r3)
            goto L_0x08d6
        L_0x0560:
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r0 = X.C86134wK.A0j(r3, r0)
            X.0i6 r0 = (X.C10300i6) r0
            X.Drz r3 = X.C18180wK.A0Q(r3, r0)
            return r3
        L_0x056d:
            java.lang.String r1 = X.C18210wN.A0f(r3)
            java.lang.Object r0 = r0.A00
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            X.C86154wM.A1W(r0, r1)
            goto L_0x08d6
        L_0x057a:
            r6 = 0
            X.C04220Ms.A0B(r3, r6)
            X.CQm r1 = X.C22255CQm.A00
            boolean r1 = r3.equals(r1)
            java.lang.Object r0 = r0.A00
            X.CAb r0 = (X.C21967CAb) r0
            X.4wE r7 = r0.A06
            if (r1 == 0) goto L_0x0734
            r13 = 2131232587(0x7f08074b, float:1.8081287E38)
            r14 = 2131826701(0x7f11180d, float:1.9286294E38)
            r15 = 2131826702(0x7f11180e, float:1.9286296E38)
            boolean r3 = r0.A08
            com.facebook.redex.IDxTListenerShape296S0100000_2_I2 r11 = new com.facebook.redex.IDxTListenerShape296S0100000_2_I2
            r11.<init>(r0, r6)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            X.3ry r10 = X.C64853ry.A00
            r18 = 1
            r16 = 56
            r21 = 0
            X.DYQ r9 = new X.DYQ
            r19 = r3
            r17 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository r8 = r0.A01
            boolean r1 = r8.A04()
            if (r1 != 0) goto L_0x05d8
            com.instagram.service.session.UserSession r5 = r0.A04
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 36320201960265538(0x81090800031742, double:3.032380197161846E-306)
            java.lang.Boolean r1 = X.C63803iN.A05(r4, r5, r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x05d8
            r1 = 36320201960527686(0x81090800071746, double:3.0323801973276293E-306)
            boolean r2 = X.C63803iN.A0E(r4, r5, r1)
            r1 = 1
            if (r2 == 0) goto L_0x05d9
        L_0x05d8:
            r1 = 0
        L_0x05d9:
            r13 = 0
            if (r1 == 0) goto L_0x0731
            X.C21967CAb.A00(r0)
        L_0x05df:
            r23 = 2131232435(0x7f0806b3, float:1.808098E38)
            r1 = 93
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r20 = X.C86134wK.A0P(r0, r1)
            r26 = 1016(0x3f8, float:1.424E-42)
            X.DYQ r19 = new X.DYQ
            r22 = r13
            r24 = r14
            r25 = r15
            r27 = r6
            r28 = r6
            r29 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = r8.A04()
            if (r1 != 0) goto L_0x072d
            com.instagram.service.session.UserSession r5 = r0.A04
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 36320201960265538(0x81090800031742, double:3.032380197161846E-306)
            java.lang.Boolean r1 = X.C63803iN.A05(r4, r5, r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x072d
            if (r3 != 0) goto L_0x072d
            r1 = 36320201960527686(0x81090800071746, double:3.0323801973276293E-306)
            boolean r1 = X.C63803iN.A0E(r4, r5, r1)
            if (r1 == 0) goto L_0x072d
            X.C21967CAb.A00(r0)
        L_0x0624:
            r31 = 2131232563(0x7f080733, float:1.8081239E38)
            r32 = 2131826681(0x7f1117f9, float:1.9286253E38)
            r33 = 2131826682(0x7f1117fa, float:1.9286255E38)
            r1 = 94
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r28 = X.C86134wK.A0P(r0, r1)
            X.DYQ r27 = new X.DYQ
            r29 = r13
            r30 = r13
            r34 = r26
            r35 = r6
            r36 = r6
            r37 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r32 = 2131232857(0x7f080859, float:1.8081835E38)
            r33 = 2131826679(0x7f1117f7, float:1.928625E38)
            r34 = 2131826680(0x7f1117f8, float:1.9286251E38)
            r1 = 95
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r29 = X.C86134wK.A0P(r0, r1)
            X.DYQ r28 = new X.DYQ
            r31 = r13
            r35 = r26
            r38 = r6
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            boolean r1 = r8.A04()
            if (r1 != 0) goto L_0x0729
            com.instagram.service.session.UserSession r5 = r0.A04
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 36320201960265538(0x81090800031742, double:3.032380197161846E-306)
            java.lang.Boolean r1 = X.C63803iN.A05(r4, r5, r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0729
            if (r3 == 0) goto L_0x0729
            r1 = 36320201960724296(0x810908000a1748, double:3.032380197451966E-306)
            boolean r1 = X.C63803iN.A0E(r4, r5, r1)
            if (r1 == 0) goto L_0x0729
        L_0x0684:
            r33 = 2131232459(0x7f0806cb, float:1.8081028E38)
            r34 = 2131826699(0x7f11180b, float:1.928629E38)
            r35 = 2131826700(0x7f11180c, float:1.9286292E38)
            r1 = 91
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r30 = X.C86134wK.A0P(r0, r1)
            r36 = 1008(0x3f0, float:1.413E-42)
            X.DYQ r29 = new X.DYQ
            r32 = r13
            r37 = r18
            r39 = r6
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            boolean r1 = r8.A04()
            if (r1 != 0) goto L_0x0726
            com.instagram.service.session.UserSession r5 = r0.A04
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 36320201960265538(0x81090800031742, double:3.032380197161846E-306)
            java.lang.Boolean r1 = X.C63803iN.A05(r4, r5, r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0726
            if (r3 == 0) goto L_0x0726
            r1 = 36320201960527686(0x81090800071746, double:3.0323801973276293E-306)
            boolean r1 = X.C63803iN.A0E(r4, r5, r1)
            if (r1 == 0) goto L_0x0726
            X.C21967CAb.A00(r0)
        L_0x06c9:
            r34 = 2131232256(0x7f080600, float:1.8080616E38)
            r35 = 2131826687(0x7f1117ff, float:1.9286265E38)
            r36 = 2131826688(0x7f111800, float:1.9286267E38)
            r1 = 92
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r31 = X.C86134wK.A0P(r0, r1)
            X.DYQ r30 = new X.DYQ
            r33 = r13
            r37 = r26
            r40 = r6
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            boolean r1 = r8.A04()
            if (r1 != 0) goto L_0x070b
            com.instagram.service.session.UserSession r4 = r0.A04
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36320201960265538(0x81090800031742, double:3.032380197161846E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r4, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x070b
            if (r3 == 0) goto L_0x070b
            r0 = 36322418163195219(0x810b0c00001d53, double:3.033781732818509E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x070b
            r13 = r30
        L_0x070b:
            r8 = r9
            r9 = r19
            r10 = r27
            r11 = r28
            r12 = r29
            X.DYQ[] r0 = new X.DYQ[]{r8, r9, r10, r11, r12, r13}
            java.util.List r1 = X.AnonymousClass8AP.A0A(r0)
            X.CQF r0 = new X.CQF
            r0.<init>(r1)
        L_0x0721:
            r7.CrC(r0)
            goto L_0x08d6
        L_0x0726:
            r29 = r13
            goto L_0x06c9
        L_0x0729:
            r28 = r13
            goto L_0x0684
        L_0x072d:
            r19 = r13
            goto L_0x0624
        L_0x0731:
            r9 = r13
            goto L_0x05df
        L_0x0734:
            X.CQH r0 = X.CQH.A00
            goto L_0x0721
        L_0x0737:
            java.lang.Object r1 = X.C86134wK.A0j(r3, r0)
            X.CRs r1 = (X.C22275CRs) r1
            X.CQm r0 = X.C22255CQm.A00
            boolean r0 = r3.equals(r0)
            r1.A09 = r0
            goto L_0x08d6
        L_0x0747:
            r6 = 0
            X.C04220Ms.A0B(r3, r6)
            X.CQm r1 = X.C22255CQm.A00
            boolean r5 = r3.equals(r1)
            java.lang.Object r4 = r0.A00
            X.CRI r4 = (X.CRI) r4
            java.lang.String r3 = "loadingSpinner"
            java.lang.String r2 = "recyclerView"
            r1 = 8
            android.view.View r0 = r4.A01
            if (r5 == 0) goto L_0x0786
            if (r0 == 0) goto L_0x07b3
            r0.setVisibility(r1)
            com.instagram.igds.components.search.InlineSearchBox r0 = r4.A08
            if (r0 == 0) goto L_0x07b0
            r0.setVisibility(r6)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            if (r0 == 0) goto L_0x0885
            r0.setVisibility(r6)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A09
            if (r0 == 0) goto L_0x0798
            r0.setVisibility(r6)
            X.0Oa r0 = r4.A0H
            java.lang.Object r0 = r0.getValue()
            X.CBc r0 = (X.C21990CBc) r0
            r0.A02()
            goto L_0x08d6
        L_0x0786:
            if (r0 == 0) goto L_0x07b3
            r0.setVisibility(r6)
            com.instagram.igds.components.search.InlineSearchBox r0 = r4.A08
            if (r0 == 0) goto L_0x07b0
            r0.setVisibility(r1)
            X.Ayd r0 = r4.A07
            if (r0 != 0) goto L_0x079d
            java.lang.String r3 = "emptySearchResult"
        L_0x0798:
            X.C04220Ms.A0E(r3)
            goto L_0x0888
        L_0x079d:
            r0.A09(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            if (r0 == 0) goto L_0x0885
            r0.setVisibility(r1)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A09
            if (r0 == 0) goto L_0x0798
            r0.setVisibility(r1)
            goto L_0x08d6
        L_0x07b0:
            java.lang.String r3 = "searchBox"
            goto L_0x0798
        L_0x07b3:
            java.lang.String r3 = "noAvatarNux"
            goto L_0x0798
        L_0x07b6:
            java.lang.Object r0 = X.C86134wK.A0j(r3, r0)
            X.C86134wK.A1L(r0, r3)
            goto L_0x08d6
        L_0x07bf:
            int r1 = X.AnonymousClass0wJ.A04(r3)
            java.lang.Object r0 = r0.A00
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r1)
            X.0Ai r3 = X.C86124wJ.A16(r0)
            return r3
        L_0x07ce:
            X.8pw r3 = (X.C147798pw) r3
            java.lang.Object r0 = X.C86134wK.A0j(r3, r0)
            com.instagram.barcelona.bds.components.header.EnterAlwaysState r0 = (com.instagram.barcelona.bds.components.header.EnterAlwaysState) r0
            float r1 = com.instagram.barcelona.bds.components.header.EnterAlwaysState.A00(r0)
            int r0 = r0.A01
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            X.7Wz r3 = (X.C123457Wz) r3
            r3.A00 = r0
            goto L_0x08d6
        L_0x07e7:
            X.8pw r3 = (X.C147798pw) r3
            java.lang.Object r2 = X.C86134wK.A0j(r3, r0)
            com.instagram.barcelona.bds.components.header.EnterAlwaysState r2 = (com.instagram.barcelona.bds.components.header.EnterAlwaysState) r2
            int r0 = r2.A01
            float r1 = (float) r0
            float r0 = com.instagram.barcelona.bds.components.header.EnterAlwaysState.A00(r2)
            float r1 = r1 - r0
            X.7Wz r3 = (X.C123457Wz) r3
            r3.A07 = r1
            goto L_0x08d6
        L_0x07fd:
            X.6qg r3 = (X.C113076qg) r3
            java.lang.Object r1 = X.C86134wK.A0j(r3, r0)
            com.instagram.barcelona.bds.components.header.EnterAlwaysState r1 = (com.instagram.barcelona.bds.components.header.EnterAlwaysState) r1
            X.8pE r0 = r3.A06
            java.lang.Object r0 = r0.getValue()
            float r0 = X.C18240wQ.A00(r0)
            r1.A01(r0)
            goto L_0x08d6
        L_0x0814:
            X.6qg r3 = (X.C113076qg) r3
            java.lang.Object r2 = X.C86134wK.A0j(r3, r0)
            com.instagram.barcelona.bds.components.header.EnterAlwaysState r2 = (com.instagram.barcelona.bds.components.header.EnterAlwaysState) r2
            X.8pE r0 = r3.A06
            java.lang.Object r0 = r0.getValue()
            float r1 = X.C18240wQ.A00(r0)
            X.8pE r0 = r2.A03
            X.C147368pE.A02(r0, r1)
            goto L_0x08d6
        L_0x082d:
            X.75O r3 = (X.AnonymousClass75O) r3
            java.lang.Object r0 = X.C86134wK.A0j(r3, r0)
            r3.A00 = r0
            goto L_0x08d6
        L_0x0837:
            java.lang.Object r0 = r0.A00
            X.6kr r0 = (X.C109936kr) r0
            X.7A5 r0 = r0.A01
            float r0 = r0.A01()
            int r1 = X.AnonymousClass8bA.A02(r0)
            r0 = 0
            X.7Eg r3 = X.AnonymousClass7Hh.A04(r0, r1)
            return r3
        L_0x084b:
            java.lang.Number r3 = (java.lang.Number) r3
            r3.floatValue()
            java.lang.Object r2 = r0.A00
            X.6kr r2 = (X.C109936kr) r2
            X.8nV r1 = r2.A00
            if (r1 == 0) goto L_0x0863
            float r0 = X.AnonymousClass7GX.A01
            float r0 = r1.CxL(r0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L_0x0863:
            java.lang.String r0 = "The density on ModalBottomSheetState ("
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r1.append(r2)
            java.lang.String r0 = ") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?"
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)
            java.lang.IllegalArgumentException r10 = X.C18190wL.A0a(r0)
            throw r10
        L_0x0877:
            X.7Kx r5 = X.C86104wH.A0S(r3)
            java.lang.Object r6 = r0.A00
            X.5j5 r6 = (X.AnonymousClass5j5) r6
            X.8mX r4 = r6.A01
            if (r4 != 0) goto L_0x088a
            java.lang.String r2 = "viewModel"
        L_0x0885:
            X.C04220Ms.A0E(r2)
        L_0x0888:
            r10 = 0
        L_0x0889:
            throw r10
        L_0x088a:
            androidx.fragment.app.Fragment r3 = r6.mParentFragment
            java.lang.String r7 = "Required value was null."
            if (r3 == 0) goto L_0x08de
            android.view.ContextThemeWrapper r2 = r6.A00
            if (r2 != 0) goto L_0x0897
            java.lang.String r2 = "viewContext"
            goto L_0x0885
        L_0x0897:
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "ECP_SESSION_ID"
            java.lang.String r11 = r1.getString(r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "ECP_PRODUCT_ID"
            java.lang.String r12 = r1.getString(r0)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "ECP_CLIENT_RECEIVER_ID"
            java.lang.String r13 = r1.getString(r0)
            com.fbpay.logging.LoggingContext r10 = r6.A03
            if (r10 == 0) goto L_0x08ce
            r8 = 0
            java.lang.Object r9 = X.C86144wL.A0h(r6)
            if (r9 == 0) goto L_0x08d9
            X.69R r9 = (X.AnonymousClass69R) r9
            r15 = 16
            java.lang.String r14 = "selectionContentRequestKey"
            android.os.Bundle r0 = X.AnonymousClass7I8.A02(r8, r9, r10, r11, r12, r13, r14, r15)
            r4.BrQ(r0, r2, r3, r5)
            goto L_0x08d6
        L_0x08ce:
            java.lang.String r2 = "loggingContext"
            goto L_0x0885
        L_0x08d1:
            java.lang.Object r0 = r0.A00
            X.C18240wQ.A1G(r0)
        L_0x08d6:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x08d9:
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r7)
            throw r10
        L_0x08de:
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape150S0100000_I2_5.invoke(java.lang.Object):java.lang.Object");
    }
}
