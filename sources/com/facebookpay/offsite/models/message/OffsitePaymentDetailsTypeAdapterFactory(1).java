package com.facebookpay.offsite.models.message;

import X.AnonymousClass0wJ;
import X.C41756Mat;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

public final class OffsitePaymentDetailsTypeAdapterFactory implements C41756Mat {
    public final String fulfillmentType;

    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    public OffsitePaymentDetailsTypeAdapterFactory(String str) {
        this.fulfillmentType = str;
    }

    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        AnonymousClass0wJ.A1N(gson, typeToken);
        if (PaymentDetails.class.isAssignableFrom(typeToken.rawType)) {
            return new OffsitePaymentDetailsTypeAdapter(gson, this.fulfillmentType);
        }
        if (PaymentDetailsUpdatedError.class.isAssignableFrom(typeToken.rawType)) {
            return new OffsiteJSONErrorTypeAdapter(gson);
        }
        return null;
    }
}
