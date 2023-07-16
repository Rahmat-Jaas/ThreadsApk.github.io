package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.redex.IDxFunctionShape152S0200000_2_I2;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutResponse;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.fbpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape4S0500000_I2;

/* renamed from: X.7ix  reason: invalid class name and case insensitive filesystem */
public final class C128147ix implements ECPHandler {
    public C880856r A00 = C880856r.A03();
    public CheckoutResponse A01;
    public ECPPaymentResponseParams A02;
    public final C880856r A03 = C880856r.A04(AnonymousClass7Kx.A09((Object) null));
    public final C880856r A04 = C880856r.A04(AnonymousClass7Kx.A09((Object) null));
    public final C880856r A05 = C880856r.A03();
    public final C880856r A06 = C880856r.A03();
    public final C04530Oa A07 = AnonymousClass0OY.A02(C138098Ge.A00);
    public final C04530Oa A08 = AnonymousClass0OY.A02(C138108Gf.A00);
    public final AnonymousClass066 A09;
    public final C143158gC A0A = C86114wI.A0Q(this, 27);

    public C128147ix(AnonymousClass066 r3) {
        C04220Ms.A0B(r3, 1);
        this.A09 = r3;
    }

    public final /* synthetic */ void BN6(AnonymousClass7Kx r1) {
    }

    public final void BN9(C110326lV r15, LoggingContext loggingContext, Integer num) {
        Long l;
        C880856r r8;
        CheckoutResponse checkoutResponse;
        GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000;
        Integer num2 = num;
        C04220Ms.A0B(num2, 0);
        C128957ke A002 = AnonymousClass7JJ.A00();
        AnonymousClass6B5 r9 = AnonymousClass6B5.CANCEL_CHECKOUT;
        String str = r15.A01;
        AnonymousClass7DP r0 = null;
        if (str != null) {
            l = AnonymousClass0wJ.A0d(str);
        } else {
            l = null;
        }
        OtcInput otcInput = r15.A00;
        if (otcInput != null) {
            r0 = AnonymousClass7DP.A00(otcInput);
        }
        LinkedHashMap A0y = C18220wO.A0y();
        if (r0 != null) {
            AnonymousClass7Kr.A0B(r0, A0y);
        }
        LoggingContext loggingContext2 = loggingContext;
        C128957ke.A04(C18180wK.A0I(C86104wH.A0K(C128957ke.A00(A002, r9), "client_submit_ecpeventhandling_init"), 397), loggingContext2, new KtLambdaShape4S0500000_I2(5, r9, l, loggingContext2, (Object) null, A0y));
        int intValue = num2.intValue();
        if (intValue == 0 || intValue == 3) {
            AnonymousClass7Kx.A0I(this.A03, "CHECKOUT_CANCEL");
            r8 = this.A00;
            checkoutResponse = new CheckoutResponse(this.A02, (Integer) null, "CHECKOUT_CANCEL", (String) null);
            r8.A0H(checkoutResponse);
        } else {
            AnonymousClass7Kx.A0I(this.A03, "CHECKOUT_FAILED");
            CheckoutResponse checkoutResponse2 = this.A01;
            if (checkoutResponse2 != null) {
                this.A00.A0H(checkoutResponse2);
            } else {
                r8 = this.A00;
                checkoutResponse = new CheckoutResponse(this.A02, AnonymousClass006.A1C, "CHECKOUT_FAILED", "Something else went wrong");
                r8.A0H(checkoutResponse);
            }
        }
        Object value = this.A07.getValue();
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D(r15.A04, AnonymousClass7C6.A01(0, 10, 62));
        A0L.A0D(r15.A02, "product_id");
        GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
        A003.A0F("CANCEL_CHECKOUT", "request_type");
        A003.A0F(str, "order_id");
        A003.A0F(r15.A03, "receiver_id");
        A0L.A0A("handle_checkout_event_list", C18180wK.A0n(A003));
        AnonymousClass73F.A00(A0L);
        if (otcInput != null) {
            gQLCallInputCInputShape0S0000000 = C116936xr.A00(otcInput);
        } else {
            gQLCallInputCInputShape0S0000000 = null;
        }
        A0L.A0B(gQLCallInputCInputShape0S0000000, "one_time_checkout_input");
        C121277Fh.A01((AnonymousClass066) null, AnonymousClass5k8.A00(C122477Si.A00, new IDxFunctionShape152S0200000_2_I2(3, A0L, value), AnonymousClass7Kz.A0C()), new IDxObserverShape55S0300000_2_I2(10, (Object) this, (Object) loggingContext2, (Object) r15));
        AnonymousClass7Kx.A0J(this.A06, (Object) null);
        AnonymousClass7Kx.A0J(this.A05, (Object) null);
        this.A00 = C880856r.A03();
        this.A01 = null;
    }

