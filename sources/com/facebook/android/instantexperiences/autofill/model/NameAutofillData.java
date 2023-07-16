package com.facebook.android.instantexperiences.autofill.model;

import X.AnonymousClass4WA;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class NameAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A00 = new AnonymousClass4WA();
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(72);

    public NameAutofillData(Parcel parcel) {
        super(parcel);
    }

    public NameAutofillData(Map map) {
        super(map);
    }

    public NameAutofillData(JSONObject jSONObject) {
        super(jSONObject);
    }
}
