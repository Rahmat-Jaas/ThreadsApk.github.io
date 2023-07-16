package X;

import org.json.JSONObject;

/* renamed from: X.5GX  reason: invalid class name */
public final class AnonymousClass5GX extends C58933Ih implements C85734vg {
    public final int AZ4() {
        return this.A00.optInt("connect_consecutive_neg_interaction");
    }

    public final C148518rD AZ5() {
        return (C148518rD) A00(AnonymousClass5GW.class, "connect_payload");
    }

    public final int AZ8() {
        return this.A00.optInt("consecutive_neg_interaction");
    }

    public final boolean Ale() {
        return this.A00.optBoolean("has_contact_autofill_setting");
    }

    public final boolean Apk() {
        return this.A00.optBoolean("is_autofill_consent_accepted");
    }

    public final boolean App() {
        return this.A00.optBoolean("is_contact_autofill_fbpay_disclosure_shown");
    }

    public final boolean Aq3() {
        return this.A00.optBoolean("is_payment_autofill_opt_in");
    }

    public final int B0M() {
        return this.A00.optInt("payment_autofill_consecutive_neg_interaction");
    }

    public AnonymousClass5GX(JSONObject jSONObject) {
        super(jSONObject);
    }
}
