package com.facebook.redex;

import X.AnonymousClass0YY;
import X.AnonymousClass57Y;
import kotlin.Function;

public class IDxObjectShape308S0100000_2_I2 implements Function, AnonymousClass0YY {
    public Object A00;
    public final int A01;

    public IDxObjectShape308S0100000_2_I2(AnonymousClass57Y r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0858, code lost:
        return com.google.common.collect.ImmutableList.of();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        X.C122037Js.A06((com.fbpay.logging.FBPayLoggerData) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b2, code lost:
        return X.AnonymousClass7Kx.A09(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        return X.AnonymousClass7Kx.A0B(r1, r7.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        return X.AnonymousClass7Kx.A0A(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r4 = r18
            r7 = r19
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0150;
                case 1: goto L_0x0009;
                case 2: goto L_0x0141;
                case 3: goto L_0x003a;
                case 4: goto L_0x016d;
                case 5: goto L_0x01ca;
                case 6: goto L_0x020d;
                case 7: goto L_0x0229;
                case 8: goto L_0x023e;
                case 9: goto L_0x0017;
                case 10: goto L_0x0092;
                case 11: goto L_0x02c0;
                case 12: goto L_0x02c9;
                case 13: goto L_0x02d2;
                case 14: goto L_0x0309;
                case 15: goto L_0x032a;
                case 16: goto L_0x03d8;
                case 17: goto L_0x0493;
                case 18: goto L_0x05af;
                case 19: goto L_0x0033;
                case 20: goto L_0x061f;
                case 21: goto L_0x0009;
                case 22: goto L_0x000e;
                case 23: goto L_0x00bf;
                case 24: goto L_0x0624;
                case 25: goto L_0x06fd;
                case 26: goto L_0x071b;
                case 27: goto L_0x07cf;
                case 28: goto L_0x0859;
                case 29: goto L_0x0862;
                case 30: goto L_0x086b;
                case 31: goto L_0x0876;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.C122037Js.A06(r0)
            throw r0
        L_0x000e:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            if (r0 == 0) goto L_0x089b
            goto L_0x0009
        L_0x0017:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            r1 = 0
            if (r0 != 0) goto L_0x00ba
            boolean r0 = X.AnonymousClass7Kx.A0O(r7)
            if (r0 != 0) goto L_0x00b3
            boolean r0 = X.AnonymousClass7Kx.A0P(r7)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "not possible"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x0033:
            java.lang.String r0 = "fetchCurrencies"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x003a:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            X.67Q r1 = r7.A00
            X.67Q r0 = X.AnonymousClass67Q.ERROR
            r3 = 0
            if (r1 != r0) goto L_0x0072
            java.lang.Object r0 = r4.A00
            X.57X r0 = (X.AnonymousClass57X) r0
            X.56r r2 = r0.A04
            java.lang.Object r0 = r2.A08()
            r0.getClass()
            java.lang.Object r1 = r2.A08()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r0 = "purchase"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x008e
            java.lang.Object r1 = r2.A08()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r0 = "p2p"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x008e
            X.6r4 r3 = new X.6r4
            r3.<init>()
        L_0x0071:
            return r3
        L_0x0072:
            X.67Q r0 = X.AnonymousClass67Q.SUCCESS
            if (r1 != r0) goto L_0x0071
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r7)
            java.util.Iterator r1 = X.C86144wL.A0y(r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0071
            r1.next()
            java.lang.String r0 = "getMutationError"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x008e:
            X.C122037Js.A06(r3)
            throw r3
        L_0x0092:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            r1 = 0
            if (r0 != 0) goto L_0x00ba
            boolean r0 = X.AnonymousClass7Kx.A0O(r7)
            if (r0 != 0) goto L_0x00b3
            boolean r0 = X.AnonymousClass7Kx.A0P(r7)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "not possible"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x00ae:
            X.7Kx r3 = X.AnonymousClass7Kx.A09(r1)
            return r3
        L_0x00b3:
            java.lang.Throwable r0 = r7.A02
            X.7Kx r3 = X.AnonymousClass7Kx.A0B(r1, r0)
            return r3
        L_0x00ba:
            X.7Kx r3 = X.AnonymousClass7Kx.A0A(r1)
            return r3
        L_0x00bf:
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.Object r4 = r4.A00
            X.57v r4 = (X.C883857v) r4
            com.fbpay.hub.form.params.FormParams r0 = r4.A01
            java.lang.String r3 = r0.A09
            if (r3 != 0) goto L_0x00cd
            java.lang.String r3 = "FBPAY_HUB"
        L_0x00cd:
            X.6gb r8 = r4.A09
            X.57n r0 = r4.A00
            android.util.SparseArray r6 = r0.A00()
            com.fbpay.hub.form.params.FormParams r2 = r4.A01
            java.lang.String r1 = r2.A08
            r0 = 12
            r6.put(r0, r1)
            com.fbpay.logging.FBPayLoggerData r0 = r2.A02
            if (r0 == 0) goto L_0x00eb
            r1 = 22
            java.lang.String r0 = r0.A00()
            r6.put(r1, r0)
        L_0x00eb:
            com.fbpay.hub.form.params.FormParams r0 = r4.A01
            int r2 = r0.A04
            int r10 = r7.intValue()
            X.34a r1 = r8.A01
            if (r2 == 0) goto L_0x012a
            r0 = 1
            if (r2 == r0) goto L_0x0124
            r0 = 2
            if (r2 == r0) goto L_0x011e
            r0 = 3
            if (r2 == r0) goto L_0x0116
            r0 = 5
            if (r2 != r0) goto L_0x0132
            com.instagram.service.session.UserSession r0 = r1.A00
            X.7kT r7 = new X.7kT
            r7.<init>(r0)
        L_0x010a:
            X.6ci r9 = r8.A00
            X.5k2 r5 = new X.5k2
            r5.<init>(r6, r7, r8, r9, r10)
            X.M5J r3 = r5.A03()
            return r3
        L_0x0116:
            com.instagram.service.session.UserSession r0 = r1.A00
            X.7kW r7 = new X.7kW
            r7.<init>(r0, r3)
            goto L_0x010a
        L_0x011e:
            X.7kS r7 = new X.7kS
            r7.<init>()
            goto L_0x010a
        L_0x0124:
            X.7kV r7 = new X.7kV
            r7.<init>()
            goto L_0x010a
        L_0x012a:
            com.instagram.service.session.UserSession r0 = r1.A00
            X.7kU r7 = new X.7kU
            r7.<init>(r0)
            goto L_0x010a
        L_0x0132:
            r0 = 744(0x2e8, float:1.043E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r2)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0141:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            X.67Q r1 = r7.A00
            X.67Q r0 = X.AnonymousClass67Q.LOADING
            boolean r0 = X.C18180wK.A1Z(r1, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0150:
            android.util.Pair r7 = (android.util.Pair) r7
            java.lang.Object r0 = r4.A00
            X.572 r0 = (X.AnonymousClass572) r0
            java.lang.Object r2 = r7.first
            X.6c4 r2 = (X.C104616c4) r2
            X.7IP r1 = r0.A01
            com.fbpay.logging.FBPayLoggerData r0 = r0.A00
            X.M5J r2 = r1.A04(r2, r0)
            r1 = 0
            com.facebook.redex.IDxObjectShape133S0200000_2_I2 r0 = new com.facebook.redex.IDxObjectShape133S0200000_2_I2
            r0.<init>(r1, r7, r4)
            X.M5J r3 = X.C30821GXg.A01(r2, r0)
            return r3
        L_0x016d:
            java.lang.Object r2 = r4.A00
            X.5hV r2 = (X.C92045hV) r2
            com.facebook.pando.TreeJNI r7 = (com.facebook.pando.TreeJNI) r7
            com.facebookpay.addresstypeahead.controller.AddressTypeaheadController r5 = r2.A00
            if (r5 == 0) goto L_0x01a0
            X.5hR r0 = r2.A01
            if (r0 == 0) goto L_0x01a0
            r6 = 0
            X.56r r1 = r0.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            X.AnonymousClass7JD.A02(r1, r0)
            java.lang.Class<com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl$FetchAddressSuggestions$Suggestions$AddressDetails> r1 = com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl.FetchAddressSuggestions.Suggestions.AddressDetails.class
            java.lang.String r0 = "address_details"
            com.facebook.pando.TreeJNI r1 = r7.getTreeValue(r0, r1)
            java.lang.String r0 = "address_id"
            java.lang.String r4 = r7.getStringValue(r0)
            if (r1 == 0) goto L_0x01a3
            java.lang.Class<com.facebook.graphql.impls.TypeaheadAddressDetailsImpl> r0 = com.facebook.graphql.impls.TypeaheadAddressDetailsImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            com.facebook.graphql.impls.TypeaheadAddressDetailsImpl r0 = (com.facebook.graphql.impls.TypeaheadAddressDetailsImpl) r0
            X.C92045hV.A02(r0, r2)
        L_0x01a0:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x01a3:
            if (r4 == 0) goto L_0x01a0
            X.5hR r0 = r2.A01
            X.56q r2 = r0.A06
            com.fbpay.theme.FBPayIcon r1 = com.fbpay.theme.FBPayIcon.LOADING_SPINNER
            X.75V r0 = new X.75V
            r0.<init>((com.fbpay.theme.FBPayIcon) r1)
            r2.A0H(r0)
            X.8sG r0 = r5.A01
            r3 = 0
            if (r0 == 0) goto L_0x01bb
            r0.AC7(r3)
        L_0x01bb:
            X.4qz r2 = r5.A0A
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2
            r1.<init>(r5, r4, r3, r6)
            r0 = 3
            X.8sG r0 = X.C25237DiI.A00(r3, r3, r1, r2, r0)
            r5.A01 = r0
            goto L_0x01a0
        L_0x01ca:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            java.lang.Object r0 = r4.A00
            X.583 r0 = (X.AnonymousClass583) r0
            X.7Gx r1 = r0.A01
            r0 = 15
            int r0 = r1.A03(r0)
            r2 = 0
            if (r0 == 0) goto L_0x01e5
            X.88g r1 = new X.88g
            r1.<init>(r0)
        L_0x01e0:
            X.7Kx r3 = X.AnonymousClass7Kx.A0B(r2, r1)
            return r3
        L_0x01e5:
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            if (r0 == 0) goto L_0x0208
            java.lang.Object r1 = r7.A01
            if (r1 == 0) goto L_0x0200
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0200
            java.lang.Object r0 = X.C18240wQ.A0b(r1)
            X.7Kx r3 = X.AnonymousClass7Kx.A0A(r0)
            return r3
        L_0x0200:
            r0 = 100
            X.88g r1 = new X.88g
            r1.<init>(r0)
            goto L_0x01e0
        L_0x0208:
            X.7Kx r3 = X.AnonymousClass7Kx.A05(r7, r2)
            return r3
        L_0x020d:
            X.6it r7 = (X.C108756it) r7
            X.6pp r1 = new X.6pp
            r1.<init>()
            java.lang.String r0 = r7.A02
            r1.A03 = r0
            java.lang.String r0 = r7.A01
            r1.A01 = r0
            java.lang.String r0 = r7.A00
            r1.A02 = r0
            r0 = 15
            r1.A00 = r0
            X.6kE r3 = r1.A00()
            return r3
        L_0x0229:
            X.7Dl r7 = (X.C120977Dl) r7
            java.lang.Object r0 = r4.A00
            X.584 r0 = (X.AnonymousClass584) r0
            X.7Ek r2 = r0.A08
            android.os.Bundle r1 = r0.A00
            java.lang.String r0 = "PAYMENT_TYPE"
            java.lang.String r0 = X.C18190wL.A0j(r1, r0)
            X.M5J r3 = r2.A03(r7, r0)
            return r3
        L_0x023e:
            X.7Dl r7 = (X.C120977Dl) r7
            java.lang.Object r2 = r4.A00
            X.58D r2 = (X.AnonymousClass58D) r2
            boolean r0 = X.AnonymousClass58D.A00(r2)
            if (r0 == 0) goto L_0x0298
            android.os.Bundle r1 = r2.A00
            if (r1 == 0) goto L_0x028b
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_FORGOT"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x028b
        L_0x0256:
            X.7Ek r9 = r2.A0A
            android.os.Bundle r1 = r2.A00
            java.lang.String r0 = "PAYMENT_TYPE"
            java.lang.String r0 = r1.getString(r0)
            r0.getClass()
            android.os.Bundle r1 = r2.A00
            java.lang.String r0 = "AUTH_FLOW_UTIL_PASSWORD_ENTERED"
            java.lang.String r11 = X.C18190wL.A0j(r1, r0)
            java.lang.String r12 = r2.A03
            r12.getClass()
            X.6ci r6 = r9.A01
            r13 = 0
            com.facebook.redex.IDxFunctionShape3S2200000_2_I2 r3 = new com.facebook.redex.IDxFunctionShape3S2200000_2_I2
            r8 = r3
            r10 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            X.76O r4 = r9.A00
            X.5kJ r2 = new X.5kJ
            r5 = r4
            r8 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.M5J r3 = r2.A03()
            X.C121157Ek.A01(r3, r4)
            return r3
        L_0x028b:
            android.os.Bundle r1 = r2.A00
            if (r1 == 0) goto L_0x0298
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_LOCKED"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x0298
            goto L_0x0256
        L_0x0298:
            boolean r4 = X.AnonymousClass58D.A00(r2)
            X.7Ek r3 = r2.A0A
            android.os.Bundle r1 = r2.A00
            java.lang.String r0 = "PAYMENT_TYPE"
            java.lang.String r2 = X.C18190wL.A0j(r1, r0)
            if (r4 == 0) goto L_0x02bb
            X.6ci r1 = r3.A01
            r0 = 9
            X.M5J r2 = X.C121157Ek.A00(r3, r1, r7, r2, r0)
            r1 = 4
            com.facebook.redex.IDxObjectShape133S0200000_2_I2 r0 = new com.facebook.redex.IDxObjectShape133S0200000_2_I2
            r0.<init>(r1, r7, r3)
            X.M5J r3 = X.C30821GXg.A01(r2, r0)
            return r3
        L_0x02bb:
            X.M5J r3 = r3.A03(r7, r2)
            return r3
        L_0x02c0:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            r0 = 38
            X.7Kx r3 = X.AnonymousClass7Kx.A07(r7, r4, r0)
            return r3
        L_0x02c9:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            r0 = 39
            X.7Kx r3 = X.AnonymousClass7Kx.A06(r7, r4, r0)
            return r3
        L_0x02d2:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            if (r0 == 0) goto L_0x02f1
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r7)
            X.6cb r0 = (X.C104926cb) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.7Kx r3 = X.AnonymousClass7Kx.A0A(r0)
            return r3
        L_0x02f1:
            boolean r0 = X.AnonymousClass7Kx.A0O(r7)
            if (r0 == 0) goto L_0x0302
            java.lang.Throwable r1 = r7.A02
            java.lang.Boolean r0 = X.C18180wK.A0X()
            X.7Kx r3 = X.AnonymousClass7Kx.A0B(r0, r1)
            return r3
        L_0x0302:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.7Kx r3 = X.AnonymousClass7Kx.A09(r0)
            return r3
        L_0x0309:
            X.6cd r7 = (X.C104946cd) r7
            java.lang.Object r0 = r4.A00
            X.57R r0 = (X.AnonymousClass57R) r0
            X.7dd r2 = r0.A06
            X.56r r3 = X.C880856r.A03()
            X.0Oe r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.6ci r0 = (X.C104996ci) r0
            X.85p r0 = r0.A00
            java.util.concurrent.Executor r1 = r0.A02
            X.82Z r0 = new X.82Z
            r0.<init>(r3, r7, r2)
            r1.execute(r0)
            return r3
        L_0x032a:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            r11 = 0
            if (r0 == 0) goto L_0x03cf
            java.lang.Object r4 = r4.A00     // Catch:{ GeneralSecurityException -> 0x03c5 }
            X.57R r4 = (X.AnonymousClass57R) r4     // Catch:{ GeneralSecurityException -> 0x03c5 }
            X.7Ek r2 = r4.A01     // Catch:{ GeneralSecurityException -> 0x03c5 }
            android.os.Bundle r1 = r4.A00     // Catch:{ GeneralSecurityException -> 0x03c5 }
            java.lang.String r0 = "PAYMENT_TYPE"
            java.lang.String r1 = X.C18190wL.A0j(r1, r0)     // Catch:{ GeneralSecurityException -> 0x03c5 }
            java.lang.Object r5 = X.AnonymousClass7Kx.A0D(r7)     // Catch:{ GeneralSecurityException -> 0x03c5 }
            X.6cc r5 = (X.C104936cc) r5     // Catch:{ GeneralSecurityException -> 0x03c5 }
            X.7HL r7 = X.AnonymousClass76O.A00()     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            android.os.Bundle r0 = r4.A00     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            r0.getClass()     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.lang.String r6 = "AUTH_METHOD_TYPE"
            java.lang.String r3 = X.C18190wL.A0j(r0, r6)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            android.os.Bundle r0 = r4.A00     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.util.List r0 = X.AnonymousClass7BO.A01(r0)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            X.7Dk r7 = r7.A05(r3, r0)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            r4.A02 = r7     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            X.7HL r3 = X.AnonymousClass76O.A00()     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            android.os.Bundle r0 = r4.A00     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.lang.String r9 = X.AnonymousClass7BO.A00(r0)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            android.os.Bundle r0 = r4.A00     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            r0.getClass()     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.lang.String r12 = X.C18190wL.A0j(r0, r6)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.lang.String r13 = X.C1198677j.A00()     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            android.content.Context r0 = r4.A03     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.lang.String r14 = r0.getPackageName()     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.lang.String r15 = r5.A00     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.lang.String r5 = r7.A07     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            android.os.Bundle r0 = r4.A00     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.util.List r17 = X.AnonymousClass7BO.A01(r0)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            r16 = r5
            com.fbpay.auth.models.PttPayload r8 = com.fbpay.auth.models.PttPayload.bySso(r12, r13, r14, r15, r16, r17)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            r6 = 1
            X.7Dk[] r0 = new X.C120967Dk[]{r7}     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.util.HashSet r15 = X.C18200wM.A0u()     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.util.Collections.addAll(r15, r0)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            android.os.Bundle r5 = r4.A00     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            if (r5 == 0) goto L_0x03b7
            java.lang.String r0 = "PAYMENT_ACCOUNT_ID"
            java.lang.String r10 = r5.getString(r0)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
        L_0x03a5:
            android.os.Bundle r0 = r4.A00     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            java.util.Map r14 = X.C121257Ff.A00(r0)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            com.facebook.redex.IDxSCallbackShape852S0100000_2_I2 r7 = new com.facebook.redex.IDxSCallbackShape852S0100000_2_I2     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            r7.<init>(r3, r6)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            r12 = r11
            r13 = r11
            X.7Dl r0 = X.C120977Dl.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x03be }
            goto L_0x03b9
        L_0x03b7:
            r10 = 0
            goto L_0x03a5
        L_0x03b9:
            X.M5J r3 = r2.A03(r0, r1)     // Catch:{ GeneralSecurityException -> 0x03c5 }
            return r3
        L_0x03be:
            r1 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ GeneralSecurityException -> 0x03c5 }
            r0.<init>(r1)     // Catch:{ GeneralSecurityException -> 0x03c5 }
            throw r0     // Catch:{ GeneralSecurityException -> 0x03c5 }
        L_0x03c5:
            r0 = move-exception
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r11, r0)
            X.56r r3 = X.C880856r.A04(r0)
            return r3
        L_0x03cf:
            X.7Kx r0 = X.AnonymousClass7Kx.A05(r7, r11)
            X.56r r3 = X.C880856r.A04(r0)
            return r3
        L_0x03d8:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            if (r0 == 0) goto L_0x0854
            java.lang.Object r3 = r4.A00
            X.5jt r3 = (X.C92805jt) r3
            java.lang.Object r1 = r7.A01
            r1.getClass()
            X.6rk r1 = (X.C113576rk) r1
            com.facebookpay.form.model.AddressFormFieldsConfig r0 = r1.A00
            r3.A00 = r0
            com.google.common.collect.ImmutableList$Builder r2 = X.C86164wN.A0Q()
            com.google.common.collect.ImmutableList r4 = r1.A01
            X.83w r7 = r4.iterator()
        L_0x03f9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x046f
            com.facebook.pando.TreeJNI r6 = X.C18210wN.A0G(r7)
            X.5jW r5 = new X.5jW
            r5.<init>()
            java.lang.String r0 = X.C86154wM.A0j(r6)
            r5.A05 = r0
            java.lang.String r0 = "care_of"
            java.lang.String r8 = r6.getStringValue(r0)
            java.lang.String r0 = "street1"
            java.lang.String r9 = r6.getStringValue(r0)
            java.lang.String r0 = "street2"
            java.lang.String r10 = r6.getStringValue(r0)
            java.lang.String r0 = "city_name"
            java.lang.String r11 = r6.getStringValue(r0)
            java.lang.String r0 = "state_name"
            java.lang.String r12 = r6.getStringValue(r0)
            java.lang.String r0 = "postal_code"
            java.lang.String r13 = r6.getStringValue(r0)
            java.lang.String r0 = "country_name"
            java.lang.String r14 = r6.getStringValue(r0)
            if (r8 == 0) goto L_0x046c
            if (r9 == 0) goto L_0x046c
            if (r11 == 0) goto L_0x046c
            if (r12 == 0) goto L_0x046c
            if (r13 == 0) goto L_0x046c
            if (r14 == 0) goto L_0x046c
            if (r10 == 0) goto L_0x0461
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0461
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13, r14}
            java.lang.String r0 = "%s, %s, %s, %s, %s, %s, %s"
        L_0x0452:
            java.lang.String r0 = X.C18180wK.A0j(r0, r1)
        L_0x0456:
            r5.A04 = r0
            r0 = 1
            r5.A07 = r0
            r0 = 36
            X.AnonymousClass5jW.A01(r6, r5, r2, r3, r0)
            goto L_0x03f9
        L_0x0461:
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13}
            java.lang.String r0 = "%s, %s, %s, %s, %s, %s"
            goto L_0x0452
        L_0x046c:
            java.lang.String r0 = ""
            goto L_0x0456
        L_0x046f:
            X.5jU r1 = new X.5jU
            r1.<init>()
            r0 = 2131835779(0x7f113b83, float:1.9304706E38)
            r1.A00 = r0
            r0 = 37
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r0 = X.C86164wN.A0L(r3, r4, r0)
            r1.A01 = r0
            r0 = 2131300438(0x7f091056, float:1.8218906E38)
            r1.A01 = r0
            X.5jb r0 = new X.5jb
            r0.<init>(r1)
            r2.add((java.lang.Object) r0)
            com.google.common.collect.ImmutableList r3 = r2.build()
            return r3
        L_0x0493:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            if (r0 == 0) goto L_0x0854
            java.lang.Object r5 = r4.A00
            X.5k0 r5 = (X.AnonymousClass5k0) r5
            java.lang.Object r6 = r7.A01
            r6.getClass()
            X.6rw r6 = (X.C113666rw) r6
            com.google.common.collect.ImmutableList$Builder r4 = X.C86164wN.A0Q()
            java.lang.String r7 = r6.A02
            X.7Ig r0 = X.AnonymousClass7Kz.A0K()
            X.752 r0 = r0.A08()
            com.instagram.service.session.UserSession r3 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36310418024628278(0x81002200010036, double:3.026192796868096E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x04ee
            X.5jV r1 = new X.5jV
            r1.<init>()
            r0 = 2131827730(0x7f111c12, float:1.928838E38)
            X.C92665jc.A00(r1, r4, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x051f
            X.5jU r1 = new X.5jU
            r1.<init>()
            r0 = 2131827727(0x7f111c0f, float:1.9288375E38)
            r1.A00 = r0
            r0 = 55
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = X.C86134wK.A0P(r5, r0)
            r1.A01 = r0
            X.5jb r0 = new X.5jb
            r0.<init>(r1)
        L_0x04eb:
            r4.add((java.lang.Object) r0)
        L_0x04ee:
            com.google.common.collect.ImmutableList r7 = r6.A00
            X.5jV r1 = new X.5jV
            r1.<init>()
            r0 = 2131826737(0x7f111831, float:1.9286367E38)
            X.C92665jc.A00(r1, r4, r0)
            X.83w r3 = r7.iterator()
        L_0x04ff:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x053d
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r3)
            X.5jW r1 = new X.5jW
            r1.<init>()
            java.lang.String r0 = "normalized_email_address"
            java.lang.String r0 = r2.getStringValue(r0)
            r1.A05 = r0
            r0 = 1
            r1.A07 = r0
            r0 = 38
            X.AnonymousClass5jW.A01(r2, r1, r4, r5, r0)
            goto L_0x04ff
        L_0x051f:
            X.5jW r2 = new X.5jW
            r2.<init>()
            r2.A05 = r7
            r0 = 1
            r2.A07 = r0
            r1 = 2
            com.facebook.redex.IDxCListenerShape15S1100000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape15S1100000_2_I2
            r0.<init>(r7, r5, r1)
            r2.A03 = r0
            X.6gY r1 = new X.6gY
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.5jd r0 = X.C92675jd.A00(r2, r1, r0)
            goto L_0x04eb
        L_0x053d:
            boolean r3 = r7.isEmpty()
            X.5jU r2 = new X.5jU
            r2.<init>()
            r0 = 2131826736(0x7f111830, float:1.9286365E38)
            r2.A00 = r0
            r1 = 0
            com.facebook.redex.IDxCListenerShape3S0110000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape3S0110000_2_I2
            r0.<init>(r5, r1, r3)
            r2.A01 = r0
            X.5jb r0 = new X.5jb
            r0.<init>(r2)
            r4.add((java.lang.Object) r0)
            com.google.common.collect.ImmutableList r6 = r6.A01
            X.5jV r1 = new X.5jV
            r1.<init>()
            r0 = 2131832474(0x7f112e9a, float:1.9298003E38)
            X.C92665jc.A00(r1, r4, r0)
            X.83w r3 = r6.iterator()
        L_0x056c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x058c
            com.facebook.pando.TreeJNI r2 = X.C18210wN.A0G(r3)
            X.5jW r1 = new X.5jW
            r1.<init>()
            java.lang.String r0 = "normalized_phone_number"
            java.lang.String r0 = r2.getStringValue(r0)
            r1.A05 = r0
            r0 = 1
            r1.A07 = r0
            r0 = 39
            X.AnonymousClass5jW.A01(r2, r1, r4, r5, r0)
            goto L_0x056c
        L_0x058c:
            boolean r3 = r6.isEmpty()
            X.5jU r2 = new X.5jU
            r2.<init>()
            r0 = 2131832468(0x7f112e94, float:1.929799E38)
            r2.A00 = r0
            r1 = 1
            com.facebook.redex.IDxCListenerShape3S0110000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape3S0110000_2_I2
            r0.<init>(r5, r1, r3)
            r2.A01 = r0
            X.5jb r0 = new X.5jb
            r0.<init>(r2)
            r4.add((java.lang.Object) r0)
            com.google.common.collect.ImmutableList r3 = r4.build()
            return r3
        L_0x05af:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            if (r0 == 0) goto L_0x0854
            java.lang.Object r5 = r4.A00
            java.lang.Object r6 = r7.A01
            r6.getClass()
            X.6rl r6 = (X.C113586rl) r6
            com.google.common.collect.ImmutableList$Builder r4 = X.C86164wN.A0Q()
            X.5jV r1 = new X.5jV
            r1.<init>()
            r0 = 2131824940(0x7f11112c, float:1.9282722E38)
            X.C92665jc.A00(r1, r4, r0)
            X.5jW r1 = new X.5jW
            r1.<init>()
            r0 = 2131835780(0x7f113b84, float:1.9304708E38)
            r1.A02 = r0
            java.lang.String r0 = r6.A00
            r1.A04 = r0
            r3 = 1
            r1.A07 = r3
            r0 = 56
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = X.C86134wK.A0P(r5, r0)
            r1.A03 = r0
            X.6gY r0 = new X.6gY
            r0.<init>()
            java.lang.Integer r2 = X.AnonymousClass006.A01
            X.5jd r0 = X.C92675jd.A00(r1, r0, r2)
            r4.add((java.lang.Object) r0)
            X.5jW r1 = new X.5jW
            r1.<init>()
            r0 = 2131832052(0x7f112cf4, float:1.9297147E38)
            r1.A02 = r0
            java.lang.String r0 = r6.A01
            r1.A04 = r0
            r0 = 57
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = X.C86134wK.A0P(r5, r0)
            r1.A03 = r0
            r1.A07 = r3
            X.6gY r0 = new X.6gY
            r0.<init>()
            X.5jd r0 = X.C92675jd.A00(r1, r0, r2)
            r4.add((java.lang.Object) r0)
            com.google.common.collect.ImmutableList r3 = r4.build()
            return r3
        L_0x061f:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            java.lang.Object r3 = r7.A01
            return r3
        L_0x0624:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            if (r0 == 0) goto L_0x0854
            java.lang.Object r4 = r4.A00
            X.5ju r4 = (X.C92815ju) r4
            java.lang.Object r8 = r7.A01
            r8.getClass()
            X.6rx r8 = (X.C113676rx) r8
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            X.5jW r1 = new X.5jW
            r1.<init>()
            r0 = 2131827297(0x7f111a61, float:1.9287503E38)
            r1.A02 = r0
            r6 = 1
            r1.A07 = r6
            r0 = 62
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = X.C86134wK.A0P(r4, r0)
            r1.A03 = r0
            X.6gY r0 = new X.6gY
            r0.<init>()
            java.lang.Integer r5 = X.AnonymousClass006.A01
            X.5jd r0 = X.C92675jd.A00(r1, r0, r5)
            r3.add(r0)
            X.5jW r1 = new X.5jW
            r1.<init>()
            r0 = 2131827298(0x7f111a62, float:1.9287505E38)
            r1.A02 = r0
            r1.A07 = r6
            r0 = 63
            X.5jd r0 = X.AnonymousClass5jW.A00(r1, r5, r4, r0)
            r3.add(r0)
            X.5jW r1 = new X.5jW
            r1.<init>()
            r0 = 2131827299(0x7f111a63, float:1.9287507E38)
            r1.A02 = r0
            r1.A07 = r6
            r0 = 64
            X.5jd r0 = X.AnonymousClass5jW.A00(r1, r5, r4, r0)
            r3.add(r0)
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x06aa
            X.5jW r2 = new X.5jW
            r2.<init>()
            boolean r1 = X.AnonymousClass7HK.A01()
            r0 = 2131827295(0x7f111a5f, float:1.9287499E38)
            if (r1 == 0) goto L_0x069d
            r0 = 2131830285(0x7f11260d, float:1.9293563E38)
        L_0x069d:
            r2.A02 = r0
            r2.A07 = r6
            r0 = 65
            X.5jd r0 = X.AnonymousClass5jW.A00(r2, r5, r4, r0)
            r3.add(r0)
        L_0x06aa:
            boolean r0 = r8.A00
            r7 = 0
            if (r0 == 0) goto L_0x06c9
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x06c9
            X.5jW r1 = new X.5jW
            r1.<init>()
            r0 = 2131827296(0x7f111a60, float:1.92875E38)
            r1.A02 = r0
            r1.A07 = r6
            r0 = 124(0x7c, float:1.74E-43)
            X.5jd r0 = X.AnonymousClass5jW.A00(r1, r5, r4, r0)
            r3.add(r7, r0)
            r7 = 1
        L_0x06c9:
            com.instagram.service.session.UserSession r2 = r4.A04
            X.0Ok r1 = X.C06810aP.A01
            com.instagram.user.model.User r0 = r1.A01(r2)
            boolean r0 = r0.Apo()
            if (r0 != 0) goto L_0x06e1
            com.instagram.user.model.User r0 = r1.A01(r2)
            boolean r0 = X.C59623Lo.A01(r0)
            if (r0 == 0) goto L_0x06f8
        L_0x06e1:
            int r2 = r7 + 1
            X.5jW r1 = new X.5jW
            r1.<init>()
            r0 = 2131822330(0x7f1106fa, float:1.9277428E38)
            r1.A02 = r0
            r1.A07 = r6
            r0 = 125(0x7d, float:1.75E-43)
            X.5jd r0 = X.AnonymousClass5jW.A00(r1, r5, r4, r0)
            r3.add(r2, r0)
        L_0x06f8:
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r3)
            return r3
        L_0x06fd:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            if (r0 == 0) goto L_0x0713
            java.lang.Object r0 = r7.A01
            r0.getClass()
            X.6rx r0 = (X.C113676rx) r0
            boolean r0 = r0.A02
        L_0x070e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0713:
            boolean r0 = X.AnonymousClass7Kx.A0O(r7)
            if (r0 == 0) goto L_0x089b
            r0 = 0
            goto L_0x070e
        L_0x071b:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            if (r0 == 0) goto L_0x0854
            java.lang.Object r6 = r4.A00
            java.lang.Object r7 = r7.A01
            r7.getClass()
            com.google.common.collect.ImmutableList r7 = (com.google.common.collect.ImmutableList) r7
            com.google.common.collect.ImmutableList$Builder r5 = X.C86164wN.A0Q()
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x076b
            X.5jQ r2 = new X.5jQ
            r2.<init>()
            r0 = 2130969502(0x7f04039e, float:1.7547688E38)
            r2.A00 = r0
            X.7Ig r0 = X.AnonymousClass7Kz.A0K()
            android.content.Context r1 = r0.A08
            r0 = 2131832054(0x7f112cf6, float:1.929715E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A02 = r0
            X.7Ig r0 = X.AnonymousClass7Kz.A0K()
            android.content.Context r1 = r0.A08
            r0 = 2131832053(0x7f112cf5, float:1.9297149E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A01 = r0
            X.5jZ r0 = new X.5jZ
            r0.<init>(r2)
            r5.add((java.lang.Object) r0)
        L_0x0766:
            com.google.common.collect.ImmutableList r3 = r5.build()
            return r3
        L_0x076b:
            X.5jV r1 = new X.5jV
            r1.<init>()
            r0 = 2131832068(0x7f112d04, float:1.929718E38)
            r1.A02 = r0
            int r0 = r7.size()
            r4 = 3
            if (r0 <= r4) goto L_0x0789
            r0 = 2131827305(0x7f111a69, float:1.9287519E38)
            r1.A00 = r0
            r0 = 67
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = X.C86134wK.A0P(r6, r0)
            r1.A03 = r0
        L_0x0789:
            X.5jc r0 = new X.5jc
            r0.<init>(r1)
            r5.add((java.lang.Object) r0)
            r3 = 0
        L_0x0792:
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x0766
            if (r3 >= r4) goto L_0x0766
            java.lang.Object r2 = r7.get(r3)
            com.fbpay.hub.orders.api.FBPayOrder r2 = (com.fbpay.hub.orders.api.FBPayOrder) r2
            r0 = 4
            X.5jS r1 = new X.5jS
            r1.<init>(r0)
            java.lang.String r0 = r2.A01
            r1.A0E = r0
            java.lang.String r0 = r2.A06
            r1.A0G = r0
            java.lang.String r0 = r2.A02
            r1.A0F = r0
            java.lang.String r0 = r2.A04
            r1.A0D = r0
            java.lang.Integer r0 = r2.A00
            r1.A0C = r0
            r0 = 40
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r0 = X.C86164wN.A0L(r6, r2, r0)
            r1.A08 = r0
            X.5jf r0 = new X.5jf
            r0.<init>()
            r1.A0B = r0
            X.AnonymousClass5je.A00(r1, r5)
            int r3 = r3 + 1
            goto L_0x0792
        L_0x07cf:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            boolean r0 = X.AnonymousClass7Kx.A0R(r7)
            r2 = 110177888(0x6912e60, float:5.461108E-35)
            if (r0 == 0) goto L_0x080c
            java.lang.Object r4 = r4.A00
            X.5jz r4 = (X.C92865jz) r4
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x07ef
            X.8h9 r3 = r4.A09
            com.fbpay.logging.FBPayLoggerData r0 = r4.A02
            java.util.Map r1 = X.C122037Js.A06(r0)
            java.lang.String r0 = "fbpay_transactions_page_api_success"
            r3.Bb8(r0, r1)
        L_0x07ef:
            java.lang.Object r1 = X.AnonymousClass7Kx.A0D(r7)
            X.78p r1 = (X.C1201178p) r1
            java.lang.String r0 = r1.A02
            r4.A03 = r0
            com.fbpay.hub.transactions.api.UpcomingPayout r0 = r1.A00
            if (r0 != 0) goto L_0x07ff
            com.fbpay.hub.transactions.api.UpcomingPayout r0 = r4.A01
        L_0x07ff:
            r4.A01 = r0
            com.google.common.collect.ImmutableList r3 = X.C92865jz.A00(r1, r4)
            com.facebook.quicklog.QuickPerformanceLogger r1 = r4.A00
            r0 = 2
            r1.markerEnd(r2, r0)
            return r3
        L_0x080c:
            boolean r0 = X.AnonymousClass7Kx.A0P(r7)
            java.lang.Object r3 = r4.A00
            X.5jz r3 = (X.C92865jz) r3
            if (r0 == 0) goto L_0x0832
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0827
            X.8h9 r2 = r3.A09
            com.fbpay.logging.FBPayLoggerData r0 = r3.A02
            java.util.Map r1 = X.C122037Js.A06(r0)
            java.lang.String r0 = "fbpay_transactions_page_api_init"
            r2.Bb8(r0, r1)
        L_0x0827:
            java.lang.Object r0 = r7.A01
            if (r0 == 0) goto L_0x0854
            X.78p r0 = (X.C1201178p) r0
            com.google.common.collect.ImmutableList r3 = X.C92865jz.A00(r0, r3)
            return r3
        L_0x0832:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r3.A00
            r0 = 3
            r1.markerEnd(r2, r0)
            java.lang.Throwable r1 = r7.A02
            r1.getClass()
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0827
            com.fbpay.logging.FBPayLoggerData r0 = r3.A02
            java.util.Map r2 = X.C122037Js.A06(r0)
            java.lang.String r0 = "throwable"
            r2.put(r0, r1)
            X.8h9 r1 = r3.A09
            java.lang.String r0 = "fbpay_transactions_page_api_fail"
            r1.Bb8(r0, r2)
            goto L_0x0827
        L_0x0854:
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()
            return r3
        L_0x0859:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            r0 = 47
            X.7Kx r3 = X.AnonymousClass7Kx.A07(r7, r4, r0)
            return r3
        L_0x0862:
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            r0 = 49
            X.7Kx r3 = X.AnonymousClass7Kx.A07(r7, r4, r0)
            return r3
        L_0x086b:
            java.lang.Object r0 = r4.A00
            X.M5p r0 = (X.C41253M5p) r0
            X.8n9 r7 = (X.C146958n9) r7
            java.lang.Object r3 = X.C41253M5p.A04(r0, r7)
            return r3
        L_0x0876:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r0 = 1669442765(0x6381accd, float:4.784163E21)
            int r4 = X.C14030oh.A03(r0)
            X.0on r2 = X.C10770iu.A00()
            r1 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r0 = "IAB BrowserLiteCallbackService fetch link history error."
            X.0oo r0 = r2.ABJ(r0, r1)
            r0.Ciu(r7)
            r0.report()
            kotlin.Unit r3 = kotlin.Unit.A00
            r0 = 812882407(0x307399e7, float:8.8621593E-10)
            X.C14030oh.A0A(r0, r4)
            return r3
        L_0x089b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObjectShape308S0100000_2_I2.invoke(java.lang.Object):java.lang.Object");
    }

    public IDxObjectShape308S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
