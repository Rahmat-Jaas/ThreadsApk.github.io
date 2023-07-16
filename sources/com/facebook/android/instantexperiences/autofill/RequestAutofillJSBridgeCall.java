package com.facebook.android.instantexperiences.autofill;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6CE;
import X.AnonymousClass7CU;
import X.C86124wJ;
import X.C86154wM;
import X.C972168k;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RequestAutofillJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(68);
    public volatile LinkedHashSet A00 = null;

    public final Set A04() {
        if (this.A00 == null) {
            String str = (String) A00("autofillFields");
            ArrayList A0v = AnonymousClass0wJ.A0v();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i = C86154wM.A07(A0v, jSONArray, i)) {
                }
            } catch (JSONException e) {
                AnonymousClass0LU.A0E("RequestAutofillJSBridgeCall", StringFormatUtil.formatStrLocaleSafe("Failed to getRequestedFields."), e);
            }
            Collections.sort(A0v);
            this.A00 = new LinkedHashSet(A0v);
        }
        return this.A00;
    }

    public RequestAutofillJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public final void A02() {
        super.A02();
        if (AnonymousClass7CU.A00(String.valueOf(A00("selectedAutoCompleteTag")))) {
            throw new AnonymousClass6CE(C972168k.INVALID_PARAM, "Selected auto fill tag cannot be empty or null");
        } else if (AnonymousClass7CU.A00(String.valueOf(A00("autofillFields")))) {
            throw new AnonymousClass6CE(C972168k.INVALID_PARAM, "Autofill fields cannot be empty or null");
        }
    }

    public RequestAutofillJSBridgeCall(InstantExperiencesParameters instantExperiencesParameters, String str, String str2, JSONObject jSONObject) {
        super(instantExperiencesParameters, str, str2, jSONObject);
    }
}
