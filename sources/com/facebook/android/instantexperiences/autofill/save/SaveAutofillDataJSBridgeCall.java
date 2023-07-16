package com.facebook.android.instantexperiences.autofill.save;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6CE;
import X.C18180wK;
import X.C18210wN;
import X.C18250wR;
import X.C86124wJ;
import X.C86164wN;
import X.C972168k;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SaveAutofillDataJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(74);

    public final HashMap A04() {
        String valueOf = String.valueOf(A00("raw_autofill_data"));
        HashMap A0y = AnonymousClass0wJ.A0y();
        try {
            JSONObject A0j = C18250wR.A0j(valueOf);
            Iterator<String> keys = A0j.keys();
            while (keys.hasNext()) {
                String A0k = C18180wK.A0k(keys);
                JSONArray jSONArray = A0j.getJSONArray(A0k);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj != null) {
                        C18210wN.A1O(obj, A0v);
                    }
                }
                A0y.put(A0k, A0v);
            }
            return A0y;
        } catch (JSONException e) {
            AnonymousClass0LU.A0E("SaveAutofillDataJSBridgeCall", StringFormatUtil.formatStrLocaleSafe("Failed to getRawAutofillData."), e);
            return A0y;
        }
    }

    public final void A02() {
        super.A02();
        if (!(A00("raw_autofill_data") instanceof String)) {
            throw new AnonymousClass6CE(C972168k.INVALID_PARAM, String.format(Locale.US, "The raw autofill data must be a string", C86164wN.A1T()));
        }
    }

    public SaveAutofillDataJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public SaveAutofillDataJSBridgeCall(InstantExperiencesParameters instantExperiencesParameters, String str, String str2, JSONObject jSONObject) {
        super(instantExperiencesParameters, str, str2, jSONObject);
    }
}
