package com.facebookpay.offsite.models.message;

import X.C04220Ms;
import X.C18180wK;
import X.M4h;
import com.facebookpay.expresscheckout.models.CheckoutAvailability;
import com.google.gson.Gson;
import java.util.Map;

public final class GsonUtils {
    public static final GsonUtils INSTANCE = new GsonUtils();
    public static final Gson defaultGson = new Gson();

    public final String getMessageType(String str) {
        C04220Ms.A0B(str, 0);
        return ((BaseMessage) defaultGson.A06(str, BaseMessage.class)).messageType;
    }

    public final String getToJson(Object obj) {
        C04220Ms.A0B(obj, 0);
        if ((obj instanceof AvailabilityResponse) || (obj instanceof PaymentDetailsChangedEvent) || (obj instanceof PaymentResponse)) {
            String A08 = defaultGson.A08(obj);
            C04220Ms.A06(A08);
            return A08;
        }
        throw C18180wK.A0a("Invalid message to convert to Json");
    }

    public final CheckoutAvailability getToOffsiteAvailabilityResponse(String str) {
        C04220Ms.A0B(str, 0);
        Object A06 = deserializerGson((String) null).A06(str, CheckoutAvailability.class);
        C04220Ms.A06(A06);
        return (CheckoutAvailability) A06;
    }

    public final PaymentHandledRequest getToOffsitePaymentHandledMsg(String str) {
        C04220Ms.A0B(str, 0);
        Object A06 = deserializerGson((String) null).A06(str, PaymentHandledRequest.class);
        C04220Ms.A06(A06);
        return (PaymentHandledRequest) A06;
    }

    public final PaymentRequest getToOffsitePaymentRequest(String str) {
        C04220Ms.A0B(str, 0);
        Object A06 = deserializerGson((String) null).A06(str, PaymentRequest.class);
        C04220Ms.A06(A06);
        return (PaymentRequest) A06;
    }

    public final Map getToRedactedMap(String str) {
        C04220Ms.A0B(str, 0);
        Object A07 = defaultGson.A07(str, new GsonUtils$toRedactedMap$1().type);
        C04220Ms.A06(A07);
        return (Map) A07;
    }

    public final PaymentDetailsUpdatedResponse toOffsitePaymentUpdatedMsg(String str, String str2) {
        C04220Ms.A0B(str, 0);
        Object A06 = deserializerGson(str2).A06(str, PaymentDetailsUpdatedResponse.class);
        C04220Ms.A06(A06);
        return (PaymentDetailsUpdatedResponse) A06;
    }

    public static /* synthetic */ Gson deserializerGson$default(GsonUtils gsonUtils, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return gsonUtils.deserializerGson(str);
    }

    public final Gson deserializerGson(String str) {
        M4h m4h = new M4h();
        m4h.A07 = true;
        m4h.A04(new OffsiteTypeAdapterFactory(str));
        return m4h.A03();
    }
}
