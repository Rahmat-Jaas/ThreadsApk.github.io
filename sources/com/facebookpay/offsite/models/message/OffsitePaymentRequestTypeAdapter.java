package com.facebookpay.offsite.models.message;

import X.AnonymousClass6JK;
import X.C04220Ms;
import X.C86134wK;
import X.LXD;
import X.M4h;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class OffsitePaymentRequestTypeAdapter extends TypeAdapter {
    public static final Companion Companion = new Companion();
    public static final OffsitePaymentRequestTypeAdapter$Companion$paymentConfigurationTypeToken$1 paymentConfigurationTypeToken = new OffsitePaymentRequestTypeAdapter$Companion$paymentConfigurationTypeToken$1();
    public static final OffsitePaymentRequestTypeAdapter$Companion$paymentOptionsTypeToken$1 paymentOptionsTypeToken = new OffsitePaymentRequestTypeAdapter$Companion$paymentOptionsTypeToken$1();
    public final Gson gson;
    public final TypeAdapter paymentConfigurationAdapter;
    public final TypeAdapter paymentOptionsAdapter;

    public OffsitePaymentRequestTypeAdapter(Gson gson2) {
        C04220Ms.A0B(gson2, 1);
        this.gson = gson2;
        this.paymentOptionsAdapter = gson2.A03(paymentOptionsTypeToken);
        this.paymentConfigurationAdapter = gson2.A03(paymentConfigurationTypeToken);
    }

    public PaymentRequestContent read(JsonReader jsonReader) {
        Object obj;
        C04220Ms.A0B(jsonReader, 0);
        JsonObject jsonObject = (JsonObject) this.gson.A04(new TypeToken(JsonObject.class), jsonReader);
        String str = "paymentOptions";
        JsonElement jsonElement = jsonObject.get(str);
        Object obj2 = null;
        if (jsonElement != null) {
            obj = this.paymentOptionsAdapter.fromJsonTree(jsonElement);
            C04220Ms.A06(obj);
        } else {
            obj = null;
        }
        JsonElement jsonElement2 = jsonObject.get("paymentConfiguration");
        if (jsonElement2 != null) {
            obj2 = this.paymentConfigurationAdapter.fromJsonTree(jsonElement2);
            C04220Ms.A06(obj2);
        }
        M4h m4h = new M4h();
        m4h.A07 = true;
        if (obj != null) {
            PaymentOptions paymentOptions = (PaymentOptions) obj;
            m4h.A04(new OffsitePaymentDetailsTypeAdapterFactory(paymentOptions.fulfillmentType));
            Gson A03 = m4h.A03();
            str = "paymentDetails";
            JsonElement jsonElement3 = jsonObject.get(str);
            if (jsonElement3 != null) {
                Class<PaymentDetails> cls = PaymentDetails.class;
                Object cast = AnonymousClass6JK.A00(cls).cast(A03.A04(new TypeToken(cls), new LXD(jsonElement3)));
                C04220Ms.A06(cast);
                PaymentDetails paymentDetails = (PaymentDetails) cast;
                if (obj2 != null) {
                    return new PaymentRequestContent(paymentDetails, paymentOptions, (PaymentConfiguration) obj2);
                }
                C04220Ms.A0E("paymentConfiguration");
                throw null;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public void write(JsonWriter jsonWriter, PaymentRequestContent paymentRequestContent) {
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
