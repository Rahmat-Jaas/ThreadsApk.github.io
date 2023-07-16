package com.facebook.android.instantexperiences.autofill.model;

import X.AnonymousClass89n;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class AddressAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A00 = new AnonymousClass89n();
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(70);

    public static boolean A00(String str, StringBuilder sb) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (sb.length() != 0) {
            sb.append(" ");
        }
        sb.append(str);
        return true;
    }

    public AddressAutofillData(Parcel parcel) {
        super(parcel);
    }

    public AddressAutofillData(Map map) {
        super(map);
    }

    public AddressAutofillData(JSONObject jSONObject) {
        super(jSONObject);
    }
}
