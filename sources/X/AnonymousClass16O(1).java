package X;

import org.json.JSONObject;

/* renamed from: X.16O  reason: invalid class name */
public final class AnonymousClass16O extends C58933Ih implements C85744vh {
    public final boolean AZ9() {
        return this.A00.optBoolean("consent_required");
    }

    public final boolean Aii() {
        return this.A00.optBoolean("first_party_tracking_opt_in");
    }

    public final boolean Ald() {
        return this.A00.optBoolean("has_consent_choices");
    }

    public final boolean BBz() {
        return this.A00.optBoolean("show_settings");
    }

    public final boolean BGJ() {
        return this.A00.optBoolean("third_party_tracking_opt_in");
    }

    public final boolean BNq() {
        return !this.A00.isNull("consent_required");
    }

    public final boolean BNz() {
        return !this.A00.isNull("first_party_tracking_opt_in");
    }

    public final boolean BO3() {
        return !this.A00.isNull("has_consent_choices");
    }

    public final boolean BOc() {
        return !this.A00.isNull("show_settings");
    }

    public final boolean BOi() {
        return !this.A00.isNull("third_party_tracking_opt_in");
    }

    public AnonymousClass16O(JSONObject jSONObject) {
        super(jSONObject);
    }
}
