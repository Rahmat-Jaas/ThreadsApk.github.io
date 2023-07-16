package X;

import org.json.JSONObject;

/* renamed from: X.154  reason: invalid class name */
public final class AnonymousClass154 extends C58933Ih implements C85664vZ {
    public final boolean Apl() {
        return this.A00.optBoolean("is_basic_ads_opted_in");
    }

    public final boolean Apm() {
        return this.A00.optBoolean("is_basic_ads_youth");
    }

    public final C35334Ist BGj() {
        return (C35334Ist) A04("tier", C35334Ist.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final boolean BO5() {
        return !this.A00.isNull("is_basic_ads_opted_in");
    }

    public final boolean BO6() {
        return !this.A00.isNull("is_basic_ads_youth");
    }

    public AnonymousClass154(JSONObject jSONObject) {
        super(jSONObject);
    }
}
