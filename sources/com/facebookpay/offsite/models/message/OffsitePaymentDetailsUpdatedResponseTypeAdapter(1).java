package com.facebookpay.offsite.models.message;

import X.AnonymousClass6JK;
import X.C04220Ms;
import X.C18190wL;
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

public final class OffsitePaymentDetailsUpdatedResponseTypeAdapter extends TypeAdapter {
    public static final Companion Companion = new Companion();
    public static final OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$errorTypeToken$1 errorTypeToken = new OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$errorTypeToken$1();
    public static final OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$messageTypeToken$1 messageTypeToken = new OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$messageTypeToken$1();
    public static final OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$msgIdTypeToken$1 msgIdTypeToken = new OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$msgIdTypeToken$1();
    public static final OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$sourceMessageIdTypeToken$1 sourceMessageIdTypeToken = new OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$sourceMessageIdTypeToken$1();
    public static final OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$timestampTypeToken$1 timestampTypeToken = new OffsitePaymentDetailsUpdatedResponseTypeAdapter$Companion$timestampTypeToken$1();
    public final Gson deserializerGson;
    public final TypeAdapter errorAdapter;
    public final String fulfillmentType;
    public final Gson gson;
    public final TypeAdapter messageTypeAdapter;
    public final TypeAdapter msgIdAdapter;
    public final TypeAdapter sourceMessageIdAdapter;
    public final TypeAdapter timestampAdapter;

    public OffsitePaymentDetailsUpdatedResponseTypeAdapter(Gson gson2, String str) {
        C04220Ms.A0B(gson2, 1);
        this.gson = gson2;
        this.fulfillmentType = str;
        this.msgIdAdapter = gson2.A03(msgIdTypeToken);
        this.timestampAdapter = gson2.A03(timestampTypeToken);
        this.sourceMessageIdAdapter = gson2.A03(sourceMessageIdTypeToken);
        this.messageTypeAdapter = gson2.A03(messageTypeToken);
        this.errorAdapter = gson2.A03(errorTypeToken);
        M4h m4h = new M4h();
        m4h.A07 = true;
        m4h.A04(new OffsitePaymentDetailsTypeAdapterFactory(str));
        this.deserializerGson = m4h.A03();
    }

    public PaymentDetailsUpdatedResponse read(JsonReader jsonReader) {
        Object obj;
        long j;
        Object obj2;
        Object obj3;
        Object obj4;
        C04220Ms.A0B(jsonReader, 0);
        JsonObject jsonObject = (JsonObject) this.gson.A04(new TypeToken(JsonObject.class), jsonReader);
        JsonElement jsonElement = jsonObject.get("id");
        Object obj5 = null;
        if (jsonElement != null) {
            obj = this.msgIdAdapter.fromJsonTree(jsonElement);
            C04220Ms.A06(obj);
        } else {
            obj = null;
        }
        JsonElement jsonElement2 = jsonObject.get("timestamp");
        if (jsonElement2 != null) {
            Object fromJsonTree = this.timestampAdapter.fromJsonTree(jsonElement2);
            C04220Ms.A06(fromJsonTree);
            j = C18190wL.A08(fromJsonTree);
        } else {
            j = 0;
        }
        JsonElement jsonElement3 = jsonObject.get("sourceMessageId");
        if (jsonElement3 != null) {
            obj2 = this.sourceMessageIdAdapter.fromJsonTree(jsonElement3);
        } else {
            obj2 = null;
        }
        JsonElement jsonElement4 = jsonObject.get("content");
        if (jsonElement4 != null) {
            Class<PaymentDetailsUpdate> cls = PaymentDetailsUpdate.class;
            obj3 = AnonymousClass6JK.A00(cls).cast(this.deserializerGson.A04(new TypeToken(cls), new LXD(jsonElement4)));
        } else {
            obj3 = null;
        }
        String str = "type";
        JsonElement jsonElement5 = jsonObject.get(str);
        if (jsonElement5 != null) {
            obj4 = this.messageTypeAdapter.fromJsonTree(jsonElement5);
            C04220Ms.A06(obj4);
        } else {
            obj4 = null;
        }
        JsonElement jsonElement6 = jsonObject.get("error");
        if (jsonElement6 != null) {
            obj5 = this.errorAdapter.fromJsonTree(jsonElement6);
        }
        if (obj == null) {
            str = "msgId";
        } else {
            String str2 = (String) obj;
            PaymentDetailsUpdate paymentDetailsUpdate = (PaymentDetailsUpdate) obj3;
            String str3 = (String) obj2;
            if (obj4 != null) {
                return new PaymentDetailsUpdatedResponse(str2, paymentDetailsUpdate, j, str3, (String) obj4, (PaymentError) obj5);
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public void write(JsonWriter jsonWriter, PaymentDetailsUpdatedResponse paymentDetailsUpdatedResponse) {
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
