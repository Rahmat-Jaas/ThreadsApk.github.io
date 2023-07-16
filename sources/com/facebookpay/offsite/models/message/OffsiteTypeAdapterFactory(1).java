package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import X.C41756Mat;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

public final class OffsiteTypeAdapterFactory implements C41756Mat {
    public final String fulfillmentType;

    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    public OffsiteTypeAdapterFactory(String str) {
        this.fulfillmentType = str;
    }

    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        AnonymousClass0wJ.A1N(gson, typeToken);
        if (PaymentRequestContent.class.isAssignableFrom(typeToken.rawType)) {
            return new OffsitePaymentRequestTypeAdapter(gson);
        }
        if (PaymentDetailsUpdatedResponse.class.isAssignableFrom(typeToken.rawType)) {
            return new OffsitePaymentDetailsUpdatedResponseTypeAdapter(gson, this.fulfillmentType);
        }
        return null;
    }
}
