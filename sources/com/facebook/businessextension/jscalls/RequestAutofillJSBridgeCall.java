package com.facebook.businessextension.jscalls;

import X.AnonymousClass0wJ;
import X.C147198oZ;
import X.C18180wK;
import X.C37252JnL;
import X.C86114wI;
import X.C86154wM;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.redex.IDxObjectShape133S0000000_2_I2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RequestAutofillJSBridgeCall extends BusinessExtensionJSBridgeCall {
    public static final C147198oZ CREATOR = new IDxObjectShape133S0000000_2_I2(2);

    public final String A02() {
        RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData = (RequestAutofillJSBridgeCallData) C86114wI.A0f(this, "requestAutofillData");
        if (requestAutofillJSBridgeCallData == null) {
            return null;
        }
        return requestAutofillJSBridgeCallData.A00;
    }

    public final LinkedHashSet A03() {
        RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData = (RequestAutofillJSBridgeCallData) C86114wI.A0f(this, "requestAutofillData");
        if (requestAutofillJSBridgeCallData == null) {
            return null;
        }
        return requestAutofillJSBridgeCallData.A01;
    }

    public final LinkedHashSet A04() {
        RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData = (RequestAutofillJSBridgeCallData) C86114wI.A0f(this, "requestAutofillData");
        if (requestAutofillJSBridgeCallData == null) {
            return null;
        }
        return requestAutofillJSBridgeCallData.A02;
    }

    public static Bundle A00(JSONObject jSONObject) {
        String str;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        Bundle A06 = C18180wK.A06();
        A06.putString("callbackID", jSONObject.getString("callbackID"));
        try {
            str = jSONObject.getString("selectedAutoCompleteTag");
        } catch (JSONException e) {
            C37252JnL.A00("RequestAutofillJSBridgeCall", "Failed to get autofill tag", e, e);
            str = null;
        }
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.getString("autofillFields"));
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (int i = 0; i < jSONArray.length(); i = C86154wM.A07(A0v, jSONArray, i)) {
            }
            Collections.sort(A0v);
            linkedHashSet = new LinkedHashSet(A0v);
        } catch (JSONException e2) {
            C37252JnL.A00("RequestAutofillJSBridgeCall", "Failed to parseRequestedFields", e2, e2);
            linkedHashSet = null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray(jSONObject.getString("allFields"));
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (int i2 = 0; i2 < jSONArray2.length(); i2 = C86154wM.A07(A0v2, jSONArray2, i2)) {
            }
            Collections.sort(A0v2);
            linkedHashSet2 = new LinkedHashSet(A0v2);
        } catch (JSONException e3) {
            C37252JnL.A00("RequestAutofillJSBridgeCall", "Failed to parseAllFields", e3, e3);
            linkedHashSet2 = null;
        }
        A06.putParcelable("requestAutofillData", new RequestAutofillJSBridgeCallData(str, linkedHashSet, linkedHashSet2));
        return A06;
    }

    public RequestAutofillJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public RequestAutofillJSBridgeCall(Context context, Bundle bundle, String str, String str2, JSONObject jSONObject) {
        super(context, bundle, A00(jSONObject), str, "requestAutoFill", str2);
    }

    public RequestAutofillJSBridgeCall(Context context, Bundle bundle, Bundle bundle2, String str, String str2) {
        super(context, bundle, bundle2, str, "requestAutoFill", str2);
    }
}
