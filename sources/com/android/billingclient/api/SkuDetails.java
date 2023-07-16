package com.android.billingclient.api;

import X.C18190wL;
import X.C18250wR;
import android.text.TextUtils;
import org.json.JSONObject;

public final class SkuDetails {
    public final JSONObject A00;
    public final String A01;

    public final String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.A01));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.A01, ((SkuDetails) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public SkuDetails(String str) {
        this.A01 = str;
        JSONObject A0j = C18250wR.A0j(str);
        this.A00 = A0j;
        if (TextUtils.isEmpty(A0j.optString("productId"))) {
            throw C18190wL.A0a("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(A0j.optString("type"))) {
            throw C18190wL.A0a("SkuType cannot be empty.");
        }
    }
}
