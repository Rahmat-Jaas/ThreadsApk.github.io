package com.facebook.android.instantexperiences.payment.chargerequest;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import org.json.JSONObject;

public class PaymentsChargeRequestErrorCall extends PaymentsChargeRequestCall {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(83);

    public PaymentsChargeRequestErrorCall(Parcel parcel) {
        super(parcel);
    }

    public PaymentsChargeRequestErrorCall(InstantExperiencesParameters instantExperiencesParameters, String str, String str2, JSONObject jSONObject) {
        super(instantExperiencesParameters, str, str2, jSONObject);
        this.A00 = "error";
    }
}