    public final void Ch0(C111186mv r7) {
        C04220Ms.A0B(r7, 0);
        Object value = this.A07.getValue();
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        A002.A0F("UPDATE_CHECKOUT", "request_type");
        ShippingAddress shippingAddress = r7.A01;
        if (shippingAddress != null) {
            A002.A0B(C122157Kv.A00(shippingAddress), "shipping_address");
        }
        String str = r7.A04;
        if (str != null) {
            GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
            A003.A0F(str, "id");
            A002.A0B(A003, "shipping_option");
        }
        String str2 = r7.A0A;
        if (str2 != null) {
            A002.A0F(str2, "receiver_id");
        }
        String str3 = r7.A09;
        if (str3 != null) {
            A002.A0F(str3, "order_id");
        }
        if (C18190wL.A1a(r7.A05)) {
            A002.A0A("credential_ids", r7.A05);
        }
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        LoggingContext loggingContext = r7.A08;
        A0L.A0D(loggingContext.A02, AnonymousClass7C6.A00());
        A0L.A0D(String.valueOf(loggingContext.A00), "product_id");
        A0L.A0A("handle_checkout_event_list", C18180wK.A0n(A002));
        AnonymousClass73F.A00(A0L);
        C104996ci A0C = AnonymousClass7Kz.A0C();
        C121277Fh.A01((AnonymousClass066) null, AnonymousClass5k8.A00(C122477Si.A00, new IDxFunctionShape152S0200000_2_I2(3, A0L, value), A0C), C86114wI.A0Q(this, 26));
    }

    public final void Cix(CheckoutResponse checkoutResponse) {
        C04220Ms.A0B(checkoutResponse, 0);
        this.A00.A0H(checkoutResponse);
    }

    public static final void A00(C128147ix r5, Throwable th) {
        String str;
        C108836j2 r0;
        Integer num = AnonymousClass006.A1C;
        if (th instanceof C1373488f) {
            C04220Ms.A0C(th, "null cannot be cast to non-null type com.facebookpay.expresscheckout.exceptions.EcpPaymentDetailsException");
            List list = ((C1373488f) th).A00;
            if (!(list == null || (r0 = (C108836j2) AnonymousClass00J.A0D(list)) == null)) {
                num = r0.A00;
                str = r0.A02;
            }
            str = "Something else went wrong";
        } else {
            if (th instanceof C92875kA) {
                C04220Ms.A0C(th, "null cannot be cast to non-null type com.fbpay.util.exceptions.PaymentsUserFacingException");
                C1373788i r6 = (C1373788i) th;
                if (r6.A00 == 2603076) {
                    num = AnonymousClass006.A0u;
                    str = r6.A01;
                }
            }
            str = "Something else went wrong";
        }
        r5.A01 = new CheckoutResponse(r5.A02, num, "CHECKOUT_FAILED", str);
    }

    public final M5J ACm() {
        return this.A00;
    }

    public final M5J ACn() {
        return this.A03;
    }

    public final void BNA() {
        AnonymousClass7Kx.A0I(this.A03, "CHECKOUT_COMPLETE");
        this.A00.A0H(new CheckoutResponse(this.A02, (Integer) null, "CHECKOUT_COMPLETE", (String) null));
    }

    public final void BNB(boolean z) {
        C880856r r1 = this.A03;
        AnonymousClass7Kx.A0I(r1, "PAYMENT_COMPLETE");
        if (!z) {
            AnonymousClass7Kx.A0I(r1, "CHECKOUT_COMPLETE");
            this.A00.A0H(new CheckoutResponse(this.A02, (Integer) null, "CHECKOUT_COMPLETE", (String) null));
        }
        AnonymousClass7Kx.A0J(this.A06, (Object) null);
        AnonymousClass7Kx.A0J(this.A05, (Object) null);
    }

    public final M5J BNU(ECPPaymentResponseParams eCPPaymentResponseParams) {
        this.A02 = eCPPaymentResponseParams;
        Object value = this.A08.getValue();
        GQLCallInputCInputShape1S0000000 A012 = C122157Kv.A01(eCPPaymentResponseParams, (String) null);
        C104996ci A0C = AnonymousClass7Kz.A0C();
        C121277Fh.A01(this.A09, AnonymousClass5k8.A00(AnonymousClass7TR.A00, new IDxFunctionShape152S0200000_2_I2(12, A012, value), A0C), this.A0A);
        return this.A05;
    }

    public final M5J CWD() {
        return this.A04;
    }

    public final void Ciw(C1373788i r5) {
        AnonymousClass7Kx.A0K(this.A03, "CHECKOUT_NOT_AVAILABLE", r5);
        this.A01 = new CheckoutResponse(this.A02, (Integer) null, "CHECKOUT_NOT_AVAILABLE", (String) null);
    }

    public final void Cqk(AnonymousClass7Kx r2) {
        this.A06.A0H(r2);
    }

    public final M5J D7U() {
        return this.A06;
    }
}
