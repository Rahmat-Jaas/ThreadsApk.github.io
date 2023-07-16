package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.facebook.redex.IDxObserverShape8S1300000_2_I2;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingContext;
import com.fbpay.util.boundresources.IDxBResourceShape0S1210000_2_I2;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape6S1000000_I2;

/* renamed from: X.7j3  reason: invalid class name and case insensitive filesystem */
public final class C128157j3 implements C145308kH {
    public final AnonymousClass7IT A00 = new AnonymousClass7IT();
    public final C111796oQ A01 = new C111796oQ();
    public final C111806oR A02 = new C111806oR();

    public static final synchronized void A02(C880756q r2, C128157j3 r3, String str, List list) {
        synchronized (r3) {
            AnonymousClass7Kx.A0I(r2, new C108866j5(((C108866j5) AnonymousClass7Kx.A0D(C86104wH.A0R(r2))).A00, str, list));
        }
    }

    public final synchronized void A04(AnonymousClass79R r4) {
        C880756q A002 = AnonymousClass7IT.A00(this.A00, r4);
        C04220Ms.A0C(A002, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
        A002.A0H(AnonymousClass7Kx.A03(AnonymousClass7TX.A00, C86104wH.A0R(A002)));
    }

    private final M5J A00(GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000, OtcInput otcInput, LoggingContext loggingContext, String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7 = str4;
        AnonymousClass7DP r11 = null;
        if (C04220Ms.A0I(str7, "CREATE")) {
            str6 = "pux_checkout";
        } else {
            str6 = null;
        }
        AnonymousClass7Kr r10 = AnonymousClass6XO.A00;
        C89345Dg r2 = new C89345Dg();
        r2.A04(AnonymousClass6BL.A00(AnonymousClass6BE.SHIPPING_ADDRESS, r2, str7), "mutation_type");
        List A0n = C18180wK.A0n(r2);
        OtcInput otcInput2 = otcInput;
        if (otcInput != null) {
            r11 = AnonymousClass7DP.A00(otcInput2);
        }
        LoggingContext loggingContext2 = loggingContext;
        r10.A0H(r11, loggingContext2, str7, str6, A0n, false);
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        A002.A0F(str7, "mutation_type");
        A002.A0F(str5, "shipping_address_id");
        A002.A0D("skip_validation", C18180wK.A0Y());
        GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S00000002 = gQLCallInputCInputShape0S0000000;
        if (gQLCallInputCInputShape0S0000000 != null) {
            A002.A0B(gQLCallInputCInputShape0S00000002, "save_shipping_address_input");
        }
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D(str, AnonymousClass7C6.A00());
        String str8 = str2;
        C86144wL.A1I(A0L, str8, str3);
        A0L.A0B(A002, "shipping_address_input");
        A0L.A0D("", "platform_trust_token");
        C116936xr.A01(A0L, otcInput2);
        M5J A03 = new AnonymousClass5k6(A0L, otcInput2, this, loggingContext2, AnonymousClass7Kz.A0C(), str7, str6, str8).A03();
        C04220Ms.A0C(A03, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<*>>");
        return A03;
    }

    public final void A03(AnonymousClass79R r3) {
        AnonymousClass7IT.A03(this.A00, r3.A00, r3);
    }

    public final M5J AHY(SparseArray sparseArray, OtcInput otcInput, OtcInput otcInput2, LoggingContext loggingContext, String str, String str2, String str3, int i) {
        Object obj = sparseArray.get(12);
        if (obj != null) {
            String str4 = (String) obj;
            String str5 = str2;
            M5J A002 = A00((GQLCallInputCInputShape0S0000000) null, otcInput, loggingContext, str, str5, str3, "DELETE", str4);
            M5J A012 = C30821GXg.A01(A002, new KtLambdaShape6S1000000_I2(str4, 11));
            C880756q A003 = AnonymousClass7IT.A00(this.A00, new AnonymousClass79R(otcInput2, str5));
            C04220Ms.A0C(A003, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
            A003.A0K(A012, new IDxObserverShape8S1300000_2_I2(A003, this, A012, str4, 1));
            return A002;
        }
        throw AnonymousClass0wJ.A0b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.M5J Ch5(android.util.SparseArray r14, com.facebookpay.otc.models.OtcInput r15, com.facebookpay.otc.models.OtcInput r16, com.fbpay.logging.LoggingContext r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            r13 = this;
            r7 = r18
            r8 = r19
            X.AnonymousClass0wJ.A1O(r7, r8)
            r0 = 3
            r6 = r17
            r9 = r20
            X.C18190wL.A1S(r9, r0, r6)
            java.lang.Object r1 = r14.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            r11 = 0
            if (r0 == 0) goto L_0x0077
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0077
            boolean r0 = r1.booleanValue()
        L_0x0020:
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r4 = X.C99096Ic.A00(r14, r0)
            r2 = 12
            java.lang.Object r1 = r14.get(r2)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0031
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
        L_0x0031:
            X.0MJ r12 = X.C86144wL.A17()
            java.lang.String r10 = "CREATE"
            r12.A00 = r10
            if (r11 == 0) goto L_0x0045
            int r0 = r11.length()
            if (r0 == 0) goto L_0x0045
            java.lang.String r10 = "UPDATE"
            r12.A00 = r10
        L_0x0045:
            r3 = r13
            r5 = r15
            X.M5J r1 = r3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.jvm.internal.KtLambdaShape6S1000000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape6S1000000_I2
            r0.<init>(r11, r2)
            X.M5J r7 = X.C30821GXg.A01(r1, r0)
            X.79R r9 = new X.79R
            r0 = r16
            r9.<init>(r0, r8)
            X.7IT r0 = r13.A00
            X.56q r8 = X.AnonymousClass7IT.A00(r0, r9)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>"
            X.C04220Ms.A0C(r8, r0)
            X.7aC r6 = new X.7aC
            r10 = r15
            r11 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8.A0K(r7, r6)
            X.8NB r0 = X.AnonymousClass8NB.A00
            X.M5J r0 = X.C30821GXg.A01(r1, r0)
            return r0
        L_0x0077:
            r0 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128157j3.Ch5(android.util.SparseArray, com.facebookpay.otc.models.OtcInput, com.facebookpay.otc.models.OtcInput, com.fbpay.logging.LoggingContext, java.lang.String, java.lang.String, java.lang.String, int):X.M5J");
    }

    public static final M5J A01(C121207Et r13, C128157j3 r14, LoggingContext loggingContext, String str, boolean z) {
        AnonymousClass7DP r0;
        C128957ke A002 = AnonymousClass7JJ.A00();
        List A0n = C18180wK.A0n(AnonymousClass69P.SHIPPING_ADDRESS);
        C121207Et r5 = r13;
        String str2 = r13.A08;
        boolean A0I = C04220Ms.A0I(str2, "PRE_WARM");
        OtcInput otcInput = r5.A03;
        if (otcInput != null) {
            r0 = AnonymousClass7DP.A00(otcInput);
        } else {
            r0 = null;
        }
        LinkedHashMap A0y = C18220wO.A0y();
        if (r0 != null) {
            AnonymousClass7Kr.A0B(r0, A0y);
        }
        A002.A0G(loggingContext, str2, A0n, A0y, A0I);
        r14.A04(AnonymousClass6IY.A00(r5));
        M5J A03 = new IDxBResourceShape0S1210000_2_I2(C121207Et.A01(r5, PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS), r14, r5, str, 1, z).A03();
        C880756q A003 = AnonymousClass7IT.A00(r14.A00, AnonymousClass6IY.A00(r5));
        C04220Ms.A0C(A003, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>");
        C04220Ms.A06(A03);
        C121277Fh.A02(A03, A003, new IDxObserverShape55S0300000_2_I2(A003, r5, loggingContext, 17));
        return A003;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (((com.facebookpay.shippingaddress.model.ShippingAddress) r3.get(r6 ? 1 : 0)).A0C != false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass79R r8, X.AnonymousClass7Kx r9, java.lang.String r10, boolean r11) {
        /*
            r7 = this;
            boolean r6 = X.C18210wN.A1V(r10)
            X.7IT r0 = r7.A00
            X.56q r4 = X.AnonymousClass7IT.A00(r0, r8)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.shippingaddress.model.FBPayShippingAddressComponent>>"
            X.C04220Ms.A0C(r4, r0)
            boolean r0 = X.AnonymousClass7Kx.A0R(r9)
            if (r0 == 0) goto L_0x0076
            java.lang.Object r2 = X.AnonymousClass7Kx.A0D(r9)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressResponseImpl$Error> r0 = com.facebook.graphql.impls.ShippingAddressResponseImpl.Error.class
            com.facebook.pando.TreeJNI r0 = X.C86154wM.A0M(r2, r0)
            if (r0 != 0) goto L_0x0076
            X.7Kx r0 = X.C86104wH.A0R(r4)
            boolean r0 = X.AnonymousClass7Kx.A0R(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressResponseImpl$ShippingAddress> r1 = com.facebook.graphql.impls.ShippingAddressResponseImpl.ShippingAddress.class
            java.lang.String r0 = "shipping_address"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r0, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0079
            java.lang.Class<com.facebook.graphql.impls.ShippingAddressesImpl> r0 = com.facebook.graphql.impls.ShippingAddressesImpl.class
            com.facebook.pando.TreeJNI r0 = r2.reinterpret(r0)
            com.facebook.graphql.impls.ShippingAddressesImpl r0 = (com.facebook.graphql.impls.ShippingAddressesImpl) r0
            if (r0 == 0) goto L_0x0079
            com.facebookpay.shippingaddress.model.ShippingAddress r5 = X.AnonymousClass7BG.A01(r0, r11)
            X.7Kx r0 = X.C86104wH.A0R(r4)
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r0)
            X.6j5 r0 = (X.C108866j5) r0
            java.util.List r3 = r0.A02
            java.lang.String r0 = "CREATE"
            boolean r0 = r10.equals(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = r5.A04
            boolean r0 = X.C18190wL.A1a(r3)
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r3.get(r6)
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = (com.facebookpay.shippingaddress.model.ShippingAddress) r0
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x0077
        L_0x006d:
            X.8XU r0 = X.AnonymousClass8XU.A00
            java.util.List r0 = X.AnonymousClass7BD.A02(r5, r3, r0, r2)
            A02(r4, r7, r1, r0)
        L_0x0076:
            return
        L_0x0077:
            r2 = 0
            goto L_0x006d
        L_0x0079:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128157j3.A05(X.79R, X.7Kx, java.lang.String, boolean):void");
    }
}
