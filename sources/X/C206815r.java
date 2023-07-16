package X;

import org.json.JSONObject;

/* renamed from: X.15r  reason: invalid class name and case insensitive filesystem */
public final class C206815r extends C58933Ih implements C85514vJ {
    public final boolean AqA() {
        return this.A00.optBoolean("is_synced");
    }

    public final boolean BBJ() {
        return this.A00.optBoolean("should_remind");
    }

    public C206815r(JSONObject jSONObject) {
        super(jSONObject);
    }
}
