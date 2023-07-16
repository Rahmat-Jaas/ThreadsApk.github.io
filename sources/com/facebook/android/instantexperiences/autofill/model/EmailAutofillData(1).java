package com.facebook.android.instantexperiences.autofill.model;

import X.AnonymousClass4W9;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class EmailAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A00 = new AnonymousClass4W9();
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(71);

    public EmailAutofillData(String str, String str2) {
        this.A00.put(str, str2);
    }

    public EmailAutofillData(Parcel parcel) {
        super(parcel);
    }

    public EmailAutofillData(Map map) {
        super(map);
    }

    public EmailAutofillData(JSONObject jSONObject) {
        super(jSONObject);
    }
}
