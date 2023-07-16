package com.facebook.android.instantexperiences.jscall;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6CE;
import X.AnonymousClass7CU;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C86124wJ;
import X.C972168k;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCall;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class InstantExperiencesJSBridgeCall implements Parcelable {
    public InstantExperiencesCallResult A00;
    public final InstantExperiencesParameters A01;
    public final String A02;
    public final Bundle A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final Object A00(String str) {
        Bundle bundle = this.A03;
        if (!bundle.containsKey(str)) {
            return null;
        }
        return bundle.get(str);
    }

    public final String A01() {
        if (this instanceof PaymentsChargeRequestCall) {
            return "paymentsChargeRequst";
        }
        if (this instanceof PaymentsCheckoutJSBridgeCall) {
            return "paymentsCheckout";
        }
        if (this instanceof CanShowPaymentModuleJSBridgeCall) {
            return "canShowPaymentModule";
        }
        if (this instanceof CanMakePaymentJSBridgeCall) {
            return "canMakePayment";
        }
        if (this instanceof SaveAutofillDataJSBridgeCall) {
            return "saveAutofillData";
        }
        return "requestAutoFill";
    }

    public void A02() {
        Uri A012;
        String str = this.A02;
        if (!AnonymousClass7CU.A00(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null || parse.getHost() == null || parse.getScheme() == null) {
                throw new AnonymousClass6CE(C972168k.URL_NOT_ALLOWED, (String) null);
            } else if (!parse.getScheme().equalsIgnoreCase("https") || !(parse.getPort() == 443 || parse.getPort() == -1)) {
                throw new AnonymousClass6CE(C972168k.URL_NOT_ALLOWED, (String) null);
            } else if (TextUtils.isEmpty(str) || (A012 = C15430rJ.A01(str)) == null || A012.getHost() == null || A012.getScheme() == null) {
                throw new AnonymousClass6CE(C972168k.URL_NOT_ALLOWED, "This url cannot make this call");
            }
        } else {
            throw new AnonymousClass6CE(C972168k.URL_NOT_ALLOWED, (String) null);
        }
    }

    public final void A03(InstantExperiencesCallResult instantExperiencesCallResult) {
        this.A00 = instantExperiencesCallResult;
        instantExperiencesCallResult.A00 = this.A04;
        instantExperiencesCallResult.A01 = this.A05;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeBundle(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public InstantExperiencesJSBridgeCall(Parcel parcel) {
        this.A01 = (InstantExperiencesParameters) C18180wK.A0A(parcel, InstantExperiencesParameters.class);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readBundle();
        this.A00 = (InstantExperiencesCallResult) C18180wK.A0A(parcel, InstantExperiencesCallResult.class);
    }

    public InstantExperiencesJSBridgeCall(InstantExperiencesParameters instantExperiencesParameters, String str, String str2, JSONObject jSONObject) {
        this.A05 = str;
        this.A01 = instantExperiencesParameters;
        this.A02 = str2;
        this.A04 = jSONObject.getString("callbackID");
        Bundle A06 = C18180wK.A06();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0k = C18180wK.A0k(keys);
            try {
                Object obj = jSONObject.get(A0k);
                if (obj != null) {
                    if (obj instanceof String) {
                        A06.putString(A0k, (String) obj);
                    } else if (obj instanceof Integer) {
                        A06.putInt(A0k, AnonymousClass0wJ.A04(obj));
                    } else if (obj instanceof Double) {
                        A06.putDouble(A0k, C86124wJ.A00(obj));
                    } else if (obj instanceof Long) {
                        A06.putLong(A0k, C18190wL.A08(obj));
                    } else if (obj instanceof Boolean) {
                        A06.putBoolean(A0k, AnonymousClass0wJ.A1X(obj));
                    } else if (obj instanceof JSONObject) {
                        A06.putString(A0k, obj.toString());
                    } else if (obj instanceof JSONArray) {
                        A06.putString(A0k, obj.toString());
                    } else if (obj == JSONObject.NULL) {
                        A06.putString(A0k, (String) null);
                    }
                }
            } catch (JSONException e) {
                AnonymousClass0LU.A0E("InstantExperiencesJSBridgeCall", StringFormatUtil.formatStrLocaleSafe("JSONObject.keys() provided a problematic key : %s", (Object) A0k), e);
            }
        }
        this.A03 = A06;
    }
}
