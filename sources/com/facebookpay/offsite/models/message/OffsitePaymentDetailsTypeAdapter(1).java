package com.facebookpay.offsite.models.message;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C86134wK;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class OffsitePaymentDetailsTypeAdapter extends TypeAdapter {
    public static final Companion Companion = new Companion();
    public static final OffsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1 addressTypeToken = new OffsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1();
    public static final OffsitePaymentDetailsTypeAdapter$Companion$fulfillmentPickupTypeToken$1 fulfillmentPickupTypeToken = new OffsitePaymentDetailsTypeAdapter$Companion$fulfillmentPickupTypeToken$1();
    public static final OffsitePaymentDetailsTypeAdapter$Companion$fulfillmentTypeToken$1 fulfillmentTypeToken = new OffsitePaymentDetailsTypeAdapter$Companion$fulfillmentTypeToken$1();
    public static final OffsitePaymentDetailsTypeAdapter$Companion$pickupInfoTypeToken$1 pickupInfoTypeToken = new OffsitePaymentDetailsTypeAdapter$Companion$pickupInfoTypeToken$1();
    public static final OffsitePaymentDetailsTypeAdapter$Companion$priceItemListTypeToken$1 priceItemListTypeToken = new OffsitePaymentDetailsTypeAdapter$Companion$priceItemListTypeToken$1();
    public static final OffsitePaymentDetailsTypeAdapter$Companion$priceItemTypeToken$1 priceItemTypeToken = new OffsitePaymentDetailsTypeAdapter$Companion$priceItemTypeToken$1();
    public static final OffsitePaymentDetailsTypeAdapter$Companion$promoCodeListTypeToken$1 promoCodeListTypeToken = new OffsitePaymentDetailsTypeAdapter$Companion$promoCodeListTypeToken$1();
    public static final OffsitePaymentDetailsTypeAdapter$Companion$shippingOptionsListTypeToken$1 shippingOptionsListTypeToken = new OffsitePaymentDetailsTypeAdapter$Companion$shippingOptionsListTypeToken$1();
    public static final OffsitePaymentDetailsTypeAdapter$Companion$summaryItemListTypeToken$1 summaryItemListTypeToken = new OffsitePaymentDetailsTypeAdapter$Companion$summaryItemListTypeToken$1();
    public final String fulfillmentType;
    public final Gson gson;
    public final TypeAdapter pickupInfoAdapter;
    public final TypeAdapter priceItemAdapter;
    public final TypeAdapter priceItemListAdapter;
    public final TypeAdapter promoCodeListAdapter;
    public final TypeAdapter redactedBillingAddressAdapter;
    public final TypeAdapter redactedShippingAddressAdapter;
    public final TypeAdapter shippingOptionsListAdapter;
    public final TypeAdapter summaryListAdapter;

    public OffsitePaymentDetailsTypeAdapter(Gson gson2, String str) {
        C04220Ms.A0B(gson2, 1);
        this.gson = gson2;
        this.fulfillmentType = str;
        this.priceItemAdapter = gson2.A03(priceItemTypeToken);
        this.priceItemListAdapter = gson2.A03(priceItemListTypeToken);
        this.summaryListAdapter = gson2.A03(summaryItemListTypeToken);
        this.shippingOptionsListAdapter = gson2.A03(shippingOptionsListTypeToken);
        this.promoCodeListAdapter = gson2.A03(promoCodeListTypeToken);
        OffsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1 offsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1 = addressTypeToken;
        this.redactedShippingAddressAdapter = gson2.A03(offsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1);
        this.redactedBillingAddressAdapter = gson2.A03(offsitePaymentDetailsTypeAdapter$Companion$addressTypeToken$1);
        this.pickupInfoAdapter = gson2.A03(pickupInfoTypeToken);
    }

    public PaymentDetails read(JsonReader jsonReader) {
        Object obj;
        String str;
        String str2;
        Object obj2;
        Object obj3;
        Object obj4;
        JsonReader jsonReader2 = jsonReader;
        C04220Ms.A0B(jsonReader2, 0);
        Object A0v = AnonymousClass0wJ.A0v();
        Object A0v2 = AnonymousClass0wJ.A0v();
        Object A0v3 = AnonymousClass0wJ.A0v();
        ArrayList A0v4 = AnonymousClass0wJ.A0v();
        JsonObject jsonObject = (JsonObject) this.gson.A04(new TypeToken(JsonObject.class), jsonReader2);
        JsonArray asJsonArray = jsonObject.getAsJsonArray("fulfillmentOptions");
        if (asJsonArray != null) {
            A0v4 = parseFulfillmentOptionsList(asJsonArray, this.fulfillmentType);
        }
        JsonElement jsonElement = jsonObject.get("total");
        Object obj5 = null;
        if (jsonElement != null) {
            obj = this.priceItemAdapter.fromJsonTree(jsonElement);
            C04220Ms.A06(obj);
        } else {
            obj = null;
        }
        JsonElement jsonElement2 = jsonObject.get("displayItems");
        if (jsonElement2 != null) {
            A0v = this.priceItemListAdapter.fromJsonTree(jsonElement2);
            C04220Ms.A06(A0v);
        }
        JsonElement jsonElement3 = jsonObject.get("summaryItems");
        if (jsonElement3 != null) {
            A0v2 = this.summaryListAdapter.fromJsonTree(jsonElement3);
            C04220Ms.A06(A0v2);
        }
        JsonElement jsonElement4 = jsonObject.get("shippingOptions");
        if (jsonElement4 != null) {
            A0v3 = this.shippingOptionsListAdapter.fromJsonTree(jsonElement4);
            C04220Ms.A06(A0v3);
        }
        JsonElement jsonElement5 = jsonObject.get("shippingOptionId");
        if (jsonElement5 != null) {
            str = jsonElement5.getAsString();
        } else {
            str = null;
        }
        JsonElement jsonElement6 = jsonObject.get("fulfillmentOptionId");
        if (jsonElement6 != null) {
            str2 = jsonElement6.getAsString();
        } else {
            str2 = null;
        }
        JsonElement jsonElement7 = jsonObject.get("shippingAddress");
        if (jsonElement7 != null) {
            obj2 = this.redactedShippingAddressAdapter.fromJsonTree(jsonElement7);
        } else {
            obj2 = null;
        }
        JsonElement jsonElement8 = jsonObject.get("billingAddress");
        if (jsonElement8 != null) {
            obj3 = this.redactedBillingAddressAdapter.fromJsonTree(jsonElement8);
        } else {
            obj3 = null;
        }
        JsonElement jsonElement9 = jsonObject.get("offers");
        if (jsonElement9 != null) {
            obj4 = this.promoCodeListAdapter.fromJsonTree(jsonElement9);
        } else {
            obj4 = null;
        }
        JsonElement jsonElement10 = jsonObject.get("pickupInfo");
        if (jsonElement10 != null) {
            obj5 = this.pickupInfoAdapter.fromJsonTree(jsonElement10);
        }
        if (obj != null) {
            return new PaymentDetails((PaymentItem) obj, (ArrayList) A0v, (ArrayList) A0v2, (ArrayList) A0v3, A0v4, str, str2, (W3CShippingAddress) obj2, (W3CShippingAddress) obj3, (List) obj4, (PaymentPickupInfo) obj5);
        }
        C04220Ms.A0E("total");
        throw null;
    }

    public final Gson getGson() {
        return this.gson;
    }

    public void write(JsonWriter jsonWriter, PaymentDetails paymentDetails) {
        throw C86134wK.A0s("Use default gson builders to create JSON strings from Kotlin objects");
    }

    private final ArrayList parseFulfillmentOptionsList(JsonArray jsonArray, String str) {
        Gson gson2;
        TypeToken typeToken;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (str != null) {
            if (str.equals("PICKUP")) {
                gson2 = this.gson;
                typeToken = fulfillmentPickupTypeToken;
            } else if (str.equals("SHIPPING")) {
                gson2 = this.gson;
                typeToken = fulfillmentTypeToken;
            } else {
                throw C18180wK.A0a(AnonymousClass00U.A0L("Invalid fulfillment type: ", str));
            }
            TypeAdapter A03 = gson2.A03(typeToken);
            Iterator it = jsonArray.iterator();
            while (it.hasNext()) {
                A0v.add(A03.fromJsonTree((JsonElement) it.next()));
            }
        }
        return A0v;
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
