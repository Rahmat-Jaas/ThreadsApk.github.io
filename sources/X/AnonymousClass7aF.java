package X;

import com.facebookpay.expresscheckout.models.ECPAvailabilityResponseParams;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.facebookpay.offsite.models.message.PaymentRequest;
import java.util.Map;

/* renamed from: X.7aF  reason: invalid class name */
public final class AnonymousClass7aF implements C143158gC {
    public final /* synthetic */ C880856r A00;
    public final /* synthetic */ CheckoutHandler A01;
    public final /* synthetic */ PaymentRequest A02;
    public final /* synthetic */ C115316ur A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ AnonymousClass0MJ A06;

    public AnonymousClass7aF(C880856r r1, CheckoutHandler checkoutHandler, PaymentRequest paymentRequest, C115316ur r4, Map map, Map map2, AnonymousClass0MJ r7) {
        this.A04 = map;
        this.A01 = checkoutHandler;
        this.A03 = r4;
        this.A05 = map2;
        this.A06 = r7;
        this.A00 = r1;
        this.A02 = paymentRequest;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        boolean z;
        String str;
        AnonymousClass7Kx r7 = (AnonymousClass7Kx) obj;
        C04220Ms.A0B(r7, 0);
        Map map = this.A04;
        Object obj2 = r7.A01;
        ECPAvailabilityResponseParams eCPAvailabilityResponseParams = (ECPAvailabilityResponseParams) obj2;
        if (eCPAvailabilityResponseParams != null) {
            z = eCPAvailabilityResponseParams.A01;
        } else {
            z = false;
        }
        map.put("CACHE_AVAILABLE", Boolean.valueOf(z));
        AnonymousClass67Q r0 = r7.A00;
        if (r0 != null) {
            int ordinal = r0.ordinal();
            if (ordinal == 2) {
                return;
            }
            if (ordinal == 0) {
                CheckoutHandler checkoutHandler = this.A01;
                AnonymousClass7AE A022 = CheckoutHandler.A02(checkoutHandler);
                if (obj2 != null) {
                    A022.A05 = Boolean.valueOf(eCPAvailabilityResponseParams.A02);
                    checkoutHandler.A01 = eCPAvailabilityResponseParams.A00;
                    CheckoutHandler.A08(checkoutHandler, this.A03, this.A05);
                    this.A06.A00 = AnonymousClass68R.CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS;
                    checkoutHandler.A0I = true;
                    str = MessageAvailabilityResponseId$Companion.AVAILABLE;
                    CheckoutHandler checkoutHandler2 = this.A01;
                    C880856r r2 = this.A00;
                    PaymentRequest paymentRequest = this.A02;
                    AnonymousClass0MJ r1 = this.A06;
                    CheckoutHandler.A04(r2, checkoutHandler2, str, paymentRequest.msgId);
                    checkoutHandler2.A0I((AnonymousClass68R) r1.A00, map);
                }
                throw C18180wK.A0a("Required value was null.");
            }
        }
        this.A05.put("ERROR_CODE", "UNKNOWN");
        str = MessageAvailabilityResponseId$Companion.NOT_AVAILABLE;
        CheckoutHandler checkoutHandler22 = this.A01;
        C880856r r22 = this.A00;
        PaymentRequest paymentRequest2 = this.A02;
        AnonymousClass0MJ r12 = this.A06;
        CheckoutHandler.A04(r22, checkoutHandler22, str, paymentRequest2.msgId);
        checkoutHandler22.A0I((AnonymousClass68R) r12.A00, map);
    }
}
