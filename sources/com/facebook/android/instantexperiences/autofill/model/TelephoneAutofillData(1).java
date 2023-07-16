package com.facebook.android.instantexperiences.autofill.model;

import X.AnonymousClass89o;
import X.C18220wO;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class TelephoneAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A01 = new AnonymousClass89o();
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(73);
    public final String A00;

    public TelephoneAutofillData(String str, Map map) {
        this.A00 = map;
        this.A00 = str;
    }

    public final JSONObject A03() {
        JSONObject A03 = super.A03();
        A03.put("display_number", this.A00);
        return A03;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }

    public TelephoneAutofillData(JSONObject jSONObject) {
        super(jSONObject);
        String str;
        if (jSONObject != null) {
            try {
                str = jSONObject.getString("display_number");
            } catch (JSONException unused) {
                str = C18220wO.A0r("tel", this.A00);
            }
        } else {
            str = null;
        }
        this.A00 = str;
    }

    public TelephoneAutofillData(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }
}
