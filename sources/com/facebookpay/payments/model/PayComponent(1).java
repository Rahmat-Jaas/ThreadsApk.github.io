package com.facebookpay.payments.model;

import X.C18180wK;
import com.fbpay.ptt.SerializedName;

public final class PayComponent {
    @SerializedName("amount")
    public final int amount;
    @SerializedName("cred_id")
    public final String credentialId;
    @SerializedName("currency")
    public final String currency;

    public PayComponent(String str, int i, String str2) {
        C18180wK.A1P(str, 1, str2);
        this.credentialId = str;
        this.amount = i;
        this.currency = str2;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getCredentialId() {
        return this.credentialId;
    }

    public final String getCurrency() {
        return this.currency;
    }
}
