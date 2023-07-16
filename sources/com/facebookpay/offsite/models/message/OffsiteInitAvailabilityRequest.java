package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.C18250wR;
import java.util.List;

public final class OffsiteInitAvailabilityRequest {
    public static final OffsiteInitAvailabilityRequest INSTANCE = new OffsiteInitAvailabilityRequest();

    public static /* synthetic */ PaymentRequest buildInitAvailabilityRequest$default(OffsiteInitAvailabilityRequest offsiteInitAvailabilityRequest, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return offsiteInitAvailabilityRequest.buildInitAvailabilityRequest(str, str2);
    }

    public final PaymentRequest buildInitAvailabilityRequest(String str, String str2) {
        return new PaymentRequest("", new PaymentRequestContent(new PaymentDetails((PaymentItem) null, AnonymousClass0wJ.A0v(), AnonymousClass0wJ.A0v(), AnonymousClass0wJ.A0v(), AnonymousClass0wJ.A0v(), (String) null, (String) null, (W3CShippingAddress) null, (W3CShippingAddress) null, (List) null, (PaymentPickupInfo) null), new PaymentOptions(true, true, true, true, true, (String) null, (String) null, (String) null, true, false, (String) null, (Boolean) null, (Boolean) null, (Boolean) null), new PaymentConfiguration("", "UNKNOWN", "UNKNOWN", AnonymousClass4WJ.A0A(), (PaymentMode) null, (String) null, (String) null, "", "", C18250wR.A0c(PaymentUXFlags.META_CHECKOUT), (SessionUsageType) null, (String) null, (String) null)), System.currentTimeMillis(), (String) null, MessageType$Companion.AVAILABLE_INIT_REQUEST, (PaymentError) null);
    }
}
