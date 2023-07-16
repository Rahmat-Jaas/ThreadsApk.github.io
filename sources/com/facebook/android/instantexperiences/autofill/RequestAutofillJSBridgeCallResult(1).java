package com.facebook.android.instantexperiences.autofill;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;

public class RequestAutofillJSBridgeCallResult extends InstantExperiencesCallResult {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(69);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RequestAutofillJSBridgeCallResult(java.util.List r7) {
        /*
            r6 = this;
            org.json.JSONObject r5 = X.C18230wP.A0y()
            java.util.Iterator r4 = r7.iterator()
        L_0x0008:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r4.next()
            com.facebook.android.instantexperiences.autofill.model.FbAutofillData r0 = (com.facebook.android.instantexperiences.autofill.model.FbAutofillData) r0
            java.util.Map r0 = r0.ASM()
            java.util.Iterator r3 = X.AnonymousClass0wJ.A0z(r0)
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0008
            java.util.Map$Entry r0 = X.C18180wK.A0o(r3)
            java.lang.String r1 = X.C18200wM.A0p(r0)     // Catch:{ JSONException -> 0x0032 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ JSONException -> 0x0032 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0032 }
            goto L_0x001c
        L_0x0032:
            r2 = move-exception
            java.lang.String r1 = "RequestAutofillJSBridgeCallResult"
            java.lang.String r0 = "Autocomplete data can't be added to JSONObject "
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0)
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            goto L_0x001c
        L_0x003f:
            java.lang.String r0 = r5.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r6.<init>((java.util.List) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult.<init>(java.util.List):void");
    }

    public RequestAutofillJSBridgeCallResult(Parcel parcel) {
        super(parcel);
    }
}
