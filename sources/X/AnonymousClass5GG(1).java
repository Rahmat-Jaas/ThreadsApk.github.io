package X;

import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.5GG  reason: invalid class name */
public final class AnonymousClass5GG extends C58933Ih implements C28085EyH {
    public final String Abt() {
        return A05("cursor");
    }

    public final ImmutableList Af0() {
        return A02("effects", AnonymousClass5GF.class);
    }

    public final boolean Alz() {
        return this.A00.optBoolean("has_next");
    }

    public AnonymousClass5GG(JSONObject jSONObject) {
        super(jSONObject);
    }
}
