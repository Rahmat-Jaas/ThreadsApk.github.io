package com.instagram.business.instantexperiences;

import X.AnonymousClass00U;
import X.AnonymousClass7CU;
import X.C15430rJ;
import X.C18170wI;
import X.C18200wM;
import X.C18250wR;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class IGInstantExperiencesParameters implements InstantExperiencesParameters {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(5);
    public String A00;
    public final long A01;
    public final Uri A02;
    public final String A03;
    public final Set A04 = C18200wM.A0u();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
    }

    public IGInstantExperiencesParameters(String str, Long l) {
        this.A03 = str;
        this.A01 = l.longValue();
        JSONObject A0j = C18250wR.A0j(str);
        for (String A012 : A00("whitelisted_domains", A0j).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) {
            Uri A013 = C15430rJ.A01(A012);
            if (A013 != null && !AnonymousClass7CU.A00(A013.getHost())) {
                this.A04.add(A013.getHost());
            }
        }
        A00(C18170wI.A00(450), A0j);
        A0j.optString("app_name");
        A00("business_id", A0j);
        this.A02 = C15430rJ.A01(A00("website_uri", A0j));
    }

    public static String A00(String str, JSONObject jSONObject) {
        String string = jSONObject.getString(str);
        if (!string.equals("")) {
            return string;
        }
        throw new JSONException(AnonymousClass00U.A0L("Empty strings are not allowed for parameter key: ", str));
    }
}
