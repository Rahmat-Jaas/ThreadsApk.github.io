package com.facebook.android.instantexperiences.payment;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import org.json.JSONObject;

public class CanMakePaymentJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(77);

    public CanMakePaymentJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public CanMakePaymentJSBridgeCall(InstantExperiencesParameters instantExperiencesParameters, String str, String str2, JSONObject jSONObject) {
        super(instantExperiencesParameters, str, str2, jSONObject);
    }
}
