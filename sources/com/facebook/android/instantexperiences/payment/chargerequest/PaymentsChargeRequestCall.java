package com.facebook.android.instantexperiences.payment.chargerequest;

import X.AnonymousClass6CE;
import X.AnonymousClass7CU;
import X.C86164wN;
import X.C972168k;
import android.os.Parcel;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import java.util.Locale;
import org.json.JSONObject;

public abstract class PaymentsChargeRequestCall extends InstantExperiencesJSBridgeCall {
    public String A00;

    public PaymentsChargeRequestCall(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public final void A02() {
        super.A02();
        if (AnonymousClass7CU.A00(String.valueOf(A00("paymentId")))) {
            throw new AnonymousClass6CE(C972168k.INVALID_PARAM, "Payment ID can not be null or empty");
        } else if (((IGInstantExperiencesParameters) this.A01).A00 == null) {
            throw new AnonymousClass6CE(C972168k.MISSING_APP_ID, String.format(Locale.US, "An App ID must be set to use this call", C86164wN.A1T()));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }

    public PaymentsChargeRequestCall(InstantExperiencesParameters instantExperiencesParameters, String str, String str2, JSONObject jSONObject) {
        super(instantExperiencesParameters, str, str2, jSONObject);
    }
}
