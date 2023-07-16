package com.facebook.android.instantexperiences.payment;

import X.AnonymousClass6CE;
import X.C86164wN;
import X.C972168k;
import android.os.Parcel;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import java.util.Locale;
import org.json.JSONObject;

public abstract class PaymentsJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public void A02() {
        super.A02();
        if (((IGInstantExperiencesParameters) this.A01).A00 == null) {
            throw new AnonymousClass6CE(C972168k.MISSING_APP_ID, String.format(Locale.US, "An App ID must be set to use this call", C86164wN.A1T()));
        }
    }

    public PaymentsJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public PaymentsJSBridgeCall(InstantExperiencesParameters instantExperiencesParameters, String str, String str2, JSONObject jSONObject) {
        super(instantExperiencesParameters, str, str2, jSONObject);
    }
}
