package com.facebook.android.instantexperiences.payment.chargerequest;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import org.json.JSONObject;

public class PaymentsChargeRequestUnknownCall extends PaymentsChargeRequestCall {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(85);

    public PaymentsChargeRequestUnknownCall(Parcel parcel) {
        super(parcel);
    }

    public PaymentsChargeRequestUnknownCall(InstantExperiencesParameters instantExperiencesParameters, String str, String str2, JSONObject jSONObject) {
        super(instantExperiencesParameters, str, str2, jSONObject);
        this.A00 = "unknown";
    }
}
