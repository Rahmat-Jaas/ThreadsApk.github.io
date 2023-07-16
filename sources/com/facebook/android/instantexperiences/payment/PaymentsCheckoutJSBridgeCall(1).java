package com.facebook.android.instantexperiences.payment;

import X.AnonymousClass6CE;
import X.AnonymousClass7CU;
import X.C86124wJ;
import X.C972168k;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import org.json.JSONObject;

public final class PaymentsCheckoutJSBridgeCall extends PaymentsJSBridgeCall {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(81);

    public final void A02() {
        super.A02();
        if (AnonymousClass7CU.A00(String.valueOf(A00("configuration")))) {
            throw new AnonymousClass6CE(C972168k.INVALID_PARAM, "Checkout configuration object can not be null or empty");
        }
    }

    public PaymentsCheckoutJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public PaymentsCheckoutJSBridgeCall(InstantExperiencesParameters instantExperiencesParameters, String str, String str2, JSONObject jSONObject) {
        super(instantExperiencesParameters, str, str2, jSONObject);
    }
}
