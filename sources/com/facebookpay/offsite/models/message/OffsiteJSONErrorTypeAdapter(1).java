package com.facebookpay.offsite.models.message;

import X.C04220Ms;
import X.C86134wK;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class OffsiteJSONErrorTypeAdapter extends TypeAdapter {
    public static final Companion Companion = new Companion();
    public static final OffsiteJSONErrorTypeAdapter$Companion$errorTypeToken$1 errorTypeToken = new OffsiteJSONErrorTypeAdapter$Companion$errorTypeToken$1();
    public final Gson gson;

    public OffsiteJSONErrorTypeAdapter(Gson gson2) {
        C04220Ms.A0B(gson2, 1);
        this.gson = gson2;
    }

    public PaymentDetailsUpdatedError read(JsonReader jsonReader) {
        C04220Ms.A0B(jsonReader, 0);
        PaymentDetailsUpdatedError paymentDetailsUpdatedError = new PaymentDetailsUpdatedError();
        jsonReader.A0S();
        while (jsonReader.A0X()) {
            String A0O = jsonReader.A0O();
            C04220Ms.A06(A0O);
            Object read = this.gson.A03(errorTypeToken).read(jsonReader);
            C04220Ms.A06(read);
            paymentDetailsUpdatedError.put(A0O, read);
        }
        jsonReader.A0U();
        return paymentDetailsUpdatedError;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public void write(JsonWriter jsonWriter, PaymentDetailsUpdatedError paymentDetailsUpdatedError) {
        throw C86134wK.A0s("Use default gson builders to create JSON strings from Kotlin objects");
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        throw C86134wK.A0s("Use default gson builders to create JSON strings from Kotlin objects");
    }
}
